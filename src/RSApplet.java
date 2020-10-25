import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.imageio.ImageIO;

public class RSApplet extends Applet implements Runnable, MouseListener, MouseMotionListener, MouseWheelListener, KeyListener, FocusListener, WindowListener
{

		private static final long serialVersionUID = 5272673907779894690L;

		final void initClientFrame(int i, int j)
		{
				myWidth = j;
				myHeight = i;
				graphics = getGameComponent().getGraphics();
				fullGameScreen = Client.constructGraphicsBuffer(myWidth, myHeight, getGameComponent());
				startRunnable(this, 1);
		}

		public void run()
		{
				getGameComponent().addMouseListener(this);
				getGameComponent().addMouseMotionListener(this);
				getGameComponent().addKeyListener(this);
				getGameComponent().addFocusListener(this);
				getGameComponent().addMouseWheelListener(this);
				if (gameFrame != null)
				{
						gameFrame.addWindowListener(this);
				}
				Load.startUp();
				int i = 0;
				int j = 256;
				int k = 1;
				int i1 = 0;
				int j1 = 0;
				for (int k1 = 0; k1 < 10; k1++)
				{
						aLongArray7[k1] = System.currentTimeMillis();
				}

				while (anInt4 >= 0)
				{
						if (anInt4 > 0)
						{
								anInt4--;
								if (anInt4 == 0)
								{
										exit();
										return;
								}
						}
						int i2 = j;
						int j2 = k;
						j = 300;
						k = 1;
						long l1 = System.currentTimeMillis();
						if (aLongArray7[i] == 0L)
						{
								j = i2;
								k = j2;
						}
						else if (l1 > aLongArray7[i])
						{
								j = (int) ((long) (2560 * delayTime) / (l1 - aLongArray7[i]));
						}
						if (j < 25)
						{
								j = 25;
						}
						if (j > 256)
						{
								j = 256;
								k = (int) ((long) delayTime - (l1 - aLongArray7[i]) / 10L);
						}
						if (k > delayTime)
						{
								k = delayTime;
						}
						aLongArray7[i] = l1;
						i = (i + 1) % 10;
						if (k > 1)
						{
								for (int k2 = 0; k2 < 10; k2++)
								{
										if (aLongArray7[k2] != 0L)
										{
												aLongArray7[k2] += k;
										}
								}

						}
						if (k < minDelay)
						{
								k = minDelay;
						}
						try
						{
								Thread.sleep(k);
						}
						catch (InterruptedException _ex)
						{
								j1++;
						}
						for (; i1 < 256; i1 += j)
						{
								setClickMode3(clickMode1);
								saveClickX = clickX;
								saveClickY = clickY;
								Client.clickPositionUpdateRequired = false;
								aLong29 = clickTime;
								clickMode1 = 0;
								processGameLoop();
								readIndex = writeIndex;
						}

						i1 &= 0xff;
						if (delayTime > 0)
						{
								fps = (1000 * j) / (delayTime * 256);
						}
						processDrawing();
						if (shouldDebug)
						{
								Utility.print("ntime:" + l1);
								for (int l2 = 0; l2 < 10; l2++)
								{
										int i3 = ((i - l2 - 1) + 20) % 10;
										Utility.print("otim" + i3 + ":" + aLongArray7[i3]);
								}
								Utility.print("fps:" + fps + " ratio:" + j + " count:" + i1);
								Utility.print("del:" + k + " deltime:" + delayTime + " mindel:" + minDelay);
								Utility.print("intex:" + j1 + " opos:" + i);
								shouldDebug = false;
								j1 = 0;
						}
				}
				if (anInt4 == -1)
				{
						exit();
				}
		}

		private void exit()
		{
				anInt4 = -2;
				cleanUpForQuit();
				if (gameFrame != null)
				{
						try
						{
								Thread.sleep(1000L);
						}
						catch (Exception _ex)
						{
						}
						try
						{
								System.exit(0);
						}
						catch (Throwable _ex)
						{
						}
				}
		}

		final void method4(int i)
		{
				delayTime = 1000 / i;
		}

		public final void start()
		{
				if (anInt4 >= 0)
						anInt4 = 0;
		}

		public final void stop()
		{
				if (anInt4 >= 0)
						anInt4 = 4000 / delayTime;
		}

		public final void destroy()
		{
				anInt4 = -1;
				try
				{
						Thread.sleep(5000L);
				}
				catch (Exception _ex)
				{
				}
				if (anInt4 == -1)
						exit();
		}

