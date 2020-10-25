/**
 * Display orbs.
 * @author MGT Madness.
 */
public class Orbs
{

		public static void drawQuestionMark()
		{
				if (!Client.is562GameFrame && !Client.is562PlusGameFrame)
				{
						return;
				}
				if (!Client.showQuestionMark)
				{
						return;
				}
				int xOffset = Client.isFixedScreen() ? 0 : Client.getClientWidth() - 266;
				int mouseX = Client.instance.mouseX - (Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 782));
				boolean clicked = Client.instance.clickMode2 == 1;
				boolean hovered = mouseX >= 723 && mouseX <= 742 && Client.instance.mouseY >= 0 && Client.instance.mouseY <= 20;

				Client.cacheSprite[hovered ? 79 : 78].drawSprite(207 + xOffset, 0);
				if (hovered && clicked)
				{
						Client.cacheSprite[77].drawSprite(207 + xOffset, 0);
				}
		}

		public static void drawWorldMap()
		{


				if (!Client.is508PlusGameFrame && !Client.is525GameFrame && !Client.is562GameFrame && !Client.is562PlusGameFrame)
				{
						return;
				}

				// TODO #FULLSCREEN ADJUST orbs world map
				int xOffset = Client.isFixedScreen() ? 0 : Client.getClientWidth() - 65;
				int yOffset = Client.isFixedScreen() ? 0 : 10;
				int mouseX = Client.instance.mouseX - (Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 782));
				int mouseY = Client.instance.mouseY;
				if (!Client.isFixedScreen())
				{
						mouseX -= 198;
						mouseY -= 10;
				}
				if (Client.is562GameFrame || Client.is525GameFrame || Client.is562PlusGameFrame)
				{
						if (Client.inCircle(521, 119, mouseX, mouseY, 20))
						{
								Client.cacheSprite[75].drawSprite(10 + xOffset, 123 + yOffset);
						}
						else
						{
								Client.cacheSprite[74].drawSprite(10 + xOffset, 123 + yOffset);
						}
				}
				else
				{
						Client.cacheSprite[76].drawSprite(10 + xOffset, 123 + yOffset);
				}
				if (!Client.isFixedScreen())
				{
						Client.cacheSprite[620].drawSprite(7 + xOffset, 129);
				}

		}

		public static void drawLogout()
		{
				if (Client.is474GameFrame && Client.isFixedScreen())
				{
						return;
				}
				// TODO #FULLSCREEN ADJUST orbs logout
				int xOffset = Client.isFixedScreen() ? 0 : Client.getClientWidth() - 266;
				int mouseX = Client.instance.mouseX - (Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 782));
				if (Client.is498GameFrame)
				{
						Client.logOutHover = mouseX >= 743 && mouseX <= 765 && Client.instance.mouseY >= 0 && Client.instance.mouseY <= 25;
				}
				else
				{
						Client.logOutHover = mouseX >= 745 && mouseX <= 765 && Client.instance.mouseY >= 0 && Client.instance.mouseY <= 21;
				}
				if ((Client.is562GameFrame || Client.is562PlusGameFrame) && !Client.old562GameFrame)
				{
						Client.cacheSprite[!Client.logOutHover ? 68 : 69].drawSprite(228 + xOffset, 0);
						if (Client.instance.clickMode2 == 1 && mouseX >= 745 && mouseX <= 765 && Client.instance.mouseY >= 0 && Client.instance.mouseY <= 20)
						{
								Client.cacheSprite[70].drawSprite(228 + xOffset, 0);
								Client.setTabId(10, true);
						}
				}
				else if (Client.is498GameFrame)
				{
						if (Client.logOutHover)
						{
								Client.cacheSprite[81].drawSprite(226 + xOffset, 1);
						}
						else
						{
								Client.cacheSprite[80].drawSprite(226 + xOffset, 1);
						}
						if (Client.instance.clickMode2 == 1 && mouseX >= 743 && mouseX <= 763 && Client.instance.mouseY >= 0 && Client.instance.mouseY <= 25)
						{
								Client.setTabId(10, false);
						}
				}
				else
				{

						if (!Client.isFixedScreen() && Client.is474GameFrame)
						{
								xOffset -= 2;
								Client.cacheSprite[633].drawSprite(226 + xOffset, 2);
								if (Client.instance.clickMode2 == 1 && mouseX >= 739 && mouseX <= 765 && Client.instance.mouseY >= 0 && Client.instance.mouseY <= 24)
								{
										Client.setTabId(10, true);
								}
								if (Client.getTabId() == 10)
								{
										Client.cacheSprite[634].drawSprite(226 + xOffset, 2);
										Client.setTabId(10, true);
								}
						}
						else
						{
								Client.cacheSprite[!Client.logOutHover ? 71 : 72].drawSprite(226 + xOffset, 0);
								if (Client.instance.clickMode2 == 1 && mouseX >= 745 && mouseX <= 765 && Client.instance.mouseY >= 0 && Client.instance.mouseY <= 21)
								{
										Client.cacheSprite[73].drawSprite(226 + xOffset, 0);
										Client.setTabId(10, true);
								}
						}
				}
		}

		private static int getOrbTextColor(int statusInt)
		{
				if (statusInt >= 75 && statusInt <= Integer.MAX_VALUE)
				{
						return 0x00FF00;
				}
				else if (statusInt >= 50 && statusInt <= 74)
				{
						return 0xFFFF00;
				}
				else if (statusInt >= 25 && statusInt <= 49)
				{
						return 0xFF981F;
				}
				else
				{
						return 0xFF0000;
				}
		}

		private static int getOrbFill(int statusInt)
		{
				if (statusInt <= Integer.MAX_VALUE && statusInt >= 97)
						return 0;
				else if (statusInt <= 96 && statusInt >= 93)
						return 1;
				else if (statusInt <= 92 && statusInt >= 89)
						return 2;
				else if (statusInt <= 88 && statusInt >= 85)
						return 3;
				else if (statusInt <= 84 && statusInt >= 81)
						return 4;
				else if (statusInt <= 80 && statusInt >= 77)
						return 5;
				else if (statusInt <= 76 && statusInt >= 73)
						return 6;
				else if (statusInt <= 72 && statusInt >= 69)
						return 7;
				else if (statusInt <= 68 && statusInt >= 65)
						return 8;
				else if (statusInt <= 64 && statusInt >= 61)
						return 9;
				else if (statusInt <= 60 && statusInt >= 57)
						return 10;
				else if (statusInt <= 56 && statusInt >= 53)
						return 11;
				else if (statusInt <= 52 && statusInt >= 49)
						return 12;
				else if (statusInt <= 48 && statusInt >= 45)
						return 13;
				else if (statusInt <= 44 && statusInt >= 41)
						return 14;
				else if (statusInt <= 40 && statusInt >= 37)
						return 15;
				else if (statusInt <= 36 && statusInt >= 33)
						return 16;
				else if (statusInt <= 32 && statusInt >= 29)
						return 17;
				else if (statusInt <= 28 && statusInt >= 25)
						return 18;
				else if (statusInt <= 24 && statusInt >= 21)
						return 19;
				else if (statusInt <= 20 && statusInt >= 17)
						return 20;
				else if (statusInt <= 16 && statusInt >= 13)
						return 21;
				else if (statusInt <= 12 && statusInt >= 9)
						return 22;
				else if (statusInt <= 8 && statusInt >= 7)
						return 23;
				else if (statusInt <= 6 && statusInt >= 5)
						return 24;
				else if (statusInt <= 4 && statusInt >= 3)
						return 25;
				else if (statusInt <= 2 && statusInt >= 1)
						return 26;
				else if (statusInt <= 0)
						return 27;
				return 0;
		}

		public static void drawSummoning()
		{
				boolean hover = false;
				if (!Client.summoningOrb && Client.is474PlusGameFrame)
				{
						return;
				}
				if (Client.disableSummoningOrb)
				{
						return;
				}

				// TODO #FULLSCREEN ADJUST orbs summoning
				int fullscreenXOffset = Client.isFixedScreen() ? 0 : Client.getClientWidth() - 367;
				int fullscreenYOffset = Client.isFixedScreen() ? 0 : 3;
				int mouseX = Client.instance.mouseX - (Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 782));

				int hoverMouseXBegin = Client.is474PlusGameFrame ? 563 : 690;
				int hoverMouseXEnd = Client.is474PlusGameFrame ? 616 : 746;
				int hoverMouseYBegin = Client.is474PlusGameFrame ? 137 : 127;
				int hoverMouseYEnd = Client.is474PlusGameFrame ? 164 : 160;

				if (!Client.isFixedScreen())
				{
						hoverMouseXBegin = 587;
						hoverMouseXEnd = 643;
						hoverMouseYBegin = 141;
						hoverMouseYEnd = 172;
						if (Client.is474PlusGameFrame)
						{
								hoverMouseXBegin += 28;
								hoverMouseXEnd += 28;
								hoverMouseYBegin += 17;
								hoverMouseYEnd += 17;
						}
				}
				if (mouseX >= hoverMouseXBegin && mouseX <= hoverMouseXEnd && Client.instance.mouseY >= hoverMouseYBegin && Client.instance.mouseY < hoverMouseYEnd)
				{
						hover = true;
				}

				int mainBackgroundNormalSpriteId = Client.is498GameFrame ? 39 : Client.is474PlusGameFrame ? 42 : 24;
				int mainBackgroundHoverSpriteId = Client.is498GameFrame ? 40 : Client.is474PlusGameFrame ? 44 : 30;
				int mainBackgroundX = Client.is498GameFrame ? 174 : Client.is474PlusGameFrame ? 46 : 174;
				mainBackgroundX += fullscreenXOffset;
				int mainBackgroundY = Client.is474PlusGameFrame ? 132 : 127;
				mainBackgroundY += fullscreenYOffset;
				if (hover && Client.is474PlusGameFrame && Client.isFixedScreen())
				{
						mainBackgroundX = 47;
						mainBackgroundY = 133;
				}
				// Background of the icon, either light green or white, depending on summoning status.
				int backgroundOfIconColourSpriteId = (Client.is562GameFrame || Client.is562PlusGameFrame || Client.is525GameFrame) ? 38 : 515;
				int backgroundOfIconX = Client.is474PlusGameFrame ? 74 : 177;
				backgroundOfIconX += fullscreenXOffset;
				int backgroundOfIconY = Client.is474PlusGameFrame ? 136 : 130;
				backgroundOfIconY += fullscreenYOffset;

				if (Client.showSummoningGlow)
				{
						backgroundOfIconColourSpriteId = 37;
				}
				int prayerIconSpriteId = 36;
				int prayerIconX = Client.is474PlusGameFrame ? 80 : 182;
				prayerIconX += fullscreenXOffset;
				int prayerIconY = Client.is474PlusGameFrame ? 141 : 136;
				prayerIconY += fullscreenYOffset;

				int textX = Client.is474PlusGameFrame ? 61 : 217;
				textX += fullscreenXOffset;
				int textY = Client.is474PlusGameFrame ? 159 : Client.is498GameFrame ? 155 : 153;
				textY += fullscreenYOffset;


				if (!Client.isFixedScreen())
				{
						mainBackgroundNormalSpriteId = Client.is474PlusGameFrame ? 630 : 624;
						mainBackgroundHoverSpriteId = Client.is474PlusGameFrame ? 631 : 625;
						mainBackgroundY += 10;
						backgroundOfIconX += 24;
						backgroundOfIconY += 10;
						prayerIconX += 25;
						prayerIconY += 10;
						textX -= 30;
						textY += 10;
						if (Client.is474PlusGameFrame)
						{
								mainBackgroundX += 153;
								mainBackgroundY += 11;
								backgroundOfIconX += 128;
								backgroundOfIconY += 10;
								prayerIconX += 127;
								prayerIconY += 10;
								textX += 182;
								textY += 10;
						}
				}


				// Main background.
				Client.cacheSprite[hover ? mainBackgroundHoverSpriteId : mainBackgroundNormalSpriteId].drawSprite(mainBackgroundX, mainBackgroundY);


				// Background of the icon, either light green or white, depending on summoning status.
				Client.cacheSprite[backgroundOfIconColourSpriteId].drawSprite(backgroundOfIconX, backgroundOfIconY);

				// Draw icon.
				Client.cacheSprite[prayerIconSpriteId].drawSprite(prayerIconX, prayerIconY);

				// Text
				Client.instance.smallText.method382(0x00FF00, textX, "99", textY, true);
		}

		public static void drawHitPoints()
		{
				int currentHP = 0;
				try
				{
						currentHP = Integer.parseInt(RSInterface.interfaceCache[19001].message);
				}
				catch (Exception e)
				{
				}

				// TODO #FULLSCREEN ADJUST orbs hitpoints
				int maxHP = Client.myPlayer.maxConstitution;
				int health = (int) (((double) currentHP / (double) maxHP) * 100D);

				int fullscreenXOffset = Client.isFixedScreen() ? 0 : Client.getClientWidth() - 266;
				int fullscreenYOffset = Client.isFixedScreen() ? 0 : 3;

				String orbFillSpriteId = Client.is474PlusGameFrame ? "2.png" : "1.png";

				int mainBackgroundSpriteId = Client.is474PlusGameFrame ? 42 : Client.is498GameFrame ? 39 : 24;
				if (!Client.isFixedScreen())
				{
						mainBackgroundSpriteId = Client.is474PlusGameFrame ? 630 : 624;
				}
				int mainBackgroundX = Client.is474PlusGameFrame ? -1 : 174;
				mainBackgroundX += fullscreenXOffset;
				int mainBackgroundY = Client.is474PlusGameFrame ? 41 : 14;
				if (!Client.isFixedScreen())
				{
						mainBackgroundX -= 133;
						mainBackgroundY += 22 + fullscreenYOffset;
						if (Client.is474PlusGameFrame)
						{
								mainBackgroundX += 173;
								mainBackgroundY -= 18;
						}
				}

				// Either green or red, depending on poison status.
				int backgroundOfIconColourSpriteId = Client.poisoned ? 41 : 25;
				if (Client.is474PlusGameFrame)
				{
						backgroundOfIconColourSpriteId = Client.poisoned ? 46 : 45;
				}
				int backgroundOfIconX = Client.is474PlusGameFrame ? 27 : 177;
				backgroundOfIconX += fullscreenXOffset;
				int backgroundOfIconY = Client.is474PlusGameFrame ? 46 : 17;

				if (!Client.isFixedScreen())
				{
						backgroundOfIconX -= 109;
						backgroundOfIconY += 23 + fullscreenYOffset;
						if (Client.is474PlusGameFrame)
						{
								backgroundOfIconX += 148;
								backgroundOfIconY -= 20;
						}
						else
						{
								if (Client.poisoned)
								{
										backgroundOfIconY--;
								}
						}
				}

				int hitpointsIconSpriteId = Client.is474PlusGameFrame ? 50 : Client.is562PlusGameFrame ? 43 : 26;
				int hitpointsIconX = Client.is474PlusGameFrame ? 32 : Client.is562PlusGameFrame ? 184 : 183;
				hitpointsIconX += fullscreenXOffset;
				int hitpointsIconY = Client.is474PlusGameFrame ? 53 : Client.is562PlusGameFrame ? 24 : 25;
				if (!Client.isFixedScreen())
				{
						hitpointsIconX -= 109;
						hitpointsIconY += 23 + fullscreenYOffset;
						if (Client.is474PlusGameFrame)
						{
								hitpointsIconX += 148;
								hitpointsIconY -= 20;
						}
				}

				int textX = Client.is474PlusGameFrame ? 14 : 217;
				textX += fullscreenXOffset;
				int textY = Client.is474PlusGameFrame ? 68 : Client.is498GameFrame ? 42 : 40;
				if (!Client.isFixedScreen())
				{
						textX -= 163;
						textY += 22 + fullscreenYOffset;
						if (Client.is474PlusGameFrame)
						{
								textX += 202;
								textY -= 19;
						}
				}

				// Orb fill modifying, this does not draw it on the screen.
				Client.cacheSprite[23] = new Sprite(Sprite.location + orbFillSpriteId, 27, getOrbFill((int) (health)));

				// Main background.
				Client.cacheSprite[mainBackgroundSpriteId].drawSprite(mainBackgroundX, mainBackgroundY);

				// Background of icon, it's either red or green, depending on poison status.
				Client.cacheSprite[backgroundOfIconColourSpriteId].drawSprite(backgroundOfIconX, backgroundOfIconY);

				// Orb fill, changes depending on hitpoints left.
				Client.cacheSprite[23].drawSprite(backgroundOfIconX, backgroundOfIconY);

				// Hitpoints icon.
				if (Client.loopCycle % 20 < 10 && health <= 20 || health > 20)
				{
						Client.cacheSprite[hitpointsIconSpriteId].drawSprite(hitpointsIconX, hitpointsIconY);
				}

				// Text.
				Client.instance.smallText.method382(getOrbTextColor(health), textX, "" + (Client.x10Damage ? currentHP * 10 : currentHP), textY, true);
		}

		public static void drawPrayerOrb()
		{
				int currentPrayerLevel = 0;
				int maximumPrayerLevel = 0;
				try
				{
						currentPrayerLevel = Integer.parseInt(RSInterface.interfaceCache[4012].message);
						maximumPrayerLevel = Integer.parseInt(RSInterface.interfaceCache[4013].message);
				}
				catch (Exception e)
				{

				}
				int prayerPercentage = (int) (((double) currentPrayerLevel / (double) maximumPrayerLevel) * 100D);
				// TODO #FULLSCREEN ADJUST orbs prayer
				int fullscreenXOffset = Client.isFixedScreen() ? 0 : Client.getClientWidth() - 266;
				int fullscreenYOffset = Client.isFixedScreen() ? 0 : 3;
				int mouseX = Client.instance.mouseX - (Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 782));
				int mouseY = Client.instance.mouseY;

				// Orb fill modifying, this does not draw it on the screen.
				Client.cacheSprite[23] = new Sprite(Sprite.location + (Client.is474PlusGameFrame ? "2.png" : "1.png"), 27, getOrbFill((int) (prayerPercentage)));


				int hoverMouseXBegin = Client.is474PlusGameFrame ? 517 : 706;
				int hoverMouseXEnd = Client.is474PlusGameFrame ? 572 : 762;
				int hoverMouseYBegin = Client.is474PlusGameFrame ? 85 : 54;
				int hoverMouseYEnd = Client.is474PlusGameFrame ? 119 : 86;
				if (Client.is474PlusGameFrame && Client.summoningOrb && Client.isFixedScreen())
				{
						hoverMouseYBegin = 75;
						hoverMouseYEnd = 108;
				}
				if (!Client.isFixedScreen())
				{
						hoverMouseXBegin -= 152;
						hoverMouseXEnd -= 152;
						hoverMouseYBegin += 18;
						hoverMouseYEnd += 18;
						if (Client.is474PlusGameFrame)
						{
								hoverMouseXBegin += 192;
								hoverMouseXEnd += 192;
								hoverMouseYBegin -= 11;
								hoverMouseYEnd -= 11;
						}
				}

				// Prayer hover mouse.
				Client.prayerHover = mouseX >= hoverMouseXBegin && mouseX <= hoverMouseXEnd && mouseY >= hoverMouseYBegin && mouseY <= hoverMouseYEnd;

				int mainBackgroundNormalSpriteId = Client.is498GameFrame ? 39 : Client.is474PlusGameFrame ? 42 : 24;
				int mainBackgroundHoverSpriteId = Client.is498GameFrame ? 40 : Client.is474PlusGameFrame ? 44 : 30;
				int mainBackgroundX = Client.is498GameFrame ? 190 : Client.is474PlusGameFrame ? -1 : 190;
				if (Client.is474PlusGameFrame && Client.prayerHover)
				{
						mainBackgroundX = 0;
				}
				mainBackgroundX += fullscreenXOffset;
				int mainBackgroundY = Client.is474PlusGameFrame ? 84 : 53;
				mainBackgroundY += fullscreenYOffset;
				if (Client.is474PlusGameFrame && Client.summoningOrb && Client.isFixedScreen())
				{
						mainBackgroundY = Client.prayerHover ? 75 : 74;
				}
				if (!Client.isFixedScreen())
				{
						mainBackgroundNormalSpriteId = Client.is474PlusGameFrame ? 630 : 624;
						mainBackgroundHoverSpriteId = 625;
						mainBackgroundX -= 152;
						mainBackgroundY += 17;
						if (Client.is474PlusGameFrame)
						{
								mainBackgroundNormalSpriteId = 630;
								mainBackgroundHoverSpriteId = 631;
								mainBackgroundX += 194;
								mainBackgroundY -= 12;
								if (Client.prayerHover)
								{
										mainBackgroundX -= 1;
								}
						}
				}

				// Either blue or white, depending on quick prayer status.
				int backgroundOfIconColourSpriteId = Client.is474PlusGameFrame ? 47 : 27;
				if (Client.getQuickPrayerOn())
				{
						backgroundOfIconColourSpriteId = Client.is474PlusGameFrame ? 51 : 28;
				}
				int backgroundOfIconX = Client.is474PlusGameFrame ? 27 : 194;
				backgroundOfIconX += fullscreenXOffset;
				int backgroundOfIconY = Client.is474PlusGameFrame ? 89 : 56;
				backgroundOfIconY += fullscreenYOffset;
				if (Client.is474PlusGameFrame && Client.summoningOrb && Client.isFixedScreen())
				{
						backgroundOfIconY = 79;
				}
				if (!Client.isFixedScreen())
				{
						backgroundOfIconX -= 129;
						backgroundOfIconY += 17;
						if (Client.is474PlusGameFrame)
						{
								backgroundOfIconX += 170;
								backgroundOfIconY -= 13;
						}
				}

				int prayerIconSpriteId = Client.is474PlusGameFrame ? 29 : (Client.is498GameFrame || Client.is508PlusGameFrame) ? 57 : 29;
				int prayerIconX = Client.is474PlusGameFrame ? 30 : (Client.is498GameFrame || Client.is508PlusGameFrame) ? 198 : 197;
				prayerIconX += fullscreenXOffset;
				int prayerIconY = Client.is474PlusGameFrame ? 92 : 60;
				prayerIconY += fullscreenYOffset;
				if (Client.is474PlusGameFrame && Client.summoningOrb && Client.isFixedScreen())
				{
						prayerIconY = 82;
				}
				if (!Client.isFixedScreen())
				{
						prayerIconX -= 128;
						prayerIconY += 17;
						if (Client.is474PlusGameFrame)
						{
								prayerIconX += 169;
								prayerIconY -= 13;
						}
				}


				int textX = Client.is474PlusGameFrame ? 14 : 234;
				textX += fullscreenXOffset;
				int textY = Client.is474PlusGameFrame ? 111 : 79;
				textY += fullscreenYOffset;
				if (Client.is474PlusGameFrame && Client.summoningOrb && Client.isFixedScreen())
				{
						textY = 101;
				}
				else if (Client.is498GameFrame)
				{
						textY = 81;
				}
				if (!Client.isFixedScreen())
				{
						textX -= 183;
						textY += 17;
						if (Client.is474PlusGameFrame)
						{
								textX += 224;
								textY -= 13;
						}
				}
				// Prayer hover or normal sprite drawing.
				Client.cacheSprite[Client.prayerHover ? mainBackgroundHoverSpriteId : mainBackgroundNormalSpriteId].drawSprite(mainBackgroundX, mainBackgroundY);

				// Background of icon, it's either blue or white, depending on quick prayer status.
				Client.cacheSprite[backgroundOfIconColourSpriteId].drawSprite(backgroundOfIconX, backgroundOfIconY);

				// Orb fill, changes depending on prayer points left.
				Client.cacheSprite[23].drawSprite(backgroundOfIconX, backgroundOfIconY);

				// Prayer icon.
				if (Client.loopCycle % 20 < 10 && currentPrayerLevel < (maximumPrayerLevel / 5) || currentPrayerLevel >= (maximumPrayerLevel / 5))
				{
						Client.cacheSprite[prayerIconSpriteId].drawSprite(prayerIconX, prayerIconY);
				}

				// Text.
				Client.instance.smallText.method382(getOrbTextColor(prayerPercentage), textX, "" + currentPrayerLevel, textY, true);
		}

		public static void drawRun()
		{
				String readCurrentRunEnergy = RSInterface.interfaceCache[149].message.replaceAll("%", "");
				int currentRunEnergy = Integer.parseInt(readCurrentRunEnergy);
				int maxRunEnergy = 100;
				int run = (int) (((double) currentRunEnergy / (double) maxRunEnergy) * 100D);
				// TODO #FULLSCREEN ADJUST orbs run
				int fullscreenXOffset = Client.isFixedScreen() ? 0 : Client.getClientWidth() - 407;
				int fullscreenYOffset = Client.isFixedScreen() ? 0 : 2;
				int mouseX = Client.instance.mouseX - (Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 782));

				// Run clicked status.
				Client.runClicked = Client.instance.anIntArray1045[173] == 1;

				int hoverMouseXBegin = Client.is474PlusGameFrame ? 541 : 706;
				int hoverMouseXEnd = Client.is474PlusGameFrame ? 592 : 762;
				int hoverMouseYBegin = Client.is474PlusGameFrame ? 122 : 95;
				int hoverMouseYEnd = Client.is474PlusGameFrame ? 153 : 124;
				if (Client.is474PlusGameFrame && Client.summoningOrb && Client.isFixedScreen())
				{
						hoverMouseXBegin = 530;
						hoverMouseXEnd = 580;
						hoverMouseYBegin = 112;
						hoverMouseYEnd = 141;
				}
				if (!Client.isFixedScreen())
				{
						hoverMouseXBegin -= 142;
						hoverMouseXEnd -= 142;
						hoverMouseYBegin += 13;
						hoverMouseYEnd += 13;
						if (Client.is474PlusGameFrame)
						{

								hoverMouseXBegin += 181;
								hoverMouseXEnd += 181;
								hoverMouseYBegin -= 5;
								hoverMouseYEnd -= 5;
						}
				}

				// Run hover mouse.
				Client.runHover = mouseX >= hoverMouseXBegin && mouseX <= hoverMouseXEnd && Client.instance.mouseY >= hoverMouseYBegin && Client.instance.mouseY <= hoverMouseYEnd;

				int mainBackgroundNormalSpriteId = Client.is498GameFrame ? 39 : Client.is474PlusGameFrame ? 42 : 24;
				int mainBackgroundHoverSpriteId = Client.is498GameFrame ? 40 : Client.is474PlusGameFrame ? 44 : 30;
				int mainBackgroundX = Client.is498GameFrame ? 190 : Client.is474PlusGameFrame ? 24 : 190;
				int mainBackgroundY = Client.is474PlusGameFrame ? 120 : 92;
				mainBackgroundX += fullscreenXOffset;
				mainBackgroundY += fullscreenYOffset;


				if (!Client.isFixedScreen())
				{
						mainBackgroundNormalSpriteId = Client.is474PlusGameFrame ? 630 : 624;
						mainBackgroundHoverSpriteId = 625;
				}
				if (Client.is474PlusGameFrame)
				{
						if (Client.runHover)
						{
								if (Client.summoningOrb && Client.isFixedScreen())
								{
										mainBackgroundX = 12;
								}
								else if (Client.isFixedScreen())
								{
										mainBackgroundX = 25;
								}
						}

						if (Client.summoningOrb && Client.isFixedScreen())
						{
								mainBackgroundX = 11;
								mainBackgroundY = 107;
						}
						else
						{
								mainBackgroundY = 120;
						}
				}
				if (!Client.isFixedScreen())
				{
						mainBackgroundY += 13;
				}
				if (Client.is508PlusGameFrame)
				{
						mainBackgroundNormalSpriteId = 411;
						mainBackgroundHoverSpriteId = 412;
						if (Client.runClicked)
						{
								mainBackgroundNormalSpriteId = 413;
								mainBackgroundHoverSpriteId = 414;
						}
				}

				if (Client.is474PlusGameFrame && !Client.isFixedScreen())
				{
						mainBackgroundNormalSpriteId = 630;
						mainBackgroundHoverSpriteId = 631;
						mainBackgroundX += 181;
						mainBackgroundY -= 4;
				}
				// Either yellow or light grey, depending on run clicked status.
				int backgroundOfIconColourSpriteId = Client.is474PlusGameFrame ? 48 : 33;
				int backgroundOfIconX = Client.is474PlusGameFrame ? 52 : 194;
				backgroundOfIconX += fullscreenXOffset;
				if (Client.runClicked)
				{
						backgroundOfIconColourSpriteId = Client.is474PlusGameFrame ? 49 : 34;
				}
				int backgroundOfIconY = Client.is474PlusGameFrame ? 125 : 95;
				backgroundOfIconY += fullscreenYOffset;
				if (Client.summoningOrb && Client.is474PlusGameFrame && Client.isFixedScreen())
				{
						backgroundOfIconX = 39;
						backgroundOfIconY = 112;
				}
				if (!Client.isFixedScreen())
				{
						backgroundOfIconX += 23;
						backgroundOfIconY += 13;
						if (Client.is474PlusGameFrame)
						{
								backgroundOfIconX += 157;
								backgroundOfIconY -= 7;
						}
				}
				// Either resting icon or normal running icon or clicked running icon.
				int iconSpriteId = Client.getResting() ? 35 : Client.runClicked ? 32 : 31;
				int iconX = Client.is474PlusGameFrame ? 59 : 200;
				int iconY = Client.is474PlusGameFrame ? 128 : 100;
				iconY += fullscreenYOffset;
				iconX += fullscreenXOffset;
				if (Client.summoningOrb && Client.is474PlusGameFrame && Client.isFixedScreen())
				{
						iconX = 46;
						iconY = 115;
				}
				if (Client.getResting())
				{
						if (Client.is474PlusGameFrame)
						{
								iconX -= 1;
						}
						else
						{
								iconX -= 1;
								iconY -= 1;
						}
				}
				if (!Client.isFixedScreen())
				{
						iconX += 23;
						iconY += 13;
						if (Client.is474PlusGameFrame)
						{
								iconX += 157;
								iconY -= 7;
						}
				}

				int textX = Client.is474PlusGameFrame ? 39 : Client.is498GameFrame ? 234 : 232;
				int textY = Client.is474PlusGameFrame ? 147 : Client.is498GameFrame ? 120 : 118;
				if (Client.is474PlusGameFrame && Client.summoningOrb && Client.isFixedScreen())
				{
						textX = 26;
						textY = 134;
				}
				textX += fullscreenXOffset;
				textY += fullscreenYOffset;
				if (!Client.isFixedScreen())
				{
						textX -= 28;
						textY += 13;

						if (Client.is474PlusGameFrame)
						{
								textX += 208;
								textY -= 7;
						}
				}

				// Orb fill, changes depending on run energy left.
				if (!Client.is508PlusGameFrame)
				{
						Client.cacheSprite[23] = new Sprite(Sprite.location + (Client.is474PlusGameFrame ? "2.png" : "1.png"), 27, getOrbFill((int) (run)));
				}
				// Main background.
				Client.cacheSprite[Client.runHover ? mainBackgroundHoverSpriteId : mainBackgroundNormalSpriteId].drawSprite(mainBackgroundX, mainBackgroundY);

				// Background of the icon.
				if (!Client.is508PlusGameFrame)
				{
						Client.cacheSprite[backgroundOfIconColourSpriteId].drawSprite(backgroundOfIconX, backgroundOfIconY);
				}

				// Orb fill, changes depending on run energy left.
				if (!Client.is508PlusGameFrame)
				{
						Client.cacheSprite[23].drawSprite(backgroundOfIconX, backgroundOfIconY);
						Client.cacheSprite[iconSpriteId].drawSprite(iconX, iconY);
				}
				Client.instance.smallText.method382(getOrbTextColor(run), textX, Integer.toString(currentRunEnergy), textY, true);
		}


		public static void experienceOrbButtonAndHover()
		{
				if (!Client.experienceOrb)
				{
						return;
				}
				//TODO #FULLSCREEN ADJUST orbs xp orb clicking and right clicking
				int x = Client.instance.mouseX;
				int y = Client.instance.mouseY;
				int mouseX = Client.instance.mouseX - (Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 782));
				x = mouseX;

				if (!Client.isFixedScreen())
				{
						x -= 33;
						y += 44;
						if (Client.is474GameFrame)
						{
								x -= 5;
								y -= 47;
						}
				}
				if (Client.is474GameFrame && Client.osrsXpOrb ? Client.inCircle(516, 22, x, y, 17) : Client.inCircle(518, 47, x, y, 17))
				{
						if (Client.is474GameFrame)
						{
								//481 show total
								//473 show session
								if (Client.xpBarShowType.equals("SESSION"))
								{
										Client.instance.menuActionName[4] = Client.counterOn ? "Off" : "On";
										Client.instance.menuActionID[4] = 474;
										Client.instance.menuActionName[3] = "Reset session";
										Client.instance.menuActionID[3] = 475;
										Client.instance.menuActionName[2] = "Show combat";
										Client.instance.menuActionID[2] = 480;
										Client.instance.menuActionName[1] = "Show total";
										Client.instance.menuActionID[1] = 481;
										Client.instance.menuActionName[0] = Client.osrsXpOrbMiddle ? "Switch to right" : "Switch to middle";
										Client.instance.menuActionID[0] = 476;
										Client.instance.menuActionRow = 5;
								}
								else if (Client.xpBarShowType.equals("TOTAL"))
								{
										Client.instance.menuActionName[3] = Client.counterOn ? "Off" : "On";
										Client.instance.menuActionID[3] = 474;
										Client.instance.menuActionName[2] = "Show combat";
										Client.instance.menuActionID[2] = 480;
										Client.instance.menuActionName[1] = "Show session";
										Client.instance.menuActionID[1] = 473;
										Client.instance.menuActionName[0] = Client.osrsXpOrbMiddle ? "Switch to right" : "Switch to middle";
										Client.instance.menuActionID[0] = 476;
										Client.instance.menuActionRow = 4;
								}
								else if (Client.xpBarShowType.equals("COMBAT"))
								{
										Client.instance.menuActionName[3] = Client.counterOn ? "Off" : "On";
										Client.instance.menuActionID[3] = 474;
										Client.instance.menuActionName[2] = "Show total";
										Client.instance.menuActionID[2] = 481;
										Client.instance.menuActionName[1] = "Show session";
										Client.instance.menuActionID[1] = 473;
										Client.instance.menuActionName[0] = Client.osrsXpOrbMiddle ? "Switch to right" : "Switch to middle";
										Client.instance.menuActionID[0] = 476;
										Client.instance.menuActionRow = 4;
								}
						}
						else
						{
								if (Client.xpBarShowType.equals("SESSION"))
								{
										Client.instance.menuActionName[3] = Client.counterOn ? "Off" : "On";
										Client.instance.menuActionID[3] = 474;
										Client.instance.menuActionName[2] = "Reset session";
										Client.instance.menuActionID[2] = 475;
										Client.instance.menuActionName[1] = "Show combat";
										Client.instance.menuActionID[1] = 480;
										Client.instance.menuActionName[0] = "Show total";
										Client.instance.menuActionID[0] = 481;
										Client.instance.menuActionRow = 4;
								}
								else if (Client.xpBarShowType.equals("TOTAL"))
								{
										Client.instance.menuActionName[2] = Client.counterOn ? "Off" : "On";
										Client.instance.menuActionID[2] = 474;
										Client.instance.menuActionName[1] = "Show combat";
										Client.instance.menuActionID[1] = 480;
										Client.instance.menuActionName[0] = "Show session";
										Client.instance.menuActionID[0] = 473;
										Client.instance.menuActionRow = 3;
								}
								else if (Client.xpBarShowType.equals("COMBAT"))
								{
										Client.instance.menuActionName[2] = Client.counterOn ? "Off" : "On";
										Client.instance.menuActionID[2] = 474;
										Client.instance.menuActionName[1] = "Show total";
										Client.instance.menuActionID[1] = 481;
										Client.instance.menuActionName[0] = "Show session";
										Client.instance.menuActionID[0] = 473;
										Client.instance.menuActionRow = 3;
								}
						}
				}
		}

		public static void drawExperienceCounterBar()
		{
				if (!Client.experienceOrb)
				{
						return;
				}
				if (!Client.counterOn)
				{
						return;
				}
				// TODO #FULLSCREEN ADJUST orbs xp orb
				int xOffset = Client.isFixedScreen() ? 0 : Client.getClientWidth() - 743;
				int xModified1 = Client.osrsXpOrbMiddle ? -90 : 0;
				int xModified2 = Client.osrsXpOrbMiddle ? -136 : -11;
				int x = 500 + xOffset;
				int y = 46;
				if (!Client.isFixedScreen())
				{
						y -= 42;
				}
				boolean extended = Client.xpCounter > 100000000;
				int lengthToRemove = Integer.toString(Client.xpCounter).length();
				int i = Client.instance.aTextDrawingArea_1271.getTextWidth(Integer.toString(Client.currentXPTotal)) - Client.instance.aTextDrawingArea_1271.getTextWidth(Integer.toString(Client.currentXPTotal)) / 2;
				int a = lengthToRemove == 1 ? 5 : ((lengthToRemove - 1) * 5);
				if (Client.is474GameFrame && !Client.summoningOrb)
				{
						y = 65;
				}
				else if (Client.is474GameFrame && Client.summoningOrb)
				{
						y = 60;
				}

				if (Client.osrsXpOrb && Client.is474GameFrame)
				{
						x = 483 + xModified1;
						y = -6;
				}
				if (!Client.isFixedScreen() && Client.is474GameFrame)
				{
						x += xOffset;
				}

				for (int m = 0; m < Client.xpDropsToDisplay.size(); m++)
				{
						int currentIndex = m;
						//when parsin[] 0 is currentXp, 1 is xpAddedPos, 2 is xpFloatingTime
						String[] parse = Client.xpDropsToDisplay.get(currentIndex).split(" ");
						int currentXp = Integer.parseInt(parse[0]);
						int xpAddedPos = Integer.parseInt(parse[1]);
						long xpFloatingTime = Long.parseLong(parse[2]);
						// Start of xp drop.
						if (currentXp > 0)
						{
								if (!Client.osrsXpOrb && !Client.is474GameFrame)
								{
										Client.cacheSprite[134].drawSprite(x - 80, y + 18 + xpAddedPos);
								}
								a = Client.instance.smallText.getTextWidth("" + Client.formatNumber(currentXp) + (Client.osrsXpOrb && Client.is474GameFrame ? "" : "xp"));
								String skillString = "";
								String[] getSkillStringFromMain = null;
								getSkillStringFromMain = Client.xpDropsToDisplay.get(currentIndex).split("-");
								if (Client.osrsXpOrb && Client.is474GameFrame)
								{
										// Xp number being drawn.
										String[] fullListParse = getSkillStringFromMain[1].split(" ");
										for (int index = fullListParse.length - 1; index > -1; index--)
										{
												skillString = skillString + (skillString.isEmpty() ? "" : " ") + fullListParse[index];
										}
										int textSpace = 0;
										int iconSpace = 0;
										if (currentXp <= 9)
										{
												textSpace = 6;
												iconSpace = 4;
										}
										else if (currentXp <= 99)
										{
												textSpace = 3;
												iconSpace = 1;
										}
										else if (currentXp <= 999)
										{
												textSpace = -1;
												iconSpace = -4;
										}
										else if (currentXp <= 9999)
										{
												textSpace = -7;
												iconSpace = -10;
										}
										else if (currentXp <= 99999)
										{
												textSpace = -11;
												iconSpace = -14;
										}
										else if (currentXp <= 999999)
										{
												textSpace = -15;
												iconSpace = -18;
										}

										Client.instance.newRegularFont.drawBasicString1(Client.formatNumber(currentXp), x + 26 + xModified2 + textSpace, y + 50 + xpAddedPos, true, 0xffffff, true);
										for (int index = fullListParse.length - 1; index > -1; index--)
										{
												int skillId = Integer.parseInt(fullListParse[index]);
												int xAdd = (index + 1) * 25;
												int space = fullListParse.length * 25;
												int xSkillOffset = 0;
												int ySkillOffset = 0;
												// Combat only skills.
												if (skillId <= 6)
												{
														if (skillId == 2)
														{
																xSkillOffset = 5;
														}
														else if (skillId == 0)
														{
																ySkillOffset = -3;
																if (skillString.contains("3 2 1 0"))
																{
																		xSkillOffset += 6;
																}
														}
														else if (skillId == 1)
														{
																ySkillOffset = 2;
																xSkillOffset = 4;
																if (skillString.contains("3 2 1 0"))
																{
																		xSkillOffset += 4;
																}
														}
												}

												Client.cacheSprite[ClientConstants.SKILL_ID_TO_SPRITE[skillId]].drawSprite(x + iconSpace + xModified2 + textSpace + xAdd - space - 9 + xSkillOffset, y + 37 + xpAddedPos + ySkillOffset);
										}
								}
								else
								{
										Client.instance.smallText.method389(true, x - a + 4, 0xb86b0b, "" + Client.formatNumber(currentXp) + "xp", y + 39 + xpAddedPos);
								}

								//when parsin[] 0 is currentXp, 1 is xpAddedPos, 2 is xpFloatingTime

								if (Client.osrsXpOrb && Client.is474GameFrame)
								{
										if (xpAddedPos > 0)
										{
												xpAddedPos -= 1;
										}
								}
								else
								{
										if (xpAddedPos < 56)
										{
												xpAddedPos += 1;
										}
								}
								boolean removed = false;
								if (xpAddedPos == (Client.osrsXpOrb && Client.is474GameFrame ? 0 : 56))
								{
										if (xpFloatingTime == 0)
										{
												xpFloatingTime = System.currentTimeMillis();
										}
										if (Client.osrsXpOrb && Client.is474GameFrame)
										{
												if (xpAddedPos == 0)
												{
														xpAddedPos = 0;
														currentXp = 0;
														xpFloatingTime = 0;
														removed = true;
												}
										}
										else
										{
												if (System.currentTimeMillis() - xpFloatingTime > 800)
												{
														xpAddedPos = 0;
														currentXp = 0;
														xpFloatingTime = 0;
														removed = true;

												}
										}
								}
								if (removed)
								{
										Client.xpDropsToDisplay.remove(currentIndex);
										currentIndex--;
								}
								else
								{
										Client.xpDropsToDisplay.remove(currentIndex);
										int newIndex = currentIndex;
										if (currentIndex >= 1)
										{
												newIndex--;
										}
										Client.xpDropsToDisplay.add(newIndex, currentXp + " " + xpAddedPos + " " + xpFloatingTime + " -" + getSkillStringFromMain[1]);
								}
						}
				}
				// End of xp drop.

				if (Client.osrsXpOrb && Client.is474GameFrame)
				{
						Client.cacheSprite[55].drawSprite3(x - 93 + xModified1, y + 8, 220);
						Client.cacheSprite[56].draw24BitSprite(x - 91 + xModified1, y + 11);
				}
				else
				{
						// If current xp is more than 100m, show the extending xp bar sprite.
						if (extended)
						{
								Client.cacheSprite[410].drawSprite(x - 104, y + 8);
						}
						else
						{
								Client.cacheSprite[133].drawSprite(x - 93, y + 8);
						}
				}
				if (Client.xpCounter < 0)
				{
						Client.xpCounter = 0;
				}
				if (!Client.is474GameFrame)
				{
						if (extended)
						{
								Client.instance.newRegularFont.drawBasicString1("XP:", x - 89, y + 21, true, 0xFFFFFD, true);
						}
						else
						{
								Client.instance.newRegularFont.drawBasicString1("XP:", x - 78, y + 21, true, 0xFFFFFD, true);
						}
				}
				int positionX = x - 1 - i;
				int positionY = y + 21;
				if (Client.osrsXpOrb && Client.is474GameFrame)
				{
						positionX = x + 22 - i;
						positionY = y + 26;
				}
				if (Client.xpCounter <= Integer.MAX_VALUE)
				{
						if (Client.osrsXpOrb && Client.is474GameFrame)
						{
								Client.instance.newRegularFont.drawBasicString1(Client.formatNumber(Client.xpCounter), positionX + xModified1 - 3, positionY, true, 0xFFFFFD, true); //CHANGE TO BOLD
						}
						else
						{
								Client.instance.aTextDrawingArea_1271.method382(0xFFFFFD, positionX, Client.formatNumber(Client.xpCounter), positionY, true);
						}
						Client.currentXPTotal = Client.xpCounter;
				}
		}


		public static void drawExperienceCounterOrb()
		{
				if (!Client.experienceOrb)
				{
						return;
				}
				int x;
				int y;
				// TODO #FULLSCREEN ADJUST orbs xp counter
				int xOffset = Client.isFixedScreen() ? 0 : Client.getClientWidth() - 232;
				int yOffset = Client.isFixedScreen() ? 0 : -44;
				if (!Client.isFixedScreen() && Client.is474GameFrame)
				{
						xOffset += 4;
						yOffset += 49;
				}
				int mouseX = Client.instance.mouseX - (Client.isFixedScreen() ? 0 : (Client.getClientWidth() - 782));
				int mouseY = Client.instance.mouseY;
				x = 1 + xOffset;
				y = 47 + yOffset;
				if (!Client.isFixedScreen())
				{
						mouseX -= 33;
						mouseY += 46;
						if (Client.is474GameFrame)
						{
								mouseX -= 5;
								mouseY -= 49;
						}

				}
				if (Client.osrsXpOrb && Client.is474GameFrame)
				{
						y += -25;
						if (Client.inCircle(516, 22, mouseX, mouseY, 14))
						{
								Client.cacheSprite[54].drawSprite(x, y);
						}
						else
						{
								Client.cacheSprite[53].drawSprite(x, y);
						}
				}
				else if (!Client.is474GameFrame)
				{
						Client.cacheSprite[Client.inCircle(518, 47, mouseX, mouseY, 17) ? 132 : 131].drawSprite(x, y);
				}
		}
}