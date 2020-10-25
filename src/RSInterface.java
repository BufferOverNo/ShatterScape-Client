import java.util.ArrayList;
import java.util.Collections;

// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
public final class RSInterface
{

		public static void unpack(StreamLoader streamLoader, TextDrawingArea textDrawingAreas[], StreamLoader streamLoader_1)
		{
				fonts = textDrawingAreas;
				RSFont = textDrawingAreas;
				aMRUNodes_238 = new MRUNodes(50000);
				Stream stream = new Stream(streamLoader.getDataForName("data"));
				int i = -1;
				@SuppressWarnings("unused")
				int j = stream.readUnsignedWord();
				interfaceCache = new RSInterface[31000];
				Client.instance.drawLoadingText(598, Client.loadingGameString);
				while (stream.currentOffset < stream.buffer.length)
				{
						int k = stream.readUnsignedWord();
						if (k == 65535)
						{
								i = stream.readUnsignedWord();
								k = stream.readUnsignedWord();
						}
						RSInterface rsInterface = interfaceCache[k] = new RSInterface();
						rsInterface.id = k;
						rsInterface.parentId = i;
						rsInterface.setType(stream.readUnsignedByte());
						rsInterface.atActionType = stream.readUnsignedByte();
						rsInterface.actionType = stream.readUnsignedWord();
						rsInterface.width = stream.readUnsignedWord();
						rsInterface.height = stream.readUnsignedWord();
						rsInterface.opacity = (byte) stream.readUnsignedByte();
						rsInterface.isMouseoverTriggered = stream.readUnsignedByte();
						if (rsInterface.isMouseoverTriggered != 0)
						{
								rsInterface.isMouseoverTriggered = (rsInterface.isMouseoverTriggered - 1 << 8) + stream.readUnsignedByte();
						}
						else
						{
								rsInterface.isMouseoverTriggered = -1;
						}
						int i1 = stream.readUnsignedByte();
						if (i1 > 0)
						{
								rsInterface.scriptCompareType = new int[i1];
								rsInterface.scriptCompareValue = new int[i1];
								for (int j1 = 0; j1 < i1; j1++)
								{
										rsInterface.scriptCompareType[j1] = stream.readUnsignedByte();
										rsInterface.scriptCompareValue[j1] = stream.readUnsignedWord();
								}

						}
						int k1 = stream.readUnsignedByte();
						if (k1 > 0)
						{
								rsInterface.valueIndexArray = new int[k1][];
								for (int l1 = 0; l1 < k1; l1++)
								{
										int i3 = stream.readUnsignedWord();
										rsInterface.valueIndexArray[l1] = new int[i3];
										for (int l4 = 0; l4 < i3; l4++)
										{
												rsInterface.valueIndexArray[l1][l4] = stream.readUnsignedWord();
										}

								}

						}
						if (rsInterface.getType() == 0)
						{
								rsInterface.drawsTransparent = false;
								rsInterface.scrollMax = stream.readUnsignedWord();
								rsInterface.interfaceShown = stream.readUnsignedByte() == 1;
								int i2 = stream.readUnsignedWord();
								rsInterface.children = new int[i2];
								rsInterface.childX = new int[i2];
								rsInterface.childY = new int[i2];
								for (int j3 = 0; j3 < i2; j3++)
								{
										rsInterface.children[j3] = stream.readUnsignedWord();
										rsInterface.childX[j3] = stream.readSignedWord();
										rsInterface.childY[j3] = stream.readSignedWord();
								}
						}
						if (rsInterface.getType() == 1)
						{
								stream.readUnsignedWord();
								stream.readUnsignedByte();
						}
						if (rsInterface.getType() == 2)
						{
								rsInterface.inv = new int[rsInterface.width * rsInterface.height];
								rsInterface.invStackSizes = new int[rsInterface.width * rsInterface.height];
								rsInterface.itemsAreDraggable = stream.readUnsignedByte() == 1;
								rsInterface.isInventoryInterface = stream.readUnsignedByte() == 1;
								rsInterface.usableItemInterface = stream.readUnsignedByte() == 1;
								rsInterface.itemsAreSwappable = stream.readUnsignedByte() == 1;
								rsInterface.invSpritePadX = stream.readUnsignedByte();
								rsInterface.invSpritePadY = stream.readUnsignedByte();
								rsInterface.spritesX = new int[20];
								rsInterface.spritesY = new int[20];
								rsInterface.sprites = new Sprite[20];
								for (int j2 = 0; j2 < 20; j2++)
								{
										int k3 = stream.readUnsignedByte();
										if (k3 == 1)
										{
												rsInterface.spritesX[j2] = stream.readSignedWord();
												rsInterface.spritesY[j2] = stream.readSignedWord();
												String s1 = stream.readString();
												if (streamLoader_1 != null && s1.length() > 0)
												{
														int i5 = s1.lastIndexOf(",");
														rsInterface.sprites[j2] = method207(Integer.parseInt(s1.substring(i5 + 1)), streamLoader_1, s1.substring(0, i5));
												}
										}
								}
								rsInterface.actions = new String[5];
								for (int l3 = 0; l3 < 5; l3++)
								{
										rsInterface.actions[l3] = stream.readString();
										if (rsInterface.actions[l3].length() == 0)
										{
												rsInterface.actions[l3] = null;
										}
										if (rsInterface.parentId == 3824)
										{
												rsInterface.actions[4] = "Buy X";
										}

										if (rsInterface.parentId == 3822)
										{
												rsInterface.actions[4] = "Sell X";
										}
								}
								if (rsInterface.parentId == 1644)
								{
										rsInterface.actions[2] = "Operate";
								}
						}

						if (rsInterface.getType() == 3)
						{
								rsInterface.isFilled = stream.readUnsignedByte() == 1;
						}
						if (rsInterface.getType() == 4 || rsInterface.getType() == 1)
						{
								rsInterface.centerText = stream.readUnsignedByte() == 1;
								int k2 = stream.readUnsignedByte();
								if (textDrawingAreas != null)
								{
										rsInterface.textDrawingAreas = textDrawingAreas[k2];
								}
								rsInterface.textShadow = stream.readUnsignedByte() == 1;
						}
						if (rsInterface.getType() == 4)
						{
								rsInterface.message = stream.readString();
								rsInterface.messageEnabled = stream.readString();
						}
						if (rsInterface.getType() == 1 || rsInterface.getType() == 3 || rsInterface.getType() == 4)
						{
								rsInterface.textColour = stream.readDWord();
								Music.modifyMusicTextColour(rsInterface);
						}
						if (rsInterface.getType() == 3 || rsInterface.getType() == 4)
						{
								rsInterface.colourEnabled = stream.readDWord();
								rsInterface.hoverColorDisabled = stream.readDWord();
								rsInterface.hoverColorEnabled = stream.readDWord();
								Music.addHoverToMusicInterface(rsInterface);
								if (rsInterface.id == 15234) // Strange place on music tab.
								{
										rsInterface.colourEnabled = 65280;
								}
						}
						if (rsInterface.getType() == 5)
						{
								rsInterface.drawsTransparent = false;
								String s = stream.readString();
								if (streamLoader_1 != null && s.length() > 0)
								{
										int i4 = s.lastIndexOf(",");
										rsInterface.sprite1 = method207(Integer.parseInt(s.substring(i4 + 1)), streamLoader_1, s.substring(0, i4));
								}
								s = stream.readString();
								if (streamLoader_1 != null && s.length() > 0)
								{
										int j4 = s.lastIndexOf(",");
										rsInterface.sprite2 = method207(Integer.parseInt(s.substring(j4 + 1)), streamLoader_1, s.substring(0, j4));

								}
						}
						if (rsInterface.getType() == 6)
						{
								int l = stream.readUnsignedByte();
								if (l != 0)
								{
										rsInterface.modelTypeDisabled = 1;
										rsInterface.mediaID = (l - 1 << 8) + stream.readUnsignedByte();
								}
								l = stream.readUnsignedByte();
								if (l != 0)
								{
										rsInterface.modelTypeEnabled = 1;
										rsInterface.modelEnabled = (l - 1 << 8) + stream.readUnsignedByte();
								}
								l = stream.readUnsignedByte();
								if (l != 0)
								{
										rsInterface.sequenceDisabled = (l - 1 << 8) + stream.readUnsignedByte();
								}
								else
								{
										rsInterface.sequenceDisabled = -1;
								}
								l = stream.readUnsignedByte();
								if (l != 0)
								{
										rsInterface.sequenceEnabled = (l - 1 << 8) + stream.readUnsignedByte();
								}
								else
								{
										rsInterface.sequenceEnabled = -1;
								}
								rsInterface.modelZoom = stream.readUnsignedWord();
								rsInterface.modelRotationY = stream.readUnsignedWord();
								rsInterface.modelRotationX = stream.readUnsignedWord();
						}
						if (rsInterface.getType() == 7)
						{
								rsInterface.inv = new int[rsInterface.width * rsInterface.height];
								rsInterface.invStackSizes = new int[rsInterface.width * rsInterface.height];
								rsInterface.centerText = stream.readUnsignedByte() == 1;
								int l2 = stream.readUnsignedByte();
								if (textDrawingAreas != null)
								{
										rsInterface.textDrawingAreas = textDrawingAreas[l2];
								}
								rsInterface.textShadow = stream.readUnsignedByte() == 1;
								rsInterface.textColour = stream.readDWord();
								rsInterface.invSpritePadX = stream.readSignedWord();
								rsInterface.invSpritePadY = stream.readSignedWord();
								rsInterface.isInventoryInterface = stream.readUnsignedByte() == 1;
								rsInterface.actions = new String[5];
								for (int k4 = 0; k4 < 5; k4++)
								{
										rsInterface.actions[k4] = stream.readString();
										if (rsInterface.actions[k4].length() == 0)
										{
												rsInterface.actions[k4] = null;
										}
								}
						}
						if (rsInterface.atActionType == 2 || rsInterface.getType() == 2)
						{
								rsInterface.selectedActionName = stream.readString();
								rsInterface.spellName = stream.readString();
								rsInterface.spellUsableOn = stream.readUnsignedWord();
								String green = "@gre@" + rsInterface.spellName + "@whi@";
								rsInterface.spellName = green;
						}

						if (rsInterface.getType() == 8)
						{
								rsInterface.message = stream.readString();
								/*
								                 * 	Only thing it prints out
								                 * 	To view your messages:\n1) Logout and return to the frontpage of this website.\n2) Choose 'Read your messages from Jagex'.
								                 *	To start or cancel a subscription:\n1) Logout and return to the frontpage of this website.\n2) Choose the relevant option from the 'membership' section.\n\nNote: If you are a credit card subscriber a top-up payment will\nautomatically be taken when 3 days credit remain.\n(unless you cancel your subscription, which can be done \nat any time.)
																 *	To change your recovery questions:\n1) Logout and return to the frontpage of this website.\n2) Choose 'Set new recovery questions'.
								                 */
						}

						if (rsInterface.atActionType == 1 || rsInterface.atActionType == 4 || rsInterface.atActionType == 5 || rsInterface.atActionType == 6)
						{
								rsInterface.tooltip = stream.readString();
								if (rsInterface.tooltip.length() == 0)
								{
										if (rsInterface.atActionType == 1)
										{
												rsInterface.tooltip = "Ok";
										}
										if (rsInterface.atActionType == 4)
										{
												rsInterface.tooltip = "Select";
										}
										if (rsInterface.atActionType == 5)
										{
												rsInterface.tooltip = "Select";
										}
										if (rsInterface.atActionType == 6)
										{
												rsInterface.tooltip = "Continue";
										}
								}
						}
				}
				Client.instance.drawLoadingText(640, Client.loadingGameString);
				aClass44 = streamLoader;
				Interfaces.customInterfaces(textDrawingAreas);
				aMRUNodes_238 = null;
				if (ClientConfiguration.DEBUG_INTERFACES)
				{
						Collections.sort(RSInterface.interfaceIds);
						for (int p = 0; p < RSInterface.interfaceIds.size(); p++)
						{
								Utility.print("" + RSInterface.interfaceIds.get(p));
						}
				}
		}