		public final void update(Graphics g)
		{
				if (graphics == null)
						graphics = g;
				shouldClearScreen = true;
				raiseWelcomeScreen();
		}

		public final void paint(Graphics g)
		{
				if (graphics == null)
						graphics = g;
				shouldClearScreen = true;
				raiseWelcomeScreen();
		}

		public boolean mouseWheelDown;

		public final void mousePressed(MouseEvent mouseevent)
		{
				int x = mouseevent.getX();
				int y = mouseevent.getY();
				if (gameFrame != null)
				{
						x -= 4; //4
						y -= 22; //22
				}
				idleTime = 0;
				clickX = x;
				clickY = y;
				clickTime = System.currentTimeMillis();
				int type = mouseevent.getButton();
				if (type == 2)
				{
						mouseWheelDown = true;
						mouseWheelX = x;
						mouseWheelY = y;
						return;
				}
				if (mouseevent.isMetaDown())
				{
						clickMode1 = 2;
						clickMode2 = 2;
				}
				else
				{
						clickMode1 = 1;
						clickMode2 = 1;
						Client.clickPositionUpdateRequired = true;
				}
		}

		public final void mouseReleased(MouseEvent mouseevent)
		{
				idleTime = 0;
				clickMode2 = 0;
				Client.hasClicked = false;
				mouseWheelDown = false;
		}

		public final void mouseClicked(MouseEvent mouseevent)
		{
		}

		public final void mouseEntered(MouseEvent mouseevent)
		{
		}

		public final void mouseExited(MouseEvent mouseevent)
		{
				idleTime = 0;
				mouseX = -1;
				mouseY = -1;
		}

		public int mouseWheelX;

		public int mouseWheelY;

		public final void mouseDragged(MouseEvent e)
		{
				int x = e.getX();
				int y = e.getY();
				if (gameFrame != null)
				{
						Insets insets = gameFrame.getInsets();
						x -= insets.left;//4
						y -= insets.top;//22
				}
				if (mouseWheelDown)
				{
						y = mouseWheelX - e.getX();
						int k = mouseWheelY - e.getY();
						mouseWheelDragged(y, -k);
						mouseWheelX = e.getX();
						mouseWheelY = e.getY();
						return;
				}
				idleTime = 0;
				mouseX = x;
				mouseY = y;
				//clickType = DRAG;
		}


		void mouseWheelDragged(int param1, int param2)
		{

		}

		public void mouseWheelMoved(MouseWheelEvent event)
		{
				int rotation = event.getWheelRotation();
				handleInterfaceScrolling(event);
				//TODO #FULLSCREEN ADJUST interfaces chat box scrolling via mouse scroll
				int yPosOffset = Client.isFixedScreen() ? 0 : Client.getClientHeight() - 541;
				if (mouseX > 0 && mouseX < 512 && mouseY > 338 + yPosOffset && mouseY < 478 + yPosOffset)
				{
						int scrollPos = Client.chatScrollAmount;
						scrollPos -= rotation * 30;
						if (scrollPos < 0)
						{
								scrollPos = 0;
						}
						if (scrollPos > Client.chatScrollHeight - 110)
						{
								scrollPos = Client.chatScrollHeight - 110;
						}
						if (Client.chatScrollAmount != scrollPos)
						{
								Client.chatScrollAmount = scrollPos;
								Client.setInputTaken(true);
						}
				}

				if (Client.getInterfaceDisplayed() <= 0)
				{
						// TODO #FULLSCREEN ADJUST, mouse scrolling zoom.
						if (Client.isFixedScreen())
						{
								if (Client.instance.mouseX > 0 && Client.instance.mouseX < 516 && Client.instance.mouseY > 0 && Client.instance.mouseY < 338)
								{

								}
								else
								{
										return;
								}
						}
						else
						{
								if (Client.instance.isNotTileClickingArea())
								{
										return;
								}
						}
						if (rotation == -1)
						{
								if (Client.CameraPos2 >= (Client.isFixedScreen() ? 150 : Client.resizableMaximumZoomIn))
								{
										Client.CameraPos2 -= 40;
										Settings.saveSettings();
								}
						}
						else
						{
								if (Client.CameraPos2 <= 1075)
								{
										Client.CameraPos2 += 40;
										Settings.saveSettings();
								}
						}
				}
		}

