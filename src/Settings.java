import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/**
 * Handle client settings.
 * @author MGT Madness.
 */
public class Settings
{

		private static String fileLine = "";

		public static String fileText;

		public static String location;

		private static void createLastSelectedDataFile(String location1)
		{
			if (ClientConfiguration.DEBUG_MODE) {
				return;
			}
				File location = new File(location1);
				if (location.exists())
				{
						return;
				}
				try
				{
						location.createNewFile();
				}
				catch (IOException e)
				{
						e.printStackTrace();
				}
		}

		private static void createSettingsFileJframe(String location1)
		{

			if (ClientConfiguration.DEBUG_MODE) {
				return;
			}
				File thirdFolder3 = new File(ClientConstants.SHATTERSCAPE_CACHE_LOCATION + "settings");
				if (!thirdFolder3.exists())
				{
						thirdFolder3.mkdir();
				}
				File location = new File(location1);
				if (location.exists())
				{
						return;
				}
				try
				{
						location.createNewFile();
						saveSettingsJframe();
				}
				catch (IOException e)
				{
						e.printStackTrace();
				}
		}

		private static void createSettingsFile(String location1)
		{
				File location = new File(location1);
				if (!new File(location.getParent()).exists()) {
					return;
				}
				if (location.exists())
				{
						return;
				}
				try
				{
						if (Client.clientRevision("602"))
						{
								loadDefault602Settings();
						}
						if (Client.clientRevision("525"))
						{
								loadDefault525Settings();
						}
						saveSettings();
						location.createNewFile();
				}
				catch (IOException e)
				{
						e.printStackTrace();
				}
		}

		private static boolean contains(String match)
		{
				String string = fileLine.substring(0, fileLine.indexOf(" = "));
				if (string.equals(match))
				{
						return true;
				}
				return false;
		}

		private static boolean readBoolean()
		{
				fileLine = fileLine.substring(fileLine.lastIndexOf("=") + 2);
				if (fileLine.equals("true"))
				{
						return true;
				}
				return false;
		}

		private static String readString()
		{
				fileLine = fileLine.substring(fileLine.lastIndexOf("=") + 2);
				return fileLine;
		}


		private static int readInt()
		{
				fileLine = fileLine.substring(fileLine.lastIndexOf("=") + 2);
				return Integer.parseInt(fileLine);
		}

		private static Double readDouble()
		{
				fileLine = fileLine.substring(fileLine.lastIndexOf("=") + 2);
				return Double.parseDouble(fileLine);
		}

		public static void loadLastDataSelected()
		{
				String location = ClientConstants.SHATTERSCAPE_CACHE_LOCATION + "settings/" + "last_data_selected.txt";
				createLastSelectedDataFile(location);

				try
				{
						BufferedReader file = new BufferedReader(new FileReader(location));
						String line;
						while ((line = file.readLine()) != null)
						{
								fileLine = line;
								if (contains("lastDataSelected"))
								{
										Client.lastDataSelected = readString();
								}

						}
						file.close();
				}
				catch (Exception e)
				{
				}
		}

		public static void saveLastDataSelected()
		{
				String location = ClientConstants.SHATTERSCAPE_CACHE_LOCATION + "settings/" + "last_data_selected.txt";
				if (!new File(location).exists()) {
					return;
				}
				BufferedWriter bw = null;
				try
				{
						// Clear file contents.
						FileOutputStream writer = new FileOutputStream(location);
						writer.write((new String()).getBytes());
						writer.close();

						// Write new contents.
						bw = new BufferedWriter(new FileWriter(location, true));

						writeLine("lastDataSelected", Client.lastDataSelected, bw);

						bw.flush();
						bw.close();
				}
				catch (IOException ioe)
				{
						ioe.printStackTrace();
				}
		}

		public static void loadSettings(String clientRevision)
		{
				fileText = "settings" + clientRevision + ".txt";
				location = ClientConstants.SHATTERSCAPE_CACHE_LOCATION + "settings/" + fileText;
				createSettingsFile(location);

				try
				{
						BufferedReader file = new BufferedReader(new FileReader(location));
						String line;
						while ((line = file.readLine()) != null)
						{
								fileLine = line;
								if (contains("savedUsername"))
								{
										Client.savedUsername = readString();
								}
								else if (contains("savedPassword"))
								{
										Client.savedPassword = readString();
								}
								else if (contains("rememberMe"))
								{
										Client.rememberMe = readBoolean();
								}
								else if (contains("cameraSpeed"))
								{
										Client.cameraSpeed = readString();
								}
								else if (contains("hitsplatRevision"))
								{
										Client.hitsplatRevision = readString();
								}
								else if (contains("worldGraphicsMode"))
								{
										Client.worldGraphicsMode = readString();
								}
								else if (contains("fog"))
								{
										Client.fog = readString();
								}
								else if (contains("loop"))
								{
										Client.loop = readBoolean();
								}
								else if (contains("autoMusic"))
								{
										Client.autoMusic = readBoolean();
								}
								else if (contains("noClip"))
								{
										Client.noClip = readBoolean();
								}
								else if (contains("clientData"))
								{
										Client.clientData = readBoolean();
								}
								else if (contains("osrsXpOrbMiddle"))
								{
										Client.osrsXpOrbMiddle = readBoolean();
								}
								else if (contains("useOldWildernessInterface"))
								{
										Client.useOldWildernessInterface = readBoolean();
								}
								else if (contains("smoothMiniMap"))
								{
										Client.smoothMiniMap = readBoolean();
								}
								else if (contains("smoothShadow"))
								{
										Client.smoothShadow = readBoolean();
								}
								else if (contains("tweening"))
								{
										Client.tweening = readBoolean();
								}
								else if (contains("newCompass"))
								{
										Client.newCompass = readBoolean();
								}
								else if (contains("smoothCharacterTurn"))
								{
										Client.smoothCharacterTurn = readBoolean();
								}
								else if (contains("hdFloorTexturing"))
								{
										Client.otherFloorTexturing = readBoolean();
								}
								else if (contains("x10Damage"))
								{
										Client.x10Damage = readBoolean();
								}
								else if (contains("is498GameFrame"))
								{
										Client.is498GameFrame = readBoolean();
								}
								else if (contains("is508PlusGameFrame"))
								{
										Client.is508PlusGameFrame = readBoolean();
								}
								else if (contains("is562PlusGameFrame"))
								{
										Client.is562PlusGameFrame = readBoolean();
								}
								else if (contains("newClick"))
								{
										Client.newClick = readBoolean();
								}
								else if (contains("nameAbove"))
								{
										Client.nameAbove = readBoolean();
								}
								else if (contains("filtered"))
								{
										Client.filtered = readBoolean();
								}
								else if (contains("newFont"))
								{
										Client.newFont = readBoolean();
								}
								else if (contains("is474PlusGameFrame"))
								{
										Client.is474PlusGameFrame = readBoolean();
								}
								else if (contains("enableRoof"))
								{
										Client.enableRoof = readBoolean();
								}
								else if (contains("disableSummoningOrb"))
								{
										Client.disableSummoningOrb = readBoolean();
								}
								else if (contains("smoothShading"))
								{
										Client.smoothShading = readBoolean();
								}
								else if (contains("is474GameFrame"))
								{
										Client.is474GameFrame = readBoolean();
								}
								else if (contains("is525GameFrame"))
								{
										Client.is525GameFrame = readBoolean();
								}
								else if (contains("is562GameFrame"))
								{
										Client.is562GameFrame = readBoolean();
								}
								else if (contains("newHitPointsBar"))
								{
										Client.newHitPointsBar = readBoolean();
								}
								else if (contains("contextMenu"))
								{
										Client.contextMenu = readString();
								}
								else if (contains("experienceOrb"))
								{
										Client.experienceOrb = readBoolean();
								}
								else if (contains("fpsOn"))
								{
										Client.fpsOn = readBoolean();
								}
								else if (contains("showQuestionMark"))
								{
										Client.showQuestionMark = readBoolean();
								}
								else if (contains("old562GameFrame"))
								{
										Client.old562GameFrame = readBoolean();
								}
								else if (contains("volume"))
								{
										SoundPlayer.setVolume(readInt(), true, false);
								}
								else if (contains("CameraPos2"))
								{
										Client.CameraPos2 = readInt();
								}
								else if (contains("isCursor"))
								{
										Client.isCursor = readInt();
								}
								else if (contains("brightness"))
								{
										Client.brightness = readInt();
								}
								else if (contains("musicVolume"))
								{
										Client.musicVolume = readInt();
								}
								else if (contains("inventoryLayout"))
								{
										Client.inventoryLayout = readString();
								}
								else if (contains("hideInventoryInterface"))
								{
										Client.hideInventoryInterface = readBoolean();
								}
						}
						file.close();
				}
				catch (Exception e)
				{
				}
		}

