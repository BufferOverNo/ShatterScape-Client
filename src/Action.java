import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Action extends Client
{
		private static final long serialVersionUID = -4658621391074405553L;

		public static void doAction(int i)
		{
				if (i < 0)
						return;
				if (inputDialogState != 0)
				{
						inputDialogState = 0;
						setInputTaken(true);
				}
				int j = Client.instance.menuActionCmd2[i];
				int k = Client.instance.menuActionCmd3[i];
				int identity = Client.instance.menuActionID[i];
				int i1 = Client.instance.menuActionCmd1[i];
				if (identity >= 2000)
				{
						identity -= 2000;
				}
				if (ClientConfiguration.DEBUG_MODE)
				{
						Utility.print("Button other: " + identity + ", " + k);
				}

				if (Client.getInterfaceDisplayed() == 25320 && identity != 169)
				{
						Profile.sendProfileBiographyToServer();
				}
				// Close button on shop interface.
				switch (identity)
				{
						case 169:
								if (Client.instance.menuActionName[1].startsWith("Close Window"))
								{
										Client.instance.clearTopInterfaces();
								}
								break;
						case 104:
								RSInterface class9_1 = RSInterface.interfaceCache[k];
								spellId = class9_1.id;
								if (!Client.instance.Autocast)
								{
										Client.instance.Autocast = true;
										Client.instance.autocastId = class9_1.id;
										Client.instance.stream.createFrame(185);
										Client.instance.stream.writeWord(class9_1.id);
								}
								else if (Client.instance.autocastId == class9_1.id)
								{
										Client.instance.Autocast = false;
										Client.instance.autocastId = 0;
										Client.instance.stream.createFrame(185);
										Client.instance.stream.writeWord(class9_1.id);
								}
								else if (Client.instance.autocastId != class9_1.id)
								{
										Client.instance.Autocast = true;
										Client.instance.autocastId = class9_1.id;
										Client.instance.stream.createFrame(185);
										Client.instance.stream.writeWord(class9_1.id);
								}
								break;
						case 1500:
								// Toggle quick prayers
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(5000);
								break;

						case 1506:
								// Select quick prayers
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(5001);
								break;

						// Show total/Show session on xp orb.
						case 473:
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(5007);
								break;

						// Show total/Show session on xp orb.
						case 481:
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(5004);
								break;

						case 480:
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(5011);
								break;

						case 475:
								xpCounter = 0;
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(5010);
								break;

						case 474:
								counterOn = !counterOn;
								Client.xpDropsToDisplay.clear();

								Client.instance.stream.createFrame(185);
								if (counterOn)
								{
										Client.instance.stream.writeWord(5002);
								}
								else
								{
										Client.instance.stream.writeWord(5003);
								}
								break;

						case 476:
								osrsXpOrbMiddle = !osrsXpOrbMiddle;
								Settings.saveSettings();
								break;

						case 62:
								if (Client.instance.interactWithObject(i1, k, j))
								{
										Client.instance.stream.createFrame(192);
										Client.instance.stream.writeWord(Client.instance.anInt1284);
										Client.instance.stream.method431(i1 >> 14 & 0x7fff);
										Client.instance.stream.method433(k + Client.instance.baseY);
										Client.instance.stream.method431(Client.instance.anInt1283);
										Client.instance.stream.method433(j + Client.instance.baseX);
										Client.instance.stream.writeWord(Client.instance.anInt1285);
								}
								break;

						case 234:
								boolean flag1 = Client.instance.doWalkTo(2, 0, 0, 0, myPlayer.smallY[0], 0, 0, k, myPlayer.smallX[0], false, j);
								if (!flag1)
								{
										flag1 = Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, k, myPlayer.smallX[0], false, j);
								}
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								Client.instance.stream.createFrame(236);
								Client.instance.stream.method431(k + Client.instance.baseY);
								Client.instance.stream.writeWord(i1);
								Client.instance.stream.method431(j + Client.instance.baseX);
								break;

						// Face north.
						case 477:
								Client.instance.viewRotation = 0;
								Client.instance.chaseCameraPitch = 128;
								break;

						case 582:
								Npc npc = Client.instance.npcArray[i1];
								if (npc != null)
								{
										Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, npc.smallY[0], myPlayer.smallX[0], false, npc.smallX[0]);
										Client.instance.crossX = Client.instance.saveClickX;
										Client.instance.crossY = Client.instance.saveClickY;
										Client.instance.crossType = 2;
										Client.instance.crossIndex = 0;
										Client.instance.stream.createFrame(57);
										Client.instance.stream.method432(Client.instance.anInt1285);
										Client.instance.stream.method432(i1);
										Client.instance.stream.method431(Client.instance.anInt1283);
										Client.instance.stream.method432(Client.instance.anInt1284);
								}
								break;

						case 511:
								boolean flag2 = Client.instance.doWalkTo(2, 0, 0, 0, myPlayer.smallY[0], 0, 0, k, myPlayer.smallX[0], false, j);
								if (!flag2)
										flag2 = Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, k, myPlayer.smallX[0], false, j);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								Client.instance.stream.createFrame(25);
								Client.instance.stream.method431(Client.instance.anInt1284);
								Client.instance.stream.method432(Client.instance.anInt1285);
								Client.instance.stream.writeWord(i1);
								Client.instance.stream.method432(k + Client.instance.baseY);
								Client.instance.stream.method433(Client.instance.anInt1283);
								Client.instance.stream.writeWord(j + Client.instance.baseX);
								break;

						case 74:
								Client.instance.stream.createFrame(122);
								Client.instance.stream.method433(k);
								Client.instance.stream.method432(j);
								Client.instance.stream.method431(i1);
								Client.instance.atInventoryLoopCycle = 0;
								Client.instance.atInventoryInterface = k;
								Client.instance.atInventoryIndex = j;
								Client.instance.atInventoryInterfaceType = 2;
								if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
										Client.instance.atInventoryInterfaceType = 1;
								if (RSInterface.interfaceCache[k].parentId == backDialogID)
										Client.instance.atInventoryInterfaceType = 3;
								break;

						// Run orb.
						case 1050:
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(152);
								break;

						case 1021:
								setTabId(0, false);
								break;

						case 1022:
								setTabId(1, false);
								break;

						case 1023:
								setTabId(2, false);
								if (getTutorialStage() == 40)
								{
										setTutorialStage(getTutorialStage() + 10);
								}
								break;

						case 1024:
								setTabId(3, false);
								break;

						case 1052:
								setTabId(4, false);
								break;

						case 1026:
								setTabId(5, false);
								break;

						case 1027:
								setTabId(6, false);
								break;

						case 1028:
								setTabId(0, false);
								break;

						case 1029:
								setTabId(1, false);
								break;

						case 1030:
								setTabId(2, false);
								break;

						case 1031:
								setTabId(14, false);
								if (getTutorialStage() == 40)
								{
										setTutorialStage(getTutorialStage() + 10);
								}
								break;

						case 1032:
								setTabId(3, false);
								break;

						case 1033:
								setTabId(4, false);
								break;

						case 1034:
								setTabId(5, false);
								break;

						case 1035:
								setTabId(6, false);
								break;

						case 1036:
						case 1045:
								if (identity == 1036)
								{
										setTabId(!Client.isFixedScreen() && Client.is474GameFrame ? 6 : 7, false);
										if (getTutorialStage() == 80)
										{
												ArrowTutorial.cancelTutorial();
										}
								}
								else
								{
										setTabId(7, false);
										if (getTutorialStage() == 80)
										{
												ArrowTutorial.cancelTutorial();
										}
								}
								break;

						case 1037:
								setTabId((Client.is474GameFrame || Client.is474PlusGameFrame) && Client.isFixedScreen() ? 10 : 7, false);
								if (!Client.is474GameFrame && !Client.is474PlusGameFrame)
								{
										if (getTutorialStage() == 80)
										{
												ArrowTutorial.cancelTutorial();
										}
								}
								break;

						case 1038:
								setTabId(8, false);
								break;

						case 1039:
								setTabId(9, false);
								break;

						case 1040:
						case 1046:
								setTabId(11, false);
								if (getTutorialStage() == 10)
								{
										setTutorialStage(getTutorialStage() + 10);
								}
								break;

						case 1041:
								setTabId(12, false);
								break;

						case 1042:
								setTabId((is562GameFrame || is562PlusGameFrame) ? 15 : 13, false);
								break;

						case 1043:
								setTabId(8, false);
								break;

						case 1044:
								setTabId(9, false);
								break;

						case 1047:
								setTabId(12, false);
								break;

						case 1048:
								setTabId(13, false);
								break;

						case 1049:
								setTabId(15, false);
								break;

						// Rest.
						case 1051:
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(153);
								break;

						// Summoning orb, first click, Activate special attack.
						case 1507:
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(5005);
								break;

						// Summoning orb, second click, Dismiss.
						case 1508:
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(5006);
								break;

						// Summoning orb, fourth click, Call familiar.
						case 1511:
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(5009);
								break;

						// Xp counter, Lock Xp.
						case 1510:
								Client.instance.stream.createFrame(185);
								Client.instance.stream.writeWord(5008);
								break;

						// Withdraw last x amount.
						case 1054:
								ignorePromptInputReset = true;
								Client.instance.sendCommandPacket("::bankwithdraw lastx " + j + " " + i1);
								ignorePromptInputReset = false;
								break;

						// Withdraw all but one.
						case 1053:
								ignorePromptInputReset = true;
								Client.instance.sendCommandPacket("::bankwithdraw allbutone " + j + " " + i1);
								ignorePromptInputReset = false;
								break;
				}
				if (identity != 315)
				{
						Profile.stopSearching(false);
						/*
						 * Button other: 632, 3900
						Button other: 78, 3900
						Button other: 867, 3900
						Button other: 431, 3900
						Button other: 53, 3900
						 */
						if (Client.shopSearching && k != 3900)
						{
								// Value and buy 1/5/10/100 of an item on the shop.
								if (identity != 78 && identity != 867 && identity != 431 && identity != 53 && identity != 632)
								{
										Client.shopSearching = false;
										Client.instance.sendCommandPacket("::shopsearch");
								}
						}
				}


				if (identity == 315)
				{
						int buttonId = k;
						if (ClientConfiguration.DEBUG_MODE)
						{
								Utility.print("Button normal: " + buttonId + "");
						}
						Client.profileBiographyLineEdited = 0;
						if (Settings.settingButton(buttonId))
						{
								return;
						}
						GameModeInterface.starterInterfaceButtons(buttonId);
						switch (buttonId)
						{

								case 24270:
										Client.shopSearching = !Client.shopSearching;
										Client.shopString = "";
										if (!Client.shopSearching)
										{
												Client.instance.sendCommandPacket("::shopsearch");
										}
										else
										{
												// Must close dialogue box incase player talks to npc, opens shop, then clicks back
												// then clicks search, then tries to search and it won't work.
												backDialogID = -1;
												setInputTaken(true);
												setDialogueOptionsShowing(false);
										}
										break;

								case 15877:
										Client.instance.spellSelected = 1;
										spellId = 15877;
										Client.instance.spellIdSentToServer = 15877;
										Client.instance.spellUsableOn = 16;
										Client.instance.itemSelected = 0;
										String s4 = "Cast";
										if (s4.indexOf(" ") != -1)
										{
												s4 = s4.substring(0, s4.indexOf(" "));
										}
										String s8 = "on";
										if (s8.indexOf(" ") != -1)
										{
												s8 = s8.substring(s8.indexOf(" ") + 1);
										}
										Client.instance.spellTooltip = s4 + " @gre@Bones to peaches@whi@ " + s8;
										if (Client.instance.spellUsableOn == 16)
										{
												setTabId(3, false);
												setTabAreaAltered(true);
										}
										return;

								case 20203:
										if (Client.isFixedScreen())
										{
												return;
										}
										setToFixed();
										break;
								case 20206:
										if (Client.getTutorialStage() > 0)
										{
												Client.instance.pushMessage("Please complete the tutorial before changing the screen size.", 0, "");
												return;
										}
										if (Client.displayMode.equals("RESIZABLE"))
										{
												return;
										}
										if (Client.is498GameFrame)
										{
												Client.instance.pushMessage("Resizable is not available on 498 gameframe. Please change the gameframe.", 0, "");
												return;
										}
										if (Client.is508PlusGameFrame)
										{
												Client.instance.pushMessage("Resizable is not available on 508 gameframe. Please change the gameframe.", 0, "");
												return;
										}
										Client.setToResizable();
										Settings.saveSettings();
										setInterfaceClicked(20206, true);
										break;
								case 20209:
										if (!Client.displayMode.equals("RESIZABLE"))
										{
												return;
										}
										if (Client.getInventoryLayout("LANDSCAPE") && (Client.is562GameFrame || Client.is562PlusGameFrame))
										{
												Client.instance.pushMessage("Double stack inventory layout is unavailable for 562 gameframes.", 0, "");
												return;
										}
										if (Client.getInventoryLayout("LANDSCAPE"))
										{
												Client.inventoryLayout = "DOUBLE STACK";
										}
										else if (Client.getInventoryLayout("DOUBLE STACK"))
										{
												Client.inventoryLayout = "LANDSCAPE";
										}
										Settings.saveSettings();
										break;
								case 20212:
										if (!Client.displayMode.equals("RESIZABLE"))
										{
												return;
										}
										Client.hideInventoryInterface = !Client.hideInventoryInterface;
										Client.hideInventoryInterfaceAction = false;
										Settings.saveSettings();
										break;

								case 22024:
								case 22025:
								case 22026:
								case 22027:
								case 22028:
								case 22029:
								case 22030:
								case 22031:
								case 22032:
										Content.closeSearch(true, false);
										break;
								case 25327:
								case 25536:
										Profile.searchButton();
										break;

								case 24282: // Close button on quick set-up interface.
								case 25406: // Close button on Weapon tracker interface.
								case 25312: // Close button on player title interface.
								case 25322: // Close button on profile interface.
								case 21041: // Close button on highscores interface.
								case 22128: // Close button on completionist cape interface.
										setInterfaceDisplayed(-1);
										break;

								case 28004:
										if (getTutorialStage() == 60)
										{
												setTutorialStage(getTutorialStage() + 10);
										}
										break;

								case 28000:
										if (getTutorialStage() == 50)
										{
												setTutorialStage(60);
												//Client.timeAchievementOpened = System.currentTimeMillis();
										}
										break;

								case 22290:
										if (getTutorialStage() == 51)
										{
												setTutorialStage(60);
												Client.timeAchievementOpened = System.currentTimeMillis();
										}
										break;

								case 19317:
										break;

								case 28008:
										if (getTutorialStage() == 80)
										{
												ArrowTutorial.cancelTutorial();
										}
										break;

								case 28012:
										if (getTutorialStage() == 70)
										{
												setTutorialStage(80);
										}
										break;

						}
						if (buttonId != 25327 && buttonId != 25536)
						{
								Profile.stopSearching(false);
						}
						RSInterface class9 = RSInterface.interfaceCache[k];
						boolean flag8 = true;
						if (class9 != null)
						{
								if (class9.actionType > 0)
								{
										flag8 = Client.instance.promptUserForInput(class9);
								}
						}
						if (flag8)
						{
								switch (k)
								{
										case 19144:
												Client.instance.sendFrame248(15106, 3213);
												resetInterfaceSequence(15106);
												setInputTaken(true);
												break;
										case 15252:
												setInputTaken(true);
												inputDialogState = 0;
												setMessagePromptRaised(true);
												promptInput = "";
												bankSearchSent = "";
												inputMessage = "Enter the new name for your clan chat";
												break;
										default:
												Client.instance.stream.createFrame(185);
												Client.instance.stream.writeWord(k);

												// Dialogue option only ids.
												if (k >= 2461 && k <= 2498)
												{
														Client.setDialogueOptionUsed(k);
												}
												break;

								}
						}
				}
				if (Client.instance.menuActionName[1] != null)
				{
						if (Client.instance.menuActionName[1].startsWith("Close Window"))
						{
								Client.instance.clearTopInterfaces();
								return;
						}
				}
				if (identity == 561)
				{
						Player player = Client.instance.playerArray[i1];
						if (player != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, player.smallY[0], myPlayer.smallX[0], false, player.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								anInt1188 += i1;
								if (anInt1188 >= 90)
								{
										Client.instance.stream.createFrame(136);
										anInt1188 = 0;
								}
								Client.instance.stream.createFrame(128);
								Client.instance.stream.writeWord(i1);
						}
				}
				if (identity == 20)
				{
						Npc class30_sub2_sub4_sub1_sub1_1 = Client.instance.npcArray[i1];
						if (class30_sub2_sub4_sub1_sub1_1 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub1_1.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub1_1.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								Client.instance.stream.createFrame(155);
								Client.instance.stream.method431(i1);
						}
				}
				if (identity == 779)
				{
						Player class30_sub2_sub4_sub1_sub2_1 = Client.instance.playerArray[i1];
						if (class30_sub2_sub4_sub1_sub2_1 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub2_1.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub2_1.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								Client.instance.stream.createFrame(153);
								Client.instance.stream.method431(i1);
						}
				}
				if (identity == 516)
				{
						if (!Client.instance.menuOpen)
						{
								Client.instance.landScape.setClicked(Client.instance.saveClickY - 4, Client.instance.saveClickX - 4);
						}
						else
						{
								Client.instance.landScape.setClicked(k - 4, j - 4);
								useSavedCoordinates = true;
						}
				}
				if (identity == 1062)
				{
						anInt924 += Client.instance.baseX;
						if (anInt924 >= 113)
						{
								Client.instance.stream.createFrame(183);
								Client.instance.stream.writeDWordBigEndian(0xe63271);
								anInt924 = 0;
						}
						Client.instance.interactWithObject(i1, k, j);
						Client.instance.stream.createFrame(228);
						Client.instance.stream.method432(i1 >> 14 & 0x7fff);
						Client.instance.stream.method432(k + Client.instance.baseY);
						Client.instance.stream.writeWord(j + Client.instance.baseX);
				}
				if (identity == 679 && !isDialogueOptionsShowing())
				{
						Client.instance.stream.createFrame(40);
						Client.instance.stream.writeWord(k);
						setDialogueOptionsShowing(true);
				}
				if (identity == 431)
				{
						Client.instance.stream.createFrame(129);
						Client.instance.stream.method432(j);
						Client.instance.stream.writeWord(k);
						Client.instance.stream.method432(i1);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
								Client.instance.atInventoryInterfaceType = 1;
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
								Client.instance.atInventoryInterfaceType = 3;
				}
				if (identity == 337 || identity == 42 || identity == 792 || identity == 322)
				{
						String s = Client.instance.menuActionName[i];
						// Add player to ignore/friend list is handled here.
						if (s.contains("<col"))
						{
								boolean addFriend = false;
								boolean addIgnore = false;
								if (s.contains("Add friend"))
								{
										addFriend = true;
								}
								else if (s.contains("Add ignore"))
								{
										addIgnore = true;
								}
								s = s.replaceFirst("<col=ffffff>", "");
								if (s.contains("Add friend") || s.contains("Add ignore"))
								{
										if (s.contains("<col=ED700E>") || s.contains("<col=bb44aa>"))
										{
												String string = s.contains("<col=ED700E>") ? "<col=ED700E>" : s.contains("<col=bb44aa>") ? "<col=bb44aa>" : "";
												if (!string.isEmpty())
												{
														try
														{
																String replace = s.substring(s.indexOf(string), s.indexOf("<col=ffffff>"));
																s = s.replace(replace, " ");
														}
														catch (Exception e)
														{

														}
												}
										}
										int amountToRemove = 0;
										if (s.endsWith("<col=ebebeb>"))
										{
												amountToRemove = 2;
												try
												{
														if (s.contains("<img="))
														{
																String replace = s.substring(s.indexOf("<"), s.indexOf(">") + 1);
																if (replace != null)
																{
																		s = s.replace(replace, "");
																}
														}
														s = s.substring(s.indexOf(">") + 1);
														s = s.substring(0, s.indexOf("<"));
												}
												catch (Exception e)
												{

												}
										}
										else
										{
												try
												{
														s = s.substring(s.lastIndexOf(">") + 1);
												}
												catch (Exception e)
												{

												}
										}
										for (int index = 0; index < amountToRemove; index++)
										{
												if (s.contains("<"))
												{
														try
														{
																String replace = s.substring(s.indexOf("<"), s.indexOf(">") + 1);
																s = s.replace(replace, " ");
														}
														catch (Exception e)
														{

														}
												}
												else
												{
														break;
												}
										}
										//Title always like this <col=bbbbb>Wtf Lol <col=ffffff>
										if (s.contains("Add friend") || s.contains("Add ignore"))
										{
												int index = 11;
												try
												{
														s = s.substring(index);
												}
												catch (Exception e)
												{

												}
										}
								}
								if (addFriend)
								{
										s = "Add friend " + s;
								}
								else if (addIgnore)
								{
										s = "Add ignore " + s;
								}
						}
						else
						{
								s = s.replaceAll("<col=ffffff>", "");
						}
						int k1 = 0;
						if (s.contains("Add"))
						{
								k1 = 11;
						}
						else
						{
								k1 = 7;
						}
						if (k1 != -1)
						{
								long l3 = TextClass.longForName(s.substring(k1).trim());
								if (identity == 337)
								{
										FriendSystem.addFriend(l3, Client.instance);
								}
								if (identity == 42)
								{
										FriendSystem.addIgnore(l3, Client.instance);
								}
								if (identity == 792)
								{
										FriendSystem.deleteFriend(l3, Client.instance);
								}
								if (identity == 322)
								{
										FriendSystem.deleteIgnore(l3, Client.instance);
								}
						}
				}
				if (identity == 53)
				{
						Client.instance.stream.createFrame(135);
						Client.instance.stream.method431(j);
						Client.instance.stream.method432(k);
						Client.instance.stream.method431(i1);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
								Client.instance.atInventoryInterfaceType = 1;
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
								Client.instance.atInventoryInterfaceType = 3;
				}
				if (identity == 539)
				{
						Client.instance.stream.createFrame(16);
						Client.instance.stream.method432(i1);
						Client.instance.stream.method433(j);
						Client.instance.stream.method433(k);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
								Client.instance.atInventoryInterfaceType = 1;
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
								Client.instance.atInventoryInterfaceType = 3;
				}
				if (identity == 484 || identity == 6)
				{
						String s1 = Client.instance.menuActionName[i];
						int l1 = s1.indexOf("@whi@");
						if (l1 != -1)
						{
								s1 = s1.substring(l1 + 5).trim();
								String s7 = TextClass.fixName(TextClass.nameForLong(TextClass.longForName(s1)));
								boolean flag9 = false;
								for (int j3 = 0; j3 < Client.instance.playerCount; j3++)
								{
										Player class30_sub2_sub4_sub1_sub2_7 = Client.instance.playerArray[Client.instance.playerIndices[j3]];
										if (class30_sub2_sub4_sub1_sub2_7 == null || class30_sub2_sub4_sub1_sub2_7.getName() == null || !class30_sub2_sub4_sub1_sub2_7.getName().equalsIgnoreCase(s7))
												continue;
										Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub2_7.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub2_7.smallX[0]);

										// Trade.
										if (identity == 484)
										{

												Client.instance.sendCommandPacket("::trade " + Client.instance.playerIndices[j3]);
										}

										// Duel.
										if (identity == 6)
										{
												anInt1188 += i1;
												if (anInt1188 >= 90)
												{
														Client.instance.stream.createFrame(136);
														anInt1188 = 0;
												}
												Client.instance.stream.createFrame(128);
												Client.instance.stream.writeWord(Client.instance.playerIndices[j3]);
										}
										flag9 = true;
										break;
								}

								if (!flag9)
								{
										Client.instance.pushMessage("Unable to find " + s7, 0, "");
								}
						}
				}
				if (identity == 713)
				{
						// withdraw action
						setInputTaken(true);
						setMessagePromptRaised(true);
						Client.instance.amountOrNameInput = "";
						inputDialogState = 0;
						inputMessage = "Enter amount";
				}
				if (identity == 870)
				{
						Client.instance.stream.createFrame(53);
						Client.instance.stream.writeWord(j);
						Client.instance.stream.method432(Client.instance.anInt1283);
						Client.instance.stream.method433(i1);
						Client.instance.stream.writeWord(Client.instance.anInt1284);
						Client.instance.stream.method431(Client.instance.anInt1285);
						Client.instance.stream.writeWord(k);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
								Client.instance.atInventoryInterfaceType = 1;
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
								Client.instance.atInventoryInterfaceType = 3;
				}
				if (identity == 847)
				{
						Client.instance.stream.createFrame(87);
						Client.instance.stream.method432(i1);
						Client.instance.stream.writeWord(k);
						Client.instance.stream.method432(j);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
								Client.instance.atInventoryInterfaceType = 1;
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
								Client.instance.atInventoryInterfaceType = 3;
				}
				if (identity == 626)
				{
						RSInterface class9_1 = RSInterface.interfaceCache[k];
						Client.instance.spellSelected = 1;
						spellId = class9_1.id;
						Client.instance.spellIdSentToServer = k;
						Client.instance.spellUsableOn = class9_1.spellUsableOn;
						Client.instance.itemSelected = 0;
						String s4 = class9_1.selectedActionName;
						if (s4.indexOf(" ") != -1)
						{
								s4 = s4.substring(0, s4.indexOf(" "));
						}
						String s8 = class9_1.selectedActionName;
						if (s8.indexOf(" ") != -1)
						{
								s8 = s8.substring(s8.indexOf(" ") + 1);
						}
						Client.instance.spellTooltip = s4 + " " + class9_1.spellName + " " + s8;
						if (Client.instance.spellUsableOn == 16)
						{
								setTabId(3, false);
								setTabAreaAltered(true);
						}
						return;
				}
				if (identity == 78)
				{
						Client.instance.stream.createFrame(117);
						Client.instance.stream.method433(k);
						Client.instance.stream.method433(i1);
						Client.instance.stream.method431(j);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
								Client.instance.atInventoryInterfaceType = 1;
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
								Client.instance.atInventoryInterfaceType = 3;
				}
				if (identity == 27)
				{
						Player class30_sub2_sub4_sub1_sub2_2 = Client.instance.playerArray[i1];
						if (class30_sub2_sub4_sub1_sub2_2 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub2_2.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub2_2.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								anInt986 += i1;
								if (anInt986 >= 54)
								{
										Client.instance.stream.createFrame(189);
										Client.instance.stream.writeWordBigEndian(234);
										anInt986 = 0;
								}
								Client.instance.stream.createFrame(73);
								Client.instance.stream.method431(i1);
						}
				}
				if (identity == 213)
				{
						boolean flag3 = Client.instance.doWalkTo(2, 0, 0, 0, myPlayer.smallY[0], 0, 0, k, myPlayer.smallX[0], false, j);
						if (!flag3)
								flag3 = Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, k, myPlayer.smallX[0], false, j);
						Client.instance.crossX = Client.instance.saveClickX;
						Client.instance.crossY = Client.instance.saveClickY;
						Client.instance.crossType = 2;
						Client.instance.crossIndex = 0;
						Client.instance.stream.createFrame(79);
						Client.instance.stream.method431(k + Client.instance.baseY);
						Client.instance.stream.writeWord(i1);
						Client.instance.stream.method432(j + Client.instance.baseX);
				}

				if (identity == 632)
				{
						Client.instance.stream.createFrame(145);
						Client.instance.stream.method432(k);
						Client.instance.stream.method432(j);
						Client.instance.stream.method432(i1);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
								Client.instance.atInventoryInterfaceType = 1;
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
								Client.instance.atInventoryInterfaceType = 3;
				}
				if (identity == 1004)
				{
						if (tabInterfaceId[10] != -1)
						{
								setTabId(10, false);
								setTabAreaAltered(true);
						}
				}
				if (identity == 1003)
				{
						Client.instance.clanChatMode = 2;
						setInputTaken(true);
				}
				if (identity == 1002)
				{
						Client.instance.clanChatMode = 1;
						setInputTaken(true);
				}
				if (identity == 1001)
				{
						Client.instance.clanChatMode = 0;
						setInputTaken(true);
				}
				if (identity == 1000)
				{
						Client.instance.cButtonCPos = 4;
						Client.instance.chatTypeView = 11;
						setInputTaken(true);
				}
				if (identity == 999)
				{
						Client.instance.cButtonCPos = 0;
						Client.instance.chatTypeView = 0;
						setInputTaken(true);
				}
				if (identity == 998)
				{
						Client.instance.cButtonCPos = 1;
						Client.instance.chatTypeView = 5;
						setInputTaken(true);
				}
				else if (identity == 1005)
				{
						Client.instance.sendCommandPacket("::filteron");
						filtered = true;
						setInputTaken(true);
				}
				else if (identity == 1006)
				{
						Client.instance.sendCommandPacket("::filteroff");
						filtered = false;
						setInputTaken(true);
				}
				else if (identity == 1007)
				{
						Client.instance.sendCommandPacket("::configuremessages");
						setInputTaken(true);
				}
				else if (identity == 1008)
				{

						for (int index = 0; index < 500; index++) // Fix chat box, It will remove old chat messages after you relog.
						{
								if (Client.instance.chatTypes[index] == 6 || Client.instance.chatTypes[index] == 3 || Client.instance.chatTypes[index] == 7 || Client.instance.chatTypes[index] == 5)
								{
										Client.instance.chatMessages[index] = null;
								}
						}
				}
				if (identity == 997)
				{
						Client.instance.publicChatMode = 3;
						setInputTaken(true);
				}
				if (identity == 996)
				{
						Client.instance.publicChatMode = 2;
						setInputTaken(true);
				}
				if (identity == 995)
				{
						Client.instance.publicChatMode = 1;
						setInputTaken(true);
				}
				if (identity == 994)
				{
						Client.instance.publicChatMode = 0;
						setInputTaken(true);
				}
				if (identity == 993)
				{
						Client.instance.cButtonCPos = 2;
						Client.instance.chatTypeView = 1;
						setInputTaken(true);
				}
				if (identity == 992)
				{
						Client.instance.privateChatMode = 2;
						setInputTaken(true);
				}
				if (identity == 991)
				{
						Client.instance.privateChatMode = 1;
						setInputTaken(true);
				}
				if (identity == 990)
				{
						Client.instance.privateChatMode = 0;
						setInputTaken(true);
				}
				if (identity == 989)
				{
						Client.instance.cButtonCPos = 3;
						Client.instance.chatTypeView = 2;
						setInputTaken(true);
				}
				if (identity == 987)
				{
						Client.instance.tradeMode = 2;
						setInputTaken(true);
				}
				if (identity == 986)
				{
						Client.instance.tradeMode = 1;
						setInputTaken(true);
				}
				if (identity == 985)
				{
						Client.instance.tradeMode = 0;
						setInputTaken(true);
				}
				if (identity == 984)
				{
						Client.instance.cButtonCPos = 5;
						Client.instance.chatTypeView = 3;
						setInputTaken(true);
				}
				if (identity == 983)
				{
						Client.instance.duelMode = 2;
						setInputTaken(true);
				}
				if (identity == 982)
				{
						Client.instance.duelMode = 1;
						setInputTaken(true);
				}
				if (identity == 981)
				{
						Client.instance.duelMode = 0;
						setInputTaken(true);
				}
				if (identity == 980)
				{
						Client.instance.cButtonCPos = 6;
						Client.instance.chatTypeView = 4;
						setInputTaken(true);
				}
				if (identity == 493)
				{
						Client.instance.stream.createFrame(75);
						Client.instance.stream.method433(k);
						Client.instance.stream.method431(j);
						Client.instance.stream.method432(i1);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
								Client.instance.atInventoryInterfaceType = 1;
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
								Client.instance.atInventoryInterfaceType = 3;
				}
				if (identity == 652)
				{
						boolean flag4 = Client.instance.doWalkTo(2, 0, 0, 0, myPlayer.smallY[0], 0, 0, k, myPlayer.smallX[0], false, j);
						if (!flag4)
								flag4 = Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, k, myPlayer.smallX[0], false, j);
						Client.instance.crossX = Client.instance.saveClickX;
						Client.instance.crossY = Client.instance.saveClickY;
						Client.instance.crossType = 2;
						Client.instance.crossIndex = 0;
						Client.instance.stream.createFrame(156);
						Client.instance.stream.method432(j + Client.instance.baseX);
						Client.instance.stream.method431(k + Client.instance.baseY);
						Client.instance.stream.method433(i1);
				}
				if (identity == 94)
				{
						boolean flag5 = Client.instance.doWalkTo(2, 0, 0, 0, myPlayer.smallY[0], 0, 0, k, myPlayer.smallX[0], false, j);
						if (!flag5)
								flag5 = Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, k, myPlayer.smallX[0], false, j);
						Client.instance.crossX = Client.instance.saveClickX;
						Client.instance.crossY = Client.instance.saveClickY;
						Client.instance.crossType = 2;
						Client.instance.crossIndex = 0;
						Client.instance.stream.createFrame(181);
						Client.instance.stream.method431(k + Client.instance.baseY);
						Client.instance.stream.writeWord(i1);
						Client.instance.stream.method431(j + Client.instance.baseX);
						Client.instance.stream.method432(Client.instance.spellIdSentToServer);
				}
				if (identity == 646)
				{
						Client.instance.stream.createFrame(185);
						Client.instance.stream.writeWord(k);
						RSInterface class9_2 = RSInterface.interfaceCache[k];
						if (class9_2.valueIndexArray != null && class9_2.valueIndexArray[0][0] == 5)
						{
								int i2 = class9_2.valueIndexArray[0][1];

								// Resizable settings button.
								if (i2 == 200)
								{
										setInterfaceClicked(Client.isFixedScreen() ? 20203 : 20206, true);
										setInterfaceDisplayed(20200);
								}
								else
								{
										for (int index = 0; index < CombatInterface.interfaceId.length; index++)
										{
												if (k == CombatInterface.interfaceId[index])
												{
														return;
												}
										}
										if (Client.instance.variousSettings[i2] != class9_2.scriptCompareValue[0])
										{
												Client.instance.variousSettings[i2] = class9_2.scriptCompareValue[0];
												Client.instance.handleVarp(i2);
										}
								}
						}
				}
				if (identity == 225)
				{
						Npc class30_sub2_sub4_sub1_sub1_2 = Client.instance.npcArray[i1];
						if (class30_sub2_sub4_sub1_sub1_2 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub1_2.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub1_2.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								anInt1226 += i1;
								if (anInt1226 >= 85)
								{
										Client.instance.stream.createFrame(230);
										Client.instance.stream.writeWordBigEndian(239);
										anInt1226 = 0;
								}
								Client.instance.stream.createFrame(17);
								Client.instance.stream.method433(i1);
						}
				}
				if (identity == 965)
				{
						Npc class30_sub2_sub4_sub1_sub1_3 = Client.instance.npcArray[i1];
						if (class30_sub2_sub4_sub1_sub1_3 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub1_3.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub1_3.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								anInt1134++;
								if (anInt1134 >= 96)
								{
										Client.instance.stream.createFrame(152);
										Client.instance.stream.writeWordBigEndian(88);
										anInt1134 = 0;
								}
								Client.instance.stream.createFrame(21);
								Client.instance.stream.writeWord(i1);
						}
				}
				if (identity == 413)
				{
						Npc class30_sub2_sub4_sub1_sub1_4 = Client.instance.npcArray[i1];
						if (class30_sub2_sub4_sub1_sub1_4 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub1_4.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub1_4.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								Client.instance.stream.createFrame(131);
								Client.instance.stream.method433(i1);
								Client.instance.stream.method432(Client.instance.spellIdSentToServer);
						}
				}
				if (identity == 200)
				{
						Client.instance.clearTopInterfaces();
				}
				if (identity == 1025)
				{
						/* this error happens so much.
							 * Exception in thread "Thread-3" java.lang.ArrayIndexOutOfBoundsException: 237813760
								at Client.doAction(Client.java:5664)
								at Client.processMenuClick(Client.java:1724)
								at Client.mainGameProcessor(Client.java:4127)
								at Client.processGameLoop(Client.java:3296)
								at RSApplet.run(RSApplet.java:126)
								at Client.run(Client.java:6019)
								at java.lang.Thread.run(Thread.java:745)
							 */
						if (i1 > 50000)
						{
								// Does happen at random, no idea why. If no return statement, it will crash client.
								return;
						}
						Npc class30_sub2_sub4_sub1_sub1_5 = Client.instance.npcArray[i1];
						if (class30_sub2_sub4_sub1_sub1_5 != null)
						{
								EntityDefinition entityDef = class30_sub2_sub4_sub1_sub1_5.desc;
								if (entityDef.childrenIDs != null)
								{
										entityDef = entityDef.getOverride();
								}
								if (entityDef != null)
								{
										String s9;
										if (entityDef.description != null)
										{
												s9 = new String(entityDef.description);
										}
										else
										{
												s9 = "It's a " + entityDef.name + ".";
										}
										Client.instance.pushMessage(s9, 0, "");
								}
						}
				}
				if (identity == 900)
				{
						Client.instance.interactWithObject(i1, k, j);
						Client.instance.stream.createFrame(252);
						Client.instance.stream.method433(i1 >> 14 & 0x7fff);
						Client.instance.stream.method431(k + Client.instance.baseY);
						Client.instance.stream.method432(j + Client.instance.baseX);
				}
				if (identity == 412)
				{
						Npc class30_sub2_sub4_sub1_sub1_6 = Client.instance.npcArray[i1];
						if (class30_sub2_sub4_sub1_sub1_6 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub1_6.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub1_6.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								Client.instance.stream.createFrame(72);
								Client.instance.stream.method432(i1);
						}
				}
				if (identity == 365)
				{
						Player class30_sub2_sub4_sub1_sub2_3 = Client.instance.playerArray[i1];
						if (class30_sub2_sub4_sub1_sub2_3 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub2_3.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub2_3.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								Client.instance.stream.createFrame(249);
								Client.instance.stream.method432(i1);
								Client.instance.stream.method431(Client.instance.spellIdSentToServer);
						}
				}
				if (identity == 729)
				{
						Player class30_sub2_sub4_sub1_sub2_4 = Client.instance.playerArray[i1];
						if (class30_sub2_sub4_sub1_sub2_4 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub2_4.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub2_4.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								Client.instance.stream.createFrame(39);
								Client.instance.stream.method431(i1);
						}
				}
				if (identity == 577)
				{
						Player class30_sub2_sub4_sub1_sub2_5 = Client.instance.playerArray[i1];
						if (class30_sub2_sub4_sub1_sub2_5 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub2_5.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub2_5.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								Client.instance.stream.createFrame(139);
								Client.instance.stream.method431(i1);
						}
				}
				if (identity == 956 && Client.instance.interactWithObject(i1, k, j))
				{
						Client.instance.stream.createFrame(35);
						Client.instance.stream.method431(j + Client.instance.baseX);
						Client.instance.stream.method432(Client.instance.spellIdSentToServer);
						Client.instance.stream.method432(k + Client.instance.baseY);
						Client.instance.stream.method431(i1 >> 14 & 0x7fff);
				}
				if (identity == 567)
				{
						boolean flag6 = Client.instance.doWalkTo(2, 0, 0, 0, myPlayer.smallY[0], 0, 0, k, myPlayer.smallX[0], false, j);
						if (!flag6)
						{
								flag6 = Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, k, myPlayer.smallX[0], false, j);
						}
						Client.instance.crossX = Client.instance.saveClickX;
						Client.instance.crossY = Client.instance.saveClickY;
						Client.instance.crossType = 2;
						Client.instance.crossIndex = 0;
						Client.instance.stream.createFrame(23);
						Client.instance.stream.method431(k + Client.instance.baseY);
						Client.instance.stream.method431(i1);
						Client.instance.stream.method431(j + Client.instance.baseX);
				}
				if (identity == 867)
				{
						if ((i1 & 3) == 0)
						{
								anInt1175++;
						}
						if (anInt1175 >= 59)
						{
								Client.instance.stream.createFrame(200);
								Client.instance.stream.writeWord(25501);
								anInt1175 = 0;
						}
						Client.instance.stream.createFrame(43);
						Client.instance.stream.method431(k);
						Client.instance.stream.method432(i1);
						Client.instance.stream.method432(j);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
						{
								Client.instance.atInventoryInterfaceType = 1;
						}
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
						{
								Client.instance.atInventoryInterfaceType = 3;
						}
				}
				if (identity == 543)
				{
						Client.instance.stream.createFrame(237);
						Client.instance.stream.writeWord(j);
						Client.instance.stream.method432(i1);
						Client.instance.stream.writeWord(k);
						Client.instance.stream.method432(Client.instance.spellIdSentToServer);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
						{
								Client.instance.atInventoryInterfaceType = 1;
						}
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
						{
								Client.instance.atInventoryInterfaceType = 3;
						}
				}
				if (identity == 491)
				{
						Player class30_sub2_sub4_sub1_sub2_6 = Client.instance.playerArray[i1];
						if (class30_sub2_sub4_sub1_sub2_6 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub2_6.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub2_6.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								Client.instance.stream.createFrame(14);
								Client.instance.stream.method432(Client.instance.anInt1284);
								Client.instance.stream.writeWord(i1);
								Client.instance.stream.writeWord(Client.instance.anInt1285);
								Client.instance.stream.method431(Client.instance.anInt1283);
						}
				}
				if (identity == 639)
				{
						String s3 = Client.instance.menuActionName[i];
						int k2 = s3.contains("<col=ffffff>") ? 20 : 13;
						if (k2 != -1)
						{
								long l4 = TextClass.longForName(s3.substring(k2).trim());
								int k3 = -1;
								for (int i4 = 0; i4 < friendsCount; i4++)
								{
										if (Client.instance.friendsListAsLongs[i4] != l4)
												continue;
										k3 = i4;
										break;
								}

								if (k3 != -1 && Client.instance.friendsNodeIds[k3] > 0)
								{
										setInputTaken(true);
										inputDialogState = 0;
										setMessagePromptRaised(true);
										promptInput = "";
										bankSearchSent = "";
										friendsListAction = 3;
										Client.instance.aLong953 = Client.instance.friendsListAsLongs[k3];
										inputMessage = "Enter message to send to " + Client.instance.friendsList[k3];
								}
						}
				}

				// Inventory items.
				if (identity == 454)
				{
						//Client.itemSwitch = System.currentTimeMillis();
						Client.instance.stream.createFrame(41);
						Client.instance.stream.writeWord(i1);
						Client.instance.stream.method432(j);
						Client.instance.stream.method432(k);
						Client.instance.atInventoryLoopCycle = 0;
						Client.instance.atInventoryInterface = k;
						Client.instance.atInventoryIndex = j;
						Client.instance.atInventoryInterfaceType = 2;
						if (RSInterface.interfaceCache[k].parentId == getInterfaceDisplayed())
						{
								Client.instance.atInventoryInterfaceType = 1;
						}
						if (RSInterface.interfaceCache[k].parentId == backDialogID)
						{
								Client.instance.atInventoryInterfaceType = 3;
						}
				}
				if (identity == 478)
				{
						Npc class30_sub2_sub4_sub1_sub1_7 = Client.instance.npcArray[i1];
						if (class30_sub2_sub4_sub1_sub1_7 != null)
						{
								Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, class30_sub2_sub4_sub1_sub1_7.smallY[0], myPlayer.smallX[0], false, class30_sub2_sub4_sub1_sub1_7.smallX[0]);
								Client.instance.crossX = Client.instance.saveClickX;
								Client.instance.crossY = Client.instance.saveClickY;
								Client.instance.crossType = 2;
								Client.instance.crossIndex = 0;
								if ((i1 & 3) == 0)
								{
										anInt1155++;
								}
								if (anInt1155 >= 53)
								{
										Client.instance.stream.createFrame(85);
										Client.instance.stream.writeWordBigEndian(66);
										anInt1155 = 0;
								}
								Client.instance.stream.createFrame(18);
								Client.instance.stream.method431(i1);
						}
				}
				if (identity == 113)
				{
						Client.instance.interactWithObject(i1, k, j);
						Client.instance.stream.createFrame(70);
						Client.instance.stream.method431(j + Client.instance.baseX);
						Client.instance.stream.writeWord(k + Client.instance.baseY);
						Client.instance.stream.method433(i1 >> 14 & 0x7fff);
				}
				if (identity == 872)
				{
						Client.instance.interactWithObject(i1, k, j);
						Client.instance.stream.createFrame(234);
						Client.instance.stream.method433(j + Client.instance.baseX);
						Client.instance.stream.method432(i1 >> 14 & 0x7fff);
						Client.instance.stream.method433(k + Client.instance.baseY);
				}
				if (identity == 502)
				{
						Client.instance.interactWithObject(i1, k, j);
						Client.instance.stream.createFrame(132);
						Client.instance.stream.method433(j + Client.instance.baseX);
						Client.instance.stream.writeWord(i1 >> 14 & 0x7fff);
						Client.instance.stream.method432(k + Client.instance.baseY);
				}
				if (identity == 1125)
				{
						ItemDefinition itemDef = ItemDefinition.forId(i1);
						RSInterface class9_4 = RSInterface.interfaceCache[k];
						String s5;
						if (class9_4 != null && class9_4.invStackSizes[j] >= 0x186a0)
						{
								DecimalFormatSymbols separator = new DecimalFormatSymbols();
								separator.setGroupingSeparator(',');
								DecimalFormat formatter = new DecimalFormat("#,###,###,###", separator);
								int amount = class9_4.invStackSizes[j];
								if (amount == 2140000000 & Client.getInterfaceDisplayed() == 3824)
								{
										s5 = "Infinite amount of " + itemDef.name + ".";
								}
								else
								{
										s5 = formatter.format(amount) + " x " + itemDef.name;
								}
						}
						else
						{
								String itemName = itemDef.name.toLowerCase();
								String anA = "a";
								if (itemName.startsWith("a") || itemName.startsWith("e") || itemName.startsWith("i") || itemName.startsWith("o") || itemName.startsWith("u"))
								{
										anA = "an";
								}
								s5 = "It's " + anA + " " + itemDef.name + ".";
						}
						Client.instance.pushMessage(s5, 0, "");
				}

				// Withdraw button.
				if (k == 22008)
				{
						Client.instance.variousSettings[115] = Client.instance.variousSettings[115] == 0 ? 1 : 0;
				}
				if (k == 22004)
				{
						if (isMessagePromptRaised())
						{
								Content.closeSearch(false, true);
						}
						else
						{
								Content.openSearch("Enter an item to search for");
						}
				}
				if (identity == 169)
				{
						Client.instance.stream.createFrame(185);
						Client.instance.stream.writeWord(k);

						// Auto retaliate and autocast button.
						if (k == 150 || k == 350)
						{
								return;
						}
						RSInterface class9_3 = RSInterface.interfaceCache[k];
						if (class9_3.valueIndexArray != null && class9_3.valueIndexArray[0][0] == 5)
						{
								int l2 = class9_3.valueIndexArray[0][1];
								Client.instance.variousSettings[l2] = 1 - Client.instance.variousSettings[l2];
								Client.instance.handleVarp(l2);
						}
				}
				if (identity == 447)
				{
						Client.instance.itemSelected = 1;
						Client.instance.anInt1283 = j;
						Client.instance.anInt1284 = k;
						Client.instance.anInt1285 = i1;
						Client.instance.selectedItemName = ItemDefinition.forId(i1).name;
						Client.instance.spellSelected = 0;
						return;
				}
				if (identity == 1226)
				{
						int j1 = i1 >> 14 & 0x7fff;
						ObjectDefinition class46 = ObjectDefinition.forID(j1);
						String s10;
						if (class46.description != null)
						{
								s10 = new String(class46.description);
						}
						else
						{
								s10 = "It's a " + class46.name + ".";
						}
						Client.instance.pushMessage(s10, 0, "");
				}
				if (identity == 244)
				{
						boolean flag7 = Client.instance.doWalkTo(2, 0, 0, 0, myPlayer.smallY[0], 0, 0, k, myPlayer.smallX[0], false, j);
						if (!flag7)
						{
								flag7 = Client.instance.doWalkTo(2, 0, 1, 0, myPlayer.smallY[0], 1, 0, k, myPlayer.smallX[0], false, j);
						}
						Client.instance.crossX = Client.instance.saveClickX;
						Client.instance.crossY = Client.instance.saveClickY;
						Client.instance.crossType = 2;
						Client.instance.crossIndex = 0;
						Client.instance.stream.createFrame(253);
						Client.instance.stream.method431(j + Client.instance.baseX);
						Client.instance.stream.method433(k + Client.instance.baseY);
						Client.instance.stream.method432(i1);
				}
				if (identity == 1448)
				{
						ItemDefinition itemDef_1 = ItemDefinition.forId(i1);
						String s6;

						String itemName = itemDef_1.name.toLowerCase();
						String anA = "a";
						if (itemName.startsWith("a") || itemName.startsWith("e") || itemName.startsWith("i") || itemName.startsWith("o") || itemName.startsWith("u"))
						{
								anA = "an";
						}
						s6 = "It's " + anA + " " + itemDef_1.name + ".";
						Client.instance.pushMessage(s6, 0, "");
				}
				Client.instance.itemSelected = 0;
				Client.instance.spellSelected = 0;

		}
}
