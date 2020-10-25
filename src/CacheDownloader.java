import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/**
 * Cache downloading.
 * @author MGT Madness, start of updating: 12-11-2013.
 */
public class CacheDownloader
{

		private final int BUFFER = 1024;

		private double kbps;


		public CacheDownloader(Client client)
		{
				Client.instance = client;
		}

		public CacheDownloader downloadCache()
		{
				if (!ClientConfiguration.DOWNLOAD_LATEST_CACHE)
				{
						return null;
				}
				try
				{
						File location = new File(ClientConstants.getCacheRevisionLocation() + "/main_file_cache.dat");
						long size = location.length();

						File location1 = new File(ClientConstants.SPRITES_LOCATION + "sprites.dat");
						long size1 = location1.length();

						if (ClientConfiguration.DEBUG_MODE)
						{
								Utility.print("Size of revision cache: " + size);
								Utility.print("Size of sprites: " + size1);
						}
						String downloadLink = "";
						String zipName = "";
						String zipLocation = "";
						String downloadingText = "";
						int fileSize = 0;

						downloadLink = ClientConstants.getRevisionDownloadLink();
						zipName = Client.clientRevision + " cache.zip";
						zipLocation = ClientConstants.getCacheRevisionLocation() + "/" + Client.clientRevision + " cache";
						downloadingText = "Downloading step 1/2 ";
						fileSize = ClientConfiguration.getCacheDataSize();
						if (size != fileSize)
						{
								downloadFile(downloadLink, zipName, zipLocation, downloadingText);
								unZip(zipLocation, zipName);
								deleteZIP(zipLocation);
						}

						downloadLink = ClientConstants.getCacheDownloadLink;
						zipName = "cache.zip";
						zipLocation = ClientConstants.CACHE_LOCATION + "cache";
						downloadingText = "Downloading step 2/2 ";

						if (size1 != ClientConfiguration.SPRITES_SIZE)
						{
								downloadFile(downloadLink, zipName, zipLocation, downloadingText);
								unZip(zipLocation, zipName);
								deleteZIP(zipLocation);
						}
						else
						{
								return null;
						}

				}
				catch (Exception e)
				{
				}
				return null;
		}

		private void downloadFile(String address, String localFileName, String location, String text)
		{
				RSApplet.shouldClearScreen = true;
				OutputStream out = null;
				URLConnection conn;
				InputStream in = null;
				try
				{
						URL url = new URL(address);
						out = new BufferedOutputStream(new FileOutputStream(location + ".zip"));

						conn = url.openConnection();
						in = conn.getInputStream();

						byte[] data = new byte[BUFFER];

						int numRead;


						while ((numRead = in.read(data)) != -1)
						{
								out.write(data, 0, numRead);
								long max = conn.getContentLength();
								long curr = 0;
								byte[] b = new byte[1024];
								int len;
								long startup = System.currentTimeMillis();
								while ((len = in.read(b, 0, b.length)) > -1)
								{
										out.write(b, 0, len);
										curr += len;

										try
										{
												long time = (System.currentTimeMillis() - startup) / 1000;
												kbps = (curr / time) / 1024D;
										}
										catch (ArithmeticException e)
										{
										}
										setDownloadPercent(text, (int) ((curr * 100) / max));
								}
						}
						Client.instance.drawLoadingTextCacheDownloader(100, "                 Download finished, extracting files.");

				}
				catch (Exception exception)
				{
						exception.printStackTrace();
				}
				finally
				{
						try
						{
								if (in != null)
								{
										in.close();
								}
								if (out != null)
								{
										out.close();
								}
						}
						catch (IOException ioe)
						{
						}
				}
		}

		public int percent = 0;

		public void setDownloadPercent(String text, int amount)
		{
				percent = amount;

				String kbps = String.valueOf(this.kbps);

				if (kbps.contains("."))
				{
						kbps = kbps.substring(0, kbps.indexOf('.'));
				}

				Client.instance.drawLoadingTextCacheDownloader(amount, text + ", " + amount + "% complete, average: " + kbps + " kbps");
		}

		private void unZip(String zipLocation, String zipName)
		{
				zipLocation = zipLocation + ".zip";
				try
				{
						InputStream in = new BufferedInputStream(new FileInputStream(zipLocation));
						ZipInputStream zin = new ZipInputStream(in);
						ZipEntry e;
						String location = zipLocation.replace(zipName, "/");
						while ((e = zin.getNextEntry()) != null)
						{

								if (e.isDirectory())
								{
										(new File(location + e.getName())).mkdir();
								}
								else
								{
										unzip(zin, location + e.getName());
								}
						}
						in.close();

				}
				catch (Exception e)
				{
						e.printStackTrace();
				}
		}

		private void unzip(ZipInputStream zin, String s) throws IOException
		{
				FileOutputStream out = new FileOutputStream(s);
				byte[] b = new byte[BUFFER];
				int len = 0;

				while ((len = zin.read(b)) != -1)
				{
						out.write(b, 0, len);
				}
				out.close();
		}

		private void deleteZIP(String fileName)
		{
				fileName = fileName + ".zip";
				File f = new File(fileName);
				if (!f.exists())
				{
						throw new IllegalArgumentException("Delete: no such file or directory: " + fileName);
				}

				if (!f.canWrite())
				{
						throw new IllegalArgumentException("Delete: write protected: " + fileName);
				}
				if (f.isDirectory())
				{
						String[] files = f.list();
						if (files.length > 0)
						{
								throw new IllegalArgumentException("Delete: directory not empty: " + fileName);
						}
				}
				boolean success = f.delete();
				if (!success)
				{
						throw new IllegalArgumentException("Delete: deletion failed");
				}
		}
}