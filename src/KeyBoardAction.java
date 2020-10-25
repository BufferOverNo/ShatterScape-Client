import java.util.ArrayList;

/**
 * Keyboard actions.
 */
public class KeyBoardAction
{
		public static ArrayList<String> test = new ArrayList<String>();

		private static void tabToReplyPm()
		{
				String name = null;
				for (int k = 0; k < 100; k++)
				{
						if (Client.instance.chatMessages[k] == null)
						{
								continue;
						}
						int l = Client.instance.chatTypes[k];
						if (l == 3 || l == 7)
						{
								name = Client.instance.chatNames[k];
								break;
						}
				}


				if (name == null)
				{
						Client.instance.pushMessage("You haven't received any messages to which you can reply.", 0, "");
						return;
				}
				if (name.startsWith("<img="))
				{
						name = name.substring(name.indexOf(">") + 1);
				}


				long nameAsLong = TextClass.longForName(name.trim());
				int k3 = -1;
				for (int i4 = 0; i4 < Client.friendsCount; i4++)
				{
						if (Client.instance.friendsListAsLongs[i4] != nameAsLong)
						{
								continue;
						}
						k3 = i4;
						break;
				}

				if (k3 == -1)
				{
						Client.instance.pushMessage("You need to add them as a friend first.", 0, "");
						return;
				}
				if (Client.instance.friendsNodeIds[k3] > 0)
				{
						Client.setInputTaken(true);
						Client.inputDialogState = 0;
						Client.setMessagePromptRaised(true);
						Client.promptInput = "";
						Client.bankSearchSent = "";
						Client.friendsListAction = 3;
						Client.instance.aLong953 = Client.instance.friendsListAsLongs[k3];
						Client.inputMessage = "Enter message to send to " + Client.instance.friendsList[k3];
				}
				else
				{
						Client.instance.pushMessage("That player is currently offline.", 0, "");
				}
		}