		public int invStartIndex = 0;

		public static int getConfigID(int id)
		{
				RSInterface rsi = interfaceCache[id];
				if (rsi.valueIndexArray != null && rsi.valueIndexArray[0][1] > 0)
				{
						return rsi.valueIndexArray[0][1];
				}
				return 0;
		}

		public static void addHoverButtonLatest(int buttonId1, int buttonId2, int buttonId3, int spriteId1, int spriteId2, int buttonWidth, int buttonHeight, String buttonHoverText)
		{
				addHoverButton(buttonId1, spriteId1, buttonWidth, buttonHeight, buttonHoverText, -1, buttonId2, 1);
				addHoveredButton(buttonId2, spriteId2, buttonWidth, buttonHeight, buttonId3);
		}

		public void swapInventoryItems(int i, int j)
		{
				int k = inv[i];
				inv[i] = inv[j];
				inv[j] = k;
				k = invStackSizes[i];
				invStackSizes[i] = invStackSizes[j];
				invStackSizes[j] = k;
		}

		public static void addBankItem(int index, Boolean hasOption)
		{
				RSInterface rsi = interfaceCache[index] = new RSInterface();
				rsi.actions = new String[5];
				rsi.spritesX = new int[20];
				rsi.invStackSizes = new int[30];
				rsi.inv = new int[30];
				rsi.spritesY = new int[20];
				rsi.children = new int[0];
				rsi.childX = new int[0];
				rsi.childY = new int[0];
				rsi.invSpritePadX = 24;
				rsi.invSpritePadY = 24;
				rsi.height = 5;
				rsi.removeStackableNumber = true;
				rsi.width = 6;
				rsi.parentId = 24494;
				rsi.id = index;
				rsi.setType(2);
		}

		public static void addBankHover(int interfaceID, int actionType, int hoverid, int spriteId1, int spriteId2, int Width, int Height, int configFrame, int configId, String Tooltip, int hoverId2, int hoverSpriteId, int hoverSpriteId2, String hoverSpriteName, int hoverId3, String hoverDisabledText, String hoverEnabledText, int X, int Y)
		{
				RSInterface hover = addTabInterface(interfaceID);
				hover.id = interfaceID;
				hover.parentId = interfaceID;
				hover.setType(5);
				hover.atActionType = actionType;
				hover.actionType = 0;
				hover.sprite1 = imageLoaderNew(spriteId1);
				hover.sprite2 = imageLoaderNew(spriteId2);
				hover.width = Width;
				hover.tooltip = Tooltip;
				hover.height = Height;
				hover.scriptCompareType = new int[1];
				hover.scriptCompareValue = new int[1];
				hover.scriptCompareType[0] = 1;
				hover.scriptCompareValue[0] = configId;
				hover.valueIndexArray = new int[1][3];
				hover.valueIndexArray[0][0] = 5;
				hover.valueIndexArray[0][1] = configFrame;
				hover.valueIndexArray[0][2] = 0;
				hover = addTabInterface(hoverid);
				hover.parentId = hoverid;
				hover.id = hoverid;
				hover.setType(0);
				hover.atActionType = 0;
				hover.width = 550;
				hover.height = 334;
				hover.isMouseoverTriggereds = true;
				addSprites(hoverId2, spriteId1, spriteId2, configId, configFrame);
				addHoverBox(hoverId3, interfaceID, hoverDisabledText, hoverEnabledText, configId, configFrame);
				setChildren(2, hover);
				setBounds(hoverId2, 15, 60, 0, hover);
				setBounds(hoverId3, X, Y, 1, hover);
		}

		public static void addActionButton(int id, int width, int height, String s)
		{
				RSInterface rsi = interfaceCache[id] = new RSInterface();
				rsi.sprite1 = imageLoaderNew(419);
				rsi.sprite2 = imageLoader("");
				rsi.tooltip = s;
				rsi.actionType = 0;
				rsi.atActionType = 1;
				rsi.width = width;
				rsi.hoverType = 52;
				rsi.parentId = id;
				rsi.id = id;
				rsi.setType(5);
				rsi.height = height;
		}

		public static void setChildren(int total, RSInterface rsinterface)
		{
				rsinterface.children = new int[total];
				rsinterface.childX = new int[total];
				rsinterface.childY = new int[total];
		}

		public static void drawTooltip(int id, String text)
		{
				RSInterface rsinterface = addTabInterface(id);
				rsinterface.parentId = id;
				rsinterface.setType(0);
				rsinterface.interfaceShown = true;
				rsinterface.isMouseoverTriggered = -1;
				addTooltipBox(id + 1, text);
				rsinterface.totalChildren(1);
				rsinterface.child(0, id + 1, 0, 0);
		}

		public static void addButton(int id, int spriteId, String tooltip)
		{
				RSInterface tab = interfaceCache[id] = new RSInterface();
				tab.id = id;
				tab.parentId = id;
				tab.setType(5);
				tab.atActionType = 1;
				tab.actionType = 0;
				tab.opacity = (byte) 0;
				tab.isMouseoverTriggered = 52;
				tab.sprite1 = imageLoaderNew(spriteId);
				tab.sprite2 = imageLoaderNew(spriteId);
				tab.width = tab.sprite1.myWidth;
				tab.height = tab.sprite2.myHeight;
				tab.tooltip = tooltip;
		}

		public static void addButton(int id, String spriteName, String tooltip, int mOver, int atAction, int width, int height)
		{
				RSInterface tab = interfaceCache[id] = new RSInterface();
				tab.id = id;
				tab.parentId = id;
				tab.atActionType = atAction;
				tab.actionType = 0;
				tab.opacity = 0;
				tab.isMouseoverTriggered = mOver;
				tab.sprite1 = imageLoader(spriteName);
				tab.sprite2 = imageLoader(spriteName);
				tab.width = width;
				tab.height = height;
				tab.tooltip = tooltip;
		}

		public String popupString;

		public static void addTooltipBox(int id, String text)
		{
				RSInterface rsi = addInterface(id);
				rsi.id = id;
				rsi.parentId = id;
				rsi.setType(8);
				rsi.popupString = text;
		}

		public static void addTooltip(int id, String text)
		{
				RSInterface rsi = addInterface(id);
				rsi.id = id;
				rsi.setType(0);
				rsi.interfaceShown = true;
				rsi.isMouseoverTriggered = -1;
				addTooltipBox(id + 1, text);
				rsi.totalChildren(1);
				rsi.child(0, id + 1, 0, 0);
		}

		public static TextDrawingArea[] fonts;

		public static TextDrawingArea[] RSFont;

		public boolean hoverHasText;

		public void children(int total)
		{
				children = new int[total];
				childX = new int[total];
				childY = new int[total];
		}

		public static void createSkillHover(int id, int type, int hoverAreaWidth, int hoverAreaHeight)
		{
				RSInterface hover = addInterface(id);
				hover.setType(type);
				hover.message = "Current EXP: 13,034,431";
				hover.width = hoverAreaWidth;
				hover.height = hoverAreaHeight;
		}

		public static void createTimedHoverBox(int id, String text, int hoverAreaWidth, int hoverAreaHeight, int hoverBoxXPosition, int hoverBoxYPosition)
		{
				RSInterface hover = addInterface(id);
				hover.setType(9);
				hover.message = text;
				hover.width = hoverAreaWidth;
				hover.height = hoverAreaHeight;
				hover.hasType9Hover = true;
				hover.type9HoverXposition = hoverBoxXPosition;
				hover.type9HoverYposition = hoverBoxYPosition;
		}

		public static void addImage(int id, int spriteId)
		{
				RSInterface image = addInterface(id);
				image.setType(5);
				image.atActionType = 0;
				image.actionType = 0;
				image.width = 100;
				image.height = 100;
				image.sprite1 = imageLoaderNew(spriteId);
		}

		public static void addSkillText(int id, boolean max, int skill)
		{
				RSInterface text = addInterface(id);
				text.id = id;
				text.parentId = id;
				text.setType(4);
				text.atActionType = 0;
				text.width = 15;
				text.height = 12;
				text.textDrawingAreas = fonts[0];
				text.textSize = 0;
				text.textShadow = true;
				text.centerText = true;
				text.textColour = 16776960;
				if (!max)
				{
						text.valueIndexArray = new int[1][];
						text.valueIndexArray[0] = new int[3];
						text.valueIndexArray[0][0] = 1;
						text.valueIndexArray[0][1] = skill;
						text.valueIndexArray[0][2] = 0;
				}
				else
				{
						text.valueIndexArray = new int[2][];
						text.valueIndexArray[0] = new int[3];
						text.valueIndexArray[0][0] = 1;
						text.valueIndexArray[0][1] = skill;
						text.valueIndexArray[0][2] = 0;
						text.valueIndexArray[1] = new int[1];
						text.valueIndexArray[1][0] = 0;
				}
				text.message = "%1";
		}

		public static void addSkillButton(int id)
		{
				RSInterface button = addInterface(id);
				button.setType(5);
				button.atActionType = 5;
				button.actionType = 0;
				button.width = 60;
				button.height = 27;
				button.sprite1 = imageLoaderNew(280);
				button.tooltip = "View";
		}

		public static void addSkillButton474(int id)
		{
				RSInterface button = addInterface(id);
				button.setType(5);
				button.atActionType = 5;
				button.actionType = 0;
				button.width = 62;
				button.height = 32;
				button.sprite1 = imageLoaderNew(650);
				button.tooltip = "View";
		}

