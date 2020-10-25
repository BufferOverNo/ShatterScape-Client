public class ChatArea
{

		static void chatAreaTextNew(Client client)
		{
				if (Client.is474GameFrame || Client.is474PlusGameFrame)
				{
						return;
				}
				//TODO #FULLSCREEN ADJUST chatbox right clicking the buttons.
				int y = client.mouseY;
				if (!Client.isFixedScreen())
				{
						y = client.mouseY - (Client.getClientHeight() - 543);
				}
				if (client.mouseX >= 5 && client.mouseX <= 61 && y >= 479 && y <= 503)
				{
						client.menuActionName[1] = "View All";
						client.menuActionID[1] = 999;
						client.menuActionRow = 2;
				}
				else if (client.mouseX >= 62 && client.mouseX <= 117 && y >= 479 && y <= 503)
				{
						client.menuActionName[1] = "View Game";
						client.menuActionID[1] = 998;
						client.menuActionName[2] = "Filtered game";
						client.menuActionID[2] = 1005;
						client.menuActionName[3] = "Configure messages";
						client.menuActionID[3] = 1007;
						client.menuActionName[4] = "On game";
						client.menuActionID[4] = 1006;
						client.menuActionRow = 5;
				}
				else if (client.mouseX >= 118 && client.mouseX <= 175 && y >= 479 && y <= 503)
				{
						client.menuActionName[1] = "Hide public";
						client.menuActionID[1] = 997;
						client.menuActionName[2] = "Off public";
						client.menuActionID[2] = 996;
						client.menuActionName[3] = "Friends public";
						client.menuActionID[3] = 995;
						client.menuActionName[4] = "On public";
						client.menuActionID[4] = 994;
						client.menuActionName[5] = "View public";
						client.menuActionID[5] = 993;
						client.menuActionRow = 6;
				}
				else if (client.mouseX >= 176 && client.mouseX <= 232 && y >= 479 && y <= 503)
				{
						client.menuActionName[1] = "Off private";
						client.menuActionID[1] = 992;
						client.menuActionName[2] = "Friends private";
						client.menuActionID[2] = 991;
						client.menuActionName[3] = "On private";
						client.menuActionID[3] = 990;
						client.menuActionName[4] = "View private";
						client.menuActionID[4] = 989;
						client.menuActionName[5] = "Clear history";
						client.menuActionID[5] = 1008;
						client.menuActionRow = 6;
				}
				else if (client.mouseX >= 233 && client.mouseX <= 289 && y >= 479 && y <= 503)
				{
						client.menuActionName[1] = "Off clan chat";
						client.menuActionID[1] = 1003;
						client.menuActionName[2] = "Friends clan chat";
						client.menuActionID[2] = 1002;
						client.menuActionName[3] = "On clan chat";
						client.menuActionID[3] = 1001;
						client.menuActionName[4] = "View clan chat";
						client.menuActionID[4] = 1000;
						client.menuActionRow = 5;
				}
				else if (client.mouseX >= 290 && client.mouseX <= 345 && y >= 479 && y <= 503)
				{
						client.menuActionName[1] = "Off trade";
						client.menuActionID[1] = 987;
						client.menuActionName[2] = "Friends trade";
						client.menuActionID[2] = 986;
						client.menuActionName[3] = "On trade";
						client.menuActionID[3] = 985;
						client.menuActionName[4] = "View trade";
						client.menuActionID[4] = 984;
						client.menuActionRow = 5;
				}
		}

		static void chatAreaTextOld(Client client)
		{
				if (!Client.is474GameFrame && !Client.is474PlusGameFrame)
				{
						return;
				}
				int y = client.mouseY;
				if (!Client.isFixedScreen())
				{
						y = client.mouseY - (Client.getClientHeight() - 543);
				}
				if (client.mouseX >= 5 && client.mouseX <= 61 && y >= 482 && y <= 503)
				{
						client.menuActionName[1] = "View All";
						client.menuActionID[1] = 999;
						client.menuActionRow = 2;
				}
				else if (client.mouseX >= 71 && client.mouseX <= 127 && y >= 482 && y <= 503)
				{
						client.menuActionName[1] = "View Game";
						client.menuActionID[1] = 998;
						client.menuActionName[2] = "Filtered game";
						client.menuActionID[2] = 1005;
						client.menuActionName[3] = "Configure messages";
						client.menuActionID[3] = 1007;
						client.menuActionName[4] = "On game";
						client.menuActionID[4] = 1006;
						client.menuActionRow = 5;
				}
				else if (client.mouseX >= 137 && client.mouseX <= 193 && y >= 482 && y <= 503)
				{
						client.menuActionName[1] = "Hide public";
						client.menuActionID[1] = 997;
						client.menuActionName[2] = "Off public";
						client.menuActionID[2] = 996;
						client.menuActionName[3] = "Friends public";
						client.menuActionID[3] = 995;
						client.menuActionName[4] = "On public";
						client.menuActionID[4] = 994;
						client.menuActionName[5] = "View public";
						client.menuActionID[5] = 993;
						client.menuActionRow = 6;
				}
				else if (client.mouseX >= 203 && client.mouseX <= 259 && y >= 482 && y <= 503)
				{
						client.menuActionName[1] = "Off private";
						client.menuActionID[1] = 992;
						client.menuActionName[2] = "Friends private";
						client.menuActionID[2] = 991;
						client.menuActionName[3] = "On private";
						client.menuActionID[3] = 990;
						client.menuActionName[4] = "View private";
						client.menuActionID[4] = 989;
						client.menuActionName[5] = "Clear history";
						client.menuActionID[5] = 1008;
						client.menuActionRow = 6;
				}
				else if (client.mouseX >= 269 && client.mouseX <= 325 && y >= 482 && y <= 503)
				{
						client.menuActionName[1] = "Off clan chat";
						client.menuActionID[1] = 1003;
						client.menuActionName[2] = "Friends clan chat";
						client.menuActionID[2] = 1002;
						client.menuActionName[3] = "On clan chat";
						client.menuActionID[3] = 1001;
						client.menuActionName[4] = "View clan chat";
						client.menuActionID[4] = 1000;
						client.menuActionRow = 5;
				}
				else if (client.mouseX >= 335 && client.mouseX <= 391 && y >= 482 && y <= 503)
				{
						client.menuActionName[1] = "Off trade";
						client.menuActionID[1] = 987;
						client.menuActionName[2] = "Friends trade";
						client.menuActionID[2] = 986;
						client.menuActionName[3] = "On trade";
						client.menuActionID[3] = 985;
						client.menuActionName[4] = "View trade";
						client.menuActionID[4] = 984;
						client.menuActionRow = 5;
				}
		}

		static void channelButtonApplyHoverNew(Client client)
		{

				if (Client.is474GameFrame || Client.is474PlusGameFrame)
				{
						return;
				}
				int x = client.mouseX;
				int y = client.mouseY;
				// TODO #FULLSCREEN ADJUST chat box button hovers.
				if (!Client.isFixedScreen())
				{
						y = client.mouseY - (Client.getClientHeight() - 543);
				}
				if (x >= 5 && x <= 61 && y >= 479 && y <= 503)
				{
						client.cButtonHPos = 0;
						Client.setInputTaken(true);
				}
				else if (x >= 62 && x <= 117 && y >= 479 && y <= 503)
				{
						client.cButtonHPos = 1;
						Client.setInputTaken(true);
				}
				else if (x >= 118 && x <= 175 && y >= 479 && y <= 503)
				{
						client.cButtonHPos = 2;
						Client.setInputTaken(true);
				}
				else if (x >= 176 && x <= 232 && y >= 479 && y <= 503)
				{
						client.cButtonHPos = 3;
						Client.setInputTaken(true);
				}
				else if (x >= 233 && x <= 289 && y >= 479 && y <= 503)
				{
						client.cButtonHPos = 4;
						Client.setInputTaken(true);
				}
				else if (x >= 290 && x <= 345 && y >= 479 && y <= 503)
				{
						client.cButtonHPos = 5;
						Client.setInputTaken(true);
				}
				else if (x >= 346 && x <= 402 && y >= 479 && y <= 503)
				{
						client.cButtonHPos = 6;
						Client.setInputTaken(true);
				}
				else if (x >= 403 && x <= 514 && y >= 479 && y <= 503)
				{
						client.cButtonHPos = 7;
						Client.setInputTaken(true);
				}
				else
				{
						client.cButtonHPos = -1;
						Client.setInputTaken(true);
				}
				if (client.getClickMode3() == 1)
				{
						int y1 = client.saveClickY;
						// TODO #FULLSCREEN ADJUST chat box button clicking.
						if (!Client.isFixedScreen())
						{
								y1 = client.saveClickY - (Client.getClientHeight() - 543);
						}
						if (client.saveClickX >= 5 && client.saveClickX <= 61 && y1 >= 479 && y1 <= 505)
						{
								client.cButtonCPos = 0;
								client.chatTypeView = 0;
								Client.setInputTaken(true);
						}
						else if (client.saveClickX >= 62 && client.saveClickX <= 117 && y1 >= 479 && y1 <= 505)
						{
								client.cButtonCPos = 1;
								client.chatTypeView = 5;
								Client.setInputTaken(true);
						}
						else if (client.saveClickX >= 118 && client.saveClickX <= 175 && y1 >= 479 && y1 <= 505)
						{
								client.cButtonCPos = 2;
								client.chatTypeView = 1;
								Client.setInputTaken(true);
						}
						else if (client.saveClickX >= 176 && client.saveClickX <= 232 && y1 >= 479 && y1 <= 505)
						{
								client.cButtonCPos = 3;
								client.chatTypeView = 2;
								Client.setInputTaken(true);
						}
						else if (client.saveClickX >= 233 && client.saveClickX <= 289 && y1 >= 479 && y1 <= 505)
						{
								client.cButtonCPos = 4;
								client.chatTypeView = 11;
								Client.setInputTaken(true);
						}
						else if (client.saveClickX >= 290 && client.saveClickX <= 345 && y1 >= 479 && y1 <= 505)
						{
								client.cButtonCPos = 5;
								client.chatTypeView = 3;
								Client.setInputTaken(true);
						}
				}
		}

		static void channelButtonApplyHoverOld(Client client)
		{

				if (!Client.is474GameFrame && !Client.is474PlusGameFrame)
				{
						return;
				}
				int x = client.mouseX;
				int y = client.mouseY;
				if (!Client.isFixedScreen())
				{
						y = client.mouseY - (Client.getClientHeight() - 543);
				}
				if (x >= 5 && x <= 61 && y >= 482 && y <= 503)
				{
						client.cButtonHPos = 0;
						Client.setInputTaken(true);
				}
				else if (x >= 71 && x <= 127 && y >= 482 && y <= 503)
				{
						client.cButtonHPos = 1;
						Client.setInputTaken(true);
				}
				else if (x >= 137 && x <= 193 && y >= 482 && y <= 503)
				{
						client.cButtonHPos = 2;
						Client.setInputTaken(true);
				}
				else if (x >= 203 && x <= 259 && y >= 482 && y <= 503)
				{
						client.cButtonHPos = 3;
						Client.setInputTaken(true);
				}
				else if (x >= 269 && x <= 325 && y >= 482 && y <= 503)
				{
						client.cButtonHPos = 4;
						Client.setInputTaken(true);
				}
				else if (x >= 335 && x <= 391 && y >= 482 && y <= 503)
				{
						client.cButtonHPos = 5;
						Client.setInputTaken(true);
				}
				else if (x >= 404 && x <= 515 && y >= 482 && y <= 503)
				{
						client.cButtonHPos = 6;
						Client.setInputTaken(true);
				}
				else
				{
						client.cButtonHPos = -1;
						Client.setInputTaken(true);
				}
				if (client.getClickMode3() == 1)
				{
						int y1 = Client.saveRightClickY;
						if (!Client.isFixedScreen())
						{
								y1 = client.saveClickY - (Client.getClientHeight() - 543);
						}
						if (client.saveClickX >= 5 && client.saveClickX <= 61 && y1 >= 482 && y1 <= 505)
						{
								client.cButtonCPos = 0;
								client.chatTypeView = 0;
								Client.setInputTaken(true);
						}
						else if (client.saveClickX >= 71 && client.saveClickX <= 127 && y1 >= 482 && y1 <= 505)
						{
								client.cButtonCPos = 1;
								client.chatTypeView = 5;
								Client.setInputTaken(true);
						}
						else if (client.saveClickX >= 137 && client.saveClickX <= 193 && y1 >= 482 && y1 <= 505)
						{
								client.cButtonCPos = 2;
								client.chatTypeView = 1;
								Client.setInputTaken(true);
						}
						else if (client.saveClickX >= 203 && client.saveClickX <= 259 && y1 >= 482 && y1 <= 505)
						{
								client.cButtonCPos = 3;
								client.chatTypeView = 2;
								Client.setInputTaken(true);
						}
						else if (client.saveClickX >= 269 && client.saveClickX <= 325 && y1 >= 482 && y1 <= 505)
						{
								client.cButtonCPos = 4;
								client.chatTypeView = 11;
								Client.setInputTaken(true);
						}
						else if (client.saveClickX >= 335 && client.saveClickX <= 391 && y1 >= 482 && y1 <= 505)
						{
								client.cButtonCPos = 5;
								client.chatTypeView = 3;
								Client.setInputTaken(true);
						}
				}
		}

		/**
		 * The 474 chat area channel buttons.
		 */
		private static void channelButtonHoverImageOld(Client client)
		{
				if (!Client.is474GameFrame && !Client.is474PlusGameFrame)
				{
						return;
				}
				int yPosOffset = Client.isFixedScreen() ? 0 : Client.getClientHeight() - 204;
				String text[] = {"On", "Friends", "Off", "Hide"};
				int disabledColor[] = {65280, 0xffff00, 0xff0000, 65535};
				switch (client.cButtonCPos)
				{
						case 0:
								client.chatButtons[1].drawSprite(5, 142 + yPosOffset);
								break;
						case 1:
								client.chatButtons[1].drawSprite(71, 142 + yPosOffset);
								break;
						case 2:
								client.chatButtons[1].drawSprite(137, 142 + yPosOffset);
								break;
						case 3:
								client.chatButtons[1].drawSprite(203, 142 + yPosOffset);
								break;
						case 4:
								client.chatButtons[1].drawSprite(269, 142 + yPosOffset);
								break;
						case 5:
								client.chatButtons[1].drawSprite(335, 142 + yPosOffset);
								break;
				}
				if (client.cButtonHPos == client.cButtonCPos)
				{
						switch (client.cButtonHPos)
						{
								case 0:
										client.chatButtons[2].drawSprite(5, 142 + yPosOffset);
										break;
								case 1:
										client.chatButtons[2].drawSprite(71, 142 + yPosOffset);
										break;
								case 2:
										client.chatButtons[2].drawSprite(137, 142 + yPosOffset);
										break;
								case 3:
										client.chatButtons[2].drawSprite(203, 142 + yPosOffset);
										break;
								case 4:
										client.chatButtons[2].drawSprite(269, 142 + yPosOffset);
										break;
								case 5:
										client.chatButtons[2].drawSprite(335, 142 + yPosOffset);
										break;
								case 6:
										client.chatButtons[3].drawSprite(404, 142 + yPosOffset);
										break;
						}
				}
				else
				{
						switch (client.cButtonHPos)
						{
								case 0:
										client.chatButtons[0].drawSprite(5, 142 + yPosOffset);
										break;
								case 1:
										client.chatButtons[0].drawSprite(71, 142 + yPosOffset);
										break;
								case 2:
										client.chatButtons[0].drawSprite(137, 142 + yPosOffset);
										break;
								case 3:
										client.chatButtons[0].drawSprite(203, 142 + yPosOffset);
										break;
								case 4:
										client.chatButtons[0].drawSprite(269, 142 + yPosOffset);
										break;
								case 5:
										client.chatButtons[0].drawSprite(335, 142 + yPosOffset);
										break;
								case 6:
										client.chatButtons[3].drawSprite(404, 142 + yPosOffset);
										break;
						}
				}
				client.smallText.method389(true, 425, 0xffffff, "Report Abuse", 158 + yPosOffset);
				client.smallText.method389(true, 26, 0xffffff, "All", 158 + yPosOffset);
				client.smallText.method389(true, 86, 0xffffff, "Game", 153 + yPosOffset);
				client.smallText.method389(true, 150, 0xffffff, "Public", 153 + yPosOffset);
				client.smallText.method389(true, 212, 0xffffff, "Private", 153 + yPosOffset);
				client.smallText.method389(true, 286, 0xffffff, "Clan", 153 + yPosOffset);
				client.smallText.method389(true, 349, 0xffffff, "Trade", 153 + yPosOffset);
				client.smallText.method382(disabledColor[Client.filtered ? 3 : 0], 98, Client.filtered ? "Filtered" : "On", 163 + yPosOffset, true);
				client.smallText.method382(disabledColor[client.publicChatMode], 164, text[client.publicChatMode], 163 + yPosOffset, true);
				client.smallText.method382(disabledColor[client.privateChatMode], 230, text[client.privateChatMode], 163 + yPosOffset, true);
				client.smallText.method382(disabledColor[client.clanChatMode], 296, text[client.clanChatMode], 163 + yPosOffset, true);
				client.smallText.method382(disabledColor[client.tradeMode], 362, text[client.tradeMode], 163 + yPosOffset, true);
		}

		/**
		 * The 498 and above chat area channel buttons.
		 */
		private static void channelButtonHoverImageNew(Client client)
		{
				if (Client.is474GameFrame || Client.is474PlusGameFrame)
				{
						return;
				}

				//TODO #FULLSCREEN ADJUST chat box drawing the tab text.
				int yPosOffset = Client.isFixedScreen() ? 0 : Client.getClientHeight() - 204;
				if (Client.isFixedScreen())
				{
						client.chatBackImage.initDrawingArea();
				}
				String text[] = {"On", "Friends", "Off", "Hide"};
				int textColor[] = {65280, 0xffff00, 0xff0000, 65535};
				switch (client.cButtonCPos)
				{
						case 0:
								client.chatButtons[1].drawSprite(5, 143 + yPosOffset);
								break;
						case 1:
								client.chatButtons[1].drawSprite(62, 143 + yPosOffset);
								break;
						case 2:
								client.chatButtons[1].drawSprite(119, 143 + yPosOffset);
								break;
						case 3:
								client.chatButtons[1].drawSprite(176, 143 + yPosOffset);
								break;
						case 4:
								client.chatButtons[1].drawSprite(233, 143 + yPosOffset);
								break;
						case 5:
								client.chatButtons[1].drawSprite(290, 143 + yPosOffset);
								break;
						case 6:
								client.chatButtons[1].drawSprite(347, 143 + yPosOffset);
								break;
				}
				if (client.cButtonHPos == client.cButtonCPos)
				{
						switch (client.cButtonHPos)
						{
								case 0:
										client.chatButtons[2].drawSprite(5, 143 + yPosOffset);
										break;
								case 1:
										client.chatButtons[2].drawSprite(62, 143 + yPosOffset);
										break;
								case 2:
										client.chatButtons[2].drawSprite(119, 143 + yPosOffset);
										break;
								case 3:
										client.chatButtons[2].drawSprite(176, 143 + yPosOffset);
										break;
								case 4:
										client.chatButtons[2].drawSprite(233, 143 + yPosOffset);
										break;
								case 5:
										client.chatButtons[2].drawSprite(290, 143 + yPosOffset);
										break;
								case 6:
										client.chatButtons[2].drawSprite(347, 143 + yPosOffset);
										break;
								case 7:
										client.chatButtons[3].drawSprite(404, 143 + yPosOffset);
										break;
						}
				}
				else
				{
						switch (client.cButtonHPos)
						{
								case 0:
										client.chatButtons[0].drawSprite(5, 143 + yPosOffset);
										break;
								case 1:
										client.chatButtons[0].drawSprite(62, 143 + yPosOffset);
										break;
								case 2:
										client.chatButtons[0].drawSprite(119, 143 + yPosOffset);
										break;
								case 3:
										client.chatButtons[0].drawSprite(176, 143 + yPosOffset);
										break;
								case 4:
										client.chatButtons[0].drawSprite(233, 143 + yPosOffset);
										break;
								case 5:
										client.chatButtons[0].drawSprite(290, 143 + yPosOffset);
										break;
								case 6:
										client.chatButtons[0].drawSprite(347, 143 + yPosOffset);
										break;
								case 7:
										client.chatButtons[3].drawSprite(404, 143 + yPosOffset);
										break;
						}
				}
				client.smallText.method389(true, 426, 0xffffff, "Report Abuse", 159 + yPosOffset);
				client.smallText.method389(true, 26, 0xffffff, "All", 159 + yPosOffset);
				client.smallText.method389(true, 77, 0xffffff, "Game", 154 + yPosOffset);
				client.smallText.method389(true, 131, 0xffffff, "Public", 154 + yPosOffset);
				client.smallText.method389(true, 185, 0xffffff, "Private", 154 + yPosOffset);
				client.smallText.method389(true, 249, 0xffffff, "Clan", 154 + yPosOffset);
				client.smallText.method389(true, 304, 0xffffff, "Trade", 154 + yPosOffset);
				client.smallText.method389(true, 359, 0xffffff, "Assist", 154 + yPosOffset);
				client.smallText.method382(textColor[Client.filtered ? 3 : 0], 90, Client.filtered ? "Filtered" : "On", 163 + yPosOffset, true);
				client.smallText.method382(textColor[client.publicChatMode], 146, text[client.publicChatMode], 164 + yPosOffset, true);
				client.smallText.method382(textColor[client.privateChatMode], 203, text[client.privateChatMode], 164 + yPosOffset, true);
				client.smallText.method382(textColor[client.clanChatMode], 260, text[client.clanChatMode], 164 + yPosOffset, true);
				client.smallText.method382(textColor[client.tradeMode], 317, text[client.tradeMode], 164 + yPosOffset, true);
				client.smallText.method382(textColor[client.assistMode], 374, text[client.assistMode], 164 + yPosOffset, true);
		}

		public static void drawChatArea(Client client)
		{

				//TODO #FULLSCREEN ADJUST chat box drawing
				int yPosOffset = Client.isFixedScreen() ? 0 : Client.getClientHeight() - 204;
				if (Client.isFixedScreen())
				{
						client.chatBackImage.initDrawingArea();
				}
				Rasterizer.offsets = client.chatOffsets;
				if (Client.is474GameFrame || Client.is474PlusGameFrame)
				{
						Client.cacheSprite[Client.isFixedScreen() ? 61 : 632].drawSprite(0, 0 + yPosOffset);
				}
				else
				{
						Client.cacheSprite[62].drawSprite(0, 0 + yPosOffset);
				}

				TextDrawingArea textDrawingArea = client.aTextDrawingArea_1271;
				if (Client.isMessagePromptRaised())
				{
						client.newBoldFont.drawCenteredString(Client.inputMessage, 259, 60 + yPosOffset, 0, -1);
						client.newBoldFont.drawCenteredString(Client.promptInput + "*", 259, 80 + yPosOffset, 128, -1);
				}
				else if (Client.inputDialogState == 1)
				{
						client.newBoldFont.drawCenteredString("Enter amount:", 259, 60 + yPosOffset, 0, -1);
						client.newBoldFont.drawCenteredString(client.amountOrNameInput + "*", 259, 80 + yPosOffset, 128, -1);
				}
				else if (Client.inputDialogState == 2)
				{
						client.newBoldFont.drawCenteredString("Enter name:", 259, 60 + yPosOffset, 0, -1);
						client.newBoldFont.drawCenteredString(client.amountOrNameInput + "*", 259, 80 + yPosOffset, 128, -1);
				}
				else if (client.notifyMessage != null)
				{
						client.newBoldFont.drawCenteredString(client.notifyMessage, 259, 60 + yPosOffset, 0, -1);
						client.newBoldFont.drawCenteredString("Click to continue", 259, 80 + yPosOffset, 128, -1);
				}
				else if (Client.backDialogID != -1)
				{
						client.drawInterface(0, 20, RSInterface.interfaceCache[Client.backDialogID], 20 + yPosOffset);
				}
				else if (client.dialogId != -1)
				{
						client.drawInterface(0, 20, RSInterface.interfaceCache[client.dialogId], 20 + yPosOffset);
				}
				else
				{
						int j77 = -3;
						int j = 0;
						DrawingArea.setDrawingArea(122 + yPosOffset, 8, 497, 7 + yPosOffset);
						for (int k = 0; k < 500; k++)
								if (client.chatMessages[k] != null)
								{
										int chatType = client.chatTypes[k];
										int yPos = (70 - j77 * 14) + Client.chatScrollAmount + 5;
										String s1 = client.chatNames[k];
										if (chatType == 0)
										{
												if (client.chatTypeView == 5 || client.chatTypeView == 0)
												{
														if (yPos > 0 && yPos < 210)
														{
																client.newRegularFont.drawBasicString(client.chatMessages[k] + "", 11, yPos + yPosOffset, 0, -1);
														}
														j++;
														j77++;
												}
										}

										// Main chatbox text.
										if ((chatType == 1 || chatType == 2) && (chatType == 1 || client.publicChatMode == 0 || client.publicChatMode == 1 && client.isFriendOrSelf(s1)))
										{
												if (client.chatTypeView == 1 || client.chatTypeView == 0)
												{
														if (yPos > 0 && yPos < 210)
														{
																int xPos = 11;
																client.newRegularFont.drawBasicString(s1 + ":", xPos, yPos + yPosOffset, 0, -1);
																xPos += client.newRegularFont.getTextWidth(s1) + 8;
																client.newRegularFont.drawBasicString(client.chatMessages[k], xPos - 2, yPos + yPosOffset, 255, -1);
														}
														j++;
														j77++;
												}
										}

										// Private tab.
										if ((chatType == 3 || chatType == 7) && (Client.splitPrivateChat == 0 || client.chatTypeView == 2) && (chatType == 7 || client.privateChatMode == 0 || client.privateChatMode == 1 && client.isFriendOrSelf(s1)))
										{
												if (client.chatTypeView == 2 || client.chatTypeView == 0)
												{
														if (yPos > 0 && yPos < 210)
														{
																int k1 = 11;
																client.newRegularFont.drawBasicString("From ", k1, yPos + yPosOffset, 0, -1);
																k1 += client.newRegularFont.getTextWidth("From ") + 1;

																client.newRegularFont.drawBasicString(s1 + ":", k1, yPos + yPosOffset, 0, -1);
																k1 += client.newRegularFont.getTextWidth(s1) + 8;
																client.newRegularFont.drawBasicString(client.chatMessages[k], k1, yPos + yPosOffset, 0x800000, -1);
														}
														j++;
														j77++;
												}
										}
										if (chatType == 4 && (client.tradeMode == 0 || client.tradeMode == 1 && client.isFriendOrSelf(s1)))
										{
												if (client.chatTypeView == 3 || client.chatTypeView == 0)
												{
														if (yPos > 0 && yPos < 210)
														{
																client.newRegularFont.drawBasicString(s1 + " " + client.chatMessages[k], 11, yPos + yPosOffset, 0x800080, -1);
														}
														j++;
														j77++;
												}
										}
										if (chatType == 5 && Client.splitPrivateChat == 0 && client.privateChatMode < 2)
										{
												if (client.chatTypeView == 2 || client.chatTypeView == 0)
												{
														if (yPos > 0 && yPos < 210)
														{
																client.newRegularFont.drawBasicString(client.chatMessages[k], 11, yPos + yPosOffset, 0x800000, -1);
														}
														j++;
														j77++;
												}
										}
										if (chatType == 6 && (Client.splitPrivateChat == 0 || client.chatTypeView == 2) && client.privateChatMode < 2)
										{
												if (client.chatTypeView == 2 || client.chatTypeView == 0)
												{
														if (yPos > 0 && yPos < 210)
														{
																client.newRegularFont.drawBasicString("To " + s1 + ":", 11, yPos + yPosOffset, 0, -1);
																client.newRegularFont.drawBasicString(client.chatMessages[k], 15 + client.newRegularFont.getTextWidth("To :" + s1), yPos + yPosOffset, 0x800000, -1);
														}
														j++;
														j77++;
												}
										}
										if ((chatType == 8 || chatType == 485) && (client.tradeMode == 0 || client.tradeMode == 1 && client.isFriendOrSelf(s1)))
										{
												if (client.chatTypeView == 3 || client.chatTypeView == 0)
												{
														if (yPos > 0 && yPos < 210)
														{
																client.newRegularFont.drawBasicString(s1 + " " + client.chatMessages[k], 11, yPos + yPosOffset, 0x7e3200, -1);
														}
														j++;
														j77++;
												}
												if (chatType == 11 && (client.clanChatMode == 0))
												{
														if (client.chatTypeView == 11)
														{
																if (yPos > 0 && yPos < 210)
																{
																		client.newRegularFont.drawBasicString(s1 + " " + client.chatMessages[k], 11, yPos + yPosOffset, 0x7e3200, -1);
																}
																j++;
																j77++;
														}
														if (chatType == 12)
														{
																if (yPos > 0 && yPos < 110)
																{
																		client.newRegularFont.drawBasicString(client.chatMessages[k] + " <col=255>" + s1, 11, yPos + yPosOffset, 0x7e3200, -1);
																}
																j++;
														}
												}
										}

										// Clan chat.
										if (chatType == 16)
										{
												int j2 = 40;
												int clanNameWidth = textDrawingArea.getTextWidth(client.clanname);
												if (client.chatTypeView == 11 || client.chatTypeView == 0)
												{
														if (yPos > 3 && yPos < 130)
														{
																j2 += clanNameWidth;
																PlayerRank.drawClanIcon(client, client.chatRights[k], j2, yPos + yPosOffset);
																j2 += PlayerRank.getClanWidth(client.chatRights[k]);
														}
														textDrawingArea.method385(0, "[", 11, yPos + yPosOffset);
														textDrawingArea.method385(255, "" + client.clanname + "", 16, yPos + yPosOffset);
														textDrawingArea.method385(0, "]", clanNameWidth + 16, yPos + yPosOffset);
														textDrawingArea.method385(0, client.chatNames[k] + ":", j2 - 17, yPos + yPosOffset); // j2
														j2 += textDrawingArea.getTextWidth(client.chatNames[k]) + 7;
														textDrawingArea.method385(0x800000, client.chatMessages[k], j2 - 18, yPos + yPosOffset); // j2
														j++;
														j77++;
												}
										}
								}
						DrawingArea.defaultDrawingAreaSize();
						Client.chatScrollHeight = j * 14 + 7 + 5;
						if (Client.chatScrollHeight < 111)
						{
								Client.chatScrollHeight = 111;
						}
						client.drawScrollbar(114, Client.chatScrollHeight - Client.chatScrollAmount - 113, 7 + yPosOffset, 496, Client.chatScrollHeight);
						String s;
						String shortText = "";

						// The bottomm of the chat box, where it shows my own name and what i am typing.
						if (Client.myPlayer != null && Client.myPlayer.getName() != null)
						{
								s = PlayerTitle.myNameInTextTypingArea(Client.myPlayer);
								shortText = s.replaceAll(Client.myPlayer.titleColour, "");
								shortText = shortText.replaceAll("<col=00000>", "");
								int x = 8;
								x += PlayerRank.getMyChatX(Client.myPlayer.privelage);
								PlayerRank.drawMyChatIcon(Client.myPlayer.privelage, yPosOffset);
								client.newRegularFont.drawBasicString(s + ":", x + 3, 133 + yPosOffset, 0, -1);
								textDrawingArea.drawChatInput(255, x + textDrawingArea.getTextWidth(shortText + ": ") + 3, client.inputString + "*", 133 + yPosOffset, false);
						}

						DrawingArea.method339(121 + yPosOffset, 0x807660, 506, 7);
				}
				channelButtonHoverImageOld(client);
				channelButtonHoverImageNew(client);
				if (client.menuOpen && client.getMenuScreenArea() == 2)
				{
						client.drawMenu();
				}
				if (Client.isFixedScreen())
				{
						client.chatBackImage.drawGraphics(338, client.graphics, 0);
				}
				client.inGameScreen.initDrawingArea();
				Rasterizer.offsets = client.viewportOffsets;
		}

		public static void buildSplitPrivateChatMenu()
		{
				if (Client.splitPrivateChat == 0)
				{
						return;
				}
				int i = 0;
				if (Client.instance.systemUpdateCycle != 0)
				{
						i = 1;
				}
				/// TODO #FULLSCREEN ADJUST private split chat hovering.
				int mouseY = Client.isFixedScreen() ? Client.instance.mouseY : Client.instance.mouseY - (Client.getClientHeight() - 543);
				for (int j = 0; j < 100; j++)
				{
						if (Client.instance.chatMessages[j] != null)
						{
								int k = Client.instance.chatTypes[j];
								String s = Client.instance.chatNames[j];
								if (s != null && s.startsWith("@cr1@"))
								{
										s = s.substring(5);
								}
								if (s != null && s.startsWith("@cr2@"))
								{
										s = s.substring(5);
								}
								if (s != null && s.startsWith("@don@"))
								{
										s = s.substring(5);
								}
								if ((k == 3 || k == 7) && (k == 7 || Client.instance.privateChatMode == 0 || Client.instance.privateChatMode == 1 && Client.instance.isFriendOrSelf(s)))
								{
										int l = 329 - i * 13;
										if (Client.instance.mouseX > 4 && mouseY - 4 > l - 10 && mouseY - 4 <= l + 3)
										{
												int i1 = Client.instance.aTextDrawingArea_1271.getTextWidth("From:  " + s + Client.instance.chatMessages[j]) + 25;
												if (i1 > 450)
												{
														i1 = 450;
												}
												if (Client.instance.mouseX < 4 + i1)
												{
														Client.instance.menuActionName[Client.instance.menuActionRow] = "Add ignore @whi@" + s;
														Client.instance.menuActionID[Client.instance.menuActionRow] = 2042;
														Client.instance.menuActionRow++;
														Client.instance.menuActionName[Client.instance.menuActionRow] = "Add friend @whi@" + s;
														Client.instance.menuActionID[Client.instance.menuActionRow] = 2337;
														Client.instance.menuActionRow++;
												}
										}
										if (++i >= 5)
										{
												return;
										}
								}
								if ((k == 5 || k == 6) && Client.instance.privateChatMode < 2 && ++i >= 5)
								{
										return;
								}
						}
				}

		}


}
