/**
 * Log-in screen.
 * @author MGT Madness, created on 12-01-2016.
 */
public class LogInScreen
{

		/**
		 * First page of log-in screen.
		 */
		public static void logInScreenFirstPage()
		{
				if (!Client.logInScreenPage.equals("FIRST"))
				{
						return;
				}
				//TODO #FULLSCREEN ADJUST log-in screen.
				int fullscreenXOffset = Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 375;
				int xHover = Client.isFixedScreen() ? Client.instance.mouseX : Client.instance.mouseX - (Client.getClientWidth() / 2) + 375;
				int yHover = Client.instance.mouseY;

				if (ClientConfiguration.FORCE_LOG_IN)
				{
						Client.logInScreenPage = "SECOND";
				}

				Client.cacheSprite[2].drawAdvancedSprite(0 + fullscreenXOffset, 0);

				// Log-in button.
				if (xHover >= ClientConstants.FIRST_LOG_IN_BOX_MOUSE_X_BEGIN && xHover <= ClientConstants.FIRST_LOG_IN_BOX_MOUSE_X_END && yHover >= ClientConstants.FIRST_LOG_IN_BOX_MOUSE_Y_BEGIN && yHover <= ClientConstants.FIRST_LOG_IN_BOX_MOUSE_Y_END)
				{
						Client.cacheSprite[5].drawAdvancedSprite(288 + fullscreenXOffset, 159);
						Client.cacheSprite[13].drawAdvancedSprite(359 + fullscreenXOffset, 166);
						if (Client.isWithInClicked(ClientConstants.FIRST_LOG_IN_BOX_MOUSE_X_BEGIN, ClientConstants.FIRST_LOG_IN_BOX_MOUSE_X_END, ClientConstants.FIRST_LOG_IN_BOX_MOUSE_Y_BEGIN, ClientConstants.FIRST_LOG_IN_BOX_MOUSE_Y_END, false))
						{
								Client.logInScreenPage = "SECOND";
						}
				}
				//ffe1be, colour of text hover.
				// Create account button.
				if (xHover >= 289 && xHover <= 475 && yHover >= 192 && yHover <= 216)
				{
						Client.cacheSprite[5].drawAdvancedSprite(288 + fullscreenXOffset, 190);
						Client.cacheSprite[14].drawAdvancedSprite(322 + fullscreenXOffset, 198);
						if (Client.isWithInClicked(289, 475, 192, 216, false))
						{
								Client.logInScreenPage = "SECOND";
						}
				}

				// Remember me hover.
				if (xHover >= 305 && xHover <= 452 && yHover >= 228 && yHover <= 248)
				{
						Client.cacheSprite[15].drawAdvancedSprite(306 + fullscreenXOffset, 229);
						if (Client.isWithInClicked(305, 452, 228, 248, false))
						{
								Client.rememberMe = !Client.rememberMe;
								Settings.saveSettings();
						}
				}
				if (Client.rememberMe)
				{
						Client.cacheSprite[4].drawAdvancedSprite(436 + fullscreenXOffset, 232);
				}

				// Standard detail.
				if (!Client.worldGraphicsMode.equals("MEDIUM"))
				{
						if (xHover >= ClientConstants.STANDARD_DETAIL_MOUSE_X_BEGIN && xHover <= ClientConstants.STANDARD_DETAIL_MOUSE_X_END && yHover >= ClientConstants.STANDARD_DETAIL_MOUSE_Y_BEGIN && yHover <= ClientConstants.STANDARD_DETAIL_MOUSE_Y_END)
						{
								Client.cacheSprite[9].drawAdvancedSprite(306 + fullscreenXOffset, 280);
								if (Client.isWithInClicked(ClientConstants.STANDARD_DETAIL_MOUSE_X_BEGIN, ClientConstants.STANDARD_DETAIL_MOUSE_X_END, ClientConstants.STANDARD_DETAIL_MOUSE_Y_BEGIN, ClientConstants.STANDARD_DETAIL_MOUSE_Y_END, false))
								{
										Client.worldGraphicsMode = "MEDIUM";
										Settings.saveSettings();
										Client.instance.sendFrame126("Detail: @gr3@Medium", 17383);
								}
						}
				}
				else
				{
						Client.cacheSprite[8].drawAdvancedSprite(306, 280);
				}

				// High detail.
				if (!Client.worldGraphicsMode.equals("HIGH"))
				{
						if (xHover >= ClientConstants.HIGH_DETAIL_MOUSE_X_BEGIN && xHover <= ClientConstants.HIGH_DETAIL_MOUSE_X_END && yHover >= ClientConstants.HIGH_DETAIL_MOUSE_Y_BEGIN && yHover <= ClientConstants.HIGH_DETAIL_MOUSE_Y_END)
						{
								Client.cacheSprite[12].drawAdvancedSprite(402 + fullscreenXOffset, 280);
								if (Client.isWithInClicked(ClientConstants.HIGH_DETAIL_MOUSE_X_BEGIN, ClientConstants.HIGH_DETAIL_MOUSE_X_END, ClientConstants.HIGH_DETAIL_MOUSE_Y_BEGIN, ClientConstants.HIGH_DETAIL_MOUSE_Y_END, false))
								{
										if (!Client.worldGraphicsMode.equals("HIGH"))
										{
												Client.worldGraphicsMode = "HIGH";
												Client.instance.sendFrame126("Detail: @gr3@High", 17383);
												Settings.saveSettings();
										}
								}
						}
				}
				else
				{
						Client.cacheSprite[11].drawAdvancedSprite(402 + fullscreenXOffset, 280);
				}


				// Graphics Options hover.
				if (xHover >= 316 && xHover <= 449 && yHover >= 262 && yHover <= 272)
				{
						Client.cacheSprite[16].drawAdvancedSprite(316 + fullscreenXOffset, 258);
				}

				// Audio Options hover.
				if (xHover >= 325 && xHover <= 439 && yHover >= 340 && yHover <= 352)
				{
						Client.cacheSprite[17].drawAdvancedSprite(326 + fullscreenXOffset, 337);
				}

				int musicVolumeX = 0;
				switch (Client.musicVolume)
				{
						case 0:
								musicVolumeX = 324;
								break;
						case 1:
								musicVolumeX = 346;
								break;
						case 2:
								musicVolumeX = 368;
								break;
						case 3:
								musicVolumeX = 390;
								break;
						case 4:
								musicVolumeX = 412;
								break;
				}
				if (Client.isWithInClicked(299, 343, 354, 380, false))
				{
						Client.musicVolume = 0;
						Client.musicEnabled = false;
						Music.stopMidi();
						Client.currentSong = -1;
						Client.instance.variousSettings[168] = 4;
						Settings.saveSettings();
				}
				else if (Client.isWithInClicked(344, 365, 354, 380, false))
				{
						Client.musicVolume = 1;
						Client.musicEnabled = true;
						Client.instance.variousSettings[168] = 3;
						Settings.saveSettings();
						Music.setMidiVolume(64);
						if (!Music.midiPlayer.playing())
						{
								Music.playLogInScreenMusic();
						}
				}
				else if (Client.isWithInClicked(366, 387, 354, 380, false))
				{
						Client.musicVolume = 2;
						Client.musicEnabled = true;
						Client.instance.variousSettings[168] = 2;
						Settings.saveSettings();
						Music.setMidiVolume(128);
						if (!Music.midiPlayer.playing())
						{
								Music.playLogInScreenMusic();
						}
				}
				else if (Client.isWithInClicked(388, 409, 354, 380, false))
				{
						Client.musicVolume = 3;
						Client.musicEnabled = true;
						Client.instance.variousSettings[168] = 1;
						Settings.saveSettings();
						Music.setMidiVolume(192);
						if (!Music.midiPlayer.playing())
						{
								Music.playLogInScreenMusic();
						}
				}
				else if (Client.isWithInClicked(410, 453, 354, 380, false))
				{
						Client.musicVolume = 4;
						Client.musicEnabled = true;
						Client.instance.variousSettings[168] = 0;
						Settings.saveSettings();
						Music.setMidiVolume(256);
						if (!Music.midiPlayer.playing())
						{
								Music.playLogInScreenMusic();
						}
				}
				Client.cacheSprite[95].drawAdvancedSprite(musicVolumeX + fullscreenXOffset, 355);

				// Quit hover.
				if (xHover >= 363 && xHover <= 399 && yHover >= 399 && yHover <= 409)
				{
						Client.cacheSprite[18].drawAdvancedSprite(365 + fullscreenXOffset, 397);
						if (Client.isWithInClicked(363, 399, 399, 409, false))
						{
								System.exit(0);
						}
				}

		}

