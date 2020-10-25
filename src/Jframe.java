import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.HierarchyBoundsListener;
import java.awt.event.HierarchyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.net.URL;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;


public class Jframe extends Client implements ActionListener
{

		/**
		 * 
		 */
		private static final long serialVersionUID = 747209464164797871L;

		public static JFrame frame;

		public Jframe(String args[])
		{
				super();
				try
				{
						initUI();
				}
				catch (Exception ex)
				{
						ex.printStackTrace();
				}
		}

		public void initUI()
		{
				try
				{
						UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
						JPopupMenu.setDefaultLightWeightPopupEnabled(false);
						frame = new JFrame("ShatterScape");
						JButton screenshot = new JButton("Take screenshot");
						screenshot.setActionCommand("Screenshot");
						screenshot.addActionListener(this);
						frame.setLayout(new BorderLayout());
						setFocusTraversalKeysEnabled(false);
						frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						JPanel gamePanel = new JPanel();
						getLogo();

						gamePanel.setLayout(new BorderLayout());
						gamePanel.add(this);
						gamePanel.setPreferredSize(new Dimension(763, 501));
						getCursorType();
						frame.getContentPane().add(gamePanel, BorderLayout.CENTER);
						frame.pack();



						frame.setVisible(true);
						frame.setResizable(false);

						frame.addWindowStateListener(listener);
						Jframe.frame.getContentPane().addHierarchyBoundsListener(new HierarchyBoundsListener()
						{

								public void ancestorMoved(HierarchyEvent e)
								{

										if (!Client.loadingGameString.isEmpty())
										{
												if (System.currentTimeMillis() - clientDimenionsSavedTime >= 3000)
												{
														clientDimenionsSavedTime = System.currentTimeMillis();
														clientFrameSaveNeeded = true;
														clientFrameSaveNeededTime = System.currentTimeMillis();
												}
										}
										else
										{
												clientFrameSaveNeeded = true;
										}
								}

								public void ancestorResized(HierarchyEvent e)
								{
										if (!Client.loadingGameString.isEmpty())
										{
												if (Client.clientWidthSaved != Client.RESIZABLE_WIDTH || Client.clientHeightSaved != Client.RESIZABLE_HEIGHT)
												{
														if (!Client.isFixedScreenSaved)
														{
																clientFrameSaveNeeded = true;
																clientFrameSaveNeededTime = System.currentTimeMillis();
														}
												}
										}
										if (Client.maximizable && Client.isFixedScreen())
										{
												clientFrameSaveNeeded = true;
												clientFrameSaveNeededTime = System.currentTimeMillis();
										}
								}
						});
						Settings.loadSettingsJframe();
						rebuild(false); // To white/yellow/black line bugs on the outside of the client on certain Pcs.
						if (ClientConfiguration.CLIENT_TOP_RIGHT)
						{
								frame.setLocation(1151, 0);
						}
				}
				catch (Exception e)
				{
						e.printStackTrace();
				}
		}

		public static void getCursorType()
		{
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				switch (isCursor)
				{

						case 0:
								frame.setCursor(null);
								break;

						case 1:
								Cursor cursor = toolkit.createCustomCursor(toolkit.getImage(ClientConstants.SPRITES_LOCATION + "cursor/cursor_1.PNG"), new Point(0, 0), "Cursor 1");
								frame.setCursor(cursor);
								break;

						case 2:
								Cursor cursor1 = toolkit.createCustomCursor(toolkit.getImage(ClientConstants.SPRITES_LOCATION + "cursor/cursor_2.PNG"), new Point(0, 0), "Cursor 2");
								frame.setCursor(cursor1);
								break;

						case 3:
								Cursor cursor2 = toolkit.createCustomCursor(toolkit.getImage(ClientConstants.SPRITES_LOCATION + "cursor/cursor_3.PNG"), new Point(0, 0), "Cursor 3");
								frame.setCursor(cursor2);
								break;

						case 4:
								Cursor cursor3 = toolkit.createCustomCursor(toolkit.getImage(ClientConstants.SPRITES_LOCATION + "cursor/cursor_4.PNG"), new Point(0, 0), "Cursor 4");
								frame.setCursor(cursor3);
								break;

						case 5:
								Cursor cursor4 = toolkit.createCustomCursor(toolkit.getImage(ClientConstants.SPRITES_LOCATION + "cursor/cursor_5.PNG"), new Point(0, 0), "Cursor 5");
								frame.setCursor(cursor4);
								break;
				}

		}