		/**
		 * 
		 * @param i
		 * @param aT 4 to make it send server sided, 3 to be client sided button only.
		 * @param cT
		 * @param hoverid
		 * @param spriteNumber
		 * @param NAME
		 * @param W
		 * @param H
		 * @param tip
		 */
		public static void addHover(int i, int aT, int cT, int hoverid, int spriteId, int W, int H, String tip)
		{
				RSInterface rsinterfaceHover = addInterface(i);
				rsinterfaceHover.id = i;
				rsinterfaceHover.parentId = i;
				rsinterfaceHover.setType(5);
				rsinterfaceHover.atActionType = aT;
				rsinterfaceHover.actionType = cT;
				rsinterfaceHover.isMouseoverTriggered = hoverid;
				rsinterfaceHover.sprite1 = imageLoaderNew(spriteId);
				rsinterfaceHover.sprite2 = imageLoaderNew(spriteId);
				rsinterfaceHover.width = W;
				rsinterfaceHover.height = H;
				rsinterfaceHover.tooltip = tip;
		}

		public static void addHovered(int i, int spriteId, int w, int h, int IMAGEID)
		{
				RSInterface rsinterfaceHover = addInterface(i);
				rsinterfaceHover.parentId = i;
				rsinterfaceHover.id = i;
				rsinterfaceHover.setType(0);
				rsinterfaceHover.atActionType = 0;
				rsinterfaceHover.width = w;
				rsinterfaceHover.height = h;
				rsinterfaceHover.interfaceShown = true;
				rsinterfaceHover.isMouseoverTriggered = -1;
				addSprite(IMAGEID, spriteId);
				setChildren(1, rsinterfaceHover);
				setBounds(IMAGEID, 0, 0, 0, rsinterfaceHover);
		}

		public static void addPrayer(int i, int configId, int configFrame, int requiredValues, int spriteID, int spriteId2, String prayerName)
		{
				RSInterface tab = addTabInterface(i);
				tab.id = i;
				tab.parentId = 5608;
				tab.setType(5);
				tab.atActionType = 4;
				tab.actionType = 0;
				tab.opacity = 0;
				tab.isMouseoverTriggered = -1;
				tab.sprite1 = imageLoaderNew(284);
				tab.sprite2 = imageLoader("");
				tab.width = 34;
				tab.height = 34;
				tab.scriptCompareType = new int[1];
				tab.scriptCompareValue = new int[1];
				tab.scriptCompareType[0] = 1;
				tab.scriptCompareValue[0] = configId;
				tab.valueIndexArray = new int[1][3];
				tab.valueIndexArray[0][0] = 5;
				tab.valueIndexArray[0][1] = configFrame;
				tab.valueIndexArray[0][2] = 0;
				tab.tooltip = "Activate@or2@ " + prayerName;
				// tab.tooltip = "Select";
				RSInterface tab2 = addTabInterface(i + 1);
				tab2.id = i + 1;
				tab2.parentId = 5608;
				tab2.setType(5);
				tab2.atActionType = 0;
				tab2.actionType = 0;
				tab2.opacity = 0;
				tab2.isMouseoverTriggered = -1;
				tab2.sprite1 = imageLoaderNew(spriteID);
				tab2.sprite2 = imageLoaderNew(spriteId2);
				tab2.width = 34;
				tab2.height = 34;
				tab2.scriptCompareType = new int[1];
				tab2.scriptCompareValue = new int[1];
				tab2.scriptCompareType[0] = 2;
				tab2.scriptCompareValue[0] = requiredValues + 1;
				tab2.valueIndexArray = new int[1][3];
				tab2.valueIndexArray[0][0] = 2;
				tab2.valueIndexArray[0][1] = 5;
				tab2.valueIndexArray[0][2] = 0;
		}

		public static RSInterface addInterface(int id)
		{

				if (ClientConfiguration.DEBUG_INTERFACES)
				{
						interfaceIds.add(id);
				}
				RSInterface rsi = interfaceCache[id] = new RSInterface();
				rsi.id = id;
				rsi.parentId = id;
				rsi.width = 512;
				rsi.height = 334;

				return rsi;
		}

		public static RSInterface addInterface(int id, int xStart, int xEnd, int yStart, int yEnd)
		{

				if (ClientConfiguration.DEBUG_INTERFACES)
				{
						interfaceIds.add(id);
				}
				RSInterface rsi = interfaceCache[id] = new RSInterface();
				rsi.id = id;
				rsi.parentId = id;
				rsi.width = 512;
				rsi.height = 334;

				rsi.interfaceStartX = xStart;
				rsi.interfaceEndX = xEnd;
				rsi.interfaceStartY = yStart;
				rsi.interfaceEndY = yEnd;
				return rsi;
		}

		public static void addText(int id, String text, TextDrawingArea tda[], int idx, int color, boolean centered)
		{
				RSInterface rsi = interfaceCache[id] = new RSInterface();
				if (centered)
				{
						rsi.centerText = true;
				}
				rsi.textShadow = true;
				rsi.textDrawingAreas = tda[idx];
				rsi.textSize = idx;
				rsi.message = text;
				rsi.textColour = color;
				rsi.id = id;
				rsi.setType(4);
		}

		public static void textSize(int id, TextDrawingArea tda[], int idx)
		{
				RSInterface rsi = interfaceCache[id];
				rsi.textDrawingAreas = tda[idx];
				rsi.textSize = idx;
		}

		public static void addCacheSprite(int id, int sprite1, int sprite2, String sprites)
		{
				RSInterface rsi = interfaceCache[id] = new RSInterface();
				rsi.sprite1 = method207(sprite1, aClass44, sprites);
				rsi.sprite2 = method207(sprite2, aClass44, sprites);
				rsi.parentId = id;
				rsi.id = id;
				rsi.setType(5);
		}

		public static void sprite1(int id, int sprite)
		{
				RSInterface class9 = interfaceCache[id];
				class9.sprite1 = imageLoaderNew(sprite);
		}

		public static void addToggleButton(int id, int sprite, int sprite2, int setconfig, int width, int height, String s)
		{
				RSInterface rsi = addInterface(id);
				rsi.sprite1 = imageLoaderNew(sprite);
				rsi.sprite2 = imageLoaderNew(sprite2);
				rsi.scriptCompareValue = new int[1];
				rsi.scriptCompareValue[0] = 1;
				rsi.scriptCompareType = new int[1];
				rsi.scriptCompareType[0] = 1;
				rsi.valueIndexArray = new int[1][3];
				rsi.valueIndexArray[0][0] = 5;
				rsi.valueIndexArray[0][1] = setconfig;
				rsi.valueIndexArray[0][2] = 0;
				rsi.atActionType = 4;
				rsi.width = width;
				rsi.isMouseoverTriggered = -1;
				rsi.parentId = id;
				rsi.id = id;
				rsi.setType(5);
				rsi.height = height;
				rsi.tooltip = s;
		}

		public void totalChildren(int id, int x, int y)
		{
				children = new int[id];
				childX = new int[x];
				childY = new int[y];
		}

		@SuppressWarnings("unused")
		public static void removeSomething(int id)
		{
				RSInterface rsi = interfaceCache[id] = new RSInterface();
		}

		public void specialBar(int id)
		{
				addActionButton(id - 12, 150, 26, "Use @gre@Special Attack");
				for (int i = id - 11; i < id; i++)
				{
						removeSomething(i);
				}

				RSInterface rsi = interfaceCache[id - 12];
				rsi.width = 150;
				rsi.height = 26;

				rsi = interfaceCache[id];
				rsi.width = 150;
				rsi.height = 26;

				rsi.child(0, id - 12, 0, 0);

				rsi.child(12, id + 1, 3, 7);

				rsi.child(23, id + 12, 16, 8);

				for (int i = 13; i < 23; i++)
				{
						rsi.childY[i] -= 1;
				}

				rsi = interfaceCache[id + 1];
				rsi.setType(5);
				rsi.sprite1 = imageLoaderNew(422);

				for (int i = id + 2; i < id + 12; i++)
				{
						rsi = interfaceCache[i];
						rsi.setType(5);
				}

				sprite1(id + 2, 135);
				sprite1(id + 3, 136);
				sprite1(id + 4, 137);
				sprite1(id + 5, 138);
				sprite1(id + 6, 139);
				sprite1(id + 7, 140);
				sprite1(id + 8, 141);
				sprite1(id + 9, 145);
				sprite1(id + 10, 146);
				sprite1(id + 11, 396);
		}

		public static void Sidebar0a(int id, int id2, int id3, String text1, String text2, String text3, String text4, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int str4x, int str4y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, int img4x, int img4y, TextDrawingArea[] tda) // 4button spec
		{
				RSInterface rsi = addInterface(id); // 2423
				/* addText(ID, "Text", tda, Size, Colour, Centered); */
				addText(id2, "-2", tda, 3, 0xff981f, true); // 2426
				addText(id2 + 11, text1, tda, 0, 0xff981f, false);
				addText(id2 + 12, text2, tda, 0, 0xff981f, false);
				addText(id2 + 13, text3, tda, 0, 0xff981f, false);
				addText(id2 + 14, text4, tda, 0, 0xff981f, false); /* specialBar(ID); */
				rsi.specialBar(id3); // 7599
				rsi.width = 190;
				rsi.height = 261;

				int last = 15;
				int frame = 0;
				rsi.totalChildren(last, last, last);

				rsi.child(frame, id2 + 3, 21, 46);
				frame++; // 2429
				rsi.child(frame, id2 + 4, 104, 99);
				frame++; // 2430
				rsi.child(frame, id2 + 5, 21, 99);
				frame++; // 2431
				rsi.child(frame, id2 + 6, 105, 46);
				frame++; // 2432
				rsi.child(frame, id2 + 7, img1x, img1y);
				frame++; // bottomright 2433
				rsi.child(frame, id2 + 8, img2x, img2y);
				frame++; // topleft 2434
				rsi.child(frame, id2 + 9, img3x, img3y);
				frame++; // bottomleft 2435
				rsi.child(frame, id2 + 10, img4x, img4y);
				frame++; // topright 2436
				rsi.child(frame, id2 + 11, str1x, str1y);
				frame++; // chop 2437
				rsi.child(frame, id2 + 12, str2x, str2y);
				frame++; // slash 2438
				rsi.child(frame, id2 + 13, str3x, str3y);
				frame++; // lunge 2439
				rsi.child(frame, id2 + 14, str4x, str4y);
				frame++; // block 2440
				rsi.child(frame, 19300, 0, 0);
				frame++; // stuffs
				rsi.child(frame, id2, 94, 4);
				frame++; // weapon 2426
				rsi.child(frame, id3, 21, 205);
				frame++; // special attack 7599
				for (int i = id2 + 3; i < id2 + 7; i++)
				{ // 2429 - 2433
						rsi = interfaceCache[i];
						rsi.sprite1 = imageLoaderNew(420);
						rsi.sprite2 = imageLoaderNew(421);
						rsi.width = 68;
						rsi.height = 44;
				}
		}