		public static void logInScreenFirstPageAction()
		{
				if (!Client.logInScreenPage.equals("FIRST"))
				{
						return;
				}
				if (Client.isLoggedIn())
				{
						return;
				}
				do
				{
						int l1 = Client.instance.readChar(-796);
						if (l1 == -1)
						{
								break;
						}
						if (l1 == 9 || l1 == 10 || l1 == 13)
						{
								Client.logInScreenPage = "SECOND";
						}
				}
				while (true);
		}

		/**
		 * Second screen of log-in page.
		 * @param appendLogIn
		 * 			True to apply log-in with username and password action.
		 */
		public static void logInScreenSecondPage(boolean appendLogIn)
		{
				if (!Client.logInScreenPage.equals("SECOND"))
				{
						return;
				}
				//TODO #FULLSCREEN ADJUST log-in screen.
				int fullscreenXOffset = Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 375;
				int xHover = Client.isFixedScreen() ? Client.instance.mouseX : Client.instance.mouseX - (Client.getClientWidth() / 2) + 375;
				int yHover = Client.instance.mouseY;
				Client.cacheSprite[3].drawAdvancedSprite(0 + fullscreenXOffset, 0);

				if (ClientConfiguration.FORCE_LOG_IN)
				{
						if (appendLogIn)
						{
								Client.instance.login(Client.instance.myUsername, Client.instance.myPassword, false);
						}
				}

				// Username box.
				if (xHover >= 289 && xHover <= 473 && yHover >= 239 && yHover <= 273)
				{
						Client.cacheSprite[6].drawAdvancedSprite(288 + fullscreenXOffset, 237);
						if (Client.isWithInClicked(289, 473, 239, 273, false))
						{
								Client.instance.loginScreenCursorPos = 0;
						}
				}

				// Password box.
				if (xHover >= 289 && xHover <= 473 && yHover >= 307 && yHover <= 340)
				{
						Client.cacheSprite[6].drawAdvancedSprite(288 + fullscreenXOffset, 305);
						if (Client.isWithInClicked(289, 473, 307, 340, false))
						{
								Client.instance.loginScreenCursorPos = 1;
						}
				}

				// Log-in.
				if (xHover >= 355 && xHover <= 403 && yHover >= 354 && yHover <= 368)
				{
						Client.cacheSprite[20].drawAdvancedSprite(355 + fullscreenXOffset, 356);
						if (Client.isWithInClicked(355, 403, 354, 368, false) && appendLogIn)
						{
								appendLogIn();
						}
				}

				// Main menu.
				if (xHover >= 332 && xHover <= 420 && yHover >= 391 && yHover <= 402)
				{
						Client.cacheSprite[19].drawAdvancedSprite(334 + fullscreenXOffset, 390);
						if (Client.isWithInClicked(332, 420, 391, 402, false))
						{
								Client.logInScreenPage = "FIRST";
						}
				}


				Client.instance.newSmallFont.drawCenteredString("World 1", 380 + fullscreenXOffset, 190, 0x461E00, -1);
				// Error connecting to server text.
				Client.instance.newSmallFont.drawCenteredString(Client.instance.getLoginMessage1(), 381 + fullscreenXOffset, 205, 0xffe1be, 0x000000);

				// Username.
				Client.instance.aTextDrawingArea_1271.method389(false, 311 + fullscreenXOffset, 4595200, new StringBuilder().append("").append(Client.capitalize(Client.instance.myUsername)).append(((Client.instance.loginScreenCursorPos == 0 ? 1 : 0) & (Client.loopCycle % 40 < 20 ? 1 : 0)) != 0 ? "|" : "").toString(), 259);

				// Password.
				Client.instance.newSmallFont.drawBasicString1(new StringBuilder().append("").append(TextClass.passwordAsterisks(Client.instance.myPassword)).append(((Client.instance.loginScreenCursorPos == 1 ? 1 : 0) & (Client.loopCycle % 40 < 20 ? 1 : 0)) != 0 ? "|" : "").toString(), 311 + fullscreenXOffset, 327, 0x461e00, -1);

				if (appendLogIn)
				{
						DrawingArea.setAllPixelsToZero();
				}
		}