		public static void loadSettingsJframe()
		{
				String fileText = "settings_frame.txt";
				String location = ClientConstants.SHATTERSCAPE_CACHE_LOCATION + "settings/" + fileText;
				createSettingsFileJframe(location);

				try
				{
						BufferedReader file = new BufferedReader(new FileReader(location));
						String line;
						while ((line = file.readLine()) != null)
						{
								fileLine = line;
								if (contains("isFixedScreenSaved"))
								{
										Client.isFixedScreenSaved = readBoolean();
								}
								else if (contains("clientWidthSaved"))
								{
										Client.clientWidthSaved = readInt();
								}
								else if (contains("clientHeightSaved"))
								{
										Client.clientHeightSaved = readInt();
								}
								else if (contains("clientFixedLocationX"))
								{
										Client.clientFixedLocationX = readDouble();
								}
								else if (contains("clientFixedLocationY"))
								{
										Client.clientFixedLocationY = readDouble();
								}
								else if (contains("clientResizedLocationX"))
								{
										Client.clientResizedLocationX = readDouble();
								}
								else if (contains("clientResizedLocationY"))
								{
										Client.clientResizedLocationY = readDouble();
								}
								else if (contains("clientMaximized"))
								{
										Client.clientMaximized = readBoolean();
								}
								else if (contains("maximizable"))
								{
										Client.maximizable = readBoolean();
								}
								else if (contains("maximizableWidth"))
								{
										Client.maximizableWidth = readInt();
								}
								else if (contains("maximizableHeight"))
								{
										Client.maximizableHeight = readInt();
								}
						}
						file.close();
				}
				catch (Exception e)
				{
				}
		}

		public static void saveSettingsJframe()
		{
				String fileText = "settings_frame.txt";
				String location = ClientConstants.SHATTERSCAPE_CACHE_LOCATION + "settings/" + fileText;
				BufferedWriter bw = null;
				try
				{
						// Clear file contents.
						FileOutputStream writer = new FileOutputStream(location);
						writer.write((new String()).getBytes());
						writer.close();

						// Write new contents.
						bw = new BufferedWriter(new FileWriter(location, true));

						writeLine("isFixedScreenSaved", Client.isFixedScreenSaved, bw);
						writeLine("clientWidthSaved", Client.clientWidthSaved, bw);
						writeLine("clientHeightSaved", Client.clientHeightSaved, bw);
						if (Client.isFixedScreen())
						{
								if (System.currentTimeMillis() - Client.clientMaximimzedTime >= 500)
								{
										if (!Client.clientIgnoreLocationSave && !Client.clientMaximized)
										{
												Client.clientFixedLocationX = Jframe.frame.getLocation().getX();
												Client.clientFixedLocationY = Jframe.frame.getLocation().getY();
										}
								}
								writeLine("clientFixedLocationX", Client.clientFixedLocationX, bw);
								writeLine("clientFixedLocationY", Client.clientFixedLocationY, bw);
								writeLine("clientResizedLocationX", Client.clientResizedLocationX, bw);
								writeLine("clientResizedLocationY", Client.clientResizedLocationY, bw);
						}
						else if (!Client.isFixedScreen())
						{
								if (System.currentTimeMillis() - Client.clientMaximimzedTime >= 500)
								{
										if (!Client.clientIgnoreLocationSave && !Client.clientMaximized)
										{
												Client.clientResizedLocationX = Jframe.frame.getLocation().getX();
												Client.clientResizedLocationY = Jframe.frame.getLocation().getY();
										}
								}
								writeLine("clientFixedLocationX", Client.clientFixedLocationX, bw);
								writeLine("clientFixedLocationY", Client.clientFixedLocationY, bw);
								writeLine("clientResizedLocationX", Client.clientResizedLocationX, bw);
								writeLine("clientResizedLocationY", Client.clientResizedLocationY, bw);
						}

						writeLine("clientMaximized", Client.clientMaximized, bw);
						writeLine("maximizable", Client.maximizable, bw);
						writeLine("maximizableWidth", Client.maximizableWidth, bw);
						writeLine("maximizableHeight", Client.maximizableHeight, bw);
						bw.flush();
						bw.close();
				}
				catch (IOException ioe)
				{
						ioe.printStackTrace();
				}
		}