		public static void Sidebar0b(int id, int id2, String text1, String text2, String text3, String text4, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int str4x, int str4y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, int img4x, int img4y, TextDrawingArea[] tda) // 4button nospec
		{
				RSInterface rsi = addInterface(id); // 2423
				/* addText(ID, "Text", tda, Size, Colour, Centered); */
				addText(id2, "-2", tda, 3, 0xff981f, true); // 2426
				addText(id2 + 11, text1, tda, 0, 0xff981f, false);
				addText(id2 + 12, text2, tda, 0, 0xff981f, false);
				addText(id2 + 13, text3, tda, 0, 0xff981f, false);
				addText(id2 + 14, text4, tda, 0, 0xff981f, false);

				rsi.width = 190;
				rsi.height = 261;

				int last = 14;
				int frame = 0;
				rsi.totalChildren(last, last, last);

				rsi.child(frame, id2 + 3, 21, 46);
				frame++; // 2429
				rsi.child(frame, id2 + 4, 104, 99);
				frame++; // 2430
				rsi.child(frame, id2 + 5, 21, 99);
				frame++; // 2431
				rsi.child(frame, id2 + 6, 105, 46);
				frame++; // 2432
				rsi.child(frame, id2 + 7, img1x, img1y);
				frame++; // bottomright 2433
				rsi.child(frame, id2 + 8, img2x, img2y);
				frame++; // topleft 2434
				rsi.child(frame, id2 + 9, img3x, img3y);
				frame++; // bottomleft 2435
				rsi.child(frame, id2 + 10, img4x, img4y);
				frame++; // topright 2436
				rsi.child(frame, id2 + 11, str1x, str1y);
				frame++; // chop 2437
				rsi.child(frame, id2 + 12, str2x, str2y);
				frame++; // slash 2438
				rsi.child(frame, id2 + 13, str3x, str3y);
				frame++; // lunge 2439
				rsi.child(frame, id2 + 14, str4x, str4y);
				frame++; // block 2440
				rsi.child(frame, 19300, 0, 0);
				frame++; // stuffs
				rsi.child(frame, id2, 94, 4);
				frame++; // weapon 2426
				for (int i = id2 + 3; i < id2 + 7; i++)
				{ // 2429 - 2433
						rsi = interfaceCache[i];
						rsi.sprite1 = imageLoaderNew(420);
						rsi.sprite2 = imageLoaderNew(421);
						rsi.width = 68;
						rsi.height = 44;
				}
		}

		public static void Sidebar0c(int id, int id2, int id3, String text1, String text2, String text3, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, TextDrawingArea[] tda) // 3button
		// spec
		{
				RSInterface rsi = addInterface(id); // 2423
				/* addText(ID, "Text", tda, Size, Colour, Centered); */
				addText(id2, "-2", tda, 3, 0xff981f, true); // 2426
				addText(id2 + 9, text1, tda, 0, 0xff981f, false);
				addText(id2 + 10, text2, tda, 0, 0xff981f, false);
				addText(id2 + 11, text3, tda, 0, 0xff981f, false); /* specialBar(ID); */
				rsi.specialBar(id3); // 7599
				rsi.width = 190;
				rsi.height = 261;

				int last = 12;
				int frame = 0;
				rsi.totalChildren(last, last, last);

				rsi.child(frame, id2 + 3, 21, 99);
				frame++;
				rsi.child(frame, id2 + 4, 105, 46);
				frame++;
				rsi.child(frame, id2 + 5, 21, 46);
				frame++;

				rsi.child(frame, id2 + 6, img1x, img1y);
				frame++; // topleft
				rsi.child(frame, id2 + 7, img2x, img2y);
				frame++; // bottomleft
				rsi.child(frame, id2 + 8, img3x, img3y);
				frame++; // topright
				rsi.child(frame, id2 + 9, str1x, str1y);
				frame++; // chop
				rsi.child(frame, id2 + 10, str2x, str2y);
				frame++; // slash
				rsi.child(frame, id2 + 11, str3x, str3y);
				frame++; // lunge
				rsi.child(frame, 19300, 0, 0);
				frame++; // stuffs
				rsi.child(frame, id2, 94, 4);
				frame++; // weapon
				rsi.child(frame, id3, 21, 205);
				frame++; // special attack 7599
				for (int i = id2 + 3; i < id2 + 6; i++)
				{
						rsi = interfaceCache[i];
						rsi.sprite1 = imageLoaderNew(420);
						rsi.sprite2 = imageLoaderNew(421);
						rsi.width = 68;
						rsi.height = 44;
				}
		}

		public static void Sidebar0d(int id, int id2, String text1, String text2, String text3, int str1x, int str1y, int str2x, int str2y, int str3x, int str3y, int img1x, int img1y, int img2x, int img2y, int img3x, int img3y, TextDrawingArea[] tda) // 3button nospec
		// (magic intf)
		{
				RSInterface rsi = addInterface(id); // 2423
				addText(id2, "-2", tda, 3, 0xff981f, true); // 2426
				addText(id2 + 9, text1, tda, 0, 0xff981f, false);
				addText(id2 + 10, text2, tda, 0, 0xff981f, false);
				addText(id2 + 11, text3, tda, 0, 0xff981f, false);

				removeSomething(353);
				addText(354, "Spell", tda, 0, 0xff981f, false); // This is used for the autocast old fashioned way on rs
				addCacheSprite(337, 19, 0, "combaticons");
				addCacheSprite(338, 13, 0, "combaticons2");
				addCacheSprite(339, 14, 0, "combaticons2");
				removeSomething(349);
				addToggleButton(350, 417, 418, 108, 68, 44, "Autocast Spell");

				rsi.width = 190;
				rsi.height = 261;

				int last = 15;
				int frame = 0;
				rsi.totalChildren(last, last, last);

				rsi.child(frame, id2 + 3, 20, 115);
				frame++;
				rsi.child(frame, id2 + 4, 20, 80);
				frame++;
				rsi.child(frame, id2 + 5, 20, 45);
				frame++;

				rsi.child(frame, id2 + 6, img1x, img1y);
				frame++; // topleft
				rsi.child(frame, id2 + 7, img2x, img2y);
				frame++; // bottomleft
				rsi.child(frame, id2 + 8, img3x, img3y);
				frame++; // topright
				rsi.child(frame, id2 + 9, str1x, str1y);
				frame++; // bash
				rsi.child(frame, id2 + 10, str2x, str2y);
				frame++; // pound
				rsi.child(frame, id2 + 11, str3x, str3y);
				frame++; // focus
				rsi.child(frame, 349, 105, 46);
				frame++; // spell1
				rsi.child(frame, 350, 104, 106);
				frame++; // spell2
				rsi.child(frame, 353, 125, 74);
				frame++; // spell
				rsi.child(frame, 354, 125, 134);
				frame++; // spell
				rsi.child(frame, 19300, 0, 0);
				frame++; // stuffs
				rsi.child(frame, id2, 94, 4);
				frame++; // weapon
		}

		public static void itemGroup(int id, int w, int h, int x, int y)
		{
				RSInterface rsi = addInterface(id);
				rsi.width = w;
				rsi.height = h;
				rsi.inv = new int[w * h];
				rsi.invStackSizes = new int[w * h];
				rsi.usableItemInterface = false;
				rsi.isInventoryInterface = false;
				rsi.invSpritePadX = x;
				rsi.invSpritePadY = y;
				rsi.spritesX = new int[20];
				rsi.spritesY = new int[20];
				rsi.sprites = new Sprite[20];
				rsi.type = 2;
		}

		public static void addToItemGroup(int interfaceId, int itemId, int w, int h, int x, int y, boolean actions, String action1, String action2, String action3)
		{
				RSInterface rsi = addInterface(interfaceId);
				boolean stackable = (itemId == 13879 || itemId == 13883 || itemId == 9244) ? true : false;
				boolean showItem = itemId == 0 ? false : true;
				if (!showItem)
				{
						return;
				}


				itemId = itemId + 1;
				rsi.width = w;
				rsi.height = h;
				rsi.inv = new int[w * h];
				rsi.inv[0] = itemId;
				rsi.invStackSizes = new int[w * h];
				if (stackable)
				{
						rsi.removeStackableNumber = true;
				}
				rsi.invStackSizes[0] = 1;
				rsi.usableItemInterface = false;
				rsi.isInventoryInterface = false;
				rsi.invSpritePadX = x;
				rsi.invSpritePadY = y;
				rsi.spritesX = new int[20];
				rsi.spritesY = new int[20];
				rsi.sprites = new Sprite[20];
				rsi.type = 2;
		}

		public static void addText(int interfaceId, String text, int colour, boolean center, boolean shadow, int isMouseoverTriggered, TextDrawingArea[] TDA, int textSize)
		{
				RSInterface RSInterface = addInterface(interfaceId);
				RSInterface.parentId = interfaceId;
				RSInterface.id = interfaceId;
				RSInterface.setType(4);
				RSInterface.atActionType = 0;
				RSInterface.width = 0;
				RSInterface.height = 0;
				RSInterface.actionType = 0;
				RSInterface.opacity = 0;
				RSInterface.isMouseoverTriggered = isMouseoverTriggered;
				RSInterface.centerText = center;
				RSInterface.textShadow = shadow;
				RSInterface.textDrawingAreas = TDA[textSize];
				RSInterface.textSize = textSize;
				RSInterface.message = text;
				RSInterface.messageEnabled = "";
				RSInterface.textColour = colour;
		}

		public String hoverText;

		public boolean hoverScrollBar;

		public static void addHoverBox(int id, int ParentID, String text, String text2, int configId, int configFrame)
		{
				RSInterface rsi = addTabInterface(id);
				rsi.id = id;
				rsi.parentId = ParentID;
				rsi.setType(8);
				rsi.messageEnabled = text;
				rsi.message = text2;
				rsi.scriptCompareType = new int[1];
				rsi.scriptCompareValue = new int[1];
				rsi.scriptCompareType[0] = 1;
				rsi.scriptCompareValue[0] = configId;
				rsi.valueIndexArray = new int[1][3];
				rsi.valueIndexArray[0][0] = 5;
				rsi.valueIndexArray[0][1] = configFrame;
				rsi.valueIndexArray[0][2] = 0;
		}

		public static void setSpriteClicked(int id, int spriteClickedId)
		{
				interfaceCache[id].spriteClicked = imageLoaderNew(spriteClickedId);
		}

		public static void hoverHasText(int id)
		{
				interfaceCache[id].hoverHasText = true;
		}