		/**
		 * Update username and password strings, trim, remove invalid characters etc..
		 */
		static void updateUsernameAndPassword()
		{
				do
				{
						int l1 = Client.instance.readChar(-796);
						if (l1 == -1)
						{
								break;
						}
						boolean validKey = false;
						for (int i2 = 0; i2 < Client.validUserPassChars.length(); i2++)
						{
								if (l1 != Client.validUserPassChars.charAt(i2))
								{
										continue;
								}
								validKey = true;
								break;
						}
						if (Client.instance.loginScreenCursorPos == 0)
						{
								if (l1 == 8 && Client.instance.myUsername.length() > 0)
								{
										Client.instance.myUsername = Client.instance.myUsername.substring(0, Client.instance.myUsername.length() - 1);
								}
								if (l1 == 9 || l1 == 10 || l1 == 13)
								{
										Client.instance.loginScreenCursorPos = 1;
								}
								if (validKey)
								{
										Client.instance.myUsername += (char) l1;
								}
								if (Client.instance.myUsername.length() > 12)
								{
										Client.instance.myUsername = Client.instance.myUsername.substring(0, 12);
								}
						}
						else if (Client.instance.loginScreenCursorPos == 1)
						{
								if (l1 == 8 && Client.instance.myPassword.length() > 0)
								{
										Client.instance.myPassword = Client.instance.myPassword.substring(0, Client.instance.myPassword.length() - 1);
								}
								if (l1 == 9 || l1 == 10 || l1 == 13)
								{
										Client.instance.login(Client.instance.myUsername, Client.instance.myPassword, false);
								}
								if (validKey)
								{
										Client.instance.myPassword += (char) l1;
								}
								if (Client.instance.myPassword.length() > 20)
								{
										Client.instance.myPassword = Client.instance.myPassword.substring(0, 20);
								}
						}
				}
				while (true);
		}