		public static void saveSettings()
		{
				BufferedWriter bw = null;
				if (!new File(location).exists()) {
					return;
				}
				try
				{
						// Clear file contents.
						FileOutputStream writer = new FileOutputStream(location);
						writer.write((new String()).getBytes());
						writer.close();

						// Write new contents.
						bw = new BufferedWriter(new FileWriter(location, true));

						writeLine("savedUsername", Client.savedUsername, bw);
						writeLine("savedPassword", Client.savedPassword, bw);
						writeLine("rememberMe", Client.rememberMe, bw);
						writeLine("hitsplatRevision", Client.hitsplatRevision, bw);
						writeLine("cameraSpeed", Client.cameraSpeed, bw);
						writeLine("worldGraphicsMode", Client.worldGraphicsMode, bw);
						writeLine("fog", Client.fog, bw);
						writeLine("loop", Client.loop, bw);
						writeLine("autoMusic", Client.autoMusic, bw);
						writeLine("noClip", Client.noClip, bw);
						writeLine("clientData", Client.clientData, bw);
						writeLine("osrsXpOrbMiddle", Client.osrsXpOrbMiddle, bw);
						writeLine("useOldWildernessInterface", Client.useOldWildernessInterface, bw);
						writeLine("smoothMiniMap", Client.smoothMiniMap, bw);
						writeLine("smoothShadow", Client.smoothShadow, bw);
						writeLine("tweening", Client.tweening, bw);
						writeLine("newCompass", Client.newCompass, bw);
						writeLine("smoothCharacterTurn", Client.smoothCharacterTurn, bw);
						writeLine("hdFloorTexturing", Client.otherFloorTexturing, bw);
						writeLine("x10Damage", Client.x10Damage, bw);
						writeLine("is498GameFrame", Client.is498GameFrame, bw);
						writeLine("is508PlusGameFrame", Client.is508PlusGameFrame, bw);
						writeLine("is562PlusGameFrame", Client.is562PlusGameFrame, bw);
						writeLine("newClick", Client.newClick, bw);
						writeLine("nameAbove", Client.nameAbove, bw);
						writeLine("filtered", Client.filtered, bw);
						writeLine("newFont", Client.newFont, bw);
						writeLine("is474PlusGameFrame", Client.is474PlusGameFrame, bw);
						writeLine("enableRoof", Client.enableRoof, bw);
						writeLine("disableSummoningOrb", Client.disableSummoningOrb, bw);
						writeLine("smoothShading", Client.smoothShading, bw);
						writeLine("is474GameFrame", Client.is474GameFrame, bw);
						writeLine("is525GameFrame", Client.is525GameFrame, bw);
						writeLine("is562GameFrame", Client.is562GameFrame, bw);
						writeLine("newHitPointsBar", Client.newHitPointsBar, bw);
						writeLine("contextMenu", Client.contextMenu, bw);
						writeLine("experienceOrb", Client.experienceOrb, bw);
						writeLine("fpsOn", Client.fpsOn, bw);
						writeLine("volume", SoundPlayer.getVolume(), bw);
						writeLine("CameraPos2", Client.CameraPos2, bw);
						writeLine("isCursor", Client.isCursor, bw);
						writeLine("brightness", Client.brightness, bw);
						writeLine("musicVolume", Client.musicVolume, bw);
						writeLine("showQuestionMark", Client.showQuestionMark, bw);
						writeLine("old562GameFrame", Client.old562GameFrame, bw);
						writeLine("inventoryLayout", Client.inventoryLayout, bw);
						writeLine("hideInventoryInterface", Client.hideInventoryInterface, bw);
						bw.flush();
						bw.close();
				}
				catch (IOException ioe)
				{
						ioe.printStackTrace();
				}
		}

		private static void writeLine(String line, String line1, BufferedWriter bw)
		{
				try
				{
						bw.write(line + " = " + line1);
						bw.newLine();
				}
				catch (IOException e)
				{
						e.printStackTrace();
				}
		}

		private static void writeLine(String line, Boolean line1, BufferedWriter bw)
		{
				try
				{
						bw.write(line + " = " + line1);
						bw.newLine();
				}
				catch (IOException e)
				{
						e.printStackTrace();
				}
		}

		private static void writeLine(String line, Double line1, BufferedWriter bw)
		{
				try
				{
						bw.write(line + " = " + line1);
						bw.newLine();
				}
				catch (IOException e)
				{
						e.printStackTrace();
				}
		}

		private static void writeLine(String line, int line1, BufferedWriter bw)
		{
				try
				{
						bw.write(line + " = " + line1);
						bw.newLine();
				}
				catch (IOException e)
				{
						e.printStackTrace();
				}
		}

		/**
		 * This method is called after the Client Settings .dat file has been
		 * loaded.. Update the client depending on the loaded Client Settings.
		 */
		public static void updateClientSettings()
		{
				updateBrightness();
				SoundPlayer.setVolume(SoundPlayer.getVolume(), false, false);
				Client.hdMinimap = Client.otherFloorTexturing;
				FogHandler.adjustFogEndDistance();
				FogHandler.updateFogColour();
				updateSettingsInterfaceText();

				if (!Client.disableSummoningOrb)
				{
						Client.summoningOrb = true;
				}


		}