		public static void addText(int id, String text, TextDrawingArea tda[], int textSize, int color, boolean center, boolean shadow)
		{
				RSInterface tab = addTabInterface(id);
				tab.parentId = id;
				tab.id = id;
				tab.setType(4);
				tab.atActionType = 0;
				tab.width = 0;
				tab.height = 11;
				tab.actionType = 0;
				tab.opacity = 0;
				tab.isMouseoverTriggered = -1;
				tab.centerText = center;
				tab.textShadow = shadow;
				tab.textDrawingAreas = tda[textSize];
				tab.textSize = textSize;
				tab.message = text;
				tab.messageEnabled = "";
				tab.textColour = color;
				tab.colourEnabled = 0;
				tab.hoverColorDisabled = 0;
				tab.hoverColorEnabled = 0;
		}

		public static void addText(int id, String text, TextDrawingArea tda[], int idx, int color, boolean center, boolean shadow, int hoverColour, String tooltip, int widthHover)
		{
				RSInterface tab = addTabInterface(id);
				tab.parentId = id;
				tab.id = id;
				tab.tooltip = tooltip;
				tab.setType(4);
				tab.atActionType = 4;
				tab.width = widthHover;
				tab.height = 15;
				tab.actionType = 0;
				tab.opacity = 0;
				tab.isMouseoverTriggered = -1;
				tab.centerText = center;
				tab.textShadow = shadow;
				tab.textDrawingAreas = tda[idx];
				tab.textSize = idx;
				tab.message = text;
				tab.messageEnabled = "";
				tab.textColour = color;
				tab.colourEnabled = 0;
				tab.hoverColorDisabled = hoverColour;
				tab.hoverColorEnabled = 0;
		}

		public static void addButton(int id, int spriteId, String tooltip, int w, int h)
		{
				RSInterface tab = interfaceCache[id] = new RSInterface();
				tab.id = id;
				tab.parentId = id;
				tab.setType(5);
				tab.atActionType = 1;
				tab.actionType = 0;
				tab.opacity = (byte) 0;
				tab.isMouseoverTriggered = 52;
				tab.sprite1 = imageLoaderNew(spriteId);
				tab.sprite2 = imageLoaderNew(spriteId);
				tab.width = w;
				tab.height = h;
				tab.tooltip = tooltip;
		}

		public static void addButtonMulti(int id, int spriteId, String[] tooltip, int w, int h)
		{
				RSInterface tab = interfaceCache[id] = new RSInterface();
				tab.id = id;
				tab.parentId = id;
				tab.setType(5);
				tab.atActionType = 1;
				tab.actionType = 0;
				tab.opacity = (byte) 0;
				tab.isMouseoverTriggered = 52;
				tab.sprite1 = imageLoaderNew(spriteId);
				tab.sprite2 = imageLoaderNew(spriteId);
				tab.width = w;
				tab.height = h;
				tab.tooltips = tooltip;
		}

		public static void addConfigButton(int ID, int pID, int spriteId1, int spriteId2, int width, int height, String tT, int configID, int aT, int configFrame)
		{
				RSInterface Tab = addTabInterface(ID);
				Tab.parentId = pID;
				Tab.id = ID;
				Tab.setType(5);
				Tab.atActionType = aT;
				Tab.actionType = 0;
				Tab.width = width;
				Tab.height = height;
				Tab.opacity = 0;
				Tab.isMouseoverTriggered = -1;
				Tab.scriptCompareType = new int[1];
				Tab.scriptCompareValue = new int[1];
				Tab.scriptCompareType[0] = 1;
				Tab.scriptCompareValue[0] = configID;
				Tab.valueIndexArray = new int[1][3];
				Tab.valueIndexArray[0][0] = 5;
				Tab.valueIndexArray[0][1] = configFrame;
				Tab.valueIndexArray[0][2] = 0;
				Tab.sprite1 = imageLoaderNew(spriteId1);
				Tab.sprite2 = imageLoaderNew(spriteId2);
				Tab.tooltip = tT;
		}

		public static void addSpriteOld(int id, String s)
		{
				RSInterface tab = interfaceCache[id] = new RSInterface();
				tab.id = id;
				tab.parentId = id;
				tab.setType(5);
				tab.atActionType = 0;
				tab.actionType = 0;
				tab.opacity = (byte) 0;
				tab.isMouseoverTriggered = 52;
				tab.sprite1 = imageLoader(s);
				tab.sprite2 = imageLoader(s);
				tab.width = 512;
				tab.height = 334;
		}

		public static void addSprite(int id, int spriteId)
		{
				RSInterface tab = interfaceCache[id] = new RSInterface();
				tab.id = id;
				tab.parentId = id;
				tab.setType(5);
				tab.atActionType = 0;
				tab.actionType = 0;
				tab.opacity = (byte) 0;
				tab.isMouseoverTriggered = 52;
				tab.sprite1 = imageLoaderNew(spriteId);
				tab.sprite2 = imageLoaderNew(spriteId);
				tab.width = 1;
				tab.height = 1;
		}

		public static void addSprites(int ID, int spriteId1, int spriteId2, int configId, int configFrame)
		{
				RSInterface tab = addTabInterface(ID);
				tab.id = ID;
				tab.parentId = ID;
				tab.setType(5);
				tab.atActionType = 0;
				tab.actionType = 0;
				tab.width = 1;
				tab.height = 1;
				tab.scriptCompareType = new int[1];
				tab.scriptCompareValue = new int[1];
				tab.scriptCompareType[0] = 1;
				tab.scriptCompareValue[0] = configId;
				tab.valueIndexArray = new int[1][3];
				tab.valueIndexArray[0][0] = 5;
				tab.valueIndexArray[0][1] = configFrame;
				tab.valueIndexArray[0][2] = 0;
				tab.sprite1 = imageLoaderNew(spriteId1);
				tab.sprite2 = imageLoaderNew(spriteId2);
		}

		public static void addHoverButton(int i, int spriteId, int width, int height, String text, int contentType, int hoverOver, int aT)
		{ // hoverable button
				RSInterface tab = addTabInterface(i);
				tab.id = i;
				tab.parentId = i;
				tab.setType(5);
				tab.atActionType = aT;
				tab.actionType = contentType;
				tab.opacity = 0;
				tab.isMouseoverTriggered = hoverOver;
				tab.sprite1 = imageLoaderNew(spriteId);
				tab.sprite2 = imageLoaderNew(spriteId);
				tab.width = width;
				tab.height = height;
				tab.tooltip = text;
		}

		public static void addHoveredButton(int i, int spriteId, int w, int h, int IMAGEID)
		{ // hoverable button
				RSInterface tab = addTabInterface(i);
				tab.parentId = i;
				tab.id = i;
				tab.setType(0);
				tab.atActionType = 0;
				tab.width = w;
				tab.height = h;
				tab.interfaceShown = true;
				tab.opacity = 0;
				tab.isMouseoverTriggered = -1;
				tab.scrollMax = 0;
				addHoverImage(IMAGEID, spriteId);
				tab.totalChildren(1);
				tab.child(0, IMAGEID, 0, 0);
		}

		public static void addHoverImage(int i, int spriteId)
		{
				RSInterface tab = addTabInterface(i);
				tab.id = i;
				tab.parentId = i;
				tab.setType(5);
				tab.atActionType = 0;
				tab.actionType = 0;
				tab.width = 512;
				tab.hoverScrollBar = true;
				tab.height = 334;
				tab.opacity = 0;
				tab.isMouseoverTriggered = 52;
				tab.sprite1 = imageLoaderNew(spriteId);
				tab.sprite2 = imageLoaderNew(spriteId);
		}

		public static RSInterface addTabInterface(int id)
		{
				RSInterface tab = interfaceCache[id] = new RSInterface();
				tab.id = id; // 250
				tab.parentId = id; // 236
				tab.setType(0); // 262
				tab.atActionType = 0; // 217
				tab.actionType = 0;
				tab.width = 512; // 220
				tab.height = 700; // 267
				tab.opacity = (byte) 0;
				tab.isMouseoverTriggered = -1; // Int 230
				return tab;
		}

		public static RSInterface addTabInterface(int id, int xStart, int xEnd, int yStart, int yEnd)
		{
				RSInterface tab = interfaceCache[id] = new RSInterface();
				tab.id = id; // 250
				tab.parentId = id; // 236
				tab.setType(0); // 262
				tab.atActionType = 0; // 217
				tab.actionType = 0;
				tab.width = 512; // 220
				tab.height = 700; // 267
				tab.opacity = (byte) 0;
				tab.isMouseoverTriggered = -1; // Int 230

				tab.interfaceStartX = xStart;
				tab.interfaceEndX = xEnd;
				tab.interfaceStartY = yStart;
				tab.interfaceEndY = yEnd;
				return tab;
		}

		private static Sprite imageLoader(String spriteName)
		{
				long l = (TextClass.method585(spriteName) << 8);
				Sprite sprite = (Sprite) aMRUNodes_238.insertFromCache(l);
				if (sprite != null)
				{
						return sprite;
				}
				try
				{
						sprite = new Sprite(spriteName);
						aMRUNodes_238.removeFromCache(sprite, l);
				}
				catch (Exception exception)
				{
						return null;
				}
				return sprite;
		}

		public static void textClicked(int interfaceId, int spriteId, int xOffset, int yOffset)
		{
				interfaceCache[interfaceId].textSpriteClicked = imageLoaderNew(spriteId);
				interfaceCache[interfaceId].textClickedX = xOffset;
				interfaceCache[interfaceId].textClickedY = yOffset;

		}

		private static Sprite imageLoaderNew(int spriteId)
		{
				Sprite sprite;
				try
				{
						if (spriteId == -1)
						{
								return sprite = null;
						}
						sprite = Client.cacheSprite[spriteId];
				}
				catch (Exception exception)
				{
						return null;
				}
				return sprite;
		}

		/**
		 *
		 * @param childNumber
		 *            The number of child there is, in order, starting from 0, 1, 2
		 *            etc..
		 * @param interfaceID
		 *            Interface identity
		 * @param x
		 *            x-axis coord
		 * @param y
		 *            x-axis coord
		 */
		public void child(int childNumber, int interfaceID, int x, int y)
		{

				if (ClientConfiguration.DEBUG_INTERFACES)
				{
						interfaceIds.add(interfaceID);
				}
				children[childNumber] = interfaceID;
				childX[childNumber] = x;
				childY[childNumber] = y;
		}

		/**
		 *
		 * @param t
		 *            The total amount of child there is. 1 is for 1 child.
		 */
		public void totalChildren(int t)
		{
				children = new int[t];
				childX = new int[t];
				childY = new int[t];
		}

		private Model method206(int i, int j)
		{
				Model model = (Model) aMRUNodes_264.insertFromCache((i << 16) + j);
				if (model != null)
						return model;
				if (i == 1)
						model = Model.getModel(j);
				if (i == 2)
						model = EntityDefinition.forId(j).getHead();
				if (i == 3)
						model = Client.myPlayer.method453();
				if (i == 4)
						model = ItemDefinition.forId(j).getInterfaceModel(50);
				if (i == 5)
						model = null;
				if (model != null)
						aMRUNodes_264.removeFromCache(model, (i << 16) + j);
				return model;
		}

