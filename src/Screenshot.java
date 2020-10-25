import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Screenshot systme.
 * @author MGT Madness, created on 19-11-2016.
 */
public class Screenshot
{
		public static void saveScreenshotNumber()
		{
				Client.screenShotNumber++;
				try
				{
						FileOutputStream writer = new FileOutputStream(ClientConstants.SCREEN_SHOT_LOCATION);
						writer.write((new String()).getBytes());
						writer.close();

				}
				catch (IOException ex)
				{
						ex.printStackTrace();
				}

				try
				{
						BufferedWriter bw = null;
						bw = new BufferedWriter(new FileWriter(ClientConstants.SCREEN_SHOT_LOCATION, true));
						bw.write(Client.screenShotNumber + "");
						bw.newLine();
						bw.flush();
						bw.close();
				}
				catch (IOException ioe)
				{
						ioe.printStackTrace();
				}
		}

		public static void loadScreenShotNumber()
		{
				File location = new File(ClientConstants.SCREEN_SHOT_LOCATION);
				if (!location.exists())
				{
						return;
				}
				try
				{
						BufferedReader file = new BufferedReader(new FileReader(ClientConstants.SCREEN_SHOT_LOCATION));
						String line;
						while ((line = file.readLine()) != null)
						{
								if (!line.isEmpty())
								{
										Client.screenShotNumber = Integer.parseInt(line);
								}
						}
						file.close();
				}
				catch (Exception e)
				{
				}
		}
}