		private static void updateSettingsInterfaceText()
		{

				if (Client.is525GameFrame)
				{
						Client.instance.sendFrame126("Gameframe: @gr3@525", 17313);
				}
				else if (Client.is562GameFrame && Client.old562GameFrame)
				{
						Client.instance.sendFrame126("Gameframe: @gr3@562 old", 17313);
				}
				else if (Client.is562GameFrame && Client.showQuestionMark)
				{
						Client.instance.sendFrame126("Gameframe: @gr3@562+", 17313);
				}
				else if (Client.is562GameFrame)
				{
						Client.instance.sendFrame126("Gameframe: @gr3@562", 17313);
				}
				else if (Client.is562PlusGameFrame & Client.newCompass)
				{
						Client.instance.sendFrame126("Gameframe: @gr3@562+++", 17313);
				}
				else if (Client.is562PlusGameFrame)
				{
						Client.instance.sendFrame126("Gameframe: @gr3@562++", 17313);
				}
				else if (Client.is474GameFrame && !Client.is474PlusGameFrame)
				{
						Client.instance.sendFrame126("Gameframe: @gr3@474", 17313);
				}
				else if (Client.is474PlusGameFrame)
				{
						Client.instance.sendFrame126("Gameframe: @gr3@474+", 17313);
				}
				else if (Client.is498GameFrame)
				{
						Client.instance.sendFrame126("Gameframe: @gr3@498", 17313);
				}
				else if (Client.is508PlusGameFrame)
				{
						Client.instance.sendFrame126("Gameframe: @gr3@508", 17313);
				}

				String text = "";
				switch (Client.contextMenu)
				{
						case "OLD":
								text = "Old";
								break;
						case "OLD HOVER":
								text = "Old hover";
								break;
						case "NEW":
								text = "New";
								break;
				}
				Client.instance.sendFrame126("Menu: @gr3@" + text, 17321);

				Client.instance.sendFrame126("Hitsplats: @gr3@" + Client.hitsplatRevision, 17317);
				switch (Client.CameraPos2)
				{
						case 400:
								Client.instance.sendFrame126("Zoom: @gr3@Very Close", 17354);
								break;
						case 500:
								Client.instance.sendFrame126("Zoom: @gr3@Close", 17354);
								break;
						case 600:
								Client.instance.sendFrame126("Zoom: @gr3@Normal", 17354);
								break;
						case 700:
								Client.instance.sendFrame126("Zoom: @gr3@Far", 17354);
								break;
						case 800:
								Client.instance.sendFrame126("Zoom: @gr3@Very far", 17354);
								break;
				}
				if (Camera.CameraData.SUPER_SLOW.toString().equals(Client.cameraSpeed))
				{
						Client.instance.sendFrame126("Cam speed: @gr3@Super Slow", 17358);
				}
				else if (Camera.CameraData.SLOW.toString().equals(Client.cameraSpeed))
				{
						Client.instance.sendFrame126("Cam speed: @gr3@Slow", 17358);
				}
				else if (Camera.CameraData.MEDIUM.toString().equals(Client.cameraSpeed))
				{
						Client.instance.sendFrame126("Cam speed: @gr3@Medium", 17358);
				}
				else if (Camera.CameraData.FAST.toString().equals(Client.cameraSpeed))
				{
						Client.instance.sendFrame126("Cam speed: @gr3@Fast", 17358);
				}
				else if (Camera.CameraData.VERY_FAST.toString().equals(Client.cameraSpeed))
				{
						Client.instance.sendFrame126("Cam speed: @gr3@Fast+", 17358);
				}
				else if (Camera.CameraData.EXTREMELY_FAST.toString().equals(Client.cameraSpeed))
				{
						Client.instance.sendFrame126("Cam speed: @gr3@Fast++", 17358);
				}
				if (Client.worldGraphicsMode.equals("HIGH"))
				{
						Client.instance.sendFrame126("Detail: @gr3@High", 17383);
				}
				else if (Client.worldGraphicsMode.equals("MEDIUM"))
				{
						Client.instance.sendFrame126("Detail: @gr3@Medium", 17383);
				}
				else
				{
						Client.instance.sendFrame126("Detail: @gr3@Low", 17383);
				}
				switch (Client.fog)
				{
						case "OFF BLACK":
								Client.instance.sendFrame126("Fog: @gr3@Off black", 17391);
								break;
						case "OFF WHITE":
								Client.instance.sendFrame126("Fog: @gr3@Off white", 17391);
								break;
						case "DEFAULT":
								Client.instance.sendFrame126("Fog: @gr3@Default", 17391);
								break;
						case "SKY":
								Client.instance.sendFrame126("Fog: @gr3@Sky", 17391);
								break;
						case "DAWN":
								Client.instance.sendFrame126("Fog: @gr3@Dawn", 17391);
								break;
						case "NIGHT":
								Client.instance.sendFrame126("Fog: @gr3@Night", 17391);
								break;
				}
		}

		/**
		 * Update the client brightness on client start-up depending on the settting.
		 */
		private static void updateBrightness()
		{
				Client.instance.variousSettings[166] = Client.brightness;
				Client.instance.handleVarp(166);
		}

		/**
		 * Load the default 602 settings if the settings602.txt is created for the first time.
		 */
		private static void loadDefault602Settings()
		{
				Client.is474GameFrame = false;
				Client.is474PlusGameFrame = false;
				Client.is562GameFrame = true;

				Client.hitsplatRevision = "562+";
				Client.newHitPointsBar = true;
				Client.contextMenu = "NEW";
				Client.x10Damage = true;
				Client.useOldWildernessInterface = false;
				Client.smoothCharacterTurn = true;
				Client.smoothShadow = true;
				Client.tweening = true;
				Client.smoothShading = true;
				Client.newFont = true;
				Client.fog = "OFF WHITE";
				FogHandler.updateFogColour();
		}

		/**
		 * Load the default 525 settings if the settings525.txt is created for the first time.
		 */
		private static void loadDefault525Settings()
		{
				Client.is474GameFrame = false;
				Client.is474PlusGameFrame = false;
				Client.is525GameFrame = true;

				Client.hitsplatRevision = "562";
				Client.newHitPointsBar = true;
				Client.contextMenu = "NEW";
				Client.useOldWildernessInterface = false;
				Client.smoothCharacterTurn = true;
				Client.smoothShadow = true;
				Client.smoothShading = true;
				Client.newFont = false;
				Client.fog = "OFF BLACK";
				FogHandler.updateFogColour();
		}

