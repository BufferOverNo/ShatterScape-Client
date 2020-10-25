import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * Data selection feature.
 * @author MGT Madness, created on 28-01-2015.
 */
public class DataSelection
{

	public static DataSelection instance;

	public BufferedImage loadImage(String fileName)
	{

		BufferedImage buff = null;
		try
		{
			buff = ImageIO.read(getClass().getResourceAsStream(fileName));
		}
		catch (IOException e)
		{
			e.printStackTrace();
			return null;
		}
		return buff;
	}

}