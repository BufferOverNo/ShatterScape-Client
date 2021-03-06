
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3)
// Source File Name:   signlink.java
import java.applet.Applet;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;

import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.sound.midi.Synthesizer;

public final class SignLink implements Runnable
{

		/**
		 * Create the cache directory if it does not exist.
		 */
		public static void createDirectory()
		{ /* Create the ShatterScape folder. */
			if (ClientConfiguration.DEBUG_MODE) {
				return;
			}
				File firstFolder = new File(ClientConfiguration.LOCAL_CACHE ? ClientConstants.getCacheName : System.getProperty("user.home") + "/" + ClientConstants.getCacheName);
				if (!firstFolder.exists())
				{
						firstFolder.mkdir();
				}

				/* Create the version folder. */
				File secondFolder = new File(ClientConstants.MAIN_CACHE_LOCATION);
				if (!secondFolder.exists())
				{
						secondFolder.mkdir();
				}

				File thirdFolder = new File(ClientConstants.MAIN_CACHE_LOCATION + "474_cache");
				if (!thirdFolder.exists())
				{
						thirdFolder.mkdir();
				}

				File thirdFolder1 = new File(ClientConstants.MAIN_CACHE_LOCATION + "525_cache");
				if (!thirdFolder1.exists())
				{
						thirdFolder1.mkdir();
				}

				File thirdFolder2 = new File(ClientConstants.MAIN_CACHE_LOCATION + "602_cache");
				if (!thirdFolder2.exists())
				{
						thirdFolder2.mkdir();
				}

				File folder1 = new File(ClientConstants.SHATTERSCAPE_CACHE_LOCATION + "dawntained_screenshots");
				if (!folder1.exists())
				{
						folder1.mkdir();
				}


				File cacheDownloadingSpriteFolder1 = new File(ClientConstants.MAIN_CACHE_LOCATION + "cache_" + ClientConfiguration.SPRITES_CACHE_VERSION);
				if (!cacheDownloadingSpriteFolder1.exists())
				{
						cacheDownloadingSpriteFolder1.mkdir();
				}
		}

		public static void startpriv(InetAddress inetaddress)
		{
				threadliveid = (int) (Math.random() * 99999999D);
				if (active)
				{
						try
						{
								Thread.sleep(500L);
						}
						catch (Exception _ex)
						{
						}
						active = false;
				}
				socketreq = 0;
				threadreq = null;
				dnsreq = null;
				savereq = null;
				urlreq = null;
				socketip = inetaddress;
				Thread thread = new Thread(new SignLink());
				thread.setDaemon(true);
				thread.start();
				while (!active)
						try
						{
								Thread.sleep(50L);
						}
						catch (Exception _ex)
						{
						}
		}

		public static synchronized Socket opensocket(int i) throws IOException
		{
				for (socketreq = i; socketreq != 0;)
						try
						{
								Thread.sleep(50L);
						}
						catch (Exception _ex)
						{
						}

				if (socket == null)
						throw new IOException("could not open socket");
				else
						return socket;
		}

		public static synchronized DataInputStream openurl(String s) throws IOException
		{
				for (urlreq = s; urlreq != null;)
						try
						{
								Thread.sleep(50L);
						}
						catch (Exception _ex)
						{
						}

				if (urlstream == null)
						throw new IOException("could not open: " + s);
				else
						return urlstream;
		}

		public static synchronized void dnslookup(String s)
		{
				dns = s;
				dnsreq = s;
		}

		public static synchronized void startthread(Runnable runnable, int i)
		{
				threadreqpri = i;
				threadreq = runnable;
		}

		public static void setCacheDirectory()
		{
				try
				{
						cache_dat = new RandomAccessFile(ClientConstants.getCacheRevisionLocation() + "/main_file_cache.dat", "rw");
						for (int j = 0; j < 6; j++)
						{
								cache_idx[j] = new RandomAccessFile(ClientConstants.getCacheRevisionLocation() + "/main_file_cache.idx" + j, "rw");
						}
				}
				catch (Exception exception)
				{
					System.out.println("setCacheDirectory() error.");
				}
		}