		/**
		 * Perform the action of the settings button.
		 * @param button
		 */
		public static boolean settingButton(int button)
		{
				switch (button)
				{
						case 17310:
								StreamLoader streamLoader_2 = Client.instance.streamLoaderForName(4, "2d graphics", "media", Client.instance.expectedCRCs[4], 40);
								if (Client.is474GameFrame && !Client.is474PlusGameFrame)
								{
										Client.is474GameFrame = true;
										Client.is474PlusGameFrame = true;
										Client.is498GameFrame = false;
										Client.is508PlusGameFrame = false;
										Client.is525GameFrame = false;
										Client.is562GameFrame = false;
										Client.is562PlusGameFrame = false;
										Client.setTabId(11, true);
										Client.instance.sendFrame126("Gameframe: @gr3@474+", 17313);
								}
								else if (Client.is474GameFrame && Client.is474PlusGameFrame)
								{
										if (Client.isFixedScreen())
										{
												Client.is474GameFrame = false;
												Client.is474PlusGameFrame = false;
												Client.is498GameFrame = true;
												Client.is508PlusGameFrame = false;
												Client.is525GameFrame = false;
												Client.is562GameFrame = false;
												Client.is562PlusGameFrame = false;
												Client.instance.setSidebarInterface(2, 19500);
												Client.setTabId(11, true);
												Client.instance.sendFrame126("Gameframe: @gr3@498", 17313);
										}
										else
										{
												Client.instance.pushMessage("498 & 508 gameframe is not available on resizable.", 0, "");

												Client.is474GameFrame = false;
												Client.is474PlusGameFrame = false;
												Client.is498GameFrame = false;
												Client.is508PlusGameFrame = false;
												Client.is525GameFrame = true;
												Client.is562GameFrame = false;
												Client.is562PlusGameFrame = false;
												Client.setTabId(11, true);
												Client.instance.sendFrame126("Gameframe: @gr3@525", 17313);
										}
								}
								else if (Client.is498GameFrame)
								{
										Client.is474GameFrame = false;
										Client.is474PlusGameFrame = false;
										Client.is498GameFrame = false;
										Client.is508PlusGameFrame = true;
										Client.is525GameFrame = false;
										Client.is562GameFrame = false;
										Client.is562PlusGameFrame = false;
										Client.setTabId(11, true);
										Client.instance.sendFrame126("Gameframe: @gr3@508", 17313);
								}
								else if (Client.is508PlusGameFrame)
								{
										Client.is474GameFrame = false;
										Client.is474PlusGameFrame = false;
										Client.is498GameFrame = false;
										Client.is508PlusGameFrame = false;
										Client.is525GameFrame = true;
										Client.is562GameFrame = false;
										Client.is562PlusGameFrame = false;
										Client.setTabId(11, true);
										Client.instance.sendFrame126("Gameframe: @gr3@525", 17313);
								}
								else if (Client.is525GameFrame)
								{
										Client.is474GameFrame = false;
										Client.is474PlusGameFrame = false;
										Client.is498GameFrame = false;
										Client.is508PlusGameFrame = false;
										Client.is525GameFrame = false;
										Client.is562GameFrame = true;
										Client.is562PlusGameFrame = false;
										Client.old562GameFrame = true;
										Client.instance.setSidebarInterface(15, 18500); // Note tab
										Client.instance.setSidebarInterface(14, 19500); // Achievement Tab
										Client.setTabId(11, true);
										Client.instance.sendFrame126("Gameframe: @gr3@562 old", 17313);
										if (Client.getInventoryLayout("DOUBLE STACK") && (Client.is562GameFrame || Client.is562PlusGameFrame))
										{
												Client.inventoryLayout = "LANDSCAPE";
												Client.instance.pushMessage("Double stack inventory layout is unavailable for 562 gameframes.", 0, "");
										}
								}
								else if (Client.old562GameFrame)
								{
										Client.old562GameFrame = false;
										Client.instance.sendFrame126("Gameframe: @gr3@562", 17313);
								}

								else if (Client.is562GameFrame && !Client.showQuestionMark)
								{
										Client.is562GameFrame = true;
										Client.is562PlusGameFrame = false;
										Client.showQuestionMark = true;
										Client.instance.setSidebarInterface(1, 19500); // Achievement tab.
										Client.instance.setSidebarInterface(2, 3917); // Skill tab.
										Client.instance.setSidebarInterface(14, 19500); // Quest tab.
										Client.setTabId(11, true);
										Client.instance.sendFrame126("Gameframe: @gr3@562+", 17313);
								}
								else if (Client.is562GameFrame && Client.showQuestionMark)
								{
										Client.is562GameFrame = false;
										Client.is562PlusGameFrame = true;
										Client.instance.sendFrame126("Gameframe: @gr3@562++", 17313);
								}
								else if (Client.is562PlusGameFrame && !Client.newCompass)
								{

										if (Client.isFixedScreen())
										{

												Client.instance.compass = new Sprite(streamLoader_2, "compass", 1);
												Client.newCompass = true;
												saveSettings();
												Client.instance.sendFrame126("Gameframe: @gr3@562+++", 17313);
										}
										else
										{
												Client.instance.pushMessage("562+++ (new compass) gameframe is not available on resizable.", 0, "");
												Client.is474GameFrame = true;
												Client.is474PlusGameFrame = false;
												Client.is498GameFrame = false;
												Client.is508PlusGameFrame = false;
												Client.is525GameFrame = false;
												Client.is562GameFrame = false;
												Client.is562PlusGameFrame = false;
												Client.newCompass = false;
												Client.instance.setSidebarInterface(15, 962);
												Client.instance.setSidebarInterface(2, 19500);
												Client.instance.setSidebarInterface(1, 3917); // Skill tab.
												Client.setTabId(11, true);
												Client.instance.compass = new Sprite(streamLoader_2, "compass", 0);
												Client.instance.sendFrame126("Gameframe: @gr3@474", 17313);
												Client.showQuestionMark = false;
												saveSettings();
										}
								}
								else if (Client.newCompass)
								{
										Client.is474GameFrame = true;
										Client.is474PlusGameFrame = false;
										Client.is498GameFrame = false;
										Client.is508PlusGameFrame = false;
										Client.is525GameFrame = false;
										Client.is562GameFrame = false;
										Client.is562PlusGameFrame = false;
										Client.newCompass = false;
										Client.instance.setSidebarInterface(15, 962);
										Client.instance.setSidebarInterface(2, 19500);
										Client.instance.setSidebarInterface(1, 3917); // Skill tab.
										Client.setTabId(11, true);
										Client.instance.compass = new Sprite(streamLoader_2, "compass", 0);
										Client.instance.sendFrame126("Gameframe: @gr3@474", 17313);
										Client.showQuestionMark = false;
										saveSettings();
								}
								InventoryTab.drawTabArea(Client.instance);
								saveSettings();

								// Inform server that the client is using 474 gameframe to use old wild interface.
								String data = "";
								if (Client.is474GameFrame)
								{
										data = "::oldgameframe";
								}
								else
								{
										data = "::newgameframe";
								}
								Client.instance.sendCommandPacket(data);
								return true;
						case 17396:
								Client.smoothMiniMap = !Client.smoothMiniMap;
								saveSettings();
								break;
						case 17368:
								if (!Client.fog.equals("OFF BLACK") && !Client.fog.equals("OFF WHITE") && Client.smoothShading)
								{
										Client.instance.pushMessage("Smooth textures is required for fog.", 0, "");
										return true;
								}
								Client.smoothShading = !Client.smoothShading;
								Client.instance.setLoadingStage(1);
								saveSettings();
								return true;
						case 17372:
								if (Client.otherFloorTexturing)
								{
										Client.instance.pushMessage("This feature is force enabled while using HD floors.", 0, "");
										return true;
								}
								if (!Client.fog.equals("OFF BLACK") && !Client.fog.equals("OFF WHITE") && Client.smoothShading)
								{
										Client.instance.pushMessage("Smooth textures is required for fog.", 0, "");
										return true;
								}
								Client.smoothShadow = !Client.smoothShadow;
								saveSettings();
								return true;
						case 17295:
								switch (Client.settingsPage)
								{
										case 1:
												Client.instance.sendFrame126("Page 2/4", 17298);
												Client.settingsPage++;
												Client.instance.setSidebarInterface(11, 17338);
												break;
										case 2:
												Client.instance.sendFrame126("Page 3/4", 17298);
												Client.settingsPage++;
												Client.instance.setSidebarInterface(11, 17367);
												break;
										case 3:
												Client.instance.sendFrame126("Page 4/4", 17298);
												Client.settingsPage++;
												Client.instance.setSidebarInterface(11, 17299);
												break;
								}
								return true;
						case 17292:
								switch (Client.settingsPage)
								{
										case 2:
												Client.instance.sendFrame126("Page 1/4", 17298);
												Client.settingsPage--;
												Client.instance.setSidebarInterface(11, 17300);
												break;
										case 3:
												Client.instance.sendFrame126("Page 2/4", 17298);
												Client.settingsPage--;
												Client.instance.setSidebarInterface(11, 17338);
												break;
										case 4:
												Client.instance.sendFrame126("Page 3/4", 17298);
												Client.settingsPage--;
												Client.instance.setSidebarInterface(11, 17367);
												break;
								}
								return true;
						case 17322:
								Client.experienceOrb = !Client.experienceOrb;
								saveSettings();
								return true;
						case 17318:
								String text = "";
								switch (Client.contextMenu)
								{
										case "OLD":
												Client.contextMenu = "OLD HOVER";
												text = "Old hover";
												break;
										case "OLD HOVER":
												Client.contextMenu = "NEW";
												text = "New";
												break;
										case "NEW":
												Client.contextMenu = "OLD";
												text = "Old";
												break;
								}
								Client.instance.sendFrame126("Menu: @gr3@" + text, 17321);
								saveSettings();
								return true;
						case 17343:
								Client.smoothCharacterTurn = !Client.smoothCharacterTurn;
								saveSettings();
								return true;
						case 17330:
								if (Client.newHitPointsBar)
								{
										Client.newHitPointsBar = false;
								}
								else
								{
										Client.newHitPointsBar = true;
								}
								saveSettings();
								return true;
						case 17314:
								String[] hitsplats = {"474", "562", "562+", "634"};
								for (int index = 0; index < hitsplats.length; index++)
								{
										if (Client.hitsplatRevision(hitsplats[index]))
										{
												if (index == hitsplats.length - 1)
												{
														index = -1;
												}
												Client.hitsplatRevision = hitsplats[index + 1];
												break;
										}
								}

								Client.instance.sendFrame126("Hitsplats: @gr3@" + Client.hitsplatRevision, 17317);
								saveSettings();
								return true;


						case 17334:
								Client.disableSummoningOrb = !Client.disableSummoningOrb;
								if (Client.disableSummoningOrb)
								{
										Client.summoningOrb = false;
								}
								else
								{
										Client.summoningOrb = true;
								}
								saveSettings();
								break;
						case 17326:
								if (Client.x10Damage)
								{
										Client.x10Damage = false;
								}
								else
								{
										Client.x10Damage = true;
								}
								saveSettings();
								return true;
						case 17347:
								if (Client.isCursor == 0)
								{
										Client.isCursor = 1;
								}
								else if (Client.isCursor == 1)
								{
										Client.isCursor = 2;
								}
								else if (Client.isCursor == 2)
								{
										Client.isCursor = 3;
								}
								else if (Client.isCursor == 3)
								{
										Client.isCursor = 4;
								}
								else if (Client.isCursor == 4)
								{
										Client.isCursor = 5;
								}
								else if (Client.isCursor == 5)
								{
										Client.isCursor = 0;
								}
								Jframe.getCursorType();
								saveSettings();
								return true;
						case 17376:
								Client.tweening = !Client.tweening;
								saveSettings();
								return true;
						case 17380:
								if (Client.worldGraphicsMode.equals("HIGH"))
								{
										Client.worldGraphicsMode = "LOW";
										Client.instance.sendFrame126("Detail: @gr3@Low", 17383);
								}
								else if (Client.worldGraphicsMode.equals("MEDIUM"))
								{
										Client.worldGraphicsMode = "HIGH";
										Client.instance.sendFrame126("Detail: @gr3@High", 17383);
								}
								else
								{
										Client.worldGraphicsMode = "MEDIUM";
										Client.instance.sendFrame126("Detail: @gr3@Medium", 17383);
								}

								Client.instance.setLoadingStage(1);
								Client.setWorldGraphics(Client.worldGraphicsMode);
								saveSettings();
								return true;
						case 17384:
								Client.otherFloorTexturing = !Client.otherFloorTexturing;
								Client.instance.setLoadingStage(1);
								Client.hdMinimap = Client.otherFloorTexturing;
								saveSettings();
								return true;

						case 17392:
								Client.newFont = !Client.newFont;
								Client.loadTextFonts();
								saveSettings();
								return true;

						case 17388:
								switch (Client.fog)
								{
										case "DEFAULT":
												Client.instance.sendFrame126("Fog: @gr3@Sky", 17391);
												FogHandler.forceSmoothShadowAndShading();
												Client.fog = "SKY";
												FogHandler.fogColour = 0xc8c7ff;
												break;


										case "SKY":
												Client.instance.sendFrame126("Fog: @gr3@Dawn", 17391);
												FogHandler.forceSmoothShadowAndShading();
												Client.fog = "DAWN";
												FogHandler.fogColour = 0xffd170;
												break;


										case "DAWN":
												Client.instance.sendFrame126("Fog: @gr3@Night", 17391);
												FogHandler.forceSmoothShadowAndShading();
												Client.fog = "NIGHT";
												FogHandler.fogColour = 0x1F1F1F;
												break;

										case "NIGHT":
												Client.instance.sendFrame126("Fog: @gr3@Off black", 17391);
												Client.fog = "OFF BLACK";
												FogHandler.fogColour = 0x000000;
												break;

										case "OFF BLACK":
												Client.instance.sendFrame126("Fog: @gr3@Off white", 17391);
												Client.fog = "OFF WHITE";
												FogHandler.fogColour = 0xC8C0A8;
												break;

										case "OFF WHITE":
												Client.instance.sendFrame126("Fog: @gr3@Default", 17391);
												FogHandler.forceSmoothShadowAndShading();
												Client.fog = "DEFAULT";
												break;
								}
								saveSettings();
								return true;

						case 17351:
								if (Client.CameraPos2 <= 400)
								{
										Client.CameraPos2 = 500;
										Client.instance.sendFrame126("Zoom: @gr3@Close", 17354);
								}
								else if (Client.CameraPos2 >= 500 && Client.CameraPos2 <= 575)
								{
										Client.CameraPos2 = 600;
										Client.instance.sendFrame126("Zoom: @gr3@Normal", 17354);
								}
								else if (Client.CameraPos2 >= 600 && Client.CameraPos2 <= 675)
								{
										Client.CameraPos2 = 700;
										Client.instance.sendFrame126("Zoom: @gr3@Far", 17354);
								}
								else if (Client.CameraPos2 >= 700 && Client.CameraPos2 <= 775)
								{
										Client.CameraPos2 = 800;
										Client.instance.sendFrame126("Zoom: @gr3@Very far", 17354);
								}
								else if (Client.CameraPos2 >= 800)
								{
										Client.CameraPos2 = 400;
										Client.instance.sendFrame126("Zoom: @gr3@Very Close", 17354);
								}
								FogHandler.adjustFogEndDistance();
								saveSettings();
								return true;

						case 17339:
								if (Client.nameAbove)
								{
										Client.nameAbove = false;
								}
								else
								{
										Client.nameAbove = true;
								}
								saveSettings();
								return true;

						case 17355:
								if (Camera.CameraData.SLOW.toString().equals(Client.cameraSpeed))
								{
										Client.cameraSpeed = Camera.CameraData.MEDIUM.toString();
										Client.instance.sendFrame126("Cam speed: @gr3@Medium", 17358);
								}
								else if (Camera.CameraData.MEDIUM.toString().equals(Client.cameraSpeed))
								{
										Client.cameraSpeed = Camera.CameraData.FAST.toString();
										Client.instance.sendFrame126("Cam speed: @gr3@Fast", 17358);
								}
								else if (Camera.CameraData.FAST.toString().equals(Client.cameraSpeed))
								{
										Client.cameraSpeed = Camera.CameraData.VERY_FAST.toString();
										Client.instance.sendFrame126("Cam speed: @gr3@Fast+", 17358);
								}
								else if (Camera.CameraData.VERY_FAST.toString().equals(Client.cameraSpeed))
								{
										Client.cameraSpeed = Camera.CameraData.EXTREMELY_FAST.toString();
										Client.instance.sendFrame126("Cam speed: @gr3@Fast++", 17358);
								}
								else if (Camera.CameraData.EXTREMELY_FAST.toString().equals(Client.cameraSpeed))
								{
										Client.cameraSpeed = Camera.CameraData.SUPER_SLOW.toString();
										Client.instance.sendFrame126("Cam speed: @gr3@Super Slow", 17358);
								}
								else if (Camera.CameraData.SUPER_SLOW.toString().equals(Client.cameraSpeed))
								{
										Client.cameraSpeed = Camera.CameraData.SLOW.toString();
										Client.instance.sendFrame126("Cam speed: @gr3@Slow", 17358);
								}
								saveSettings();
								break;
						case 17400:
								if (Client.worldGraphicsMode.equals("LOW") || Client.worldGraphicsMode.equals("MEDIUM"))
								{
										Client.instance.pushMessage("This feature is disabled while using low/medium detail.", 0, "");
										return true;
								}
								Client.enableRoof = !Client.enableRoof;
								saveSettings();
								return true;

						case 24264:
								// Client settings
								Client.instance.setSidebarInterface(11, 17300);
								Client.instance.sendFrame126("Page 1/4", 17298);
								Client.settingsPage = 1;
								if (Client.getTutorialStage() == 20)
								{
										Client.setTutorialStage(Client.getTutorialStage() + 20);
								}
								return true;

						case 17303:
								// Close button on settings tab.
								Client.instance.setSidebarInterface(11, 904);
								Client.setShowSettingTicks(false);
								return true;

						case 17359:
								Client.newClick = !Client.newClick;
								saveSettings();
								break;

						case 17363:
								Client.useOldWildernessInterface = !Client.useOldWildernessInterface;
								saveSettings();
								Client.instance.sendCommandPacket("::useoldwildernessinterface");
								break;
				}

				return false;
		}

