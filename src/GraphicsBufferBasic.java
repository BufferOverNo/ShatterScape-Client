import java.awt.Component;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

public final class GraphicsBufferBasic extends GraphicsBuffer
{

	private Component component;

	@SuppressWarnings("rawtypes")
	final void init(Component component, int w, int h, boolean bool)
	{
		pixels = new int[w * h + 1];
		height = h;
		width = w;
		depthBuffer = new float[w * h + 1];
		DataBufferInt databufferint = new DataBufferInt(pixels, pixels.length);
		DirectColorModel directcolormodel = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster writableraster = Raster.createWritableRaster((directcolormodel.createCompatibleSampleModel(width, height)), databufferint, null);
		image = new BufferedImage(directcolormodel, writableraster, bool, new Hashtable());
		this.component = component;
		initDrawingArea();
	}

	final void drawGraphics(int y, Graphics graphics, int x)
	{
		graphics.drawImage(image, x, y, component);
	}
}