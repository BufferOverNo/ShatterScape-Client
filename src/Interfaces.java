public class Interfaces
{


		public static void customInterfaces(TextDrawingArea textDrawingAreas[])
		{
				jewelry(textDrawingAreas);
				runePouch(textDrawingAreas);
				enchantBolts(textDrawingAreas);
				clientSettings(textDrawingAreas);
				clientSettings1(textDrawingAreas);
				clientSettings2(textDrawingAreas);
				clientSettings3(textDrawingAreas);
				equipmentScreenBank(textDrawingAreas);
				bankInterface(textDrawingAreas);
				itemsOnDeathDATA(textDrawingAreas);
				itemsOnDeath(textDrawingAreas);
				normalPrayerBook(textDrawingAreas);
				wildernessInterface(textDrawingAreas);
				wildernessInterface1(textDrawingAreas);
				barrowsInterface(textDrawingAreas);
				weaponTracker(textDrawingAreas);
				trade(textDrawingAreas);
				tournamentLobby(textDrawingAreas);
				Client.instance.drawLoadingText(682, Client.loadingGameString);
				shop(textDrawingAreas);
				emoteTab();
				if (Client.clientRevision("474") || Client.clientRevision("525"))
				{
						skillTab474(RSInterface.fonts);
				}
				else
				{

						skillTab(RSInterface.fonts);
				}
				equipmentTab(textDrawingAreas);
				optionTab(textDrawingAreas);
				clanChatTab(textDrawingAreas);
				combatInterfaces(textDrawingAreas);
				friendsTab(textDrawingAreas);
				ignoreTab(textDrawingAreas);
				equipmentScreen(textDrawingAreas);
				modernSpellBook(textDrawingAreas);
				ancientMagicTab(textDrawingAreas);
				ancientMagicTab1(textDrawingAreas);
				ancientMagicTab2(textDrawingAreas);
				configureLunar(textDrawingAreas);
				questTabOld(textDrawingAreas);
				achievementOpenedInterface(textDrawingAreas);
				achievementRewards(textDrawingAreas);
				profileInterface(textDrawingAreas);
				profileInterface1(textDrawingAreas);
				profileInterface2(textDrawingAreas);
				profileInterface3(textDrawingAreas);
				profileInterface4(textDrawingAreas);
				Client.instance.drawLoadingText(724, Client.loadingGameString);
				gwdInterface(textDrawingAreas);
				quickSetUpInterface(textDrawingAreas);
				if (!Client.clientRevision("474"))
				{
						levelUpInterface(textDrawingAreas);
				}
				quickPrayers(textDrawingAreas);
				questInterface(textDrawingAreas);
				gameMode(textDrawingAreas);
				highscoresInterface1(textDrawingAreas);
				completionistCape(textDrawingAreas);
				lootingBag(textDrawingAreas);
				titleInterface(textDrawingAreas);
				clanChatSetUp(textDrawingAreas);
				teleportInterface(textDrawingAreas);
				hallOfFame(textDrawingAreas);
				resizableSettings(textDrawingAreas);
				zombieInterface(textDrawingAreas);
				zombieReadyInterface(textDrawingAreas);
				npcDropTable(textDrawingAreas);
				guideInterface(textDrawingAreas);
				interfaceResizableClicking(textDrawingAreas);
				pvpBlacklist(textDrawingAreas);
		}

		private static void tournamentLobby(TextDrawingArea[] textDrawingAreas)
		{
				int interfaceId = 25980;
				RSInterface interfaces = RSInterface.addInterface(interfaceId);
				interfaceId++;
				RSInterface.setChildren(3, interfaces);
				int child = 0;
				int xOffset = 356;
				int yOffset = -21;

				RSInterface.addSprite(interfaceId, 724); // Background.
				RSInterface.setBounds(interfaceId, 51 + xOffset, 24 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Lobby:", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 57 + xOffset, 30 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Tournament:", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 57 + xOffset, 44 + yOffset, child, interfaces);
				interfaceId++;
				child++;
		}

		private static void interfaceResizableClicking(TextDrawingArea[] textDrawingAreas)
		{
				int interfaceId = 0;
				// Deposit box interface.
				interfaceId = 4465;
				RSInterface.interfaceCache[interfaceId].interfaceStartX = 87;
				RSInterface.interfaceCache[interfaceId].interfaceEndX = 449;
				RSInterface.interfaceCache[interfaceId].interfaceStartY = 23;
				RSInterface.interfaceCache[interfaceId].interfaceEndY = 269;

				// Quest interface.
				interfaceId = 25000;
				RSInterface.interfaceCache[interfaceId].interfaceStartX = 21;
				RSInterface.interfaceCache[interfaceId].interfaceEndX = 498;
				RSInterface.interfaceCache[interfaceId].interfaceStartY = 15;
				RSInterface.interfaceCache[interfaceId].interfaceEndY = 327;

				// Xp lamp interface.
				interfaceId = 2808;
				RSInterface.interfaceCache[interfaceId].interfaceStartX = 85;
				RSInterface.interfaceCache[interfaceId].interfaceEndX = 504;
				RSInterface.interfaceCache[interfaceId].interfaceStartY = 12;
				RSInterface.interfaceCache[interfaceId].interfaceEndY = 290;

				// First duel arena interface.
				interfaceId = 6575;
				RSInterface.interfaceCache[interfaceId].interfaceStartX = 15;
				RSInterface.interfaceCache[interfaceId].interfaceEndX = 504;
				RSInterface.interfaceCache[interfaceId].interfaceStartY = 20;
				RSInterface.interfaceCache[interfaceId].interfaceEndY = 331;

				// Second duel arena interface.
				interfaceId = 6412;
				RSInterface.interfaceCache[interfaceId].interfaceStartX = 15;
				RSInterface.interfaceCache[interfaceId].interfaceEndX = 502;
				RSInterface.interfaceCache[interfaceId].interfaceStartY = 24;
				RSInterface.interfaceCache[interfaceId].interfaceEndY = 322;
		}

		private static void zombieReadyInterface(TextDrawingArea[] textDrawingAreas)
		{
				int interfaceId = 20240;
				RSInterface interfaces = RSInterface.addInterface(interfaceId);
				interfaceId++;
				RSInterface.setChildren(4, interfaces);
				int child = 0;
				int xOffset = 184;
				int yOffset = -21;

				RSInterface.addSprite(interfaceId, 643); // Background.
				RSInterface.setBounds(interfaceId, 1 + xOffset, 24 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 7 + xOffset, 50 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 7 + xOffset, 64 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Ready", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 57 + xOffset, 32 + yOffset, child, interfaces);
				interfaceId++;
				child++;
		}

		private static void zombieInterface(TextDrawingArea[] textDrawingAreas)
		{
				int interfaceId = 20230;
				RSInterface interfaces = RSInterface.addInterface(interfaceId);
				interfaceId++;
				RSInterface.setChildren(4, interfaces);
				int child = 0;
				int xOffset = 356;
				int yOffset = -21;

				RSInterface.addSprite(interfaceId, 642); // Background.
				RSInterface.setBounds(interfaceId, 51 + xOffset, 24 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 57 + xOffset, 30 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 57 + xOffset, 44 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 57 + xOffset, 58 + yOffset, child, interfaces);
				interfaceId++;
				child++;
		}


		private static void resizableSettings(TextDrawingArea[] textDrawingAreas)
		{

				int interfaceId = 20200;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 181, 369, 78, 259);
				interfaceId++;
				RSInterface.setChildren(14, interfaces);
				int child = 0;
				int xOffset = 175;
				int yOffset = 53;

				RSInterface.addSprite(interfaceId, 641); // Background.
				RSInterface.setBounds(interfaceId, 2 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;
				RSInterface.addText(interfaceId, "Resizable Settings", textDrawingAreas, 2, ClientConstants.YELLOW, true);
				RSInterface.setBounds(interfaceId, 97 + xOffset, 30 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 639, 640, 54, 46, "Toggle");
				RSInterface.setSpriteClicked(interfaceId, 640);
				RSInterface.setBounds(interfaceId, 205, 70 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 205, 70 + yOffset, child, interfaces);
				child++;
				interfaceId += 3;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 637, 638, 54, 46, "Toggle");
				RSInterface.setSpriteClicked(interfaceId, 638);
				RSInterface.setBounds(interfaceId, 285, 70 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 285, 70 + yOffset, child, interfaces);
				child++;
				interfaceId += 3;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 342, 343, 122, 24, "Toggle");
				RSInterface.setBounds(interfaceId, 211, 125 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 211, 125 + yOffset, child, interfaces);
				child++;
				interfaceId += 3;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 342, 343, 122, 24, "Toggle");
				RSInterface.setBounds(interfaceId, 211, 160 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 211, 160 + yOffset, child, interfaces);
				child++;
				interfaceId += 3;

				RSInterface.addText(interfaceId, "Landscape tab", textDrawingAreas, 1, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 53 + xOffset, 130 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Hide tab", textDrawingAreas, 1, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 75 + xOffset, 165 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 166 + xOffset, 29 + yOffset, child, interfaces);
				RSInterface.setBounds(interfaceId + 1, 166 + xOffset, 29 + yOffset, child + 1, interfaces);
				child += 2;
				interfaceId += 3;
		}

		private static void guideInterface(TextDrawingArea[] textDrawingAreas)
		{

				int interfaceId = 22550;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 84, 460, 14, 320);
				interfaceId++;
				RSInterface.setChildren(19, interfaces);
				int child = 0;
				int xOffset = 78;
				int yOffset = -10;

				RSInterface.addSprite(interfaceId, 646); // Background.
				RSInterface.setBounds(interfaceId, 2 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "ShatterScape Guide", textDrawingAreas, 2, ClientConstants.YELLOW, true);
				RSInterface.setBounds(interfaceId, 205 + xOffset, 30 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 355 + xOffset, 30 + yOffset, child, interfaces);
				RSInterface.setBounds(interfaceId + 1, 355 + xOffset, 30 + yOffset, child + 1, interfaces);
				child += 2;
				interfaceId += 3;

				int yExtra = 0;
				int xExtra = 25;
				for (int index = 0; index < 14; index++)
				{
						RSInterface.addText(interfaceId, "", textDrawingAreas, 1, ClientConstants.ORANGE, false);
						RSInterface.setBounds(interfaceId, 115 + xExtra + xOffset, 63 + yOffset + yExtra, child, interfaces);
						interfaceId++;
						child++;

						yExtra += 18;
				}

				RSInterface scrollTab1 = RSInterface.addInterface(interfaceId);
				RSInterface.setBounds(interfaceId, 14 + xOffset, 58 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				scrollTab1.width = 101;
				scrollTab1.height = 259;
				scrollTab1.scrollMax = 450;

				int npcList = 30;
				scrollTab1.totalChildren(npcList);
				int y = 1;
				for (int i = 0; i < npcList; i++)
				{
						RSInterface.addText(interfaceId, "", textDrawingAreas, i == 0 ? 2 : 1, i == 0 ? ClientConstants.PALE_GREEN : ClientConstants.ORANGE, false, false, ClientConstants.WHITE, "Select", 150);
						RSInterface.textClicked(interfaceId, 645, 0, 0);
						scrollTab1.child(i, interfaceId, 0, y);
						interfaceId++;
						y += 15;
				}

		}

		private static void npcDropTable(TextDrawingArea[] textDrawingAreas)
		{

				int interfaceId = 22450;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 84, 460, 14, 320);
				interfaceId++;
				RSInterface.setChildren(21, interfaces);
				int child = 0;
				int xOffset = 78;
				int yOffset = -10;

				RSInterface.addSprite(interfaceId, 644); // Background.
				RSInterface.setBounds(interfaceId, 2 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Rare Drop Table", textDrawingAreas, 2, ClientConstants.YELLOW, true);
				RSInterface.setBounds(interfaceId, 205 + xOffset, 30 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 355 + xOffset, 30 + yOffset, child, interfaces);
				RSInterface.setBounds(interfaceId + 1, 355 + xOffset, 30 + yOffset, child + 1, interfaces);
				child += 2;
				interfaceId += 3;

				RSInterface.itemGroup(interfaceId, 1, 7, 13, 5);
				RSInterface.setBounds(interfaceId, 148 + xOffset, 60 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				int yExtra = 0;
				int xExtra = 25;
				for (int index = 0; index < 7; index++)
				{
						RSInterface.addText(interfaceId, "", textDrawingAreas, 1, ClientConstants.ORANGE, true);
						RSInterface.setBounds(interfaceId, 230 + xExtra + xOffset, 70 + yOffset + yExtra, child, interfaces);
						interfaceId++;
						child++;

						RSInterface.addText(interfaceId, "", textDrawingAreas, 0, 0x4abb4a, true);
						RSInterface.setBounds(interfaceId, 317 + xExtra + xOffset, 72 + yOffset + yExtra, child, interfaces);
						interfaceId++;
						child++;

						yExtra += 37;
				}

				RSInterface scrollTab1 = RSInterface.addInterface(interfaceId);
				RSInterface.setBounds(interfaceId, 14 + xOffset, 58 + yOffset, child, interfaces);
				interfaceId++;
				child++;
				//15
				scrollTab1.width = 101;
				scrollTab1.height = 237;
				scrollTab1.scrollMax = 635;

				int npcList = 30;
				scrollTab1.totalChildren(npcList);
				int y = 1;
				for (int i = 0; i < npcList; i++)
				{
						RSInterface.addText(interfaceId, "", textDrawingAreas, i == 0 ? 2 : 1, i == 0 ? ClientConstants.PALE_GREEN : ClientConstants.ORANGE, false, false, ClientConstants.WHITE, "Select", 150);
						RSInterface.textClicked(interfaceId, 645, 0, 0);
						scrollTab1.child(i, interfaceId, 0, y);
						interfaceId++;
						y += 15;
				}
				RSInterface.addText(interfaceId, "Avrg kills per drop:", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 15 + xOffset, 304 + yOffset, child, interfaces);
				interfaceId++;
				child++;

		}

		private static void hallOfFame(TextDrawingArea[] textDrawingAreas)
		{

				int interfaceId = 19850;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 7, 503, 9, 317);
				interfaceId++;
				RSInterface.setChildren(15, interfaces);
				int child = 0;
				int xOffset = 0;
				int yOffset = -16;

				RSInterface.addSprite(interfaceId, 615); // Background.
				RSInterface.setBounds(interfaceId, 2 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;
				int x1 = 177;

				RSInterface.addText(interfaceId, "Hall Of Fame", textDrawingAreas, 2, ClientConstants.YELLOW, true);
				RSInterface.setBounds(interfaceId, 250 + xOffset, 30 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 251, 252, 18, 18, "Back");
				RSInterface.setBounds(interfaceId, 463, 30 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 463, 30 + yOffset, child, interfaces);
				child++;
				interfaceId += 3;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 482 + xOffset, 30 + yOffset, child, interfaces);
				RSInterface.setBounds(interfaceId + 1, 482 + xOffset, 30 + yOffset, child + 1, interfaces);
				child += 2;
				interfaceId += 3;

				RSInterface.addSprite(interfaceId, 619);
				RSInterface.setBounds(interfaceId, 12 + xOffset, 57 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "First players to:", textDrawingAreas, 2, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 90 + xOffset, 59 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				String[] numbers = {"1st", "2nd", "3rd"};

				for (int i = 0; i < 3; i++)
				{
						RSInterface.addSprite(interfaceId, 618);
						RSInterface.setBounds(interfaceId, 6 + xOffset + x1, 57 + yOffset, child, interfaces);
						interfaceId++;
						child++;

						RSInterface.addText(interfaceId, numbers[i], textDrawingAreas, 2, ClientConstants.ORANGE, true);
						RSInterface.setBounds(interfaceId, 54 + xOffset + x1, 59 + yOffset, child, interfaces);
						interfaceId++;
						child++;

						x1 += 101;
				}

				RSInterface scrollTab1 = RSInterface.addInterface(interfaceId);
				RSInterface.setBounds(interfaceId, 11 + xOffset, 87 + yOffset, child, interfaces);
				interfaceId++;
				child++;
				scrollTab1.width = 469;
				scrollTab1.height = 231;
				scrollTab1.scrollMax = 635;

				int highscoresAmount = 30;
				scrollTab1.totalChildren(highscoresAmount * 8);
				int y = -66;
				int childHighscores = 0;
				int x2 = 6;
				for (int i = 0; i < highscoresAmount; i++)
				{
						RSInterface.addSprite(interfaceId, 617);
						scrollTab1.child(childHighscores, interfaceId, 0, 67 + y);
						interfaceId++;
						childHighscores++;

						RSInterface.addSprite(interfaceId, 616);
						scrollTab1.child(childHighscores, interfaceId, 167 + x2, 67 + y);
						interfaceId++;
						childHighscores++;

						RSInterface.addSprite(interfaceId, 616);
						scrollTab1.child(childHighscores, interfaceId, 267 + x2, 67 + y);
						interfaceId++;
						childHighscores++;

						RSInterface.addSprite(interfaceId, 616);
						scrollTab1.child(childHighscores, interfaceId, 367 + x2, 67 + y);
						interfaceId++;
						childHighscores++;

						RSInterface.addText(interfaceId, "", ClientConstants.ORANGE, false, true, -1, textDrawingAreas, 1);
						scrollTab1.child(childHighscores, interfaceId, 5, 69 + y + 0);
						interfaceId++;
						childHighscores++;

						RSInterface.addText(interfaceId, "", textDrawingAreas, 1, 0xffb000, true, true, 0xffffff, "View profile", 97);
						scrollTab1.child(childHighscores, interfaceId, 166 + x2, 69 + y + 0);
						interfaceId++;
						childHighscores++;
						RSInterface.addText(interfaceId, "", textDrawingAreas, 1, 0xffb000, true, true, 0xffffff, "View profile", 97);
						scrollTab1.child(childHighscores, interfaceId, 266 + x2, 69 + y + 0);
						interfaceId++;
						childHighscores++;

						RSInterface.addText(interfaceId, "", textDrawingAreas, 1, 0xffb000, true, true, 0xffffff, "View profile", 97);
						scrollTab1.child(childHighscores, interfaceId, 366 + x2, 69 + y + 0);
						interfaceId++;
						childHighscores++;
						y += 21;
				}
		}


		private static void teleportInterface(TextDrawingArea[] textDrawingAreas)
		{

				int interfaceId = 19700;
				int child = 0;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 91, 427, 64, 283);
				interfaceId++;
				RSInterface.setChildren(26, interfaces);
				int xOffset = 80;
				int yOffset = 40;

				RSInterface.addSprite(interfaceId, 609); // Background.
				RSInterface.setBounds(interfaceId, 9 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Teleports", textDrawingAreas, 2, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 150 + xOffset, 30 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				int yExtra = -1;
				for (int index = 0; index < 7; index++)
				{
						RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 614, 610, 89, 26, "Toggle");
						RSInterface.setSpriteClicked(interfaceId, 612);
						RSInterface.setBounds(interfaceId, 16 + xOffset, 57 + yOffset + yExtra, child, interfaces);
						RSInterface.hoverHasText(interfaceId + 2);
						child++;
						RSInterface.setBounds(interfaceId + 1, 16 + xOffset, 56 + yOffset + yExtra, child, interfaces);
						child++;
						interfaceId += 3;

						RSInterface.addText(interfaceId, "", textDrawingAreas, 2, ClientConstants.ORANGE, true);
						RSInterface.setBounds(interfaceId, 60 + xOffset, 61 + yOffset + yExtra, child, interfaces);
						interfaceId++;
						child++;
						yExtra += 25;
				}
				yExtra = 0;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 317 + xOffset, 30 + yOffset, child, interfaces);
				RSInterface.setBounds(interfaceId + 1, 317 + xOffset, 30 + yOffset, child + 1, interfaces);
				child += 2;
				interfaceId += 3;

				RSInterface scrollTab1 = RSInterface.addInterface(interfaceId);
				RSInterface.setBounds(interfaceId, 111 + xOffset, 56 + yOffset, child, interfaces); // scrollTab1
				interfaceId++;
				child++;

				scrollTab1.width = 209;
				scrollTab1.height = 176;
				scrollTab1.scrollMax = 402;
				scrollTab1.totalChildren(45);
				int increaseY = 0;
				int childNew = 0;
				for (int i = 0; i < 15; i++)
				{
						RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 613, 611, 224, 26, "Click");
						RSInterface.hoverHasText(interfaceId + 2);
						scrollTab1.child(childNew, interfaceId, 0, increaseY);
						childNew++;
						scrollTab1.child(childNew, interfaceId + 1, 0, increaseY);
						childNew++;
						interfaceId += 3;

						RSInterface.addText(interfaceId, "", textDrawingAreas, 1, ClientConstants.ORANGE, true);
						scrollTab1.child(childNew, interfaceId, 104, increaseY + 4);
						increaseY += 25;
						interfaceId++;
						childNew++;
				}

		}


		private static void clanChatSetUp(TextDrawingArea[] textDrawingAreas)
		{
				int interfaceId = 19580;
				int child = 0;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 106, 414, 22, 330);
				interfaceId++;
				RSInterface.setChildren(28, interfaces);
				int xOffset = 93;
				int yOffset = -4;

				RSInterface.addSprite(interfaceId, 604); // Background.
				RSInterface.setBounds(interfaceId, 9 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Clan Chat", textDrawingAreas, 2, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 212 + xOffset, 30 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 599, 605, 53, 17, "Toggle to public/friends only");
				RSInterface.setBounds(interfaceId, 18 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 18 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				interfaceId += 3;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 27 + xOffset, 33 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 82 + xOffset, 33 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Moderator", textDrawingAreas, 1, ClientConstants.YELLOW, false);
				RSInterface.setBounds(interfaceId, 60 + xOffset, 60 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Banned", textDrawingAreas, 1, ClientConstants.YELLOW, false);
				RSInterface.setBounds(interfaceId, 217 + xOffset, 60 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 607, 606, 16, 16, "Add mod");
				RSInterface.setBounds(interfaceId, 124 + xOffset, 60 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 124 + xOffset, 60 + yOffset, child, interfaces);
				child++;
				interfaceId += 3;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 607, 606, 16, 16, "Add ban");
				RSInterface.setBounds(interfaceId, 265 + xOffset, 60 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 265 + xOffset, 60 + yOffset, child, interfaces);
				child++;
				interfaceId += 3;

				int increaseY = 0;
				for (int index = 0; index < 10; index++)
				{
						RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.ORANGE, false, true, ClientConstants.WHITE, "Demote", 100);
						RSInterface.setBounds(interfaceId, 27 + xOffset, 87 + yOffset + increaseY, child, interfaces);
						interfaceId++;
						child++;
						increaseY += 15;
				}


				RSInterface scrollTab1 = RSInterface.addInterface(interfaceId);
				RSInterface.setBounds(interfaceId, 172 + xOffset, 83 + yOffset, child, interfaces); // scrollTab1
				interfaceId++;
				child++;

				scrollTab1.width = 120;
				scrollTab1.height = 236;
				scrollTab1.scrollMax = 760;
				scrollTab1.totalChildren(50);
				increaseY = 0;
				for (int i = 0; i < 50; i++)
				{
						RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.RED, false, false, ClientConstants.WHITE, "Unban", 100);
						scrollTab1.child(i, interfaceId, 7, 8 + yOffset + increaseY);
						increaseY += 15;
						interfaceId++;
				}

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 599, 608, 117, 17, "Change name");
				RSInterface.setBounds(interfaceId, 73 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 73 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				interfaceId += 3;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 82 + xOffset, 33 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 386, 26, child, interfaces);
				RSInterface.setBounds(interfaceId + 1, 386, 26, child + 1, interfaces);
				child += 2;
				interfaceId += 3;
		}

		private static void pvpBlacklist(TextDrawingArea[] textDrawingAreas)
		{
				int interfaceId = 22700;
				int child = 0;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 186, 343, 30, 311);
				interfaceId++;
				RSInterface.setChildren(7, interfaces);
				int xOffset = 173;
				int yOffset = 4;

				RSInterface.addSprite(interfaceId, 707); // Background.
				RSInterface.setBounds(interfaceId, 9 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Blacklisted", textDrawingAreas, 2, ClientConstants.YELLOW, false);
				RSInterface.setBounds(interfaceId, 36 + xOffset, 34 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 607, 606, 16, 16, "Add blacklist");
				RSInterface.setBounds(interfaceId, 112 + xOffset, 33 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 112 + xOffset, 33 + yOffset, child, interfaces);
				child++;
				interfaceId += 3;

				int increaseY = 0;

				RSInterface scrollTab1 = RSInterface.addInterface(interfaceId);
				RSInterface.setBounds(interfaceId, 22 + xOffset, 56 + yOffset, child, interfaces); // scrollTab1
				interfaceId++;
				child++;

				scrollTab1.width = 120;
				scrollTab1.height = 236;
				scrollTab1.scrollMax = 760;
				scrollTab1.totalChildren(50);
				increaseY = 0;
				for (int i = 0; i < 50; i++)
				{
						RSInterface.addText(interfaceId, "", textDrawingAreas, 0, ClientConstants.RED, false, false, ClientConstants.WHITE, "Remove", 100);
						scrollTab1.child(i, interfaceId, 7, 8 + yOffset + increaseY);
						increaseY += 15;
						interfaceId++;
				}

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 140 + xOffset, 33 + yOffset, child, interfaces);
				RSInterface.setBounds(interfaceId + 1, 140 + xOffset, 33 + yOffset, child + 1, interfaces);
				child += 2;
				interfaceId += 3;
		}

		private static void jewelry(TextDrawingArea[] textDrawingAreas)
		{

				int interfaceId = 19501;
				int child = 0;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 104, 424, 21, 320);
				interfaceId++;
				RSInterface.setChildren(10, interfaces);
				int xOffset = 91;
				int yOffset = -4;

				RSInterface.addSprite(interfaceId, 601); // Background.
				RSInterface.setBounds(interfaceId, 9 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Rings", textDrawingAreas, 2, ClientConstants.YELLOW, false);
				RSInterface.setBounds(interfaceId, 150 + xOffset, 58 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 1, ClientConstants.WHITE, true);
				RSInterface.setBounds(interfaceId, 169 + xOffset, 113 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 1, ClientConstants.WHITE, true);
				RSInterface.setBounds(interfaceId, 169 + xOffset, 207 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "", textDrawingAreas, 1, ClientConstants.WHITE, true);
				RSInterface.setBounds(interfaceId, 169 + xOffset, 286 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 304 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 304 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				interfaceId += 4;

				String[] tooltips = {"Gold", "Sapphire", "Emerald", "Ruby", "Diamond", "Dragonstone", "Onyx"};
				RSInterface.addButtonMulti(interfaceId, 599, tooltips, 43, 38);
				RSInterface.setBounds(interfaceId, 147 + xOffset, 77 + yOffset, child, interfaces);
				interfaceId += tooltips.length; // Must be same amount as tooltips length because of the way it works in the client class.
				child++;

				RSInterface.addButtonMulti(interfaceId, 599, tooltips, 43, 53);
				RSInterface.setBounds(interfaceId, 144 + xOffset, 169 + yOffset, child, interfaces);
				interfaceId += tooltips.length;
				child++;

				RSInterface.addButtonMulti(interfaceId, 599, tooltips, 40, 36);
				RSInterface.setBounds(interfaceId, 147 + xOffset, 253 + yOffset, child, interfaces);
				interfaceId += tooltips.length;
				child++;
		}

		private static void runePouch(TextDrawingArea[] textDrawingAreas)
		{
				int interfaceId = 22910;
				int child = 0;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 89, 440, 29, 314);
				interfaceId++;
				RSInterface.setChildren(9, interfaces);
				int xOffset = 75;
				int yOffset = 4;

				RSInterface.addSprite(interfaceId, 716); // Background.
				RSInterface.setBounds(interfaceId, 9 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Inventory", textDrawingAreas, 1, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 158 + xOffset, 138 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 335 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 335 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				interfaceId += 4;

				RSInterface.itemGroup(interfaceId, 3, 1, 23, 0);
				RSInterface.setBounds(interfaceId, 115 + xOffset, 86 + yOffset, child, interfaces);
				child++;
				interfaceId += 1;

				String[] tooltips = {"Withdraw All"};
				RSInterface.addButtonMulti(interfaceId, 599, tooltips, 35, 40);
				RSInterface.setBounds(interfaceId, 113 + xOffset, 80 + yOffset, child, interfaces);
				interfaceId += tooltips.length; // Must be same amount as tooltips length because of the way it works in the client class.
				child++;

				RSInterface.addButtonMulti(interfaceId, 599, tooltips, 35, 40);
				RSInterface.setBounds(interfaceId, 167 + xOffset, 80 + yOffset, child, interfaces);
				interfaceId += tooltips.length; // Must be same amount as tooltips length because of the way it works in the client class.
				child++;

				RSInterface.addButtonMulti(interfaceId, 599, tooltips, 35, 40);
				RSInterface.setBounds(interfaceId, 221 + xOffset, 80 + yOffset, child, interfaces);
				interfaceId += tooltips.length; // Must be same amount as tooltips length because of the way it works in the client class.
				child++;

				RSInterface.itemGroup(interfaceId, 7, 4, 15, 2);
				RSInterface.setBounds(interfaceId, 29 + xOffset, 159 + yOffset, child, interfaces);
				child++;
				interfaceId += 1;
		}

		private static void enchantBolts(TextDrawingArea[] textDrawingAreas)
		{
				int interfaceId = 19530;
				int child = 0;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 16, 503, 17, 323);
				interfaceId++;
				RSInterface.setChildren(34, interfaces);
				int xOffset = 3;
				int yOffset = -7;

				RSInterface.addSprite(interfaceId, 602); // Background.
				RSInterface.setBounds(interfaceId, 9 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Magic 4", textDrawingAreas, 1, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 36 + xOffset, 76 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Magic 7", textDrawingAreas, 1, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 154 + xOffset, 76 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Magic 14", textDrawingAreas, 1, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 254 + xOffset, 76 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Magic 24", textDrawingAreas, 1, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 349 + xOffset, 76 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Magic 27", textDrawingAreas, 1, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 440 + xOffset, 76 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Magic 29", textDrawingAreas, 1, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 69 + xOffset, 206 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Magic 49", textDrawingAreas, 1, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 154 + xOffset, 206 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 124 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "5", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 154 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 183 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 220 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "10", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 248 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "2", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 277 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 312 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "15", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 340 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 369 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 412 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "20", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 441 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 472 + xOffset, 297 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				// Close button.
				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 472 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 472 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				interfaceId += 4;

				RSInterface.addButton(interfaceId, 599, "Enchant", 50, 50);
				RSInterface.setBounds(interfaceId, 125 + xOffset, 224 + yOffset, child, interfaces);
				interfaceId += 1;
				child++;

				RSInterface.addButton(interfaceId, 599, "Enchant", 50, 50);
				RSInterface.setBounds(interfaceId, 223 + xOffset, 224 + yOffset, child, interfaces);
				interfaceId += 1;
				child++;

				RSInterface.addButton(interfaceId, 599, "Enchant", 50, 50);
				RSInterface.setBounds(interfaceId, 315 + xOffset, 224 + yOffset, child, interfaces);
				interfaceId += 1;
				child++;

				RSInterface.addButton(interfaceId, 599, "Enchant", 50, 50);
				RSInterface.setBounds(interfaceId, 414 + xOffset, 224 + yOffset, child, interfaces);
				interfaceId += 1;
				child++;

				RSInterface.addButton(interfaceId, 599, "Enchant", 50, 50);
				RSInterface.setBounds(interfaceId, 120 + xOffset, 97 + yOffset, child, interfaces);
				interfaceId += 1;
				child++;

				RSInterface.addButton(interfaceId, 599, "Enchant", 50, 50);
				RSInterface.setBounds(interfaceId, 414 + xOffset, 97 + yOffset, child, interfaces);
				interfaceId += 1;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 123 + xOffset, 167 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 152 + xOffset, 167 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 182 + xOffset, 167 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 414 + xOffset, 167 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "3", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 445 + xOffset, 167 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "1", textDrawingAreas, 0, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 473 + xOffset, 167 + yOffset, child, interfaces);
				interfaceId++;
				child++;
		}

		public static void titleInterface(TextDrawingArea[] tda)
		{
				int interfaceId = 19360;
				int child = 0;
				RSInterface interfaces = RSInterface.addInterface(interfaceId, 111, 420, 16, 324);
				interfaceId++;
				int xOffset = 98;
				int yOffset = -10;

				RSInterface.setChildren(33, interfaces);

				RSInterface.addSprite(interfaceId, 398); // Background.
				RSInterface.setBounds(interfaceId, 9 + xOffset, 21 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				// Tab buttons.
				int x = 15 + xOffset;
				int y = 55 + yOffset;
				for (int index = 0; index < 4; index++)
				{
						RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 350, 351, 75, 20, "Select");
						RSInterface.setSpriteClicked(interfaceId, 397);
						RSInterface.setBounds(interfaceId, x, y, child, interfaces);
						child++;
						RSInterface.setBounds(interfaceId + 1, x, y, child, interfaces);
						interfaceId += 4;
						child++;
						x += 74;
				}

				// Interface title.
				RSInterface.addText(interfaceId, "Titles", tda, 2, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 145 + xOffset, 30 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				// Tab titles.
				RSInterface.addText(interfaceId, "Skilling        Pking           Misc       Unlocked", tda, 2, ClientConstants.YELLOW, false);
				RSInterface.setBounds(interfaceId, 29 + xOffset, 58 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				// Requirements title
				RSInterface.addText(interfaceId, "Requirements", tda, 1, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 200 + xOffset, 86 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				// Current title, title.
				RSInterface.addText(interfaceId, "Current title", tda, 1, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 50 + xOffset, 265 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				// Current title, text.
				RSInterface.addText(interfaceId, "", tda, 1, ClientConstants.YELLOW, true);
				RSInterface.setBounds(interfaceId, 91 + xOffset, 284 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				// Available titles scroll.
				RSInterface scrollTab1 = RSInterface.addInterface(interfaceId);
				RSInterface.setBounds(interfaceId, 26 + xOffset, 86 + yOffset, child, interfaces); // scrollTab1
				interfaceId++;
				child++;

				scrollTab1.width = 120;
				scrollTab1.height = 172;
				scrollTab1.scrollMax = 620;
				scrollTab1.totalChildren(40);
				y = 5;
				for (int i = 0; i < 40; i++)
				{
						RSInterface.addText(interfaceId, "", tda, 0, ClientConstants.RED, false, false, 0xffffff, "Select", 150);
						RSInterface.textClicked(interfaceId, 600, 1, 2);
						scrollTab1.child(i, interfaceId, 0, y);
						y += 15;
						interfaceId++;
				}
				y = 109;
				for (int i = 0; i < 8; i++)
				{
						RSInterface.addText(interfaceId, "", tda, 0, ClientConstants.PALE_ORANGE, false);
						RSInterface.setBounds(interfaceId, 169 + xOffset, y + yOffset, child, interfaces);
						y += 15;
						interfaceId++;
						child++;
				}

				// Equip button.
				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 199, 200, 72, 32, "Select");
				RSInterface.setBounds(interfaceId, 160 + xOffset, 275 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 160 + xOffset, 275 + yOffset, child, interfaces);
				child++;
				interfaceId += 4;

				// Un-equip button.
				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 199, 200, 72, 32, "Select");
				RSInterface.setBounds(interfaceId, 237 + xOffset, 275 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 237 + xOffset, 275 + yOffset, child, interfaces);
				child++;
				interfaceId += 4;

				// Equip text.
				RSInterface.addText(interfaceId, "Equip title", tda, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 173 + xOffset, 285 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				// Un-equip text.
				RSInterface.addText(interfaceId, "Clear title", tda, 0, ClientConstants.ORANGE, false);
				RSInterface.setBounds(interfaceId, 248 + xOffset, 285 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				// Close button.
				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 292 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				RSInterface.setBounds(interfaceId + 1, 292 + xOffset, 30 + yOffset, child, interfaces);
				child++;
				interfaceId += 4;

				// Current title, text.
				RSInterface.addText(interfaceId, "", tda, 1, ClientConstants.ORANGE, true);
				RSInterface.setBounds(interfaceId, 91 + xOffset, 300 + yOffset, child, interfaces);
				interfaceId++;
				child++;

				// Loading bar text.
				RSInterface.addText(interfaceId, "", tda, 0, ClientConstants.WHITE, true);
				RSInterface.setBounds(interfaceId, 233 + xOffset, 239 + yOffset, child, interfaces);
				interfaceId++;
				child++;
		}

		public static void lootingBag(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addInterface(22245);
				RSInterface.addSprite(22246, 565);

				RSInterface.addHoverButtonLatest(22247, 22248, 22249, 148, 149, 15, 15, "Close Window");
				RSInterface.addText(22250, "Looting bag", tda, 2, 0xFF9900, true, true);
				RSInterface.itemGroup(22251, 4, 7, 13, 0);
				tab.totalChildren(5);
				tab.child(0, 22246, 9, 21);
				tab.child(1, 22247, 168, 4);
				tab.child(2, 22248, 168, 4);
				tab.child(3, 22250, 95, 4);
				tab.child(4, 22251, 12, 23);
		}

		private static void completionistCape(TextDrawingArea[] textDrawingAreas)
		{
				int interfaceId = 22060;
				int child = 0;
				RSInterface Interface = RSInterface.addInterface(interfaceId, 55, 461, 10, 334);
				interfaceId++;

				RSInterface.setChildren(17 + 16 * 2, Interface);

				RSInterface.addSprite(interfaceId, 518);
				RSInterface.setBounds(interfaceId, 49, 6, child, Interface); // Background.
				child++;
				interfaceId++;

				RSInterface.addChar(interfaceId);
				RSInterface.setBounds(interfaceId, 275, 200, child, Interface); // Character model.
				child++;
				interfaceId++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 521, 522, 61, 58, "Choose");
				RSInterface.setBounds(interfaceId, 94, 51, child, Interface);
				RSInterface.setBounds(interfaceId + 1, 94, 51, child + 1, Interface);
				child += 2;
				interfaceId += 3;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 521, 522, 61, 58, "Choose");
				RSInterface.setBounds(interfaceId, 173, 51, child, Interface);
				RSInterface.setBounds(interfaceId + 1, 173, 51, child + 1, Interface);
				child += 2;
				interfaceId += 3;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 521, 522, 61, 58, "Choose");
				RSInterface.setBounds(interfaceId, 94, 126, child, Interface);
				RSInterface.setBounds(interfaceId + 1, 94, 126, child + 1, Interface);
				child += 2;
				interfaceId += 3;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 521, 522, 61, 58, "Choose");
				RSInterface.setBounds(interfaceId, 173, 126, child, Interface);
				RSInterface.setBounds(interfaceId + 1, 173, 126, child + 1, Interface);
				child += 2;
				interfaceId += 3;

				// x += 22
				int x1Original = 79;
				int x1 = 79;
				int y1 = 233;
				for (int i = 0; i < 16; i++)
				{
						RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 525, 526, 20, 20, "Choose");
						RSInterface.setBounds(interfaceId, x1, y1, child, Interface);
						RSInterface.setBounds(interfaceId + 1, x1, y1, child + 1, Interface);
						child += 2;
						interfaceId += 3;
						x1 += 25;
						if (i == 6 || i == 13)
						{
								y1 += 22;
								x1 = x1Original;
						}
				}

				RSInterface.addText(interfaceId, "Top", 0xffff01, true, true, -1, textDrawingAreas, 0);
				RSInterface.setBounds(interfaceId, 125, 110, child, Interface);
				child++;
				interfaceId++;

				RSInterface.addText(interfaceId, "Top detail", 0xffff01, true, true, -1, textDrawingAreas, 0);
				RSInterface.setBounds(interfaceId, 204, 110, child, Interface);
				child++;
				interfaceId++;

				RSInterface.addText(interfaceId, "Bottom", 0xffff01, true, true, -1, textDrawingAreas, 0);
				RSInterface.setBounds(interfaceId, 125, 185, child, Interface);
				child++;
				interfaceId++;

				RSInterface.addText(interfaceId, "Bottom detail", 0xffff01, true, true, -1, textDrawingAreas, 0);
				RSInterface.setBounds(interfaceId, 204, 185, child, Interface);
				child++;
				interfaceId++;

				RSInterface.addText(interfaceId, "Completionist cape customizer", 0xffff01, true, true, -1, textDrawingAreas, 2);
				RSInterface.setBounds(interfaceId, 252, 9, child, Interface);
				child++;
				interfaceId++;

				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 435, 9, child, Interface);
				RSInterface.setBounds(interfaceId + 1, 435, 9, child + 1, Interface);
				child += 2;
				interfaceId += 3;

		}

		private static void highscoresInterface1(TextDrawingArea[] textDrawingAreas)
		{
				int x6 = 2;
				int y6 = -29;
				RSInterface Interface = RSInterface.addInterface(21030, 6, 510, 9, 317);
				RSInterface.setChildren(31, Interface);

				RSInterface.addSprite(21031, 507); // Background
				RSInterface.setBounds(21031, 2, 5, 0, Interface); // Background.

				RSInterface scrollTab1 = RSInterface.addInterface(21040);
				RSInterface.setBounds(21040, 0 + x6, 100 + y6, 1, Interface);

				RSInterface.addHoverButtonLatest(21041, 21042, 21043, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(21041, 480 + x6, 43 + y6, 2, Interface);
				RSInterface.setBounds(21042, 480 + x6, 43 + y6, 3, Interface);

				RSInterface.addText(21044, "@yel@Highscores", textDrawingAreas, 2, 0xfffff, true, true);
				RSInterface.setBounds(21044, 250, 13, 4, Interface);

				RSInterface.addText(21045, "@yel@Category", textDrawingAreas, 2, 0xfffff, true, true);
				RSInterface.setBounds(21045, 54, 42, 5, Interface);

				int child = 6;
				int interfaceId = 21050;

				// Start of First column that is outside of the scroll.

				RSInterface.addSprite(interfaceId, 344);
				RSInterface.setBounds(interfaceId, 103 + x6, 70 + y6, child, Interface);
				interfaceId++;
				child++;

				RSInterface.addSprite(interfaceId, 514);
				RSInterface.setBounds(interfaceId, 210 + x6, 70 + y6, child, Interface);
				interfaceId++;
				child++;

				RSInterface.addSprite(interfaceId, 348);//
				RSInterface.setBounds(interfaceId, 316 + x6, 70 + y6, child, Interface);
				interfaceId++;
				child++;

				RSInterface.addSprite(interfaceId, 514);
				RSInterface.setBounds(interfaceId, 376 + x6, 70 + y6, child, Interface);
				interfaceId++;
				child++;
				RSInterface.addText(interfaceId, "Player name:", 0xffb000, false, true, -1, textDrawingAreas, 2);
				RSInterface.setBounds(interfaceId, 111 + x6, 72 + y6, child, Interface);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Kills:", 0xffb000, true, true, -1, textDrawingAreas, 2);
				RSInterface.setBounds(interfaceId, 261 + x6, 72 + y6, child, Interface);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "Deaths:", 0xffb000, true, true, -1, textDrawingAreas, 2);
				RSInterface.setBounds(interfaceId, 343 + x6, 72 + y6, child, Interface);
				interfaceId++;
				child++;

				RSInterface.addText(interfaceId, "KDR:", 0xffb000, true, true, -1, textDrawingAreas, 2);
				RSInterface.setBounds(interfaceId, 425 + x6, 72 + y6, child, Interface);
				interfaceId++;
				child++;

				int y = 63;
				for (int i = 0; i < 17; i++)
				{
						interfaceId++;
						RSInterface.addText(interfaceId, "", textDrawingAreas, 0, 0xffb000, false, false, 0xffffff, "Select", 83);
						RSInterface.textClicked(interfaceId, 320, 1, 2);
						RSInterface.setBounds(interfaceId, 12 + x6, 30 + y6 + y, child, Interface);
						child++;
						y += 15;
				}
				interfaceId++;

				// End



				int highscoresAmount = 30;
				scrollTab1.totalChildren(highscoresAmount * 8);
				child = 0;
				y = -37;
				for (int i = 0; i < highscoresAmount; i++)
				{
						RSInterface.addSprite(interfaceId, 347);
						scrollTab1.child(child, interfaceId, 100 + x6, 67 + y + y6);
						interfaceId++;
						child++;

						RSInterface.addSprite(interfaceId, 512);
						scrollTab1.child(child, interfaceId, 208 + x6, 67 + y + y6);
						interfaceId++;
						child++;

						RSInterface.addSprite(interfaceId, 349);
						scrollTab1.child(child, interfaceId, 314 + x6, 67 + y + y6);
						interfaceId++;
						child++;

						RSInterface.addSprite(interfaceId, 512);
						scrollTab1.child(child, interfaceId, 374 + x6, 67 + y + y6);
						interfaceId++;
						child++;
						RSInterface.addText(interfaceId, "", textDrawingAreas, 1, 0xffb000, false, true, 0xffffff, "View profile", 97);
						scrollTab1.child(child, interfaceId, 100 + x6, 69 + y + 0 + y6);
						interfaceId++;
						child++;

						RSInterface.addText(interfaceId, "", 0xffb000, true, true, -1, textDrawingAreas, 1);
						scrollTab1.child(child, interfaceId, 258 + x6, 69 + y + 0 + y6);
						interfaceId++;
						child++;

						RSInterface.addText(interfaceId, "", 0xffb000, true, true, -1, textDrawingAreas, 1);
						scrollTab1.child(child, interfaceId, 341 + x6, 69 + y + 0 + y6);
						interfaceId++;
						child++;

						RSInterface.addText(interfaceId, "", 0xffb000, true, true, -1, textDrawingAreas, 1);
						scrollTab1.child(child, interfaceId, 424 + x6, 69 + y + 0 + y6);
						interfaceId++;
						child++;
						y += 21;
				}
				scrollTab1.width = 478;
				scrollTab1.height = 231;
				scrollTab1.scrollMax = 635;

		}

		private static void gwdInterface(TextDrawingArea[] textDrawingAreas)
		{
				RSInterface tab = RSInterface.addInterface(25957);

				tab.totalChildren(9);
				int yOriginal = 32;
				int y = yOriginal;
				String[] text = {"Armadyl kills", "Bandos kills", "Saradomin kills", "Zamorak kills", "@cya@0", "@cya@0", "@cya@0", "@cya@0"};
				int x = 378;
				RSInterface.addText(25958, "NPC Killcount", 0xffb000, false, true, -1, textDrawingAreas, 0);
				tab.child(0, 25958, x, 9);
				for (int i = 0; i < 8; i++)
				{
						RSInterface.addText(25959 + i, text[i], 0xffb000, false, true, -1, textDrawingAreas, 0);
						tab.child(1 + i, 25959 + i, x, y + 2);
						y += 15;
						if (i == 3)
						{
								x += 105;
								y = yOriginal;
						}
				}

		}

		static void quickSetUpInterface(TextDrawingArea[] TDA)
		{
				int xOffset = 0;
				int yOffset = -30;
				RSInterface Interface = RSInterface.addInterface(24280, 23, 513, 8, 333);
				RSInterface.addSprite(24281, 695);
				RSInterface.addHoverButton(24282, 148, 16, 16, "View", -1, 24283, 1);
				RSInterface.addHoveredButton(24283, 149, 16, 16, 24284);
				RSInterface.addChar(15125);
				RSInterface.addText(24289, "Quick set-up", TDA, 2, 0xffff01, true, true);
				String[] equipmentSets = {"Max Melee", "Max Hybrid", "Zerk Melee", "Zerk Hybrid", "Pure", "Pure Tribrid", "Ranged Tank", "F2p Melee", "F2p Ranged", "Vengeance", "Barrage", "Teleblock"};
				int interfaceIdStart = 24290;
				int interfaceIdModifier = 0;
				for (int i = 0; i < (equipmentSets.length); i++)
				{
						RSInterface.addHoverButton(interfaceIdStart + interfaceIdModifier, 696, 54, 38, "Spawn", -1, (interfaceIdStart + 1) + interfaceIdModifier, 1);
						interfaceIdModifier++;

						RSInterface.addHoveredButton(interfaceIdStart + interfaceIdModifier, 697, 54, 38, (interfaceIdStart + 1) + interfaceIdModifier);
						interfaceIdModifier++;
						interfaceIdModifier++;

						RSInterface.addText(interfaceIdStart + interfaceIdModifier, equipmentSets[i], TDA, 0, 0xffb000, true, false);
						interfaceIdModifier++;
				}

				int childIdStart = 5;
				RSInterface.setChildren(((equipmentSets.length) * 3) + childIdStart + 43, Interface);
				RSInterface.setBounds(24281, 19 + xOffset, 5, 0, Interface); // Background.
				RSInterface.setBounds(24282, 470 + xOffset, 38 + yOffset, 1, Interface); // Close button.
				RSInterface.setBounds(24283, 470 + xOffset, 38 + yOffset, 2, Interface); // Close button hover.
				RSInterface.setBounds(15125, 310 + xOffset, 230 + yOffset, 3, Interface); // Character
				RSInterface.setBounds(24289, 245 + xOffset, 38 + yOffset, 4, Interface); // Quick set-up text.
				int yPosition = 0;
				int interfaceIdStart1 = 24290;
				int interfaceIdApplied = 0;
				int yStart = 65;
				int ySTart2 = 105;
				int x = 0;
				for (int a = 0; a < equipmentSets.length; a++)
				{
						RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 43 + x + xOffset, yStart + yPosition + yOffset, childIdStart, Interface); // Spawn 1 button.
						interfaceIdApplied++;
						childIdStart++;
						RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 43 + x + xOffset, yStart + yPosition + yOffset, childIdStart, Interface); // Spawn 1 hover button.
						interfaceIdApplied++;
						interfaceIdApplied++;
						childIdStart++;
						RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 71 + x + xOffset, ySTart2 + yPosition + yOffset, childIdStart, Interface); // Spawn 1 text.
						interfaceIdApplied++;
						childIdStart++;
						x += 65;
						if (a == 3 || a == 7)
						{
								x = 0;
								yPosition += 60;
						}
				}

				yPosition = 0;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("602") ? 715 : 698);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 56 + xOffset, 67 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("602") ? 715 : 698);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 108 + xOffset, 67 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("602") ? 713 : 700);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 130 + xOffset, 67 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, 699);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 184 + xOffset, 67 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, 699);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 239 + xOffset, 67 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("602") ? 713 : 700);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 261 + xOffset, 67 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, 701);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 55 + xOffset, 128 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("602") ? 714 : 706);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 109 + xOffset, 128 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, 702);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 134 + xOffset, 128 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, 704);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 174 + xOffset, 128 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("602") ? 714 : 706);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 195 + xOffset, 128 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("602") ? 712 : 705);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 249 + xOffset, 128 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, 703);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 56 + xOffset, 189 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("474") || Client.clientRevision("525") ? 694 : 561);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 128 + xOffset, 195 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("474") || Client.clientRevision("525") ? 711 : 708);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 191 + xOffset, 195 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				RSInterface.addSprite(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("474") || Client.clientRevision("525") ? 709 : 710);
				RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, Client.clientRevision("474") || Client.clientRevision("525") ? 255 : 256 + xOffset, 195 + yOffset, childIdStart, Interface);
				childIdStart++;
				interfaceIdApplied++;

				int newY = 0;
				int newX = 0;
				int yStart1 = 22;
				interfaceIdStart1 = 22800;
				for (int index = 0; index < 9; index++)
				{
						RSInterface.addHoverButtonLatest(interfaceIdStart1 + interfaceIdApplied, interfaceIdStart1 + interfaceIdApplied + 1, interfaceIdStart1 + interfaceIdApplied + 2, 288, 289, 85, 20, "Load preset");
						RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 34 + xOffset + newX, 240 + yStart1 + yOffset + newY, childIdStart, Interface);
						childIdStart++;
						RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied + 1, 34 + xOffset + newX, 240 + yStart1 + yOffset + newY, childIdStart, Interface);
						childIdStart++;
						interfaceIdApplied += 3;
						RSInterface.addText(interfaceIdStart1 + interfaceIdApplied, "Empty preset", TDA, 0, ClientConstants.YELLOW, true, false);
						RSInterface.setBounds(interfaceIdStart1 + interfaceIdApplied, 76 + xOffset + newX, 244 + yStart1 + yOffset + newY, childIdStart, Interface);
						childIdStart++;
						interfaceIdApplied++;
						newX += 90;
						if (index == 2 || index == 5)
						{
								newY += 29;
								newX = 0;
						}
				}

		}

		public static void wildernessInterface(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addInterface(24390);
				tab.totalChildren(2);

				RSInterface.addText(24391, "", 0xe1981c, true, true, -1, tda, 1);
				RSInterface.addTransparentSprite(24392, 326, 128);

				tab.child(0, 24391, 476, 37);
				tab.child(1, 24392, 463, 10);
		}

		public static void wildernessInterface1(TextDrawingArea[] tda)
		{
				int y = 235;
				RSInterface tab = RSInterface.addInterface(24395);
				tab.totalChildren(2);

				RSInterface.addText(24396, "Level:", 0xe1981c, true, true, -1, tda, 1);
				RSInterface.addTransparentSprite(24397, 326, 128);

				tab.child(0, 24396, 476, 37 + y);
				tab.child(1, 24397, 463, 10 + y);
		}

		public static void barrowsInterface(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addInterface(22045);

				tab.totalChildren(6);
				int y = 235;
				String[] text = {"Dharok", "Guthan", "Ahrim", "Torag", "Verac", "Karil"};
				for (int i = 0; i < 6; i++)
				{
						RSInterface.addText(22046 + i, text[i], 0xff0000, true, true, -1, tda, 1);
						tab.child(0 + i, 22046 + i, 470, y);
						y += 15;
				}
		}

		public static void normalPrayerBook(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addTabInterface(5608);
				RSInterface currentPray = RSInterface.interfaceCache[687];
				currentPray.textColour = 0xFF981F;
				currentPray.textShadow = true;
				currentPray.message = "%1/%2";
				RSInterface.addSprite(5651, 232);

				// These are the glow locations
				RSInterface.addPrayer(18000, 0, 601, 7, 233, 401, "Sharp Eye");
				RSInterface.addPrayer(18002, 0, 602, 8, 234, 402, "Mystic Will");
				RSInterface.addPrayer(18004, 0, 603, 25, 235, 403, "Hawk Eye");
				RSInterface.addPrayer(18006, 0, 604, 26, 236, 404, "Mystic Lore");
				RSInterface.addPrayer(18008, 0, 605, 43, 237, 405, "Eagle Eye");
				RSInterface.addPrayer(18010, 0, 606, 44, 238, 406, "Mystic Might");
				RSInterface.addPrayer(18012, 0, 607, 59, 239, 407, "Chivalry");
				RSInterface.addPrayer(18014, 0, 608, 69, 240, 408, "Piety");
				RSInterface.addPrayer(22960, 0, 609, 54, 727, 730, "Preserve");
				RSInterface.addPrayer(22962, 0, 610, 73, 725, 728, "Rigour");
				RSInterface.addPrayer(22964, 0, 611, 76, 726, 729, "Augury");
				RSInterface.addSpriteOld(22043, "Prayer/ICON 0");
				tab.totalChildren(90);
				/* Buttons/glows */
				tab.child(0, 5609, 6, 4);
				tab.child(1, 5610, 42, 4);
				tab.child(2, 5611, 78, 4);
				tab.child(3, 5612, 6, 40);
				tab.child(4, 5613, 42, 40);
				tab.child(5, 5614, 78, 40);
				tab.child(6, 5615, 114, 40);
				tab.child(7, 5616, 150, 40);
				tab.child(8, 5617, 6, 76);
				tab.child(9, 5618, 114, 76);
				tab.child(10, 5619, 150, 76);
				tab.child(11, 5620, 6, 112);
				tab.child(12, 5621, 42, 112);
				tab.child(13, 5622, 78, 112);
				tab.child(14, 5623, 114, 112);
				tab.child(15, 683, 42, 148);
				tab.child(16, 684, 78, 148);
				tab.child(17, 685, 114, 148); // Smite
				/* Sprites */
				tab.child(18, 5632, 8, 6);
				tab.child(19, 5633, 44, 6);
				tab.child(20, 5634, 80, 6);
				tab.child(21, 5635, 8, 42);
				tab.child(22, 5636, 44, 42);
				tab.child(23, 5637, 80, 42);
				tab.child(24, 5638, 116, 42);
				tab.child(25, 5639, 152, 42);
				tab.child(26, 5640, 8, 79);
				tab.child(27, 5641, 116, 78);
				tab.child(28, 5642, 152, 78);
				tab.child(29, 5643, 8, 114);
				tab.child(30, 5644, 44, 114);
				tab.child(31, 686, 80, 114);
				tab.child(32, 5645, 116, 114);
				tab.child(33, 5649, 44, 150);
				tab.child(34, 5647, 80, 150);
				tab.child(35, 5648, 116, 150);
				/* New prayers */
				tab.child(36, 18000, 114, 4); // Even number is prayer glow.
				tab.child(37, 18001, 117, 8); // Odd number is prayer off.
				tab.child(38, 18002, 150, 4);
				tab.child(39, 18003, 153, 7);
				tab.child(40, 18004, 42, 76);
				tab.child(41, 18005, 45, 80);
				tab.child(42, 18006, 78, 76);
				tab.child(43, 18007, 81, 79);
				tab.child(44, 18008, 150, 112);
				tab.child(45, 18009, 153, 116);
				tab.child(46, 18010, 6, 148);
				tab.child(47, 18011, 9, 151);
				tab.child(48, 18012, 7, 182); // Chivalry glow
				tab.child(49, 18013, 14, 185); // Chivalry
				tab.child(50, 18014, 42, 182); // Piety glow
				tab.child(51, 18015, 44, 193); // Piety
				/* Prayer icons & text */
				tab.child(52, 5651, 66, 236);
				tab.child(53, 687, 21, 238);
				tab.child(54, 22043, 65, 241);
				String[] hoverText = {
						"Level 01\\nThick Skin\\nIncreases your Defence by 5%",
						"Level 04\\nBurst of Strength\\nIncreases your Strength by 5%",
						"Level 07\\nClarity of Thought\\nIncreases your Attack by 5%",
						"Level 08\\nSharp Eye\\nIncreases your Ranged by 5%",
						"Level 09\\nMystic Will\\nIncreases your Magic by 5%",
						"Level 10\\nRock Skin\\nIncreases your Defence by 10%",
						"Level 13\\nSuperhuman Strength\\nIncreases your Strength by 10%",
						"Level 16\\nImproved Reflexes\\nIncreases your Attack by 10%",
						"Level 19\\nRapid Restore\\n2x restore rate for all stats\\nexcept Hitpoints and Prayer",
						"Level 22\\nRapid Heal\\n2x restore rate for the\\nHitpoints stat",
						"Level 25\\nProtect Item\\nKeep 1 extra item if you die",
						"Level 26\\nHawk Eye\\nIncreases your Ranged by 10%",
						"Level 27\\nMystic Lore\\nIncreases your Magic by 10%",
						"Level 28\\nSteel Skin\\nIncreases your Defence by 15%",
						"Level 31\\nUltimate Strength\\nIncreases your Strength by 15%",
						"Level 34\\nIncredible Reflexes\\nIncreases your Attack by 15%",
						"Level 37\\nProtect from Magic\\nProtection from magical attacks",
						"Level 40\\nProtect from Missles\\nProtection from ranged attacks",
						"Level 43\\nProtect from Melee\\nProtection from melee attacks",
						"Level 44\\nEagle Eye\\nIncreases your Ranged by 15%",
						"Level 45\\nMystic Might\\nIncreases your Magic by 15%",
						"Level 46\\nRetribution\\nInflicts damage to nearby\\ntargets if you die",
						"Level 49\\nRedemption\\nHeals you when damaged\\nand Hitpoints falls\\nbelow 10%",
						"Level 52\\nSmite\\n1/4 of damage dealt is\\nalso removed from\\nopponent's Prayer",
						"Level 55\\nPreserve\\nBoosted stats last 20% longer",
						"Level 60\\nChivalry\\nIncreases your Defence by 20%,\\nStrength by 18%, and Attack by\\n15%",
						"Level 70\\nPiety\\nIncreases your Defence by 25%,\\nStrength by 23%, and Attack by\\n20%",
						"Level 74\\nRigour\\nIncreases your Ranged by 20%,\\nRanged strength by 23%, and\\nDefence by 25%",
						"Level 77\\nAugury\\nIncreases your Magic by 25%\\nand Defence by 25%",};

				// Position of the hover box.
				int[][] hoverBoxPosition = {
						{36, 80},
						{36, 80},
						{41, 80},
						{45, 80},
						{55, 80},
						{36, 116},
						{36, 116},
						{41, 116},
						{50, 116},
						{83, 116},
						{34, 152},
						{36, 152},
						{40, 152},
						{34, 152},
						{32, 152},
						{36, 188},
						{33, 188},
						{34, 188},
						{42, 188},
						{41, 188},
						{35, 224},
						{38, 110},
						{50, 93},
						{87, 93}, // Index 23
						{35, 224}, // Preserve tooltip 
						{30, 134}, // Chivalry tooltip
						{50, 134}, // Piety tooltip
						{50, 134}, // Rigour tooltip
						{50, 134}, // Augury tooltip
				};
				tab.child(55, 22960, 151, 150);
				tab.child(56, 22961, 153, 150);
				tab.child(57, 22962, 79, 184);
				tab.child(58, 22963, 81, 186);
				tab.child(59, 22964, 115, 186);
				tab.child(60, 22965, 117, 186);
				int x = 8;
				int y = 6;
				for (int index = 0; index < 29; index++)
				{
						RSInterface.createTimedHoverBox(22150 + index, hoverText[index], 33, 33, hoverBoxPosition[index][0], hoverBoxPosition[index][1]);
						tab.child(61 + index, 22150 + index, x, y);
						x += 34;
						if (index == 4 || index == 9 || index == 14 || index == 19 || index == 24)
						{
								x = 8;
								y += 36;
						}
				}

				String[] tools = {
						"Thick Skin",
						"Burst of Strength",
						"Clarity of Thought",
						"Rock Skin",
						"Superhuman Strength",
						"Improved Reflexes",
						"Rapid Restore",
						"Rapid Heal",
						"Protect Item",
						"Steel Skin",
						"Ultimate Strength",
						"Incredible Reflexes",
						"Protect from Magic",
						"Protect from Range",
						"Protect from Melee",
						"Retribution",
						"Redemption",
						"Smite"};
				int count = 0;
				for (int j = 5609; j <= 5623; j++)
				{
						RSInterface tab2 = RSInterface.interfaceCache[j];
						tab2.tooltip = "Activate @or2@" + tools[count++];
				}
				for (int j = 683; j <= 685; j++)
				{
						RSInterface tab2 = RSInterface.interfaceCache[j];
						tab2.tooltip = "Activate @or2@" + tools[count++];
				}
		}

		public static void quickPrayers(TextDrawingArea[] TDA)
		{

				//use 22966
				int frame = 0;
				RSInterface tab = RSInterface.addTabInterface(22923);
				RSInterface.addSprite(17201, 147);
				RSInterface.addText(17230, "Select your quick prayers:", TDA, 0, 0xff981f, false, true);
				RSInterface.addTransparentSprite(17229, 245, 50);
				int i = 17202;
				int j = 0;
				for (j = 650; i <= 17228 && j <= 676; j++, i++)
				{
						RSInterface.addConfigButton(i, 22923, 247, 246, 14, 15, "Select", 0, 1, j);
				}
				RSInterface.addConfigButton(22966, 22923, 247, 246, 14, 15, "Select", 0, 1, j);
				j++;
				RSInterface.addConfigButton(22967, 22923, 247, 246, 14, 15, "Select", 0, 1, j);
				j++;
				RSInterface.addConfigButton(22968, 22923, 247, 246, 14, 15, "Select", 0, 1, j);


				RSInterface.addHoverButton(17231, 248, 190, 24, "Confirm Selection", -1, 17232, 1);
				RSInterface.addHoveredButton(17232, 249, 190, 24, 17233);
				RSInterface.setChildren(64, tab);
				RSInterface.setBounds(5632, 5, 28, frame++, tab);
				RSInterface.setBounds(5633, 44, 28, frame++, tab);
				RSInterface.setBounds(5634, 79, 31, frame++, tab);
				RSInterface.setBounds(18001, 116, 30, frame++, tab);
				RSInterface.setBounds(18003, 153, 29, frame++, tab);

				RSInterface.setBounds(5635, 5, 68, frame++, tab);
				RSInterface.setBounds(5636, 44, 67, frame++, tab);
				RSInterface.setBounds(5637, 79, 69, frame++, tab);
				RSInterface.setBounds(5638, 116, 70, frame++, tab);
				RSInterface.setBounds(5639, 154, 70, frame++, tab);

				RSInterface.setBounds(5640, 4, 104, frame++, tab);
				RSInterface.setBounds(18005, 44, 107, frame++, tab);
				RSInterface.setBounds(18007, 81, 105, frame++, tab);
				RSInterface.setBounds(5641, 117, 105, frame++, tab);
				RSInterface.setBounds(5642, 156, 107, frame++, tab);

				RSInterface.setBounds(5643, 5, 145, frame++, tab);
				RSInterface.setBounds(5644, 43, 144, frame++, tab);
				RSInterface.setBounds(686, 83, 144, frame++, tab);
				RSInterface.setBounds(5645, 115, 141, frame++, tab);
				RSInterface.setBounds(18009, 154, 144, frame++, tab);

				RSInterface.setBounds(18011, 5, 180, frame++, tab);
				RSInterface.setBounds(5649, 41, 178, frame++, tab);
				RSInterface.setBounds(5647, 79, 183, frame++, tab);
				RSInterface.setBounds(5648, 116, 178, frame++, tab);
				RSInterface.setBounds(18013, 11, 207, frame++, tab); // Chivalry icon
				RSInterface.setBounds(18015, 40, 221, frame++, tab); // Piety icon
				RSInterface.setBounds(22961, 153, 180, frame++, tab); // Preserve icon
				RSInterface.setBounds(22963, 80, 211, frame++, tab); // Rigour icon
				RSInterface.setBounds(22965, 117, 208, frame++, tab); // Augury icon

				RSInterface.setBounds(17229, 0, 25, frame++, tab);
				RSInterface.setBounds(17201, 0, 22, frame++, tab);
				RSInterface.setBounds(17201, 0, 237, frame++, tab);

				RSInterface.setBounds(17202, 2, 25, frame++, tab); // First prayer defence tick
				RSInterface.setBounds(17203, 41, 25, frame++, tab);
				RSInterface.setBounds(17204, 76, 25, frame++, tab);
				RSInterface.setBounds(17205, 113, 25, frame++, tab);
				RSInterface.setBounds(17206, 150, 25, frame++, tab);
				RSInterface.setBounds(17207, 2, 65, frame++, tab);
				RSInterface.setBounds(17208, 41, 65, frame++, tab);
				RSInterface.setBounds(17209, 76, 65, frame++, tab);
				RSInterface.setBounds(17210, 113, 65, frame++, tab);
				RSInterface.setBounds(17211, 150, 65, frame++, tab);
				RSInterface.setBounds(17212, 2, 102, frame++, tab);
				RSInterface.setBounds(17213, 41, 102, frame++, tab);
				RSInterface.setBounds(17214, 76, 102, frame++, tab);
				RSInterface.setBounds(17215, 113, 102, frame++, tab);
				RSInterface.setBounds(17216, 150, 102, frame++, tab);
				RSInterface.setBounds(17217, 2, 141, frame++, tab);
				RSInterface.setBounds(17218, 41, 141, frame++, tab);
				RSInterface.setBounds(17219, 76, 141, frame++, tab);
				RSInterface.setBounds(17220, 113, 141, frame++, tab);
				RSInterface.setBounds(17221, 150, 141, frame++, tab);
				RSInterface.setBounds(17222, 2, 177, frame++, tab);
				RSInterface.setBounds(17223, 41, 177, frame++, tab);
				RSInterface.setBounds(17224, 76, 177, frame++, tab);
				RSInterface.setBounds(17225, 113, 177, frame++, tab);
				RSInterface.setBounds(17226, 150, 177, frame++, tab); // Chivalry tick
				RSInterface.setBounds(17227, 1, 211, frame++, tab); // Piety tick
				RSInterface.setBounds(22966, 41, 211, frame++, tab); //
				RSInterface.setBounds(22967, 76, 211, frame++, tab); //
				RSInterface.setBounds(22968, 113, 211, frame++, tab); //

				RSInterface.setBounds(17230, 5, 5, frame++, tab);
				RSInterface.setBounds(17231, 5, 237, frame++, tab);
				RSInterface.setBounds(17232, 5, 237, frame++, tab);
		}

		public static void questInterface(TextDrawingArea atextdrawingarea[])
		{
				RSInterface rsinterface = RSInterface.addInterface(25000, 21, 497, 8, 330);
				rsinterface.centerText = true;
				RSInterface.addSprite(25001, 243);
				RSInterface.addSprite(25002, 244);
				RSInterface.addText(25003, "", 0, true, false, 52, atextdrawingarea, 3);
				RSInterface.addHover(25004, 3, 0, 25005, 241, 26, 23, "Close Window");
				RSInterface.addHovered(25005, 242, 26, 23, 25006);
				RSInterface.setChildren(6, rsinterface);
				RSInterface.setBounds(25002, 18, 4, 0, rsinterface);
				RSInterface.setBounds(25001, 18, 62, 1, rsinterface);
				RSInterface.setBounds(25003, 260, 15, 2, rsinterface);
				RSInterface.setBounds(25007, 50, 86, 3, rsinterface);
				RSInterface.setBounds(25004, 452, 63, 4, rsinterface);
				RSInterface.setBounds(25005, 452, 63, 5, rsinterface);
				rsinterface = RSInterface.addInterface(25007);
				rsinterface.height = 217;
				rsinterface.width = 404;
				rsinterface.scrollMax = 1700;
				RSInterface.setChildren(91, rsinterface);
				int i = 18;
				int j = 0;
				for (int k = 25008; k <= 25098; k++)
				{
						RSInterface.addText(k, "", 128, true, false, 52, atextdrawingarea, 1);
						RSInterface.setBounds(k, 202, i, j, rsinterface);
						j++;
						i += 19;
						i++;
				}
		}

		public static void gameMode(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addTabInterface(25100, 95, 424, 46, 295);
				tab.totalChildren(34);
				int x1 = 105;
				int x2 = 126;
				int x3 = 204;

				RSInterface.addSprite(25101, 325);
				tab.child(0, 25101, 90, 43);
				RSInterface.addText(25102, "@yel@Choose your game mode.", tda, 1, 0xff9b00, false, true);
				tab.child(1, 25102, 203, 55);

				RSInterface.addText(25103, "@yel@Game mode information:", tda, 1, 0xff9b00, false, true);
				tab.child(2, 25103, 206, 90);

				RSInterface.addHoverButton(25109, 288, 85, 20, "View", -1, 25110, 1);
				tab.child(3, 25109, x1, 87);
				RSInterface.addHoveredButton(25110, 289, 85, 20, 25111);
				tab.child(4, 25110, x1, 87);
				RSInterface.addText(25112, "@yel@Defender", tda, 0, 0xff9b00, false, true);
				tab.child(5, 25112, x2, 92);

				RSInterface.addHoverButton(25113, 288, 85, 20, "View", -1, 25114, 1);
				tab.child(6, 25113, x1, 127);
				RSInterface.addHoveredButton(25114, 289, 85, 20, 25115);
				tab.child(7, 25114, x1, 127);
				RSInterface.addText(25116, "@yel@Veteran", tda, 0, 0xff9b00, false, true);
				tab.child(8, 25116, x2, 132);

				RSInterface.addHoverButton(25117, 288, 85, 20, "View", -1, 25118, 1);
				tab.child(9, 25117, x1, 167);
				RSInterface.addHoveredButton(25118, 289, 85, 20, 25119);
				tab.child(10, 25118, x1, 167);
				RSInterface.addText(25120, "@yel@Gladiator", tda, 0, 0xff9b00, false, true);
				tab.child(11, 25120, x2, 172);

				RSInterface.addHoverButton(25121, 288, 85, 20, "View", -1, 25122, 1);
				tab.child(31, 25121, x1, 207);
				RSInterface.addHoveredButton(25122, 289, 85, 20, 25123);
				tab.child(32, 25122, x1, 207);
				RSInterface.addText(25124, "@yel@Iron Man", tda, 0, 0xff9b00, false, true);
				tab.child(33, 25124, x2, 212);

				RSInterface.addHoverButton(25125, 323, 72, 26, "View", -1, 25126, 1);
				tab.child(12, 25125, 112, 253);
				RSInterface.addHoveredButton(25126, 324, 72, 26, 25127);
				tab.child(13, 25126, 112, 253);
				RSInterface.addText(25128, "@yel@Accept", tda, 0, 0xff9b00, false, true);
				tab.child(14, 25128, 129, 259);

				RSInterface.addText(25129, "", tda, 0, 0xff9b00, false, true);
				tab.child(15, 25129, x3, 108);

				RSInterface.addText(25130, "", tda, 0, 0xff9b00, false, true);
				tab.child(16, 25130, x3, 122);

				RSInterface.addText(25131, "", tda, 0, 0xff9b00, false, true);
				tab.child(17, 25131, x3, 136);

				RSInterface.addText(25132, "", tda, 0, 0xff9b00, false, true);
				tab.child(18, 25132, x3, 150);

				RSInterface.addText(25133, "", tda, 0, 0xff9b00, false, true);
				tab.child(19, 25133, x3, 164);

				RSInterface.addText(25134, "", tda, 0, 0xff9b00, false, true);
				tab.child(20, 25134, x3, 178);

				RSInterface.addText(25135, "", tda, 0, 0xff9b00, false, true);
				tab.child(21, 25135, x3, 192);

				RSInterface.addText(25136, "", tda, 0, 0xff9b00, false, true);
				tab.child(22, 25136, x3, 206);

				RSInterface.addText(25137, "", tda, 0, 0xff9b00, false, true);
				tab.child(23, 25137, x3, 220);

				RSInterface.addText(25138, "", tda, 0, 0xff9b00, false, true);
				tab.child(24, 25138, x3, 234);

				RSInterface.addText(25139, "", tda, 0, 0xff9b00, false, true);
				tab.child(25, 25139, x3, 248);

				RSInterface.addText(25140, "", tda, 0, 0xff9b00, false, true);
				tab.child(26, 25140, x3, 262);

				RSInterface.addText(25141, "", tda, 0, 0xff9b00, false, true);
				tab.child(27, 25141, x3, 276);

				RSInterface.addText(25142, "", tda, 0, 0xff9b00, false, true);
				tab.child(28, 25142, x3, 290);

				RSInterface.addText(25143, "", tda, 0, 0xff9b00, false, true);
				tab.child(29, 25143, x3, 304);

				RSInterface.addText(25144, "@yel@This action is permanent.", tda, 1, 0xff9b00, false, true);
				tab.child(30, 25144, 203, 70);
		}

		public static void clientSettings(TextDrawingArea[] tda)
		{
				RSInterface rsi = RSInterface.addTabInterface(17300);
				RSInterface.addSprite(17301, 286);
				RSInterface.addText(17302, "@yel@Settings", tda, 2, 0xFFFFFF, true, true);
				RSInterface.addHoverButton(17303, 148, 16, 16, "Close Window", -1, 17304, 1);
				RSInterface.addHoveredButton(17304, 149, 16, 16, 17305);
				RSInterface.addSprite(17306, 285);
				RSInterface.addSprite(17307, 285);
				RSInterface.addHoverButton(17295, 253, 16, 16, "Next", -1, 17296, 1);
				RSInterface.addHoveredButton(17296, 254, 16, 16, 17297);
				RSInterface.addText(17298, "Page 1/5", tda, 0, 0xffb000, true, true);
				int child1 = 0;
				int base = 17310;
				String[] settingName = {"Gameframe: @gr3@562", "Hitsplats: @gr3@562", "New menu", "XP counter  ", "X10 damage  ", "New HP bar  ", "Summ orb"};
				int settingsAmount = settingName.length;
				int order1 = 0;
				for (int i = 0; i < settingsAmount; i++)
				{
						RSInterface.addHoverButton(base + child1, 342, 122, 24, "Toggle " + Settings.settingName1[i], -1, (base + child1) + 1, 1);
						child1++;
						RSInterface.addHoveredButton(base + child1, 343, 122, 24, (base + child1) + 1);
						child1 += 2;
						RSInterface.addText(base + child1, settingName[order1], tda, 1, 0xffb000, true, true);
						child1++;
						order1++;
				}
				int child = 0;
				int y = 41;
				int order = 9;
				rsi.totalChildren((settingsAmount * 3) + order);
				rsi.child(0, 17301, 0, 44); // Background.
				rsi.child(1, 17302, 90, 6); // Settings text.
				rsi.child(2, 17303, 171, 6); // Close.
				rsi.child(3, 17304, 171, 6); // Close hover.
				rsi.child(4, 17306, 0, 44); // Line.
				rsi.child(5, 17307, 0, 250); // Line.
				rsi.child(6, 17295, 171, 25); // Arrow.
				rsi.child(7, 17296, 171, 25); // Arrow.
				rsi.child(8, 17298, 124, 28); // Page text.

				for (int i = 0; i < settingsAmount; i++)
				{
						rsi.child(order, base + child, 34, y + 10); // Hover.
						child++;
						order++;
						rsi.child(order, base + child, 34, y + 10); // Hover.
						order++;
						child++;
						child++;
						rsi.child(order, base + child, 93, y + 15);
						order++;
						child++;
						y += 28;
				}
		}

		public static void questTabOld(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addTabInterface(19500);
				RSInterface.addSprite(28024, 287);
				RSInterface.addHoverButton(28000, 288, 85, 20, "View", -1, 28001, 1);
				RSInterface.addHoveredButton(28001, 289, 85, 20, 28002);
				RSInterface.addText(28003, "Achievements", tda, 1, 0xffb000, false, true);
				RSInterface.addHoverButton(28004, 288, 85, 20, "View", -1, 28005, 1);
				RSInterface.addHoveredButton(28005, 289, 85, 20, 28006);
				RSInterface.addText(28007, "Profile", tda, 1, 0xffb000, true, true);
//				RSInterface.addHoverButton(28008, 288, 85, 20, "View", -1, 28009, 1);
//				RSInterface.addHoveredButton(28009, 289, 85, 20, 28010);
//				RSInterface.addText(28011, "Quick setup", tda, 1, 0xffb000, true, true);
				RSInterface.addHoverButton(28012, 288, 85, 20, "View", -1, 28013, 1);
				RSInterface.addHoveredButton(28013, 289, 85, 20, 28014);
				RSInterface.addText(28015, "Guide", tda, 1, 0xffb000, true, true);
				tab.totalChildren(11);
				tab.child(0, 28024, 2, 65); // Statistics background.
				tab.child(1, 28000, 5, 9); // Achievements button.
				tab.child(2, 28001, 5, 9); // Achievements button hover.
				tab.child(3, 28003, 8, 11); // Achievements text.
				tab.child(4, 28004, 98, 9); // Achievements button.
				tab.child(5, 28005, 98, 9); // Achievements button hover.
				tab.child(6, 28007, 140, 11); // Achievements text.
//				tab.child(7, 28008, 5, 37); // Achievements button.
//				tab.child(8, 28009, 5, 37); // Achievements button hover.
//				tab.child(9, 28011, 49, 39); // Achievements text.
				tab.child(7, 28012, 98, 37); // Achievements button.
				tab.child(8, 28013, 98, 37); // Achievements button hover.
				tab.child(9, 28015, 140, 39); // Achievements text.

				RSInterface scrollTab1 = RSInterface.addInterface(28025);
				tab.child(10, 28025, 8, 67); // Scroll interface.

				int scrollChildren = 35;
				scrollTab1.totalChildren(scrollChildren);
				int y = 4;
				for (int index = 0; index < scrollChildren; index++)
				{

						if (index == 0 || index == 4 || index == 9)
						{
								RSInterface.addText(28026 + index, "", tda, 0, 0xffb000, false, true);
						}
						else
						{
								if (index <= 9)
								{
										RSInterface.addText(28026 + index, "", tda, 0, 0xffb000, false, true);
								}
								else
								{
										RSInterface.addText(28026 + index, "", tda, 0, 0xffb000, false, true, 0xffffff, "Quick chat", 226);
								}
						}
						scrollTab1.child(index, 28026 + index, 0, y);
						y += 13;
				}

				scrollTab1.width = 159;
				scrollTab1.height = 183;
				scrollTab1.scrollMax = 360;

		}

		public static void modernSpellBook(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addTabInterface(1151);
				RSInterface homeHover = RSInterface.addTabInterface(1196);
				RSInterface spellButtons = RSInterface.interfaceCache[12424];

				spellButtons.scrollMax = 0;
				spellButtons.height = 260;
				spellButtons.width = 190;
				int[] spellButton = {
						1196,
						1199,
						1206,
						1215,
						1224,
						1231,
						1240,
						1249,
						1258,
						1267,
						1274,
						1283,
						1573,
						1290,
						1299,
						1308,
						1315,
						1324,
						1333,
						1340,
						1349,
						1358,
						1367,
						1374,
						1381,
						1388,
						1397,
						1404,
						1583,
						12038,
						1414,
						1421,
						1430,
						1437,
						1446,
						1453,
						1460,
						1469,
						15878,
						1602,
						1613,
						1624,
						7456,
						1478,
						1485,
						1494,
						1503,
						1512,
						1521,
						1530,
						1544,
						1553,
						1563,
						1593,
						1635,
						12426,
						12436,
						12446,
						12456,
						6004,
						18471};
				tab.totalChildren(63);
				tab.child(0, 12424, 13, 24);
				tab.child(1, 1195, 13, 24);
				for (int i1 = 0; i1 < spellButton.length; i1++)
				{
						int yPos = i1 > 34 ? 8 : 183;
						tab.child(i1 + 2, spellButton[i1], 5, yPos);
						RSInterface.addButton(1195, Client.clientRevision("474") || Client.clientRevision("525") ? 651 : 165, "Cast @gre@Home Teleport");
						RSInterface homeButton = RSInterface.interfaceCache[1195];
						homeButton.isMouseoverTriggered = 1196;
				}
				for (int i2 = 0; i2 < spellButton.length; i2++)
				{
						if (i2 < 60)
						{
								spellButtons.childX[i2] = spellButtons.childX[i2] + 24;
						}
						if (i2 == 6 || i2 == 12 || i2 == 19 || i2 == 35 || i2 == 41 || i2 == 44 || i2 == 49 || i2 == 51)
						{
								spellButtons.childX[i2] = 0;
						}
						spellButtons.childY[6] = 24;
						spellButtons.childY[12] = 48;
						spellButtons.childY[19] = 72;
						spellButtons.childY[49] = 96;
						spellButtons.childY[44] = 120;
						spellButtons.childY[35] = 170;

						spellButtons.childY[21] = 67; // Superheat item.
						spellButtons.childY[41] = 195; // Charge.
						spellButtons.childY[51] = 147; // Trollheim teleport.
						spellButtons.childY[53] = 172; // Teleother lumbridge.
						spellButtons.childX[53] = 74; // Teleother lumbridge.
						spellButtons.childY[54] = 195; // Teleother falador.
						spellButtons.childY[55] = 195; // Teleblock.
						spellButtons.childX[55] = 50; // Teleblock.
						spellButtons.childY[56] = 194; // Teleother camelot.
						spellButtons.childX[56] = 97; // Teleother camelot.
						spellButtons.childY[57] = 194; // Lvl-6 enchant.
						spellButtons.childX[57] = 74; // Lvl-6 enchant.
						spellButtons.childX[46] = 46; // Enfeeble.
						spellButtons.childY[46] = 168; // Enfeeble.
						spellButtons.childX[35] = -2; // Lvl-5 enchant.
						spellButtons.childX[36] = 22; // Earth wave.
						spellButtons.childY[36] = 167; // Earth wave.
						spellButtons.childX[31] = 23; // Wind wave.
						spellButtons.childY[31] = 143; // Wind wave.
						spellButtons.childX[43] = 49; //Test
						spellButtons.childX[30] = 49; //Test
						spellButtons.childX[32] = 49; //Test
						spellButtons.childX[38] = 98; //Test
						spellButtons.childY[38] = 123; //Test
				}
				homeHover.interfaceShown = true;
				RSInterface.addText(1197, "Level 0: Home Teleport", tda, 1, 0xFE981F, true, true);
				RSInterface homeLevel = RSInterface.interfaceCache[1197];
				homeLevel.width = 174;
				homeLevel.height = 68;
				RSInterface.addText(1198, "A teleport which requires no", tda, 0, 0xAF6A1A, true, true);
				RSInterface.addText(18998, "runes and no required level that", tda, 0, 0xAF6A1A, true, true);
				RSInterface.addText(18999, "teleports you to the main land.", tda, 0, 0xAF6A1A, true, true);
				homeHover.totalChildren(4);
				homeHover.child(0, 1197, 3, 4);
				homeHover.child(1, 1198, 91, 23);
				homeHover.child(2, 18998, 91, 34);
				homeHover.child(3, 18999, 91, 45);

		}

		public static void ancientMagicTab1(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addInterface(24800);
				RSInterface.addButton(12856, Client.clientRevision("474") || Client.clientRevision("525") ? 651 : 165, "Cast @gre@Home Teleport");
				RSInterface homeButton = RSInterface.interfaceCache[12856];
				homeButton.isMouseoverTriggered = 1196;
				int[] itfChildren = {
						// teleport below
						12856,
						13035,
						13045,
						13053,
						13061,
						13069,
						13079,
						13087,
						13095,
						12939,
						12987,

						// combat below
						12901,
						12861,
						12963,
						13011,
						12919,
						12881,
						12951,
						12999,
						12911,
						12871,
						12975,
						13023,
						12929,
						12891,

						// hover ids below
						1196,
						12940,
						12988,
						13036,
						12902,
						12862,
						13046,
						12964,
						13012,
						13054,
						12920,
						12882,
						13062,
						12952,
						13000,
						13070,
						12912,
						12872,
						13080,
						12976,
						13024,
						13088,
						12930,
						12892,
						13096};
				RSInterface.addSprite(24801, 299);
				RSInterface.addSprite(24802, 300);
				RSInterface.addSprite(24803, 300);
				RSInterface.addSprite(24804, 291);
				RSInterface.addSprite(24805, 290);
				RSInterface.addSprite(24806, 290);
				RSInterface.addSprite(24807, 290);
				RSInterface.addSprite(24808, 296);
				RSInterface.addSprite(24809, 297);
				RSInterface.addSprite(24810, 298);
				RSInterface.addSprite(24811, 295);
				RSInterface.addHoverButton(24812, 301, 18, 18, "Toggle", -1, 24813, 1);
				RSInterface.addHoveredButton(24813, 302, 18, 18, 24814);
				RSInterface.addHoverButton(24815, 305, 18, 18, "Toggle", -1, 24816, 1);
				RSInterface.addHoveredButton(24816, 306, 18, 18, 24817);
				tab.totalChildren(itfChildren.length + 15);
				for (int i1 = 0, xPos = 20, yPos = 11; i1 < itfChildren.length; i1++, xPos += 44) // x 60/18 is original, 18/8 y is original, 45 is original of x.
				{
						if (xPos > 175)
						{
								xPos = 19;
								yPos += 28;
						}
						if (i1 < 25)
						{
								tab.child(i1, itfChildren[i1], xPos, yPos);
						}
						if (i1 > 24)
						{
								yPos = i1 < 41 ? 181 : 1;
								if (yPos > 150)
								{
										yPos = 150;
								}
								tab.child(i1, itfChildren[i1], 4, yPos);
						}
				}
				tab.child(itfChildren.length, 24801, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 4, 228);
				tab.child(itfChildren.length + 1, 24802, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 30, 230);
				tab.child(itfChildren.length + 2, 24803, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 115, 230);
				tab.child(itfChildren.length + 3, 24804, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 7, 237);
				tab.child(itfChildren.length + 4, 24805, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 44, 236);
				tab.child(itfChildren.length + 5, 24806, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 84, 236);
				tab.child(itfChildren.length + 6, 24807, 164, 237);
				tab.child(itfChildren.length + 7, 24808, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 10, 240);
				tab.child(itfChildren.length + 8, 24809, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 47, 239);
				tab.child(itfChildren.length + 9, 24810, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 88, 240);
				tab.child(itfChildren.length + 10, 24811, 167, 240);
				tab.child(itfChildren.length + 11, 24812, 124, 237);
				tab.child(itfChildren.length + 12, 24813, 124, 237);
				tab.child(itfChildren.length + 13, 24815, 144, 237);
				tab.child(itfChildren.length + 14, 24816, 144, 237);
		}

		public static void ancientMagicTab2(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addInterface(24818);
				RSInterface.addButton(12856, Client.clientRevision("474") || Client.clientRevision("525") ? 651 : 165, "Cast @gre@Home Teleport");
				RSInterface homeButton = RSInterface.interfaceCache[12856];
				homeButton.isMouseoverTriggered = 1196;
				int[] itfChildren = {
						// combat below
						12939,
						12987,
						12901,
						12861,
						12963,
						13011,
						12919,
						12881,
						12951,
						12999,
						12911,
						12871,
						12975,
						13023,
						12929,
						12891,

						// teleport below
						12856,
						13035,
						13045,
						13053,
						13061,
						13069,
						13079,
						13087,
						13095,

						// hover ids below
						1196,
						12940,
						12988,
						13036,
						12902,
						12862,
						13046,
						12964,
						13012,
						13054,
						12920,
						12882,
						13062,
						12952,
						13000,
						13070,
						12912,
						12872,
						13080,
						12976,
						13024,
						13088,
						12930,
						12892,
						13096};
				RSInterface.addSprite(24819, 299);
				RSInterface.addSprite(24820, 300);
				RSInterface.addSprite(24821, 300);
				RSInterface.addSprite(24822, 291);
				RSInterface.addSprite(24823, 290);
				RSInterface.addSprite(24824, 290);
				RSInterface.addSprite(24825, 290);
				RSInterface.addSprite(24826, 296);
				RSInterface.addSprite(24827, 297);
				RSInterface.addSprite(24828, 298);
				RSInterface.addSprite(24829, 294);
				RSInterface.addHoverButton(24830, 303, 18, 18, "Toggle", -1, 24831, 1);
				RSInterface.addHoveredButton(24831, 304, 18, 18, 24832);
				RSInterface.addHoverButton(24833, 301, 18, 18, "Toggle", -1, 24834, 1);
				RSInterface.addHoveredButton(24834, 302, 18, 18, 24835);
				tab.totalChildren(itfChildren.length + 15);
				for (int i1 = 0, xPos = 20, yPos = 11; i1 < itfChildren.length; i1++, xPos += 44) // x 60/18 is original, 18/8 y is original, 45 is original of x.
				{
						if (xPos > 175)
						{
								xPos = 19;
								yPos += 28;
						}
						if (i1 < 25)
						{
								tab.child(i1, itfChildren[i1], xPos, yPos);
						}
						if (i1 > 24)
						{
								yPos = i1 < 41 ? 181 : 1;
								if (yPos > 150)
								{
										yPos = 150;
								}
								tab.child(i1, itfChildren[i1], 4, yPos);
						}
				}
				tab.child(itfChildren.length, 24819, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 4, 228);
				tab.child(itfChildren.length + 1, 24820, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 30, 230);
				tab.child(itfChildren.length + 2, 24821, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 115, 230);
				tab.child(itfChildren.length + 3, 24822, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 7, 237);
				tab.child(itfChildren.length + 4, 24823, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 44, 236);
				tab.child(itfChildren.length + 5, 24824, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 84, 236);
				tab.child(itfChildren.length + 6, 24825, 144, 237);
				tab.child(itfChildren.length + 7, 24826, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 10, 240);
				tab.child(itfChildren.length + 8, 24827, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 47, 239);
				tab.child(itfChildren.length + 9, 24828, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 88, 240);
				tab.child(itfChildren.length + 10, 24829, 148, 242);
				tab.child(itfChildren.length + 11, 24830, 164, 237);
				tab.child(itfChildren.length + 12, 24831, 164, 237);
				tab.child(itfChildren.length + 13, 24833, 124, 237);
				tab.child(itfChildren.length + 14, 24834, 124, 237);
		}

		public static void ancientMagicTab(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addInterface(24836);
				RSInterface.addButton(12856, Client.clientRevision("474") || Client.clientRevision("525") ? 651 : 165, "Cast @gre@Home Teleport");
				RSInterface homeButton = RSInterface.interfaceCache[12856];
				homeButton.isMouseoverTriggered = 1196;
				int[] itfChildren = {
						12856,
						12939,
						12987,
						13035,
						12901,
						12861,
						13045,
						12963,
						13011,
						13053,
						12919,
						12881,
						13061,
						12951,
						12999,
						13069,
						12911,
						12871,
						13079,
						12975,
						13023,
						13087,
						12929,
						12891,
						13095,
						1196,
						12940,
						12988,
						13036,
						12902,
						12862,
						13046,
						12964,
						13012,
						13054,
						12920,
						12882,
						13062,
						12952,
						13000,
						13070,
						12912,
						12872,
						13080,
						12976,
						13024,
						13088,
						12930,
						12892,
						13096};
				RSInterface.addSprite(24837, 299);
				RSInterface.addSprite(24838, 300);
				RSInterface.addSprite(24839, 300);
				RSInterface.addSprite(24840, 291);
				RSInterface.addSprite(24841, 290);
				RSInterface.addSprite(24842, 290);
				RSInterface.addSprite(24843, 290);
				RSInterface.addSprite(24844, 296);
				RSInterface.addSprite(24845, 297);
				RSInterface.addSprite(24846, 298);
				RSInterface.addSprite(24847, 293);
				RSInterface.addHoverButton(24848, 305, 18, 18, "Toggle", -1, 24849, 1);
				RSInterface.addHoveredButton(24849, 306, 18, 18, 24850);
				RSInterface.addHoverButton(24851, 303, 18, 18, "Toggle", -1, 24852, 1);
				RSInterface.addHoveredButton(24852, 304, 18, 18, 24853);
				RSInterface.addSprite(24855, 731);
				tab.totalChildren(itfChildren.length + 15 + (Client.clientRevision("474") ? 1 : 0));
				for (int i1 = 0, xPos = 20, yPos = 11; i1 < itfChildren.length; i1++, xPos += 44) // x 60/18 is original, 18/8 y is original, 45 is original of x.
				{
						if (Client.clientRevision("474"))
						{
								if (i1 == 19)
								{
										xPos += 50;
								}
						}
						if (xPos > 175)
						{
								xPos = 20;
								yPos += 28;
						}
						if (i1 < 25)
						{
								tab.child(i1, itfChildren[i1], xPos, yPos);
						}
						if (i1 > 24)
						{
								yPos = i1 < 41 ? 181 : 1;
								if (yPos > 150)
								{
										yPos = 150;
								}
								tab.child(i1, itfChildren[i1], 4, yPos);
						}
				}
				tab.child(itfChildren.length, 24837, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 4, 228);
				tab.child(itfChildren.length + 1, 24838, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 30, 230);
				tab.child(itfChildren.length + 2, 24839, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 115, 230);
				tab.child(itfChildren.length + 3, 24840, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 7, 237);
				tab.child(itfChildren.length + 4, 24841, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 44, 236);
				tab.child(itfChildren.length + 5, 24842, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 84, 236);
				tab.child(itfChildren.length + 6, 24843, 124, 237);
				tab.child(itfChildren.length + 7, 24844, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 10, 240);
				tab.child(itfChildren.length + 8, 24845, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 47, 239);
				tab.child(itfChildren.length + 9, 24846, Client.clientRevision("474") || Client.clientRevision("525") ? 500 : 88, 240);
				tab.child(itfChildren.length + 10, 24847, 128, 242);
				tab.child(itfChildren.length + 11, 24848, 144, 237);
				tab.child(itfChildren.length + 12, 24849, 144, 237);
				tab.child(itfChildren.length + 13, 24851, 164, 237);
				tab.child(itfChildren.length + 14, 24852, 164, 237);
				if (Client.clientRevision("474"))
				{
						tab.child(itfChildren.length + 15, 24855, 149, 121);
				}
		}

		public static void clientSettings1(TextDrawingArea[] tda)
		{
				RSInterface rsi = RSInterface.addTabInterface(17338);
				RSInterface.addHoverButton(17292, 251, 16, 16, "Next", -1, 17293, 1);
				RSInterface.addHoveredButton(17293, 252, 16, 164, 17294);
				int child1 = 0;
				int base = 17339;
				String[] settingName = {"Names  ", "Smooth char turn     ", "Cursor", "Zoom: @gr3@Normal", "Cam speed: @gr3@Slow", "New click", "Old Wild level"};
				int settingsAmount = settingName.length;
				int order1 = 0;
				for (int i = 0; i < settingsAmount; i++)
				{
						RSInterface.addHoverButton(base + child1, 342, 122, 24, "Toggle " + Settings.settingName1[i + 7], -1, (base + child1) + 1, 1);
						child1++;
						RSInterface.addHoveredButton(base + child1, 343, 122, 24, (base + child1) + 1);
						child1 += 2;
						RSInterface.addText(base + child1, settingName[order1], tda, 1, 0xffb000, true, true);
						child1++;
						order1++;
				}
				int child = 0;
				int y = 41;
				int order = 11;
				rsi.totalChildren((settingsAmount * 3) + order);
				rsi.child(0, 17301, 0, 44); // Background.
				rsi.child(1, 17302, 90, 6); // Settings text.
				rsi.child(2, 17303, 171, 6); // Close.
				rsi.child(3, 17304, 171, 6); // Close hover.
				rsi.child(4, 17306, 0, 44); // Line.
				rsi.child(5, 17307, 0, 250); // Line.
				rsi.child(6, 17295, 171, 25); // Arrow.
				rsi.child(7, 17296, 171, 25); // Arrow.
				rsi.child(8, 17292, 151, 25); // Arrow.
				rsi.child(9, 17293, 151, 25); // Arrow.
				rsi.child(10, 17298, 124, 28); // Page text.
				for (int i = 0; i < settingsAmount; i++)
				{
						rsi.child(order, base + child, 34, y + 10); // Hover.
						child++;
						order++;
						rsi.child(order, base + child, 34, y + 10); // Hover.
						order++;
						child++;
						child++;
						rsi.child(order, base + child, 93, y + 15);
						order++;
						child++;
						y += 28;
				}
		}

		public static void clientSettings2(TextDrawingArea[] tda)
		{
				RSInterface rsi = RSInterface.addTabInterface(17367);
				RSInterface.addText(17291, "@yel@Performance", tda, 2, 0xFFFFFF, true, true);
				int child1 = 0;
				int base = 17368;
				String[] settingName = {"Smooth textures     ", "Smooth shadows     ", "Soft animations    ", "Detail: @gr3@High", "HD floor", "Fog: @gr3@Off black", "New font   "};
				int settingsAmount = settingName.length;
				int order1 = 0;
				for (int i = 0; i < settingsAmount; i++)
				{
						RSInterface.addHoverButton(base + child1, 342, 122, 24, "Toggle " + Settings.settingName1[i + 14], -1, (base + child1) + 1, 1);
						child1++;
						RSInterface.addHoveredButton(base + child1, 343, 122, 24, (base + child1) + 1);
						child1 += 2;
						RSInterface.addText(base + child1, settingName[order1], tda, 1, 0xffb000, true, true);
						child1++;
						order1++;
				}
				int child = 0;
				int y = 41;
				int order = 11;
				rsi.totalChildren((settingsAmount * 3) + order);
				rsi.child(0, 17301, 0, 44); // Background.
				rsi.child(1, 17291, 90, 6); // Settings text.
				rsi.child(2, 17303, 171, 6); // Close.
				rsi.child(3, 17304, 171, 6); // Close hover.
				rsi.child(4, 17306, 0, 44); // Line.
				rsi.child(5, 17307, 0, 250); // Line.
				rsi.child(6, 17295, 171, 25); // Arrow.
				rsi.child(7, 17296, 171, 25); // Arrow.
				rsi.child(8, 17292, 151, 25); // Arrow.
				rsi.child(9, 17293, 151, 25); // Arrow.
				rsi.child(10, 17298, 124, 28); // Page text.
				for (int i = 0; i < settingsAmount; i++)
				{
						rsi.child(order, base + child, 34, y + 10); // Hover.
						child++;
						order++;
						rsi.child(order, base + child, 34, y + 10); // Hover.
						order++;
						child++;
						child++;
						rsi.child(order, base + child, 93, y + 15);
						order++;
						child++;
						y += 28;
				}
		}

		public static void clientSettings3(TextDrawingArea[] tda)
		{
				RSInterface rsi = RSInterface.addTabInterface(17299);
				int child1 = 0;
				int base = 17396;
				String[] settingName = {"Smooth minimap     ", "Roofs     "};
				int settingsAmount = settingName.length;
				int order1 = 0;
				for (int i = 0; i < settingsAmount; i++)
				{
						RSInterface.addHoverButton(base + child1, 342, 122, 24, "Toggle " + Settings.settingName1[i + 21], -1, (base + child1) + 1, 1);
						child1++;
						RSInterface.addHoveredButton(base + child1, 343, 122, 24, (base + child1) + 1);
						child1 += 2;
						RSInterface.addText(base + child1, settingName[order1], tda, 1, 0xffb000, true, true);
						child1++;
						order1++;
				}
				int child = 0;
				int y = 41;
				int order = 9;
				rsi.totalChildren((settingsAmount * 3) + order);
				rsi.child(0, 17301, 0, 44); // Background.
				rsi.child(1, 17291, 90, 6); // Settings text.
				rsi.child(2, 17303, 171, 6); // Close.
				rsi.child(3, 17304, 171, 6); // Close hover.
				rsi.child(4, 17306, 0, 44); // Line.
				rsi.child(5, 17307, 0, 250); // Line.
				rsi.child(6, 17292, 151, 25); // Arrow.
				rsi.child(7, 17293, 151, 25); // Arrow.
				rsi.child(8, 17298, 124, 28); // Page text.
				for (int i = 0; i < settingsAmount; i++)
				{
						rsi.child(order, base + child, 34, y + 10); // Hover.
						child++;
						order++;
						rsi.child(order, base + child, 34, y + 10); // Hover.
						order++;
						child++;
						child++;
						rsi.child(order, base + child, 93, y + 15);
						order++;
						child++;
						y += 28;
				}
		}

		public static void itemsOnDeath(TextDrawingArea[] tda)
		{
				RSInterface rsinterface = RSInterface.addInterface(17100, 12, 507, 12, 328);
				RSInterface.addSprite(17101, 310);
				RSInterface.addHover(17102, 3, 0, 10601, 148, 17, 17, "Close Window");
				RSInterface.addHovered(10601, 149, 17, 17, 10602);
				RSInterface.addText(17103, "Items Kept On Death", 0xff981f, false, true, 0, tda, 2);
				RSInterface.addText(17104, "Items you will keep on death (if not skulled):", 0xff981f, false, true, 0, tda, 2);
				RSInterface.addText(17105, "Items you will lose on death (if not skulled):", 0xff981f, false, true, 0, tda, 2);
				RSInterface.addText(17106, "Information", 0xff981f, false, true, 0, tda, 1);
				RSInterface.addText(17107, "Max items kept on death:", 0xff981f, false, true, 0, tda, 1);
				RSInterface.addText(17108, "~ 3 ~", 0xffcc33, false, true, 0, tda, 1);
				RSInterface.addText(17131, "Carried wealth:", ClientConstants.ORANGE, false, true, 0, tda, 0);
				RSInterface.addText(17132, "", ClientConstants.ORANGE, false, true, 0, tda, 0);
				RSInterface.addText(17133, "Risked wealth:", ClientConstants.ORANGE, false, true, 0, tda, 0);
				RSInterface.addText(17134, "", ClientConstants.ORANGE, false, true, 0, tda, 0);
				rsinterface.scrollMax = 0;
				rsinterface.interfaceShown = false;
				rsinterface.children = new int[16];
				rsinterface.childX = new int[16];
				rsinterface.childY = new int[16];

				rsinterface.children[0] = 17101;
				rsinterface.childX[0] = 7;
				rsinterface.childY[0] = 8;
				rsinterface.children[1] = 17102;
				rsinterface.childX[1] = 480;
				rsinterface.childY[1] = 17;
				rsinterface.children[2] = 17103;
				rsinterface.childX[2] = 185;
				rsinterface.childY[2] = 18;
				rsinterface.children[3] = 17104;
				rsinterface.childX[3] = 22;
				rsinterface.childY[3] = 50;
				rsinterface.children[4] = 17105;
				rsinterface.childX[4] = 22;
				rsinterface.childY[4] = 110;
				rsinterface.children[5] = 17106;
				rsinterface.childX[5] = 347;
				rsinterface.childY[5] = 47;
				rsinterface.children[6] = 17107;
				rsinterface.childX[6] = 349;
				rsinterface.childY[6] = 270;
				rsinterface.children[7] = 17108;
				rsinterface.childX[7] = 398;
				rsinterface.childY[7] = 298;
				rsinterface.children[8] = 17115;
				rsinterface.childX[8] = 348;
				rsinterface.childY[8] = 64;
				rsinterface.children[9] = 10494;
				rsinterface.childX[9] = 26;
				rsinterface.childY[9] = 74;
				rsinterface.children[10] = 10600;
				rsinterface.childX[10] = 26;
				rsinterface.childY[10] = 133;
				rsinterface.children[11] = 10601;
				rsinterface.childX[11] = 480;
				rsinterface.childY[11] = 17;
				rsinterface.children[12] = 17131;
				rsinterface.childX[12] = 350;
				rsinterface.childY[12] = 220;
				rsinterface.children[13] = 17132;
				rsinterface.childX[13] = 350;
				rsinterface.childY[13] = 231;
				rsinterface.children[14] = 17133;
				rsinterface.childX[14] = 350;
				rsinterface.childY[14] = 242;
				rsinterface.children[15] = 17134;
				rsinterface.childX[15] = 350;
				rsinterface.childY[15] = 254;
				rsinterface = RSInterface.interfaceCache[10494];
				rsinterface.invSpritePadX = 6;
				rsinterface.invSpritePadY = 5;
				rsinterface = RSInterface.interfaceCache[10600];
				rsinterface.invSpritePadX = 6;
				rsinterface.invSpritePadY = 5;
		}

		public static void itemsOnDeathDATA(TextDrawingArea[] tda)
		{
				RSInterface RSinterface = RSInterface.addInterface(17115);
				RSInterface.addText(17109, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17110, "Risked wealth notes:", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17111, "Untradeable items that", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17112, "go to the shop after", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17113, "death are worth:", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17114, "Item price divided by 10", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17117, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17118, "Untradeables items that", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17119, "go to your inventory", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17120, "after death are worth 0", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17121, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17122, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17123, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17124, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17125, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17126, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17127, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17128, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17129, "", 0xff981f, false, false, 0, tda, 0);
				RSInterface.addText(17130, "", 0xff981f, false, false, 0, tda, 0);
				RSinterface.parentId = 17115;
				RSinterface.id = 17115;
				RSinterface.setType(0);
				RSinterface.atActionType = 0;
				RSinterface.actionType = 0;
				RSinterface.width = 130;
				RSinterface.height = 147;
				RSinterface.opacity = 0;
				RSinterface.hoverType = -1;
				RSinterface.scrollMax = 230;
				RSinterface.children = new int[20];
				RSinterface.childX = new int[20];
				RSinterface.childY = new int[20];
				RSinterface.children[0] = 17109;
				RSinterface.childX[0] = 0;
				RSinterface.childY[0] = 0;
				RSinterface.children[1] = 17110;
				RSinterface.childX[1] = 0;
				RSinterface.childY[1] = 12;
				RSinterface.children[2] = 17111;
				RSinterface.childX[2] = 0;
				RSinterface.childY[2] = 24;
				RSinterface.children[3] = 17112;
				RSinterface.childX[3] = 0;
				RSinterface.childY[3] = 36;
				RSinterface.children[4] = 17113;
				RSinterface.childX[4] = 0;
				RSinterface.childY[4] = 48;
				RSinterface.children[5] = 17114;
				RSinterface.childX[5] = 0;
				RSinterface.childY[5] = 60;
				RSinterface.children[6] = 17117;
				RSinterface.childX[6] = 0;
				RSinterface.childY[6] = 72;
				RSinterface.children[7] = 17118;
				RSinterface.childX[7] = 0;
				RSinterface.childY[7] = 84;
				RSinterface.children[8] = 17119;
				RSinterface.childX[8] = 0;
				RSinterface.childY[8] = 96;
				RSinterface.children[9] = 17120;
				RSinterface.childX[9] = 0;
				RSinterface.childY[9] = 108;
				RSinterface.children[10] = 17121;
				RSinterface.childX[10] = 0;
				RSinterface.childY[10] = 120;
				RSinterface.children[11] = 17122;
				RSinterface.childX[11] = 0;
				RSinterface.childY[11] = 132;
				RSinterface.children[12] = 17123;
				RSinterface.childX[12] = 0;
				RSinterface.childY[12] = 144;
				RSinterface.children[13] = 17124;
				RSinterface.childX[13] = 0;
				RSinterface.childY[13] = 156;
				RSinterface.children[14] = 17125;
				RSinterface.childX[14] = 0;
				RSinterface.childY[14] = 168;
				RSinterface.children[15] = 17126;
				RSinterface.childX[15] = 0;
				RSinterface.childY[15] = 180;
				RSinterface.children[16] = 17127;
				RSinterface.childX[16] = 0;
				RSinterface.childY[16] = 192;
				RSinterface.children[17] = 17128;
				RSinterface.childX[17] = 0;
				RSinterface.childY[17] = 204;
				RSinterface.children[18] = 17129;
				RSinterface.childX[18] = 0;
				RSinterface.childY[18] = 216;
				RSinterface.children[19] = 17130;
				RSinterface.childX[19] = 0;
				RSinterface.childY[19] = 228;
		}

		public static void equipmentScreenBank(TextDrawingArea[] wid)
		{
				RSInterface tab = RSInterface.addTabInterface(15150, 20, 504, 9, 332);
				RSInterface.addSprite(15107, 283);
				RSInterface.addHoverButton(15210, 148, 21, 21, "Close Window", 250, 15211, 3);
				RSInterface.addHoveredButton(15211, 149, 21, 21, 15212);
				RSInterface.addHoverButton(21024, 281, 72, 32, "Return To Bank", -1, 21025, 5);
				RSInterface.addHoveredButton(21025, 282, 72, 32, 21026);
				RSInterface.addText(15111, "", wid, 2, 0xe4a146, false, true);
				RSInterface.addText(15112, "Attack bonuses", wid, 2, 0xFF8900, false, true);
				RSInterface.addText(15113, "Defence bonuses", wid, 2, 0xFF8900, false, true);
				RSInterface.addText(15114, "Other bonuses", wid, 2, 0xFF8900, false, true);
				RSInterface.addText(15115, "Ranged strength:", wid, 1, 0xFF8900, false, true);
				RSInterface.addText(15116, "Magic damage bonus:", wid, 1, 0xFF8900, false, true);
				for (int i = 1675; i <= 1684; i++)
				{
						RSInterface.textSize(i, wid, 1);
				}
				RSInterface.textSize(1686, wid, 1);
				RSInterface.textSize(1687, wid, 1);
				RSInterface.addChar(15125);
				tab.totalChildren(48);
				tab.child(0, 15107, 15, 5);
				tab.child(1, 15210, 476, 8);
				tab.child(2, 15211, 476, 8);
				tab.child(3, 15111, 14, 30);
				int Child = 4;
				int Y = 45;
				for (int i = 1675; i <= 1679; i++)
				{
						tab.child(Child, i, 29, Y);
						Child++;
						Y += 14;
				}
				tab.child(9, 1680, 29, 137); // 161
				tab.child(10, 1681, 29, 153);
				tab.child(11, 1682, 29, 168);
				tab.child(12, 1683, 29, 183);
				tab.child(13, 1684, 29, 197);
				tab.child(14, 1686, 29, 262 - 24);
				tab.child(17, 1687, 29, 276 - 24);
				tab.child(15, 15125, 170, 200);
				tab.child(16, 15112, 24, 30);
				tab.child(18, 15113, 24, 122); // 147
				tab.child(19, 15114, 24, 223);
				tab.child(20, 1645, 104 + 295, 149 - 52);
				tab.child(21, 1646, 399, 163);
				tab.child(22, 1647, 399, 163);
				tab.child(23, 1648, 399, 58 + 146);
				tab.child(24, 1649, 26 + 22 + 297 - 2, 110 - 44 + 118 - 13 + 5);
				tab.child(25, 1650, 321 + 22, 58 + 154);
				tab.child(26, 1651, 321 + 134, 58 + 118);
				tab.child(27, 1652, 321 + 134, 58 + 154);
				tab.child(28, 1653, 321 + 48, 58 + 81);
				tab.child(29, 1654, 321 + 107, 58 + 81);
				tab.child(30, 1655, 321 + 58, 58 + 42);
				tab.child(31, 1656, 321 + 112, 58 + 41);
				tab.child(32, 1657, 321 + 78, 58 + 4);
				tab.child(33, 1658, 321 + 37, 58 + 43);
				tab.child(34, 1659, 321 + 78, 58 + 43);
				tab.child(35, 1660, 321 + 119, 58 + 43);
				tab.child(36, 1661, 321 + 22, 58 + 82);
				tab.child(37, 1662, 321 + 78, 58 + 82);
				tab.child(38, 1663, 321 + 134, 58 + 82);
				tab.child(39, 1664, 321 + 78, 58 + 122);
				tab.child(40, 1665, 321 + 78, 58 + 162);
				tab.child(41, 1666, 321 + 22, 58 + 162);
				tab.child(42, 1667, 321 + 134, 58 + 162);
				tab.child(43, 1688, 50 + 297 - 2, 110 - 13 + 5);
				tab.child(44, 21024, 457, 30);
				tab.child(45, 21025, 457, 30);
				tab.child(46, 15115, 29, 266);
				tab.child(47, 15116, 29, 280);

				for (int i = 1675; i <= 1684; i++)
				{
						RSInterface rsi = RSInterface.interfaceCache[i];
						rsi.textColour = 0xFF9200;
						rsi.centerText = false;
				}
				for (int i = 1686; i <= 1687; i++)
				{
						RSInterface rsi = RSInterface.interfaceCache[i];
						rsi.textColour = 0xFF9200;
						rsi.centerText = false;
				}
		}

		public static void bankInterface(TextDrawingArea[] wid)
		{
				int xOffset = -2;
				RSInterface Interface = RSInterface.addTabInterface(24959, 19, 503, 18, 322);
				RSInterface.setChildren(38, Interface);
				RSInterface.addSprite(5293, 373);
				RSInterface.setBounds(5293, 15 + xOffset, 13, 0, Interface);
				RSInterface.addHover(5384, 3, 0, 5380, 148, 17, 17, "Close Window");
				RSInterface.addHovered(5380, 149, 17, 17, 5379);
				RSInterface.setBounds(5384, 476 + xOffset, 16, 3, Interface);
				RSInterface.setBounds(5380, 476 + xOffset, 16, 4, Interface);
				RSInterface.addHover(5294, 4, 0, 5295, 374, 114, 25, "Set a bank pin");
				RSInterface.addHovered(5295, 375, 114, 25, 5296);
				RSInterface.setBounds(5294, 110 + xOffset, 285, 5, Interface);
				RSInterface.setBounds(5295, 110 + xOffset, 285, 6, Interface);

				RSInterface.addBankHover(22000, 4, 22001, 142, 143, 35, 25, 304, 1, "Swap withdraw mode", 22002, 7, 6, "interfaces/Bank/BANK", 22003, "Switch to insert items \nmode", "", 12, 20);
				RSInterface.setBounds(22000, 25 + xOffset, 285, 7, Interface);
				RSInterface.setBounds(22001, 10 + xOffset, 225, 8, Interface);


				RSInterface.addHoverButton(22004, 379, 35, 25, "Search", -1, 22005, 1);
				RSInterface.addHoveredButton(22005, 380, 35, 25, 22006);
				RSInterface.setBounds(22004, 65 + xOffset, 285, 9, Interface);
				RSInterface.setBounds(22005, 65 + xOffset, 285, 10, Interface);



				RSInterface.addHoverButton(22008, 376, 35, 25, "Withdraw", -1, 22009, 1);
				RSInterface.addHoveredButton(22009, 377, 35, 25, 22010);
				RSInterface.setBounds(22008, 240 + xOffset, 285, 11, Interface);
				RSInterface.setBounds(22009, 240 + xOffset, 285, 12, Interface);

				RSInterface.addHoverButton(22012, 382, 35, 25, "Deposit inventory", -1, 22013, 1);
				RSInterface.addHoveredButton(22013, 383, 35, 25, 22014);
				RSInterface.setBounds(22012, 373 + xOffset, 285, 13, Interface);
				RSInterface.setBounds(22013, 373 + xOffset, 285, 14, Interface);

				RSInterface.addHoverButton(22016, 384, 35, 25, "Deposit worn equipment", -1, 22017, 1);
				RSInterface.addHoveredButton(22017, 385, 35, 25, 22018);
				RSInterface.setBounds(22016, 413 + xOffset, 285, 15, Interface);
				RSInterface.setBounds(22017, 413 + xOffset, 285, 16, Interface);

				RSInterface.addHoverButton(22020, 386, 35, 25, "Show equipment stats", -1, 22021, 1);
				RSInterface.addHoveredButton(22021, 387, 35, 25, 22022);
				RSInterface.setBounds(22020, 453 + xOffset, 285, 17, Interface);
				RSInterface.setBounds(22021, 453 + xOffset, 285, 18, Interface);

				RSInterface.setBounds(5383, 170 + xOffset, 15, 1, Interface);
				RSInterface.setBounds(5385, -4 + xOffset, 74, 2, Interface);
				RSInterface.addButton(22024, 388, "Click here to view the full contents of your bank");
				RSInterface.setBounds(22024, 22 + xOffset, 36, 19, Interface);
				RSInterface.addButton(22025, 392, "Drag an item here to create a new tab");
				RSInterface.setBounds(22025, 70 + xOffset, 36, 20, Interface);
				RSInterface.addButton(22026, 392, "Drag an item here to create a new tab");
				RSInterface.setBounds(22026, 118 + xOffset, 36, 21, Interface);
				RSInterface.addButton(22027, 392, "Drag an item here to create a new tab");
				RSInterface.setBounds(22027, 166 + xOffset, 36, 22, Interface);
				RSInterface.addButton(22028, 392, "Drag an item here to create a new tab");
				RSInterface.setBounds(22028, 214 + xOffset, 36, 23, Interface);
				RSInterface.addButton(22029, 392, "Drag an item here to create a new tab");
				RSInterface.setBounds(22029, 262 + xOffset, 36, 24, Interface);
				RSInterface.addButton(22030, 392, "Drag an item here to create a new tab");
				RSInterface.setBounds(22030, 310 + xOffset, 36, 25, Interface);
				RSInterface.addButton(22031, 392, "Drag an item here to create a new tab");
				RSInterface.setBounds(22031, 358 + xOffset, 36, 26, Interface);
				RSInterface.addButton(22032, 392, "Drag an item here to create a new tab");
				RSInterface.setBounds(22032, 406 + xOffset, 36, 27, Interface);
				RSInterface.addText(22033, "134", wid, 0, 0xB4965A, true, false);
				RSInterface.setBounds(22033, 473 + xOffset, 42, 28, Interface);
				RSInterface.addText(22034, "496", wid, 0, 0xB4965A, true, false);
				RSInterface.setBounds(22034, 473 + xOffset, 57, 29, Interface);
				RSInterface.addBankItem(22035, false);
				RSInterface.setBounds(22035, 77 + xOffset, 39, 30, Interface);
				RSInterface.addBankItem(22036, false);
				RSInterface.setBounds(22036, 125 + xOffset, 39, 31, Interface);
				RSInterface.addBankItem(22037, false);
				RSInterface.setBounds(22037, 173 + xOffset, 39, 32, Interface);
				RSInterface.addBankItem(22038, false);
				RSInterface.setBounds(22038, 221 + xOffset, 39, 33, Interface);
				RSInterface.addBankItem(22039, false);
				RSInterface.setBounds(22039, 269 + xOffset, 39, 34, Interface);
				RSInterface.addBankItem(22040, false);
				RSInterface.setBounds(22040, 317 + xOffset, 39, 35, Interface);
				RSInterface.addBankItem(22041, false);
				RSInterface.setBounds(22041, 365 + xOffset, 39, 36, Interface);
				RSInterface.addBankItem(22042, false);
				RSInterface.setBounds(22042, 413 + xOffset, 39, 37, Interface);

				// These text are used by the bank, if removed, client will crash.
				RSInterface.addText(27000, "0", 0xFF981F, false, true, 52, wid, 1);
				RSInterface.addText(27001, "0", 0xFF981F, false, true, 52, wid, 1);
				RSInterface.addText(27002, "0", 0xFF981F, false, true, 52, wid, 1);

				Interface = RSInterface.interfaceCache[5385];
				Interface.height = 206;
				Interface.width = 480;
				Interface = RSInterface.interfaceCache[5382];
				Interface.width = 10;
				Interface.invSpritePadX = 12;
				Interface.height = 35;
		}

		public static void weaponTracker(TextDrawingArea[] tda)
		{

				RSInterface Interface = RSInterface.addInterface(25403, 11, 506, 12, 328);
				int xBase1 = -3;
				int yBase1 = -2;
				int children = 4;
				int id = 25407 + children;

				int yBase = 76;
				int y = yBase + yBase1;
				int x = 43 + xBase1; //18807 ballista replaced with vestas spear, 18785 dagger replaced with vls
				int[] items = {1215, 3204, 1305, 1434, 14484, 11694, 11696, 11698, 11700, 11730, 18785, 18807, 18771, 10887, 11235, 15241, 13883, 13879, 861, 9244, 4718, -1};
				int amountOfItems = items.length;
				int rowMaximum = 4;
				int currentRow = 0;
				RSInterface.setChildren((amountOfItems * 4) + children + 8, Interface);

				RSInterface.addSprite(25404, 315);
				RSInterface.setBounds(25404, 10 + xBase1, 10 + yBase1, 0, Interface);

				RSInterface.addText(25405, "", tda, 2, 0xffb000, false, true); // Profile of Mgt Madness.
				RSInterface.setBounds(25405, 20 + xBase1, 19 + yBase1, 1, Interface);

				RSInterface.addHoverButton(25406, 148, 16, 16, "Close Window", -1, 25407, 1); // Close button.
				RSInterface.addHoveredButton(25407, 149, 16, 16, 25408); // Close button hover.
				RSInterface.setBounds(25406, 483 + xBase1, 19 + yBase1, 2, Interface);
				RSInterface.setBounds(25407, 483 + xBase1, 19 + yBase1, 3, Interface);

				for (int index = 0; index < amountOfItems; index++)
				{
						if (items[index] == -1) // Vengeance sprite
						{
								RSInterface.addHoverButton(id, 316, 56, 40, "View", -1, id + 1, 1);
								RSInterface.addHoveredButton(id + 1, 317, 56, 40, id + 2);
						}
						else
						{
								RSInterface.addHoverButton(id, 318, 56, 40, "View", -1, id + 1, 1);
								RSInterface.addHoveredButton(id + 1, 319, 56, 40, id + 2);
						}
						RSInterface.interfaceCache[id + 2].toolTipSpecialX = x - 21;
						RSInterface.interfaceCache[id + 2].toolTipSpecialY = y - 39;

						RSInterface.setBounds(id, x - 13, y - 4, children, Interface);
						children++;
						RSInterface.setBounds(id + 1, x - 13, y - 4, children, Interface);
						id += 3;
						children++;
						RSInterface.addToItemGroup(id, items[index], 1, 1, 24, 24, false, null, null, null);
						RSInterface.setBounds(id, x, y, children, Interface);
						id++;
						children++;

						RSInterface.addText(id, "", tda, 1, 0xffb000, true, true);
						RSInterface.setBounds(id, x + 13, y - 20, children, Interface);
						y += 67;
						id++;
						children++;
						currentRow++;
						if (currentRow == rowMaximum)
						{
								y = yBase - 2;
								x += 65;
								currentRow = 0;
						}
				}

				RSInterface.addHover(25521, 4, 0, 25522, 251, 17, 17, "Back");
				RSInterface.setBounds(25521, 459, 17, 92, Interface);

				RSInterface.addHovered(25522, 252, 17, 17, 25523);
				RSInterface.setBounds(25522, 459, 17, 93, Interface);



				RSInterface.addHoverButton(25536, 336, 84, 15, "Search", -1, 25537, 1); // Search button.
				RSInterface.addHoveredButton(25537, 337, 84, 15, 25538); // Search button hover..
				RSInterface.setBounds(25536, 368, 18, 94, Interface);
				RSInterface.setBounds(25537, 368, 18, 95, Interface);
				RSInterface.addText(25539, "Search", tda, 1, 0xffb000, true, true); // Search text.
				RSInterface.setBounds(25539, 412, 18, 96, Interface);

				RSInterface.addHoverButton(20251, 647, 159, 17, "Change", -1, 20252, 1); // Close button.
				RSInterface.addHoveredButton(20252, 648, 159, 17, 20253); // Close button hover.
				RSInterface.setBounds(20251, 204 + xBase1, 19 + yBase1, 97, Interface);
				RSInterface.setBounds(20252, 204 + xBase1, 19 + yBase1, 98, Interface);

				RSInterface.addText(20250, "", tda, 0, ClientConstants.YELLOW, false, true); // Profile of Mgt Madness.
				RSInterface.setBounds(20250, 208 + xBase1, 22 + yBase1, 99, Interface);



		}

		public static void trade(TextDrawingArea[] TDA)
		{
				RSInterface Interface = RSInterface.addTabInterface(3323, 4, 515, 19, 333);
				RSInterface.setChildren(20, Interface);
				RSInterface.addSprite(3324, 153);
				RSInterface.addHover(3442, 3, 0, 3325, 148, 17, 17, "Close Window");
				RSInterface.addHovered(3325, 149, 17, 17, 3326);

				RSInterface.addText(3417, "Trading With:", 0xFF9933, true, true, 52, TDA, 2);
				RSInterface.addText(3418, "Trader's Offer", 0xFF9933, false, true, 52, TDA, 1);
				RSInterface.addText(3419, "Your Offer", 0xFF9933, false, true, 52, TDA, 1);
				RSInterface.addText(3421, "Accept", 0x00C000, true, true, 52, TDA, 1);
				RSInterface.addText(3423, "Decline", 0xC00000, true, true, 52, TDA, 1);
				RSInterface.addText(3431, "Waiting For Other Player", 0xFFFFFF, true, true, 52, TDA, 1);
				RSInterface.addText(21350, "", ClientConstants.ORANGE, true, true, 52, TDA, 0);
				RSInterface.addText(21351, "", ClientConstants.ORANGE, true, true, 52, TDA, 0);
				RSInterface.addText(21352, "inventory slots.", ClientConstants.ORANGE, true, true, 52, TDA, 0);
				RSInterface.addText(21353, "", ClientConstants.ORANGE, false, true, 52, TDA, 0);
				RSInterface.addText(21354, "", ClientConstants.ORANGE, false, true, 52, TDA, 0);


				RSInterface.addHover(3420, 1, 0, 3327, 152, 65, 32, "Accept");
				RSInterface.addHovered(3327, 150, 65, 32, 3328);

				RSInterface.addHover(3422, 1, 0, 3329, 152, 65, 32, "Close Window");
				RSInterface.addHovered(3329, 150, 65, 32, 3330);

				RSInterface.setBounds(3324, 0, 16, 0, Interface);
				RSInterface.setBounds(3442, 485, 26, 1, Interface);
				RSInterface.setBounds(3325, 485, 26, 2, Interface);
				RSInterface.setBounds(3417, 258, 25, 3, Interface);
				RSInterface.setBounds(3418, 355, 51, 4, Interface);
				RSInterface.setBounds(3419, 68, 51, 5, Interface);
				RSInterface.setBounds(3420, 223, 120, 6, Interface);
				RSInterface.setBounds(3327, 223, 120, 7, Interface);
				RSInterface.setBounds(3422, 223, 160, 8, Interface);
				RSInterface.setBounds(3329, 223, 160, 9, Interface);
				RSInterface.setBounds(3421, 256, 127, 10, Interface);
				RSInterface.setBounds(3423, 256, 167, 11, Interface);
				RSInterface.setBounds(3431, 256, 272, 12, Interface);
				RSInterface.setBounds(3415, 12, 64, 13, Interface);
				RSInterface.setBounds(3416, 321, 64, 14, Interface);

				RSInterface.setBounds(21350, 256, 66, 15, Interface);
				RSInterface.setBounds(21351, 256, 78, 16, Interface);
				RSInterface.setBounds(21352, 256, 90, 17, Interface);
				RSInterface.setBounds(21353, 13, 310, 18, Interface);
				RSInterface.setBounds(21354, 400, 310, 19, Interface);
				Interface = RSInterface.addTabInterface(3443);
				RSInterface.setChildren(15, Interface);
				RSInterface.addSprite(3444, 151);
				RSInterface.addButton(3546, "Bank/SHOP 2", 63, 24, "Accept", 1);
				RSInterface.addButton(3548, "Bank/SHOP 2", 63, 24, "Decline", 1);
				RSInterface.addText(3547, "Accept", 0x00C000, true, true, 52, TDA, 1);
				RSInterface.addText(3549, "Decline", 0xC00000, true, true, 52, TDA, 1);
				RSInterface.addText(3450, "Trading With:", 0x00FFFF, true, true, 52, TDA, 2);
				RSInterface.addText(3451, "Yourself", 0x00FFFF, true, true, 52, TDA, 2);
				RSInterface.setBounds(3444, 12, 20, 0, Interface);
				RSInterface.setBounds(3442, 470, 32, 1, Interface);
				RSInterface.setBounds(3325, 470, 32, 2, Interface);
				RSInterface.setBounds(3535, 130, 28, 3, Interface);
				RSInterface.setBounds(3536, 105, 47, 4, Interface);
				RSInterface.setBounds(3546, 189, 295, 5, Interface);
				RSInterface.setBounds(3548, 258, 295, 6, Interface);
				RSInterface.setBounds(3547, 220, 299, 7, Interface);
				RSInterface.setBounds(3549, 288, 299, 8, Interface);
				RSInterface.setBounds(3557, 71, 87, 9, Interface);
				RSInterface.setBounds(3558, 315, 87, 10, Interface);
				RSInterface.setBounds(3533, 64, 70, 11, Interface);
				RSInterface.setBounds(3534, 297, 70, 12, Interface);
				RSInterface.setBounds(3450, 95, 289, 13, Interface);
				RSInterface.setBounds(3451, 95, 304, 14, Interface);
		}

		public static void shop(TextDrawingArea[] TDA)
		{
				RSInterface rsinterface = RSInterface.addTabInterface(3824, 16, 501, 16, 322);
				RSInterface.setChildren(10, rsinterface);

				RSInterface.addSprite(3825, 250);
				RSInterface.addHover(3902, 4, 0, 3826, 148, 17, 17, "Close Window");
				RSInterface.addHovered(3826, 149, 17, 17, 3827);
				RSInterface.addText(19301, "Shop", 0xff981f, true, true, 52, TDA, 2);


				RSInterface.addHover(25400, 4, 0, 25401, 251, 17, 17, "Back");
				RSInterface.addHovered(25401, 252, 17, 17, 25402);

				RSInterface.addHoverButton(24270, 717, 101, 15, "Search", -1, 24271, 1); // Search button.
				RSInterface.addHoveredButton(24271, 718, 101, 15, 24272); // Search button hover.
				RSInterface.addText(24273, "", 0xff981f, false, true, 52, TDA, 0);


				RSInterface.setBounds(3825, 12, 13, 0, rsinterface); // Background
				RSInterface.setBounds(3902, 474, 22, 1, rsinterface); // Close
				RSInterface.setBounds(3826, 474, 22, 2, rsinterface); // Close hover


				RSInterface scrollTab1 = RSInterface.addInterface(19683);
				RSInterface.setBounds(19683, 24, 47, 3, rsinterface);
				RSInterface.setBounds(19301, 244, 22, 4, rsinterface); // Text
				RSInterface.setBounds(25400, 454, 22, 5, rsinterface);
				RSInterface.setBounds(25401, 454, 22, 6, rsinterface);
				RSInterface.setBounds(24270, 347, 23, 7, rsinterface);
				RSInterface.setBounds(24271, 347, 23, 8, rsinterface);
				RSInterface.setBounds(24273, 350, 25, 9, rsinterface);

				rsinterface = RSInterface.interfaceCache[3900];
				rsinterface.inv = new int[150];
				rsinterface.invStackSizes = new int[150];
				rsinterface.invSpritePadX = 14;
				rsinterface.width = 10;
				rsinterface.height = 15;
				rsinterface.invSpritePadY = 20;
				rsinterface = RSInterface.addTabInterface(19682);

				scrollTab1.width = 452;
				scrollTab1.height = 259;
				scrollTab1.scrollMax = 550;

				scrollTab1.totalChildren(1);
				scrollTab1.child(0, 3900, 0, 15);
		}

		public static void emoteTab()
		{
				RSInterface tab = RSInterface.addTabInterface(147);
				RSInterface scroll = RSInterface.addTabInterface(148);
				tab.totalChildren(1);
				tab.child(0, 148, 0, 1);
				RSInterface.addButton(168, 154, "Yes", 41, 47);
				RSInterface.addButton(169, 155, "No", 41, 47);
				RSInterface.addButton(164, 156, "Bow", 41, 47);
				RSInterface.addButton(165, 157, "Angry", 41, 47);
				RSInterface.addButton(162, 158, "Think", 40, 47);
				RSInterface.addButton(163, 159, "Wave", 41, 47);
				RSInterface.addButton(13370, 160, "Shrug", 41, 47);
				RSInterface.addButton(171, 161, "Cheer", 41, 47);
				RSInterface.addButton(167, 162, "Beckon", 41, 47);
				RSInterface.addButton(170, 163, "Laugh", 41, 47);
				RSInterface.addButton(13366, 164, "Jump for Joy", 41, 47);
				RSInterface.addButton(13368, 166, "Yawn", 41, 47);
				RSInterface.addButton(166, 167, "Dance", 41, 47);
				RSInterface.addButton(13363, 168, "Jig", 41, 47);
				RSInterface.addButton(13364, 169, "Spin", 41, 47);
				RSInterface.addButton(13365, 170, "Headbang", 41, 47);
				RSInterface.addButton(161, 171, "Cry", 41, 47);
				RSInterface.addButton(11100, 172, "Blow kiss", 41, 47);
				RSInterface.addButton(13362, 173, "Panic", 41, 47);
				RSInterface.addButton(13367, 174, "Raspberry", 41, 47);
				RSInterface.addButton(172, 175, "Clap", 41, 47);
				RSInterface.addButton(13369, 176, "Salute", 36, 47);
				RSInterface.addButton(13383, 177, "Goblin Bow", 41, 47);
				RSInterface.addButton(13384, 178, "Goblin Salute", 41, 47);
				RSInterface.addButton(667, 179, "Glass Box", 41, 47);
				RSInterface.addButton(6503, 180, "Climb Rope", 41, 47);
				RSInterface.addButton(6506, 181, "Lean On Air", 41, 47);
				RSInterface.addButton(666, 182, "Glass Wall", 41, 47);
				RSInterface.addButton(18464, 183, "Zombie Walk", 41, 47);
				RSInterface.addButton(18465, 184, "Zombie Dance", 41, 47);
				RSInterface.addButton(15166, 185, "Scared", 41, 47);
				RSInterface.addButton(18686, 186, "Bunny Hop", 41, 47);
				RSInterface.addConfigButton(154, 147, 187, 187, 41, 47, "Skillcape Emote", 0, 1, 700);

				RSInterface.addButton(24400, 188, "Freeze", 41, 47);
				RSInterface.addButton(24401, 189, "Trick", 41, 47);
				RSInterface.addButton(24402, 190, "Safety First", 41, 47);
				RSInterface.addButton(24403, 191, "Snowman Dance", 41, 47);

				RSInterface.addButton(24404, 192, "Explore", 41, 47);
				RSInterface.addButton(24405, 193, "Stomp", 41, 47);
				RSInterface.addButton(24406, 194, "Flap", 41, 47);
				RSInterface.addButton(24407, 195, "Slap head", 41, 47);

				RSInterface.addButton(24408, 196, "Zombie Hand", 41, 47);
				RSInterface.addButton(24409, Client.clientRevision("474") ? 723 : 197, "Air Guitar", 37, 47);

				RSInterface.addButton(24260, 719, "Sit ups", 41, 41);
				RSInterface.addButton(24261, 720, "Push ups", 41, 41);
				RSInterface.addButton(24262, 721, "Star jumps", 41, 41);
				RSInterface.addButton(24263, 722, "Jog", 41, 41);

				//24260

				scroll.totalChildren(94);
				int[][] emotePositions = {
						{168, 10, 7},
						{169, 54, 7},
						{164, 98, 14},
						{165, 137, 7},
						{162, 9, 56},
						{163, 48, 56},
						{13370, 95, 56},
						{171, 137, 56},
						{167, 7, 105},
						{170, 51, 105},
						{13366, 95, 104},
						{13368, 139, 105},
						{166, 6, 154},
						{13363, 50, 154},
						{13364, 90, 154},
						{13365, 135, 154},
						{161, 8, 204},
						{11100, 51, 203},
						{13362, 99, 204},
						{13367, 137, 203},
						{172, 10, 253},
						{13369, 53, 253},
						{13383, 88, 258},
						{13384, 138, 252},
						{667, 2, 303},
						{6503, 49, 302},
						{6506, 93, 302},
						{666, 137, 302},
						{18464, 9, 352},
						{18465, 50, 352},
						{15166, 94, 356},
						{18686, 141, 353},
						{154, 95, 551}, // Skillcape emote
						{24400, 1, 402},
						{24401, 50, 402},
						{24402, 96, 404},
						{24403, 139, 403},
						{24404, 3, 452},
						{24405, 52, 452},
						{24406, 94, 456},
						{24407, 139, 453},
						{24408, 9, 554}, // Zombie hand
						{24409, 57, 553},

						// Osrs emotes
						{24260, 3, 510}, // Situps
						{24261, 50, 510}, // Pushups
						{24262, 101, 505}, // Star jumps
						{24263, 142, 505},}; // Jog
				int childId = 0;
				int interfaceId = 0;
				for (int index = 0; index < emotePositions.length; index++)
				{
						scroll.child(childId, emotePositions[index][0], emotePositions[index][1], emotePositions[index][2]);
						childId++;
				}
				for (int index = 0; index < emotePositions.length; index++)
				{
						int x = emotePositions[index][1] + 30;
						if (x > 160)
						{
								x = 130;
						}
						int y = emotePositions[index][2] + 85;
						// Goblin salute.
						if (index == 23)
						{
								RSInterface.createTimedHoverBox(22195 + interfaceId, "SCUURED", 40, 50, 125, y);
						}
						// Snowman dance.
						else if (index == 36)
						{
								RSInterface.createTimedHoverBox(22195 + interfaceId, "SCUURED", 40, 50, 109, y);
						}
						// Skillcape emote
						else if (index == 32)
						{
								RSInterface.createTimedHoverBox(22195 + interfaceId, "SCUURED", 40, 50, 90, y - 70);
						}

						// Zombie hand
						else if (index == 41)
						{
								RSInterface.createTimedHoverBox(22195 + interfaceId, "SCUURED", 40, 50, x - 7, y - 70);
						}
						// Air guitar
						else if (index == 42)
						{
								RSInterface.createTimedHoverBox(22195 + interfaceId, "SCUURED", 40, 50, x - 15 + (Client.clientRevision("474") ? 5 : 0), y - 70);
						}

						// Osrs emotes is 43 and above.
						else if (index == 43 || index == 44)
						{
								y -= 18;
								RSInterface.createTimedHoverBox(22195 + interfaceId, "SCUURED", 40, 50, x, y);
						}
						else if (index == 45 || index == 46)
						{
								x -= 15;
								if (index == 46)
								{
										x += 62;
								}
								RSInterface.createTimedHoverBox(22195 + interfaceId, "SCUURED", 40, 50, x, y);
						}
						else
						{
								RSInterface.createTimedHoverBox(22195 + interfaceId, "SCUURED", 40, 50, x, y);
						}
						int x1 = emotePositions[index][1];
						int y1 = emotePositions[index][2];

						scroll.child(childId, 22195 + interfaceId, x1, y1);
						childId++;
						interfaceId++;
				}

				scroll.width = 173;
				scroll.height = 258;
				scroll.scrollMax = 602;
		}

		public static void optionTab(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addTabInterface(904);
				RSInterface energy = RSInterface.interfaceCache[149];
				energy.textColour = 0xff9933;
				RSInterface.addSprite(905, 203);
				RSInterface.addSprite(907, 212);
				RSInterface.addSprite(909, 223);
				RSInterface.addSprite(951, 226);
				RSInterface.addSprite(953, 227);
				RSInterface.addSprite(955, 228);
				RSInterface.addSprite(947, 230);
				RSInterface.addSprite(949, 229);
				RSInterface.addSprite(949, 229);
				// run button here
				RSInterface.addConfigButton(152, 904, 224, 225, 40, 40, "Toggle-run", 1, 5, 173);
				RSInterface.addConfigButton(906, 904, 204, 208, 32, 16, "Dark", 1, 5, 166);
				RSInterface.addConfigButton(908, 904, 205, 209, 32, 16, "Normal", 2, 5, 166);
				RSInterface.addConfigButton(910, 904, 206, 210, 32, 16, "Bright", 3, 5, 166);
				RSInterface.addConfigButton(912, 904, 207, 211, 32, 16, "Very Bright", 4, 5, 166);
				RSInterface.addConfigButton(930, 904, 213, 218, 26, 16, "Music Off", 4, 5, 168);
				RSInterface.addConfigButton(931, 904, 214, 219, 26, 16, "Music Level-1", 3, 5, 168);
				RSInterface.addConfigButton(932, 904, 215, 220, 26, 16, "Music Level-2", 2, 5, 168);
				RSInterface.addConfigButton(933, 904, 216, 221, 26, 16, "Music Level-3", 1, 5, 168);
				RSInterface.addConfigButton(934, 904, 217, 222, 24, 16, "Music Level-4", 0, 5, 168);
				RSInterface.addConfigButton(941, 904, 213, 218, 26, 16, "Sound Effects Off", 4, 5, 169);
				RSInterface.addConfigButton(942, 904, 214, 219, 26, 16, "Sound Effects Level-1", 3, 5, 169);
				RSInterface.addConfigButton(943, 904, 215, 220, 26, 16, "Sound Effects Level-2", 2, 5, 169);
				RSInterface.addConfigButton(944, 904, 216, 221, 26, 16, "Sound Effects Level-3", 1, 5, 169);
				RSInterface.addConfigButton(945, 904, 217, 222, 24, 16, "Sound Effects Level-4", 0, 5, 169);
				RSInterface.addConfigButton(913, 904, 225, 224, 40, 40, "Open Resizable Settings", 0, 5, 200);
				RSInterface.addConfigButton(915, 904, 224, 225, 40, 40, "Toggle-Chat Effects", 0, 5, 171);
				RSInterface.addConfigButton(957, 904, 224, 225, 40, 40, "Toggle-Split Private Chat", 1, 5, 287);
				RSInterface.addConfigButton(12464, 904, 224, 225, 40, 40, "Toggle-Accept Aid", 0, 5, 427);
				RSInterface.addButton(24264, 202, "Client Settings");
				tab.totalChildren(38);
				int x = 0;
				int y = 2;
				tab.child(0, 905, 13 + x, 10 + y);
				tab.child(1, 906, 48 + x, 18 + y);
				tab.child(2, 908, 80 + x, 18 + y);
				tab.child(3, 910, 112 + x, 18 + y);
				tab.child(4, 912, 144 + x, 18 + y);
				tab.child(5, 907, 14 + x, 55 + y);
				tab.child(6, 930, 49 + x, 61 + y);
				tab.child(7, 931, 75 + x, 61 + y);
				tab.child(8, 932, 101 + x, 61 + y);
				tab.child(9, 933, 127 + x, 61 + y);
				tab.child(10, 934, 151 + x, 61 + y);
				tab.child(11, 909, 13 + x, 99 + y);
				tab.child(12, 941, 49 + x, 104 + y);
				tab.child(13, 942, 75 + x, 104 + y);
				tab.child(14, 943, 101 + x, 104 + y);
				tab.child(15, 944, 127 + x, 104 + y);
				tab.child(16, 945, 151 + x, 104 + y);
				tab.child(17, 913, 15, 153);
				tab.child(18, 955, 21, 159);
				tab.child(19, 915, 75, 153);
				tab.child(20, 953, 79, 160);
				tab.child(21, 957, 135, 153);
				tab.child(22, 951, 139, 159);
				tab.child(23, 12464, 15, 208);
				tab.child(24, 949, 20, 213);
				tab.child(25, 152, 75, 208);
				tab.child(26, 947, 87, 212);
				tab.child(27, 149, 80, 231);
				tab.child(28, 24264, 135, 208);
				String[] hoverText = {
						"Adjust Screen Brightness",
						"Adjust Music Volume",
						"Adjust Sound Effect Volume",
						"Resizable settings",
						"Chat Effects\\n(currently on)",
						"Split Private Chat\\n(currently on)",
						"Accept Aid\\n(currently on)",
						"Run (on) Energy 100%",
						"Advanced settings",};

				// X of hover start, Y of hover start, Width, Height, X of box, Y of box
				int[][] hoverBoxLocation = {{11, 10, 45, 85, 33, 33}, {11, 52, 45, 129, 33, 33}, {11, 94, 45, 173, 33, 33}, {12, 151, 45, 237, 42, 42
								// Mouse button
								}, {74, 151, 105, 237, 42, 42}, {134, 151, 105, 237, 42, 42}, {12, 206, 45, 196, 42, 42
								// Accept aid.
								}, {74, 206, 63, 213, 42, 42}, {134, 206, 105, 213, 42, 42},};
				for (int index = 0; index < 9; index++)
				{
						RSInterface.createTimedHoverBox(22180 + index, hoverText[index], hoverBoxLocation[index][4], hoverBoxLocation[index][5], hoverBoxLocation[index][2], hoverBoxLocation[index][3]);
						tab.child(29 + index, 22180 + index, hoverBoxLocation[index][0], hoverBoxLocation[index][1]);
				}


		}

		static int[] spriteNames = {256, 266, 269, 275, 255, 274, 260, 265, 263, 271, 277, 258, 270, 259, 262, 268, 264, 278, 272, 273, 261, 257, 267, 276};

		static int[] spriteNamesOrdered = {256, 275, 260, 271, 270, 268, 272, 266, 255, 265, 277, 259, 264, 273, 269, 274, 263, 258, 262, 278, 261, 279};

		public static void skillTab(TextDrawingArea[] TDA)
		{
				int y = +4;
				int y1 = -3;
				int x = -2;
				RSInterface skill = RSInterface.addInterface(3917);
				RSInterface.addSprite(24362, 231); // Total level sprite.
				RSInterface.createSkillHover(24363, 9, 190, 28);

				// The interface identity of the background of the icons. Which is the button.png
				int[] buttons = {8654, 8655, 8656, 8657, 8658, 8659, 8660, 13929, 8662, 8663, 8664, 8665, 8666, 8667, 8668, 8669, 8670, 8671, 8672, 12162, 13928};
				int[] hovers = {4040, 4076, 4112, 4046, 4082, 4118, 4052, 4088, 4124, 4058, 4094, 4130, 4064, 4100, 4136, 4070, 4106, 4142, 4160, 2832, 13917};
				int[][] text = {
						{4004, 4005},
						{4016, 4017},
						{4028, 4029},
						{4006, 4007},
						{4018, 4019},
						{4030, 4031},
						{4008, 4009},
						{4020, 4021},
						{4032, 4033},
						{4010, 4011},
						{4022, 4023},
						{4034, 4035},
						{4012, 4013},
						{4024, 4025},
						{4036, 4037},
						{4014, 4015},
						{4026, 4027},
						{4038, 4039},
						{4152, 4153},
						{12166, 12167},
						{13926, 13927}};
				int[] icons = {3965, 3966, 3967, 3968, 3969, 3970, 3971, 3972, 3973, 3974, 3975, 3976, 3977, 3978, 3979, 3980, 3981, 3982, 4151, 12165, 13925};
				int[][] buttonCoords = {
						{4, 4},
						{66, 4},
						{128, 4},
						{4, 32},
						{66, 32},
						{128, 32},
						{4, 60},
						{66, 60},
						{128, 60},
						{4, 88},
						{66, 88},
						{128, 88},
						{4, 116},
						{66, 116},
						{128, 116},
						{4, 144},
						{66, 144},
						{128, 144},
						{4, 172},
						{66, 172},
						{128, 172}};
				int[][] iconCoords = {
						{6, 6},
						{69, 7},
						{131, 6},
						{9, 34},
						{68, 33},
						{131, 36},
						{9, 64},
						{67, 63},
						{131, 61},
						{7, 91},
						{68, 94},
						{133, 90},
						{6, 118},
						{70, 120},
						{130, 118},
						{6, 147},
						{69, 146},
						{132, 146},
						{6, 173},
						{69, 173},
						{130, 174}};
				int[][] textCoords = {
						// X coordinate of bottom number, which is the current number of a skill (118/99) the 118.
						// Y coordinate of bottom number, which is the current number of a skill (118/99) the 118.
						// X coordinate of bottom number, which is the base number of a skill (118/99) the 99.
						// Y coordinate of bottom number, which is the base number of a skill (118/99) the 99.
						{31, 7, 44, 18},
						{93, 7, 106, 18},
						{155, 7, 168, 18},
						{31, 35, 44, 46},
						{93, 35, 106, 46},
						{155, 35, 168, 46},
						{31, 63, 44, 74},
						{93, 63, 106, 74},
						{155, 63, 168, 74},
						{31, 91, 44, 102},
						{93, 91, 106, 102},
						{155, 91, 168, 102},
						{31, 119, 44, 130},
						{93, 119, 106, 130},
						{155, 119, 168, 130},
						{31, 149, 44, 158},
						{93, 147, 106, 158},
						{155, 147, 168, 158},
						{31, 175, 44, 186},
						{93, 175, 106, 186},
						{155, 175, 168, 186}};
				for (int i = 0; i < hovers.length; i++)
				{
						RSInterface.createSkillHover(hovers[i], 9, 60, 31);
						RSInterface.addSkillButton(buttons[i]);
						RSInterface.addImage(icons[i], spriteNames[i]);
				}
				skill.children(icons.length + (text.length * 2) + hovers.length + buttons.length + 3);
				int frame = 0;
				RSInterface totalLevel = RSInterface.interfaceCache[3984];
				totalLevel.textColour = 0xffff01;
				totalLevel.message = "Total level:";
				totalLevel.textDrawingAreas = RSInterface.fonts[2];
				totalLevel.textSize = 2;
				totalLevel.centerText = true;

				skill.child(frame, 24362, 6 + x, 228 + y1);
				frame++;
				skill.child(frame, 24363, 6 + x, 228 + y1);
				frame++;
				skill.child(frame, 3984, 65 + x, 234 + y1);
				frame++;
				int yExtra = 0;
				for (int i = 0; i < buttons.length; i++)
				{
						if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18)
						{
								yExtra += 3;
						}
						skill.child(frame, buttons[i], buttonCoords[i][0] + x, buttonCoords[i][1] + y + yExtra);
						frame++;
				}
				yExtra = 0;
				for (int i = 0; i < icons.length; i++)
				{

						if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18)
						{
								yExtra += 3;
						}
						skill.child(frame, icons[i], iconCoords[i][0] + x, iconCoords[i][1] + y + yExtra + 1);
						frame++;
				}
				yExtra = 0;
				for (int i = 0; i < text.length; i++)
				{
						if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18)
						{
								yExtra += 3;
						}
						RSInterface text1 = RSInterface.interfaceCache[text[i][0]];
						text1.textColour = 0xffff01;
						RSInterface text2 = RSInterface.interfaceCache[text[i][1]];
						text2.textColour = 0xffff01;
						skill.child(frame, text[i][0], textCoords[i][0] + x, textCoords[i][1] + y + yExtra);
						frame++;
				}
				yExtra = 0;
				for (int i = 0; i < text.length; i++)
				{
						if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18)
						{
								yExtra += 3;
						}
						skill.child(frame, text[i][1], textCoords[i][2] + x, textCoords[i][3] + y + yExtra);
						frame++;
				}
				yExtra = 0;
				for (int i = 0; i < hovers.length; i++)
				{

						if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18)
						{
								yExtra += 3;
						}
						skill.child(frame, hovers[i], buttonCoords[i][0] + x, buttonCoords[i][1] + y + yExtra);
						frame++;
				}
		}

		public static void skillTab474(TextDrawingArea[] TDA)
		{
				int y = -3;
				int y1 = -3;
				int x = -4;
				RSInterface skill = RSInterface.addInterface(3917);
				RSInterface.addSprite(24362, 649); // Total level sprite.
				RSInterface.createSkillHover(24363, 9, 181, 36);

				// The interface identity of the background of the icons. Which is the button.png
				int[] buttons = {8654, 8655, 8656, 8657, 8658, 8659, 8660, 13929, 8662, 8663, 8664, 8665, 8666, 8667, 8668, 8669, 8670, 8671, 8672, 12162, 13928};
				int[] hovers = {4040, 4076, 4112, 4046, 4082, 4118, 4052, 4088, 4124, 4058, 4094, 4130, 4064, 4100, 4136, 4070, 4106, 4142, 4160, 2832, 13917};
				int[][] text = {
						{4004, 4005},
						{4016, 4017},
						{4028, 4029},
						{4006, 4007},
						{4018, 4019},
						{4030, 4031},
						{4008, 4009},
						{4020, 4021},
						{4032, 4033},
						{4010, 4011},
						{4022, 4023},
						{4034, 4035},
						{4012, 4013},
						{4024, 4025},
						{4036, 4037},
						{4014, 4015},
						{4026, 4027},
						{4038, 4039},
						{4152, 4153},
						{12166, 12167},
						{13926, 13927}};
				int[] icons = {3965, 3966, 3967, 3968, 3969, 3970, 3971, 3972, 3973, 3974, 3975, 3976, 3977, 3978, 3979, 3980, 3981, 3982, 4151, 12165, 13925};
				int[][] buttonCoords = {
						{4, 4},
						{67, 4},
						{130, 4},
						{4, 32},
						{67, 32},
						{130, 32},
						{4, 60},
						{67, 60},
						{130, 60},
						{4, 88},
						{67, 88},
						{130, 88},
						{4, 116},
						{67, 116},
						{130, 116},
						{4, 144},
						{67, 144},
						{130, 144},
						{4, 172},
						{67, 172},
						{130, 172}};
				int[][] iconCoords = {
						{6, 6},
						{72, 10},
						{136, 8},
						{11, 37},
						{74, 36},
						{138, 38},
						{11, 67},
						{72, 67},
						{135, 64},
						{9, 93},
						{72, 98},
						{139, 93},
						{9, 120},
						{72, 121},
						{136, 120},
						{8, 148},
						{71, 147},
						{139, 149},
						{8, 175},
						{71, 174},
						{134, 177}};
				int[][] textCoords = {
						// X coordinate of bottom number, which is the current number of a skill (118/99) the 118.
						// Y coordinate of bottom number, which is the current number of a skill (118/99) the 118.
						// X coordinate of bottom number, which is the base number of a skill (118/99) the 99.
						// Y coordinate of bottom number, which is the base number of a skill (118/99) the 99.
						{36, 8, 47, 21},
						{98, 7, 109, 18},
						{162, 7, 173, 18},
						{36, 36, 47, 49},
						{98, 35, 109, 46},
						{162, 35, 173, 46},
						{36, 8, 47, 77},
						{98, 63, 109, 74},
						{162, 63, 173, 74},
						{36, 8, 47, 21},
						{98, 91, 109, 102},
						{162, 91, 173, 102},
						{36, 8, 47, 21},
						{98, 119, 109, 130},
						{162, 119, 173, 130},
						{36, 8, 47, 21},
						{98, 147, 109, 158},
						{162, 147, 173, 158},
						{36, 8, 47, 21},
						{98, 175, 109, 186},
						{162, 175, 173, 186}};
				for (int i = 0; i < hovers.length; i++)
				{
						RSInterface.createSkillHover(hovers[i], 9, 60, 31);
						RSInterface.addSkillButton474(buttons[i]);
						RSInterface.addImage(icons[i], spriteNames[i] + (Client.clientRevision("474") ? 320 : 0));
				}
				skill.children(icons.length + (text.length * 2) + hovers.length + buttons.length + 3 + 2);
				int frame = 0;
				RSInterface totalLevel = RSInterface.interfaceCache[3984];
				totalLevel.textColour = 0xffff01;
				totalLevel.message = "Total level: 0";
				totalLevel.textDrawingAreas = RSInterface.fonts[1];
				totalLevel.textSize = 1;

				skill.child(frame, 24362, 5 + x + 3, 225 + y1);
				frame++;
				skill.child(frame, 24363, 6 + x, 224 + y1);
				frame++;
				skill.child(frame, 3984, 89, 240);
				frame++;

				RSInterface.addText(20246, "Combat Lvl: 0", TDA, 1, ClientConstants.YELLOW, false, true);
				skill.child(frame, 20246, 89, 225);
				frame++;

				RSInterface.addText(20247, "QP: 0", TDA, 1, ClientConstants.YELLOW, false, true);
				skill.child(frame, 20247, 20, 232);
				frame++;
				int yExtra = 0;
				for (int i = 0; i < buttons.length; i++)
				{
						if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18)
						{
								yExtra += 3;
						}
						skill.child(frame, buttons[i], buttonCoords[i][0] + x, buttonCoords[i][1] + y + yExtra);
						frame++;
				}
				yExtra = 0;
				int xExtra = 0;
				int yExtra1 = 0;
				for (int i = 0; i < icons.length; i++)
				{

						if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18)
						{
								yExtra += 3;
						}
						if (Client.clientRevision("525"))
						{
								if (i == 0)
								{
										xExtra = 1;
										yExtra1 = 3;
								}
								else if (i == 17)
								{
										xExtra = -2;
										yExtra1 = -1;
								}
								else if (i == 9)
								{
										xExtra = -1;
										yExtra1 = 1;
								}
								else if (i == 1)
								{
										xExtra = 0;
										yExtra1 = 1;
								}
								else if (i == 2)
								{
										xExtra = -1;
										yExtra1 = 2;
								}
								else if (i == 4)
								{
										xExtra = -4;
										yExtra1 = 0;
								}
								else if (i == 5)
								{
										xExtra = -3;
										yExtra1 = 1;
								}
								else if (i == 7)
								{
										xExtra = -2;
										yExtra1 = -1;
								}
								else if (i == 8)
								{
										xExtra = -2;
										yExtra1 = 0;
								}
								else if (i == 10)
								{
										xExtra = -1;
										yExtra1 = 0;
								}
								else if (i == 11)
								{
										xExtra = -1;
										yExtra1 = -1;
								}
								else if (i == 12)
								{
										xExtra = -1;
										yExtra1 = 0;
								}
								else if (i == 13)
								{
										xExtra = 1;
										yExtra1 = 0;
								}
								else if (i == 14)
								{
										xExtra = -1;
										yExtra1 = 0;
								}
								else if (i == 15)
								{
										xExtra = 0;
										yExtra1 = 2;
								}
								else if (i == 16)
								{
										xExtra = 1;
										yExtra1 = 2;
								}
								else if (i == 18)
								{
										xExtra = 0;
										yExtra1 = -1;
								}
						}
						skill.child(frame, icons[i], iconCoords[i][0] + x + xExtra + (Client.clientRevision("525") ? 1 : 0), iconCoords[i][1] + y + yExtra + yExtra1 + 1 + (Client.clientRevision("525") ? -1 : 0));
						frame++;
						xExtra = 0;
						yExtra1 = 0;
				}
				yExtra = 0;
				int yOne = 5;
				for (int i = 0; i < text.length; i++)
				{
						if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18)
						{
								yExtra += 3;
								yOne += 31;
						}
						RSInterface text1 = RSInterface.interfaceCache[text[i][0]];
						text1.textColour = 0xffff01;
						RSInterface text2 = RSInterface.interfaceCache[text[i][1]];
						text2.textColour = 0xffff01;
						skill.child(frame, text[i][0], textCoords[i][0] + x, yOne);
						frame++;
				}
				yExtra = 0;
				yOne = 19;
				for (int i = 0; i < text.length; i++)
				{
						if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18)
						{
								yExtra += 3;
								yOne += 31;
						}
						skill.child(frame, text[i][1], textCoords[i][2] + x + 1, yOne - 2);
						frame++;
				}
				yExtra = 0;
				for (int i = 0; i < hovers.length; i++)
				{

						if (i == 3 || i == 6 || i == 9 || i == 12 || i == 15 || i == 18)
						{
								yExtra += 3;
						}
						skill.child(frame, hovers[i], buttonCoords[i][0] + x, buttonCoords[i][1] + y + yExtra);
						frame++;
				}
		}

		public static void equipmentTab(TextDrawingArea[] wid)
		{
				RSInterface Interface = RSInterface.interfaceCache[1644];
				RSInterface.addSpriteOld(15101, ""); // cheap hax
				RSInterface.addSpriteOld(15102, ""); // cheap hax
				RSInterface.addSpriteOld(15109, ""); // cheap hax
				Interface.children[23] = 15101;
				Interface.childX[23] = 40;
				Interface.childY[23] = 205;
				Interface.children[24] = 15102;
				Interface.childX[24] = 110;
				Interface.childY[24] = 205;
				Interface.children[25] = 15109;
				Interface.childX[25] = 39;
				Interface.childY[25] = 240;
				Interface.children[26] = 27650;
				Interface.childX[26] = 0;
				Interface.childY[26] = 0;
				Interface = RSInterface.addInterface(27650);

				RSInterface.setChildren(4, Interface);
				// Show Equipment Stats
				RSInterface.addHover(28853, 4, 0, 28854, 311, 40, 39, "Show Equipment Stats");
				RSInterface.addHovered(28854, 312, 40, 39, 28855);
				RSInterface.setBounds(28853, 40, 208, 0, Interface);
				RSInterface.setBounds(28854, 40, 208, 1, Interface);

				// Show items kept on death
				RSInterface.addHover(28850, 4, 0, 28851, 313, 40, 39, "Show items kept on death");
				RSInterface.addHovered(28851, 314, 40, 39, 28852);
				RSInterface.setBounds(28850, 112, 208, 2, Interface);
				RSInterface.setBounds(28851, 112, 208, 3, Interface);
				/*
				RSInterface.createTimedHoverBox(22195, "Show Equipment Stats", 40, 39, 35, 282);
				RSInterface.createTimedHoverBox(22196, "Show Items Kept on Death", 40, 39, 74, 282);
				RSInterface.setBounds(22195, 40, 208, 4, Interface);
				RSInterface.setBounds(22196, 112, 208, 5, Interface);
				*/

		}

		public static void clanChatTab(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addTabInterface(18128);
				RSInterface.addHoverButton(18129, 307, 72, 32, "Join/Leave a Clan", -1, 18130, 1);
				RSInterface.addHoveredButton(18130, 308, 72, 32, 18131);
				RSInterface.addHoverButton(18132, 307, 72, 32, "Clan setup", -1, 18133, 5);
				RSInterface.addHoveredButton(18133, 308, 72, 32, 18134);
				RSInterface.addText(18135, "Join Chat", tda, 0, 0xff9b00, true, true);
				RSInterface.addText(18136, "Clan setup", tda, 0, 0xff9b00, true, true);
				RSInterface.addSprite(18137, 309);
				RSInterface.addText(18138, "Clan Chat", tda, 1, 0xff9b00, true, true);
				RSInterface.addText(18139, "Owner:", tda, 0, 0xff9b00, false, true);
				RSInterface.addText(18140, "Talking in:", tda, 0, 0xff9b00, false, true);
				tab.totalChildren(11);
				tab.child(0, 18137, 0, 60);
				tab.child(1, 18143, 0, 62);
				tab.child(2, 18129, 15, 226);
				tab.child(3, 18130, 15, 226);
				tab.child(4, 18132, 103, 226);
				tab.child(5, 18133, 103, 226);
				tab.child(6, 18135, 51, 237);
				tab.child(7, 18136, 139, 237);
				tab.child(8, 18138, 95, 1);
				tab.child(9, 18139, 20, 23);
				tab.child(10, 18140, 21, 38); /* Text area */
				RSInterface list = RSInterface.addTabInterface(18143);
				list.totalChildren(100);

				for (int i = 24600; i <= 24699; i++)
				{
						RSInterface.addText(i, "", tda, 0, 0xffffff, false, true);
				}

				for (int id = 24600, i = 0; id <= 24699 && i <= 99; id++, i++)
				{
						if (ClientConfiguration.DEBUG_INTERFACES)
						{
								RSInterface.interfaceIds.add(id);
						}
						list.children[i] = id;
						list.childX[i] = 12;
						for (int id2 = 24600, i2 = 1; id2 <= 24699 && i2 <= 99; id2++, i2++)
						{
								list.childY[0] = 2;
								list.childY[i2] = list.childY[i2 - 1] + 14;
						}
				}
				list.height = 158;
				list.width = 174;
				list.scrollMax = 1405;
		}

		public static void levelUpInterface(TextDrawingArea[] tda)
		{
				// RSInterface text = interfaceCache[7202];
				RSInterface attack = RSInterface.interfaceCache[6247];
				RSInterface defence = RSInterface.interfaceCache[6253];
				RSInterface str = RSInterface.interfaceCache[6206];
				RSInterface hits = RSInterface.interfaceCache[6216];
				RSInterface rng = RSInterface.interfaceCache[4443];
				RSInterface pray = RSInterface.interfaceCache[6242];
				RSInterface mage = RSInterface.interfaceCache[6211];
				RSInterface cook = RSInterface.interfaceCache[6226];
				RSInterface wood = RSInterface.interfaceCache[4272];
				RSInterface flet = RSInterface.interfaceCache[6231];
				RSInterface fish = RSInterface.interfaceCache[6258];
				RSInterface fire = RSInterface.interfaceCache[4282];
				RSInterface craf = RSInterface.interfaceCache[6263];
				RSInterface smit = RSInterface.interfaceCache[6221];
				RSInterface mine = RSInterface.interfaceCache[4416];
				RSInterface herb = RSInterface.interfaceCache[6237];
				RSInterface agil = RSInterface.interfaceCache[4277];
				RSInterface thie = RSInterface.interfaceCache[4261];
				RSInterface slay = RSInterface.interfaceCache[12122];
				RSInterface farm = RSInterface.interfaceCache[5267];
				RSInterface rune = RSInterface.interfaceCache[4267];
				RSInterface cons = RSInterface.interfaceCache[7267];
				RSInterface hunt = RSInterface.interfaceCache[8267];
				RSInterface summ = RSInterface.addInterface(9267);
				RSInterface dung = RSInterface.addInterface(10267);
				RSInterface.addSprite(17878, 352);
				RSInterface.addSprite(17879, 353);
				RSInterface.addSprite(17880, 354);
				RSInterface.addSprite(17881, 355);
				RSInterface.addSprite(17882, 356);
				RSInterface.addSprite(17883, 357);
				RSInterface.addSprite(17884, 358);
				RSInterface.addSprite(17885, 359);
				RSInterface.addSprite(17886, 360);
				RSInterface.addSprite(17887, 361);
				RSInterface.addSprite(17888, 362);
				RSInterface.addSprite(17889, 363);
				RSInterface.addSprite(17890, 364);
				RSInterface.addSprite(17891, 365);
				RSInterface.addSprite(17892, 366);
				RSInterface.addSprite(17893, 367);
				RSInterface.addSprite(17894, 368);
				RSInterface.addSprite(17895, 369);
				RSInterface.addSprite(17896, 370);
				RSInterface.addSprite(11897, 371);
				RSInterface.addSprite(17898, 372);
				RSInterface.addSpriteOld(17899, "");
				RSInterface.addSpriteOld(17900, "");
				RSInterface.addSpriteOld(17901, "");
				RSInterface.addSpriteOld(17902, "");
				RSInterface.setChildren(4, attack);
				RSInterface.setBounds(17878, 20, 30, 0, attack);
				RSInterface.setBounds(4268, 80, 15, 1, attack);
				RSInterface.setBounds(4269, 80, 45, 2, attack);
				RSInterface.setBounds(358, 95, 75, 3, attack);
				RSInterface.setChildren(4, defence);
				RSInterface.setBounds(17879, 20, 30, 0, defence);
				RSInterface.setBounds(4268, 80, 15, 1, defence);
				RSInterface.setBounds(4269, 80, 45, 2, defence);
				RSInterface.setBounds(358, 95, 75, 3, defence);
				RSInterface.setChildren(4, str);
				RSInterface.setBounds(17880, 20, 30, 0, str);
				RSInterface.setBounds(4268, 80, 15, 1, str);
				RSInterface.setBounds(4269, 80, 45, 2, str);
				RSInterface.setBounds(358, 95, 75, 3, str);
				RSInterface.setChildren(4, hits);
				RSInterface.setBounds(17881, 20, 30, 0, hits);
				RSInterface.setBounds(4268, 80, 15, 1, hits);
				RSInterface.setBounds(4269, 80, 45, 2, hits);
				RSInterface.setBounds(358, 95, 75, 3, hits);
				RSInterface.setChildren(4, rng);
				RSInterface.setBounds(17882, 20, 30, 0, rng);
				RSInterface.setBounds(4268, 80, 15, 1, rng);
				RSInterface.setBounds(4269, 80, 45, 2, rng);
				RSInterface.setBounds(358, 95, 75, 3, rng);
				RSInterface.setChildren(4, pray);
				RSInterface.setBounds(17883, 20, 30, 0, pray);
				RSInterface.setBounds(4268, 80, 15, 1, pray);
				RSInterface.setBounds(4269, 80, 45, 2, pray);
				RSInterface.setBounds(358, 95, 75, 3, pray);
				RSInterface.setChildren(4, mage);
				RSInterface.setBounds(17884, 20, 30, 0, mage);
				RSInterface.setBounds(4268, 80, 15, 1, mage);
				RSInterface.setBounds(4269, 80, 45, 2, mage);
				RSInterface.setBounds(358, 95, 75, 3, mage);
				RSInterface.setChildren(4, cook);
				RSInterface.setBounds(17885, 20, 30, 0, cook);
				RSInterface.setBounds(4268, 80, 15, 1, cook);
				RSInterface.setBounds(4269, 80, 45, 2, cook);
				RSInterface.setBounds(358, 95, 75, 3, cook);
				RSInterface.setChildren(4, wood);
				RSInterface.setBounds(17886, 20, 30, 0, wood);
				RSInterface.setBounds(4268, 80, 15, 1, wood);
				RSInterface.setBounds(4269, 80, 45, 2, wood);
				RSInterface.setBounds(358, 95, 75, 3, wood);
				RSInterface.setChildren(4, flet);
				RSInterface.setBounds(17887, 20, 30, 0, flet);
				RSInterface.setBounds(4268, 80, 15, 1, flet);
				RSInterface.setBounds(4269, 80, 45, 2, flet);
				RSInterface.setBounds(358, 95, 75, 3, flet);
				RSInterface.setChildren(4, fish);
				RSInterface.setBounds(17888, 20, 30, 0, fish);
				RSInterface.setBounds(4268, 80, 15, 1, fish);
				RSInterface.setBounds(4269, 80, 45, 2, fish);
				RSInterface.setBounds(358, 95, 75, 3, fish);
				RSInterface.setChildren(4, fire);
				RSInterface.setBounds(17889, 20, 30, 0, fire);
				RSInterface.setBounds(4268, 80, 15, 1, fire);
				RSInterface.setBounds(4269, 80, 45, 2, fire);
				RSInterface.setBounds(358, 95, 75, 3, fire);
				RSInterface.setChildren(4, craf);
				RSInterface.setBounds(17890, 20, 30, 0, craf);
				RSInterface.setBounds(4268, 80, 15, 1, craf);
				RSInterface.setBounds(4269, 80, 45, 2, craf);
				RSInterface.setBounds(358, 95, 75, 3, craf);
				RSInterface.setChildren(4, smit);
				RSInterface.setBounds(17891, 20, 30, 0, smit);
				RSInterface.setBounds(4268, 80, 15, 1, smit);
				RSInterface.setBounds(4269, 80, 45, 2, smit);
				RSInterface.setBounds(358, 95, 75, 3, smit);
				RSInterface.setChildren(4, mine);
				RSInterface.setBounds(17892, 20, 30, 0, mine);
				RSInterface.setBounds(4268, 80, 15, 1, mine);
				RSInterface.setBounds(4269, 80, 45, 2, mine);
				RSInterface.setBounds(358, 95, 75, 3, mine);
				RSInterface.setChildren(4, herb);
				RSInterface.setBounds(17893, 20, 30, 0, herb);
				RSInterface.setBounds(4268, 80, 15, 1, herb);
				RSInterface.setBounds(4269, 80, 45, 2, herb);
				RSInterface.setBounds(358, 95, 75, 3, herb);
				RSInterface.setChildren(4, agil);
				RSInterface.setBounds(17894, 20, 30, 0, agil);
				RSInterface.setBounds(4268, 80, 15, 1, agil);
				RSInterface.setBounds(4269, 80, 45, 2, agil);
				RSInterface.setBounds(358, 95, 75, 3, agil);
				RSInterface.setChildren(4, thie);
				RSInterface.setBounds(17895, 20, 30, 0, thie);
				RSInterface.setBounds(4268, 80, 15, 1, thie);
				RSInterface.setBounds(4269, 80, 45, 2, thie);
				RSInterface.setBounds(358, 95, 75, 3, thie);
				RSInterface.setChildren(4, slay);
				RSInterface.setBounds(17896, 20, 30, 0, slay);
				RSInterface.setBounds(4268, 80, 15, 1, slay);
				RSInterface.setBounds(4269, 80, 45, 2, slay);
				RSInterface.setBounds(358, 95, 75, 3, slay);
				RSInterface.setChildren(3, farm);
				RSInterface.setBounds(4268, 80, 15, 0, farm);
				RSInterface.setBounds(4269, 80, 45, 1, farm);
				RSInterface.setBounds(358, 95, 75, 2, farm);
				RSInterface.setChildren(4, rune);
				RSInterface.setBounds(17898, 20, 30, 0, rune);
				RSInterface.setBounds(4268, 80, 15, 1, rune);
				RSInterface.setBounds(4269, 80, 45, 2, rune);
				RSInterface.setBounds(358, 95, 75, 3, rune);
				RSInterface.setChildren(3, cons);
				RSInterface.setBounds(4268, 80, 15, 0, cons);
				RSInterface.setBounds(4269, 80, 45, 1, cons);
				RSInterface.setBounds(358, 95, 75, 2, cons);
				RSInterface.setChildren(3, hunt);
				RSInterface.setBounds(4268, 80, 15, 0, hunt);
				RSInterface.setBounds(4269, 80, 45, 1, hunt);
				RSInterface.setBounds(358, 95, 75, 2, hunt);
				RSInterface.setChildren(4, summ);
				RSInterface.setBounds(17901, 20, 30, 0, summ);
				RSInterface.setBounds(4268, 80, 15, 1, summ);
				RSInterface.setBounds(4269, 80, 45, 2, summ);
				RSInterface.setBounds(358, 95, 75, 3, summ);
				RSInterface.setChildren(4, dung);
				RSInterface.setBounds(17902, 20, 30, 0, dung);
				RSInterface.setBounds(4268, 80, 15, 1, dung);
				RSInterface.setBounds(4269, 80, 45, 2, dung);
				RSInterface.setBounds(358, 95, 75, 3, dung);
		}

		public static void combatInterfaces(TextDrawingArea[] tda)
		{
				RSInterface.Sidebar0a(1698, 1701, 7499, "Chop", "Hack", "Smash", "Block", 42, 75, 127, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
				RSInterface.Sidebar0a(2276, 2279, 7574, "Stab", "Lunge", "Slash", "Block", 43, 75, 124, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
				RSInterface.Sidebar0a(2423, 2426, 7599, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
				RSInterface.Sidebar0a(3796, 3799, 7624, "Pound", "Pummel", "Spike", "Block", 39, 75, 121, 75, 41, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
				RSInterface.Sidebar0a(4679, 4682, 7674, "Lunge", "Swipe", "Pound", "Block", 40, 75, 124, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
				RSInterface.Sidebar0a(4705, 4708, 7699, "Chop", "Slash", "Smash", "Block", 42, 75, 125, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
				RSInterface.Sidebar0a(5570, 5573, 7724, "Spike", "Impale", "Smash", "Block", 41, 75, 123, 75, 39, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
				RSInterface.Sidebar0a(7762, 7765, 7800, "Chop", "Slash", "Lunge", "Block", 42, 75, 125, 75, 40, 128, 125, 128, 122, 103, 40, 50, 122, 50, 40, 103, tda);
				RSInterface.Sidebar0b(776, 779, "Reap", "Chop", "Jab", "Block", 42, 75, 126, 75, 46, 128, 125, 128, 122, 103, 122, 50, 40, 103, 40, 50, tda);
				RSInterface.Sidebar0c(425, 428, 7474, "Pound", "Pummel", "Block", 39, 75, 121, 75, 42, 128, 40, 103, 40, 50, 122, 50, tda);
				RSInterface.Sidebar0c(1749, 1752, 7524, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda);
				RSInterface.Sidebar0c(1764, 1767, 7549, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda);
				RSInterface.Sidebar0c(4446, 4449, 7649, "Accurate", "Rapid", "Longrange", 33, 75, 125, 75, 29, 128, 40, 103, 40, 50, 122, 50, tda);
				RSInterface.Sidebar0c(5855, 5857, 7749, "Punch", "Kick", "Block", 40, 75, 129, 75, 42, 128, 40, 50, 122, 50, 40, 103, tda);
				RSInterface.Sidebar0c(6103, 6132, 6117, "Bash", "Pound", "Block", 43, 75, 124, 75, 42, 128, 40, 103, 40, 50, 122, 50, tda);

				RSInterface.Sidebar0c(8460, 8463, 8493, "Jab", "Swipe", "Fend", 46, 75, 124, 75, 43, 128, 40, 50, 122, 50, 40, 103, tda);

				RSInterface.Sidebar0c(12290, 12293, 12323, "Flick", "Lash", "Deflect", 44, 75, 127, 75, 36, 128, 40, 50, 40, 103, 122, 50, tda);
				RSInterface.Sidebar0d(328, 331, "Bash", "Pound", "Focus", 42, 66, 39, 101, 41, 136, 40, 120, 40, 50, 40, 85, tda);

				RSInterface rsi = RSInterface.addInterface(19300);
				RSInterface.addToggleButton(150, 415, 416, 172, 150, 44, "Auto Retaliate");
				rsi.totalChildren(3, 3, 3);
				rsi.child(0, 19000, 92, 26); // Combat level
				rsi.child(2, 19001, 500, 500); // Constitution updating
				rsi.child(1, 150, 21, 153); // auto retaliate
				RSInterface.addText(19000, "Combat level:", tda, 0, 0xff981f, true, false);
				RSInterface.addText(19001, "", tda, 0, 0xff981f, true, false);
		}

		public static void friendsTab(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addTabInterface(5065); // Interface identity of friends tab.
				tab.totalChildren(11);

				RSInterface.addText(5067, "Friends List", tda, 1, 0xff9933, true, true); // Friends list text at the top.
				tab.child(0, 5067, 95, 4);

				RSInterface.addSprite(16127, 201); // The brown background.
				tab.child(1, 16127, 0, 25);

				RSInterface.addSprite(16126, 198); // The line at the top and bottom.
				tab.child(2, 16126, 0, 220);
				tab.child(3, 16126, 0, 22);

				RSInterface list = RSInterface.interfaceCache[5066]; // The scroll.
				tab.child(4, 5066, 0, 24);

				RSInterface.addHoverButton(5068, 199, 72, 32, "Add Friend", 201, 5072, 1); // The Add friend button.
				tab.child(5, 5068, 15, 226);

				RSInterface.addHoveredButton(5072, 200, 72, 32, 5073); // The add friend hovered button.
				tab.child(6, 5072, 15, 226);

				RSInterface.addHoverButton(5069, 199, 72, 32, "Delete Friend", 202, 5074, 1); // The delete friend button.
				tab.child(7, 5069, 103, 226);

				RSInterface.addHoveredButton(5074, 200, 72, 32, 5075); // The delete friend hovered button.
				tab.child(8, 5074, 103, 226);

				RSInterface.addText(5070, "Add Friend", tda, 0, 0xff9933, false, true); // Add friend text.
				tab.child(9, 5070, 25, 237);

				RSInterface.addText(5071, "Delete Friend", tda, 0, 0xff9933, false, true); // Delete friend text.
				tab.child(10, 5071, 106, 237);

				/* Everything to do with the scroll */
				list.height = 196;
				list.width = 174;
				for (int id = 5092, i = 0; id <= 5191 && i <= 99; id++, i++)
				{
						list.children[i] = id;
						list.childX[i] = 3;
						list.childY[i] = list.childY[i] - 7;
				}
				for (int id = 5192, i = 100; id <= 5291 && i <= 199; id++, i++)
				{
						list.children[i] = id;
						list.childX[i] = 131;
						list.childY[i] = list.childY[i] - 7;
				}
		}

		public static void ignoreTab(TextDrawingArea[] tda)
		{
				RSInterface tab = RSInterface.addTabInterface(5715);
				RSInterface list = RSInterface.interfaceCache[5716];
				RSInterface.addText(5717, "Ignore List", tda, 1, 0xff9933, true, true);
				RSInterface.addText(5720, "Add Name", tda, 0, 0xff9933, false, true);
				RSInterface.addText(5721, "Delete Name", tda, 0, 0xff9933, false, true);
				RSInterface.addHoverButton(5718, 199, 72, 32, "Add Name", 501, 5722, 1);
				RSInterface.addHoveredButton(5722, 200, 72, 32, 5723);
				RSInterface.addHoverButton(5719, 199, 72, 32, "Delete Name", 502, 5724, 1);
				RSInterface.addHoveredButton(5724, 200, 72, 32, 5725);
				tab.totalChildren(11);
				tab.child(0, 5717, 95, 4);
				tab.child(1, 16127, 0, 25);
				tab.child(2, 16126, 0, 220);
				tab.child(3, 16126, 0, 22);
				tab.child(4, 5718, 15, 226);
				tab.child(5, 5722, 15, 226);
				tab.child(6, 5719, 103, 226);
				tab.child(7, 5724, 103, 226);
				tab.child(8, 5720, 27, 237);
				tab.child(9, 5721, 108, 237);
				tab.child(10, 5716, 0, 24);
				list.height = 196;
				list.width = 174;
				for (int id = 5742, i = 0; id <= 5841 && i <= 99; id++, i++)
				{
						list.children[i] = id;
						list.childX[i] = 3;
						list.childY[i] = list.childY[i] - 7;
				}
		}

		public static void equipmentScreen(TextDrawingArea[] wid)
		{
				RSInterface tab = RSInterface.addTabInterface(15106, 20, 504, 9, 332);
				RSInterface.addSprite(15107, 283);
				RSInterface.addHoverButton(15210, 148, 21, 21, "Close Window", 250, 15211, 3);
				RSInterface.addHoveredButton(15211, 149, 21, 21, 15212);
				RSInterface.addText(15111, "", wid, 2, 0xe4a146, false, true);
				RSInterface.addText(15112, "Attack bonuses", wid, 2, 0xFF8900, false, true);
				RSInterface.addText(15113, "Defence bonuses", wid, 2, 0xFF8900, false, true);
				RSInterface.addText(15114, "Other bonuses", wid, 2, 0xFF8900, false, true);
				RSInterface.addText(15115, "Ranged strength:", wid, 1, 0xFF8900, false, true);
				RSInterface.addText(15116, "Magic damage bonus:", wid, 1, 0xFF8900, false, true);
				for (int i = 1675; i <= 1684; i++)
				{
						RSInterface.textSize(i, wid, 1);
				}
				RSInterface.textSize(1686, wid, 1);
				RSInterface.textSize(1687, wid, 1);
				RSInterface.addChar(15125);
				tab.totalChildren(46);
				tab.child(0, 15107, 15, 5);
				tab.child(1, 15210, 476, 8);
				tab.child(2, 15211, 476, 8);
				tab.child(3, 15111, 14, 30);
				int Child = 4;
				int Y = 45;
				for (int i = 1675; i <= 1679; i++)
				{
						tab.child(Child, i, 29, Y);
						Child++;
						Y += 14;
				}
				tab.child(9, 1680, 29, 137); // 161
				tab.child(10, 1681, 29, 153);
				tab.child(11, 1682, 29, 168);
				tab.child(12, 1683, 29, 183);
				tab.child(13, 1684, 29, 197);
				tab.child(14, 1686, 29, 262 - 24);
				tab.child(17, 1687, 29, 276 - 24);
				tab.child(15, 15125, 170, 200);
				tab.child(16, 15112, 24, 30);
				tab.child(18, 15113, 24, 122); // 147
				tab.child(19, 15114, 24, 223);
				tab.child(20, 1645, 104 + 295, 149 - 52);
				tab.child(21, 1646, 399, 163);
				tab.child(22, 1647, 399, 163);
				tab.child(23, 1648, 399, 58 + 146);
				tab.child(24, 1649, 343, 176);
				tab.child(25, 1650, 321 + 22, 58 + 154);
				tab.child(26, 1651, 321 + 134, 58 + 118);
				tab.child(27, 1652, 321 + 134, 58 + 154);
				tab.child(28, 1653, 321 + 48, 58 + 81);
				tab.child(29, 1654, 321 + 107, 58 + 81);
				tab.child(30, 1655, 321 + 58, 58 + 42);
				tab.child(31, 1656, 321 + 112, 58 + 41);
				tab.child(32, 1657, 321 + 78, 58 + 4);
				tab.child(33, 1658, 321 + 37, 58 + 43);
				tab.child(34, 1659, 321 + 78, 58 + 43);
				tab.child(35, 1660, 321 + 119, 58 + 43);
				tab.child(36, 1661, 321 + 22, 58 + 82);
				tab.child(37, 1662, 321 + 78, 58 + 82);
				tab.child(38, 1663, 321 + 134, 58 + 82);
				tab.child(39, 1664, 321 + 78, 58 + 122);
				tab.child(40, 1665, 321 + 78, 58 + 162);
				tab.child(41, 1666, 321 + 22, 58 + 162);
				tab.child(42, 1667, 321 + 134, 58 + 162);
				tab.child(43, 1688, 50 + 297 - 2, 110 - 13 + 5);
				tab.child(44, 15115, 29, 266);
				tab.child(45, 15116, 29, 280);
				for (int i = 1675; i <= 1684; i++)
				{
						RSInterface rsi = RSInterface.interfaceCache[i];
						rsi.textColour = 0xFF9200;
						rsi.centerText = false;
				}
				for (int i = 1686; i <= 1687; i++)
				{
						RSInterface rsi = RSInterface.interfaceCache[i];
						rsi.textColour = 0xFF9200;
						rsi.centerText = false;
				}
		}

		public static void configureLunar(TextDrawingArea[] TDA)
		{//186
				RSInterface.constructLunar();
				RSInterface.homeTeleport();
				RSInterface.drawRune(30003, 1, "Fire");
				RSInterface.drawRune(30004, 2, "Water");
				RSInterface.drawRune(30005, 3, "Air");
				RSInterface.drawRune(30006, 4, "Earth");
				RSInterface.drawRune(30007, 5, "Mind");
				RSInterface.drawRune(30008, 6, "Body");
				RSInterface.drawRune(30009, 7, "Death");
				RSInterface.drawRune(30010, 8, "Nature");
				RSInterface.drawRune(30011, 9, "Chaos");
				RSInterface.drawRune(30012, 10, "Law");
				RSInterface.drawRune(30013, 11, "Cosmic");
				RSInterface.drawRune(30014, 12, "Blood");
				RSInterface.drawRune(30015, 13, "Soul");
				RSInterface.drawRune(30016, 14, "Astral");
				RSInterface.addLunar3RunesSmallBox(30017, 9075, 554, 555, 0, 4, 3, 30003, 30004, 64, "Bake Pie", "Bake pies without a stove", TDA, 0, 16, 2);
				RSInterface.addLunar2RunesSmallBox(30025, 9075, 557, 0, 7, 30006, 65, "Cure Plant", "Cure disease on farming patch", TDA, 1, 4, 2);
				RSInterface.addLunar3RunesBigBox(30032, 9075, 564, 558, 0, 0, 0, 30013, 30007, 65, "Monster Examine", "Detect the combat statistics of a\\nmonster", TDA, 2, 2, 2);
				RSInterface.addLunar3RunesSmallBox(30040, 9075, 564, 556, 0, 0, 1, 30013, 30005, 66, "NPC Contact", "Speak with varied NPCs", TDA, 3, 0, 2);
				RSInterface.addLunar3RunesSmallBox(30048, 9075, 563, 557, 0, 0, 9, 30012, 30006, 67, "Cure Other", "Cure poisoned players", TDA, 4, 8, 2);
				RSInterface.addLunar3RunesSmallBox(30056, 9075, 555, 554, 0, 2, 0, 30004, 30003, 67, "Humidify", "fills certain vessels with water", TDA, 5, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30064, 9075, 563, 557, 1, 0, 1, 30012, 30006, 68, "Teleports", "Teleports you to moonclan island", TDA, 6, 0, 5);
				RSInterface.addLunar3RunesBigBox(30075, 9075, 563, 557, 1, 0, 3, 30012, 30006, 69, "Teleports", "Teleports players to Moonclan\\nisland", TDA, 7, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30083, 9075, 563, 557, 1, 0, 5, 30012, 30006, 70, "Teleports", "Teleports you to ourania rune altar", TDA, 8, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30091, 9075, 564, 563, 1, 1, 0, 30013, 30012, 70, "Cure Me", "Cures Poison", TDA, 9, 0, 5);
				RSInterface.addLunar2RunesSmallBox(30099, 9075, 557, 1, 1, 30006, 70, "Hunter Kit", "Get a kit of hunting gear", TDA, 10, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30106, 9075, 563, 555, 1, 0, 0, 30012, 30004, 71, "Teleports", "Teleports you to Waterbirth island", TDA, 11, 0, 5);
				RSInterface.addLunar3RunesBigBox(30114, 9075, 563, 555, 1, 0, 4, 30012, 30004, 72, "Teleports", "Teleports players to Waterbirth\\nisland", TDA, 12, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30122, 9075, 564, 563, 1, 1, 1, 30013, 30012, 73, "Cure Group", "Cures Poison on players", TDA, 13, 0, 5);
				RSInterface.addLunar3RunesBigBox(30130, 9075, 564, 559, 1, 1, 4, 30013, 30008, 74, "Stat Spy", "Cast on another player to see their\\nskill levels", TDA, 14, 8, 2);
				RSInterface.addLunar3RunesBigBox(30138, 9075, 563, 554, 1, 1, 2, 30012, 30003, 74, "Teleports", "Teleports you to the Barbarian\\noutpost", TDA, 15, 0, 5);
				RSInterface.addLunar3RunesBigBox(30146, 9075, 563, 554, 1, 1, 5, 30012, 30003, 75, "Tele Group Barbarian", "Teleports players to the Barbarian\\noutpost", TDA, 16, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30154, 9075, 554, 556, 1, 5, 9, 30003, 30005, 76, "Superglass Make", "Make glass without a furnace", TDA, 17, 16, 2);
				RSInterface.addLunar3RunesSmallBox(30162, 9075, 563, 555, 1, 1, 3, 30012, 30004, 77, "Teleports", "Teleports you to Port khazard", TDA, 18, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30170, 9075, 563, 555, 1, 1, 7, 30012, 30004, 78, "Teleports", "Teleports players to Port khazard", TDA, 19, 0, 5);
				RSInterface.addLunar3RunesBigBox(30178, 9075, 564, 559, 1, 0, 4, 30013, 30008, 78, "Dream", "Take a rest and restore hitpoints 3\\n times faster", TDA, 20, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30186, 9075, 557, 555, 1, 9, 4, 30006, 30004, 79, "String Jewellery", "String amulets without wool", TDA, 21, 0, 5);
				RSInterface.addLunar3RunesLargeBox(30194, 9075, 557, 555, 1, 9, 9, 30006, 30004, 80, "Stat Restore Pot\\nShare", "Share a potion with up to 4 nearby\\nplayers", TDA, 22, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30202, 9075, 554, 555, 1, 6, 6, 30003, 30004, 81, "Magic Imbue", "Combine runes without a talisman", TDA, 23, 0, 5);
				RSInterface.addLunar3RunesBigBox(30210, 9075, 561, 557, 2, 1, 14, 30010, 30006, 82, "Fertile Soil", "Fertilise a farming patch with super\\ncompost", TDA, 24, 4, 2);
				RSInterface.addLunar3RunesBigBox(30218, 9075, 557, 555, 2, 11, 9, 30006, 30004, 83, "Boost Potion Share", "Shares a potion with up to 4 nearby\\nplayers", TDA, 25, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30226, 9075, 563, 555, 2, 2, 9, 30012, 30004, 84, "Fishing Guild Teleport", "Teleports you to the fishing guild", TDA, 26, 0, 5);
				RSInterface.addLunar3RunesLargeBox(30234, 9075, 563, 555, 1, 2, 13, 30012, 30004, 85, "Tele Group Fishing\\nGuild", "Teleports players to the Fishing\\nGuild", TDA, 27, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30242, 9075, 557, 561, 2, 14, 0, 30006, 30010, 85, "Plank Make", "Turn Logs into planks", TDA, 28, 16, 5);
				/******** Cut Off Limit **********/
				RSInterface.addLunar3RunesSmallBox(30250, 9075, 563, 555, 2, 2, 9, 30012, 30004, 86, "Catherby Teleport", "Teleports you to Catherby", TDA, 29, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30258, 9075, 563, 555, 2, 2, 14, 30012, 30004, 87, "Tele Group Catherby", "Teleports players to Catherby", TDA, 30, 0, 5);
				RSInterface.addLunar3RunesSmallBox(30266, 9075, 563, 555, 2, 2, 7, 30012, 30004, 88, "Ice Plateau Teleport", "Teleports you to Ice Plateau", TDA, 31, 0, 5);
				RSInterface.addLunar3RunesBigBox(30274, 9075, 563, 555, 2, 2, 15, 30012, 30004, 89, "Tele Group Ice\\n Plateau", "Teleports players to Ice Plateau", TDA, 32, 0, 5);
				RSInterface.addLunar3RunesBigBox(30282, 9075, 563, 561, 2, 1, 0, 30012, 30010, 90, "Energy Transfer", "Spend hitpoints and SA Energy to\\n give another player hitpoints and run energy", TDA, 33, 8, 2);
				RSInterface.addLunar3RunesBigBox(30290, 9075, 563, 565, 2, 2, 0, 30012, 30014, 91, "Heal Other", "Transfer up to 75% of hitpoints\\n to another player", TDA, 34, 8, 2);
				RSInterface.addLunar3RunesBigBox(30298, 9075, 560, 557, 2, 1, 9, 30009, 30006, 92, "Vengeance Other", "Allows another player to rebound\\ndamage to an opponent", TDA, 35, 8, 2);
				RSInterface.addLunar3RunesSmallBox(30306, 9075, 560, 557, 3, 1, 9, 30009, 30006, 93, "Vengeance", "Rebound damage to an opponent", TDA, 36, 0, 5);
				RSInterface.addLunar3RunesBigBox(30314, 9075, 565, 563, 3, 2, 5, 30014, 30012, 94, "Heal Group", "Transfer up to 75% of hitpoints to a group", TDA, 37, 0, 5);
				RSInterface.addLunar3RunesBigBox(30322, 9075, 564, 563, 2, 1, 0, 30013, 30012, 95, "Spellbook Swap", "Change to another spellbook for 1\\nspell cast", TDA, 38, 0, 5);
		}

		static void achievementRewards(TextDrawingArea[] TDA)
		{
				int interfaceId = 19302;
				int children = 0;
				int totalChildren = 36;
				int y1 = -20;
				RSInterface Interface = RSInterface.addInterface(interfaceId, 164, 351, 20, 323);
				RSInterface.setChildren(totalChildren, Interface);

				interfaceId++;
				RSInterface.addSprite(interfaceId, 573); // Background.
				RSInterface.setBounds(interfaceId, 160, 36 + y1, children, Interface);

				interfaceId++;
				children++;
				RSInterface.addText(interfaceId, "Rewards", TDA, 2, 0xffb000, true, true);
				RSInterface.setBounds(interfaceId, 243, 43 + y1, children, Interface);

				interfaceId++;
				children++;
				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 16, 16, "Close Window");
				RSInterface.setBounds(interfaceId, 323, 43 + y1, children, Interface);
				children++;
				RSInterface.setBounds(interfaceId + 1, 323, 43 + y1, children, Interface);
				interfaceId++;
				interfaceId++;

				interfaceId++;
				children++;
				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 251, 252, 16, 16, "Back");
				RSInterface.setBounds(interfaceId, 304, 43 + y1, children, Interface);
				children++;
				RSInterface.setBounds(interfaceId + 1, 304, 43 + y1, children, Interface);
				interfaceId++;
				interfaceId++;

				int x = 168;
				for (int index = 0; index < 4; index++)
				{
						interfaceId++;
						children++;
						RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 567, 568, 44, 20, "Select");
						RSInterface.setSpriteClicked(interfaceId, 569);
						RSInterface.setBounds(interfaceId, x, 68 + y1, children, Interface);
						children++;
						RSInterface.setBounds(interfaceId + 1, x, 68 + y1, children, Interface);
						interfaceId++;
						interfaceId++;
						x += 43;
				}

				x = 189;
				String[] string = {"Easy", "Med", "Hard", "Elite"};
				for (int index = 0; index < 4; index++)
				{
						interfaceId++;
						children++;
						RSInterface.addText(interfaceId, string[index], TDA, 2, 0xffb000, true, true);
						RSInterface.setBounds(interfaceId, x, 51, children, Interface);
						x += 43;
				}

				int y = 92;
				for (int index = 0; index < 18; index++)
				{
						interfaceId++;
						children++;
						RSInterface.addText(interfaceId, "", TDA, 0, 0xffb000, false, true);
						RSInterface.setBounds(interfaceId, 173, y + y1, children, Interface);
						y += 13;
				}
		}

		static void achievementOpenedInterface(TextDrawingArea[] TDA)
		{
				int interfaceId = 22260;
				int children = 0;
				int totalChildren = 16;
				RSInterface Interface = RSInterface.addInterface(interfaceId, 17, 500, 19, 318);
				RSInterface.setChildren(totalChildren, Interface);

				interfaceId++;
				RSInterface.addSprite(interfaceId, 566); // Background.
				RSInterface.setBounds(interfaceId, 13, 14, children, Interface);

				interfaceId++;
				children++;
				RSInterface.addText(interfaceId, "Achievements", TDA, 2, 0xffb000, true, true);
				RSInterface.setBounds(interfaceId, 265, 21, children, Interface);


				// Progress bar text.
				interfaceId++;
				children++;
				RSInterface.addText(interfaceId, "", TDA, 1, 0xffffff, true, true);
				RSInterface.setBounds(interfaceId, 342, 280, children, Interface);


				// Points: text.
				interfaceId++;
				children++;
				RSInterface.addText(interfaceId, "", TDA, 1, 0xffb000, true, true);
				RSInterface.setBounds(interfaceId, 109, 273, children, Interface);

				// Easy Completed text.
				interfaceId++;
				children++;
				RSInterface.addText(interfaceId, "", TDA, 1, 0xffb000, true, true);
				RSInterface.setBounds(interfaceId, 107, 280, children, Interface);

				interfaceId++;
				children++;
				RSInterface.addHoverButtonLatest(interfaceId, interfaceId + 1, interfaceId + 2, 148, 149, 15, 15, "Close Window");
				RSInterface.setBounds(interfaceId, 473, 21, children, Interface);
				children++;
				RSInterface.setBounds(interfaceId + 1, 473, 21, children, Interface);
				interfaceId++;
				interfaceId++;

				for (int index = 0; index < 4; index++)
				{
						// It contained easy/med/hard/elite buttons.
						interfaceId++;
						interfaceId++;
						interfaceId++;
				}

				interfaceId++; // leave, this had the Easy/Med/Hard/Elite text.

				// Achievement title on the right.
				interfaceId++;
				children++;
				RSInterface.addText(interfaceId, "", TDA, 2, 0xffb000, true, true);
				RSInterface.setBounds(interfaceId, 345, 55, children, Interface);

				interfaceId++;
				children++;
				RSInterface.addText(interfaceId, "Description", TDA, 1, 0xffb000, true, true);
				RSInterface.setBounds(interfaceId, 345, 55, children, Interface);

				// Description sub text.
				int y1 = 78;
				for (int index = 0; index < 3; index++)
				{
						interfaceId++;
						children++;
						RSInterface.addText(interfaceId, "", TDA, 0, 0xffffff, true, true);
						RSInterface.setBounds(interfaceId, 345, y1, children, Interface);
						y1 += 13;
				}

				interfaceId++;
				children++;
				RSInterface.addText(interfaceId, "Rewards", TDA, 1, 0xffb000, true, true);
				RSInterface.setBounds(interfaceId, 345, 120, children, Interface);

				// Requirements sub text.
				for (int index = 0; index < 2; index++)
				{
						interfaceId++;
				}

				// Rewards button.
				interfaceId++;
				interfaceId++;



				interfaceId++;
				children++;
				RSInterface.addText(interfaceId, "", TDA, 0, 0xffffff, true, true);
				RSInterface.setBounds(interfaceId, 345, 145, children, Interface);


				interfaceId++;
				children++;
				RSInterface.itemGroup(interfaceId, 4, 3, 13, 0);
				RSInterface.setBounds(interfaceId, 265, 163, children, Interface);

				interfaceId++;
				children++;
				RSInterface scrollTab1 = RSInterface.addInterface(interfaceId);
				RSInterface.setBounds(interfaceId, 25, 49, children, Interface); // scrollTab1
				scrollTab1.width = 150;
				scrollTab1.height = 219;
				scrollTab1.scrollMax = 900;


				// Achievement title on the scroll.
				scrollTab1.totalChildren(70);
				int y = 5;
				for (int i = 0; i < 70; i++)
				{
						interfaceId++;
						RSInterface.addText(interfaceId, "", TDA, 0, 0xff0000, false, false, 0xffffff, "Select", 150);
						RSInterface.textClicked(interfaceId, 570, 1, 2);
						scrollTab1.child(i, interfaceId, 0, y);
						y += 15;
				}
		}

		static void profileInterface(TextDrawingArea[] tda)
		{
				RSInterface Interface = RSInterface.addInterface(25320, 12, 508, 13, 329);
				RSInterface.addSprite(25321, 327); // Background.

				RSInterface.addHoverButton(25322, 148, 16, 16, "Close Window", -1, 25323, 1); // Close button.
				RSInterface.addHoveredButton(25323, 149, 16, 16, 25324); // Close button hover.
				RSInterface.addText(25325, "Profile of", tda, 2, 0xffb000, false, true); // Profile of Mgt Madness.
				RSInterface.addText(25326, "Search", tda, 0, 0xffb000, true, true); // Search text.
				RSInterface.addHoverButton(25327, 409, 106, 20, "Search", -1, 25328, 1); // Search button.
				RSInterface.addHoveredButton(25328, 328, 106, 20, 25329); // Search button hover.
				RSInterface.addSprite(25330, 330); // Left image.
				RSInterface.addSprite(25331, 330); // Right image.

				RSInterface.setChildren(50, Interface);
				int x = -3;
				int y = -3;
				RSInterface.setBounds(25321, 10 + x, 12 + y, 0, Interface); // Background.
				RSInterface.setBounds(25322, 481 + x, 21 + y, 1, Interface); // Close button.
				RSInterface.setBounds(25323, 481 + x, 21 + y, 2, Interface); // Close button hover.
				RSInterface.setBounds(25325, 193 + x, 21 + y, 3, Interface); // Profile of Mgt Madness.
				RSInterface.setBounds(25327, 398 + x, 48 + y, 4, Interface); // Search button.
				RSInterface.setBounds(25328, 395 + x, 45 + y, 5, Interface); // Search button hover.
				RSInterface.setBounds(25326, 448 + x, 50 + y, 6, Interface); // Search text.
				RSInterface.setBounds(25330, 21 + x, 73 + y, 7, Interface); // Left image
				RSInterface.setBounds(25331, 261 + x, 73 + y, 8, Interface); // Right image
				int index = 0;
				int interfaceId = 25332;
				int children = 9;
				int x1 = 0;
				String tabs[] = {"Info", "Pking", "Skilling", "Pvm", "Misc"};
				// setChildren(19, Interface); Is declared before any setBounds are called.
				// And remember that the order of setBounds has to be in order, look above, 0 to 3 is above this for loop, because this for loop starts at 4.
				for (int i = 0; i < 5; i++)
				{
						RSInterface.addHoverButton(interfaceId + index, 350, 75, 20, "Toggle", -1, (interfaceId + index) + 1, 1);
						RSInterface.setBounds(interfaceId + index, 16 + x1 + x, 45 + y, children, Interface); // Info button.
						RSInterface.setSpriteClicked(interfaceId + index, 397);
						index++;
						children++;

						RSInterface.addHoveredButton(interfaceId + index, 351, 75, 20, (interfaceId + index) + 1);
						RSInterface.setBounds(interfaceId + index, 16 + x1 + x, 45 + y, children, Interface); // Info button hover.
						index += 2;
						children++;
						RSInterface.addText(interfaceId + index, tabs[i], tda, 2, 0xffff01, true, true);
						RSInterface.setBounds(interfaceId + index, 54 + x1 + x, 48 + y, children, Interface); // Info text.
						index++;
						children++;
						x1 += 75;
				}


				RSInterface.addText(25369, "", tda, 1, 0xffff01, true, true);
				RSInterface.setBounds(25369, 164 + x, 194 + y, 24, Interface);
				RSInterface.addText(25370, "", tda, 1, 0xffff01, true, true);
				RSInterface.setBounds(25370, 350 + x, 194 + y, 25, Interface);

				RSInterface.addText(25353, "", tda, 1, 0xffb000, false, true);
				RSInterface.setBounds(25353, 27 + x, 77 + y, 26, Interface);
				RSInterface.addText(25354, "", tda, 1, 0xffb000, false, true);
				RSInterface.setBounds(25354, 27 + x, 95 + y, 27, Interface);
				RSInterface.addText(25355, "", tda, 1, 0xffb000, false, true);
				RSInterface.setBounds(25355, 27 + x, 113 + y, 28, Interface);
				RSInterface.addText(25356, "", tda, 1, 0xffb000, false, true);
				RSInterface.setBounds(25356, 27 + x, 131 + y, 29, Interface);
				RSInterface.addText(25357, "", tda, 1, 0xffb000, false, true);
				RSInterface.setBounds(25357, 27 + x, 149 + y, 30, Interface);


				RSInterface.addText(25358, "Bio (name, country, age, hobbies):", tda, 1, 0xffb000, false, true);
				RSInterface.setBounds(25358, 267 + x, 77 + y, 31, Interface);
				RSInterface.addText(25359, "", tda, 1, 0xffb000, false, true, 0xffffff, "Change", 226);
				RSInterface.setBounds(25359, 267 + x, 95 + y, 32, Interface);
				RSInterface.addText(25360, "", tda, 1, 0xffb000, false, true, 0xffffff, "Change", 226);
				RSInterface.setBounds(25360, 267 + x, 113 + y, 33, Interface);
				RSInterface.addText(25361, "", tda, 1, 0xffb000, false, true, 0xffffff, "Change", 226);
				RSInterface.setBounds(25361, 267 + x, 131 + y, 34, Interface);
				RSInterface.addText(25362, "", tda, 1, 0xffb000, false, true, 0xffffff, "Change", 226);
				RSInterface.setBounds(25362, 267 + x, 149 + y, 35, Interface);

				RSInterface.addSprite(25363, 329); // Left image
				RSInterface.setBounds(25363, 110 + x, 189 + y, 36, Interface);

				RSInterface.addSprite(25364, 329); // Right image
				RSInterface.setBounds(25364, 300 + x, 189 + y, 37, Interface);


				RSInterface.addText(25365, "Player killing rank", tda, 1, 0xffff01, true, true);
				RSInterface.setBounds(25365, 164 + x, 192 + y, 38, Interface);
				RSInterface.addText(25366, "Adventurer rank", tda, 1, 0xffff01, true, true);
				RSInterface.setBounds(25366, 355 + x, 192 + y, 39, Interface);

				RSInterface.addText(25367, "", tda, 1, 0xffff01, true, true);
				RSInterface.setBounds(25367, 164 + x, 217 + y, 40, Interface);
				RSInterface.addText(25368, "", tda, 1, 0xffff01, true, true);
				RSInterface.setBounds(25368, 355 + x, 217 + y, 41, Interface);

				RSInterface.addText(25371, "", tda, 1, 0xffb000, false, true); // Gameplay type:
				RSInterface.setBounds(25371, 27 + x, 167 + y, 42, Interface);

				RSInterface.addText(25373, "", tda, 1, 0xffb000, false, true, 0xffffff, "Change", 226);
				RSInterface.setBounds(25373, 267 + x, 167 + y, 43, Interface);
				//

				RSInterface.addToItemGroup(25374, 1205, 1, 1, 24, 24, false, null, null, null);
				RSInterface.setBounds(25374, 150 + x, 238 + y, 44, Interface);

				RSInterface.addToItemGroup(25375, 1117, 1, 1, 24, 24, false, null, null, null);
				RSInterface.setBounds(25375, 123 + x, 277 + y, 45, Interface);

				RSInterface.addToItemGroup(25376, 1075, 1, 1, 24, 24, false, null, null, null);
				RSInterface.setBounds(25376, 175 + x, 277 + y, 46, Interface);
				//

				RSInterface.addToItemGroup(25377, 1205, 1, 1, 24, 24, false, null, null, null);
				RSInterface.setBounds(25377, 340 + x, 238 + y, 47, Interface);

				RSInterface.addToItemGroup(25378, 1117, 1, 1, 24, 24, false, null, null, null);
				RSInterface.setBounds(25378, 313 + x, 277 + y, 48, Interface);

				RSInterface.addToItemGroup(25379, 1075, 1, 1, 24, 24, false, null, null, null);
				RSInterface.setBounds(25379, 365 + x, 277 + y, 49, Interface);
		}

		static void profileInterface1(TextDrawingArea[] tda)
		{
				RSInterface Interface = RSInterface.addInterface(25380, 12, 508, 13, 329);
				RSInterface.setChildren(50, Interface);
				int x = -3;
				int y = -3;
				RSInterface.setBounds(25321, 10 + x, 12 + y, 0, Interface); // Background.
				RSInterface.setBounds(25322, 481 + x, 21 + y, 1, Interface); // Close button.
				RSInterface.setBounds(25323, 481 + x, 21 + y, 2, Interface); // Close button hover.
				RSInterface.setBounds(25325, 193 + x, 21 + y, 3, Interface); // Profile of Mgt Madness.
				RSInterface.setBounds(25327, 398 + x, 48 + y, 4, Interface); // Search button.
				RSInterface.setBounds(25328, 395 + x, 45 + y, 5, Interface); // Search button hover.
				RSInterface.setBounds(25326, 448 + x, 50 + y, 6, Interface); // Search text.
				RSInterface.addSprite(25548, 331); // Left image
				RSInterface.addSprite(25549, 331); // Right image
				RSInterface.setBounds(25548, 36 + x, 83 + y, 7, Interface); // Left image
				RSInterface.setBounds(25549, 267 + x, 83 + y, 8, Interface); // Right image
				int index = 0;
				int interfaceId = 25332;
				int children = 9;
				int x1 = 0;
				// setChildren(19, Interface); Is declared before any setBounds are called.
				// And remember that the order of setBounds has to be in order, look above, 0 to 3 is above this for loop, because this for loop starts at 4.
				for (int i = 0; i < 5; i++)
				{
						RSInterface.setBounds(interfaceId + index, 16 + x1 + x, 45 + y, children, Interface); // Info button.
						index++;
						children++;

						RSInterface.setBounds(interfaceId + index, 16 + x1 + x, 45 + y, children, Interface); // Info button hover.
						index += 2;
						children++;

						RSInterface.setBounds(interfaceId + index, 54 + x1 + x, 48 + y, children, Interface); // Info text.
						index++;
						children++;
						x1 += 75;
				}
				interfaceId = 25550;
				int yBase = 87;
				y = yBase;
				for (int i = 0; i < 23; i++)
				{

						RSInterface.addText(interfaceId, "Profile", tda, 1, 0xffb000, false, true);
						RSInterface.setBounds(interfaceId, x + 46, y, children, Interface);
						children++;
						interfaceId++;
						y += 20;
						if (i > 10)
						{
								y -= 4;
						}
						if (i == 10)
						{
								x += 232;
								y = yBase;
						}
				}
				RSInterface.addHoverButton(25578, 338, 90, 20, "Open", -1, 25579, 1);
				RSInterface.setBounds(25578, 326, 282, 47, Interface);

				RSInterface.addHoveredButton(25579, 339, 90, 20, 25580);
				RSInterface.setBounds(25579, 326, 282, 48, Interface);

				RSInterface.addText(25581, "Weapon stats", tda, 1, 0xffff01, true);
				RSInterface.setBounds(25581, 371, 284, 49, Interface);
		}

		static void profileInterface2(TextDrawingArea[] tda)
		{
				RSInterface Interface = RSInterface.addInterface(25590, 12, 508, 13, 329);

				RSInterface.setChildren(116, Interface);
				int x = -3;
				int y = -3;
				RSInterface.setBounds(25321, 10 + x, 12 + y, 0, Interface); // Background.
				RSInterface.setBounds(25322, 481 + x, 21 + y, 1, Interface); // Close button.
				RSInterface.setBounds(25323, 481 + x, 21 + y, 2, Interface); // Close button hover.
				RSInterface.setBounds(25325, 193 + x, 21 + y, 3, Interface); // Profile of Mgt Madness.
				RSInterface.setBounds(25327, 398 + x, 48 + y, 4, Interface); // Search button.
				RSInterface.setBounds(25328, 395 + x, 45 + y, 5, Interface); // Search button hover.
				RSInterface.setBounds(25326, 448 + x, 50 + y, 6, Interface); // Search text.
				RSInterface.addSprite(25591, 332); // Left image
				RSInterface.setBounds(25591, 22 + x, 73 + y, 7, Interface); // Left image
				RSInterface.addSprite(25592, 334); // Right image
				RSInterface.setBounds(25592, 342 + x, 73 + y, 8, Interface); // Right image
				RSInterface.addSprite(25593, 334); // Right image
				RSInterface.setBounds(25593, 183 + x, 73 + y, 9, Interface); // Right image
				RSInterface.addSprite(25594, 333); // Total level image background.
				RSInterface.setBounds(25594, 22 + x, 291 + y, 10, Interface);

				int index = 0;
				int interfaceId = 25332;
				int children = 11;
				int x1 = 0;
				String tabs[] = {"Info", "Pking", "Skilling", "Pvm", "Misc"};
				// setChildren(19, Interface); Is declared before any setBounds are called.
				// And remember that the order of setBounds has to be in order, look above, 0 to 3 is above this for loop, because this for loop starts at 4.
				for (int i = 0; i < 5; i++)
				{
						RSInterface.setBounds(interfaceId + index, 16 + x1 + x, 45 + y, children, Interface); // Info button.
						index++;
						children++;

						RSInterface.setBounds(interfaceId + index, 16 + x1 + x, 45 + y, children, Interface); // Info button hover.
						index += 2;
						children++;

						RSInterface.addText(interfaceId + index, tabs[i], tda, 2, 0xffff01, true, true);
						RSInterface.setBounds(interfaceId + index, 54 + x1 + x, 48 + y, children, Interface); // Info text.
						index++;
						children++;
						x1 += 75;
				}
				interfaceId = 25600;
				int yBase = 77;
				x = 25;
				y = yBase;
				for (int i = 0; i < 22; i++)
				{

						if (i == 21)
						{
								x = 20;
								y += 6;
						}

						RSInterface.addHoverButton(interfaceId, spriteNamesOrdered[i] + (Client.clientRevision("474") ? 320 : 0), i == 21 ? 155 : 40, 23, "Open", -1, interfaceId + 1, 1);
						RSInterface.setBounds(interfaceId, x, y, children, Interface);
						interfaceId++;
						children++;


						RSInterface.addHoveredButton(interfaceId, spriteNamesOrdered[i] + (Client.clientRevision("474") ? 320 : 0), i == 21 ? 155 : 40, 23, interfaceId + 1);
						RSInterface.setBounds(interfaceId, x, y, children, Interface);
						RSInterface.interfaceCache[interfaceId + 1].toolTipSpecialX = i == 21 ? x + 2 : x - 21;
						RSInterface.interfaceCache[interfaceId + 1].toolTipSpecialY = y - 25;
						children++;
						interfaceId += 2;

						RSInterface.addText(interfaceId, "", tda, i == 21 ? 2 : 0, 0xffff01, true, true);
						RSInterface.setBounds(interfaceId, i == 21 ? x + (Client.clientRevision("474") ? 77 : 85) : x + 32, i == 21 ? y + 2 : y + 7, children, Interface);
						children++;
						interfaceId++;



						y += 30;
						if (i == 6 || i == 13)
						{
								x += 52;
								y = yBase;
						}
				}


				yBase = 77;
				x = 145;
				y = yBase;
				for (int i = 0; i < 24; i++)
				{

						RSInterface.addText(interfaceId, "", tda, 1, 0xffb000, false, true);
						RSInterface.setBounds(interfaceId, x + 46, y, children, Interface);
						children++;
						interfaceId++;
						y += 20;
						if (i == 11)
						{
								x += 158;
								y = yBase;
						}
				}

		}

		static void profileInterface3(TextDrawingArea[] tda)
		{
				RSInterface Interface = RSInterface.addInterface(25740, 12, 508, 13, 329);
				RSInterface scrollTab1 = RSInterface.addInterface(25741);
				RSInterface scrollTab2 = RSInterface.addInterface(25742);

				RSInterface.setChildren(28, Interface);
				int x = -3;
				int y = -3;
				RSInterface.setBounds(25321, 10 + x, 12 + y, 0, Interface); // Background.
				RSInterface.setBounds(25322, 481 + x, 21 + y, 1, Interface); // Close button.
				RSInterface.setBounds(25323, 481 + x, 21 + y, 2, Interface); // Close button hover.
				RSInterface.setBounds(25325, 193 + x, 21 + y, 3, Interface); // Profile of Mgt Madness.
				RSInterface.setBounds(25327, 398 + x, 48 + y, 4, Interface); // Search button.
				RSInterface.setBounds(25328, 395 + x, 45 + y, 5, Interface); // Search button hover.
				RSInterface.setBounds(25326, 448 + x, 50 + y, 6, Interface); // Search text.

				int index = 0;
				int interfaceId = 25332;
				int children = 7;
				int x1 = 0;
				for (int i = 0; i < 5; i++)
				{
						RSInterface.setBounds(interfaceId + index, 16 + x1 + x, 45 + y, children, Interface); // Info button.
						index++;
						children++;

						RSInterface.setBounds(interfaceId + index, 16 + x1 + x, 45 + y, children, Interface); // Info button hover.
						index += 2;
						children++;

						RSInterface.setBounds(interfaceId + index, 54 + x1 + x, 48 + y, children, Interface); // Info text.
						index++;
						children++;
						x1 += 75;
				}


				int yScroll = -10;
				RSInterface.addSprite(25743, 335); // Left image
				RSInterface.setBounds(25743, 36 + x, 93 + y + yScroll, 22, Interface); // Left image
				RSInterface.addSprite(25744, 335); // Right image
				RSInterface.setBounds(25744, 267 + x, 93 + y + yScroll, 23, Interface); // Right image
				RSInterface.addText(25745, "Npc kills: 6200, Boss kills: 66", tda, 1, 0xffb000, true, true);
				RSInterface.setBounds(25745, 140, 93 + yScroll, 24, Interface);

				RSInterface.addText(25746, "", tda, 1, 0xffb000, true, true);
				RSInterface.setBounds(25746, 371, 93 + yScroll, 25, Interface);

				RSInterface.setBounds(25741, 62, 115 + yScroll, 26, Interface); // scrollTab1
				RSInterface.setBounds(25742, 270, 115 + yScroll, 27, Interface); // scrollTab2

				scrollTab1.totalChildren(100);
				int interfaceId1 = 25755;
				y = 5;
				for (int i = 0; i < 100; i++)
				{
						RSInterface.addText(interfaceId1 + i, "", tda, 0, 0xffb000, true, true);
						scrollTab1.child(i, interfaceId1 + i, 75, y);
						y += 15;

				}
				scrollTab1.width = 168;
				scrollTab1.height = 199;
				scrollTab1.scrollMax = 1512;

				scrollTab2.totalChildren(100);
				interfaceId1 = 25755 + 100;
				y = 5;
				for (int i = 0; i < 100; i++)
				{
						RSInterface.addText(interfaceId1 + i, "", tda, 0, 0xffb000, true, true);
						scrollTab2.child(i, interfaceId1 + i, 92, y);
						y += 15;

				}
				scrollTab2.width = 188;
				scrollTab2.height = 199;
				scrollTab2.scrollMax = 1512;
		}

		static void profileInterface4(TextDrawingArea[] tda)
		{
				RSInterface Interface = RSInterface.addInterface(22052, 12, 508, 13, 329);
				RSInterface.setChildren(45, Interface);
				int x = -3;
				int y = -3;
				RSInterface.setBounds(25321, 10 + x, 12 + y, 0, Interface); // Background.
				RSInterface.setBounds(25322, 481 + x, 21 + y, 1, Interface); // Close button.
				RSInterface.setBounds(25323, 481 + x, 21 + y, 2, Interface); // Close button hover.
				RSInterface.setBounds(25325, 193 + x, 21 + y, 3, Interface); // Profile of Mgt Madness.
				RSInterface.setBounds(25327, 398 + x, 48 + y, 4, Interface); // Search button.
				RSInterface.setBounds(25328, 395 + x, 45 + y, 5, Interface); // Search button hover.
				RSInterface.setBounds(25326, 448 + x, 50 + y, 6, Interface); // Search text.
				RSInterface.setBounds(25548, 36 + x, 83 + y, 7, Interface); // Left image
				RSInterface.setBounds(25549, 267 + x, 83 + y, 8, Interface); // Right image
				int index = 0;
				int interfaceId = 25332;
				int children = 9;
				int x1 = 0;
				// setChildren(19, Interface); Is declared before any setBounds are called.
				// And remember that the order of setBounds has to be in order, look above, 0 to 3 is above this for loop, because this for loop starts at 4.
				for (int i = 0; i < 5; i++)
				{
						RSInterface.setBounds(interfaceId + index, 16 + x1 + x, 45 + y, children, Interface); // Info button.
						index++;
						children++;

						RSInterface.setBounds(interfaceId + index, 16 + x1 + x, 45 + y, children, Interface); // Info button hover.
						index += 2;
						children++;

						RSInterface.setBounds(interfaceId + index, 54 + x1 + x, 48 + y, children, Interface); // Info text.
						index++;
						children++;
						x1 += 75;
				}
				interfaceId = 25550;
				int yBase = 87;
				y = yBase;
				for (int i = 0; i < 21; i++)
				{

						RSInterface.setBounds(interfaceId, x + 46, y, children, Interface);
						children++;
						interfaceId++;
						y += 20;
						if (i == 10)
						{
								x += 232;
								y = yBase;
						}
				}
		}

}