		private static Sprite method207(int i, StreamLoader streamLoader, String s)
		{
				long l = (TextClass.method585(s) << 8) + (long) i;
				Sprite sprite = (Sprite) aMRUNodes_238.insertFromCache(l);
				if (sprite != null)
						return sprite;
				try
				{
						sprite = new Sprite(streamLoader, s, i);
						aMRUNodes_238.removeFromCache(sprite, l);
				}
				catch (Exception _ex)
				{
						return null;
				}
				return sprite;
		}

		public static void method208(boolean flag, Model model)
		{
				int i = 0; // was parameter
				int j = 5; // was parameter
				if (flag)
						return;
				aMRUNodes_264.unlinkAll();
				if (model != null && j != 4)
						aMRUNodes_264.removeFromCache(model, (j << 16) + i);
		}

		public Model method209(int j, int k, boolean flag)
		{
				Model model;
				if (flag)
						model = method206(modelTypeEnabled, modelEnabled);
				else
						model = method206(modelTypeDisabled, mediaID);
				if (model == null)
						return null;
				if (k == -1 && j == -1 && model.currentModelColors == null)
						return model;
				Model model_1 = new Model(true, SequenceFrame.isNegativeZero(k) & SequenceFrame.isNegativeZero(j), false, model);
				if (k != -1 || j != -1)
						model_1.method469();
				if (k != -1)
						model_1.method470(k);
				if (j != -1)
						model_1.method470(j);
				model_1.method479(64, 768, -50, -10, -50, true);
				return model_1;
		}

		public RSInterface()
		{
		}

		public static StreamLoader aClass44;

		public boolean drawsTransparent;

		public Sprite sprite1;

		/**
		 * The clicked version sprite.
		 */
		public Sprite spriteClicked;

		/**
		 * True to set the id to be clicked.
		 */
		public boolean isClicked;

		/**
		 * The clicked version sprite.
		 */
		public Sprite textSpriteClicked;

		/**
		 * True to set the id to be clicked.
		 */
		public boolean textIsClicked;

		public int textClickedX;

		public int textClickedY;

		public int sequenceCycle;

		public Sprite sprites[];

		public static RSInterface interfaceCache[];

		public int scriptCompareValue[];

		public int actionType; // anInt214

		public int spritesX[];

		public int hoverColorDisabled;

		public int atActionType;

		public int interfaceStartX;

		public int interfaceStartY;

		public int interfaceEndX;

		public int interfaceEndY;

		public String spellName;

		public int colourEnabled;

		public int width;

		public String tooltip;

		public String[] tooltips;

		public String selectedActionName;

		public boolean centerText;

		public int scrollPosition;

		public String actions[];

		public int valueIndexArray[][];

		public boolean isFilled;

		public String messageEnabled;

		public int isMouseoverTriggered;

		public boolean isMouseoverTriggereds;

		public int invSpritePadX;

		public int textColour;

		public int modelTypeDisabled;

		public int mediaID;

		public boolean itemsAreSwappable;

		public int parentId;

		public int spellUsableOn;

		private static MRUNodes aMRUNodes_238;

		public int hoverColorEnabled;

		public int children[];

		public int childX[];

		public boolean usableItemInterface;

		public TextDrawingArea textDrawingAreas;

		public int invSpritePadY;

		public int scriptCompareType[];

		public int sequenceFrame;

		public int spritesY[];

		public String message = "";

		public boolean isInventoryInterface;

		public int id;

		public int textSize;

		public int toolTipSpecialX;

		public int toolTipSpecialY;

		public int invStackSizes[];

		public boolean removeStackableNumber;

		public int inv[];

		public byte opacity;

		private int modelTypeEnabled;

		private int modelEnabled;

		public int sequenceDisabled;

		public int sequenceEnabled;

		public boolean itemsAreDraggable;

		public Sprite sprite2;

		public int scrollMax;

		private int type;

		public int hoverType;

		public int offsetX;

		private static final MRUNodes aMRUNodes_264 = new MRUNodes(30);

		public int offsetY;

		public boolean interfaceShown;

		public int height;

		public boolean textShadow;

		public int modelZoom;

		public int modelRotationY;

		public int modelRotationX;

		public int childY[];

		public boolean hasType9Hover;

		public int type9HoverXposition;

		public int type9HoverYposition;

		public static void addChar(int ID)
		{
				RSInterface t = interfaceCache[ID] = new RSInterface();
				t.id = ID;
				t.parentId = ID;
				t.setType(6);
				t.atActionType = 0;
				t.actionType = 328;
				t.width = 180;
				t.height = 190;
				t.modelZoom = 560;
				t.modelRotationY = 30;
				t.modelRotationX = 0;
				t.sequenceDisabled = -1;
				t.sequenceEnabled = -1;
		}

		private static Sprite LoadLunarSprite(String s)
		{
				Sprite sprite = imageLoader(s);
				return sprite;
		}

		public static void addLunarSprite(int i, String name)
		{
				RSInterface RSInterface = addInterface(i);
				RSInterface.id = i;
				RSInterface.parentId = i;
				RSInterface.setType(5);
				RSInterface.atActionType = 5;
				RSInterface.actionType = 0;
				RSInterface.opacity = 0;
				RSInterface.isMouseoverTriggered = 52;
				RSInterface.sprite1 = LoadLunarSprite(name);
				RSInterface.width = 500;
				RSInterface.height = 500;
				RSInterface.tooltip = "";
		}

		public static void drawRune(int i, int spriteId, String runeName)
		{
				RSInterface RSInterface = addInterface(i);
				RSInterface.setType(5);
				RSInterface.atActionType = 0;
				RSInterface.actionType = 0;
				RSInterface.opacity = 0;
				RSInterface.isMouseoverTriggered = 52;
				RSInterface.sprite1 = LoadLunarSprite("/Lunar/RUNE " + spriteId);
				RSInterface.width = 500;
				RSInterface.height = 500;
		}

		public static void addRuneText(int ID, int runeAmount, int RuneID, TextDrawingArea[] font)
		{
				RSInterface rsInterface = addInterface(ID);
				rsInterface.id = ID;
				rsInterface.parentId = 1151;
				rsInterface.setType(4);
				rsInterface.atActionType = 0;
				rsInterface.actionType = 0;
				rsInterface.width = 0;
				rsInterface.height = 14;
				rsInterface.opacity = 0;
				rsInterface.isMouseoverTriggered = -1;
				rsInterface.scriptCompareType = new int[1];
				rsInterface.scriptCompareValue = new int[1];
				rsInterface.scriptCompareType[0] = 3;
				rsInterface.scriptCompareValue[0] = runeAmount;
				rsInterface.valueIndexArray = new int[1][4];
				rsInterface.valueIndexArray[0][0] = 4;
				rsInterface.valueIndexArray[0][1] = 3214;
				rsInterface.valueIndexArray[0][2] = RuneID;
				rsInterface.valueIndexArray[0][3] = 0;
				rsInterface.centerText = true;
				rsInterface.textDrawingAreas = font[0];
				// rsInterface.textShadowed = true;
				rsInterface.message = "%1/" + runeAmount + "";
				rsInterface.popupString = "";
				// rsInterface.disabledColour = 12582912;
				// rsInterface.enabledColour = 49152;
		}

		public static void homeTeleport()
		{
				RSInterface RSInterface = addInterface(30000);
				RSInterface.tooltip = "Cast @gre@Lunar Home Teleport";
				RSInterface.id = 30000;
				RSInterface.parentId = 30000;
				RSInterface.setType(5);
				RSInterface.atActionType = 5;
				RSInterface.actionType = 0;
				RSInterface.opacity = 0;
				RSInterface.isMouseoverTriggered = 30001;
				RSInterface.sprite1 = imageLoaderNew(Client.clientRevision("474") || Client.clientRevision("525") ? 651 : 165);
				RSInterface.width = 20;
				RSInterface.height = 20;
				RSInterface Int = addInterface(30001);
				Int.interfaceShown = true;
				Int.totalChildren(1);
				addLunarSprite(30002, "/Lunar/SPRITE 0");
				setBounds(30002, 0, 0, 0, Int);
		}

		public static void addLunar2RunesSmallBox(int ID, int r1, int r2, int ra1, int ra2, int rune1, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type)
		{
				RSInterface rsInterface = addInterface(ID);
				rsInterface.id = ID;
				rsInterface.parentId = 1151;
				rsInterface.setType(5);
				rsInterface.atActionType = type;
				rsInterface.actionType = 0;
				rsInterface.isMouseoverTriggered = ID + 1;
				rsInterface.selectedActionName = "Cast On";
				rsInterface.width = 20;
				rsInterface.height = 20;
				rsInterface.tooltip = "Cast @gre@" + name;
				rsInterface.spellName = name;
				rsInterface.scriptCompareType = new int[3];
				rsInterface.scriptCompareValue = new int[3];
				rsInterface.scriptCompareType[0] = 3;
				rsInterface.scriptCompareValue[0] = ra1;
				rsInterface.scriptCompareType[1] = 3;
				rsInterface.scriptCompareValue[1] = ra2;
				rsInterface.scriptCompareType[2] = 3;
				rsInterface.scriptCompareValue[2] = lvl;
				rsInterface.valueIndexArray = new int[3][];
				rsInterface.valueIndexArray[0] = new int[4];
				rsInterface.valueIndexArray[0][0] = 4;
				rsInterface.valueIndexArray[0][1] = 3214;
				rsInterface.valueIndexArray[0][2] = r1;
				rsInterface.valueIndexArray[0][3] = 0;
				rsInterface.valueIndexArray[1] = new int[4];
				rsInterface.valueIndexArray[1][0] = 4;
				rsInterface.valueIndexArray[1][1] = 3214;
				rsInterface.valueIndexArray[1][2] = r2;
				rsInterface.valueIndexArray[1][3] = 0;
				rsInterface.valueIndexArray[2] = new int[3];
				rsInterface.valueIndexArray[2][0] = 1;
				rsInterface.valueIndexArray[2][1] = 6;
				rsInterface.valueIndexArray[2][2] = 0;
				rsInterface.sprite2 = LoadLunarSprite("/Lunar/LUNARON " + sid);
				rsInterface.sprite1 = LoadLunarSprite1((468 + sid + (Client.clientRevision("474") || Client.clientRevision("525") ? 186 : 0)));
				boolean isUsed = false;
				for (int index = 0; index < usedVengeanceInterfaceSprites.length; index++)
				{
						if (sid == usedVengeanceInterfaceSprites[index])
						{
								isUsed = true;
								break;
						}
				}
				if (!isUsed)
				{
						rsInterface.sprite2 = rsInterface.sprite1;
				}
				RSInterface INT = addInterface(ID + 1);
				INT.interfaceShown = true;
				INT.totalChildren(7);
				addLunarSprite(ID + 2, "/Lunar/BOX 0");
				setBounds(ID + 2, 0, 0, 0, INT);
				addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
				setBounds(ID + 3, 90, 4, 1, INT);
				addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
				setBounds(ID + 4, 90, 19, 2, INT);
				setBounds(30016, 37, 35, 3, INT);
				setBounds(rune1, 112, 35, 4, INT);
				addRuneText(ID + 5, ra1 + 1, r1, TDA);
				setBounds(ID + 5, 50, 66, 5, INT);
				addRuneText(ID + 6, ra2 + 1, r2, TDA);
				setBounds(ID + 6, 123, 66, 6, INT);

		}