		public void handleInterfaceScrolling(MouseWheelEvent event)
		{
				int rotation = event.getWheelRotation();
				int positionX = 0;
				int positionY = 0;
				int width = 0;
				int height = 0;
				int offsetX = 0;
				int offsetY = 0;
				int childID = 0;
				int tabInterfaceID = Client.tabInterfaceId[Client.getTabId()];

				//TODO #FULLSCREEN ADJUST interface scrolling on inventory tab.
				int mouseX1 = Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 759);
				int mouseY1 = Client.isFixedScreen() ? 0 : (Client.getClientHeight() - 545);
				if (tabInterfaceID != -1)
				{
						RSInterface tab = RSInterface.interfaceCache[tabInterfaceID];
						offsetX = 765 - 218;
						offsetY = 503 - 298;
						for (int index = 0; index < tab.children.length; index++)
						{
								if (RSInterface.interfaceCache[tab.children[index]].scrollMax > 0)
								{
										childID = index;
										positionX = tab.childX[index];
										positionY = tab.childY[index];
										positionX += mouseX1;
										positionY += mouseY1;
										width = RSInterface.interfaceCache[tab.children[index]].width;
										height = RSInterface.interfaceCache[tab.children[index]].height;
										break;
								}
						}
						if (mouseX > offsetX + positionX && mouseY > offsetY + positionY && mouseX < offsetX + positionX + width && mouseY < offsetY + positionY + height)
						{
								RSInterface.interfaceCache[tab.children[childID]].scrollPosition += rotation * 30;
								Client.setTabAreaAltered(true);
						}
				}