		public URL getCodeBase()
		{
				try
				{
						return new URL("http://" + server + "/cache");
				}
				catch (Exception e)
				{
						return super.getCodeBase();
				}
		}

		public URL getDocumentBase()
		{
				return getCodeBase();
		}

		public void loadError(String s)
		{
				Utility.print("loadError1: " + s);
		}

		public String getParameter(String key)
		{
				return "";
		}

		WindowStateListener listener = new WindowAdapter()
		{
				public void windowStateChanged(WindowEvent evt)
				{
						if (!Client.loadingGameString.isEmpty())
						{
								int oldState = evt.getOldState();
								int newState = evt.getNewState();

								if ((oldState & Frame.MAXIMIZED_BOTH) == 0 && (newState & Frame.MAXIMIZED_BOTH) != 0)
								{
										Client.clientMaximized = true;
										Client.clientMaximimzedTime = System.currentTimeMillis();
										Client.clientFrameSaveNeeded = true;
										Client.clientMaximizedPreviously = true;
								}
								else if ((oldState & Frame.MAXIMIZED_BOTH) != 0 && (newState & Frame.MAXIMIZED_BOTH) == 0)
								{
										Client.clientMaximized = false;
										Client.clientFrameSaveNeeded = true;
										Client.clientMaximimzedTime = System.currentTimeMillis();
								}
						}
				}

		};

		public void getLogo()
		{
				frame.setIconImage(new ImageIcon(this.getClass().getResource("image/icon.png")).getImage());
		}

		public static void rebuild(boolean logIn)
		{
				Client.clientIgnoreLocationSave = true;
				// Adding extra numbers to fixed mode because for some odd reason, it gives us a smaller size then what is asked for.
				if (Client.isFixedScreen() && !logIn || logIn && Client.isFixedScreenSaved)
				{
						// if os name is windows 7, then use different dimensions
						setPreferredSize();
						frame.setResizable(Client.maximizable);
				}
				else
				{
						if (!Client.clientMaximized)
						{
								frame.setPreferredSize(new Dimension(getClientWidth(), getClientHeight()));
						}
						frame.setResizable(true);
				}
				frame.pack();
				double clientX = Client.isFixedScreen() ? Client.clientFixedLocationX : Client.clientResizedLocationX;
				double clientY = Client.isFixedScreen() ? Client.clientFixedLocationY : Client.clientResizedLocationY;
				if (clientX != -1 && clientY != -1)
				{
						if (!Client.clientMaximized && !Client.isFixedScreenSaved || Client.isFixedScreen())
						{

								// First time launching client with no settings saved, new players.
								if (clientX == 0.0 && clientY == 0.0)
								{
										frame.setLocationRelativeTo(null);
								}
								else
								{
										Jframe.frame.setLocation((int) clientX, (int) clientY);
								}
						}
						else
						{
								frame.setLocationRelativeTo(null);
						}
				}
				else
				{
						frame.setLocationRelativeTo(null);
				}
				Client.clientIgnoreLocationSave = false;
		}

		public static void setPreferredSize()
		{
				if (Client.maximizable)
				{
						frame.setPreferredSize(new Dimension(Client.maximizableWidth, Client.maximizableHeight)); // +25 to height on my old laptop.
				}
				else
				{
						int height = getClientHeight() + (Client.osName.equals("Windows 7") ? 25 : 29);
						frame.setPreferredSize(new Dimension(getClientWidth() + 6, height)); // +25 to height on my old laptop.
				}
				frame.pack();

		}

		@Override
		public void actionPerformed(ActionEvent e)
		{
		}
}