		public static void handleKeyboard()
		{
				do
				{
						int key = Client.instance.readChar(-796);
						if (key == -1)
						{
								break;
						}

						if (!Client.isDialogueOptionsShowing() && Client.backDialogID > 0 && Client.inputValue == -1)
						{
								// Space button to trigger "continue" in the statement dialogue.
								if (key == 32)
								{
										if (Client.backDialogID == 306 || Client.backDialogID == 4887 || Client.backDialogID == 4893 || Client.backDialogID == 356 || Client.backDialogID == 310 || Client.backDialogID == 4882 || Client.backDialogID == 4900)
										{
												Client.instance.stream.createFrame(40);
												Client.instance.stream.writeWord(4892);
												Client.setDialogueOptionsShowing(true);
										}
								}

								// Keys 1 to 5 to trigger option 1-5/1-4/1-3/1-2 on dialogue options.
								else
								{
										int index = key - 49;
										int packetInteger = 0;
										if (Client.backDialogID == 2480)
										{
												packetInteger = 2482;
										}
										else if (Client.backDialogID == 2469)
										{
												packetInteger = 2471;
										}
										else if (Client.backDialogID == 2459)
										{
												packetInteger = 2461;
										}
										else if (Client.backDialogID == 2492)
										{
												packetInteger = 2494;
										}
										if (packetInteger != 0)
										{
												Client.instance.stream.createFrame(185);
												Client.instance.stream.writeWord(packetInteger + index);
												Client.setDialogueOptionUsed(packetInteger + index);
										}
								}
						}




						else if (Client.isMessagePromptRaised())
						{
								if (key >= 32 && key <= 122 && Client.promptInput.length() < 80)
								{
										Client.promptInput += (char) key;
										Client.setInputTaken(true);
								}
								if (key == 8 && Client.promptInput.length() > 0)
								{
										Client.promptInput = Client.promptInput.substring(0, Client.promptInput.length() - 1);
										Client.setInputTaken(true);
								}
								if (key == 13 || key == 10)
								{
										Client.setMessagePromptRaised(false);
										Content.closeSearch(true, true);
										Client.setInputTaken(true);
										if (Client.friendsListAction == 1)
										{
												long l = TextClass.longForName(Client.promptInput);
												FriendSystem.addFriend(l, Client.instance);
										}
										if (Client.friendsListAction == 2 && Client.friendsCount > 0)
										{
												long l1 = TextClass.longForName(Client.promptInput);
												FriendSystem.deleteFriend(l1, Client.instance);
										}
										if (Client.friendsListAction == 3 && Client.promptInput.length() > 0)
										{
												Client.instance.stream.createFrame(126);
												Client.instance.stream.writeWordBigEndian(0);
												int k = Client.instance.stream.currentOffset;
												Client.instance.stream.writeQWord(Client.instance.aLong953);
												TextInput.method526(Client.promptInput, Client.instance.stream);
												Client.instance.stream.writeBytes(Client.instance.stream.currentOffset - k);
												Client.promptInput = TextInput.processText(Client.promptInput);
												Client.instance.pushMessage(Client.promptInput, 6, TextClass.fixName(TextClass.nameForLong(Client.instance.aLong953)));
												if (Client.instance.privateChatMode == 2)
												{
														Client.instance.privateChatMode = 1;
														Client.instance.stream.createFrame(95);
														Client.instance.stream.writeWordBigEndian(Client.instance.publicChatMode);
														Client.instance.stream.writeWordBigEndian(Client.instance.privateChatMode);
														Client.instance.stream.writeWordBigEndian(Client.instance.tradeMode);
												}
										}
										if (Client.friendsListAction == 4 && Client.instance.ignoreCount < 100)
										{
												long l2 = TextClass.longForName(Client.promptInput);
												FriendSystem.addIgnore(l2, Client.instance);
										}
										if (Client.friendsListAction == 5 && Client.instance.ignoreCount > 0)
										{
												long l3 = TextClass.longForName(Client.promptInput);
												FriendSystem.deleteIgnore(l3, Client.instance);
										}
										if (Client.friendsListAction == 6)
										{
												long l3 = TextClass.longForName(Client.promptInput);
												Client.instance.chatJoin(l3);
										}
										else if (Client.inputValue == 11 && Client.promptInput.length() >= 1)
										{
												Client.instance.sendCommandPacket("::mapvalidility" + Client.promptInput);
										}
										else if (Client.inputValue == 12 && Client.promptInput.length() >= 1)
										{
												Client.instance.sendCommandPacket("::ccban" + Client.promptInput);
										}
										else if (Client.inputValue == 13 && Client.promptInput.length() >= 1)
										{
												Client.instance.sendCommandPacket("::ccmod" + Client.promptInput);
										}
										else if (Client.inputValue == 14 && Client.promptInput.length() >= 1)
										{
												Client.instance.sendCommandPacket("::cctitle" + Client.promptInput);
										}
										else if (Client.inputValue == 15 && Client.promptInput.length() >= 1)
										{
												Client.instance.sendCommandPacket("::namechange" + Client.promptInput);
										}
										else if (Client.inputValue == 16 && Client.promptInput.length() >= 1)
										{
												Client.instance.sendCommandPacket("::addpvpblacklist" + Client.promptInput);
										}
										else if (Client.inputValue == 17 && Client.promptInput.length() >= 1)
										{
												Client.instance.sendCommandPacket("::namepreset" + Client.promptInput);
										}
								}
						}
						else if (Client.inputDialogState == 1)
						{
								if (key >= 48 && key <= 57 && Client.instance.amountOrNameInput.length() < 10)
								{
										Client.instance.amountOrNameInput += (char) key;
										Client.setInputTaken(true);
								}
								if ((!Client.instance.amountOrNameInput.toLowerCase().contains("k") && !Client.instance.amountOrNameInput.toLowerCase().contains("m") && !Client.instance.amountOrNameInput.toLowerCase().contains("b")) && (key == 107 || key == 109) || key == 98 || key == 66 || key == 75 || key == 77)
								{
										Client.instance.amountOrNameInput += (char) key;
										Client.setInputTaken(true);
								}
								if (key == 8 && Client.instance.amountOrNameInput.length() > 0)
								{
										Client.instance.amountOrNameInput = Client.instance.amountOrNameInput.substring(0, Client.instance.amountOrNameInput.length() - 1);
										Client.setInputTaken(true);
								}
								if (key == 13 || key == 10)
								{
										if (Client.instance.amountOrNameInput.length() > 0)
										{
												if (Client.instance.amountOrNameInput.toLowerCase().contains("k"))
												{
														Client.instance.amountOrNameInput = Client.instance.amountOrNameInput.replaceAll("k", "000");
														Client.instance.amountOrNameInput = Client.instance.amountOrNameInput.replaceAll("K", "000");
												}
												else if (Client.instance.amountOrNameInput.toLowerCase().contains("m"))
												{
														Client.instance.amountOrNameInput = Client.instance.amountOrNameInput.replaceAll("m", "000000");
														Client.instance.amountOrNameInput = Client.instance.amountOrNameInput.replaceAll("M", "000000");
												}
												else if (Client.instance.amountOrNameInput.toLowerCase().contains("b"))
												{
														Client.instance.amountOrNameInput = Client.instance.amountOrNameInput.replaceAll("b", "000000000");
														Client.instance.amountOrNameInput = Client.instance.amountOrNameInput.replaceAll("B", "000000000");
												}
												int amount = 0;
												long amount1 = Long.parseLong(Client.instance.amountOrNameInput);
												if (amount1 > Integer.MAX_VALUE)
												{
														amount1 = Integer.MAX_VALUE;
												}
												amount = (int) amount1;
												Client.instance.stream.createFrame(208);
												Client.instance.stream.writeDWord(amount);
										}
										Client.inputDialogState = 0;
										Client.setInputTaken(true);

										if (!Client.searching)
										{
												Content.closeSearch(true, true);
										}
										else
										{
												Client.ignorePromptInputReset = true;
												Content.openSearch("Enter an item to search for");
												Client.ignorePromptInputReset = false;
										}
								}
						}
						else if (Client.inputDialogState == 2)
						{
								if (key >= 32 && key <= 122 && Client.instance.amountOrNameInput.length() < 12)
								{
										Client.instance.amountOrNameInput += (char) key;
										Client.setInputTaken(true);
								}
								if (key == 8 && Client.instance.amountOrNameInput.length() > 0)
								{
										Client.instance.amountOrNameInput = Client.instance.amountOrNameInput.substring(0, Client.instance.amountOrNameInput.length() - 1);
										Client.setInputTaken(true);
								}
								if (key == 13 || key == 10)
								{
										if (Client.instance.amountOrNameInput.length() > 0)
										{
												Client.instance.stream.createFrame(60);
												Client.instance.stream.writeQWord(TextClass.longForName(Client.instance.amountOrNameInput));
										}
										Client.inputDialogState = 0;
										Client.setInputTaken(true);
								}
						}
						else if (Client.backDialogID == -1)
						{
								if (key >= 32 && key <= 122)
								{
										if (Client.customCameraPosition && (key == 122 || key == 120 || key == 99 || key == 118))
										{
												switch (key)
												{

														//Z
														case 122:
																Client.zCameraPos -= 5;
																break;

														// X
														case 120:
																Client.zCameraPos += 5;
																break;

														// C
														case 99:
																Client.xCameraCurve += 5;
																if (Client.xCameraCurve > 2035)
																{
																		Client.xCameraCurve = 0;
																}
																break;

														// V
														case 118:
																Client.yCameraCurve += 5;
																if (Client.yCameraCurve > 375)
																{
																		Client.yCameraCurve = 128;
																}
																break;
												}
												return;
										}
										if (Client.profileSearching)
										{
												if (Client.profileSearchString.length() < 12)
												{
														Client.profileSearchString += (char) key;
												}
										}
										else if (Client.shopSearching)
										{
												if (Client.shopString.length() < 12)
												{
														Client.shopString += (char) key;
												}
										}
										else if (Client.profileBiographyLineEdited > 0)
										{
												if (Client.profileBiographyText.length() < 41)
												{
														Client.profileBiographyText += (char) key;
												}
										}
										else if (Client.instance.inputString.length() < 80)
										{
												Client.instance.inputString += (char) key;
												Client.setInputTaken(true);
										}
								}

								// Backspace
								if (key == 8)
								{
										if (Client.profileSearching && Client.profileSearchString.length() > 0)
										{
												Client.profileSearchString = Client.profileSearchString.substring(0, Client.profileSearchString.length() - 1);
										}
										else if (Client.shopSearching && Client.shopString.length() > 0)
										{
												Client.shopString = Client.shopString.substring(0, Client.shopString.length() - 1);
										}
										else if (Client.profileBiographyLineEdited > 0 && Client.profileBiographyText.length() > 0)
										{
												Client.profileBiographyText = Client.profileBiographyText.substring(0, Client.profileBiographyText.length() - 1);
										}
										else if (Client.instance.inputString.length() > 0)
										{
												Client.instance.inputString = Client.instance.inputString.substring(0, Client.instance.inputString.length() - 1);
												Client.setInputTaken(true);
										}
								}
								if (key == 9)
								{
										tabToReplyPm();
								}

								if ((key == 13 || key == 10) && Client.profileSearching)
								{
										Profile.sendProfileSearch();
										Profile.stopSearching(false);
								}
								else if ((key == 13 || key == 10) && Client.shopSearching)
								{
										Client.shopSearching = false;
										Client.shopString = "";
										Client.instance.sendCommandPacket("::shopsearch");
								}
								else if ((key == 13 || key == 10) && Client.profileBiographyLineEdited > 0)
								{
										Profile.sendProfileBiographyToServer();
								}
								else if ((key == 13 || key == 10) && Client.instance.inputString.length() > 0)
								{

										if (Client.instance.inputString.toLowerCase().equals("::lag"))
										{
												//Client.instance.printDebug();
										}
										else if (Client.instance.inputString.toLowerCase().equals("::itemupdate"))
										{
												Client.itemUpdate = !Client.itemUpdate;
												Client.instance.pushMessage("Live item update toggled to: " + Client.itemUpdate, 0, "");
										}
										else if (Client.instance.inputString.toLowerCase().equals("::data"))
										{
												Client.clientData = !Client.clientData;
												Client.instance.pushMessage("Client data: " + Client.clientData, 0, "");
												Settings.saveSettings();
										}
										else if (Client.instance.inputString.contains("::") && Client.instance.inputString.toLowerCase().contains("fps"))
										{
												Client.fpsOn = !Client.fpsOn;
												Client.instance.pushMessage("Fps set to: " + Client.fpsOn, 0, "");

										}
										else if (Client.instance.inputString.toLowerCase().equals("::angle"))
										{
												Client.customCameraPosition = !Client.customCameraPosition;
												Client.instance.pushMessage("Use arrow keys and zxcv to navigate camera set to: " + Client.customCameraPosition, 0, "");
												Client.instance.pushMessage("Go to settings to slow down the camera movement.", 0, "");
												Client.instance.pushMessage("Type ::angle to turn it off.", 0, "");
										}
										else if (Client.instance.inputString.toLowerCase().equals("::maximizable"))
										{
												if (Client.isFixedScreen())
												{
														Client.maximizable = !Client.maximizable;
														Jframe.frame.setResizable(Client.maximizable);
														Settings.saveSettingsJframe();
														Client.instance.pushMessage("Maximizing client set to: " + Client.maximizable, 0, "");
														Jframe.setPreferredSize();
												}
												else
												{
														Client.instance.pushMessage("This only works on fixed mode.", 0, "");
												}

										}
										else if (Client.instance.inputString.toLowerCase().equals("::test"))
										{
												/*
													try
													{
															BufferedWriter bw = null;
															bw = new BufferedWriter(new FileWriter("data.txt", true));
															for (int i = 0; i < test.size(); i++)
															{
																	bw.write(test.get(i) + "");
																	bw.newLine();
															}
															bw.flush();
															bw.close();
													}
													catch (IOException ioe)
													{
															ioe.printStackTrace();
													}
													*/

												//Client.dumpItemImages(true);
												Utility.print("Finished.");
										}
										else if (Client.instance.inputString.toLowerCase().equals("::checkmaps"))
										{
												Utility.print("Maps checked.");
										}
										else if (Client.instance.inputString.toLowerCase().equals("::mapvalidility"))
										{
												Utility.print("Map validility checked.");
										}
										else if (Client.instance.inputString.toLowerCase().equals("::interfaceloop"))
										{
												Client.interfacesReloadLoop = !Client.interfacesReloadLoop;
												Client.interfacesReloaded = !Client.interfacesReloaded;
												Client.instance.pushMessage("Interface looping: " + Client.interfacesReloadLoop, 0, "");

										}
										// End of Remove these for the live client dataon/off and m
										// and lag and m
										else if (Client.instance.inputString.startsWith("//"))
										{
												Client.instance.inputString = "::chat" + Client.instance.inputString;
												Client.instance.stream.createFrame(103);
												Client.instance.stream.writeWordBigEndian(Client.instance.inputString.length() - 1);
												Client.instance.stream.writeString(Client.instance.inputString.substring(2));
										}
										else if (Client.instance.inputString.startsWith("/"))
										{
												Client.instance.inputString = "::" + Client.instance.inputString;
												Client.instance.stream.createFrame(103);
												Client.instance.stream.writeWordBigEndian(Client.instance.inputString.length() - 1);
												Client.instance.stream.writeString(Client.instance.inputString.substring(2));
										}
										else if (Client.instance.inputString.startsWith("::"))
										{
												if (ClientConfiguration.NO_CLIP_COMMAND)
												{
														if (Client.instance.inputString.toLowerCase().equals("::noclip")) // No clip
														{
																Client.noClip = !Client.noClip;
																Client.instance.pushMessage("Client clipping: " + Client.noClip, 0, "");
																Settings.saveSettings();
														}
												}
												Client.instance.stream.createFrame(103);
												Client.instance.stream.writeWordBigEndian(Client.instance.inputString.length() - 1);
												Client.instance.stream.writeString(Client.instance.inputString.substring(2));
										}
										else if (Client.playerUpdateCompleted)
										{
												String s = Client.instance.inputString.toLowerCase();
												int j2 = 0;
												if (s.startsWith("yellow:"))
												{
														j2 = 0;
														Client.instance.inputString = Client.instance.inputString.substring(7);
												}
												else if (s.startsWith("red:"))
												{
														j2 = 1;
														Client.instance.inputString = Client.instance.inputString.substring(4);
												}
												else if (s.startsWith("green:"))
												{
														j2 = 2;
														Client.instance.inputString = Client.instance.inputString.substring(6);
												}
												else if (s.startsWith("cyan:"))
												{
														j2 = 3;
														Client.instance.inputString = Client.instance.inputString.substring(5);
												}
												else if (s.startsWith("purple:"))
												{
														j2 = 4;
														Client.instance.inputString = Client.instance.inputString.substring(7);
												}
												else if (s.startsWith("white:"))
												{
														j2 = 5;
														Client.instance.inputString = Client.instance.inputString.substring(6);
												}
												else if (s.startsWith("flash1:"))
												{
														j2 = 6;
														Client.instance.inputString = Client.instance.inputString.substring(7);
												}
												else if (s.startsWith("flash2:"))
												{
														j2 = 7;
														Client.instance.inputString = Client.instance.inputString.substring(7);
												}
												else if (s.startsWith("flash3:"))
												{
														j2 = 8;
														Client.instance.inputString = Client.instance.inputString.substring(7);
												}
												else if (s.startsWith("glow1:"))
												{
														j2 = 9;
														Client.instance.inputString = Client.instance.inputString.substring(6);
												}
												else if (s.startsWith("glow2:"))
												{
														j2 = 10;
														Client.instance.inputString = Client.instance.inputString.substring(6);
												}
												else if (s.startsWith("glow3:"))
												{
														j2 = 11;
														Client.instance.inputString = Client.instance.inputString.substring(6);
												}
												s = Client.instance.inputString.toLowerCase();
												int i3 = 0;
												if (s.startsWith("wave:"))
												{
														i3 = 1;
														Client.instance.inputString = Client.instance.inputString.substring(5);
												}
												else if (s.startsWith("wave2:"))
												{
														i3 = 2;
														Client.instance.inputString = Client.instance.inputString.substring(6);
												}
												else if (s.startsWith("shake:"))
												{
														i3 = 3;
														Client.instance.inputString = Client.instance.inputString.substring(6);
												}
												else if (s.startsWith("scroll:"))
												{
														i3 = 4;
														Client.instance.inputString = Client.instance.inputString.substring(7);
												}
												else if (s.startsWith("slide:"))
												{
														i3 = 5;
														Client.instance.inputString = Client.instance.inputString.substring(6);
												}
												Client.instance.stream.createFrame(4);
												Client.instance.stream.writeWordBigEndian(0);
												int j3 = Client.instance.stream.currentOffset;
												Client.instance.stream.method425(i3);
												Client.instance.stream.method425(j2);
												Client.instance.aStream_834.currentOffset = 0;
												TextInput.method526(Client.instance.inputString, Client.instance.aStream_834);
												Client.instance.stream.method441(0, Client.instance.aStream_834.buffer, Client.instance.aStream_834.currentOffset);
												Client.instance.stream.writeBytes(Client.instance.stream.currentOffset - j3);
												Client.instance.inputString = TextInput.processText(Client.instance.inputString);
												Client.myPlayer.textSpoken = Client.instance.inputString;
												Client.myPlayer.spokenColor = j2;
												Client.myPlayer.spokenEffect = i3;
												Client.myPlayer.textCycle = 150;
												// Messages of the myself appearing in the chatbox.
												int rights = Client.myPlayer.privelage;
												Client.instance.pushMessage(Client.myPlayer.textSpoken, 2, PlayerRank.getIconText(rights) + PlayerTitle.myMessagesInMyChat(Client.myPlayer));
												if (Client.instance.publicChatMode == 2)
												{
														Client.instance.publicChatMode = 3;
														Client.instance.stream.createFrame(95);
														Client.instance.stream.writeWordBigEndian(Client.instance.publicChatMode);
														Client.instance.stream.writeWordBigEndian(Client.instance.privateChatMode);
														Client.instance.stream.writeWordBigEndian(Client.instance.tradeMode);
												}
										}
										Client.instance.inputString = "";
										Client.setInputTaken(true);
								}
						}
				}
				while (true);
		}
}