		public void run()
		{
				active = true;
				createDirectory();
				String s = ClientConstants.MAIN_CACHE_LOCATION;
				for (int i = threadliveid; threadliveid == i;)
				{
						if (socketreq != 0)
						{
								try
								{
										socket = new Socket(socketip, socketreq);
								}
								catch (Exception _ex)
								{
										socket = null;
								}
								socketreq = 0;
						}
						else if (threadreq != null)
						{
								Thread thread = new Thread(threadreq);
								thread.setDaemon(true);
								thread.start();
								thread.setPriority(threadreqpri);
								threadreq = null;
						}
						else if (dnsreq != null)
						{
								try
								{
										dns = InetAddress.getByName(dnsreq).getHostName();
								}
								catch (Exception _ex)
								{
										dns = "unknown";
								}
								dnsreq = null;
						}
						else if (savereq != null)
						{
								if (savebuf != null)
										try
										{
												FileOutputStream fileoutputstream = new FileOutputStream(s + savereq);
												fileoutputstream.write(savebuf, 0, savelen);
												fileoutputstream.close();
										}
										catch (Exception _ex)
										{
										}
								if (waveplay)
								{
								}
								if (play)
								{
								}
								savereq = null;
						}
						else if (urlreq != null)
						{
								try
								{
										urlstream = new DataInputStream((new URL(mainapp.getCodeBase(), urlreq)).openStream());
								}
								catch (Exception _ex)
								{
										urlstream = null;
								}
								urlreq = null;
						}
						try
						{
								Thread.sleep(50L);
						}
						catch (Exception _ex)
						{
						}
				}

		}

		public static Sequencer music = null;

		public static Sequence sequence = null;

		public static Synthesizer synthesizer = null;

		public static synchronized boolean wavereplay()
		{
				if (savereq != null)
				{
						return false;
				}
				else
				{
						savebuf = null;
						waveplay = true;
						savereq = "sound" + wavepos + ".wav";
						return true;
				}
		}

		public static synchronized void midisave(byte abyte0[], int i)
		{
				if (i > 0x1e8480)
						return;
				if (savereq != null)
				{
				}
				else
				{
						midipos = (midipos + 1) % 5;
						savelen = i;
						savebuf = abyte0;
						play = true;
						savereq = "jingle" + midipos + ".mid";
				}
		}

		public static synchronized boolean wavesave(byte abyte0[], int i)
		{
				if (i > 0x1e8480)
						return false;
				if (savereq != null)
				{
						return false;
				}
				else
				{
						wavepos = (wavepos + 1) % 5;
						savelen = i;
						savebuf = abyte0;
						waveplay = true;
						savereq = "sound" + wavepos + ".wav";
						return true;
				}
		}

		public static void reporterror(String s)
		{
				Utility.print("Error: " + s);
		}

		private SignLink()
		{
		}

		public static int storeid = 32;

		public static RandomAccessFile cache_dat = null;

		public static final RandomAccessFile[] cache_idx = new RandomAccessFile[6];

		public static Applet mainapp = null;

		private static boolean active;

		private static int threadliveid;

		private static InetAddress socketip;

		private static int socketreq;

		private static Socket socket = null;

		private static int threadreqpri = 1;

		private static Runnable threadreq = null;

		private static String dnsreq = null;

		public static String dns = null;

		private static String urlreq = null;

		private static DataInputStream urlstream = null;

		private static int savelen;

		private static String savereq = null;

		private static byte[] savebuf = null;

		private static boolean play;

		private static int midipos;

		public static String midi = null;

		public static int midiVolume;

		public static int midifade;

		private static boolean waveplay;

		private static int wavepos;

		public static int wavevol;

		public static boolean reporterror = true;

		public static String errorname = "";

}