		/**
		 * Apply log-in action.
		 */
		private static void appendLogIn()
		{
				if (Client.isLoggedIn())
				{
						return;
				}
				if (Client.instance.myUsername.length() > 0 && Client.instance.myPassword.length() > 0)
				{
						Client.instance.setLoginMessage1("Connecting...");
						int fullscreenXOffset = Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 375;
						Client.instance.newSmallFont.drawCenteredString(Client.instance.getLoginMessage1(), 381 + fullscreenXOffset, 205, 0xffe1be, 0x000000);
						Client.instance.newSmallFont.drawCenteredString("World 1", 380 + fullscreenXOffset, 190, 0x461E00, -1);
						// Username.
						Client.instance.aTextDrawingArea_1271.method389(false, 311 + fullscreenXOffset, 4595200, new StringBuilder().append("").append(Client.capitalize(Client.instance.myUsername)).append(((Client.instance.loginScreenCursorPos == 0 ? 1 : 0) & (Client.loopCycle % 40 < 20 ? 1 : 0)) != 0 ? "|" : "").toString(), 259);
						// Password.
						Client.instance.newSmallFont.drawBasicString1(new StringBuilder().append("").append(TextClass.passwordAsterisks(Client.instance.myPassword)).append(((Client.instance.loginScreenCursorPos == 1 ? 1 : 0) & (Client.loopCycle % 40 < 20 ? 1 : 0)) != 0 ? "|" : "").toString(), 311 + fullscreenXOffset, 327, 0x461e00, -1);

						if (Client.instance.aRSImageProducer_1109 != null)
						{
								Client.instance.aRSImageProducer_1109.drawGraphics(0, Client.instance.graphics, 0);
						}
						Client.instance.login(Client.instance.myUsername, Client.instance.myPassword, false);
				}
				else
				{
						Client.instance.loginScreenCursorPos = 0;
						Client.instance.setLoginMessage1("Username & password must be more than 1 character");
				}
		}

}