		private static Sprite LoadLunarSprite1(int spriteId)
		{
				Sprite sprite = imageLoaderNew(spriteId);
				return sprite;
		}

		private final static int[] usedVengeanceInterfaceSprites = {35, 36};

		public static void addLunar3RunesSmallBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1, int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type)
		{
				RSInterface rsInterface = addInterface(ID);
				rsInterface.id = ID;
				rsInterface.parentId = 1151;
				rsInterface.setType(5);
				rsInterface.atActionType = type;
				rsInterface.actionType = 0;
				rsInterface.isMouseoverTriggered = ID + 1;
				rsInterface.selectedActionName = "Cast on";
				rsInterface.width = 20;
				rsInterface.height = 20;
				rsInterface.tooltip = "Cast @gre@" + name;
				rsInterface.spellName = name;
				rsInterface.scriptCompareType = new int[4];
				rsInterface.scriptCompareValue = new int[4];
				rsInterface.scriptCompareType[0] = 3;
				rsInterface.scriptCompareValue[0] = ra1;
				rsInterface.scriptCompareType[1] = 3;
				rsInterface.scriptCompareValue[1] = ra2;
				rsInterface.scriptCompareType[2] = 3;
				rsInterface.scriptCompareValue[2] = ra3;
				rsInterface.scriptCompareType[3] = 3;
				rsInterface.scriptCompareValue[3] = lvl;
				rsInterface.valueIndexArray = new int[4][];
				rsInterface.valueIndexArray[0] = new int[4];
				rsInterface.valueIndexArray[0][0] = 4;
				rsInterface.valueIndexArray[0][1] = 3214;
				rsInterface.valueIndexArray[0][2] = r1;
				rsInterface.valueIndexArray[0][3] = 0;
				rsInterface.valueIndexArray[1] = new int[4];
				rsInterface.valueIndexArray[1][0] = 4;
				rsInterface.valueIndexArray[1][1] = 3214;
				rsInterface.valueIndexArray[1][2] = r2;
				rsInterface.valueIndexArray[1][3] = 0;
				rsInterface.valueIndexArray[2] = new int[4];
				rsInterface.valueIndexArray[2][0] = 4;
				rsInterface.valueIndexArray[2][1] = 3214;
				rsInterface.valueIndexArray[2][2] = r3;
				rsInterface.valueIndexArray[2][3] = 0;
				rsInterface.valueIndexArray[3] = new int[3];
				rsInterface.valueIndexArray[3][0] = 1;
				rsInterface.valueIndexArray[3][1] = 6;
				rsInterface.valueIndexArray[3][2] = 0;
				rsInterface.sprite2 = sid == 36 ? imageLoaderNew(Client.clientRevision("474") || Client.clientRevision("525") ? 694 : 561) : LoadLunarSprite("/Lunar/LUNARON " + sid);
				rsInterface.sprite1 = LoadLunarSprite1((468 + sid + (Client.clientRevision("474") || Client.clientRevision("525") ? 186 : 0)));
				boolean isUsed = false;
				for (int index = 0; index < usedVengeanceInterfaceSprites.length; index++)
				{
						if (sid == usedVengeanceInterfaceSprites[index])
						{
								isUsed = true;
								break;
						}
				}
				if (!isUsed)
				{
						rsInterface.sprite2 = rsInterface.sprite1;
				}
				RSInterface INT = addInterface(ID + 1);
				INT.interfaceShown = true;
				INT.totalChildren(9);
				addLunarSprite(ID + 2, "/Lunar/BOX 0");
				setBounds(ID + 2, 0, 0, 0, INT);
				addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
				setBounds(ID + 3, 90, 4, 1, INT);
				addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
				setBounds(ID + 4, 90, 19, 2, INT);
				setBounds(30016, 14, 35, 3, INT);
				setBounds(rune1, 74, 35, 4, INT);
				setBounds(rune2, 130, 35, 5, INT);
				addRuneText(ID + 5, ra1 + 1, r1, TDA);
				setBounds(ID + 5, 26, 66, 6, INT);
				addRuneText(ID + 6, ra2 + 1, r2, TDA);
				setBounds(ID + 6, 87, 66, 7, INT);
				addRuneText(ID + 7, ra3 + 1, r3, TDA);
				setBounds(ID + 7, 142, 66, 8, INT);
		}

		public static void addLunar3RunesBigBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1, int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type)
		{
				RSInterface rsInterface = addInterface(ID);
				rsInterface.id = ID;
				rsInterface.parentId = 1151;
				rsInterface.setType(5);
				rsInterface.atActionType = type;
				rsInterface.actionType = 0;
				rsInterface.isMouseoverTriggered = ID + 1;
				rsInterface.selectedActionName = "Cast on";
				rsInterface.width = 20;
				rsInterface.height = 20;
				rsInterface.tooltip = "Cast @gre@" + name;
				rsInterface.spellName = name;
				rsInterface.scriptCompareType = new int[4];
				rsInterface.scriptCompareValue = new int[4];
				rsInterface.scriptCompareType[0] = 3;
				rsInterface.scriptCompareValue[0] = ra1;
				rsInterface.scriptCompareType[1] = 3;
				rsInterface.scriptCompareValue[1] = ra2;
				rsInterface.scriptCompareType[2] = 3;
				rsInterface.scriptCompareValue[2] = ra3;
				rsInterface.scriptCompareType[3] = 3;
				rsInterface.scriptCompareValue[3] = lvl;
				rsInterface.valueIndexArray = new int[4][];
				rsInterface.valueIndexArray[0] = new int[4];
				rsInterface.valueIndexArray[0][0] = 4;
				rsInterface.valueIndexArray[0][1] = 3214;
				rsInterface.valueIndexArray[0][2] = r1;
				rsInterface.valueIndexArray[0][3] = 0;
				rsInterface.valueIndexArray[1] = new int[4];
				rsInterface.valueIndexArray[1][0] = 4;
				rsInterface.valueIndexArray[1][1] = 3214;
				rsInterface.valueIndexArray[1][2] = r2;
				rsInterface.valueIndexArray[1][3] = 0;
				rsInterface.valueIndexArray[2] = new int[4];
				rsInterface.valueIndexArray[2][0] = 4;
				rsInterface.valueIndexArray[2][1] = 3214;
				rsInterface.valueIndexArray[2][2] = r3;
				rsInterface.valueIndexArray[2][3] = 0;
				rsInterface.valueIndexArray[3] = new int[3];
				rsInterface.valueIndexArray[3][0] = 1;
				rsInterface.valueIndexArray[3][1] = 6;
				rsInterface.valueIndexArray[3][2] = 0;
				rsInterface.sprite2 = sid == 35 ? imageLoaderNew(Client.clientRevision("474") ? 693 : 423) : LoadLunarSprite("/Lunar/LUNARON " + sid);
				rsInterface.sprite1 = LoadLunarSprite1((468 + sid + (Client.clientRevision("474") || Client.clientRevision("525") ? 186 : 0)));
				boolean isUsed = false;
				for (int index = 0; index < usedVengeanceInterfaceSprites.length; index++)
				{
						if (sid == usedVengeanceInterfaceSprites[index])
						{
								isUsed = true;
								break;
						}
				}
				if (!isUsed)
				{
						rsInterface.sprite2 = rsInterface.sprite1;
				}
				RSInterface INT = addInterface(ID + 1);
				INT.interfaceShown = true;
				INT.totalChildren(9);
				addLunarSprite(ID + 2, "/Lunar/BOX 1");
				setBounds(ID + 2, 0, 0, 0, INT);
				addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
				setBounds(ID + 3, 90, 4, 1, INT);
				addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
				setBounds(ID + 4, 90, 21, 2, INT);
				setBounds(30016, 14, 48, 3, INT);
				setBounds(rune1, 74, 48, 4, INT);
				setBounds(rune2, 130, 48, 5, INT);
				addRuneText(ID + 5, ra1 + 1, r1, TDA);
				setBounds(ID + 5, 26, 79, 6, INT);
				addRuneText(ID + 6, ra2 + 1, r2, TDA);
				setBounds(ID + 6, 87, 79, 7, INT);
				addRuneText(ID + 7, ra3 + 1, r3, TDA);
				setBounds(ID + 7, 142, 79, 8, INT);
		}

		public static void addLunar3RunesLargeBox(int ID, int r1, int r2, int r3, int ra1, int ra2, int ra3, int rune1, int rune2, int lvl, String name, String descr, TextDrawingArea[] TDA, int sid, int suo, int type)
		{
				RSInterface rsInterface = addInterface(ID);
				rsInterface.id = ID;
				rsInterface.parentId = 1151;
				rsInterface.setType(5);
				rsInterface.atActionType = type;
				rsInterface.actionType = 0;
				rsInterface.isMouseoverTriggered = ID + 1;
				// rsInterface.spellUsableOn = suo;
				rsInterface.selectedActionName = "Cast on";
				rsInterface.width = 20;
				rsInterface.height = 20;
				rsInterface.tooltip = "Cast @gre@" + name;
				rsInterface.spellName = name;
				rsInterface.scriptCompareType = new int[4];
				rsInterface.scriptCompareValue = new int[4];
				rsInterface.scriptCompareType[0] = 3;
				rsInterface.scriptCompareValue[0] = ra1;
				rsInterface.scriptCompareType[1] = 3;
				rsInterface.scriptCompareValue[1] = ra2;
				rsInterface.scriptCompareType[2] = 3;
				rsInterface.scriptCompareValue[2] = ra3;
				rsInterface.scriptCompareType[3] = 3;
				rsInterface.scriptCompareValue[3] = lvl;
				rsInterface.valueIndexArray = new int[4][];
				rsInterface.valueIndexArray[0] = new int[4];
				rsInterface.valueIndexArray[0][0] = 4;
				rsInterface.valueIndexArray[0][1] = 3214;
				rsInterface.valueIndexArray[0][2] = r1;
				rsInterface.valueIndexArray[0][3] = 0;
				rsInterface.valueIndexArray[1] = new int[4];
				rsInterface.valueIndexArray[1][0] = 4;
				rsInterface.valueIndexArray[1][1] = 3214;
				rsInterface.valueIndexArray[1][2] = r2;
				rsInterface.valueIndexArray[1][3] = 0;
				rsInterface.valueIndexArray[2] = new int[4];
				rsInterface.valueIndexArray[2][0] = 4;
				rsInterface.valueIndexArray[2][1] = 3214;
				rsInterface.valueIndexArray[2][2] = r3;
				rsInterface.valueIndexArray[2][3] = 0;
				rsInterface.valueIndexArray[3] = new int[3];
				rsInterface.valueIndexArray[3][0] = 1;
				rsInterface.valueIndexArray[3][1] = 6;
				rsInterface.valueIndexArray[3][2] = 0;
				rsInterface.sprite2 = LoadLunarSprite("/Lunar/LUNARON " + sid);
				rsInterface.sprite1 = LoadLunarSprite1((468 + sid + (Client.clientRevision("474") || Client.clientRevision("525") ? 186 : 0)));
				boolean isUsed = false;
				for (int index = 0; index < usedVengeanceInterfaceSprites.length; index++)
				{
						if (sid == usedVengeanceInterfaceSprites[index])
						{
								isUsed = true;
								break;
						}
				}
				if (!isUsed)
				{
						rsInterface.sprite2 = rsInterface.sprite1;
				}
				RSInterface INT = addInterface(ID + 1);
				INT.interfaceShown = true;
				INT.totalChildren(9);
				addLunarSprite(ID + 2, "/Lunar/BOX 2");
				setBounds(ID + 2, 0, 0, 0, INT);
				addText(ID + 3, "Level " + (lvl + 1) + ": " + name, 0xFF981F, true, true, 52, TDA, 1);
				setBounds(ID + 3, 90, 4, 1, INT);
				addText(ID + 4, descr, 0xAF6A1A, true, true, 52, TDA, 0);
				setBounds(ID + 4, 90, 34, 2, INT);
				setBounds(30016, 14, 61, 3, INT);
				setBounds(rune1, 74, 61, 4, INT);
				setBounds(rune2, 130, 61, 5, INT);
				addRuneText(ID + 5, ra1 + 1, r1, TDA);
				setBounds(ID + 5, 26, 92, 6, INT);
				addRuneText(ID + 6, ra2 + 1, r2, TDA);
				setBounds(ID + 6, 87, 92, 7, INT);
				addRuneText(ID + 7, ra3 + 1, r3, TDA);
				setBounds(ID + 7, 142, 92, 8, INT);
		}

		public static void constructLunar()
		{
				RSInterface Interface = addTabInterface(29999);
				setChildren(80, Interface);
				setBounds(30000, 10, 15, 0, Interface);
				setBounds(30017, 39, 15, 1, Interface);
				setBounds(30025, 68, 17, 2, Interface);
				setBounds(30032, 97, 15, 3, Interface);
				setBounds(30040, 126, 17, 4, Interface);
				setBounds(30048, 155, 15, 5, Interface);
				setBounds(30056, 9, 44, 6, Interface);
				setBounds(30064, 39, 44, 7, Interface);
				setBounds(30075, 68, 44, 8, Interface);
				setBounds(30083, 97, 44, 9, Interface);
				setBounds(30091, 126, 44, 10, Interface);
				setBounds(30099, 157, 43, 11, Interface);
				setBounds(30106, 10, 73, 12, Interface);
				setBounds(30114, 39, 73, 13, Interface);
				setBounds(30122, 67, 72, 14, Interface);
				setBounds(30130, 97, 73, 15, Interface);
				setBounds(30138, 127, 73, 16, Interface);
				setBounds(30146, 158, 73, 17, Interface);
				setBounds(30154, 13, 101, 18, Interface);
				setBounds(30162, 39, 102, 19, Interface);
				setBounds(30170, 68, 102, 20, Interface);
				setBounds(30178, 96, 102, 21, Interface);
				setBounds(30186, 127, 102, 22, Interface);
				setBounds(30194, 161, 103, 23, Interface);
				setBounds(30202, 9, 131, 24, Interface);
				setBounds(30210, 40, 131, 25, Interface);
				setBounds(30218, 71, 132, 26, Interface);
				setBounds(30226, 97, 131, 27, Interface);
				setBounds(30234, 127, 131, 28, Interface);
				setBounds(30242, 157, 131, 29, Interface);
				setBounds(30250, 10, 160, 30, Interface);
				setBounds(30258, 39, 160, 31, Interface);
				setBounds(30266, 68, 160, 32, Interface);
				setBounds(30274, 97, 160, 33, Interface);
				setBounds(30282, 130, 160, 34, Interface);
				setBounds(30290, 155, 160, 35, Interface);
				setBounds(30298, 12, 189, 36, Interface);
				setBounds(30306, 41, 189, 37, Interface);
				setBounds(30314, 67, 187, 38, Interface);
				setBounds(30322, 97, 188, 39, Interface);
				setBounds(30001, 5, 184, 40, Interface); // hover
				setBounds(30018, 5, 176, 41, Interface); // hover
				setBounds(30026, 5, 176, 42, Interface); // hover
				setBounds(30033, 5, 163, 43, Interface); // hover
				setBounds(30041, 5, 176, 44, Interface); // hover
				setBounds(30049, 5, 176, 45, Interface); // hover
				setBounds(30057, 5, 176, 46, Interface); // hover
				setBounds(30065, 5, 176, 47, Interface); // hover
				setBounds(30076, 5, 163, 48, Interface); // hover
				setBounds(30084, 5, 176, 49, Interface); // hover
				setBounds(30092, 5, 176, 50, Interface); // hover
				setBounds(30100, 5, 176, 51, Interface); // hover
				setBounds(30107, 5, 176, 52, Interface); // hover
				setBounds(30115, 5, 163, 53, Interface); // hover
				setBounds(30123, 5, 176, 54, Interface); // hover
				setBounds(30131, 5, 163, 55, Interface); // hover
				setBounds(30139, 5, 163, 56, Interface); // hover
				setBounds(30147, 5, 163, 57, Interface); // hover
				setBounds(30155, 5, 176, 58, Interface); // hover
				setBounds(30163, 5, 176, 59, Interface); // hover
				setBounds(30171, 5, 176, 60, Interface); // hover
				setBounds(30179, 5, 163, 61, Interface); // hover
				setBounds(30187, 5, 176, 62, Interface); // hover
				setBounds(30195, 5, 149, 63, Interface); // hover
				setBounds(30203, 5, 176, 64, Interface); // hover
				setBounds(30211, 5, 163, 65, Interface); // hover
				setBounds(30219, 5, 163, 66, Interface); // hover
				setBounds(30227, 5, 176, 67, Interface); // hover
				setBounds(30235, 5, 149, 68, Interface); // hover
				setBounds(30243, 5, 176, 69, Interface); // hover
				setBounds(30251, 5, 5, 70, Interface); // hover
				setBounds(30259, 5, 5, 71, Interface); // hover
				setBounds(30267, 5, 5, 72, Interface); // hover
				setBounds(30275, 5, 5, 73, Interface); // hover
				setBounds(30283, 5, 5, 74, Interface); // hover
				setBounds(30291, 5, 5, 75, Interface); // hover
				setBounds(30299, 5, 5, 76, Interface); // hover
				setBounds(30307, 5, 5, 77, Interface); // hover
				setBounds(30323, 5, 5, 78, Interface); // hover
				setBounds(30315, 5, 5, 79, Interface); // hover
		}


		public static ArrayList<Integer> interfaceIds = new ArrayList<Integer>();

		public static void setBounds(int id, int X, int Y, int frame, RSInterface RSinterface)
		{
				if (ClientConfiguration.DEBUG_INTERFACES)
				{
						interfaceIds.add(id);
				}
				RSinterface.children[frame] = id;
				RSinterface.childX[frame] = X;
				RSinterface.childY[frame] = Y;
		}

		public static void addButton(int i, String name, int W, int H, String S, int AT)
		{
				RSInterface RSInterface = addInterface(i);
				RSInterface.id = i;
				RSInterface.parentId = i;
				RSInterface.setType(5);
				RSInterface.atActionType = AT;
				RSInterface.actionType = 0;
				RSInterface.opacity = 0;
				RSInterface.isMouseoverTriggered = 52;
				RSInterface.sprite1 = imageLoader(name);
				RSInterface.sprite2 = imageLoader(name);
				RSInterface.width = W;
				RSInterface.height = H;
				RSInterface.tooltip = S;
		}

		public int transparency;

		public int mediaIdOffset2;

		public int mediaIdOffset1;

		public static void addTransparentSprite(int id, int spriteId, int i)
		{
				RSInterface tab = interfaceCache[id] = new RSInterface();
				tab.id = id;
				tab.parentId = id;
				tab.transparency = i;
				tab.setType(5);
				tab.atActionType = 0;
				tab.actionType = 0;
				tab.sprite1 = imageLoaderNew(spriteId);
				tab.sprite2 = imageLoaderNew(spriteId);
				tab.width = 512;
				tab.height = 334;
				tab.drawsTransparent = true;
		}

		public int getType()
		{
				return type;
		}

		public void setType(int type)
		{
				this.type = type;
		}

		public static void reloadInterfaces(boolean once)
		{
				if (!Client.interfacesReloadLoop)
				{
						return;
				}
				if (System.currentTimeMillis() - Client.InterfaceReloadTime < 2000 && !once)
				{
						return;
				}
				Client.InterfaceReloadTime = System.currentTimeMillis();
				Client.interfacesReloaded = true;
				//  Client.instance.loadScene();

				int amount = ClientConfiguration.SPRITES_AMOUNT;
				Client.cacheSprite = new Sprite[amount];
				for (int i = 0; i < amount; i++)
				{
						Client.cacheSprite[i] = new Sprite(ClientConstants.CACHE_LOCATION + "sprites_debug/sprites/" + i, "");
				}

				TextDrawingArea aTextDrawingArea_1273 = new TextDrawingArea(true, "q8_full", Client.instance.titleStreamLoader);
				TextDrawingArea aclass30_sub2_sub1_sub4s[] = {Client.instance.smallText, Client.instance.aTextDrawingArea_1271, Client.instance.chatTextDrawingArea, aTextDrawingArea_1273};
				StreamLoader streamLoader_1 = Client.instance.streamLoaderForName(3, "interface", "interface", Client.instance.expectedCRCs[3], 35);
				StreamLoader streamLoader_2 = Client.instance.streamLoaderForName(4, "2d graphics", "media", Client.instance.expectedCRCs[4], 40);
				RSInterface.unpack(streamLoader_1, aclass30_sub2_sub1_sub4s, streamLoader_2);

				if (once)
				{
						Client.interfacesReloadLoop = false;
				}
		}
}