				//TODO #FULLSCREEN ADJUST interface scrolling on 3d screen.
				if (Client.getInterfaceDisplayed() != -1)
				{

						int x1 = Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 256;
						int y1 = Client.isFixedScreen() ? 0 : (Client.getClientHeight() / 2) - 267;
						RSInterface rsi = RSInterface.interfaceCache[Client.getInterfaceDisplayed()];
						offsetX = 4;
						offsetY = 4;
						if (rsi == null)
						{
								return;
						}
						for (int index = 0; index < rsi.children.length; index++)
						{
								if (RSInterface.interfaceCache[rsi.children[index]].scrollMax > 0)
								{
										childID = index;
										positionX = rsi.childX[index] + x1;
										positionY = rsi.childY[index] + y1;
										width = RSInterface.interfaceCache[rsi.children[index]].width;
										height = RSInterface.interfaceCache[rsi.children[index]].height;
										break;
								}
						}
						if (mouseX > offsetX + positionX && mouseY > offsetY + positionY && mouseX < offsetX + positionX + width && mouseY < offsetY + positionY + height)
						{
								RSInterface.interfaceCache[rsi.children[childID]].scrollPosition += rotation * 30;
						}

						// Support for 2 use-able scroll bars on same interface, but the width must be both different for it to recognise a second scrollbar.
						int positionX1 = 0;
						for (int index = 0; index < rsi.children.length; index++)
						{
								if (RSInterface.interfaceCache[rsi.children[index]].scrollMax > 0 && width != RSInterface.interfaceCache[rsi.children[index]].width)
								{
										childID = index;
										positionX1 = rsi.childX[index] + x1;
										positionY = rsi.childY[index] + y1;
										width = RSInterface.interfaceCache[rsi.children[index]].width;
										height = RSInterface.interfaceCache[rsi.children[index]].height;
										break;
								}
						}
						if (mouseX > offsetX + positionX1 && mouseY > offsetY + positionY && mouseX < offsetX + positionX1 + width && mouseY < offsetY + positionY + height)
						{
								RSInterface.interfaceCache[rsi.children[childID]].scrollPosition += rotation * 30;
						}
				}
		}

		public final void mouseMoved(MouseEvent mouseevent)
		{
				int i = mouseevent.getX();
				int j = mouseevent.getY();
				if (gameFrame != null)
				{
						i -= 4;
						j -= 22;
				}
				idleTime = 0;
				mouseX = i;
				mouseY = j;
		}

		public final void keyPressed(KeyEvent keyevent)
		{
				idleTime = 0;
				int i = keyevent.getKeyCode();
				if (i == KeyEvent.VK_F12)
				{
						if (Client.instance.isUsingWebClient)
						{
								Client.instance.pushMessage("You can only use this on the Download Client.", 0, "");
								return;
						}
						takeScreenshot("");
				}
				int j = keyevent.getKeyChar();

				if (i == KeyEvent.VK_ESCAPE)
				{
						//client.setTab(3);
				}
				else if (i == KeyEvent.VK_F1)
				{
						Client.setTabId(3, false);
				}
				else if (i == KeyEvent.VK_F2)
				{
						Client.setTabId(4, false);
				}
				else if (i == KeyEvent.VK_F3)
				{
						Client.setTabId(5, false);
				}
				else if (i == KeyEvent.VK_F4)
				{
						Client.setTabId(6, false);
				}
				else if (i == KeyEvent.VK_F5)
				{
						Client.setTabId(0, false);
				}
				if (j < 30)
						j = 0;
				if (i == 37)
						j = 1;
				if (i == 39)
						j = 2;
				if (i == 38)
						j = 3;
				if (i == 40)
						j = 4;
				if (i == 17)
						j = 5;
				if (i == 8)
						j = 8;
				if (i == 127)
						j = 8;
				if (i == 9)
						j = 9;
				if (i == 10)
						j = 10;
				if (i >= 112 && i <= 123)
						j = (1008 + i) - 112;
				if (i == 36)
						j = 1000;
				if (i == 35)
						j = 1001;
				if (i == 33)
						j = 1002;
				if (i == 34)
						j = 1003;
				if (j > 0 && j < 128)
						keyArray[j] = 1;
				if (j > 4)
				{
						charQueue[writeIndex] = j;
						writeIndex = writeIndex + 1 & 0x7f;
				}
		}

		public final void keyReleased(KeyEvent keyevent)
		{
				idleTime = 0;
				int i = keyevent.getKeyCode();
				char c = keyevent.getKeyChar();
				if (c < '\036')
						c = '\0';
				if (i == 37)
						c = '\001';
				if (i == 39)
						c = '\002';
				if (i == 38)
						c = '\003';
				if (i == 40)
						c = '\004';
				if (i == 17)
						c = '\005';
				if (i == 8)
						c = '\b';
				if (i == 127)
						c = '\b';
				if (i == 9)
						c = '\t';
				if (i == 10)
						c = '\n';
				if (c > 0 && c < '\200')
						keyArray[c] = 0;
		}

		public final void keyTyped(KeyEvent keyevent)
		{
		}

		final int readChar(int dummy)
		{
				while (dummy >= 0)
				{
						for (int j = 1; j > 0; j++)
								;
				}
				int k = -1;
				if (writeIndex != readIndex)
				{
						k = charQueue[readIndex];
						readIndex = readIndex + 1 & 0x7f;
				}
				return k;
		}

		public final void focusGained(FocusEvent focusevent)
		{
				awtFocus = true;
				shouldClearScreen = true;
				raiseWelcomeScreen();
		}

		public final void focusLost(FocusEvent focusevent)
		{
				awtFocus = false;
				for (int i = 0; i < 128; i++)
						keyArray[i] = 0;

		}

		public final void windowActivated(WindowEvent windowevent)
		{
		}

		public final void windowClosed(WindowEvent windowevent)
		{
		}

		public final void windowClosing(WindowEvent windowevent)
		{
				destroy();
		}

		public final void windowDeactivated(WindowEvent windowevent)
		{
		}

		public final void windowDeiconified(WindowEvent windowevent)
		{
		}

		public final void windowIconified(WindowEvent windowevent)
		{
		}

		public final void windowOpened(WindowEvent windowevent)
		{
		}

		void startUp()
		{
		}

		void processGameLoop()
		{
		}

		void cleanUpForQuit()
		{
		}

		void processDrawing()
		{
		}

		void raiseWelcomeScreen()
		{
		}

		Component getGameComponent()
		{
				if (gameFrame != null)
						return gameFrame;
				else
						return this;
		}

		public void startRunnable(Runnable runnable, int priority)
		{
				Thread thread = new Thread(runnable);
				thread.start();
				thread.setPriority(priority);
		}

		public void drawLoadingText(int i, String s)
		{
				while (graphics == null)
				{
						graphics = getGameComponent().getGraphics();
						try
						{
								getGameComponent().repaint();
						}
						catch (Exception _ex)
						{
						}
						try
						{
								Thread.sleep(1000L);
						}
						catch (Exception _ex)
						{
						}
				}
				Font font = new Font("Arial", 1, 13);
				Font font1 = new Font("Arial", 0, 13);
				getGameComponent().getFontMetrics(font1);
				if (shouldClearScreen)
				{
						graphics.setColor(Color.black);
						graphics.fillRect(0, 0, myWidth, myHeight);
						Client.showSelectDataImages = true;
						if (Client.choseData)
						{
								shouldClearScreen = false;
						}
				}
				graphics.setColor(Color.black);
				graphics.fillRect(0, 479, 765, 53); // The black rectangle.
				Color color = new Color(228, 144, 0);
				graphics.setColor(color);
				graphics.fillRect(0, 479, i * 3, myHeight);
				graphics.setColor(Color.black);
				graphics.setFont(font);
				graphics.setColor(Color.white);
				int length = s.length() * 3;
				if (s.contains("..."))
				{
						length -= 5;
				}
				graphics.drawString(s, 374 - length, 495);
		}

		RSApplet()
		{
				delayTime = 20;
				minDelay = 1;
				aLongArray7 = new long[10];
				shouldDebug = false;
				shouldClearScreen = true;
				awtFocus = true;
				keyArray = new int[128];
				charQueue = new int[128];
		}

		private long screenShotTime;

		public void takeScreenshot(String name)
		{
				if (!name.isEmpty())
				{
						if (System.currentTimeMillis() - screenShotTime < 500)
						{
								return;
						}
						screenShotTime = System.currentTimeMillis();
				}
				try
				{
						Window window = KeyboardFocusManager.getCurrentKeyboardFocusManager().getFocusedWindow();
						if (window == null)
						{
								return;
						}
						Point point = window.getLocationOnScreen();
						if (point == null)
						{
								return;
						}
						int x = (int) point.getX();
						int y = (int) point.getY();
						int w = window.getWidth();
						int h = window.getHeight();
						Robot robot = new Robot(window.getGraphicsConfiguration().getDevice());
						//Rectangle captureSize = new Rectangle(x + 3, y + 22, w - 6, h - 25); // Old laptop
						//Rectangle captureSize = new Rectangle(x + 3, y + 26, w - 6, h - 29); // New laptop.
						Rectangle captureSize = null;
						if (Client.isFixedScreen())
						{
								if (Client.osName.equals("Windows 7"))
								{
										captureSize = new Rectangle(x + 3, y + 22, w - 6, h - 25);

								}
								else
								{
										captureSize = new Rectangle(x + 3, y + 26, w - 6, h - 29);
								}
						}
						else
						{
								if (Client.osName.equals("Windows 7"))
								{
										captureSize = new Rectangle(x + 3, y + 22, w - 6, h - 25);

								}
								else
								{
										captureSize = new Rectangle(x + 8, y + 31, w - 16, h - 39);
								}
						}
						java.awt.image.BufferedImage bufferedimage = robot.createScreenCapture(captureSize);
						String imagePath = ClientConstants.SHATTERSCAPE_CACHE_LOCATION;
						String fullImagePath = "";

						DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
						Calendar cal = Calendar.getInstance();
						String dateName = dateFormat.format(cal.getTime());
						if (!name.isEmpty())
						{
								fullImagePath = imagePath + "dawntained_screenshots/" + "dawntained_" + Client.screenShotNumber + "_" + name + "_date_" + dateName + ".png";
						}
						else
						{
								fullImagePath = imagePath + "dawntained_screenshots/" + "dawntained_" + Client.screenShotNumber + "_date_" + dateName + ".png";
						}
						File folder = new File(fullImagePath);
						if (!folder.exists())
						{
								folder.mkdir();
						}
						File file = new File(fullImagePath);
						ImageIO.write(bufferedimage, "png", file);
						Client.instance.pushMessage("Screenshot saved at " + imagePath, 0, "");
						Screenshot.saveScreenshotNumber();
				}
				catch (Exception e)
				{
						e.printStackTrace();
				}
		}

		int getClickMode3()
		{
				return clickMode3;
		}

		void setClickMode3(int clickMode3)
		{
				this.clickMode3 = clickMode3;
		}

		private int anInt4;

		private int delayTime;

		int minDelay;

		private final long[] aLongArray7;

		int fps;

		boolean shouldDebug;

		public int myWidth;

		public int myHeight;

		public Graphics graphics;

		GraphicsBuffer fullGameScreen;

		RSFrame gameFrame;

		public static boolean shouldClearScreen;

		boolean awtFocus;

		int idleTime;

		int clickMode2;

		public int mouseX;

		public int mouseY;

		private int clickMode1;

		public static int clickX;

		public static int clickY;

		private long clickTime;

		private int clickMode3;

		int saveClickX;

		int saveClickY;

		long aLong29;

		final int[] keyArray;

		private final int[] charQueue;

		private int readIndex;

		private int writeIndex;

		public static int anInt34;
}