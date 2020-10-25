import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Content
{


		public static void loadingPleaseWait()
		{
				if (Client.contextMenu.equals("NEW"))
				{
						Client.cacheSprite[22].drawSprite(8, 9); // Loading please wait, new version.
				}
				else
				{
						DrawingArea.fillPixels(2, 130, 22, 0xffffff, 2);
						DrawingArea.drawPixels(20, 3, 3, 0, 128);
						Client.instance.aTextDrawingArea_1271.drawText(0, "Loading - please wait.", 18, 68);
						Client.instance.aTextDrawingArea_1271.drawText(0xffffff, "Loading - please wait.", 17, 67);
				}
		}

		static void drawVengeanceTimer()
		{
				if (Client.vengeanceTime == 0)
				{
						return;
				}
				long currentTime = System.currentTimeMillis();
				if (currentTime - Client.vengeanceTime >= 30000)
				{
						Client.vengeanceTime = 0;
						return;
				}
				int time = (int) (30 - ((currentTime - Client.vengeanceTime) / 1000));
				Client.cacheSprite[Client.clientRevision("474") ? 694 : 561].drawSprite(468, 310);
				Client.instance.newRegularFont.drawBasicString1(time + "", 497, 324, true, ClientConstants.WHITE, true);
		}

		public static void loadItemPrices()
		{
				try
				{
						Scanner s = new Scanner(new File(ClientConstants.CACHE_LOCATION + "prices.txt"));
						while (s.hasNextLine())
						{
								String[] line = s.nextLine().split(" ");
								int itemId = Integer.parseInt(line[0]);
								int value = Integer.parseInt(line[1]);
								ItemPrice.DEFINITIONS[itemId] = new ItemPrice(itemId, value);
						}
						s.close();
				}
				catch (IOException e)
				{
						e.printStackTrace();
				}
		}

		protected static void updateVengeanceRunes()
		{
				RSInterface class9_1 = RSInterface.interfaceCache[3214];
				Client.astralRuneAmount = 0;
				Client.deathRuneAmount = 0;
				Client.earthRuneAmount = 0;

				for (int j25 = 0; j25 < class9_1.inv.length; j25++)
				{
						int itemId = class9_1.inv[j25] - 1;
						int itemAmount = class9_1.invStackSizes[j25];
						if (itemId == 9075)
						{
								Client.astralRuneAmount = itemAmount;
						}
						else if (itemId == 560)
						{
								Client.deathRuneAmount = itemAmount;
						}
						else if (itemId == 557)
						{
								Client.earthRuneAmount = itemAmount;
						}
						else if (itemId == 18820)
						{
								// Search rune pouch for runes.
								RSInterface class9_2 = RSInterface.interfaceCache[22917];
								for (int i = 0; i < class9_2.inv.length; i++)
								{
										if (class9_2.inv[i] == 9075 + 1)
										{
												Client.astralRuneAmount += class9_2.invStackSizes[i];
										}
										else if (class9_2.inv[i] == 560 + 1)
										{
												Client.deathRuneAmount += class9_2.invStackSizes[i];
										}
										else if (class9_2.inv[i] == 557 + 1)
										{
												Client.earthRuneAmount += class9_2.invStackSizes[i];
										}

								}
						}
				}
		}

		public static void noClip()
		{
				if (!Client.noClip)
				{
						return;
				}
				if (System.currentTimeMillis() - Client.noClipTime > 500)
				{
						Client.noClipTime = System.currentTimeMillis();
				}
				for (int k1 = 0; k1 < 4; k1++)
				{
						for (int i2 = 1; i2 < 103; i2++)
						{
								for (int k2 = 1; k2 < 103; k2++)
								{
										Client.instance.collisionMap[k1].flags[i2][k2] = 0;
								}

						}

				}
		}

		public static void rottenPotatoV2(String command)
		{
				File secondFolder = new File(ClientConstants.CACHE_LOCATION + "raw/" + command.substring(15) + ".dat");
				if (!secondFolder.exists())
				{
						try
						{
								secondFolder.createNewFile();
						}
						catch (IOException e)
						{
								e.printStackTrace();
						}
				}
				Client.friendsListAction = 0;

		}

		public static void drawLoginScreen()
		{
				Client.instance.resetImageProducers();
				//TODO #FULLSCREEN ADJUST log-in screen.
				int fullscreenXOffset = Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 480;
				Client.instance.backgroundSprite[Client.isFixedScreen() ? 0 : 1].drawSprite(0 + fullscreenXOffset, 0);
				Client.instance.aRSImageProducer_1109.initDrawingArea();
				char c = '\u0168';
				if (ClientConfiguration.DEBUG_MODE)
				{
						Client.instance.aTextDrawingArea_1271.method389(true, 15, 0xFFFFFF, "X: " + Client.instance.mouseX + "", 60);
						Client.instance.aTextDrawingArea_1271.method389(true, 15, 0xFFFFFF, "Y: " + Client.instance.mouseY + "", 80);
				}
				Client.instance.aTextDrawingArea_1271.method382(0x75a9a9, c / 190, Client.onDemandFetcher.statusString, 100, true); // What is this.
				LogInScreen.logInScreenFirstPage();
				LogInScreen.logInScreenSecondPage(false);
				if (Client.instance.aRSImageProducer_1109 != null)
				{
						Client.instance.aRSImageProducer_1109.drawGraphics(0, Client.instance.graphics, 0);
				}
		}

		public static void drawBankClickedButtons()
		{
				if (Client.getInterfaceDisplayed() != 24959)
				{
						return;
				}
				// TODO #FULLSCREEN ADJUST interfaces, bank buttons/noted/search hovers/clicked.
				int x = Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 256;
				int y = Client.isFixedScreen() ? 0 : (Client.getClientHeight() / 2) - 267;
				if (Client.searching)
				{
						Client.cacheSprite[381].drawSprite(63 + x, 285 + y);
				}
				if (Client.instance.variousSettings[115] == 1)
				{
						Client.cacheSprite[378].drawSprite(238 + x, 285 + y);
				}
				if (Client.isWithIn(27, 61, 290, 315) && Client.instance.variousSettings[304] == 0)
				{
						Client.cacheSprite[393].drawSprite(23 + x, 285 + y);
				}

		}

		public static void sendSearchToServer()
		{
				if (Client.getInterfaceDisplayed() != 24959)
				{
						return;
				}
				if (!Client.searching)
				{
						return;
				}
				if (System.currentTimeMillis() - Client.timeSentBankSearch > 100)
				{
						if (Client.promptInput.equals(Client.bankSearchSent))
						{
								return;
						}
						String previous = Client.instance.inputString;
						Client.instance.inputString = "::banksearch" + Client.promptInput;
						Client.instance.stream.createFrame(103);
						Client.bankSearchSent = Client.promptInput;
						Client.instance.stream.writeWordBigEndian(Client.instance.inputString.length() - 1);
						Client.instance.stream.writeString(Client.instance.inputString.substring(2));
						Client.instance.inputString = previous;
						Client.inputValue = -1;
						Client.timeSentBankSearch = System.currentTimeMillis();
				}
		}

		/**
		* Character rotation in equipment interface.
		*/
		public static void characterRotation()
		{
				if ((Client.getInterfaceDisplayed() == 15106 || Client.getInterfaceDisplayed() == 15150) && Client.isWithInClicked(185, 264, 34, 320, true))
				{
						if (!Client.rotateCharacterState.equals("CLOCKWISE"))
						{
								Client.rotateCharacterState = "CLOCKWISE";
						}
						else if (Client.rotateCharacterState.equals("CLOCKWISE"))
						{
								Client.rotateCharacterState = "NONE";
						}
				}
				else if ((Client.getInterfaceDisplayed() == 15106 || Client.getInterfaceDisplayed() == 15150) && Client.isWithInClicked(265, 341, 34, 320, true))
				{
						if (!Client.rotateCharacterState.equals("ANTI-CLOCKWISE"))
						{
								Client.rotateCharacterState = "ANTI-CLOCKWISE";
						}
						else if (Client.rotateCharacterState.equals("ANTI-CLOCKWISE"))
						{
								Client.rotateCharacterState = "NONE";
						}
				}
		}

		static void zombieReadyInterface()
		{

				if (Client.showCountdown)
				{
						Client.cacheSprite[318].drawSprite(234 + (Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 263), 9);
						int left = (int) (System.currentTimeMillis() - Client.countDownTime) / 1000;
						left = 5 - left;
						if (left == 0)
						{
								Client.showCountdown = false;
								return;
						}
						Client.instance.newRegularFont.drawBasicString1(left + "", 258 + (Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 263), 33, false, ClientConstants.YELLOW, false);

				}
				if (Client.instance.walkableInterfaceId == 20240)
				{
						int offset = !Client.isFixedScreen() ? 4 : 0;
						if (Client.instance.mouseX >= 228 + (Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 267) && Client.instance.mouseX <= 293 + (Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 267) && Client.instance.mouseY >= 13 - offset && Client.instance.mouseY <= 27)
						{
								Client.cacheSprite[572].drawSprite(224 + (Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 263), 9);
						}
						else
						{
								Client.cacheSprite[571].drawSprite(224 + (Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 263), 9);
						}
						if (Client.clickPositionUpdateRequired)
						{
								return;
						}
						if (Client.instance.saveClickX == Client.clickedX && Client.instance.saveClickY == Client.clickedY)
						{
								return;
						}
						int saveClickX = Client.instance.saveClickX;
						int saveClickY = Client.instance.saveClickY;
						if (Client.instance.clickMode2 == 1 && saveClickX >= 228 + (Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 267) && saveClickX <= 293 + (Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 267) && saveClickY >= 13 - offset && saveClickY <= 27)
						{
								Client.clickedX = Client.instance.saveClickX;
								Client.clickedY = Client.instance.saveClickY;
								Client.instance.sendCommandPacket("::togglezombieready");
						}
				}

		}

		static void drawShopSearch()
		{
				if (!Client.shopSearching)
				{
						return;
				}
				int x1 = Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 256;
				int y1 = Client.isFixedScreen() ? 0 : (Client.getClientHeight() / 2) - 267;
				Client.instance.newSmallFont.drawBasicString1(Client.capitalize(Client.shopString) + (Client.loopCycle % 40 < 20 ? "|" : ""), 350 + x1, 35 + y1, true, 0xffb000, false);
				if (System.currentTimeMillis() - Client.timeShopSearchSent > 100)
				{
						if (Client.shopStringSent.equals(Client.shopString))
						{
								return;
						}
						Client.shopStringSent = Client.shopString;
						String previous = Client.instance.inputString;
						Client.instance.inputString = "::shopsearch" + Client.shopString;
						Client.instance.stream.createFrame(103);
						Client.instance.stream.writeWordBigEndian(Client.instance.inputString.length() - 1);
						Client.instance.stream.writeString(Client.instance.inputString.substring(2));
						Client.instance.inputString = previous;
						Client.inputValue = -1;
						Client.timeShopSearchSent = System.currentTimeMillis();
				}

		}

		public static String combatDiffColor(int i, int j)
		{
				int k = i - j;
				if (k < -9)
						return "@red@";
				if (k < -6)
						return "@or3@";
				if (k < -3)
						return "@or2@";
				if (k < 0)
						return "@or1@";
				if (k > 9)
						return "@gre@";
				if (k > 6)
						return "@gr3@";
				if (k > 3)
						return "@gr2@";
				if (k > 0)
						return "@gr1@";
				else
						return "@yel@";
		}

		public static void drawBlackBox(int xPos, int yPos)
		{
				DrawingArea.drawPixels(71, yPos - 1, xPos - 2, 0x726451, 1);
				DrawingArea.drawPixels(69, yPos, xPos + 174, 0x726451, 1);
				DrawingArea.drawPixels(1, yPos - 2, xPos - 2, 0x726451, 178);
				DrawingArea.drawPixels(1, yPos + 68, xPos, 0x726451, 174);
				DrawingArea.drawPixels(71, yPos - 1, xPos - 1, 0x2E2B23, 1);
				DrawingArea.drawPixels(71, yPos - 1, xPos + 175, 0x2E2B23, 1);
				DrawingArea.drawPixels(1, yPos - 1, xPos, 0x2E2B23, 175);
				DrawingArea.drawPixels(1, yPos + 69, xPos, 0x2E2B23, 175);
				DrawingArea.method335(0, yPos, 174, 68, 220, xPos);
		}

		/**
		 * Delets a dir recursively deleting anything inside it.
		 * 
		 * @param dir
		 *        The dir to delete
		 * @return true if the dir was successfully deleted
		 */
		public static boolean deleteDirectory(File dir)
		{
				if (!dir.exists() || !dir.isDirectory())
				{
						return false;
				}
				String[] files = dir.list();
				for (int i = 0, len = files.length; i < len; i++)
				{
						File f = new File(dir, files[i]);
						if (f.isDirectory())
						{
								deleteDirectory(f);
						}
						else
						{
								f.delete();
						}
				}
				return dir.delete();
		}

		public static void deleteOldVersions()
		{
				String version = ClientConfiguration.CACHE_VERSION.substring(1);
				int version1 = Integer.parseInt(version);
				for (int i = 0; i < version1; i++)
				{
						File firstFolder = new File(ClientConstants.SHATTERSCAPE_CACHE_LOCATION + "/v" + i);
						deleteDirectory(firstFolder);
				}
				String version3 = ClientConfiguration.SPRITES_CACHE_VERSION.substring(1);
				int version2 = Integer.parseInt(version3);
				for (int i = 0; i < version2; i++)
				{
						File firstFolder = new File(ClientConstants.MAIN_CACHE_LOCATION + "cache_v" + i);
						deleteDirectory(firstFolder);
				}
		}

		public static void drawOnBankInterface()
		{
				// Only sent once per refresh, so not overusing resources at all.
				if (Client.getInterfaceDisplayed() == 24959)
				{
						if (RSInterface.interfaceCache[27000].message.equals("1"))
						{
								// Sent on bank opening etc, refresh tabs
								int tabs = Integer.parseInt(RSInterface.interfaceCache[27001].message); // # of tabs used
								int tab = Integer.parseInt(RSInterface.interfaceCache[27002].message); // current tab selected
								if (tab != Client.currentBankTab)
								{
										Client.scrollUp = true;
								}
								Client.currentBankTab = tab;
								for (int i = 0; i <= tabs; i++)
								{
										RSInterface.interfaceCache[22025 + i].sprite1 = Client.cacheSprite[391];
										RSInterface.interfaceCache[22025 + i].tooltip = "Click here to select tab " + (int) (i + 1);
								}
								for (int i = tabs + 1; i <= 8; i++)
								{
										RSInterface.interfaceCache[22024 + i].sprite1 = new Sprite("");
										RSInterface.interfaceCache[22024 + i].tooltip = "";
								}
								if (tabs != 8)
								{
										RSInterface.interfaceCache[22025 + tabs].sprite1 = Client.cacheSprite[392];
										RSInterface.interfaceCache[22025 + tabs].tooltip = "Drag an item here to create a new tab";
								}
								if (tab == -1) // searching
								{
										RSInterface.interfaceCache[22024].sprite1 = Client.cacheSprite[389];
								}
								else if (tab > 0)
								{
										RSInterface.interfaceCache[22024 + tab].sprite1 = Client.cacheSprite[390];
										RSInterface.interfaceCache[22024].sprite1 = Client.cacheSprite[389];
								}
								else
								{
										RSInterface.interfaceCache[22024].sprite1 = Client.cacheSprite[388];
								}
								RSInterface.interfaceCache[27000].message = "0";
						}
				}
		}

		public static void closeSearch(boolean toggleImage, boolean informServer)
		{
				if (!Client.searching)
				{
						return;
				}
				if (informServer)
				{
						Client.instance.sendCommandPacket("::stopsearch");
				}
				Client.searching = false;
				Client.promptInput = "";
				Client.bankSearchSent = "";
				Client.inputMessage = "";
				Client.setMessagePromptRaised(false);
				if (toggleImage)
				{
						Client.instance.anIntArray1045[116] = 0;
						if (Client.instance.variousSettings[116] != 0)
						{
								Client.instance.variousSettings[116] = 0;
								Client.instance.handleVarp(116);
								if (Client.instance.dialogId != -1)
								{
										Client.setInputTaken(true);
								}
						}
				}
		}

		public static void openSearch(String message)
		{
				Client.searching = true;
				Client.scrollUp = true;
				if (!Client.ignorePromptInputReset)
				{
						Client.promptInput = "";
						Client.bankSearchSent = "";
				}
				Client.inputMessage = message;
				Client.setMessagePromptRaised(true);
		}

		static void connectionLostAlert()
		{
				if (Client.contextMenu.equals("NEW"))
				{
						Client.cacheSprite[21].drawSprite(8, 9); // Connection lost, new version.
				}
				else
				{
						DrawingArea.fillPixels(2, 130, 22, 0xffffff, 2);
						DrawingArea.drawPixels(20, 3, 3, 0, 128);
						Client.instance.aTextDrawingArea_1271.drawText(0, "Connection lost", 18, 55);
						Client.instance.aTextDrawingArea_1271.drawText(0xffffff, "Connection lost", 17, 54);
				}
		}

		public static void sendQuickChat(String text)
		{
				String s = text;
				String icon = "<img=8>";
				int j2 = 0;
				Client.instance.stream.createFrame(4);
				Client.instance.stream.writeWordBigEndian(0);
				int j3 = Client.instance.stream.currentOffset;
				Client.instance.stream.method425(0);
				Client.instance.stream.method425(j2);
				Client.instance.aStream_834.currentOffset = 0;
				TextInput.method526(s, Client.instance.aStream_834); // Send to server.
				Client.instance.stream.method441(0, Client.instance.aStream_834.buffer, Client.instance.aStream_834.currentOffset);
				Client.instance.stream.writeBytes(Client.instance.stream.currentOffset - j3);
				TextInput.processText(s);
				String message = s;
				message = message.replace("<img=8>", "");
				Client.myPlayer.textSpoken = message;
				Client.myPlayer.textSpoken = Client.myPlayer.textSpoken;
				Client.myPlayer.spokenColor = j2;
				Client.myPlayer.spokenEffect = 0;
				Client.myPlayer.textCycle = 150;
				// Messages of the myself appearing in the chatbox.
				int rights = Client.myPlayer.privelage;
				Client.instance.pushMessage(icon + message, 2, PlayerRank.getIconText(rights) + PlayerTitle.quickChatString(Client.myPlayer));
				if (Client.instance.publicChatMode == 2)
				{
						Client.instance.publicChatMode = 3;
						Client.instance.stream.createFrame(95);
						Client.instance.stream.writeWordBigEndian(Client.instance.publicChatMode);
						Client.instance.stream.writeWordBigEndian(Client.instance.privateChatMode);
						Client.instance.stream.writeWordBigEndian(Client.instance.tradeMode);
				}
		}

		public static void updateMusicVolume()
		{
				switch (Client.musicVolume)
				{
						case 0:
								Client.musicEnabled = false;
								Client.instance.variousSettings[168] = 4;
								break;
						case 1:
								Music.setMidiVolume(64);
								Client.instance.variousSettings[168] = 3;
								break;
						case 2:
								Music.setMidiVolume(128);
								Client.instance.variousSettings[168] = 2;
								break;
						case 3:
								Music.setMidiVolume(192);
								Client.instance.variousSettings[168] = 1;
								break;
						case 4:
								Music.setMidiVolume(256);
								Client.instance.variousSettings[168] = 0;
								break;
				}
		}

}
