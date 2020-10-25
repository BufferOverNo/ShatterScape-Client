import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;


public class Load
{
		/**
		 * This method loaded only when the client has been started up. So just once.
		 */
		public static void startUp()
		{
				Content.deleteOldVersions();
				try
				{
						Client.instance.selectData();
				}
				catch (IOException e)
				{
						e.printStackTrace();
				}
				new CacheDownloader(Client.instance).downloadCache();
				try
				{
						SignLink.startpriv(InetAddress.getLocalHost());
				}
				catch (UnknownHostException e)
				{
						e.printStackTrace();
				}
				Client.instance.getDocumentBaseHost();
				if (SignLink.cache_dat != null)
				{
						for (int i = 0; i < 6; i++)
						{
								Client.instance.decompressors[i] = new Decompressor(SignLink.cache_dat, SignLink.cache_idx[i], i + 1);
						}
				}
				// Models 1.
				// Animations 2.
				// Sounds 3.
				// Map 4.
				//Client.instance.repackCacheIndex(2);
				Settings.loadSettings(Client.clientRevision);
				Client.setWorldGraphics(Client.worldGraphicsMode);
				Client.newFontOnLaunch = Client.newFont;
				try
				{
						Client.warnAndExitIfWrongCacheLocation();
						Client.instance.titleStreamLoader = Client.instance.streamLoaderForName(1, "title screen", "title", Client.instance.expectedCRCs[1], 25);
						Client.instance.smallHit = new TextDrawingArea(false, "hit_full", Client.instance.titleStreamLoader);
						Client.instance.bigHit = new TextDrawingArea(true, "critical_full", Client.instance.titleStreamLoader);
						TextDrawingArea aTextDrawingArea_1273 = new TextDrawingArea(true, "q8_full" + (Client.newFont ? "_new" : ""), Client.instance.titleStreamLoader);
						Client.loadTextFonts();
						Client.instance.loadTitleScreen();
						Client.instance.drawLoadingText(52, Client.loadingGameString);
						if (Client.rememberMe)
						{
								Client.instance.myUsername = Client.savedUsername;
								Client.instance.myPassword = Client.savedPassword;
						}
						StreamLoader streamLoader = Client.instance.streamLoaderForName(2, "config", "config", Client.instance.expectedCRCs[2], 30);
						StreamLoader streamLoader_1 = Client.instance.streamLoaderForName(3, "interface", "interface", Client.instance.expectedCRCs[3], 35);
						StreamLoader streamLoader_2 = Client.instance.streamLoaderForName(4, "2d graphics", "media", Client.instance.expectedCRCs[4], 40);
						StreamLoader streamLoader_3 = Client.instance.streamLoaderForName(6, "textures", "textures", Client.instance.expectedCRCs[6], 45);
						StreamLoader streamLoader_5 = Client.instance.streamLoaderForName(8, "sound effects", "sounds", Client.instance.expectedCRCs[8], 55);
						if (ClientConfiguration.DEBUG_SPRITES)
						{
								int amount = ClientConfiguration.SPRITES_AMOUNT;
								Client.cacheSprite = new Sprite[amount];
								for (int i = 0; i < amount; i++)
								{
										Client.cacheSprite[i] = new Sprite(ClientConstants.CACHE_LOCATION + "sprites_debug/sprites/" + i, "");
								}
						}
						else
						{
								SpriteLoader.loadSprites(streamLoader_2);
								Client.cacheSprite = SpriteLoader.sprites;
						}
						Client.instance.byteGroundArray = new byte[4][104][104];
						Client.instance.intGroundArray = new int[4][105][105];
						Client.instance.landScape = new Landscape(Client.instance.intGroundArray);
						for (int j = 0; j < 4; j++)
						{
								Client.instance.collisionMap[j] = new CollisionMap();
						}
						Client.instance.landImage = new Sprite(512, 512);
						StreamLoader streamLoader_6 = Client.instance.streamLoaderForName(5, "update list", "versionlist", Client.instance.expectedCRCs[5], 60);
						Client.instance.drawLoadingText(94, Client.loadingGameString);
						Client.onDemandFetcher = new OnDemandFetcher();
						Client.onDemandFetcher.start(streamLoader_6, Client.instance);
						//Music.packMusic();
						SequenceFrame.method528(65535);
						Model.method459(Client.onDemandFetcher.getModelCount(), Client.onDemandFetcher);
						Client.preloadModels();
						for (int i = 0; i < 21; i++)
						{
								Client.instance.crown[i] = new Sprite("crown/" + i);
						}
						Client.instance.newSmallFont.unpackChatImages(Client.instance.crown);
						Client.instance.newRegularFont.unpackChatImages(Client.instance.crown);
						Client.instance.newBoldFont.unpackChatImages(Client.instance.crown);
						Client.instance.drawLoadingText(136, Client.loadingGameString);

						Client.instance.multiOverlay = new Sprite(streamLoader_2, "overlay_multiway", 0);
						Client.instance.drawLoadingText(178, Client.loadingGameString);
						Client.instance.mapBack[0] = new Background(streamLoader_2, "mapback", 0);
						for (int c1 = 0; c1 <= 3; c1++)
						{
								Client.instance.chatButtons[c1] = new Sprite(streamLoader_2, "chatbuttons", c1);
						}
						Client.instance.drawLoadingText(220, Client.loadingGameString);
						if (Client.is562PlusGameFrame)
						{
								Client.instance.compass = new Sprite(streamLoader_2, "compass", 1);
						}
						else
						{
								Client.instance.compass = new Sprite(streamLoader_2, "compass", 0);
						}
						try
						{
								for (int k3 = 0; k3 < 100; k3++)
								{
										Client.instance.mapScenes[k3] = new Background(streamLoader_2, "mapscene", k3);
										if (k3 == 30)
										{
												Client.instance.drawLoadingText(262, Client.loadingGameString);
										}
								}
						}
						catch (Exception _ex)
						{
						}
						Client.instance.drawLoadingText(304, Client.loadingGameString);
						try
						{
								for (int l3 = 0; l3 < 100; l3++)
								{
										Client.instance.mapFunctions[l3] = new Sprite(streamLoader_2, "mapfunction", l3);
										if (l3 == 20)
										{
												Client.instance.drawLoadingText(346, Client.loadingGameString);
										}
								}
						}
						catch (Exception _ex)
						{
						}

						Client.instance.drawLoadingText(388, Client.loadingGameString);
						try
						{
								for (int i4 = 0; i4 < 20; i4++)
								{
										Client.instance.hitMarks[i4] = new Sprite(streamLoader_2, "hitmarks", i4);
								}
						}
						catch (Exception _ex)
						{
						}
						try
						{
								for (int h1 = 0; h1 < 6; h1++)
								{
										Client.instance.headIconsHint[h1] = new Sprite(streamLoader_2, "headicons_hint", h1);
								}
						}
						catch (Exception _ex)
						{
						}
						try
						{
								for (int j4 = 0; j4 < 20; j4++)
								{
										Client.instance.headIcons[j4] = new Sprite(streamLoader_2, "headicons_prayer", j4);
								}
						}
						catch (Exception _ex)
						{
						}
						for (int j45 = 0; j45 < 3; j45++)
						{
								Client.instance.skullIcons[j45] = new Sprite(streamLoader_2, "headicons_pk", j45);
						}
						Client.instance.mapFlag = new Sprite(streamLoader_2, "mapmarker", 0);
						Client.instance.mapMarker = new Sprite(streamLoader_2, "mapmarker", 1);
						Client.instance.mapEdgeMarker = new Sprite(streamLoader_2, "mapedge", 1);
						for (int k4 = 0; k4 < 8; k4++)
						{
								Client.instance.crosses[k4] = new Sprite(streamLoader_2, "cross", k4);
						}
						Client.instance.mapDotItem = new Sprite(streamLoader_2, "mapdots", 0);
						Client.instance.mapDotNpc = new Sprite(streamLoader_2, "mapdots", 1);
						Client.instance.mapDotPlayer = new Sprite(streamLoader_2, "mapdots", 2);
						Client.instance.mapDotFriend = new Sprite(streamLoader_2, "mapdots", 3);
						Client.instance.mapDotTeam = new Sprite(streamLoader_2, "mapdots", 4);
						Client.instance.mapDotClan = new Sprite(streamLoader_2, "mapdots", 5);
						Client.instance.scrollBar1 = new Sprite(streamLoader_2, "scrollbar", 0);
						Client.instance.scrollBar2 = new Sprite(streamLoader_2, "scrollbar", 1);
						Sprite sprite = new Sprite(streamLoader_2, "screenframe", 0);
						Client.instance.leftFrame = Client.constructGraphicsBuffer(sprite.myWidth, sprite.myHeight, Client.instance.getGameComponent());
						sprite.method346(0, 0);
						sprite = new Sprite(streamLoader_2, "screenframe", 1);
						Client.instance.topFrame = Client.constructGraphicsBuffer(sprite.myWidth, sprite.myHeight, Client.instance.getGameComponent());
						sprite.method346(0, 0);
						sprite = new Sprite(streamLoader_2, "screenframe", 2);
						Client.instance.rightFrame = Client.constructGraphicsBuffer(sprite.myWidth, sprite.myHeight, Client.instance.getGameComponent());
						sprite.method346(0, 0);
						Client.instance.drawLoadingText(430, Client.loadingGameString);
						for (int i6 = 0; i6 < 100; i6++)
						{
								if (Client.instance.mapFunctions[i6] != null)
								{
										Client.instance.mapFunctions[i6].method344(0, 0, 0);
								}
								if (Client.instance.mapScenes[i6] != null)
								{
										Client.instance.mapScenes[i6].translateRGB(0, 0, 0);
								}
						}
						Rasterizer.load(streamLoader_3);
						Client.instance.drawLoadingText(472, Client.loadingGameString);
						Rasterizer.setupPalette(0.80000000000000004D);
						Rasterizer.setupTextures();
						Animation.unpackConfig(streamLoader);
						Client.instance.drawLoadingText(514, Client.loadingGameString);
						ObjectDefinition.unpackConfig(streamLoader);
						FloorDefinition.unpackConfig(streamLoader);
						ItemDefinition.unpackConfig(streamLoader);
						EntityDefinition.unpackConfig(streamLoader);
						Client.instance.drawLoadingText(556, Client.loadingGameString);
						IdentityKit.unpackConfig(streamLoader);
						SpotAnim.unpackConfig(streamLoader);
						Varp.unpackConfig(streamLoader);
						VarBit.unpackConfig(streamLoader);
						TextDrawingArea aclass30_sub2_sub1_sub4s[] = {Client.instance.smallText, Client.instance.aTextDrawingArea_1271, Client.instance.chatTextDrawingArea, aTextDrawingArea_1273};
						RSInterface.unpack(streamLoader_1, aclass30_sub2_sub1_sub4s, streamLoader_2);
						try
						{
								for (int j6 = 0; j6 < 33; j6++)
								{
										int k6 = 999;
										int i7 = 0;
										for (int k7 = 0; k7 < 34; k7++)
										{
												if (Client.instance.mapBack[0].data[k7 + j6 * Client.instance.mapBack[0].width] == 0)
												{
														if (k6 == 999)
																k6 = k7;
														continue;
												}
												if (k6 == 999)
														continue;
												i7 = k7;
												break;
										}
										Client.instance.mapbackOffsets0[j6] = k6;
										Client.instance.mapbackOffsets1[j6] = i7 - k6;
								}
								for (int l6 = 1; l6 < 153; l6++)
								{
										int j7 = 999;
										int l7 = 0;
										for (int j8 = 24; j8 < 177; j8++)
										{
												if (Client.instance.mapBack[0].data[j8 + l6 * Client.instance.mapBack[0].width] == 0 && (j8 > 34 || l6 > 34))
												{
														if (j7 == 999)
														{
																j7 = j8;
														}
														continue;
												}
												if (j7 == 999)
												{
														continue;
												}
												l7 = j8;
												break;
										}
										Client.instance.compassOffsets0[l6 - 1] = j7 - 24;
										Client.instance.compassOffsets1[l6 - 1] = l7 - j7;
								}
						}
						catch (Exception _ex)
						{
						}

						Client.setBounds();
						Client.instance.drawLoadingText(767, Client.loadingGameString);
						if (!Client.disableAudio)
						{
								byte abyte0[] = streamLoader_5.getDataForName("sounds.dat");
								Stream stream = new Stream(abyte0);
								WaveSound.unpack(stream);
						}

						if (ClientConfiguration.FORCE_LOG_IN)
						{
								Client.instance.myUsername = "m";
								Client.instance.myPassword = "m";
						}
						Settings.updateClientSettings();
						InterfaceTextEdit.apply();
						Music.updateMusicInterface();
						Music.playLogInScreenMusic();
						Music.turnMusicTabGreen();
						Content.loadItemPrices();
						SceneObject.clientInstance = Client.instance;
						ObjectDefinition.clientInstance = Client.instance;
						EntityDefinition.clientInstance = Client.instance;
						Screenshot.loadScreenShotNumber();
						return;
				}
				catch (Exception exception)
				{
						exception.printStackTrace();
						SignLink.reporterror("loaderror2 " + Client.instance.aString1049 + " " + Client.instance.anInt1079);
				}
				Client.instance.loadingError = true;
		}
}