		public static void drawToolTipOther(String text, int xPos, int yPos)
		{
				//TODO #FULLSCREEN ADJUST interface, settings tab tooltips and combat tab tooltips
				int x = Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 244);
				int y = Client.isFixedScreen() ? 0 : (Client.getClientHeight() - 380);
				if (!Client.isFixedScreen() && Client.getInventoryLayout("DOUBLE STACK"))
				{
						y -= 38;
				}

				if (!Client.isFixedScreen() && (Client.is562GameFrame || Client.is562PlusGameFrame))
				{
						y += 2;
				}
				xPos += x;
				yPos += y;
				int boxWidth = 0;
				int boxHeight = 0;
				TextDrawingArea textDrawingArea_2 = Client.instance.aTextDrawingArea_1271;
				for (String s1 = text; s1.length() > 0;)
				{
						int l7 = s1.indexOf("\\n");
						String s4;
						if (l7 != -1)
						{
								s4 = s1.substring(0, l7);
								s1 = s1.substring(l7 + 2);
						}
						else
						{
								s4 = s1;
								s1 = "";
						}
						int j10 = textDrawingArea_2.getTextWidth(s4);
						if (j10 > boxWidth)
						{
								boxWidth = j10;
						}
						boxHeight += textDrawingArea_2.anInt1497 - (Client.newFont ? 5 : 1);
				}
				boxWidth += 6;
				boxHeight += Client.newFont ? 10 : 10; // Length of box towards the bottom.
				DrawingArea.drawPixels(boxHeight, yPos, xPos, 0xFFFFA0, boxWidth);
				DrawingArea.fillPixels(xPos, boxWidth, boxHeight, 0, yPos);
				String s2 = text;
				for (int j11 = yPos + textDrawingArea_2.anInt1497 + (Client.newFont ? -2 : 2); s2.length() > 0; j11 += textDrawingArea_2.anInt1497 - (Client.newFont ? 4 : 0))
				{
						int l11 = s2.indexOf("\\n");
						String s5;
						if (l11 != -1)
						{
								s5 = s2.substring(0, l11);
								s2 = s2.substring(l11 + 2);
						}
						else
						{
								s5 = s2;
								s2 = "";
						}
						textDrawingArea_2.method389(false, xPos + 3, 0, s5, j11);
				}
		}

	//@formatter:off
	public final static String[] settingName1 =
	{
		"Gameframe", "Hitsplats", "Menu", "XP counter", "X10 damage", "HP bar", "Summoning orb", 
		"Names", "Smooth character turn", "Cursor", "Zoom", "Camera speed", "New click", "Old Wild level",
		"Smooth textures", "Smooth shadows", "Soft animations", "Detail", "HD floor", "Fog", "New font",
		"Smooth minimap", "Roofs", "Auto settings"
	};
	//@formatter:on

		// X of hover start, Y of hover start, Width, Height, X of box, Y of box
		static int[][] hoverBoxLocation = {
				{37, 115},
				{44, 143},
				{35, 171},
				{45, 199},
				{39, 227},
				{66, 255},
				{60, 233},

				// Names.
				{84, 115},
				{21, 143},
				{64, 171},
				{48, 199},
				{20, 227},
				{20, 255},
				{44, 216},

				// Smooth textures.
				{37, 115},
				{33, 143},
				{50, 171},
				{25, 199},
				{62, 227},
				{66, 255},
				{38, 188},

				// Smooth minimap.
				{43, 115},
				{88, 143},
				{25, 171}

		};

		static String[] hoverText = {
				"Change the Gameframe Layout",
				"Change the Combat Hitsplats\\n562+ is 562 but without text\\nshadow",
				"Change Right Click Context Menu",
				"Display Experience Counter",
				"Display X10 Multiplied Damage",
				"Change Hitpoints Bar",
				"Display Summoning Orb",
				"Display Names",
				"Character turning direction(rotation)\\nto be smooth like in 2009",
				"Change Cursor Looks",
				"Adjust Camera Zoom Level",
				"Camera Movement Speed\\nSlow is the default Runescape speed",
				"Display New Left Clicking like in 2011",
				"Display Old School\\nWilderness Levels Interface",
				"Display Smooth\\nPlayer, NPC & Object Textures",
				"Display Smooth Ground Shadows",
				"Enable Increased Animation\\nFrames Like in 2010",
				"Change World Details.\\nMedium will disable movement of\\ntextures & ground detail.\\nLow will disable water/lava textures.",
				"Display Floor Texturing",
				"Enable Advanced Fog",
				"Change the font style.\\nNew is 2009 era.\\nYou will need to restart client\\nto update the interfaces, such\\nas the quest tab etc..",
				"Enable Smooth Minimap Lines",
				"Enable Roofs",
				"Enable to have automatic changes\\nWhen switching from 2007 to 2010",};

		/**
		 * Draw the settings tooltip, this is done manually because if i add it to interfaces, the hover of the button won't show, but the tooltip will.
		 * So doing it this way, the hover will show & the tooltip.
		 */
		static void drawSettingsToolTip()
		{
				if (!Client.isShowSettingTicks())
				{
						return;
				}
				boolean hovered = false;
				int delay = 90;
				int settingIndex = 0;
				for (int index = 0; index < settingName1.length; index++)
				{
						if (Client.instance.menuActionName[Client.instance.menuActionRow - 1].contains(settingName1[index]))
						{
								if (Client.toolTipOtherTimer < delay)
								{
										Client.toolTipOtherTimer++;
								}
								settingIndex = index;
								hovered = true;
								break;
						}
				}
				if (!hovered)
				{
						if (Client.toolTipOtherTimer > 0)
						{
								Client.toolTipOtherTimer--;
						}
				}
				else
				{
						if (Client.toolTipOtherTimer >= delay)
						{
								drawToolTipOther(hoverText[settingIndex], hoverBoxLocation[settingIndex][0], hoverBoxLocation[settingIndex][1]);
						}
				}
		}

		/**
		 * Apply the setting ticks on the interface.
		 */
		public static void drawSettingTicks()
		{
				if (!Client.isShowSettingTicks())
				{
						return;
				}
				//TODO #FULLSCREEN ADJUST interface, setting tab ticks
				int x = Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 244);
				int y = Client.isFixedScreen() ? 0 : (Client.getClientHeight() - 380);
				if (!Client.isFixedScreen() && Client.getInventoryLayout("DOUBLE STACK"))
				{
						y -= 38;
				}

				if (!Client.isFixedScreen() && (Client.is562GameFrame || Client.is562PlusGameFrame))
				{
						y += 2;
				}

				switch (Client.settingsPage)
				{
						case 1:
								Client.cacheSprite[Client.experienceOrb ? 341 : 340].drawSprite(167 + x, 177 + y);
								Client.cacheSprite[Client.x10Damage ? 341 : 340].drawSprite(167 + x, 205 + y);
								Client.cacheSprite[Client.newHitPointsBar ? 341 : 340].drawSprite(167 + x, 233 + y);
								Client.cacheSprite[!Client.disableSummoningOrb ? 341 : 340].drawSprite(167 + x, 261 + y);
								break;
						case 2:
								Client.cacheSprite[Client.nameAbove ? 341 : 340].drawSprite(167 + x, 93 + y);
								Client.cacheSprite[Client.smoothCharacterTurn ? 341 : 340].drawSprite(167 + x, 121 + y);
								Client.cacheSprite[Client.isCursor > 0 ? 341 : 340].drawSprite(167 + x, 149 + y);
								Client.cacheSprite[Client.newClick ? 341 : 340].drawSprite(167 + x, 233 + y);
								Client.cacheSprite[Client.useOldWildernessInterface ? 341 : 340].drawSprite(167 + x, 261 + y);
								break;
						case 3:
								Client.cacheSprite[Client.smoothShading ? 341 : 340].drawSprite(167 + x, 93 + y);
								Client.cacheSprite[Client.smoothShadow || Client.otherFloorTexturing ? 341 : 340].drawSprite(167 + x, 121 + y);
								Client.cacheSprite[Client.tweening ? 341 : 340].drawSprite(167 + x, 149 + y);
								Client.cacheSprite[Client.otherFloorTexturing ? 341 : 340].drawSprite(167 + x, 205 + y);
								Client.cacheSprite[Client.newFont ? 341 : 340].drawSprite(167 + x, 261 + y);
								break;
						case 4:
								Client.cacheSprite[Client.smoothMiniMap ? 341 : 340].drawSprite(167 + x, 93 + y);
								Client.cacheSprite[(Client.enableRoof && !Client.worldGraphicsMode.equals("LOW") && !Client.worldGraphicsMode.equals("MEDIUM")) ? 341 : 340].drawSprite(167 + x, 121 + y);
								break;
				}
		}

		public static void drawResizableSettings()
		{
				if (Client.getInterfaceDisplayed() != 20200)
				{
						return;
				}
				//TODO #FULLSCREEN ADJUST interface, setting tab ticks resizable
				int x1 = Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 256;
				int y1 = Client.isFixedScreen() ? 0 : (Client.getClientHeight() / 2) - 267;
				Client.cacheSprite[Client.inventoryLayout.equals("LANDSCAPE") ? 341 : 340].drawSprite(313 + x1, 183 + y1);
				Client.cacheSprite[Client.hideInventoryInterface ? 341 : 340].drawSprite(313 + x1, 218 + y1);

		}
}