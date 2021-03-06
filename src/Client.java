import java.applet.AppletContext;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.FilteredImageSource;
import java.awt.image.ImageProducer;
import java.awt.image.RGBImageFilter;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.zip.GZIPOutputStream;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Client extends RSApplet
{

		private static final long serialVersionUID = 5138756335913614869L;

		/**
		 * An instance of this class.
		 */
		public static Client instance;

		/**
		 * Launch this when developing.
		 */
		public static void main(String[] args)
		{
				try
				{
						ClientConfiguration.LOCAL_CACHE = ClientConfiguration.ZIP_CLIENT_VERSION ? true : ClientConfiguration.LOCAL_CACHE;
						ClientConfiguration.SKIP_DATA_SELECTION = ClientConfiguration.ZIP_CLIENT_VERSION ? true : ClientConfiguration.SKIP_DATA_SELECTION;
						ClientConfiguration.SKIP_DATA_SELECTION_TO = ClientConfiguration.ZIP_CLIENT_VERSION ? "474" : ClientConfiguration.SKIP_DATA_SELECTION_TO;
						osName = System.getProperty("os.name");
						Game.clientLaunch();
						Client.instance = new Jframe(args);
						Client.instance.initClientFrame(Client.getClientHeight(), Client.getClientWidth());
				}
				catch (Exception exception)
				{
				}
		}

		/**
		 * True if a fixed client can be maximizable.
		 */
		public static boolean maximizable;

		public static int maximizableWidth = 764;

		public static int maximizableHeight = 504;

		/**
		 * True, if 602 data is enabled.
		 */
		public static String clientRevision = "474";

		public static boolean clientRevision(String match)
		{
				return clientRevision.equals(match);
		}

		public final static boolean ENABLE_RECONNECTING = ClientConfiguration.LOCAL_HOST ? true : false;

		public static boolean rigourUnlocked;

		public static boolean auguryUnlocked;

		public static long vengeanceTime;

		public static int targetHintX;

		public static int targetHintY;

		public static int targetHintPlayerId;

		public static int screenShotNumber = 1;

		public static boolean rubberBandEffect = true;

		public static boolean newTweening = false;

		public static long timeBlackScreen;

		public static boolean blackScreenSaved;

		public static long timeCityTimerStarted;

		public static boolean cityTimer;

		public int interactingWithEntityId;

		/**
		 * Show zombies countdown.
		 */
		public static boolean showCountdown;

		/**
		 * Save zombies countdown time called.
		 */
		public static long countDownTime;

		/**
		 * Set to 10 for resizable, but hd floors is bugged if it becomes 10.
		 */
		public static int viewDistance = 9;

		/**
		 * True, so when the player activates an inventory tab that is already activated/shown, then hide the opened inventory tab.
		 * This is the setting.
		 */
		public static boolean hideInventoryInterface;

		/**
		 * Used for the actual action of hiding the interface.
		 */
		public static boolean hideInventoryInterfaceAction;

		public static String inventoryLayout = "LANDSCAPE";

		public static boolean getInventoryLayout(String layout)
		{
				if (inventoryLayout.equals(layout))
				{
						return true;
				}
				return false;
		}

		private static int dialogueOptionUsed;

		/**
		 * This is used to save the fixed screen condition, this is used to make the screen not fixed once the player logs in.
		 */
		public static boolean isFixedScreenSaved = true;

		public static boolean clientIgnoreLocationSave;

		public static boolean clientMaximized;

		public static boolean clientFrameSaveNeeded;

		public static long clientFrameSaveNeededTime;

		public static boolean clientMaximizedPreviously;

		public static double clientFixedLocationX = -1;

		public static double clientFixedLocationY = -1;

		public static double clientResizedLocationX = -1;

		public static double clientResizedLocationY = -1;

		public static int clientWidthSaved = 1000;

		public static int clientHeightSaved = 700;

		public static long clientMaximimzedTime;

		public static long clientDimenionsSavedTime;

		public static boolean showQuestionMark;

		public static long timeSentBankSearch;

		public static String loadingGameString = "";

		public static boolean rememberMe = false;

		public static String savedUsername = "";

		public static String savedPassword = "";

		public static String oldText;

		public static boolean usingEquipmentInterface;

		static String rotateCharacterState = "NONE";

		/**
		 * Since i am not making a constant for each individual sprite, do not do things like cacheSprite[state ? 50 : 39].
		 * Because it will make debugging harder when looking for a specific sprite.
		 */
		public static Sprite[] cacheSprite;

		/**
		 * The state of the log-in screen.
		 */
		public static String logInScreenPage = "FIRST";

		/**
		 * True if using profile search button.
		 */
		public static boolean profileSearching;

		/**
		 * The username to search for.
		 */
		public static String profileSearchString = "";

		/**
		 * Which biography line is being edited.
		 */
		public static int profileBiographyLineEdited = 0;

		/**
		 * The text in the biography line.
		 */
		public static String profileBiographyText = "";

		/**
		 * String input in the shop search bar.
		 */
		public static String shopString = "";

		/**
		 * True if shop search bar is being used.
		 */
		public static boolean shopSearching;

		/**
		 * Speed of camera rotation.
		 */
		public static String cameraSpeed = "SLOW";

		/**
		 * True to use old wilderness interface.
		 */
		public static boolean useOldWildernessInterface = true;

		/**
		 * Player rights, used for chatbox crown.
		 */
		public static int playerRights;

		/**
		 * True to put the scrollbar all the way up.
		 */
		protected static boolean scrollUp;

		static int currentBankTab;

		/**
		 * True if interfaces have been reloaded.
		 */
		public static boolean interfacesReloaded;

		public static boolean interfacesReloadLoop;

		public static long InterfaceReloadTime;

		public static boolean osrsXpOrb = true;

		public static boolean osrsXpOrbMiddle;

		public static String xpBarShowType = "COMBAT";

		public static boolean searching;

		/**
		 * True to use new fonts, the only manual adjustments is the tooltips ofcourse and interface.
		 */
		public static boolean newFont = true;

		/**
		 * True if the client has been launched with new fonts. This is used to re-allign strings on interface.
		 */
		public static boolean newFontOnLaunch;

		public static boolean playerUpdateCompleted;

		/**
		 * Object map files.
		 */
		private String ObjectData = "";

		/**
		 * Floor map files.
		 */
		public static String floorData = "";

		public static boolean otherFloorTexturing = false;

		/**
		 * True, if HD minimap is enabled.
		 */
		public static boolean hdMinimap = false;

		/**
		 * The tile x position to save.
		 */
		public static int saveRightClickX = 0;

		/**
		 * The tile y position to save.
		 */
		public static int saveRightClickY = 0;

		/**
		 * True, to save the right click coordinates.
		 */
		public static boolean saveRightClickCoordinates;

		/**
		 * True, to start saving the right click coordinates.
		 */
		public static boolean appendSavedCoordinated = false;

		/**
		 * True, to use the saved coordinates.
		 */
		public static boolean useSavedCoordinates;

		/**
		 * True, to enable smooth char turn.
		 */
		public static boolean smoothCharacterTurn = false;

		/**
		 * Switching items sensitivity.
		 */
		public static int draggingSensitivity = 8;

		/**
		 * Tutorial stage, 0 for not started.
		 */
		private static int tutorialStage = 0;

		/**
		 * True, to enable tweening.
		 */
		public static boolean tweening = false;

		/**
		 * True, to show Client setting ticks.
		 */
		private static boolean showSettingTicks;

		public static int settingsPage = 0;


		public static boolean smoothMiniMap = true;

		/**
		 * True, to show HD characters.
		 */
		public static boolean smoothShading = true;

		/**
		 * True, to enable HD shadows. Keep on because fog is on.
		 */
		public static boolean smoothShadow = false;

		/**
		 * Brightness of client.
		 */
		public static int brightness = ClientConstants.BRIGHTNESS_NORMAL;

		/**
		 * Current skill experience being shown.
		 */
		public static int currentXp;

		public static boolean forceResetXp;

		/**
		 * Total skill experience show on XP bar.
		 */
		public static int currentXPTotal;

		/**
		 * True, to show data selection images.
		 */
		public static boolean showSelectDataImages;

		/**
		 * Used for select data screen to prevent click spamming.
		 */
		public static boolean hasClicked;

		/**
		 * The specific data selection image to show.
		 */
		public static String imageToDraw = "";

		/**
		 * True, to show the summoning orb on 474+ gameframe option and all gameframes above 474+
		 */
		public static boolean summoningOrb = false;

		/**
		 * True to force disable summoning orb on all gameframes.
		 */
		public static boolean disableSummoningOrb = true;

		/**
		 * True, to show roofs.
		 */
		public static boolean enableRoof = false;

		/**
		 * True, if the player has chosen 474 or 602 data.
		 */
		static boolean choseData;

		/**
		 * Percentage of the current title interface progress.
		 */
		public static int titleInterfacePercentage;

		/**
		 * Percentage of the current achievement level.
		 */
		public static int achievementPercentage;

		/**
		 * Name of the last clicked achievement.
		 */
		public static String achievementClickedText = "";

		/**
		 * The column order of the last clicked achievement.
		 */
		public static int achievementClickedColumn;

		public static boolean achievementPopUp;

		public static long achievementPopUpTime;

		public static String achievementTaskPopUp;

		public static String achievementDifficultyPopUp;

		public static String achievementTitlePopup;

		public static int[] achievementBadgeState = new int[5];

		/**
		 * The achievement difficulty last used.
		 */
		public static String achievementDifficulty = "EASY";

		/**
		 * Current achievement page being shown.
		 */
		public static int achievementPage = 1;

		public static boolean botsOff = false;

		/**
		 * True, to show the name of npcs/players above their own heads.
		 */
		public static boolean nameAbove;

		/**
		 * Last x amount withdrawed from bank.
		 */
		protected static int lastXAmount;

		/**
		 * True to filter game messages.
		 */
		public static boolean filtered;

		/**
		 * True, if the player is poisoned.
		 */
		public static boolean poisoned;

		public static boolean showSummoningGlow;

		/**
		 * True, if quick prayers are on.
		 */
		private static boolean quickPrayerOn;

		/**
		 * @return The state of quickPrayerOn
		 */
		public static boolean getQuickPrayerOn()
		{
				return quickPrayerOn;
		}

	public static void warnAndExitIfWrongCacheLocation() {
		if (!ClientConfiguration.DEBUG_MODE) {
			return;
		}
		File location = new File(ClientConstants.getCacheRevisionLocation() + "/main_file_cache.dat");
		long size = location.length();
		if (size < 60_000_000) {
			System.out.println("The cache is not in the correct location.");
			File mainFileCacheDat = new File(ClientConstants.getCacheRevisionLocation() + "/main_file_cache.dat");
			System.out.println("As an example, the main_file_cache.dat has to be in this exact location:");
			System.out.println(mainFileCacheDat.getAbsolutePath());
			System.exit(0);
		}
	}

	/**
		 * Change the state of quickPrayerOn
		 *
		 * @param state
		 *        The state of quickPrayerOn
		 */
		protected void setQuickPrayerOn(boolean state)
		{
				quickPrayerOn = state;
		}

		/**
		 * The difference between this and is508GameFrame, is that this one has the 562 gameframe run icon.
		 */
		public static boolean is508PlusGameFrame;

		/**
		 * The difference between this and is562GameFrame, this has new hp icon, new achievement icon.
		 */
		public static boolean is562PlusGameFrame;

		public static boolean old562GameFrame;

		/**
		 * The last data selected on the select data screen. Used to load up the same data everytime the client is started.
		 */
		public static String lastDataSelected = "474";

		/**
		 * True, to show new compass.
		 */
		public static boolean newCompass;

		/**
		 * True, to show the new left clicking icons.
		 */
		public static boolean newClick;

		/**
		 * True, if the player is resting.
		 */
		private static boolean resting;

		/**
		 * @return The state of resting.
		 */
		public static boolean getResting()
		{
				return resting;
		}

		/**
		 * Change the resting value.
		 * 
		 * @return The state of resting value to change to.
		 */
		protected void setResting(boolean state)
		{
				resting = state;
		}

		/**
		 * True, to show all the tabs.
		 * <p>
		 * This boolean is made to keep all the tabs showing at the same time for visual sync purpous.
		 */
		static boolean drawTabs;

		public static String completionistCapePartEdited = "TOP";

		public static String completionistCapeColourClicked = "";

		public static String completionistCapeTopColour = "";

		public static String completionistCapeTopDetailColour = "";

		public static String completionistCapeBottomColour = "";

		public static String completionistCapeBottomDetailColour = "";

		/**
		 * The current npc head dialogue being used. Needed to adjust npc head dialogue zoom depending on data type loaded.
		 */
		public static int npcChatHeadUsed;

		/**
		 * True, if the player is using the Webclient.
		 */
		public boolean isUsingWebClient;

		/**
		 * True, to display experience orb.
		 */
		public static boolean experienceOrb = true;

		/**
		 * The specified fog to show.
		 */
		public static String fog = "OFF BLACK";

		/**
		 * Which cursor to show, 0 for default.
		 */
		public static int isCursor = 0;

		/**
		 * True, to show x10 damage.
		 */
		public static boolean x10Damage = false;

		/**
		 * 562 has shadow, 562+ has no shadow.
		 */
		public static String hitsplatRevision = "474";

		public static boolean hitsplatRevision(String match)
		{
				return hitsplatRevision.equals(match);
		}

		public static int toolTipOtherTimer;

		/**
		 * Manual way of enabling the autocast spell tooltip on the combat interface.
		 */
		public static boolean autoCastSpellTooltip;

		/**
		 * True, to show new hit points bar.
		 */
		public static boolean newHitPointsBar = false;

		/**
		 * Right click context menu. OLD, OLD HOVER, NEW
		 */
		public static String contextMenu = "OLD";

		/**
		 * True, to display 474 gameframe.
		 */
		public static boolean is474GameFrame = true;

		/**
		 * True, to display 474+.
		 */
		public static boolean is474PlusGameFrame = true;

		/**
		 * True, to display 498 gameframe.
		 */
		public static boolean is498GameFrame = false;

		/**
		 * True, to display 525 gameframe.
		 */
		public static boolean is525GameFrame = false;

		/**
		 * True, to display 562 gameframe.
		 */
		public static boolean is562GameFrame = false;

		/**
		 * True, to display frames per second.
		 */
		public static boolean fpsOn = false;

		/**
		 * The graphics mode to set the client to.
		 */
		public static String worldGraphicsMode = "HIGH";

		public static long timeCombatInterfaceHovered;

		public static int combatInterfaceHoverString;

		public static boolean noClip;

		static long noClipTime;

		public static int midiVolume = 64;

		public static boolean loop;

		public static boolean autoMusic = true;

		public static boolean sentRequestToPlayNextSong;

		public static boolean permissionToPlayNextSong;

		public static long songChangeDelay;

		public static boolean disableAudio = false;

		public static int rights;

		public String name;

		public String message;

		public String clanname;

		final int[] chatRights;

		public int chatTypeView;

		public int clanChatMode;

		public int duelMode;

		public Sprite[] backgroundSprite;

		public Sprite[] chatButtons;

		public GraphicsBuffer leftFrame;

		public GraphicsBuffer topFrame;

		public GraphicsBuffer rightFrame;

		public int ignoreCount;

		protected long aLong824; // Cannot find refactor.

		private int[][] pathDistance;

		public int[] friendsNodeIds;

		NodeList[][][] groundArray;

		private volatile boolean updateFlames;

		private Socket jaggrabSocket;

		public Stream aStream_834; // Cannot find refactor.

		public Npc[] npcArray;

		public int npcCount;

		public int[] npcIndices;

		public int entityUpdateCount;

		public int[] entityUpdateIndices;

		int ptype0;

		int ptype1;

		int ptype2;

		String notifyMessage;

		public int privateChatMode;

		private Stream aStream_847; // Cannot find refactor.

		static boolean soundsAreEnabled;

		private static int systemUpdateHeartbeat;

		private static int anInt854;

		public int markType;

		private static int interfaceDisplayed;

		public int xCameraPos;

		public static int zCameraPos;

		public int yCameraPos;

		public static int yCameraCurve;

		public static int xCameraCurve;

		public int myPrivilege;

		protected final int[] skillExperience;

		public Sprite mapFlag;

		public Sprite mapMarker;

		private boolean useJagGrab;

		protected final int[] anIntArray873; // Cannot find refactor.

		protected final boolean[] cameraEffectEnabled;

		protected int weight;

		private volatile boolean drawFlames;

		int unknownInt10; // Cannot find refactor.

		boolean menuOpen;

		private int frameFocusedInterface;

		public String inputString;

		protected final int maxPlayers;

		public final int myPlayerIndex;

		public Player[] playerArray;

		public int playerCount;

		public int[] playerIndices;

		public int entityCount;

		public int[] entityIndices;

		public Stream[] aStreamArray895s; // Cannot find refactor.

		private int viewRotationOffset;

		public static int friendsCount;

		protected int friendserverState;

		private int[][] pathWaypoint;

		private byte[] tmpTexture;

		private int anInt913; // Cannot find refactor.

		protected int crossX;

		protected int crossY;

		protected int crossIndex;

		protected int crossType;

		public int plane;

		/**
		 * This is base skill level for all skills, except for magic it is current level.
		 */
		protected final int[] baseSkillLevel;

		protected static int anInt924; // Cannot find refactor.

		public final long[] ignoreListAsLongs;

		public boolean loadingError;

		protected final int[] anIntArray928;

		private int[][] tileCycleMap;

		private Sprite aClass30_Sub2_Sub1_Sub1_931; // Cannot find refactor.

		private Sprite aClass30_Sub2_Sub1_Sub1_932; // Cannot find refactor.

		public int markedPlayer;

		int markedX;

		int markedY;

		int anInt936; // Cannot find refactor.

		int anInt937; // Cannot find refactor.

		int anInt938; // Cannot find refactor.

		/**
		 * 3 means private messages received.
		 * 6 means private messages sent.
		 * 7 means private messages received from a a player with ranks 1 or higher.
		 * 5 is when a player has logged in/out.
		 */
		public int[] chatTypes;

		public String[] chatNames;

		public String[] chatMessages;

		private int animCycle;

		public Landscape landScape;

		/**
		 * 0 is gamescreen, 1 is inventory, 2 is chatbox, 3 is minimap.
		 */
		private int menuScreenArea;

		private int menuOffsetX;

		private int menuOffsetY;

		private int menuWidth;

		private int menuHeight;

		public long aLong953; // Cannot find refactored.

		private boolean isFocused;

		public long[] friendsListAsLongs;

		String[] clanList = new String[100];

		public static int currentSong;

		public static int nodeID = 10;

		public static int portOff;

		public static boolean clientData;

		public static boolean isMembers = true;

		protected static boolean lowMem;

		public static int spriteDrawX;

		public static int spriteDrawY;

		public final int[] mapbackOffsets0;

		final Decompressor[] decompressors;

		public int variousSettings[];

		private boolean aBoolean972; // Cannot find refactored.

		public final int spokenMaxCount;

		public final int[] spokenX;

		public final int[] spokenY;

		public final int[] spokenOffsetY;

		public final int[] spokenOffsetX;

		public final int[] spokenColor;

		public final int[] spokenEffect;

		public final int[] spokenCycle;

		public final String[] spokenMessage;

		private int minCameraPitch;

		private int lastPlane;

		protected static int anInt986; // Cannot find refactored.

		public Sprite[] hitMarks;

		private int dragCycle;

		private final int[] selectedIdentityKitColor;

		final boolean aBoolean994;

		int cutsceneFocusLocalX;

		protected int cutsceneFocusLocalY;

		int cutsceneFocusZ;

		int cutsceneRotateSpeed;

		int cutsceneRotateMul;

		protected ISAACRandomGen encryption;

		public Sprite multiOverlay;

		public static int spellId = 0;

		public boolean Autocast;

		public int autocastId = 0;

		public static int xpCounter;

		public static boolean counterOn;

		public static boolean runClicked;

		public static boolean runHover;

		public static boolean prayerHover;

		public String amountOrNameInput;

		private static int anInt1005;

		@SuppressWarnings("unused")
		private int daysSinceLastLogin;

		int pktSize;

		int packetType;

		protected int netIdleCycles;

		private int heartbeatCycle;

		private int logoutCycle;

		private NodeList projectiles;

		public int chaseCameraX;

		public int chaseCameraY;

		private int sendCameraInfoCycle;

		private boolean cameraSendingInfo;

		protected int walkableInterfaceId;

		protected static final int[] XP_LOOKUP;

		int minimapState;

		int loadingStage;

		public Sprite scrollBar1;

		public Sprite scrollBar2;

		private int focusedViewportWidget;

		protected final int[] cameraEffectCycles;

		private boolean updateCharacterCreation;

		public Sprite[] mapFunctions;

		int baseX;

		int baseY;

		int anInt1036; // Cannot find refactor.

		int anInt1037; // Cannot find refactor.

		private int focusedChatWidget;

		int dialogId;

		protected final int[] maxStats;

		public final int[] anIntArray1045; // Cannot find refactor.

		int anInt1046; // Cannot find refactor.

		private boolean selectedMaleIdentityKit;

		private int focusedSidebarWidget;

		public String aString1049; // Cannot find refactor.

		private static int anInt1051; // Cannot find refactor.

		public final int[] compassOffsets0;

		public StreamLoader titleStreamLoader;

		protected int flashingSidebarTab;

		/**
		 * Multi sign status, 1 = active
		 */
		protected int anInt1055;

		private NodeList spotanims;

		public final int[] mapbackOffsets1;

		public final RSInterface chatInterface;

		public Background[] mapScenes;

		static int currentSound;

		private final int barFillColor;

		public static int friendsListAction;

		public static int inputValue = -1;

		private final int[] clotheIds;

		private int mouseInvInterfaceIndex;

		private int lastActiveInvInterface;

		static OnDemandFetcher onDemandFetcher;

		int regionX;

		int regionY;

		int objectIconCount;

		int[] objectIconX;

		int[] objectIconY;

		public Sprite mapDotItem;

		public Sprite mapDotNpc;

		public Sprite mapDotPlayer;

		public Sprite mapDotFriend;

		public Sprite mapDotTeam;

		public Sprite mapDotClan;

		public int anInt1079; // Cannot find refactor.

		protected boolean sceneIsLoading;

		public String[] friendsList;

		public Stream inStream;

		private int focusedDragWidget;

		private int dragFromSlot;

		private int activeInterfaceType;

		private int pressX;

		private int pressY;

		public static int chatScrollAmount;

		public final int[] expectedCRCs;

		protected int[] menuActionCmd2;

		protected int[] menuActionCmd3;

		public int[] menuActionID;

		protected int[] menuActionCmd1;

		public Sprite[] headIcons;

		public Sprite[] skullIcons;

		public Sprite[] headIconsHint;

		private static int anInt1097; // Cannot find refactor.

		protected int cutsceneLocalX;

		protected int cutsceneLocalY;

		int cutsceneZ;

		int cutsceneSpeed;

		int cutsceneSpeedMul;

		static boolean tabAreaAltered;

		protected int systemUpdateCycle;

		private GraphicsBuffer aRSImageProducer_1107;

		GraphicsBuffer aRSImageProducer_1109;

		static int anInt1117;

		public static String inputMessage;

		public Sprite compass;

		public Sprite mapEdgeMarker;

		public static Player myPlayer;

		protected final String[] atPlayerActions;

		protected final boolean[] atPlayerArray;

		protected final int[][][] regionChunkUIDs;

		private int cameraOffsetY;

		public int menuActionRow;

		protected static int anInt1134; // Cannot find refactor.

		protected int spellSelected;

		protected int spellIdSentToServer; // Cannot find refactor.

		protected int spellUsableOn;

		protected String spellTooltip;

		Sprite[] objectIcon;

		protected boolean regionIsRestricted;

		private static int anInt1142; // Cannot find refactor.

		private static boolean dialogueOptionsShowing;

		public Sprite[] crosses;

		public static boolean musicEnabled = true;

		@SuppressWarnings("unused")
		private int unreadMessages;

		protected static int anInt1155;

		private static boolean loggedIn;

		private boolean canMute;

		boolean loadingReceivedMap;

		protected boolean inCutsceneMode;

		static int loopCycle;

		static final String validUserPassChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"\243$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

		GraphicsBuffer inventoryBackImage;

		GraphicsBuffer mapBackImage;

		GraphicsBuffer inGameScreen;

		GraphicsBuffer chatBackImage;

		int daysSinceRecovChange;

		RSSocket socketStream;

		int minimapZoom;

		public String myUsername;

		public String myPassword;

		protected static int anInt1175; // Cannot find refactor.

		private boolean genericLoadingError;

		public int reportAbuseInterfaceID;

		protected NodeList objects;

		public int[] chatOffsets;

		public int[] sidebarOffsets;

		public int[] viewportOffsets;

		protected byte[][] objectScapeData;

		public int chaseCameraPitch;

		int viewRotation;

		private int cameraYawTranslate;

		public int cameraPitchTranslate;

		protected static int anInt1188; // Cannot find refactor.

		/**
		 * This is changed when bank interface is opened, so the inventory tab is displayed.
		 */
		private static int invOverlayInterfaceID;

		public Stream stream;

		static int splitPrivateChat;

		final Background[] mapBack;

		public String[] menuActionName;

		protected final int[] anIntArray1203; // Cannot find refactor.

		public static int CameraPos1 = 3;

		/**
		 * Distance of camera. 600 is default.
		 */
		public static int CameraPos2 = 600;

		public final static int resizableMaximumZoomIn = 425;

		static int[] sound;

		int minimapRotation;

		static int chatScrollHeight;

		/**
		 * bankSearchSent must be also reset if this is reset.
		 */
		public static String promptInput;

		private int clickCycle;

		public int[][][] intGroundArray;

		private long serverSeed;

		int loginScreenCursorPos;

		public Sprite[] crown;

		private long lastClickTime;

		private static int tabId;

		public int markedNpc;

		private static boolean inputTaken;

		public static int inputDialogState;

		public static int npcPetId = -1;

		protected static int anInt1226;

		public static int nextSong;

		public final int[] compassOffsets1;

		public CollisionMap[] collisionMap;

		public static int BIT_MASK[];

		int[] chunkUIDs;

		int[] objectScapeUIDs;

		int[] landScapeUIDs;

		public final int anInt1239 = 100; // Cannot find refactor.

		static int[] soundType;

		private boolean isDragging;

		protected int atInventoryLoopCycle;

		protected int atInventoryInterface;

		protected int atInventoryIndex;

		protected int atInventoryInterfaceType;

		protected byte[][] landScapeData;

		public int tradeMode;

		public int assistMode;

		public int showSpokenEffects;

		static int[] soundDelay;

		public int messagesAreIgnored;

		private final boolean rsAlreadyLoaded;

		private int useOneMouseButton;

		private boolean welcomeScreenRaised;

		private static boolean messagePromptRaised;

		public byte[][][] byteGroundArray;

		protected int previousSong;

		int destX;

		int destY;

		public Sprite landImage;

		int anInt1264; // Cannot find refactor.

		public int sceneCycle;

		private String loginMessage1;

		int anInt1268; // Cannot find refactor.

		int anInt1269; // Cannot find refactor.

		public TextDrawingArea smallText;

		public TextDrawingArea smallHit;

		public RSFont newSmallFont, newRegularFont, newBoldFont;

		public TextDrawingArea bigHit;

		public TextDrawingArea aTextDrawingArea_1271;

		public TextDrawingArea chatTextDrawingArea;

		public static int backDialogID;

		private int cameraOffsetX;

		private int[] bigX;

		private int[] bigY;

		protected int itemSelected;

		protected int anInt1283; // Cannot find refactor.

		protected int anInt1284; // Cannot find refactor.

		protected int anInt1285; // Cannot find refactor.

		protected String selectedItemName;

		public int publicChatMode;

		private static int anInt1288; // Cannot find refactor.

		public static int anInt1290; // Cannot find refactor.

		public int drawCount;

		public int fullscreenInterfaceID;

		public int anInt1044; // Cannot find refactor.

		public int anInt1129; // Cannot find refactor.

		public int anInt1315; // Cannot find refactor.

		public int anInt1500; // Cannot find refactor.

		public int menuHoveredTimer; // Cannot find refactor.

		public int[] fullScreenTextureArray;

		public static boolean logOutHover;

		public static int[] tabInterfaceId = {-1, -1, -1, -1, -1, -1, -1, 2449, -1, -1, -1, -1, -1, 18128, 2449, 2449};

		/**
		 * Load custom objects.
		 * <p>
		 * These objects are automatically clipped for manual walking and not player following. For the player following part, it will have to be added manually server sided.
		 */
		private void loadCustomObjects()
		{

				for (int i = 0; i < RemovedObjects.removeObjects.length; i++)
				{
						addObject(-1, RemovedObjects.removeObjects[i][0], RemovedObjects.removeObjects[i][1], 1, 10, RemovedObjects.removeObjects[i][2]);
				}
				removeObject(-1, 3090, 3508, 0, 5, 0, 1); // Removed window at Edgeville building.
				removeObject(-1, 3091, 3508, 0, 5, 0, 1); // Removed window at Edgeville building.
				removeObject(-1, 3090, 3512, 0, 5, 0, 1); // Removed window at Edgeville building.
				removeObject(-1, 3091, 3512, 0, 5, 0, 1); // Removed window at Edgeville building.
				removeObject(-1, 3092, 3514, 0, 5, 0, 1); // Removed window at Edgeville building.
				removeObject(-1, 3092, 3513, 0, 5, 0, 1); // Removed window at Edgeville building.
				removeObject(-1, 3090, 3509, 0, 0, 0, 0); // Removed wall at Edgeville building.
				removeObject(-1, 3090, 3510, 0, 0, 0, 0); // Removed wall at Edgeville building.
				removeObject(-1, 3094, 3511, 0, 22, 0, 3); // Removed hay on the floor at Edgeville building.
				removeObject(-1, 3095, 3510, 0, 22, 0, 3); // Removed hay on the floor at Edgeville building.
				removeObject(-1, 3097, 3513, 0, 22, 0, 3); // Removed hay on the floor at Edgeville building.
				removeObject(-1, 3097, 3510, 0, 22, 0, 3); // Removed hay on the floor at Edgeville building.
				removeObject(-1, 3098, 3508, 0, 22, 0, 3); // Removed hay on the floor at Edgeville building.
				removeObject(-1, 3099, 3511, 0, 22, 0, 3); // Removed hay on the floor at Edgeville building.
				addObject(20839, 3091, 3509, 0, 10, 0); // Energy barrier at Edgeville.
				addObject(29150, 3099, 3507, 1, 10, 0); // Altar of the occult.
				addObject(2640, 3093, 3513, 2, 10, 0); // Altar.
				addObject(3194, 3090, 3507, 3, 10, 0); // Chest.
				addObject(3194, 3092, 3514, 0, 10, 0); // Chest.
				addObject(3194, 3080, 3514, 0, 10, 0); // Chest.
				addObject(29300, 3090, 3512, 3, 10, 0); // Box of health.
				addObject(11, 3097, 3507, 0, 10, 0); // Ladder.
				addObject(27277, 3097, 3513, 0, 10, 0); // Blood key chest.

				addObject(14841, 2148, 3864, 0, 10, 0); // Portal at Astral altar
				addObject(14841, 1727, 3825, 0, 10, 0); // Portal at Blood altar
				addObject(14841, 1820, 3862, 0, 10, 0); // Portal at Soul altar

				// Ores at Level 6 wilderness in Edgeville.
				addObject(7489, 3103, 3565, 0, 10, 0);
				addObject(7489, 3103, 3566, 0, 10, 0);
				addObject(7489, 3104, 3567, 0, 10, 0);
				addObject(7489, 3105, 3569, 0, 10, 0);
				addObject(7489, 3104, 3570, 0, 10, 0);

				removeObject(-1, 3085, 3509, 0, 0, 0, 0); // Removed wall at General store building.
				removeObject(-1, 3085, 3510, 0, 0, 0, 0); // Removed wall at General store building.
				removeObject(-1, 3084, 3510, 0, 4, 0, 1); // Removed shelf at General store building.
				removeObject(-1, 3084, 3511, 0, 4, 0, 1); // Removed shelf at General store building.
				removeObject(-1, 3084, 3512, 0, 4, 0, 1); // Removed shelf at General store building.
				removeObject(-1, 3084, 3509, 0, 4, 0, 1); // Removed painting at General store building.
				removeObject(-1, 3085, 3508, 0, 4, 0, 1); // Removed window at General store building.
				removeObject(-1, 3084, 3508, 0, 4, 0, 1); // Removed window at General store building.
				addObject(20839, 3084, 3509, 2, 10, 0); // Energy barrier at Edgeville.

				// Gates and fences removed.
				boolean gates = true;
				if (gates)
				{
						removeObject(-1, 3008, 3008, 0, 0, 0, 0);
						removeObject(-1, 3008, 3008, 0, 0, 0, 0);
						removeObject(-1, 3008, 3849, 0, 0, 0, 0);
						removeObject(-1, 3008, 3849, 0, 0, 0, 0);
						removeObject(-1, 3008, 3850, 0, 0, 0, 0);
						removeObject(-1, 2947, 3904, 0, 0, 0, 0);
						removeObject(-1, 2948, 3904, 0, 0, 0, 0);
						removeObject(-1, 3224, 3904, 0, 0, 0, 0);
						removeObject(-1, 3225, 3904, 0, 0, 0, 0);
						removeObject(-1, 3336, 3896, 0, 0, 0, 0);
						removeObject(-1, 3337, 3896, 0, 0, 0, 0);
						removeObject(-1, 2958, 3821, 0, 0, 0, 0);
						removeObject(-1, 2958, 3820, 0, 0, 0, 0);
						removeObject(-1, 3201, 3856, 0, 0, 0, 0);
						removeObject(-1, 3202, 3856, 0, 0, 0, 0);
						removeObject(-1, 2852, 3552, 0, 0, 1, 0);
						removeObject(-1, 2852, 3551, 0, 0, 1, 0);
						removeObject(-1, 3426, 3555, 0, 0, 1, 0);
						removeObject(-1, 3427, 3555, 0, 0, 1, 0);
						removeObject(-1, 3296, 3428, 0, 0, 0, 0);
						removeObject(-1, 3296, 3429, 0, 0, 0, 0);
						removeObject(-1, 3021, 3631, 0, 0, 0, 0);
						removeObject(-1, 3021, 3632, 0, 0, 0, 0);
						removeObject(-1, 3444, 3458, 0, 0, 0, 0);
						removeObject(-1, 3443, 3458, 0, 0, 0, 0);
						removeObject(-1, 3207, 3214, 0, 0, 0, 0);
						removeObject(-1, 3253, 3267, 0, 0, 0, 0);
						removeObject(-1, 3253, 3266, 0, 0, 0, 0);
						removeObject(-1, 3236, 3295, 0, 0, 0, 0);
						removeObject(-1, 3236, 3296, 0, 0, 0, 0);
						removeObject(-1, 3040, 10308, 0, 0, 0, 0);
						removeObject(-1, 3040, 10307, 0, 0, 0, 0);
						removeObject(-1, 3022, 10312, 0, 0, 0, 0);
						removeObject(-1, 3022, 10311, 0, 0, 0, 0);
						removeObject(-1, 3044, 10342, 0, 0, 0, 0);
						removeObject(-1, 3044, 10341, 0, 0, 0, 0);
						removeObject(-1, 2898, 9831, 0, 0, 0, 0);
						removeObject(-1, 2898, 9832, 0, 0, 0, 0);
						removeObject(-1, 2924, 9803, 0, 0, 0, 0);
						removeObject(-1, 2854, 3370, 0, 0, 0, 0);
						removeObject(-1, 2854, 3371, 0, 0, 0, 0);

						// Adding gates opened.
						addObject(1728, 3008, 3849, 3, 0, 0);
						addObject(1727, 3008, 3850, 1, 0, 0);
						addObject(1727, 2947, 3904, 0, 0, 0);
						addObject(1728, 2948, 3904, 2, 0, 0);
						addObject(1727, 3224, 3904, 0, 0, 0);
						addObject(1728, 3225, 3904, 2, 0, 0);
						addObject(1727, 3336, 3896, 0, 0, 0);
						addObject(1728, 3337, 3896, 2, 0, 0);
						addObject(1524, 2957, 3821, 1, 0, 0);
						addObject(1521, 2957, 3820, 3, 0, 0);
						addObject(1727, 3201, 3856, 0, 0, 0);
						addObject(1728, 3202, 3856, 2, 0, 0);
						addObject(14752, 3022, 3631, 3, 0, 0);
						addObject(14751, 3022, 3632, 1, 0, 0);
						addObject(1728, 3040, 10308, 1, 0, 0);
						addObject(1727, 3040, 10307, 3, 0, 0);
						addObject(1728, 3044, 10342, 1, 0, 0);
						addObject(1727, 3044, 10341, 3, 0, 0);
						addObject(1728, 3022, 10312, 1, 0, 0);
						addObject(1727, 3022, 10311, 3, 0, 0);
						addObject(1568, 2898, 9831, 3, 0, 0);
						addObject(1569, 2898, 9832, 1, 0, 0);
						addObject(2623, 2924, 9803, 1, 0, 0);

						addObject(1728, 3104, 9910, 0, 0, 0);
						addObject(1727, 3104, 9909, 0, 0, 0);

						addObject(1728, 3131, 9918, 3, 0, 0);
						addObject(1727, 3132, 9918, 3, 0, 0);

						addObject(1728, 3105, 9945, 3, 0, 0);
						addObject(1727, 3106, 9945, 3, 0, 0);

						addObject(1728, 3146, 9871, 0, 0, 0);
						addObject(1727, 3146, 9870, 0, 0, 0);
				}


				// Remove web on type 10 that clips the tile infront of it on the client.
				// Then add a web on type 0.
				removeObject(-1, 2565, 3124, 0, 10, 0, 2);
				addObject(733, 2565, 3124, 2, 0, 0);
				removeObject(-1, 2569, 3118, 0, 10, 0, 2);
				addObject(733, 2569, 3118, 1, 0, 0);
				removeObject(-1, 2570, 3118, 0, 10, 0, 2);
				addObject(733, 2570, 3118, 1, 0, 0);
				removeObject(-1, 2574, 3124, 0, 10, 0, 2);
				addObject(733, 2574, 3124, 0, 0, 0);
				removeObject(-1, 3030, 3852, 0, 10, 0, 2);
				addObject(733, 3030, 3852, 2, 0, 0);
				removeObject(-1, 3115, 3859, 0, 10, 0, 2);
				addObject(733, 3115, 3859, 1, 0, 0);
				removeObject(-1, 3092, 3957, 0, 10, 0, 2);
				addObject(733, 3092, 3957, 2, 0, 0);
				removeObject(-1, 3095, 3957, 0, 10, 0, 2);
				addObject(733, 3095, 3957, 0, 0, 0);
				removeObject(-1, 3105, 3958, 0, 10, 0, 2);
				addObject(733, 3105, 3958, 3, 0, 0);
				removeObject(-1, 3106, 3958, 0, 10, 0, 2);
				addObject(733, 3106, 3958, 3, 0, 0);
				removeObject(-1, 3147, 3727, 0, 10, 0, 2);
				addObject(733, 3147, 3727, 1, 0, 0);
				removeObject(-1, 3163, 3736, 0, 10, 0, 2);
				addObject(733, 3163, 3736, 0, 0, 0);
				removeObject(-1, 3183, 3733, 0, 10, 0, 2);
				addObject(733, 3183, 3733, 1, 0, 0);
				removeObject(-1, 3158, 3951, 0, 10, 0, 2);
				addObject(733, 3158, 3951, 1, 0, 0);
				removeObject(-1, 3210, 9898, 0, 10, 0, 2);
				addObject(733, 3210, 9898, 1, 0, 0);

				addObject(563, 3093, 3507, 2, 10, 0); // Highscores Statue.
				addObject(7800, 3095, 3507, 2, 10, 0); // Completionist stand.

				addObject(3194, 3381, 3269, 2, 10, 0); // Opened chest at duel arena
				addObject(3194, 3382, 3270, 1, 10, 0); // Opened chest at duel arena


				addObject(16680, 3088, 3571, 3, 10, 0); // Ladder to go down, at the top of the wild mountain to do orbs.

				// Entrana.
				addObject(1753, 2848, 3332, 0, 10, 0); // Yew tree
				addObject(1761, 2853, 3338, 0, 10, 0); // Magic tree
				addObject(1760, 2850, 3338, 0, 10, 0); // Willow tree
				addObject(1751, 2852, 3332, 0, 10, 0); // Oak tree.
				addObject(6943, 2860, 3338, 0, 10, 0); // Bank booth at Entrana.
				addObject(6943, 2861, 3338, 0, 10, 0); // Bank booth at Entrana.
				addObject(2031, 2833, 3349, 2, 10, 0); // Anvil at Entrana.

				addObject(6943, 3658, 3513, 2, 10, 0); // Bank booth at Zombie waiting room.
				addObject(6948, 2911, 4832, 0, 10, 0); // Deposit box at Rune essence mine
				addObject(6943, 2192, 3250, 2, 10, 0); // Donator Zone Bank
				addObject(14897, 2857, 3380, 0, 10, 0); // Altar (Runecrafting).

				// Falador dwarf mine.
				addObject(24009, 3037, 9746, 1, 10, 0); // Furnace.
				addObject(2031, 3042, 9746, 1, 10, 0); // Anvil at Falador mining underground.
				addObject(6943, 3043, 9736, 0, 10, 0);// Bank booth.
				addObject(7494, 3044, 9753, 0, 10, 0); // Runite ore
				addObject(7494, 3048, 9754, 0, 10, 0); // Runite ore
				addObject(7494, 3048, 9747, 0, 10, 0); // Runite ore
				addObject(7494, 3045, 9744, 0, 10, 0); // Runite ore
				addObject(7494, 3048, 9743, 0, 10, 0); // Runite ore
				addObject(7493, 3046, 9735, 0, 10, 0); // Adamant ore
				addObject(7493, 3047, 9737, 0, 10, 0); // Adamant ore
				addObject(7493, 3049, 9735, 0, 10, 0); // Adamant ore
				addObject(7493, 3049, 9734, 0, 10, 0); // Adamant ore
				addObject(7493, 3049, 9740, 0, 10, 0); // Adamant ore
				addObject(7492, 3045, 9741, 0, 10, 0); // Mithril ore
				addObject(7492, 3045, 9738, 0, 10, 0); // Mithril ore
				addObject(7492, 3046, 9742, 0, 10, 0); // Mithril ore
				addObject(7492, 3043, 9743, 0, 10, 0); // Mithril ore
				addObject(7489, 3032, 9741, 0, 10, 0); // Coal ore
				addObject(7489, 3034, 9739, 0, 10, 0); // Coal ore
				addObject(7455, 3035, 9742, 0, 10, 0); // Iron ore
				addObject(7455, 3037, 9739, 0, 10, 0); // Iron ore
				addObject(7455, 3037, 9735, 0, 10, 0); // Iron ore
				addObject(7455, 3035, 9734, 0, 10, 0); // Iron ore
				addObject(7485, 3032, 9737, 0, 10, 0); // Tin ore
				addObject(7485, 3031, 9739, 0, 10, 0); // Tin ore
				addObject(7485, 3028, 9739, 0, 10, 0); // Tin ore
				addObject(7484, 3028, 9737, 0, 10, 0); // Copper ore
				addObject(7484, 3029, 9734, 0, 10, 0); // Copper ore
				addObject(7484, 3032, 9735, 0, 10, 0); // Copper ore
		}

		@SuppressWarnings("unused")
		private static void openInterface(int interfaceID)
		{
				resetInterfaceSequence(interfaceID);
				if (getInvOverlayInterfaceID() != -1)
				{
						setInvOverlayInterfaceID(-1);
						setTabAreaAltered(true);
				}
				if (backDialogID != -1)
				{
						backDialogID = -1;
						setInputTaken(true);
				}
				if (inputDialogState != 0)
				{
						inputDialogState = 0;
						setInputTaken(true);
				}
				setInterfaceDisplayed(interfaceID);
				setDialogueOptionsShowing(false);
		}

		public final String methodR(int j)
		{
				if (j >= 0 && j < 10000)
						return String.valueOf(j);
				if (j >= 10000 && j < 10000000)
						return j / 1000 + "K";
				if (j >= 10000000 && j < 999999999)
						return j / 1000000 + "M";
				if (j >= 999999999)
						return "*";
				else
						return "?";
		}

		public String indexLocation(int cacheIndex, int index)
		{
				return ClientConstants.MAIN_CACHE_LOCATION + "index" + cacheIndex + "/" + (index != -1 ? index + ".gz" : "");
		}

		void repackCacheIndex(int cacheIndex)
		{
				int indexLength = new File(indexLocation(cacheIndex, -1)).listFiles().length;
				File[] file = new File(indexLocation(cacheIndex, -1)).listFiles();
				try
				{
						for (int index = 0; index < indexLength; index++)
						{
								String fileString = getFileNameWithoutExtension(file[index].toString());
								if (!fileString.contains("AllInOneZipper"))
								{
										int fileIndex = Integer.parseInt(fileString);
										byte[] data = fileToByteArray(cacheIndex, fileIndex);
										if (data != null && data.length > 0)
										{
												decompressors[cacheIndex].method234(data.length, data, fileIndex);
												Utility.print("Repacked " + fileIndex + ".");
										}
										else
										{
												Utility.print("Unable to locate index " + fileIndex + ".");
										}
								}
						}
				}
				catch (Exception e)
				{
						Utility.print("Error packing cache index " + cacheIndex + ".");
				}
				Utility.print("Finished repacking " + cacheIndex + ".");
		}

		public byte[] fileToByteArray(int cacheIndex, int index)
		{
				try
				{
						if (indexLocation(cacheIndex, index).length() <= 0 || indexLocation(cacheIndex, index) == null)
						{
								return null;
						}
						File file = new File(indexLocation(cacheIndex, index));
						byte[] fileData = new byte[(int) file.length()];
						FileInputStream fis = new FileInputStream(file);
						fis.read(fileData);
						fis.close();
						return fileData;
				}
				catch (Exception e)
				{
						return null;
				}
		}

		public static String capitalize(String s)
		{
				for (int i = 0; i < s.length(); i++)
				{
						if (i == 0)
						{
								s = String.format("%s%s", Character.toUpperCase(s.charAt(0)), s.substring(1));
						}
						if (!Character.isLetterOrDigit(s.charAt(i)))
						{
								if (i + 1 < s.length())
								{
										s = String.format("%s%s%s", s.subSequence(0, i + 1), Character.toUpperCase(s.charAt(i + 1)), s.substring(i + 2));
								}
						}
				}
				return s;
		}

		public static final byte[] ReadFile(String s)
		{
				try
				{
						byte abyte0[];
						File file = new File(s);
						int i = (int) file.length();
						abyte0 = new byte[i];
						DataInputStream datainputstream = new DataInputStream(new BufferedInputStream(new FileInputStream(s)));
						datainputstream.readFully(abyte0, 0, i);
						datainputstream.close();
						return abyte0;
				}
				catch (Exception e)
				{
						Utility.print((new StringBuilder()).append("Read Error: ").append(s).toString());
						return null;
				}
		}

		private boolean menuHasAddFriend(int j)
		{
				if (j < 0)
						return false;
				int k = menuActionID[j];
				if (k >= 2000)
						k -= 2000;
				return k == 337;
		}

		static final GraphicsBuffer constructGraphicsBuffer(int x, int y, Component component)
		{
				GraphicsBuffer graphicClass;
				try
				{
						Class<?> var_class = Class.forName("BasicGraphicsBuffer");
						GraphicsBuffer instance = (GraphicsBuffer) var_class.newInstance();
						instance.init(component, x, y, false);
						graphicClass = instance;
				}
				catch (Throwable throwable)
				{
						GraphicsBufferProducing graphicInstance = new GraphicsBufferProducing();
						graphicInstance.init(component, x, y, false);
						return graphicInstance;
				}
				return graphicClass;
		}

		public void startRunnable(Runnable runnable, int i)
		{
				if (i > 10)
						i = 10;
				if (SignLink.mainapp != null)
				{
						SignLink.startthread(runnable, i);
				}
				else
				{
						super.startRunnable(runnable, i);
				}
		}

		public Socket openSocket(int port) throws IOException
		{
				return new Socket(InetAddress.getByName(server), port);
		}

		private boolean processMenuClick()
		{
				if (activeInterfaceType != 0)
				{
						return false;
				}
				int j = super.getClickMode3();

				if (menuOpen)
				{
						if (j != 1)
						{
								int x = super.mouseX;
								int y = super.mouseY;

								if (getMenuScreenArea() == 0)
								{
										x -= 4;
										y -= 4;
								}
								if (getMenuScreenArea() == 1)
								{
										x -= 516;
										y -= 168;
								}
								if (getMenuScreenArea() == 2)
								{
										x -= 5;
										y -= 338;
								}
								if (getMenuScreenArea() == 3)
								{
										x -= 516;
										y -= 0;
								}
								if (x < menuOffsetX - 10 || x > menuOffsetX + menuWidth + 10 || y < menuOffsetY - 10 || y > menuOffsetY + menuHeight + 10)
								{
										menuOpen = false;
										if (getMenuScreenArea() == 2)
										{
												setInputTaken(true);
										}
								}
						}
						if (j == 1)
						{
								int l = menuOffsetX;
								int k1 = menuOffsetY;
								int i2 = menuWidth;
								int x = super.saveClickX;
								int y = super.saveClickY;
								if (getMenuScreenArea() == 0)
								{
										x -= 4;
										y -= 4;
								}
								if (getMenuScreenArea() == 1)
								{
										x -= 516; // 519
										y -= 168;
								}
								if (getMenuScreenArea() == 2)
								{
										x -= 5; // 17
										y -= 338;
								}
								if (getMenuScreenArea() == 3)
								{
										x -= 516; // 519
										y -= 0;
								}

								//TODO #FULLSCREEN ADJUST menu right clicking action.
								if (!isFixedScreen())
								{
										y += 4;
								}
								int i3 = -1;
								for (int j3 = 0; j3 < menuActionRow; j3++)
								{
										int k3 = k1 + 31 + (menuActionRow - 1 - j3) * 15;
										if (x > l && x < l + i2 && y > k3 - 13 && y < k3 + 3)
										{
												i3 = j3;
										}
								}
								if (i3 != -1)
								{
										Action.doAction(i3);
								}
								menuOpen = false;
								if (getMenuScreenArea() == 2)
								{
										setInputTaken(true);
								}
						}
						return true;
				}
				else
				{
						int indexSpot = menuActionRow;
						if (j == 1 && menuActionRow > 0)
						{
								int i1 = menuActionID[indexSpot - 1];
								if (i1 == 632 || i1 == 78 || i1 == 867 || i1 == 431 || i1 == 53 || i1 == 74 || i1 == 454 || i1 == 539 || i1 == 493 || i1 == 847 || i1 == 447 || i1 == 1125)
								{
										int l1 = menuActionCmd2[indexSpot - 1];
										int j2 = menuActionCmd3[indexSpot - 1];
										RSInterface class9 = RSInterface.interfaceCache[j2];
										if (class9.itemsAreDraggable || class9.itemsAreSwappable)
										{
												isDragging = false;
												dragCycle = 0;
												focusedDragWidget = j2;
												dragFromSlot = l1;
												activeInterfaceType = 2;
												pressX = super.saveClickX;
												pressY = super.saveClickY;
												if (RSInterface.interfaceCache[j2].parentId == getInterfaceDisplayed())
														activeInterfaceType = 1;
												if (RSInterface.interfaceCache[j2].parentId == backDialogID)
														activeInterfaceType = 3;
												return true;
										}
								}
						}
						if (j == 1 && (useOneMouseButton == 1 || menuHasAddFriend(menuActionRow - 1)) && menuActionRow > 2)
						{
								j = 2;
						}
						if (j == 1 && menuActionRow > 0)
						{
								Action.doAction(indexSpot - 1);
						}
						if (j == 2 && menuActionRow > 0)
						{
								determineMenuSize();
						}
						return false;
				}

		}

		public static int totalRead = 0;

		public static String getFileNameWithoutExtension(String fileName)
		{
				File tmpFile = new File(fileName);
				tmpFile.getName();
				int whereDot = tmpFile.getName().lastIndexOf('.');
				if (0 < whereDot && whereDot <= tmpFile.getName().length() - 2)
				{
						return tmpFile.getName().substring(0, whereDot);
				}
				return "";
		}

		public static void preloadModels()
		{
				File file = new File(ClientConstants.CACHE_LOCATION + "raw/");
				File[] fileArray = file.listFiles();
				for (int y = 0; y < fileArray.length; y++)
				{
						String s = fileArray[y].getName();
						if (s.endsWith(".dat"))
						{
								int number = Integer.parseInt(s.replace(".dat", ""));
								if (number >= 65000)
								{
										continue;
								}
								byte[] buffer = ReadFile(ClientConstants.CACHE_LOCATION + "raw/" + s);
								Model.method460(buffer, Integer.parseInt(getFileNameWithoutExtension(s)));
						}
				}
		}


		public int mapX, mapY;

		/**
		 * @param objectId
		 *        The object identity
		 * @param x
		 *        Location of the object, x-axis.
		 * @param y
		 *        Location of the object, y-axis.
		 * @param face
		 *        Where the object will face.
		 * @param type
		 *        The type of the object? Keep at 10.
		 * @param height
		 *        The height of the object.
		 */
		public void addObject(int objectId, int x, int y, int face, int type, int height)
		{
				int mX = mapX - 6;
				int mY = mapY - 6;
				int x2 = x - (mX * 8);
				int y2 = y - (mY * 8);
				int i15 = 40 >> 2;
				int l17 = ClientConstants.anIntArray1177[i15];
				if (y2 > 0 && y2 < 103 && x2 > 0 && x2 < 103)
				{
						addTemporaryObject(-1, objectId, face, l17, y2, type, height, x2, 0);
				}
		}

		public void removeObject(int objectId, int x, int y, int face, int type, int height, int other)
		{
				int mX = mapX - 6;
				int mY = mapY - 6;
				int x2 = x - (mX * 8);
				int y2 = y - (mY * 8);
				if (y2 > 0 && y2 < 103 && x2 > 0 && x2 < 103)
				{

						addTemporaryObject(-1, objectId, face, other, y2, type, height, x2, 0);
				}
		}

		public void loadScene()
		{
				try
				{
						loadCustomObjects();
						lastPlane = -1;
						spotanims.removeAll();
						projectiles.removeAll();
						Rasterizer.clearTextures();
						unlinkMRUNodes();
						landScape.initToNull();
						System.gc();
						for (int i = 0; i < 4; i++)
								collisionMap[i].reset();

						for (int l = 0; l < 4; l++)
						{
								for (int k1 = 0; k1 < 104; k1++)
								{
										for (int j2 = 0; j2 < 104; j2++)
												byteGroundArray[l][k1][j2] = 0;
								}

						}

						ObjectManager objectManager = new ObjectManager(byteGroundArray, intGroundArray);
						int k2 = objectScapeData.length;
						stream.createFrame(0);
						if (!loadingReceivedMap)
						{
								for (int i3 = 0; i3 < k2; i3++)
								{
										int i4 = (chunkUIDs[i3] >> 8) * 64 - baseX;
										int k5 = (chunkUIDs[i3] & 0xff) * 64 - baseY;
										byte abyte0[] = objectScapeData[i3];
										if (abyte0 != null)
										{
												objectManager.loadLand2(abyte0, k5, i4, (regionX - 6) * 8, (regionY - 6) * 8, collisionMap);
										}
								}

								for (int j4 = 0; j4 < k2; j4++)
								{
										int l5 = (chunkUIDs[j4] >> 8) * 64 - baseX;
										int k7 = (chunkUIDs[j4] & 0xff) * 64 - baseY;
										byte abyte2[] = objectScapeData[j4];
										if (abyte2 == null && regionY < 800)
										{
												objectManager.sewEdges(k7, 64, 64, l5);
										}
								}

								anInt1097++;
								if (anInt1097 > 160)
								{
										anInt1097 = 0;
										stream.createFrame(238);
										stream.writeWordBigEndian(96);
								}
								stream.createFrame(0);
								for (int i6 = 0; i6 < k2; i6++)
								{
										byte abyte1[] = landScapeData[i6];
										if (abyte1 != null)
										{
												int l8 = (chunkUIDs[i6] >> 8) * 64 - baseX;
												int k9 = (chunkUIDs[i6] & 0xff) * 64 - baseY;
												objectManager.loadObjects(l8, collisionMap, k9, landScape, abyte1);
										}
								}

						}
						if (loadingReceivedMap)
						{
								for (int j3 = 0; j3 < 4; j3++)
								{
										for (int k4 = 0; k4 < 13; k4++)
										{
												for (int j6 = 0; j6 < 13; j6++)
												{
														int l7 = regionChunkUIDs[j3][k4][j6];
														if (l7 != -1)
														{
																int i9 = l7 >> 24 & 3;
																int l9 = l7 >> 1 & 3;
																int j10 = l7 >> 14 & 0x3ff;
																int l10 = l7 >> 3 & 0x7ff;
																int j11 = (j10 / 8 << 8) + l10 / 8;
																for (int l11 = 0; l11 < chunkUIDs.length; l11++)
																{
																		if (chunkUIDs[l11] != j11 || objectScapeData[l11] == null)
																		{
																				continue;
																		}
																		objectManager.loadLand1(i9, l9, collisionMap, k4 * 8, (j10 & 7) * 8, objectScapeData[l11], (l10 & 7) * 8, j3, j6 * 8);
																		break;
																}

														}
												}

										}

								}

								for (int l4 = 0; l4 < 13; l4++)
								{
										for (int k6 = 0; k6 < 13; k6++)
										{
												int i8 = regionChunkUIDs[0][l4][k6];
												if (i8 == -1)
												{
														objectManager.sewEdges(k6 * 8, 8, 8, l4 * 8);
												}
										}

								}

								stream.createFrame(0);
								for (int l6 = 0; l6 < 4; l6++)
								{
										for (int j8 = 0; j8 < 13; j8++)
										{
												for (int j9 = 0; j9 < 13; j9++)
												{
														int i10 = regionChunkUIDs[l6][j8][j9];
														if (i10 != -1)
														{
																int k10 = i10 >> 24 & 3;
																int i11 = i10 >> 1 & 3;
																int k11 = i10 >> 14 & 0x3ff;
																int i12 = i10 >> 3 & 0x7ff;
																int j12 = (k11 / 8 << 8) + i12 / 8;
																for (int k12 = 0; k12 < chunkUIDs.length; k12++)
																{
																		if (chunkUIDs[k12] != j12 || landScapeData[k12] == null)
																		{
																				continue;
																		}
																		objectManager.loadObjects(collisionMap, landScape, k10, j8 * 8, (i12 & 7) * 8, l6, landScapeData[k12], (k11 & 7) * 8, i11, j9 * 8);
																		break;
																}

														}
												}

										}

								}

						}
						stream.createFrame(0);
						objectManager.createLand(collisionMap, landScape);
						inGameScreen.initDrawingArea();
						stream.createFrame(0);
						int k3 = ObjectManager.minPlane;
						if (k3 > plane)
						{
								k3 = plane;
						}
						if (k3 < plane - 1)
						{
								k3 = plane - 1;
						}
						if (lowMem)
						{
								landScape.setPlane(ObjectManager.minPlane);
						}
						else
						{
								landScape.setPlane(0);
						}
						for (int i5 = 0; i5 < 104; i5++)
						{
								for (int i7 = 0; i7 < 104; i7++)
								{
										spawnGroundItem(i5, i7);
								}

						}

						anInt1051++;
						if (anInt1051 > 98)
						{
								anInt1051 = 0;
								stream.createFrame(150);
						}
						handleSpawnedObjects();
				}
				catch (Exception exception)
				{
				}
				ObjectDefinition.mruNodes1.unlinkAll();
				if (super.gameFrame != null)
				{
						stream.createFrame(210);
						stream.writeDWord(0x3f008edd);
				}
				System.gc();
				Rasterizer.setupTextures();
				onDemandFetcher.clearPassive();
				int k = (regionX - 6) / 8 - 1;
				int j1 = (regionX + 6) / 8 + 1;
				int i2 = (regionY - 6) / 8 - 1;
				int l2 = (regionY + 6) / 8 + 1;
				if (regionIsRestricted)
				{
						k = 49;
						j1 = 50;
						i2 = 49;
						l2 = 50;
				}
				for (int l3 = k; l3 <= j1; l3++)
				{
						for (int j5 = i2; j5 <= l2; j5++)
						{
								if (l3 == k || l3 == j1 || j5 == i2 || j5 == l2)
								{
										int j7 = onDemandFetcher.getRegionUID(0, j5, l3);
										if (j7 != -1)
										{
												onDemandFetcher.sendPassively(j7, 3);
										}
										int k8 = onDemandFetcher.getRegionUID(1, j5, l3);
										if (k8 != -1)
										{
												onDemandFetcher.sendPassively(k8, 3);
										}
								}
						}

				}

		}

		private void unlinkMRUNodes()
		{
				ObjectDefinition.mruNodes1.unlinkAll();
				ObjectDefinition.mruNodes2.unlinkAll();
				EntityDefinition.mruNodes.unlinkAll();
				ItemDefinition.mruNodes2.unlinkAll();
				ItemDefinition.mruNodes1.unlinkAll();
				Player.mruNodes.unlinkAll();
				SpotAnim.aMRUNodes_415.unlinkAll();
		}

		private void createLandImage(int i)
		{
				int ai[] = landImage.myPixels;
				int j = ai.length;
				for (int k = 0; k < j; k++)
				{
						ai[k] = 0;
				}

				for (int l = 1; l < 103; l++)
				{
						int i1 = 24628 + (103 - l) * 512 * 4;
						for (int k1 = 1; k1 < 103; k1++)
						{
								if ((byteGroundArray[i][k1][l] & 0x18) == 0)
								{
										landScape.drawMinimapTile(ai, i1, i, k1, l);
								}
								if (i < 3 && (byteGroundArray[i + 1][k1][l] & 8) != 0)
								{
										landScape.drawMinimapTile(ai, i1, i + 1, k1, l);
								}
								i1 += 4;
						}

				}

				int j1 = 0xFFFFFF;
				int l1 = 0xee0000;
				landImage.method343();
				for (int i2 = 1; i2 < 103; i2++)
				{
						for (int j2 = 1; j2 < 103; j2++)
						{
								if ((byteGroundArray[i][j2][i2] & 0x18) == 0)
								{
										MiniMap.drawMinimapWall(this, i2, j1, j2, l1, i);
								}
								if (i < 3 && (byteGroundArray[i + 1][j2][i2] & 8) != 0)
								{
										MiniMap.drawMinimapWall(this, i2, j1, j2, l1, i + 1);
								}
						}

				}

				inGameScreen.initDrawingArea();
				objectIconCount = 0;
				for (int k2 = 0; k2 < 104; k2++)
				{
						for (int l2 = 0; l2 < 104; l2++)
						{
								int i3 = landScape.getGroundDecorationUID(plane, k2, l2);
								if (i3 != 0)
								{
										i3 = i3 >> 14 & 0x7fff;
										int j3 = ObjectDefinition.forID(i3).icon;
										if (j3 >= 0)
										{
												int k3 = k2;
												int l3 = l2;
												if (j3 != 22 && j3 != 29 && j3 != 34 && j3 != 36 && j3 != 46 && j3 != 47 && j3 != 48)
												{
														byte byte1 = 104;
														int ai1[][] = collisionMap[plane].flags;
														for (int i4 = 0; i4 < 10; i4++)
														{
																if (l3 < byte1 - 1 && l3 < l2 + 3 && (ai1[k3][l3 + 1] & 0x1280120) == 0)
																{
																		l3++;
																}
														}

												}
												objectIcon[objectIconCount] = mapFunctions[j3];
												objectIconX[objectIconCount] = k3;
												objectIconY[objectIconCount] = l3;
												objectIconCount++;
										}
								}
						}

				}

		}

		protected void spawnGroundItem(int i, int j)
		{
				NodeList class19 = groundArray[plane][i][j];
				if (class19 == null)
				{
						landScape.removeItemPile(plane, i, j);
						return;
				}
				int k = 0xfa0a1f01;
				Object obj = null;
				for (Item item = (Item) class19.reverseGetFirst(); item != null; item = (Item) class19.reverseGetNext())
				{
						ItemDefinition itemDef = ItemDefinition.forId(item.itemId);
						int value = ItemPrice.getDefinitions()[item.itemId] == null ? 1 : ItemPrice.getDefinitions()[item.itemId].itemPrice;

						// Bones.
						if (item.itemId == 536 || item.itemId == 526 || item.itemId == 530 || item.itemId == 532 || item.itemId == 534 || item.itemId == 2859 || item.itemId == 6729)
						{
								value = 0;
						}
						if (itemDef.stackable)
						{
								if (value > 200000000)
								{
										int price = value - 200000000;
										value = 200000000 + (price * (item.amount + 1));
								}
								else
								{
										value *= item.amount + 1;
								}
						}
						if (value > k)
						{
								k = value;
								obj = item;
						}
				}

				class19.insertTail(((Node) (obj)));
				Object obj1 = null;
				Object obj2 = null;
				for (Item class30_sub2_sub4_sub2_1 = (Item) class19.reverseGetFirst(); class30_sub2_sub4_sub2_1 != null; class30_sub2_sub4_sub2_1 = (Item) class19.reverseGetNext())
				{
						if (class30_sub2_sub4_sub2_1.itemId != ((Item) (obj)).itemId && obj1 == null)
						{
								obj1 = class30_sub2_sub4_sub2_1;
						}
						if (class30_sub2_sub4_sub2_1.itemId != ((Item) (obj)).itemId && class30_sub2_sub4_sub2_1.itemId != ((Item) (obj1)).itemId && obj2 == null)
						{
								obj2 = class30_sub2_sub4_sub2_1;
						}
				}

				int i1 = i + (j << 7) + 0x60000000;
				landScape.addItemPile(i, i1, ((SceneNode) (obj1)), getLand(plane, j * 128 + 64, i * 128 + 64), ((SceneNode) (obj2)), ((SceneNode) (obj)), plane, j);
		}

		private void drawNPCs(boolean flag)
		{
				for (int j = 0; j < npcCount; j++)
				{
						Npc npc = npcArray[npcIndices[j]];
						int k = 0x20000000 + (npcIndices[j] << 14);
						if (npc == null || !npc.isVisible() || npc.desc.aBoolean93 != flag)
								continue;
						int l = npc.x >> 7;
						int i1 = npc.y >> 7;
						if (l < 0 || l >= 104 || i1 < 0 || i1 >= 104)
						{
								continue;
						}
						if (npc.size == 1 && (npc.x & 0x7f) == 64 && (npc.y & 0x7f) == 64)
						{
								if (tileCycleMap[l][i1] == sceneCycle)
								{
										continue;
								}
								tileCycleMap[l][i1] = sceneCycle;
						}
						if (!npc.desc.interactable)
						{
								k += 0x80000000;
						}
						landScape.add(plane, npc.yaw, getLand(plane, npc.y, npc.x), k, npc.y, (npc.size - 1) * 64 + 60, npc.x, npc, npc.canRotate);
				}
		}

		private void buildInterfaceMenu(int i, RSInterface interfaceId, int mouseX, int l, int mouseY, int j1)
		{
				if (interfaceId == null || interfaceId.getType() != 0 || interfaceId.children == null || interfaceId.interfaceShown)
				{
						return;
				}
				if (mouseX < i || mouseY < l || mouseX > i + interfaceId.width || mouseY > l + interfaceId.height)
				{
						return;
				}
				int k1 = interfaceId.children.length;
				for (int l1 = 0; l1 < k1; l1++)
				{
						int i2 = interfaceId.childX[l1] + i;
						int j2 = (interfaceId.childY[l1] + l) - j1;
						RSInterface child = RSInterface.interfaceCache[interfaceId.children[l1]];
						i2 += child.offsetX;
						j2 += child.offsetY;
						if ((child.isMouseoverTriggered >= 0 || child.hoverColorDisabled != 0) && mouseX >= i2 && mouseY >= j2 && mouseX < i2 + child.width && mouseY < j2 + child.height)
						{
								if (child.isMouseoverTriggered >= 0)
								{

										frameFocusedInterface = child.isMouseoverTriggered;
								}
								else
								{
										frameFocusedInterface = child.id;
								}
						}

						if (child.getType() == 9 && mouseX >= i2 && mouseY >= j2 && mouseX < i2 + child.width && mouseY < j2 + child.height)
						{
								anInt1315 = child.id;
						}
						if (child.getType() == 0)
						{
								buildInterfaceMenu(i2, child, mouseX, j2, mouseY, child.scrollPosition);
								if (child.scrollMax > child.height)
								{
										handleScrollbarMouse(i2 + child.width, child.height, mouseX, mouseY, child, j2, true, child.scrollMax);
								}
						}
						else
						{
								if (child.atActionType == 1 && mouseX >= i2 && mouseY >= j2 && mouseX < i2 + child.width && mouseY < j2 + child.height)
								{
										boolean flag = false;
										if (child.actionType != 0)
										{
												flag = FriendSystem.buildFriendsListMenu(child, this);
										}
										if (!flag)
										{
												if (child.tooltips != null && child.tooltips.length > 0)
												{
														for (int u = child.tooltips.length - 1; u >= 0; u--)
														{
																if (ClientConfiguration.DEBUG_MODE)
																{
																		menuActionName[menuActionRow] = child.tooltips[u] + ", " + child.id;
																}
																else
																{
																		menuActionName[menuActionRow] = child.tooltips[u];
																}
																menuActionID[menuActionRow] = 315;
																menuActionCmd3[menuActionRow] = child.id + u;
																menuActionRow++;
														}
												}
												else
												{
														if (ClientConfiguration.DEBUG_MODE)
														{
																menuActionName[menuActionRow] = child.tooltip + ", " + child.id;
														}
														else
														{
																menuActionName[menuActionRow] = child.tooltip;
														}
														menuActionID[menuActionRow] = 315;
														menuActionCmd3[menuActionRow] = child.id;
														menuActionRow++;
												}
										}
								}
								if (child.atActionType == 2 && spellSelected == 0 && mouseX >= i2 && mouseY >= j2 && mouseX < i2 + child.width && mouseY < j2 + child.height)
								{
										String s = child.selectedActionName;
										if (s.indexOf(" ") != -1)
										{
												s = s.substring(0, s.indexOf(" "));
										}
										if (child.spellName.contains("Rush") || child.spellName.contains("Burst") || child.spellName.contains("Blitz") || child.spellName.contains("Barrage") || child.spellName.contains("strike") || child.spellName.contains("bolt") || child.spellName.contains("Crumble undead") || child.spellName.contains("blast") || child.spellName.contains("wave") || child.spellName.contains("Claws of Guthix") || child.spellName.contains("Flames of Zamorak") || child.spellName.contains("Magic Dart"))
										{
												menuActionName[menuActionRow] = "Autocast @gre@" + child.spellName;
												menuActionID[menuActionRow] = 104;
												menuActionCmd3[menuActionRow] = child.id;
												menuActionRow++;
										}
										menuActionName[menuActionRow] = s + " @gre@" + child.spellName;
										menuActionID[menuActionRow] = 626;
										menuActionCmd3[menuActionRow] = child.id;
										menuActionRow++;
								}
								if (child.atActionType == 3 && mouseX >= i2 && mouseY >= j2 && mouseX < i2 + child.width && mouseY < j2 + child.height)
								{
										menuActionName[menuActionRow] = "Close";
										menuActionID[menuActionRow] = 200;
										menuActionCmd3[menuActionRow] = child.id;
										menuActionRow++;
								}
								if (child.atActionType == 4 && mouseX >= i2 && mouseY >= j2 && mouseX < i2 + child.width && mouseY < j2 + child.height)
								{
										if (ClientConfiguration.DEBUG_MODE)
										{
												menuActionName[menuActionRow] = child.tooltip + ", " + child.id + ", " + RSInterface.getConfigID(child.id);
										}
										else
										{
												menuActionName[menuActionRow] = child.tooltip;
										}
										menuActionID[menuActionRow] = 169;
										menuActionCmd3[menuActionRow] = child.id;
										menuActionRow++;
								}

								// This only called for Combat interface buttons that say "Select"
								if (child.atActionType == 5 && mouseX >= i2 && mouseY >= j2 && mouseX < i2 + child.width && mouseY < j2 + child.height)
								{
										if (ClientConfiguration.DEBUG_MODE)
										{
												menuActionName[menuActionRow] = child.tooltip + ", " + child.id + ", " + RSInterface.getConfigID(child.id);
										}
										else
										{
												menuActionName[menuActionRow] = child.tooltip;
										}
										if (Client.getTabId() == 0)
										{
												if (menuActionName[menuActionRow].contains("Select"))
												{
														timeCombatInterfaceHovered = System.currentTimeMillis();
														combatInterfaceHoverString = child.id;
												}
										}

										menuActionID[menuActionRow] = 646;
										menuActionCmd3[menuActionRow] = child.id;
										menuActionRow++;
								}
								if (child.atActionType == 6 && !isDialogueOptionsShowing() && mouseX >= i2 && mouseY >= j2 && mouseX < i2 + child.width && mouseY < j2 + child.height)
								{
										if (ClientConfiguration.DEBUG_MODE)
										{
												menuActionName[menuActionRow] = child.tooltip + ", " + child.id + ", " + RSInterface.getConfigID(child.id);
										}
										else
										{
												menuActionName[menuActionRow] = child.tooltip;
										}
										menuActionID[menuActionRow] = 679;
										menuActionCmd3[menuActionRow] = child.id;
										menuActionRow++;
								}
								if (mouseX >= i2 && mouseY >= j2 && mouseX < i2 + (child.getType() == 4 ? 100 : child.width) && mouseY < j2 + child.height)
								{
										if (child.actions != null)
										{
												if ((child.getType() == 4 && child.message.length() > 0) || child.getType() == 5)
												{
														for (int action = child.actions.length - 1; action >= 0; action--)
														{
																if (child.actions[action] != null)
																{
																		menuActionName[menuActionRow] = child.actions[action] + (child.getType() == 4 ? " " + child.message : "");
																		if (child.id >= 24600 && child.id <= 24699)
																		{
																				menuActionID[menuActionRow] = 4500;
																				menuActionCmd2[menuActionRow] = action;
																				menuActionCmd3[menuActionRow] = child.id;
																				menuActionRow++;
																		}
																		else
																		{
																				menuActionID[menuActionRow] = 647;
																				menuActionCmd2[menuActionRow] = action;
																				menuActionCmd3[menuActionRow] = child.id;
																				menuActionRow++;
																		}
																}
														}
												}
										}
								}
								if (child.getType() == 2)
								{
										int k2 = interfaceId.invStartIndex;
										for (int l2 = 0; l2 < child.height; l2++)
										{
												for (int i3 = 0; i3 < child.width; i3++)
												{
														if (k2 >= child.inv.length)
																continue;

														int j3 = i2 + i3 * (32 + child.invSpritePadX);
														int k3 = j2 + l2 * (32 + child.invSpritePadY);
														if (k2 < 20)
														{
																j3 += child.spritesX[k2];
																k3 += child.spritesY[k2];
														}
														if (mouseX >= j3 && mouseY >= k3 && mouseX < j3 + 32 && mouseY < k3 + 32)
														{
																mouseInvInterfaceIndex = k2;
																lastActiveInvInterface = child.id;
																// When hovering over an item on the top left and bottom right of the specific item, it
																//-will give different outcomes.
																//Utility.print("Here3: " + lastActiveInvInterface);
																if (child.inv[k2] > 0)
																{
																		ItemDefinition itemDef = ItemDefinition.forId(child.inv[k2] - 1);
																		if (itemSelected == 1 && child.isInventoryInterface)
																		{
																				if (child.id != anInt1284 || k2 != anInt1283)
																				{
																						menuActionName[menuActionRow] = "Use " + selectedItemName + " with @lre@" + itemDef.name;
																						menuActionID[menuActionRow] = 870;
																						menuActionCmd1[menuActionRow] = itemDef.itemId;
																						menuActionCmd2[menuActionRow] = k2;
																						menuActionCmd3[menuActionRow] = child.id;
																						menuActionRow++;
																				}
																		}
																		else if (spellSelected == 1 && child.isInventoryInterface)
																		{
																				if ((spellUsableOn & 0x10) == 16)
																				{
																						menuActionName[menuActionRow] = spellTooltip + " @lre@" + itemDef.name;
																						menuActionID[menuActionRow] = 543;
																						menuActionCmd1[menuActionRow] = itemDef.itemId;
																						menuActionCmd2[menuActionRow] = k2;
																						menuActionCmd3[menuActionRow] = child.id;
																						menuActionRow++;
																				}
																		}
																		else
																		{
																				if (child.isInventoryInterface)
																				{
																						for (int l3 = 4; l3 >= 3; l3--)
																								if (itemDef.inventoryOptions != null && itemDef.inventoryOptions[l3] != null)
																								{
																										menuActionName[menuActionRow] = itemDef.inventoryOptions[l3] + " @lre@" + itemDef.name;
																										if (l3 == 3)
																										{
																												menuActionID[menuActionRow] = 493;
																										}
																										if (l3 == 4)
																										{
																												menuActionID[menuActionRow] = 847;
																										}
																										menuActionCmd1[menuActionRow] = itemDef.itemId;
																										menuActionCmd2[menuActionRow] = k2;
																										menuActionCmd3[menuActionRow] = child.id;
																										menuActionRow++;
																								}
																								else if (l3 == 4)
																								{
																										menuActionName[menuActionRow] = "Drop @lre@" + itemDef.name;
																										menuActionID[menuActionRow] = 847;
																										menuActionCmd1[menuActionRow] = itemDef.itemId;
																										menuActionCmd2[menuActionRow] = k2;
																										menuActionCmd3[menuActionRow] = child.id;
																										menuActionRow++;
																								}

																				}
																				if (child.usableItemInterface)
																				{
																						menuActionName[menuActionRow] = "Use @lre@" + itemDef.name;
																						menuActionID[menuActionRow] = 447;
																						menuActionCmd1[menuActionRow] = itemDef.itemId;
																						// k2 = inventory spot
																						menuActionCmd2[menuActionRow] = k2;
																						menuActionCmd3[menuActionRow] = child.id;
																						menuActionRow++;
																				}
																				if (child.isInventoryInterface && itemDef.inventoryOptions != null)
																				{
																						for (int i4 = 2; i4 >= 0; i4--)
																						{
																								if (itemDef.inventoryOptions[i4] != null)
																								{
																										menuActionName[menuActionRow] = itemDef.inventoryOptions[i4] + " @lre@" + itemDef.name;
																										if (i4 == 0)
																										{
																												menuActionID[menuActionRow] = 74;
																										}
																										if (i4 == 1)
																										{
																												menuActionID[menuActionRow] = 454;
																										}
																										if (i4 == 2)
																										{
																												menuActionID[menuActionRow] = 539;
																										}
																										menuActionCmd1[menuActionRow] = itemDef.itemId;
																										menuActionCmd2[menuActionRow] = k2;
																										menuActionCmd3[menuActionRow] = child.id;
																										menuActionRow++;
																								}
																						}

																				}
																				if (child.actions != null)
																				{
																						for (int j4 = child.parentId == 5292 ? 7 : 4; j4 >= 0; j4--)
																						{
																								if (child.parentId == 5292)
																								{
																										child.actions = new String[] {
																												"Withdraw 1",
																												"Withdraw 5",
																												"Withdraw 10",
																												"Withdraw All",
																												"Withdraw X",
																												"Withdraw " + lastXAmount,
																												"Withdraw All but one",
																												"Examine"};
																								}
																								if (child.actions[j4] != null)
																								{
																										menuActionName[menuActionRow] = child.actions[j4] + " @lre@" + itemDef.name;
																										if (j4 == 0)
																										{
																												menuActionID[menuActionRow] = 632;
																										}
																										if (j4 == 1)
																										{
																												menuActionID[menuActionRow] = 78;
																										}
																										if (j4 == 2)
																										{
																												menuActionID[menuActionRow] = 867;
																										}
																										if (j4 == 3)
																										{
																												menuActionID[menuActionRow] = 431;
																										}
																										if (j4 == 4)
																										{
																												menuActionID[menuActionRow] = 53;
																										}

																										if (child.parentId == 5292)
																										{
																												if (j4 == 5)
																												{
																														menuActionID[menuActionRow] = 1054;
																												}
																												if (j4 == 6)
																												{
																														menuActionID[menuActionRow] = 1053;
																												}
																												if (j4 == 7)
																												{
																														menuActionID[menuActionRow] = 1125;
																												}
																										}
																										menuActionCmd1[menuActionRow] = itemDef.itemId;
																										menuActionCmd2[menuActionRow] = k2;
																										menuActionCmd3[menuActionRow] = child.id;
																										menuActionRow++;
																								}
																						}

																				}
																				if (child.parentId != 5292)
																				{
																						menuActionName[menuActionRow] = "Examine @lre@" + itemDef.name;
																						menuActionID[menuActionRow] = 1125;
																						menuActionCmd1[menuActionRow] = itemDef.itemId;
																						menuActionCmd2[menuActionRow] = k2;
																						menuActionCmd3[menuActionRow] = child.id;
																						menuActionRow++;
																				}
																		}
																}
														}
														k2++;
												}

										}

								}
						}
				}

		}

		public void drawScrollbar(int j, int k, int l, int i1, int j1)
		{
				scrollBar1.drawSprite(i1, l);
				scrollBar2.drawSprite(i1, (l + j) - 16);
				DrawingArea.drawPixels(j - 32, l + 16, i1, 0x000001, 16);
				DrawingArea.drawPixels(j - 32, l + 16, i1, 0x3d3426, 15);
				DrawingArea.drawPixels(j - 32, l + 16, i1, 0x342d21, 13);
				DrawingArea.drawPixels(j - 32, l + 16, i1, 0x2e281d, 11);
				DrawingArea.drawPixels(j - 32, l + 16, i1, 0x29241b, 10);
				DrawingArea.drawPixels(j - 32, l + 16, i1, 0x252019, 9);
				DrawingArea.drawPixels(j - 32, l + 16, i1, 0x000001, 1);
				int k1 = ((j - 32) * j) / j1;
				if (k1 < 8)
				{
						k1 = 8;
				}
				int l1 = ((j - 32 - k1) * k) / (j1 - j);
				DrawingArea.drawPixels(k1, l + 16 + l1, i1, barFillColor, 16);
				DrawingArea.method341(l + 16 + l1, 0x000001, k1, i1);
				DrawingArea.method341(l + 16 + l1, 0x817051, k1, i1 + 1);
				DrawingArea.method341(l + 16 + l1, 0x73654a, k1, i1 + 2);
				DrawingArea.method341(l + 16 + l1, 0x6a5c43, k1, i1 + 3);
				DrawingArea.method341(l + 16 + l1, 0x6a5c43, k1, i1 + 4);
				DrawingArea.method341(l + 16 + l1, 0x655841, k1, i1 + 5);
				DrawingArea.method341(l + 16 + l1, 0x655841, k1, i1 + 6);
				DrawingArea.method341(l + 16 + l1, 0x61553e, k1, i1 + 7);
				DrawingArea.method341(l + 16 + l1, 0x61553e, k1, i1 + 8);
				DrawingArea.method341(l + 16 + l1, 0x5d513c, k1, i1 + 9);
				DrawingArea.method341(l + 16 + l1, 0x5d513c, k1, i1 + 10);
				DrawingArea.method341(l + 16 + l1, 0x594e3a, k1, i1 + 11);
				DrawingArea.method341(l + 16 + l1, 0x594e3a, k1, i1 + 12);
				DrawingArea.method341(l + 16 + l1, 0x514635, k1, i1 + 13);
				DrawingArea.method341(l + 16 + l1, 0x4b4131, k1, i1 + 14);
				DrawingArea.method339(l + 16 + l1, 0x000001, 15, i1);
				DrawingArea.method339(l + 17 + l1, 0x000001, 15, i1);
				DrawingArea.method339(l + 17 + l1, 0x655841, 14, i1);
				DrawingArea.method339(l + 17 + l1, 0x6a5c43, 13, i1);
				DrawingArea.method339(l + 17 + l1, 0x6d5f48, 11, i1);
				DrawingArea.method339(l + 17 + l1, 0x73654a, 10, i1);
				DrawingArea.method339(l + 17 + l1, 0x76684b, 7, i1);
				DrawingArea.method339(l + 17 + l1, 0x7b6a4d, 5, i1);
				DrawingArea.method339(l + 17 + l1, 0x7e6e50, 4, i1);
				DrawingArea.method339(l + 17 + l1, 0x817051, 3, i1);
				DrawingArea.method339(l + 17 + l1, 0x000001, 2, i1);
				DrawingArea.method339(l + 18 + l1, 0x000001, 16, i1);
				DrawingArea.method339(l + 18 + l1, 0x564b38, 15, i1);
				DrawingArea.method339(l + 18 + l1, 0x5d513c, 14, i1);
				DrawingArea.method339(l + 18 + l1, 0x625640, 11, i1);
				DrawingArea.method339(l + 18 + l1, 0x655841, 10, i1);
				DrawingArea.method339(l + 18 + l1, 0x6a5c43, 7, i1);
				DrawingArea.method339(l + 18 + l1, 0x6e6046, 5, i1);
				DrawingArea.method339(l + 18 + l1, 0x716247, 4, i1);
				DrawingArea.method339(l + 18 + l1, 0x7b6a4d, 3, i1);
				DrawingArea.method339(l + 18 + l1, 0x817051, 2, i1);
				DrawingArea.method339(l + 18 + l1, 0x000001, 1, i1);
				DrawingArea.method339(l + 19 + l1, 0x000001, 16, i1);
				DrawingArea.method339(l + 19 + l1, 0x514635, 15, i1);
				DrawingArea.method339(l + 19 + l1, 0x564b38, 14, i1);
				DrawingArea.method339(l + 19 + l1, 0x5d513c, 11, i1);
				DrawingArea.method339(l + 19 + l1, 0x61553e, 9, i1);
				DrawingArea.method339(l + 19 + l1, 0x655841, 7, i1);
				DrawingArea.method339(l + 19 + l1, 0x6a5c43, 5, i1);
				DrawingArea.method339(l + 19 + l1, 0x6e6046, 4, i1);
				DrawingArea.method339(l + 19 + l1, 0x73654a, 3, i1);
				DrawingArea.method339(l + 19 + l1, 0x817051, 2, i1);
				DrawingArea.method339(l + 19 + l1, 0x000001, 1, i1);
				DrawingArea.method339(l + 20 + l1, 0x000001, 16, i1);
				DrawingArea.method339(l + 20 + l1, 0x4b4131, 15, i1);
				DrawingArea.method339(l + 20 + l1, 0x544936, 14, i1);
				DrawingArea.method339(l + 20 + l1, 0x594e3a, 13, i1);
				DrawingArea.method339(l + 20 + l1, 0x5d513c, 10, i1);
				DrawingArea.method339(l + 20 + l1, 0x61553e, 8, i1);
				DrawingArea.method339(l + 20 + l1, 0x655841, 6, i1);
				DrawingArea.method339(l + 20 + l1, 0x6a5c43, 4, i1);
				DrawingArea.method339(l + 20 + l1, 0x73654a, 3, i1);
				DrawingArea.method339(l + 20 + l1, 0x817051, 2, i1);
				DrawingArea.method339(l + 20 + l1, 0x000001, 1, i1);
				DrawingArea.method341(l + 16 + l1, 0x000001, k1, i1 + 15);
				DrawingArea.method339(l + 15 + l1 + k1, 0x000001, 16, i1);
				DrawingArea.method339(l + 14 + l1 + k1, 0x000001, 15, i1);
				DrawingArea.method339(l + 14 + l1 + k1, 0x3f372a, 14, i1);
				DrawingArea.method339(l + 14 + l1 + k1, 0x443c2d, 10, i1);
				DrawingArea.method339(l + 14 + l1 + k1, 0x483e2f, 9, i1);
				DrawingArea.method339(l + 14 + l1 + k1, 0x4a402f, 7, i1);
				DrawingArea.method339(l + 14 + l1 + k1, 0x4b4131, 4, i1);
				DrawingArea.method339(l + 14 + l1 + k1, 0x564b38, 3, i1);
				DrawingArea.method339(l + 14 + l1 + k1, 0x000001, 2, i1);
				DrawingArea.method339(l + 13 + l1 + k1, 0x000001, 16, i1);
				DrawingArea.method339(l + 13 + l1 + k1, 0x443c2d, 15, i1);
				DrawingArea.method339(l + 13 + l1 + k1, 0x4b4131, 11, i1);
				DrawingArea.method339(l + 13 + l1 + k1, 0x514635, 9, i1);
				DrawingArea.method339(l + 13 + l1 + k1, 0x544936, 7, i1);
				DrawingArea.method339(l + 13 + l1 + k1, 0x564b38, 6, i1);
				DrawingArea.method339(l + 13 + l1 + k1, 0x594e3a, 4, i1);
				DrawingArea.method339(l + 13 + l1 + k1, 0x625640, 3, i1);
				DrawingArea.method339(l + 13 + l1 + k1, 0x6a5c43, 2, i1);
				DrawingArea.method339(l + 13 + l1 + k1, 0x000001, 1, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x000001, 16, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x443c2d, 15, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x4b4131, 14, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x544936, 12, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x564b38, 11, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x594e3a, 10, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x5d513c, 7, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x61553e, 4, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x6e6046, 3, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x7b6a4d, 2, i1);
				DrawingArea.method339(l + 12 + l1 + k1, 0x000001, 1, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x000001, 16, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x4b4131, 15, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x514635, 14, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x564b38, 13, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x594e3a, 11, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x5d513c, 9, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x61553e, 7, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x655841, 5, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x6a5c43, 4, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x73654a, 3, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x7b6a4d, 2, i1);
				DrawingArea.method339(l + 11 + l1 + k1, 0x000001, 1, i1);
		}

		public int cButtonHPos;

		public int cButtonCPos;

		public static int musicVolume = 0;

		public static String starterType = "VETERAN";

		public static boolean isWithIn(int xStart, int xEnd, int yStart, int yEnd)
		{
				// TODO #FULLSCREEN ADJUST interfaces, hover over bank button.
				int x = isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 256;
				int y = isFixedScreen() ? 0 : (Client.getClientHeight() / 2) - 271;
				if (Client.instance.mouseX >= xStart + x && Client.instance.mouseX <= xEnd + x && Client.instance.mouseY >= yStart + y && Client.instance.mouseY <= yEnd + y)
				{
						return true;
				}
				return false;
		}

		static int clickedX;

		static int clickedY;

		/**
		 * This boolean is used because, this updates Client.instance.clickMode2, then the isWithInClicked method, then Client.instance.saveClickX.
		 * Which means that if i do not use this boolean, it's going to use the old saveClickX coordinates.
		 */
		public static boolean clickPositionUpdateRequired;

		/**
		 * If mouse clicked point is within the given values.
		 */
		public static boolean isWithInClicked(int xStart, int xEnd, int yStart, int yEnd, boolean equipmentInterface)
		{
				if (clickPositionUpdateRequired)
				{
						return false;
				}
				if (Client.instance.saveClickX == clickedX && Client.instance.saveClickY == clickedY)
				{
						return false;
				}
				int saveClickX = Client.isFixedScreen() ? Client.instance.saveClickX : Client.instance.saveClickX - (Client.getClientWidth() / 2) + (equipmentInterface ? 260 : 375);
				int saveClickY = Client.isFixedScreen() ? Client.instance.saveClickY : Client.instance.saveClickY - (equipmentInterface ? (Client.getClientHeight() / 2) - 267 : 0);
				if (Client.instance.clickMode2 == 1 && saveClickX >= xStart && saveClickX <= xEnd && saveClickY >= yStart && saveClickY <= yEnd)
				{
						clickedX = Client.instance.saveClickX;
						clickedY = Client.instance.saveClickY;
						return true;
				}
				return false;
		}

		public void handleVarp(int i)
		{
				if (ClientConfiguration.DEBUG_MODE)
				{
						Utility.print("Varp: " + i);
				}
				if (i == 19)
				{
						loop = !loop;
						Settings.saveSettings();
				}
				else if (i == 18)
				{
						autoMusic = !autoMusic;
						Settings.saveSettings();
				}
				int action = Varp.cache[i].anInt709;
				if (action == 0)
				{
						return;
				}

				int config = variousSettings[i];
				if (ClientConfiguration.DEBUG_MODE)
				{
						Utility.print("Setting: " + i + ", Config: " + config);
				}
				if (action == 1)
				{
						if (config == 1)
						{
								Rasterizer.setupPalette(0.90000000000000002D);
								if (isLoggedIn())
								{
										brightness = ClientConstants.BRIGHTNESS_VERY_DARK;
										Settings.saveSettings();
								}
						}
						if (config == 2)
						{
								Rasterizer.setupPalette(0.80000000000000004D);
								if (isLoggedIn())
								{
										brightness = ClientConstants.BRIGHTNESS_DARK;
										Settings.saveSettings();
								}
						}
						if (config == 3)
						{
								Rasterizer.setupPalette(0.69999999999999996D);
								if (isLoggedIn())
								{
										brightness = ClientConstants.BRIGHTNESS_NORMAL;
										Settings.saveSettings();
								}
						}
						if (config == 4)
						{
								Rasterizer.setupPalette(0.59999999999999998D);
								if (isLoggedIn())
								{
										brightness = ClientConstants.BRIGHTNESS_BRIGHT;
										Settings.saveSettings();
								}
						}
						ItemDefinition.mruNodes1.unlinkAll();
						welcomeScreenRaised = true;
				}
				if (action == 3)
				{
						boolean flag1 = musicEnabled;
						if (config == 0)
						{
								Music.setMidiVolume(256);
								musicVolume = 4;
								musicEnabled = true;
						}
						if (config == 1)
						{
								Music.setMidiVolume(192);
								musicVolume = 3;
								musicEnabled = true;
						}
						if (config == 2)
						{
								Music.setMidiVolume(128);
								musicVolume = 2;
								musicEnabled = true;
						}
						if (config == 3)
						{
								Music.setMidiVolume(64);
								musicVolume = 1;
								musicEnabled = true;
						}
						if (config == 4)
						{
								musicVolume = 0;
								musicEnabled = false;
								Music.stopMidi();
								sendFrame126("No music selected.", 4439);
								Client.instance.sendCommandPacket("::nomusicselected");
								currentSong = -1;
						}
						if (musicEnabled != flag1)
						{
								if (musicEnabled)
								{
										nextSong = currentSong;
										onDemandFetcher.sendImmediately(2, nextSong);
								}
								else
								{
										Music.stopMidi();
								}
								previousSong = 0;
						}
						Settings.saveSettings();
				}
				if (action == 4)
				{
						SoundPlayer.setVolume(config, false, true);
				}
				if (action == 5)
				{
						useOneMouseButton = config;
				}
				if (action == 6)
				{
						showSpokenEffects = config;
				}
				if (action == 8)
				{
						splitPrivateChat = config;
						setInputTaken(true);
				}
				if (action == 9)
				{
						anInt913 = config;
				}
		}

		private void updateTextures(int j)
		{
				if (lowMem)
				{
						return;
				}
				if (Rasterizer.textureCycle[17] >= j)
				{
						Background background = Rasterizer.textures[17];
						int k = background.width * background.height - 1; // fire cape apparently, this line causes null poointer.
						int j1 = background.width * animCycle * 2;
						byte abyte0[] = background.data;
						byte abyte3[] = tmpTexture;
						for (int i2 = 0; i2 <= k; i2++)
						{
								abyte3[i2] = abyte0[i2 - j1 & k];
						}

						background.data = abyte3;
						tmpTexture = abyte0;
						Rasterizer.updateTexture(17);
						anInt854++;
						if (anInt854 > 1235)
						{
								anInt854 = 0;
								stream.createFrame(226);
								stream.writeWordBigEndian(0);
								int l2 = stream.currentOffset;
								stream.writeWord(58722);
								stream.writeWordBigEndian(240);
								stream.writeWord((int) (Math.random() * 65536D));
								stream.writeWordBigEndian((int) (Math.random() * 256D));
								if ((int) (Math.random() * 2D) == 0)
								{
										stream.writeWord(51825);
								}
								stream.writeWordBigEndian((int) (Math.random() * 256D));
								stream.writeWord((int) (Math.random() * 65536D));
								stream.writeWord(7130);
								stream.writeWord((int) (Math.random() * 65536D));
								stream.writeWord(61657);
								stream.writeBytes(stream.currentOffset - l2);
						}
				}
				if (Rasterizer.textureCycle[24] >= j)
				{
						Background background_1 = Rasterizer.textures[24];
						int l = background_1.width * background_1.height - 1;
						int k1 = background_1.width * animCycle * 2;
						byte abyte1[] = background_1.data;
						byte abyte4[] = tmpTexture;
						for (int j2 = 0; j2 <= l; j2++)
						{
								abyte4[j2] = abyte1[j2 - k1 & l];
						}

						background_1.data = abyte4;
						tmpTexture = abyte1;
						Rasterizer.updateTexture(24);
				}
				if (Rasterizer.textureCycle[34] >= j)
				{
						Background background_2 = Rasterizer.textures[34];
						int i1 = background_2.width * background_2.height - 1;
						int l1 = background_2.width * animCycle * 2;
						byte abyte2[] = background_2.data;
						byte abyte5[] = tmpTexture;
						for (int k2 = 0; k2 <= i1; k2++)
						{
								abyte5[k2] = abyte2[k2 - l1 & i1];
						}
						background_2.data = abyte5;
						tmpTexture = abyte2;
						Rasterizer.updateTexture(34);
				}
				if (Rasterizer.textureCycle[40] >= j)
				{
						Background background_2 = Rasterizer.textures[40];
						int i1 = background_2.width * background_2.height - 1;
						int l1 = background_2.width * animCycle * 2;
						byte abyte2[] = background_2.data;
						byte abyte5[] = tmpTexture;
						for (int k2 = 0; k2 <= i1; k2++)
						{
								abyte5[k2] = abyte2[k2 - l1 & i1];
						}
						background_2.data = abyte5;
						tmpTexture = abyte2;
						Rasterizer.updateTexture(40);
				}
		}

		private void handleSpoken()
		{
				for (int i = -1; i < playerCount; i++)
				{
						int j;
						if (i == -1)
						{
								j = myPlayerIndex;
						}
						else
						{
								j = playerIndices[i];
						}
						Player player = playerArray[j];
						if (player != null && player.textCycle > 0)
						{
								player.textCycle--;
								if (player.textCycle == 0)
								{
										player.textSpoken = null;
								}
						}
				}
				for (int k = 0; k < npcCount; k++)
				{
						int l = npcIndices[k];
						Npc npc = npcArray[l];
						if (npc != null && npc.textCycle > 0)
						{
								npc.textCycle--;
								if (npc.textCycle == 0)
								{
										npc.textSpoken = null;
								}
						}
				}
		}

		private void calcCameraPos()
		{
				int i = cutsceneLocalX * 128 + 64;
				int j = cutsceneLocalY * 128 + 64;
				int k = getLand(plane, j, i) - cutsceneZ;
				if (xCameraPos < i)
				{
						xCameraPos += cutsceneSpeed + ((i - xCameraPos) * cutsceneSpeedMul) / 1000;
						if (xCameraPos > i)
						{
								xCameraPos = i;
						}
				}
				if (xCameraPos > i)
				{
						xCameraPos -= cutsceneSpeed + ((xCameraPos - i) * cutsceneSpeedMul) / 1000;
						if (xCameraPos < i)
						{
								xCameraPos = i;
						}
				}
				if (zCameraPos < k)
				{
						zCameraPos += cutsceneSpeed + ((k - zCameraPos) * cutsceneSpeedMul) / 1000;
						if (zCameraPos > k)
						{
								zCameraPos = k;
						}
				}
				if (zCameraPos > k)
				{
						zCameraPos -= cutsceneSpeed + ((zCameraPos - k) * cutsceneSpeedMul) / 1000;
						if (zCameraPos < k)
						{
								zCameraPos = k;
						}
				}
				if (yCameraPos < j)
				{
						yCameraPos += cutsceneSpeed + ((j - yCameraPos) * cutsceneSpeedMul) / 1000;
						if (yCameraPos > j)
						{
								yCameraPos = j;
						}
				}
				if (yCameraPos > j)
				{
						yCameraPos -= cutsceneSpeed + ((yCameraPos - j) * cutsceneSpeedMul) / 1000;
						if (yCameraPos < j)
						{
								yCameraPos = j;
						}
				}
				i = cutsceneFocusLocalX * 128 + 64;
				j = cutsceneFocusLocalY * 128 + 64;
				k = getLand(plane, j, i) - cutsceneFocusZ;
				int l = i - xCameraPos;
				int i1 = k - zCameraPos;
				int j1 = j - yCameraPos;
				int k1 = (int) Math.sqrt(l * l + j1 * j1);
				int l1 = (int) (Math.atan2(i1, k1) * 325.94900000000001D) & 0x7ff;
				int i2 = (int) (Math.atan2(l, j1) * -325.94900000000001D) & 0x7ff;
				if (l1 < 128)
				{
						l1 = 128;
				}
				if (l1 > 383)
				{
						l1 = 383;
				}
				if (yCameraCurve < l1)
				{
						yCameraCurve += cutsceneRotateSpeed + ((l1 - yCameraCurve) * cutsceneRotateMul) / 1000;
						if (yCameraCurve > l1)
						{
								yCameraCurve = l1;
						}
				}
				if (yCameraCurve > l1)
				{
						yCameraCurve -= cutsceneRotateSpeed + ((yCameraCurve - l1) * cutsceneRotateMul) / 1000;
						if (yCameraCurve < l1)
						{
								yCameraCurve = l1;
						}
				}
				int j2 = i2 - xCameraCurve;
				if (j2 > 1024)
				{
						j2 -= 2048;
				}
				if (j2 < -1024)
				{
						j2 += 2048;
				}
				if (j2 > 0)
				{
						xCameraCurve += cutsceneRotateSpeed + (j2 * cutsceneRotateMul) / 1000;
						xCameraCurve &= 0x7ff;
				}
				if (j2 < 0)
				{
						xCameraCurve -= cutsceneRotateSpeed + (-j2 * cutsceneRotateMul) / 1000;
						xCameraCurve &= 0x7ff;
				}
				int k2 = i2 - xCameraCurve;
				if (k2 > 1024)
				{
						k2 -= 2048;
				}
				if (k2 < -1024)
				{
						k2 += 2048;
				}
				if (k2 < 0 && j2 > 0 || k2 > 0 && j2 < 0)
				{
						xCameraCurve = i2;
				}
		}

		void drawMenu()
		{
				if (saveRightClickCoordinates)
				{
						Landscape.clickX = super.mouseX - 4;
						Landscape.clickY = super.mouseY - 4;
						appendSavedCoordinated = true;
						saveRightClickCoordinates = false;
				}
				// TODO #FULLSCREEN ADJUST menu right click hover
				int yOffset = (isFixedScreen() ? 4 : 8);
				if (contextMenu.equals("NEW"))
				{
						int i = menuOffsetX;
						int j = menuOffsetY;
						int k = menuWidth;
						int l = menuHeight + 1; // anInt952
						DrawingArea.drawPixels(l - 4, j + 2, i, 0x706a5e, k);
						DrawingArea.drawPixels(l - 2, j + 1, i + 1, 0x706a5e, k - 2);
						DrawingArea.drawPixels(l, j, i + 2, 0x706a5e, k - 4);
						DrawingArea.drawPixels(l - 2, j + 1, i + 3, 0x2d2822, k - 6);
						DrawingArea.drawPixels(l - 4, j + 2, i + 2, 0x2d2822, k - 4);
						DrawingArea.drawPixels(l - 6, j + 3, i + 1, 0x2d2822, k - 2);
						DrawingArea.drawPixels(l - 22, j + 19, i + 2, 0x524a3d, k - 4);
						DrawingArea.drawPixels(l - 22, j + 20, i + 3, 0x524a3d, k - 6);
						DrawingArea.drawPixels(l - 23, j + 20, i + 3, 0x2b271c, k - 6);
						DrawingArea.fillPixels(i + 3, k - 6, 1, 0x2a291b, j + 2);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x2a261b, j + 3);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x252116, j + 4);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x211e15, j + 5);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x1e1b12, j + 6);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x1a170e, j + 7);
						DrawingArea.fillPixels(i + 2, k - 4, 2, 0x15120b, j + 8);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x100d08, j + 10);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x090a04, j + 11);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x080703, j + 12);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x090a04, j + 13);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x070802, j + 14);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x090a04, j + 15);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x070802, j + 16);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x090a04, j + 17);
						DrawingArea.fillPixels(i + 2, k - 4, 1, 0x2a291b, j + 18);
						DrawingArea.fillPixels(i + 3, k - 6, 1, 0x564943, j + 19);
						chatTextDrawingArea.method385(0xc6b895, "Choose Option", i + 3, j + 15);
						int j1 = super.mouseX;
						int k1 = super.mouseY + yOffset;
						if (getMenuScreenArea() == 0)
						{
								j1 -= 4;
								k1 -= 4;
						}
						if (getMenuScreenArea() == 1)
						{
								j1 -= 519;
								k1 -= 168;
						}
						if (getMenuScreenArea() == 2)
						{
								j1 -= 17;
								k1 -= 338;
						}
						if (getMenuScreenArea() == 3)
						{
								j1 -= 515;
								k1 -= 0;
						}

						for (int l1 = 0; l1 < menuActionRow; l1++)
						{
								int i2 = j + 35 + (menuActionRow - 1 - l1) * 15;
								int j2 = 0xc6b895;
								if (j1 > i && j1 < i + k && k1 > i2 - 13 && k1 < i2 + 3)
								{
										DrawingArea.drawPixels(15, i2 - 15, i + 3, 0x6f695d, menuWidth - 6);
										j2 = 0xeee5c6;
								}
								if (menuActionName[l1] != null)
								{
										menuActionName[l1] = RSFont.replaceOldWithCol(menuActionName[l1]);
								}

								newBoldFont.drawBasicString1(menuActionName[l1], i + 3, i2 - 4, true, j2, false);
						}
				}
				else
				{
						int x = menuOffsetX;
						int y = menuOffsetY;
						int width = menuWidth;
						int height = menuHeight + 1;
						int colour = 0x5d5447;
						DrawingArea.drawPixels(height, y, x, colour, width);
						DrawingArea.drawPixels(16, y + 1, x + 1, 0, width - 2);
						DrawingArea.fillPixels(x + 1, width - 2, height - 19, 0, y + 18);
						chatTextDrawingArea.method385(colour, "Choose Option", x + 3, y + 14);
						int j1 = super.mouseX;
						int k1 = super.mouseY + yOffset;
						if (getMenuScreenArea() == 0)
						{
								j1 -= 4;
								k1 -= 4;
						}
						if (getMenuScreenArea() == 1)
						{

								j1 -= 519;
								k1 -= 168;
						}
						if (getMenuScreenArea() == 2)
						{
								j1 -= 17;
								k1 -= 338;
						}
						if (getMenuScreenArea() == 3)
						{
								j1 -= 519;
								k1 -= 0;
						}
						for (int l1 = 0; l1 < menuActionRow; l1++)
						{
								int i2 = y + 35 + (menuActionRow - 1 - l1) * 15;
								int j2 = 0xffffff;
								if (j1 > x && j1 < x + width && k1 > i2 - 13 && k1 < i2 + 3)
								{
										if (contextMenu.equals("OLD HOVER"))
										{
												DrawingArea.drawPixels(15, i2 - 15, x + 3, 0x6f695d, menuWidth - 6);
										}
										j2 = 0xffff00;
								}
								if (menuActionName[l1] != null)
								{
										menuActionName[l1] = RSFont.replaceOldWithCol(menuActionName[l1]);
								}
								newBoldFont.drawBasicString1(menuActionName[l1], x + 3, i2 - 4, true, j2, false);
						}
				}
		}

		protected int getLand(int i, int j, int k)
		{
				int l = k >> 7;
				int i1 = j >> 7;
				if (l < 0 || i1 < 0 || l > 103 || i1 > 103)
				{
						return 0;
				}
				int j1 = i;
				if (j1 < 3 && (byteGroundArray[1][l][i1] & 2) == 2)
				{
						j1++;
				}
				int k1 = k & 0x7f;
				int l1 = j & 0x7f;
				int i2 = intGroundArray[j1][l][i1] * (128 - k1) + intGroundArray[j1][l + 1][i1] * k1 >> 7;
				int j2 = intGroundArray[j1][l][i1 + 1] * (128 - k1) + intGroundArray[j1][l + 1][i1 + 1] * k1 >> 7;
				return i2 * (128 - l1) + j2 * l1 >> 7;
		}

		private static String intToKOrMil(int amount, int parentId)
		{
				if (parentId == 3824)
				{
						double value = amount;
						value /= 1000;
						if (amount <= 999)
						{
								return String.valueOf(amount);
						}
						else
						{
								// ends with .0
								if (value == Math.floor(value))
								{
										return String.valueOf(amount / 1000) + "k";
								}
								else
								{
										return String.valueOf(value) + "k";
								}
						}
				}
				else
				{
						if (amount == 0) // Infinite
						{
								return "@inf@";
						}
						if (amount < 0x186a0)
						{
								return String.valueOf(amount);
						}
						if (amount < 0x989680)
						{
								return amount / 1000 + "K";
						}
						else
						{
								return amount / 0xf4240 + "M";
						}
				}
		}

		protected void logOutUpdate()
		{
				try
				{
						if (socketStream != null)
						{
								socketStream.close();
						}
				}
				catch (Exception _ex)
				{
				}
				rigourUnlocked = false;
				auguryUnlocked = false;
				vengeanceTime = 0;
				blackScreenSaved = false;
				showCountdown = false;
				drawTabs = false;
				setDisconnected(false);
				playerUpdateCompleted = false;
				socketStream = null;
				setLoggedIn(false);
				unlinkMRUNodes();
				landScape.initToNull();
				for (int i = 0; i < 4; i++)
				{
						collisionMap[i].reset();
				}
				System.gc();
				Music.stopMidi();
				setLoginMessage1("");
				currentSong = -1;
				nextSong = -1;
				previousSong = 0;
				noClip = false;
				GameModeInterface.closeInterface();
				poisoned = false;
				permissionToPlayNextSong = false;
				Music.playLogInScreenMusic();
				ArrowTutorial.cancelTutorial();

				for (int index = 0; index < interfaceClickedList.size(); index++)
				{
						RSInterface.interfaceCache[Integer.parseInt(interfaceClickedList.get(index))].isClicked = false;
				}
				interfaceClickedList.clear();
				clearTextClicked();

				// Reset title interface text colours to red.
				for (int j = 19384; j < 19424; j++)
				{
						RSInterface.interfaceCache[j].textColour = 16711680;
				}

				// Reset Achievement interface text colours to red.
				for (int j = 22295; j < 22335; j++)
				{
						RSInterface.interfaceCache[j].textColour = 16711680;
				}


				if (!Client.isFixedScreen())
				{
						Jframe.frame.setResizable(false);
				}

		}

		private void resetCharacterCreation()
		{
				updateCharacterCreation = true;
				for (int j = 0; j < 7; j++)
				{
						clotheIds[j] = -1;
						for (int k = 0; k < IdentityKit.length; k++)
						{
								if (IdentityKit.cache[k].disableDisplay || IdentityKit.cache[k].partId != j + (selectedMaleIdentityKit ? 0 : 7))
								{
										continue;
								}
								clotheIds[j] = k;
								break;
						}
				}
		}

		public void processGameLoop()
		{
				if (rsAlreadyLoaded || loadingError || genericLoadingError)
				{
						return;
				}
				loopCycle++;
				LogInScreen.logInScreenFirstPageAction();
				if (!isLoggedIn())
				{
						LogInScreen.logInScreenSecondPage(true);
						if (Client.logInScreenPage.equals("SECOND"))
						{
								LogInScreen.updateUsernameAndPassword();
						}
				}
				else
				{
						mainGameProcessor();
				}
				processOnDemandQueue();
				Music.playNextSong();
		}

		private void drawPlayers(boolean isMyPlayer)
		{
				if (myPlayer.x >> 7 == destX && myPlayer.y >> 7 == destY)
				{
						destX = 0;
				}
				int j = playerCount;
				if (isMyPlayer)
				{
						j = 1;
				}
				for (int l = 0; l < j; l++)
				{
						Player player;
						int i1;
						if (isMyPlayer)
						{
								player = myPlayer;
								i1 = myPlayerIndex << 14;
						}
						else
						{
								player = playerArray[playerIndices[l]];
								i1 = playerIndices[l] << 14;
						}
						if (player == null || !player.isVisible())
						{
								continue;
						}

						if (!isMyPlayer && botsOff)
						{
								if (player.gameModeTitle.contains("[Bot]") && (System.currentTimeMillis() - player.lastCombatTime) >= 5000)
								{
										continue;
								}
						}

						int interact = myPlayer.interactingEntity - 32768;
						if (interactingWithEntityId == 0 && interact > 0)
						{
								interactingWithEntityId = interact;
						}
						if (interactingWithEntityId > 0)
						{
								if (interact > 0)
								{
										interactingWithEntityId = interact;
								}
								// Do not draw the player i am interacting with, because it is drawn already because prioritization.
								Player interactingPlayer = playerArray[interactingWithEntityId];
								if (player == interactingPlayer)
								{
										continue;
								}
						}

						player.ignoreSequences = (lowMem && playerCount > 50 || playerCount > 200) && !isMyPlayer && player.moveSequence == player.standAnimation;
						int j1 = player.x >> 7;
						int k1 = player.y >> 7;
						if (j1 < 0 || j1 >= 104 || k1 < 0 || k1 >= 104)
						{
								continue;
						}
						if (player.aModel_1714 != null && loopCycle >= player.objectStartCycle && loopCycle < player.objectEndCycle)
						{
								player.ignoreSequences = false;
								player.z = getLand(plane, player.y, player.x);
								landScape.add(plane, player.y, player, player.yaw, player.objectY1, player.x, player.z, player.objectX0, player.objectY0, i1, player.objectX1);
								continue;
						}
						if ((player.x & 0x7f) == 64 && (player.y & 0x7f) == 64)
						{
								if (tileCycleMap[j1][k1] == sceneCycle)
								{
										continue;
								}
								tileCycleMap[j1][k1] = sceneCycle;
						}
						player.z = getLand(plane, player.y, player.x);
						landScape.add(plane, player.yaw, player.z, i1, player.y, 60, player.x, player, player.canRotate);
				}
				if (isMyPlayer)
				{
						//Draw the player we're interacting with
						//Interacting includes combat, following, etc.
						int interact = myPlayer.interactingEntity - 32768;
						if (interactingWithEntityId == 0 && interact > 0)
						{
								interactingWithEntityId = interact;
						}
						if (interactingWithEntityId > 0)
						{
								if (interact > 0)
								{
										interactingWithEntityId = interact;
								}
								Player player = playerArray[interactingWithEntityId];
								showPlayer(player, interactingWithEntityId << 14, false);
						}
				}
		}

		private void showPlayer(Player player, int i1, boolean isMyPlayer)
		{
				if (player == null || !player.isVisible())
				{
						return;
				}
				player.ignoreSequences = (lowMem && playerCount > 50 || playerCount > 200) && !isMyPlayer && player.moveSequence == player.standAnimation;
				int j1 = player.x >> 7;
				int k1 = player.y >> 7;
				if (j1 < 0 || j1 >= 104 || k1 < 0 || k1 >= 104)
				{
						return;
				}
				if (player.aModel_1714 != null && loopCycle >= player.objectStartCycle && loopCycle < player.objectEndCycle)
				{
						player.ignoreSequences = false;
						player.z = getLand(plane, player.y, player.x);
						landScape.add(plane, player.y, player, player.yaw, player.objectY1, player.x, player.z, player.objectX0, player.objectY0, i1, player.objectX1);
				}
				if ((player.x & 0x7f) == 64 && (player.y & 0x7f) == 64)
				{
						if (tileCycleMap[j1][k1] == sceneCycle)
						{
								return;
						}
						tileCycleMap[j1][k1] = sceneCycle;
				}
				player.z = getLand(plane, player.y, player.x);
				landScape.add(plane, player.yaw, player.z, i1, player.y, 60, player.x, player, player.canRotate);
		}

		protected boolean promptUserForInput(RSInterface class9)
		{
				int contentType = class9.actionType;
				if (friendserverState == 2)
				{
						if (contentType == 201)
						{
								setInputTaken(true);
								inputDialogState = 0;
								setMessagePromptRaised(true);
								promptInput = "";
								bankSearchSent = "";
								friendsListAction = 1;
								inputMessage = "Enter name of friend to add to list";
						}
						if (contentType == 202)
						{
								setInputTaken(true);
								inputDialogState = 0;
								setMessagePromptRaised(true);
								promptInput = "";
								bankSearchSent = "";
								friendsListAction = 2;
								inputMessage = "Enter name of friend to delete from list";
						}
				}
				if (contentType == 205)
				{
						logoutCycle = 250;
						return true;
				}
				if (contentType == 501)
				{
						setInputTaken(true);
						inputDialogState = 0;
						setMessagePromptRaised(true);
						promptInput = "";
						bankSearchSent = "";
						friendsListAction = 4;
						inputMessage = "Enter name of player to add to list";
				}
				if (contentType == 502)
				{
						setInputTaken(true);
						inputDialogState = 0;
						setMessagePromptRaised(true);
						promptInput = "";
						bankSearchSent = "";
						friendsListAction = 5;
						inputMessage = "Enter name of player to delete from list";
				}
				if (contentType >= 300 && contentType <= 313)
				{
						int bodyPartIndex = (contentType - 300) / 2;
						int direction = contentType & 1;
						int newClothe = clotheIds[bodyPartIndex];
						if (newClothe != -1)
						{
								do
								{
										if (direction == 0 && --newClothe < 0)
										{
												newClothe = IdentityKit.length - 1;
										}
										if (direction == 1 && ++newClothe >= IdentityKit.length)
										{
												newClothe = 0;
										}
								}
								while (IdentityKit.cache[newClothe].disableDisplay || IdentityKit.cache[newClothe].partId != bodyPartIndex + (selectedMaleIdentityKit ? 0 : 7));
								clotheIds[bodyPartIndex] = newClothe;
								updateCharacterCreation = true;
						}
				}
				if (contentType >= 314 && contentType <= 323)
				{
						int l = (contentType - 314) / 2;
						int k1 = contentType & 1;
						int j2 = selectedIdentityKitColor[l];
						if (k1 == 0 && --j2 < 0)
						{
								j2 = ClientConstants.CLOTHES_COLOUR[l].length - 1;
						}
						if (k1 == 1 && ++j2 >= ClientConstants.CLOTHES_COLOUR[l].length)
						{
								j2 = 0;
						}
						selectedIdentityKitColor[l] = j2;
						updateCharacterCreation = true;
				}
				if (contentType == 324 && !selectedMaleIdentityKit)
				{
						selectedMaleIdentityKit = true;
						resetCharacterCreation();
				}
				if (contentType == 325 && selectedMaleIdentityKit)
				{
						selectedMaleIdentityKit = false;
						resetCharacterCreation();
				}
				if (contentType == 326)
				{
						stream.createFrame(101);
						stream.writeWordBigEndian(selectedMaleIdentityKit ? 0 : 1);
						for (int i1 = 0; i1 < 7; i1++)
						{
								stream.writeWordBigEndian(clotheIds[i1]);
						}

						for (int l1 = 0; l1 < 5; l1++)
						{
								stream.writeWordBigEndian(selectedIdentityKitColor[l1]);
						}

						return true;
				}
				if (contentType == 613)
				{
						canMute = !canMute;
				}
				if (contentType >= 601 && contentType <= 612)
				{
						clearTopInterfaces();
				}
				return false;
		}

		public void loadTitleScreen()
		{
				backgroundSprite[0] = new Sprite("background");
				backgroundSprite[1] = new Sprite("background 1");
				drawLoadingText(0, loadingGameString);
				if (!updateFlames)
				{
						drawFlames = true;
						updateFlames = true;
						startRunnable(this, 2);
				}
		}

		public static void setWorldGraphics(String detail)
		{
				switch (detail)
				{
						case "HIGH":
								Landscape.lowMem = false;
								lowMem = false;
								ObjectManager.lowMem = false;
								ObjectDefinition.lowMem = false;
								break;

						case "MEDIUM":
								Landscape.lowMem = false;
								lowMem = true; //Low mem and ObjectManager.lowMem both have to be the same. Or else 
								//when i go up and down stairs, the floor will be invis.
								ObjectManager.lowMem = true;
								ObjectDefinition.lowMem = false;
								break;

						case "LOW":
								Landscape.lowMem = true;
								lowMem = true;
								ObjectManager.lowMem = true;
								ObjectDefinition.lowMem = true;
								break;
				}
		}

		private void loadingStages()
		{


				if (getLoadingStage() == 2)
				{
						blackScreenSaved = false;
						//Utility.print("Packt received: " + (System.currentTimeMillis() - Packet.timeReceivedPacket));

						if (System.currentTimeMillis() - timeReceivedPacket >= 14000 && !isDisconnected())
						{
								Utility.print("Kicked9.");
								logOutUpdate();
						}

				}
				if (getLoadingStage() != 2 && System.currentTimeMillis() - timeDisconnected > 20000)
				{
						if (!blackScreenSaved)
						{
								timeBlackScreen = System.currentTimeMillis();
								blackScreenSaved = true;
						}
						else
						{
								if (System.currentTimeMillis() - timeBlackScreen >= 7000)
								{
										Utility.print("Kicked4.");
										Client.instance.sendCommandPacket("::forcelogout");
										logOutUpdate();
								}
						}
				}
				if (lowMem && getLoadingStage() == 2 && ObjectManager.buildPlane != plane)
				{
						inGameScreen.initDrawingArea();
						Content.loadingPleaseWait();
						inGameScreen.drawGraphics(isFixedScreen() ? 4 : 0, super.graphics, isFixedScreen() ? 4 : 0);
						setLoadingStage(1);
						aLong824 = System.currentTimeMillis();
				}
				if (getLoadingStage() == 1)
				{
						int j = handleSceneState();
						if (j != 0 && System.currentTimeMillis() - aLong824 > 0x57e40L)
						{
								SignLink.reporterror(myUsername + " glcfb " + serverSeed + "," + j + "," + lowMem + "," + decompressors[0] + "," + onDemandFetcher.getNodeCount() + "," + plane + "," + regionX + "," + regionY);
								aLong824 = System.currentTimeMillis();
						}
				}
				if (getLoadingStage() == 2 && plane != lastPlane)
				{
						lastPlane = plane;
						createLandImage(plane);
				}
		}

		private int handleSceneState()
		{
				if (!floorData.equals("") || !ObjectData.equals(""))
				{
						floorData = "";
						ObjectData = "";
				}
				for (int i = 0; i < objectScapeData.length; i++)
				{

						floorData += "  " + objectScapeUIDs[i];
						ObjectData += "  " + landScapeUIDs[i];

						if (ClientConfiguration.DEBUG_MODE)
						{

								boolean skip = false;
								for (int index = 0; index < KeyBoardAction.test.size(); index++)
								{
										if (KeyBoardAction.test.get(index).equals(objectScapeUIDs[i] + ""))
										{
												skip = true;
												break;
										}
								}
								if (!skip)
								{
										KeyBoardAction.test.add(objectScapeUIDs[i] + "");
								}
								skip = false;
								for (int index = 0; index < KeyBoardAction.test.size(); index++)
								{
										if (KeyBoardAction.test.get(index).equals(landScapeUIDs[i] + ""))
										{
												skip = true;
												break;
										}
								}
								if (!skip)
								{
										KeyBoardAction.test.add(landScapeUIDs[i] + "");
								}

						}

						if (objectScapeData[i] == null && objectScapeUIDs[i] != -1)
						{
								return -1;
						}
						if (landScapeData[i] == null && landScapeUIDs[i] != -1)
						{
								return -2;
						}
				}
				boolean flag = true;
				for (int j = 0; j < objectScapeData.length; j++)
				{
						byte abyte0[] = landScapeData[j];
						if (abyte0 != null)
						{
								int k = (chunkUIDs[j] >> 8) * 64 - baseX;
								int l = (chunkUIDs[j] & 0xff) * 64 - baseY;
								if (loadingReceivedMap)
								{
										k = 10;
										l = 10;
								}
								flag &= ObjectManager.allObjectsLoaded(k, abyte0, l);
						}
				}
				if (!flag)
				{
						return -3;
				}
				if (sceneIsLoading)
				{
						return -4;
				}
				else
				{
						setLoadingStage(2);
						ObjectManager.buildPlane = plane;
						loadScene();
						stream.createFrame(121);
						return 0;
				}
		}

		private void drawProjectiles()
		{
				for (SceneProjectile class30_sub2_sub4_sub4 = (SceneProjectile) projectiles.reverseGetFirst(); class30_sub2_sub4_sub4 != null; class30_sub2_sub4_sub4 = (SceneProjectile) projectiles.reverseGetNext())
						if (class30_sub2_sub4_sub4.plane != plane || loopCycle > class30_sub2_sub4_sub4.endCycle)
						{
								class30_sub2_sub4_sub4.unlink();
						}
						else if (loopCycle >= class30_sub2_sub4_sub4.anInt1571)
						{
								if (class30_sub2_sub4_sub4.target > 0)
								{
										Npc npc = npcArray[class30_sub2_sub4_sub4.target - 1];
										if (npc != null && npc.x >= 0 && npc.x < 13312 && npc.y >= 0 && npc.y < 13312)
										{
												class30_sub2_sub4_sub4.update(loopCycle, npc.y, getLand(class30_sub2_sub4_sub4.plane, npc.y, npc.x) - class30_sub2_sub4_sub4.anInt1583, npc.x);
										}
								}
								if (class30_sub2_sub4_sub4.target < 0)
								{
										int j = -class30_sub2_sub4_sub4.target - 1;
										Player player;
										if (j == unknownInt10)
										{
												player = myPlayer;
										}
										else
										{
												player = playerArray[j];
										}
										if (player != null && player.x >= 0 && player.x < 13312 && player.y >= 0 && player.y < 13312)
										{
												class30_sub2_sub4_sub4.update(loopCycle, player.y, getLand(class30_sub2_sub4_sub4.plane, player.y, player.x) - class30_sub2_sub4_sub4.anInt1583, player.x);
										}
								}
								class30_sub2_sub4_sub4.update(animCycle);
								landScape.add(plane, class30_sub2_sub4_sub4.yaw, (int) class30_sub2_sub4_sub4.startElevation, -1, (int) class30_sub2_sub4_sub4.startY, 60, (int) class30_sub2_sub4_sub4.startX, class30_sub2_sub4_sub4, false);
						}

		}

		public AppletContext getAppletContext()
		{
				if (SignLink.mainapp != null)
						return SignLink.mainapp.getAppletContext();
				else
						return super.getAppletContext();
		}

		private void processOnDemandQueue()
		{
				do
				{
						OnDemandData onDemandData;
						do
						{
								onDemandData = onDemandFetcher.getNextNode();
								if (onDemandData == null)
								{
										return;
								}

								if (onDemandData.dataType == 0)
								{
										Model.method460(onDemandData.buffer, onDemandData.ID);
								}
								if (onDemandData.dataType == 1)
								{
										SequenceFrame.load(onDemandData.ID, onDemandData.buffer);
								}

								if (onDemandData.dataType == 4)
								{
										Texture.decode(onDemandData.ID, onDemandData.buffer);
								}
								if (onDemandData.dataType == 2 && onDemandData.ID == nextSong && onDemandData.buffer != null)
								{
										Music.playMidi(onDemandData.buffer);
								}
								if (onDemandData.dataType == 3 && getLoadingStage() == 1)
								{
										for (int i = 0; i < objectScapeData.length; i++)
										{
												if (objectScapeUIDs[i] == onDemandData.ID)
												{
														objectScapeData[i] = onDemandData.buffer;
														if (onDemandData.buffer == null)
														{
																objectScapeUIDs[i] = -1;
														}
														break;
												}
												if (landScapeUIDs[i] != onDemandData.ID)
												{
														continue;
												}
												landScapeData[i] = onDemandData.buffer;
												if (onDemandData.buffer == null)
												{
														landScapeUIDs[i] = -1;
												}
												break;
										}

								}
						}
						while (onDemandData.dataType != 93 || !onDemandFetcher.regionIsLoaded(onDemandData.ID));
						ObjectManager.evaluateObjects(new Stream(onDemandData.buffer), onDemandFetcher);
				}
				while (true);
		}

		protected static void resetInterfaceSequence(int i)
		{
				try
				{
						RSInterface class9 = RSInterface.interfaceCache[i];
						if (class9 == null || class9.children == null)
								return;
						for (int j = 0; j < class9.children.length; j++)
						{
								if (class9.children[j] == -1)
										break;
								RSInterface class9_1 = RSInterface.interfaceCache[class9.children[j]];
								if (class9_1 == null)
										continue;
								if (class9_1.getType() == 1)
										resetInterfaceSequence(class9_1.id);
								class9_1.sequenceFrame = 0;
								class9_1.sequenceCycle = 0;
						}
				}
				catch (Exception e)
				{
						e.printStackTrace();
				}
		}

		private void drawHeadIcon()
		{
				if (markType != 2)
				{
						return;
				}
				calcEntityScreenPos((markedX - baseX << 7) + anInt937, anInt936 * 2, (markedY - baseY << 7) + anInt938, "");
				if (spriteDrawX > -1 && loopCycle % 20 < 10)
				{
						headIconsHint[0].drawSprite(spriteDrawX - 12, spriteDrawY - 28);
				}
		}

		private void mainGameProcessor()
		{
				if (systemUpdateCycle > 1)
				{
						systemUpdateCycle--;
				}
				if (logoutCycle > 0)
				{
						logoutCycle--;
				}
				for (int j = 0; j < 5; j++)
				{
						if (!Packet.parsePacket())
						{
								break;
						}
				}

				if (!isLoggedIn())
				{
						return;
				}
				/*
				synchronized (mouseDetection.syncObject)
				{
						if (flagged)
						{
								if (super.getClickMode3() != 0 || mouseDetection.coordsIndex >= 40)
								{
										stream.createFrame(45);
										stream.writeWordBigEndian(0);
										int j2 = stream.currentOffset;
										int j3 = 0;
										for (int j4 = 0; j4 < mouseDetection.coordsIndex; j4++)
										{
												if (j2 - stream.currentOffset >= 240)
														break;
												j3++;
												int l4 = mouseDetection.coordsY[j4];
												if (l4 < 0)
														l4 = 0;
												else if (l4 > 502)
														l4 = 502;
												int k5 = mouseDetection.coordsX[j4];
												if (k5 < 0)
												{
														k5 = 0;
												}
												else if (k5 > 764)
												{
														k5 = 764;
												}
												int i6 = l4 * 765 + k5;
												if (mouseDetection.coordsY[j4] == -1 && mouseDetection.coordsX[j4] == -1)
												{
														k5 = -1;
														l4 = -1;
														i6 = 0x7ffff;
												}
												if (k5 == mouseRecorderLastX && l4 == mouseRecorderLastY)
												{
														if (mouseRecorderIdleCycles < 2047)
																mouseRecorderIdleCycles++;
												}
												else
												{
														int j6 = k5 - mouseRecorderLastX;
														mouseRecorderLastX = k5;
														int k6 = l4 - mouseRecorderLastY;
														mouseRecorderLastY = l4;
														if (mouseRecorderIdleCycles < 8 && j6 >= -32 && j6 <= 31 && k6 >= -32 && k6 <= 31)
														{
																j6 += 32;
																k6 += 32;
																stream.writeWord((mouseRecorderIdleCycles << 12) + (j6 << 6) + k6);
																mouseRecorderIdleCycles = 0;
														}
														else if (mouseRecorderIdleCycles < 8)
														{
																stream.writeDWordBigEndian(0x800000 + (mouseRecorderIdleCycles << 19) + i6);
																mouseRecorderIdleCycles = 0;
														}
														else
														{
																stream.writeDWord(0xc0000000 + (mouseRecorderIdleCycles << 19) + i6);
																mouseRecorderIdleCycles = 0;
														}
												}
										}
				
										stream.writeBytes(stream.currentOffset - j2);
										if (j3 >= mouseDetection.coordsIndex)
										{
												mouseDetection.coordsIndex = 0;
										}
										else
										{
												mouseDetection.coordsIndex -= j3;
												for (int i5 = 0; i5 < mouseDetection.coordsIndex; i5++)
												{
														mouseDetection.coordsX[i5] = mouseDetection.coordsX[i5 + j3];
														mouseDetection.coordsY[i5] = mouseDetection.coordsY[i5 + j3];
												}
				
										}
								}
						}
						else
						{
								mouseDetection.coordsIndex = 0;
						}
				}
				*/
				if (super.getClickMode3() != 0)
				{
						long l = (super.aLong29 - lastClickTime) / 50L;
						if (l > 4095L)
								l = 4095L;
						lastClickTime = super.aLong29;
						int k2 = super.saveClickY;
						if (k2 < 0)
						{
								k2 = 0;
						}
						else if (k2 > 502)
						{
								k2 = 502;
						}
						int k3 = super.saveClickX;
						if (k3 < 0)
						{
								k3 = 0;
						}
						else if (k3 > 764)
						{
								k3 = 764;
						}
						int k4 = k2 * 765 + k3;
						int j5 = 0;
						if (super.getClickMode3() == 2)
								j5 = 1;
						int l5 = (int) l;
						stream.createFrame(241);
						stream.writeDWord((l5 << 20) + (j5 << 19) + k4);
				}
				if (sendCameraInfoCycle > 0)
				{
						sendCameraInfoCycle--;
				}
				if (super.keyArray[1] == 1 || super.keyArray[2] == 1 || super.keyArray[3] == 1 || super.keyArray[4] == 1)
				{
						cameraSendingInfo = true;
				}
				if (cameraSendingInfo && sendCameraInfoCycle <= 0)
				{
						sendCameraInfoCycle = 20;
						cameraSendingInfo = false;
						stream.createFrame(86);
						stream.writeWord(chaseCameraPitch);
						stream.method432(viewRotation);
				}
				if (super.awtFocus && !isFocused)
				{
						isFocused = true;
						stream.createFrame(3);
						stream.writeWordBigEndian(1);
				}
				if (!super.awtFocus && isFocused)
				{
						isFocused = false;
						stream.createFrame(3);
						stream.writeWordBigEndian(0);
				}
				RSInterface.reloadInterfaces(false);
				ItemDefinition.reloadItems();
				Content.noClip();
				loadingStages();
				handleObjects();
				Music.soundSystem();
				netIdleCycles++;
				if (isDisconnected() && System.currentTimeMillis() - timeDroppedClient > 4000)
				{
						dropClient();
				}
				UpdateEntity.handlePlayers();
				Entity.handleNPCs(this);
				handleSpoken();
				animCycle++;
				if (crossType != 0)
				{
						crossIndex += 20;
						if (crossIndex >= 400)
						{
								crossType = 0;
						}
				}
				if (atInventoryInterfaceType != 0)
				{
						atInventoryLoopCycle++;
						if (atInventoryLoopCycle >= 15)
						{
								if (atInventoryInterfaceType == 3)
								{
										setInputTaken(true);
								}
								atInventoryInterfaceType = 0;
						}
				}
				if (activeInterfaceType != 0)
				{
						dragCycle++;
						if (super.mouseX > pressX + 5 || super.mouseX < pressX - 5 || super.mouseY > pressY + 5 || super.mouseY < pressY - 5)
						{
								isDragging = true;
						}
						if (super.clickMode2 == 0)
						{
								if (activeInterfaceType == 3)
								{
										setInputTaken(true);
								}
								activeInterfaceType = 0;
								if (isDragging && dragCycle >= draggingSensitivity) // increase for more Click sensitivity, this has to be matched with the dragCycle variable.
								{
										lastActiveInvInterface = -1;
										processRightClick();
										//Utility.print("Here1: " + focusedDragWidget);
										// When swapping items in bank, 5382 is called, even if the swap failed.

										// Bank tabs.
										// TODO #FULLSCREEN ADJUST interfaces, bank dragging into another tab.
										int x = isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 256;
										int y = isFixedScreen() ? 0 : (Client.getClientHeight() / 2) - 271;
										if (focusedDragWidget == 5382 && super.mouseY >= 40 + y && super.mouseY <= 77 + y)
										{ // check if bank interface
												if (super.mouseX >= 28 + x && super.mouseX <= 74 + x)
												{ // tab 1
														stream.createFrame(214);
														stream.method433(5); // 5 = maintab
														stream.method424(0);
														stream.method433(dragFromSlot); // Selected item slot
														stream.method431(mouseInvInterfaceIndex); // unused
												}
												if (super.mouseX >= 75 + x && super.mouseX <= 121 + x)
												{ // tab 1
														stream.createFrame(214);
														stream.method433(13); // tab # x 13 (originally movewindow)
														stream.method424(0);
														stream.method433(dragFromSlot); // Selected item slot
														stream.method431(mouseInvInterfaceIndex); // unused
												}
												if (super.mouseX >= 122 + x && super.mouseX <= 168 + x)
												{ // tab 2
														stream.createFrame(214);
														stream.method433(26); // tab # x 13 (originally movewindow)
														stream.method424(0);
														stream.method433(dragFromSlot); // Selected item slot
														stream.method431(mouseInvInterfaceIndex); // unused
												}
												if (super.mouseX >= 169 + x && super.mouseX <= 215 + x)
												{ // tab 3
														stream.createFrame(214);
														stream.method433(39); // tab # x 13 (originally movewindow)
														stream.method424(0);
														stream.method433(dragFromSlot); // Selected item slot
														stream.method431(mouseInvInterfaceIndex); // unused
												}
												if (super.mouseX >= 216 + x && super.mouseX <= 262 + x)
												{ // tab 4
														stream.createFrame(214);
														stream.method433(52); // tab # x 13 (originally movewindow)
														stream.method424(0);
														stream.method433(dragFromSlot); // Selected item slot
														stream.method431(mouseInvInterfaceIndex); // unused
												}
												if (super.mouseX >= 263 + x && super.mouseX <= 309 + x)
												{ // tab 5
														stream.createFrame(214);
														stream.method433(65); // tab # x 13 (originally movewindow)
														stream.method424(0);
														stream.method433(dragFromSlot); // Selected item slot
														stream.method431(mouseInvInterfaceIndex); // unused
												}
												if (super.mouseX >= 310 + x && super.mouseX <= 356 + x)
												{ // tab 6
														stream.createFrame(214);
														stream.method433(78); // tab # x 13 (originally movewindow)
														stream.method424(0);
														stream.method433(dragFromSlot); // Selected item slot
														stream.method431(mouseInvInterfaceIndex); // unused
												}
												if (super.mouseX >= 357 + x && super.mouseX <= 403 + x)
												{ // tab 7
														stream.createFrame(214);
														stream.method433(91); // tab # x 13 (originally movewindow)
														stream.method424(0);
														stream.method433(dragFromSlot); // Selected item slot
														stream.method431(mouseInvInterfaceIndex); // unused
												}
												if (super.mouseX + x >= 404 && super.mouseX <= 450 + x)
												{ // tab 8
														stream.createFrame(214);
														stream.method433(104); // tab # x 13 (originally movewindow)
														stream.method424(0);
														stream.method433(dragFromSlot); // Selected item slot
														stream.method431(mouseInvInterfaceIndex); // unused
												}
										}

										//Utility.print("Here2: " + lastActiveInvInterface);
										// When lastActiveInvInterface is not equal to 5382, then it will refuse to swap.
										if (lastActiveInvInterface == focusedDragWidget && mouseInvInterfaceIndex != dragFromSlot)
										{
												RSInterface class9 = RSInterface.interfaceCache[focusedDragWidget];
												int j1 = 0;
												if (anInt913 == 1 && class9.actionType == 206)
												{
														j1 = 1;
												}
												if (class9.inv[mouseInvInterfaceIndex] <= 0)
												{
														j1 = 0;
												}
												if (class9.itemsAreSwappable)
												{
														int l2 = dragFromSlot;
														int l3 = mouseInvInterfaceIndex;
														class9.inv[l3] = class9.inv[l2];
														class9.invStackSizes[l3] = class9.invStackSizes[l2];
														class9.inv[l2] = -1;
														class9.invStackSizes[l2] = 0;
												}
												else if (j1 == 1)
												{
														int i3 = dragFromSlot;
														for (int i4 = mouseInvInterfaceIndex; i3 != i4;)

														{
																if (i3 > i4)
																{
																		class9.swapInventoryItems(i3, i3 - 1);
																		i3--;
																}
																else if (i3 < i4)
																{
																		class9.swapInventoryItems(i3, i3 + 1);
																		i3++;
																}
														}

												}
												else
												{
														class9.swapInventoryItems(dragFromSlot, mouseInvInterfaceIndex);
												}
												stream.createFrame(214);
												stream.method433(focusedDragWidget);
												stream.method424(j1);
												stream.method433(dragFromSlot);
												stream.method431(mouseInvInterfaceIndex);
										}
								}
								else if ((useOneMouseButton == 1 || menuHasAddFriend(menuActionRow - 1)) && menuActionRow > 2)
								{
										determineMenuSize();
								}
								else if (menuActionRow > 0)
								{
										Action.doAction(menuActionRow - 1);
								}
								atInventoryLoopCycle = 10;
								super.setClickMode3(0);
						}
				}
				if (Landscape.clickLocalX != -1)
				{
						int x = Landscape.clickLocalX;
						int y = Landscape.clickLocalY;

						int xPlayer = Client.instance.baseX + (Client.myPlayer.x - 6 >> 7);
						int yPlayer = Client.instance.baseY + (Client.myPlayer.y - 6 >> 7);
						if (yPlayer >= 3921 && yPlayer <= 3946 && xPlayer >= 3093 && xPlayer <= 3117)
						{
								// Mage arena area.
						}
						else
						{
								if (useSavedCoordinates)
								{
										x = saveRightClickX;
										y = saveRightClickY;
										useSavedCoordinates = false;
								}
						}
						boolean flag = doWalkTo(0, 0, 0, 0, myPlayer.smallY[0], 0, 0, y, myPlayer.smallX[0], true, x);
						Landscape.clickLocalX = -1;
						if (flag)
						{
								crossX = super.saveClickX;
								crossY = super.saveClickY;
								crossType = 1;
								crossIndex = 0;
						}
				}
				if (super.getClickMode3() == 1 && notifyMessage != null)
				{
						notifyMessage = null;
						setInputTaken(true);
						super.setClickMode3(0);
				}
				if (!processMenuClick())
				{
						MiniMap.clickOnMiniMap();
						InventoryTab.processTabClick(this);
						ChatArea.channelButtonApplyHoverOld(this);
						ChatArea.channelButtonApplyHoverNew(this);
				}
				if (super.clickMode2 == 1 || super.getClickMode3() == 1)
				{
						clickCycle++;
				}
				if (anInt1500 != 0 || anInt1044 != 0 || anInt1129 != 0)
				{
						if (menuHoveredTimer < 50 && !menuOpen)
						{
								menuHoveredTimer++;
								if (menuHoveredTimer == 50)
								{
										if (anInt1500 != 0)
										{
												setInputTaken(true);
										}
								}
						}
				}
				else if (menuHoveredTimer > 0)
				{
						menuHoveredTimer--;
				}
				if (getLoadingStage() == 2)
				{
						handleCamera();
				}
				if (getLoadingStage() == 2 && inCutsceneMode)
				{
						calcCameraPos();
				}
				for (int i1 = 0; i1 < 5; i1++)
				{
						cameraEffectCycles[i1]++;
				}

				KeyBoardAction.handleKeyboard();
				super.idleTime++;
				if (super.idleTime > 4500)
				{
						logoutCycle = 250;
						super.idleTime -= 500;
						stream.createFrame(202);
				}
				heartbeatCycle++;
				if (heartbeatCycle > 50)
				{
						stream.createFrame(0);
				}
				try
				{
						if (socketStream != null && stream.currentOffset > 0)
						{
								socketStream.queueBytes(stream.currentOffset, stream.buffer);
								stream.currentOffset = 0;
								heartbeatCycle = 0;
						}
				}
				catch (IOException _ex)
				{
						dropClient();
				}
				catch (Exception exception)
				{
						Utility.print("Kicked5: " + getLoadingStage());
						logOutUpdate();
				}
		}

		private void handleSpawnedObjects()
		{
				TemporaryObject class30_sub1 = (TemporaryObject) objects.reverseGetFirst();
				for (; class30_sub1 != null; class30_sub1 = (TemporaryObject) objects.reverseGetNext())
						if (class30_sub1.cycle == -1)
						{
								class30_sub1.spawnCycle = 0;
								handleTemporaryObjects(class30_sub1);
						}
						else
						{
								class30_sub1.unlink();
						}

		}

		public void resetImageProducers()
		{
				if (aRSImageProducer_1107 != null)
				{
						return;
				}
				super.fullGameScreen = null;
				chatBackImage = null;
				mapBackImage = null;
				inventoryBackImage = null;
				inGameScreen = null;
				aRSImageProducer_1107 = constructGraphicsBuffer(509, 171, getGameComponent());
				DrawingArea.setAllPixelsToZero();
				aRSImageProducer_1109 = constructGraphicsBuffer(getClientWidth(), getClientHeight(), getGameComponent());
				DrawingArea.setAllPixelsToZero();
				if (titleStreamLoader != null)
				{
						loadTitleScreen();
				}
				welcomeScreenRaised = true;
		}

		public void drawLoadingText(int i, String s)
		{
				if (interfacesReloaded)
				{
						return;
				}
				anInt1079 = i;
				aString1049 = s;
				resetImageProducers();
				if (titleStreamLoader == null)
				{
						super.drawLoadingText(i, s);
						return;
				}
				aRSImageProducer_1109.initDrawingArea();
				char c = '\u0168';
				char c1 = '\310';
				byte byte1 = 20;
				aRSImageProducer_1109.drawGraphics(getClientWidth(), super.graphics, getClientHeight());
				backgroundSprite[0].drawSprite(0, 0);

				int j1 = 480; // Loading bars position
				DrawingArea.fillPixels(-1, 767, 32, 0, j1);
				DrawingArea.fillPixels(-1, 767, 34, 0, j1);
				int color = 0xc5a316;
				int color2 = 0;

				while (color2 <= 30)
				{
						DrawingArea.drawPixels(30 - color2, j1 + -1, 0, color, 767); // Loading
						// bar.
						color += 65536 * 2;
						color2 += 1;
				}
				DrawingArea.drawPixels(30, j1 + -1, 0 + i, 0, 767);
				chatTextDrawingArea.drawText(0xFFFFFF, s, c1 / 2 + 415 - byte1, c + 30);
				aRSImageProducer_1109.drawGraphics(0, super.graphics, 0);
				welcomeScreenRaised = false;
		}

		private void handleScrollbarMouse(int i, int j, int k, int l, RSInterface class9, int i1, boolean flag, int j1)
		{
				if (scrollUp)
				{
						class9.scrollPosition = 0;
						scrollUp = false;
						return;
				}
				int anInt992;
				if (aBoolean972)
				{
						anInt992 = 32;
				}
				else
				{
						anInt992 = 0;
				}
				aBoolean972 = false;
				if (k >= i && k < i + 16 && l >= i1 && l < i1 + 16)
				{
						class9.scrollPosition -= clickCycle * 4;
				}
				else if (k >= i && k < i + 16 && l >= (i1 + j) - 16 && l < i1 + j)
				{
						class9.scrollPosition += clickCycle * 4;
				}
				else if (k >= i - anInt992 && k < i + 16 + anInt992 && l >= i1 + 16 && l < (i1 + j) - 16 && clickCycle > 0)
				{
						int l1 = ((j - 32) * j) / j1;
						if (l1 < 8)
						{
								l1 = 8;
						}
						int i2 = l - i1 - 16 - l1 / 2;
						int j2 = j - 32 - l1;
						class9.scrollPosition = ((j1 - j) * i2) / j2;
						aBoolean972 = true;
				}
		}

		protected boolean interactWithObject(int i, int j, int k)
		{
				int i1 = i >> 14 & 0x7fff;
				int j1 = landScape.getArrangement(plane, k, j, i);
				if (j1 == -1)
				{
						return false;
				}
				int k1 = j1 & 0x1f;
				int l1 = j1 >> 6 & 3;
				if (k1 == 10 || k1 == 11 || k1 == 22)
				{
						ObjectDefinition class46 = ObjectDefinition.forID(i1);
						int i2;
						int j2;
						if (l1 == 0 || l1 == 2)
						{
								i2 = class46.sizeX;
								j2 = class46.sizeY;
						}
						else
						{
								i2 = class46.sizeY;
								j2 = class46.sizeX;
						}
						int k2 = class46.rotationFlags;
						if (l1 != 0)
						{
								k2 = (k2 << l1 & 0xf) + (k2 >> 4 - l1);
						}
						doWalkTo(2, 0, j2, 0, myPlayer.smallY[0], i2, k2, j, myPlayer.smallX[0], false, k);
				}
				else
				{
						doWalkTo(2, l1, 0, k1 + 1, myPlayer.smallY[0], 0, 0, j, myPlayer.smallX[0], false, k);
				}
				crossX = super.saveClickX;
				crossY = super.saveClickY;
				crossType = 2;
				crossIndex = 0;
				return true;
		}

		public StreamLoader streamLoaderForName(int i, String s, String s1, int j, int k)
		{
				byte abyte0[] = null;
				int l = 5;
				try
				{
						if (decompressors[0] != null)
						{
								abyte0 = decompressors[0].decompress(i);
						}
				}
				catch (Exception _ex)
				{
				}
				if (abyte0 != null)
				{
						// aCRC32_930.reset();
						// aCRC32_930.update(abyte0);
						// int i1 = (int)aCRC32_930.getValue();
						// if(i1 != j)
				}
				if (abyte0 != null)
				{
						StreamLoader streamLoader = new StreamLoader(abyte0);
						return streamLoader;
				}
				int j1 = 0;
				while (abyte0 == null)
				{
						String s2 = "Unknown error";
						try
						{
								int k1 = 0;
								DataInputStream datainputstream = openJagGrabInputStream(s1 + j);
								byte abyte1[] = new byte[6];
								datainputstream.readFully(abyte1, 0, 6);
								Stream stream = new Stream(abyte1);
								stream.currentOffset = 3;
								int i2 = stream.read3Bytes() + 6;
								int j2 = 6;
								abyte0 = new byte[i2];
								System.arraycopy(abyte1, 0, abyte0, 0, 6);

								while (j2 < i2)
								{
										int l2 = i2 - j2;
										if (l2 > 1000)
										{
												l2 = 1000;
										}
										int j3 = datainputstream.read(abyte0, j2, l2);
										if (j3 < 0)
										{
												s2 = "Length error: " + j2 + "/" + i2;
												throw new IOException("EOF");
										}
										j2 += j3;
										int k3 = (j2 * 100) / i2;
										if (k3 != k1)
										{
												drawLoadingText(k, "Loading " + s + " - " + k3 + "%");
										}
										k1 = k3;
								}
								datainputstream.close();
								try
								{
										if (decompressors[0] != null)
										{
												decompressors[0].method234(abyte0.length, abyte0, i);
										}
								}
								catch (Exception _ex)
								{
										decompressors[0] = null;
								}
								/*
												 * if(abyte0 != null) { aCRC32_930.reset(); aCRC32_930.update(abyte0); int i3 = (int)aCRC32_930.getValue(); if(i3 != j) { abyte0 = null; j1++; s2 = "Checksum error: " + i3; } }
												 */
						}
						catch (IOException ioexception)
						{
								if (s2.equals("Unknown error"))
								{
										s2 = "Please go to your user folder, delete the ShatterScape file and restart this client.";
								}
								abyte0 = null;
						}
						catch (NullPointerException _ex)
						{
								s2 = "Null error";
								abyte0 = null;
								if (!SignLink.reporterror)
								{
										return null;
								}
						}
						catch (ArrayIndexOutOfBoundsException _ex)
						{
								s2 = "Bounds error";
								abyte0 = null;
								if (!SignLink.reporterror)
								{
										return null;
								}
						}
						catch (Exception _ex)
						{
								s2 = "Unexpected error";
								abyte0 = null;
								if (!SignLink.reporterror)
								{
										return null;
								}
						}
						if (abyte0 == null)
						{
								for (int l1 = l; l1 > 0; l1--)
								{
										if (j1 >= 3)
										{
												drawLoadingText(k, "Game updated - please reload page");
												l1 = 10;
										}
										else
										{
												drawLoadingText(k, s2 + "");
										}
										try
										{
												Thread.sleep(1000L);
										}
										catch (Exception _ex)
										{
										}
								}

								l *= 2;
								if (l > 60)
								{
										l = 60;
								}
								useJagGrab = !useJagGrab;
						}

				}

				StreamLoader streamLoader_1 = new StreamLoader(abyte0);
				return streamLoader_1;
		}

		private boolean disconnected;

		long timeDisconnected;

		long timeDroppedClient;

		public static boolean ignorePromptInputReset;

		protected void dropClient()
		{
				if (logoutCycle > 0)
				{
						Utility.print("Kicked1: " + getLoadingStage());
						logOutUpdate();
						return;
				}
				timeDroppedClient = System.currentTimeMillis();
				if (!isDisconnected())
				{
						timeDisconnected = System.currentTimeMillis();
				}
				setDisconnected(true);
				minimapState = 0;
				destX = 0;
				RSSocket rsSocket = socketStream;
				Content.connectionLostAlert();
				if (ENABLE_RECONNECTING)
				{
						login(myUsername, myPassword, true);
				}
				if (!isLoggedIn())
				{
						Utility.print("Kicked2: " + getLoadingStage());
						logOutUpdate();
				}
				try
				{
						rsSocket.close();
				}
				catch (Exception _ex)
				{
				}

				if (isDisconnected() && System.currentTimeMillis() - timeDisconnected > (ENABLE_RECONNECTING ? 17000 : 6000))
				{
						Utility.print("Kicked3: " + getLoadingStage() + ", " + (System.currentTimeMillis() - timeDisconnected));
						logOutUpdate();
						return;
				}
		}

		public void sendCommandPacket(String data)
		{
				String previous = Client.instance.inputString;
				inputString = data;
				stream.createFrame(103);
				stream.writeWordBigEndian(this.inputString.length() - 1);
				stream.writeString(this.inputString.substring(2));
				Client.instance.inputString = previous;
				if (!ignorePromptInputReset) // Needed to not reset the search string when withdrawing all but one or x while searching bank.
				{
						promptInput = "";
						bankSearchSent = "";
				}
				inputValue = -1;
		}

		public static void setToFixed()
		{
				// Change resizable button to un-clicked.
				Client.instance.sendFrame36(200, 0);
				Client.displayMode = "FIXED";
				Client.setFixedScreen(true);
				Client.isFixedScreenSaved = true;
				Jframe.rebuild(false);
				Client.setBounds();
				Client.CameraPos1 = 3;
				Settings.saveSettings();
				setInterfaceClicked(20203, true);

		}

		private void handleMessageState()
		{
				messagesAreIgnored = 0;
				int j = (myPlayer.x >> 7) + baseX;
				int k = (myPlayer.y >> 7) + baseY;
				if (j >= 3053 && j <= 3156 && k >= 3056 && k <= 3136)
				{
						messagesAreIgnored = 1;
				}
				if (j >= 3072 && j <= 3118 && k >= 9492 && k <= 9535)
				{
						messagesAreIgnored = 1;
				}
				if (messagesAreIgnored == 1 && j >= 3139 && j <= 3199 && k >= 3008 && k <= 3062)
				{
						messagesAreIgnored = 0;
				}
		}

		public void run()
		{
				if (!drawFlames)
				{
						super.run();
				}
		}

		private void build3dScreenMenu()
		{
				if (itemSelected == 0 && spellSelected == 0)
				{
						menuActionName[menuActionRow] = "Walk here";
						menuActionID[menuActionRow] = 516;
						menuActionCmd2[menuActionRow] = super.mouseX;
						menuActionCmd3[menuActionRow] = super.mouseY;
						menuActionRow++;
				}
				int j = -1;
				boolean drawInteractedPlayer = false;

				// It loops through all visible models on the screen, from furthest to nearest.
				for (int k = 0; k < Model.anInt1687; k++)
				{
						int l = Model.anIntArray1688[k];
						int i1 = l & 0x7f;
						int j1 = l >> 7 & 0x7f;
						int k1 = l >> 29 & 3;
						int arrayIndex = l >> 14 & 0x7fff;
						if (l == j)
						{
								continue;
						}
						j = l;
						if (k1 == 2 && landScape.getArrangement(plane, i1, j1, l) >= 0)
						{
								ObjectDefinition object = ObjectDefinition.forID(arrayIndex);
								if (object.childrenIDs != null)
								{
										object = object.getOverride();
								}
								if (object == null)
								{
										continue;
								}
								if (itemSelected == 1)
								{
										menuActionName[menuActionRow] = "Use " + selectedItemName + " with @cya@" + object.name;
										menuActionID[menuActionRow] = 62;
										menuActionCmd1[menuActionRow] = l;
										menuActionCmd2[menuActionRow] = i1;
										menuActionCmd3[menuActionRow] = j1;
										menuActionRow++;
								}
								else if (spellSelected == 1)
								{
										if ((spellUsableOn & 4) == 4)
										{
												menuActionName[menuActionRow] = spellTooltip + " @cya@" + object.name;
												menuActionID[menuActionRow] = 956;
												menuActionCmd1[menuActionRow] = l;
												menuActionCmd2[menuActionRow] = i1;
												menuActionCmd3[menuActionRow] = j1;
												menuActionRow++;
										}
								}
								else
								{
										if (object.actions != null)
										{
												for (int i2 = 4; i2 >= 0; i2--)
												{
														if (object.actions[i2] != null)
														{
																menuActionName[menuActionRow] = object.actions[i2] + " @cya@" + object.name;
																if (i2 == 0)
																{
																		menuActionID[menuActionRow] = 502;
																}
																if (i2 == 1)
																{
																		menuActionID[menuActionRow] = 900;
																}
																if (i2 == 2)
																{
																		menuActionID[menuActionRow] = 113;
																}
																if (i2 == 3)
																{
																		menuActionID[menuActionRow] = 872;
																}
																if (i2 == 4)
																{
																		menuActionID[menuActionRow] = 1062;
																}
																menuActionCmd1[menuActionRow] = l;
																menuActionCmd2[menuActionRow] = i1;
																menuActionCmd3[menuActionRow] = j1;
																menuActionRow++;
														}
												}

										}
										if (ClientConfiguration.DEBUG_MODE)
										{
												menuActionName[menuActionRow] = "Examine @cya@" + object.name + ", " + object.type;
										}
										else
										{
												menuActionName[menuActionRow] = "Examine @cya@" + object.name;
										}
										menuActionID[menuActionRow] = 1226;
										menuActionCmd1[menuActionRow] = object.type << 14;
										menuActionCmd2[menuActionRow] = i1;
										menuActionCmd3[menuActionRow] = j1;
										menuActionRow++;
								}
						}
						if (k1 == 1)
						{
								Npc npc = npcArray[arrayIndex];
								if (npc.desc.size == 1 && (npc.x & 0x7f) == 64 && (npc.y & 0x7f) == 64)
								{
										for (int index = 0; index < npcCount; index++)
										{
												Npc npc2 = npcArray[npcIndices[index]];
												if (npc2 != null && npc2 != npc && npc2.desc.size == 1 && npc2.x == npc.x && npc2.y == npc.y)
												{
														buildAtNPCMenu(npc2.desc, npcIndices[index], j1, i1, index);
												}
										}

										for (int l2 = 0; l2 < playerCount; l2++)
										{
												Player player = playerArray[playerIndices[l2]];
												if (player != null && player.x == npc.x && player.y == npc.y)
												{
														buildAtPlayerMenu(i1, playerIndices[l2], player, j1);
												}
										}

								}
								buildAtNPCMenu(npc.desc, arrayIndex, j1, i1, arrayIndex);
						}
						if (k1 == 0)
						{
								Player playerOnTop = playerArray[arrayIndex]; // The player ontop.
								Player interactingPlayer = playerArray[interactingWithEntityId];
								if ((playerOnTop.x & 0x7f) == 64 && (playerOnTop.y & 0x7f) == 64)
								{
										for (int k2 = 0; k2 < npcCount; k2++)
										{
												Npc npc = npcArray[npcIndices[k2]];
												try
												{
														if (npc != null && npc.desc.size == 1 && npc.x == playerOnTop.x && npc.y == playerOnTop.y)
														{
																buildAtNPCMenu(npc.desc, npcIndices[k2], j1, i1, arrayIndex);
														}
												}
												catch (Exception _ex)
												{
												}
										}

										for (int i3 = 0; i3 < playerCount; i3++)
										{
												Player loop = playerArray[playerIndices[i3]];
												if (loop != null && loop != playerOnTop && loop.x == playerOnTop.x && loop.y == playerOnTop.y)
												{
														buildAtPlayerMenu(i1, playerIndices[i3], loop, j1);
												}
										}

								}
								// These two is called on players.
								if (interactingPlayer != null)
								{
										if (!interactingPlayer.getName().equals(playerOnTop.getName()))
										{
												buildAtPlayerMenu(i1, arrayIndex, playerOnTop, j1); // Only called for the person that is ontop of my mouse.
										}
										else
										{
												drawInteractedPlayer = true;
										}
								}
								else
								{
										buildAtPlayerMenu(i1, arrayIndex, playerOnTop, j1); // Only called for the person that is ontop of my mouse.
								}

						}
						if (k1 == 3)
						{
								NodeList class19 = groundArray[plane][i1][j1];
								if (class19 != null)
								{
										for (Item item = (Item) class19.getFirst(); item != null; item = (Item) class19.getNext())
										{
												ItemDefinition itemDef = ItemDefinition.forId(item.itemId);
												if (itemSelected == 1)
												{
														menuActionName[menuActionRow] = "Use " + selectedItemName + " with @lre@" + itemDef.name;
														menuActionID[menuActionRow] = 511;
														menuActionCmd1[menuActionRow] = item.itemId;
														menuActionCmd2[menuActionRow] = i1;
														menuActionCmd3[menuActionRow] = j1;
														menuActionRow++;
												}
												else if (spellSelected == 1)
												{
														if ((spellUsableOn & 1) == 1)
														{
																menuActionName[menuActionRow] = spellTooltip + " @lre@" + itemDef.name;
																menuActionID[menuActionRow] = 94;
																menuActionCmd1[menuActionRow] = item.itemId;
																menuActionCmd2[menuActionRow] = i1;
																menuActionCmd3[menuActionRow] = j1;
																menuActionRow++;
														}
												}
												else
												{
														for (int j3 = 4; j3 >= 0; j3--)
																if (itemDef.groundOptions != null && itemDef.groundOptions[j3] != null)
																{
																		menuActionName[menuActionRow] = itemDef.groundOptions[j3] + " @lre@" + itemDef.name;
																		if (j3 == 0)
																		{
																				menuActionID[menuActionRow] = 652;
																		}
																		if (j3 == 1)
																		{
																				menuActionID[menuActionRow] = 567;
																		}
																		if (j3 == 2)
																		{
																				menuActionID[menuActionRow] = 234;
																		}
																		if (j3 == 3)
																		{
																				menuActionID[menuActionRow] = 244;
																		}
																		if (j3 == 4)
																		{
																				menuActionID[menuActionRow] = 213;
																		}
																		menuActionCmd1[menuActionRow] = item.itemId;
																		menuActionCmd2[menuActionRow] = i1;
																		menuActionCmd3[menuActionRow] = j1;
																		menuActionRow++;
																}
																else if (j3 == 2)
																{
																		menuActionName[menuActionRow] = "Take @lre@" + itemDef.name;
																		menuActionID[menuActionRow] = 234;
																		menuActionCmd1[menuActionRow] = item.itemId;
																		menuActionCmd2[menuActionRow] = i1;
																		menuActionCmd3[menuActionRow] = j1;
																		menuActionRow++;
																}
														menuActionName[menuActionRow] = "Examine @lre@" + itemDef.name;
														menuActionID[menuActionRow] = 1448;
														menuActionCmd1[menuActionRow] = item.itemId;
														menuActionCmd2[menuActionRow] = i1;
														menuActionCmd3[menuActionRow] = j1;
														menuActionRow++;
												}
										}

								}
						}
				}

				if (drawInteractedPlayer)
				{
						Player interactingPlayer = playerArray[interactingWithEntityId];
						if (interactingPlayer != null)
						{
								buildAtPlayerMenu(0, interactingWithEntityId, interactingPlayer, 0); // Only called for the person that is ontop of my mouse.
						}
				}

		}

		public void cleanUpForQuit()
		{
				SignLink.reporterror = false;
				try
				{
						if (socketStream != null)
						{
								socketStream.close();
						}
				}
				catch (Exception _ex)
				{
				}
				socketStream = null;
				Music.stopMidi();
				onDemandFetcher.disable();
				onDemandFetcher = null;
				aStream_834 = null;
				stream = null;
				aStream_847 = null;
				inStream = null;
				chunkUIDs = null;
				objectScapeData = null;
				landScapeData = null;
				objectScapeUIDs = null;
				landScapeUIDs = null;
				intGroundArray = null;
				byteGroundArray = null;
				landScape = null;
				collisionMap = null;
				pathWaypoint = null;
				pathDistance = null;
				bigX = null;
				bigY = null;
				tmpTexture = null;
				inventoryBackImage = null;
				leftFrame = null;
				topFrame = null;
				rightFrame = null;
				mapBackImage = null;
				inGameScreen = null;
				chatBackImage = null;
				chatButtons = null;
				backgroundSprite = null;
				compass = null;
				hitMarks = null;
				headIcons = null;
				skullIcons = null;
				headIconsHint = null;
				crosses = null;
				mapDotItem = null;
				mapDotNpc = null;
				mapDotPlayer = null;
				mapDotFriend = null;
				mapDotTeam = null;
				mapScenes = null;
				mapFunctions = null;
				tileCycleMap = null;
				playerArray = null;
				playerIndices = null;
				entityIndices = null;
				aStreamArray895s = null;
				entityUpdateIndices = null;
				npcArray = null;
				npcIndices = null;
				groundArray = null;
				objects = null;
				projectiles = null;
				spotanims = null;
				menuActionCmd2 = null;
				menuActionCmd3 = null;
				menuActionID = null;
				menuActionCmd1 = null;
				menuActionName = null;
				variousSettings = null;
				objectIconX = null;
				objectIconY = null;
				objectIcon = null;
				landImage = null;
				friendsList = null;
				friendsListAsLongs = null;
				friendsNodeIds = null;
				aRSImageProducer_1107 = null;
				aRSImageProducer_1109 = null;
				multiOverlay = null;
				nullLoader();
				ObjectDefinition.nullLoader();
				EntityDefinition.nullLoader();
				ItemDefinition.nullLoader();
				FloorDefinition.underlays = null;
				FloorDefinition.overlays = null;
				IdentityKit.cache = null;
				RSInterface.interfaceCache = null;
				Animation.anims = null;
				SpotAnim.cache = null;
				SpotAnim.aMRUNodes_415 = null;
				Varp.cache = null;
				super.fullGameScreen = null;
				Player.mruNodes = null;
				Rasterizer.nullLoader();
				Landscape.nullLoader();
				Model.nullLoader();
				SequenceFrame.nullLoader();
				System.gc();
		}

		Component getGameComponent()
		{
				if (SignLink.mainapp != null)
						return SignLink.mainapp;
				if (super.gameFrame != null)
						return super.gameFrame;
				else
						return this;
		}

		private void buildPublicChat(int j)
		{
				int l = 0;
				for (int i1 = 0; i1 < 500; i1++)
				{
						if (chatMessages[i1] == null)
								continue;
						if (chatTypeView != 1)
								continue;
						int j1 = chatTypes[i1];
						String s = chatNames[i1];
						int k1 = (70 - l * 14 + 42) + chatScrollAmount + 4 + 5;
						if (k1 < -23)
								break;
						if (s != null && s.startsWith("@cr1@"))
								s = s.substring(5);
						if (s != null && s.startsWith("@cr2@"))
								s = s.substring(5);
						if (s != null && s.startsWith("@cr3@"))
								s = s.substring(5);
						if (s != null && s.startsWith("@don@"))
								s = s.substring(5);

						s = s.replace("<col=0>", "<col=ffffff>");
						if ((j1 == 1 || j1 == 2) && (j1 == 1 || publicChatMode == 0 || publicChatMode == 1 && isFriendOrSelf(s)))
						{
								if (j > k1 - 14 && j <= k1 && !s.equals(myPlayer.getName()))
								{
										menuActionName[menuActionRow] = "Add ignore @whi@" + s;
										menuActionID[menuActionRow] = 42;
										menuActionRow++;
										menuActionName[menuActionRow] = "Add friend @whi@" + s;
										menuActionID[menuActionRow] = 337;
										menuActionRow++;
								}
								l++;
						}
				}
		}

		private void buildDuelorTrade(int j)
		{
				int l = 0;
				for (int i1 = 0; i1 < 500; i1++)
				{
						if (chatMessages[i1] == null)
								continue;
						if (chatTypeView != 3 && chatTypeView != 4)
								continue;
						int j1 = chatTypes[i1];
						String s = chatNames[i1];
						int k1 = (70 - l * 14 + 42) + chatScrollAmount + 4 + 5;
						if (k1 < -23)
								break;
						if (s != null && s.startsWith("@cr1@"))
								s = s.substring(5);
						if (s != null && s.startsWith("@cr2@"))
								s = s.substring(5);
						if (s != null && s.startsWith("@cr3@"))
								s = s.substring(5);
						if (s != null && s.startsWith("@don@"))
								s = s.substring(5);
						if (chatTypeView == 3 && j1 == 4 && (tradeMode == 0 || tradeMode == 1 && isFriendOrSelf(s)))
						{
								if (j > k1 - 14 && j <= k1)
								{
										menuActionName[menuActionRow] = "Accept trade @whi@" + s;
										menuActionID[menuActionRow] = 484;
										menuActionRow++;
								}
								l++;
						}
						if (chatTypeView == 4 && j1 == 8 && (tradeMode == 0 || tradeMode == 1 && isFriendOrSelf(s)))
						{
								if (j > k1 - 14 && j <= k1)
								{
										menuActionName[menuActionRow] = "Accept challenge @whi@" + s;
										menuActionID[menuActionRow] = 6;
										menuActionRow++;
								}
								l++;
						}
						if (j1 == 12)
						{
								if (j > k1 - 14 && j <= k1)
								{
										menuActionName[menuActionRow] = "Go-to @blu@" + s;
										menuActionID[menuActionRow] = 915;
										menuActionRow++;
								}
								l++;
						}
				}
		}

		private void buildChatAreaMenu(int y)
		{
				int l = 0;
				for (int i1 = 0; i1 < 500; i1++)
				{
						if (chatMessages[i1] == null)
								continue;
						int j1 = chatTypes[i1];
						// Cannot change to 56 or it will be all bugged.
						int otherY = (70 - l * 14 + 42) + chatScrollAmount + 4 + 5;
						if (otherY < -23)
								break;
						String s = chatNames[i1];
						if (chatTypeView == 1)
						{
								buildPublicChat(y);
								break;
						}
						if (chatTypeView == 2)
						{
								FriendSystem.buildFriendChat(y, this);
								break;
						}
						if (chatTypeView == 3 || chatTypeView == 4)
						{
								buildDuelorTrade(y);
								break;
						}
						if (chatTypeView == 5)
						{
								break;
						}
						if (s != null && s.startsWith("@cr1@"))
						{
								s = s.substring(5);
						}
						if (s != null && s.startsWith("@cr2@"))
						{
								s = s.substring(5);
						}
						if (s != null && s.startsWith("@cr3@"))
						{
								s = s.substring(5);
						}
						if (s != null && s.startsWith("@don@"))
						{
								s = s.substring(5);
						}
						s = s.replace("<col=0>", "<col=ebebeb>");
						if (j1 == 0)
						{
								l++;
						}
						if ((j1 == 1 || j1 == 2) && (j1 == 1 || publicChatMode == 0 || publicChatMode == 1 && isFriendOrSelf(s)))
						{
								if (y > otherY - 14 && y <= otherY && !s.equals(myPlayer.getName()))
								{
										String modified;
										modified = s.replaceAll("1e44ff", "5873fa");
										modified = s.replaceAll("c70000", "ca2f2f");
										modified = s.replaceAll("477847", "619261");
										menuActionName[menuActionRow] = "Add ignore @whi@" + modified;
										menuActionID[menuActionRow] = 42;
										menuActionRow++;
										menuActionName[menuActionRow] = "Add friend @whi@" + modified;
										menuActionID[menuActionRow] = 337;
										menuActionRow++;
								}
								l++;
						}
						if ((j1 == 3 || j1 == 7) && splitPrivateChat == 0 && (j1 == 7 || privateChatMode == 0 || privateChatMode == 1 && isFriendOrSelf(s)))
						{
								if (y > otherY - 14 && y <= otherY)
								{
										menuActionName[menuActionRow] = "Add ignore @whi@" + s;
										menuActionID[menuActionRow] = 42;
										menuActionRow++;
										menuActionName[menuActionRow] = "Add friend @whi@" + s;
										menuActionID[menuActionRow] = 337;
										menuActionRow++;
								}
								l++;
						}
						if (j1 == 4 && (tradeMode == 0 || tradeMode == 1 && isFriendOrSelf(s)))
						{
								if (y > otherY - 14 && y <= otherY)
								{
										menuActionName[menuActionRow] = "Accept trade @whi@" + s;
										menuActionID[menuActionRow] = 484;
										menuActionRow++;
								}
								l++;
						}
						if ((j1 == 5 || j1 == 6) && splitPrivateChat == 0 && privateChatMode < 2)
						{
								l++;
						}
						if (j1 == 8 && (tradeMode == 0 || tradeMode == 1 && isFriendOrSelf(s)))
						{
								if (y > otherY - 14 && y <= otherY)
								{
										menuActionName[menuActionRow] = "Accept challenge @whi@" + s;
										menuActionID[menuActionRow] = 6;
										menuActionRow++;
								}
								l++;
						}
				}
		}

		private void drawFriendsListOrWelcomeScreen(RSInterface class9)
		{
				int j = class9.actionType;
				if (j >= 1 && j <= 100 || j >= 701 && j <= 800)
				{
						if (j == 1 && friendserverState == 0)
						{
								class9.message = "Loading friend list";
								class9.atActionType = 0;
								return;
						}
						if (j == 1 && friendserverState == 1)
						{
								class9.message = "Connecting to friendserver";
								class9.atActionType = 0;
								return;
						}
						if (j == 2 && friendserverState != 2)
						{
								class9.message = "Please wait...";
								class9.atActionType = 0;
								return;
						}
						int k = friendsCount;
						if (friendserverState != 2)
						{
								k = 0;
						}
						if (j > 700)
						{
								j -= 601;
						}
						else
						{
								j--;
						}
						if (j >= k)
						{
								class9.message = "";
								class9.atActionType = 0;
								return;
						}
						else
						{
								class9.message = friendsList[j];
								class9.atActionType = 1;
								return;
						}
				}
				if (j == 901)
				{
						class9.message = friendsCount + " / 200";
						return;
				}
				if (j == 902)
				{
						class9.message = ignoreCount + " / 100";
						return;
				}
				if (j >= 101 && j <= 200 || j >= 801 && j <= 900)
				{
						int l = friendsCount;
						if (friendserverState != 2)
						{
								l = 0;
						}
						if (j > 800)
						{
								j -= 701;
						}
						else
						{
								j -= 101;
						}
						if (j >= l)
						{
								class9.message = "";
								class9.atActionType = 0;
								return;
						}
						if (friendsNodeIds[j] == 0)
						{
								class9.message = "@red@Offline";
						}
						else if (friendsNodeIds[j] == nodeID)
						{
								class9.message = "@gre@Online" /* + (friendsNodeIDs[j] - 9) */
								;
						}
						else
						{
								class9.message = "@red@Offline" /* + (friendsNodeIDs[j] - 9) */
								;
						}
						class9.atActionType = 1;
						return;
				}
				if (j == 203)
				{
						int i1 = friendsCount;
						if (friendserverState != 2)
						{
								i1 = 0;
						}
						class9.scrollMax = i1 * 15 + 20;
						if (class9.scrollMax <= class9.height)
						{
								class9.scrollMax = class9.height + 1;
						}
						return;
				}
				if (j >= 401 && j <= 500)
				{
						if ((j -= 401) == 0 && friendserverState == 0)
						{
								class9.message = "Loading ignore list";
								class9.atActionType = 0;
								return;
						}
						if (j == 1 && friendserverState == 0)
						{
								class9.message = "Please wait...";
								class9.atActionType = 0;
								return;
						}
						int j1 = ignoreCount;
						if (friendserverState == 0)
						{
								j1 = 0;
						}
						if (j >= j1)
						{
								class9.message = "";
								class9.atActionType = 0;
								return;
						}
						else
						{
								class9.message = TextClass.fixName(TextClass.nameForLong(ignoreListAsLongs[j]));
								class9.atActionType = 1;
								return;
						}
				}
				if (j == 503)
				{
						class9.scrollMax = ignoreCount * 15 + 20;
						if (class9.scrollMax <= class9.height)
						{
								class9.scrollMax = class9.height + 1;
						}
						return;
				}
				if (j == 327)
				{
						class9.modelRotationY = 150;
						class9.modelRotationX = (int) (Math.sin((double) loopCycle / 40D) * 256D) & 0x7ff;
						if (updateCharacterCreation)
						{
								for (int k1 = 0; k1 < 7; k1++)
								{
										int l1 = clotheIds[k1];
										if (l1 >= 0 && !IdentityKit.cache[l1].modelIsValid())
										{
												return;
										}
								}

								updateCharacterCreation = false;
								Model aclass30_sub2_sub4_sub6s[] = new Model[7];
								int i2 = 0;
								for (int j2 = 0; j2 < 7; j2++)
								{
										int k2 = clotheIds[j2];
										if (k2 >= 0)
										{
												aclass30_sub2_sub4_sub6s[i2++] = IdentityKit.cache[k2].getModel();
										}
								}

								Model model = new Model(i2, aclass30_sub2_sub4_sub6s);
								for (int l2 = 0; l2 < 5; l2++)
								{
										if (selectedIdentityKitColor[l2] != 0)
										{
												model.setColour(ClientConstants.CLOTHES_COLOUR[l2][0], ClientConstants.CLOTHES_COLOUR[l2][selectedIdentityKitColor[l2]]);
												if (l2 == 1)
												{
														model.setColour(ClientConstants.anIntArray1204[0], ClientConstants.anIntArray1204[selectedIdentityKitColor[l2]]);
												}
										}
								}
								model.method469();
								final Animation animation = Animation.get(myPlayer.standAnimation);
								model.method470(animation.primary[0]);
								model.method479(64, 850, -30, -50, -30, true);
								class9.modelTypeDisabled = 5;
								class9.mediaID = 0;
								RSInterface.method208(aBoolean994, model);
						}
						return;
				}

				// Equipment interface.
				if (j == 328)
				{
						RSInterface rsInterface = class9;
						rsInterface.modelZoom = 550;
						rsInterface.modelRotationY = 75;

						// Completionist cape interface.
						if (getInterfaceDisplayed() == 22060)
						{
								rsInterface.modelRotationX = 1023;
						}

						else if (getInterfaceDisplayed() == 24280 || getInterfaceDisplayed() == 15106)
						{
								if (rsInterface.modelRotationX >= 2040)
								{
										rsInterface.modelRotationX = 0;
								}
								else if (rsInterface.modelRotationX >= 0)
								{
										rsInterface.modelRotationX += 10;
								}
						}

						Model characterDisplay = myPlayer.getBuiltModel();
						if (characterDisplay == null)
						{
								return;
						}
						for (int l2 = 0; l2 < 5; l2++)
						{
								if (selectedIdentityKitColor[l2] != 0)
								{
										characterDisplay.setColour(ClientConstants.CLOTHES_COLOUR[l2][0], ClientConstants.CLOTHES_COLOUR[l2][selectedIdentityKitColor[l2]]);
										if (l2 == 1)
										{
												characterDisplay.setColour(ClientConstants.anIntArray1204[0], ClientConstants.anIntArray1204[selectedIdentityKitColor[l2]]);
										}
								}
						}
						int staticFrame = myPlayer.standAnimation;
						characterDisplay.method469();
						characterDisplay.method470(Animation.anims[staticFrame].primary[0]);
						rsInterface.modelTypeDisabled = 5;
						rsInterface.mediaID = 0;
						RSInterface.method208(aBoolean994, characterDisplay);
						return;
				}
				if (j == 324)
				{
						if (aClass30_Sub2_Sub1_Sub1_931 == null)
						{
								aClass30_Sub2_Sub1_Sub1_931 = class9.sprite1;
								aClass30_Sub2_Sub1_Sub1_932 = class9.sprite2;
						}
						if (selectedMaleIdentityKit)
						{
								class9.sprite1 = aClass30_Sub2_Sub1_Sub1_932;
								return;
						}
						else
						{
								class9.sprite1 = aClass30_Sub2_Sub1_Sub1_931;
								return;
						}
				}
				if (j == 325)
				{
						if (aClass30_Sub2_Sub1_Sub1_931 == null)
						{
								aClass30_Sub2_Sub1_Sub1_931 = class9.sprite1;
								aClass30_Sub2_Sub1_Sub1_932 = class9.sprite2;
						}
						if (selectedMaleIdentityKit)
						{
								class9.sprite1 = aClass30_Sub2_Sub1_Sub1_931;
								return;
						}
						else
						{
								class9.sprite1 = aClass30_Sub2_Sub1_Sub1_932;
								return;
						}
				}
				if (j == 613)
				{
						class9.message = "";
				}
		}

		public void pushMessage(String text, int chatType, String chatName)
		{
				if (chatType == 0 && dialogId != -1)
				{
						notifyMessage = text;
						super.setClickMode3(0);
				}
				if (backDialogID == -1)
				{
						setInputTaken(true);
				}
				for (int j = 499; j > 0; j--)
				{
						chatTypes[j] = chatTypes[j - 1];
						chatNames[j] = chatNames[j - 1];
						chatMessages[j] = chatMessages[j - 1];
						chatRights[j] = chatRights[j - 1];
				}
				chatTypes[0] = chatType;
				chatNames[0] = chatName;
				chatMessages[0] = text;
				chatRights[0] = rights;
		}

		public int tabHPos;

		static String addressMac;

		static String addressUid;

		static int clientIdVersion;

		static int lastSoundPosition;

		public static long lastSoundTime;

		private void resetImageProducers2()
		{
				if (chatBackImage != null)
				{
						return;
				}
				nullLoader();
				super.fullGameScreen = null;
				aRSImageProducer_1107 = null;
				aRSImageProducer_1109 = null;
				chatBackImage = constructGraphicsBuffer(516, 168, getGameComponent());
				mapBackImage = constructGraphicsBuffer(249, 168, getGameComponent());
				DrawingArea.setAllPixelsToZero();
				if (is474GameFrame)
				{
						cacheSprite[82].drawSprite(0, 0);
				}
				else if (is498GameFrame)
				{
						cacheSprite[83].drawSprite(0, 0);
				}
				else
				{
						cacheSprite[84].drawSprite(0, 0);
				}
				inventoryBackImage = constructGraphicsBuffer(250, 337, getGameComponent()); // Changed to 336 from 335 to fix white line at bottom of inventory tab after switching to fullscreen and back.
				inGameScreen = constructGraphicsBuffer(getGameScreenWidth(), getGameScreenHeight(), getGameComponent());
				DrawingArea.setAllPixelsToZero();
				welcomeScreenRaised = true;
		}

		public String getDocumentBaseHost()
		{
				if (SignLink.mainapp != null)
				{
						return SignLink.mainapp.getDocumentBase().getHost().toLowerCase();
				}
				if (super.gameFrame != null)
				{
						return "";
				}
				else
				{
						return "";
				}
		}

		public void uLinkNodes()
		{
				EntityDefinition.mruNodes.unlinkAll();
				ItemDefinition.mruNodes2.unlinkAll();
				ItemDefinition.mruNodes1.unlinkAll();
				Player.mruNodes.unlinkAll();
		}

		public void processRightClick()
		{
				if (activeInterfaceType != 0)
				{
						return;
				}
				menuActionName[0] = "Cancel";
				menuActionID[0] = 1107;
				menuActionRow = 1;
				if (fullscreenInterfaceID != -1 && isFixedScreen())
				{
						frameFocusedInterface = 0;
						anInt1315 = 0;
						buildInterfaceMenu(8, RSInterface.interfaceCache[fullscreenInterfaceID], super.mouseX, 8, super.mouseY, 0);
						if (frameFocusedInterface != focusedViewportWidget)
						{
								focusedViewportWidget = frameFocusedInterface;
						}
						if (anInt1315 != anInt1129)
						{
								anInt1129 = anInt1315;
						}
						return;
				}
				ChatArea.buildSplitPrivateChatMenu();
				frameFocusedInterface = 0;
				anInt1315 = 0;
				if (super.mouseX >= 515 && super.mouseX <= getClientWidth() && super.mouseY >= 0 && super.mouseY <= 167 && isFixedScreen())
				{
						if (getInterfaceDisplayed() != -1)
						{
								buildInterfaceMenu(0, RSInterface.interfaceCache[getInterfaceDisplayed()], super.mouseX, 0, super.mouseY, 0);
						}
				}
				if (frameFocusedInterface != focusedViewportWidget)
				{
						focusedViewportWidget = frameFocusedInterface;
				}
				frameFocusedInterface = 0;
				anInt1315 = 0;
				if (super.mouseX > 0 && super.mouseX < (isFixedScreen() ? 516 : getClientWidth()) && super.mouseY > 0 && super.mouseY < (isFixedScreen() ? 338 : getClientHeight()))
				{
						boolean skip = false;
						if (!Client.isFixedScreen())
						{
								skip = isNotTileClickingArea();
						}
						if (walkableInterfaceId == 20240)
						{
								int offset = !Client.isFixedScreen() ? 4 : 0;
								if (super.mouseX >= 228 + (Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 267) && super.mouseX <= 293 + (Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 267) && super.mouseY >= 13 - offset && super.mouseY <= 27)
								{
										skip = true;
								}
						}
						if (!skip)
						{
								skip = Achievements.clickAchievementPopUp(false); // Sets the skip check if i clicked on acheivement interface.
								Achievements.clickAchievementPopUp(true); // This does the actual closing of the interface.
						}
						if (!skip)
						{
								if (getInterfaceDisplayed() != -1)
								{
										boolean ignore = false;
										if (RSInterface.interfaceCache[getInterfaceDisplayed()].interfaceEndX != 0)
										{
												if (super.mouseX >= RSInterface.interfaceCache[getInterfaceDisplayed()].interfaceStartX + (!Client.isFixedScreen() ? (Client.getClientWidth() / 2) - 260 : 0) && super.mouseX <= RSInterface.interfaceCache[getInterfaceDisplayed()].interfaceEndX + (!Client.isFixedScreen() ? (Client.getClientWidth() / 2) - 260 : 0) && super.mouseY >= RSInterface.interfaceCache[getInterfaceDisplayed()].interfaceStartY + (!Client.isFixedScreen() ? (Client.getClientHeight() / 2) - 271 : 0) && super.mouseY <= RSInterface.interfaceCache[getInterfaceDisplayed()].interfaceEndY + (!Client.isFixedScreen() ? (Client.getClientHeight() / 2) - 271 : 0))
												{
												}
												else
												{
														ignore = true;
												}
										}
										if (!ignore)
										{
												//TODO #FULLSCREEN ADJUST interfaces hovering/actions on 3d screen
												int x1 = isFixedScreen() ? 4 : (Client.getClientWidth() / 2) - 256;
												int y1 = isFixedScreen() ? 4 : (Client.getClientHeight() / 2) - 267;
												buildInterfaceMenu(x1, RSInterface.interfaceCache[getInterfaceDisplayed()], super.mouseX, y1, super.mouseY, 0);
										}
										else
										{
												build3dScreenMenu();
										}
								}
								else
								{
										build3dScreenMenu();
								}
						}
				}
				if (frameFocusedInterface != focusedViewportWidget)
				{
						focusedViewportWidget = frameFocusedInterface;
				}
				if (anInt1315 != anInt1129)
				{
						anInt1129 = anInt1315;
				}
				frameFocusedInterface = 0;
				anInt1315 = 0;

				int x = super.mouseX;

				int y = super.mouseY;
				if (!Client.isFixedScreen())

				{
						x = super.mouseX - (Client.getClientWidth() - 761);
						y = super.mouseY - (Client.getClientHeight() - 550);
						if (Client.getInventoryLayout("DOUBLE STACK"))
						{
								y += 38;
						}
						else if (Client.getInventoryLayout("OLD"))
						{
								x += 20;
								y -= 3;
						}

						if (Client.is562GameFrame || Client.is562PlusGameFrame)
						{
								y -= 2;
						}
				}
				// TODO #FULLSCREEN ADJUST inventory tab hovering and actions of interfaces.
				if (x > 548 && y > 207 && x < 760 && y < 468)
				{
						boolean show = true;
						if (hideInventoryInterfaceAction && !Client.isFixedScreen())
						{
								show = false;
						}
						if (show)
						{
								if (getInvOverlayInterfaceID() != -1)
								{
										buildInterfaceMenu(548, RSInterface.interfaceCache[getInvOverlayInterfaceID()], x, 207, y, 0);
								}
								else if (tabInterfaceId[getTabId()] != -1)
								{
										buildInterfaceMenu(548, RSInterface.interfaceCache[tabInterfaceId[getTabId()]], x, 207, y, 0);
								}
						}
				}
				if (frameFocusedInterface != focusedSidebarWidget)

				{
						setTabAreaAltered(true);
						focusedSidebarWidget = frameFocusedInterface;
				}
				if (anInt1315 != anInt1044)

				{
						setTabAreaAltered(true);
						anInt1044 = anInt1315;
				}
				frameFocusedInterface = 0;
				anInt1315 = 0;

				//TODO #FULLSCREEN ADJUST chatbox right clicking/hovering/actions.
				int mouseY = Client.isFixedScreen() ? super.mouseY : super.mouseY - (Client.getClientHeight() - 542);
				if (super.mouseX > 0 && mouseY > 338 && super.mouseX < 490 && mouseY < 463)

				{
						if (backDialogID != -1)
						{
								buildInterfaceMenu(20, RSInterface.interfaceCache[backDialogID], super.mouseX, 358, mouseY, 0);
						}
						else if (mouseY < 463 && super.mouseX < 490)
						{
								buildChatAreaMenu(mouseY - 338);
						}
				}
				if (backDialogID != -1 && frameFocusedInterface != focusedChatWidget)

				{
						setInputTaken(true);
						focusedChatWidget = frameFocusedInterface;
				}
				if (backDialogID != -1 && anInt1315 != anInt1500)

				{
						setInputTaken(true);
						anInt1500 = anInt1315;
				}
				ChatArea.chatAreaTextOld(this);
				ChatArea.chatAreaTextNew(this);
				if (experienceOrb)

				{
						Orbs.experienceOrbButtonAndHover();
				}
				MiniMap.processMinimapActions(this);
				InventoryTab.determineTopTabs(this);
				InventoryTab.determineBottomTabs(this);

				boolean flag = false;
				while (!flag)

				{
						flag = true;
						for (int j = 0; j < menuActionRow - 1; j++)
						{
								if (menuActionID[j] < 1000 && menuActionID[j + 1] > 1000)
								{
										String s = menuActionName[j];
										menuActionName[j] = menuActionName[j + 1];
										menuActionName[j + 1] = s;
										int k = menuActionID[j];
										menuActionID[j] = menuActionID[j + 1];
										menuActionID[j + 1] = k;
										k = menuActionCmd2[j];
										menuActionCmd2[j] = menuActionCmd2[j + 1];
										menuActionCmd2[j + 1] = k;
										k = menuActionCmd3[j];
										menuActionCmd3[j] = menuActionCmd3[j + 1];
										menuActionCmd3[j + 1] = k;
										k = menuActionCmd1[j];
										menuActionCmd1[j] = menuActionCmd1[j + 1];
										menuActionCmd1[j + 1] = k;
										flag = false;
								}
						}
				}
		}

		public boolean isNotTileClickingArea()
		{

				// TODO #FULLSCREEN ADJUST tile clicking, prevent from clicking on minimap and this is also used for mouse scrolling zooming.
				// Minimap area.
				int x = super.mouseX - (Client.getClientWidth() - 787);
				int y = super.mouseY;
				if (Client.is474GameFrame)
				{
						// Minimap
						if (x >= 602 && x <= 769 && y >= 0 && y <= 165)
						{
								return true;
						}
				}
				else
				{
						if (x >= 599 && x <= 769 && y >= 0 && y <= 169)
						{
								return true;
						}
				}
				// Inventory area.
				x = super.mouseX - (Client.getClientWidth() - 787);
				y = super.mouseY - (Client.getClientHeight() - 543);

				if (Client.getInventoryLayout("DOUBLE STACK"))
				{
						// Tabs.
						if (x >= 526 && y >= 429 && x <= Client.getClientWidth() && y <= Client.getClientHeight())
						{
								return true;
						}

						// Inventory opened interface.
						else if (x >= 567 && y >= 155 && x <= Client.getClientWidth() && y <= Client.getClientHeight())
						{
								if (!Client.hideInventoryInterfaceAction && !Client.isFixedScreen())
								{
										return true;
								}
						}
				}
				else if (Client.getInventoryLayout("LANDSCAPE"))
				{
						// Tabs.
						if (x >= 526 && y >= 429 && x <= Client.getClientWidth() && y <= Client.getClientHeight())
						{
								return true;
						}

						// Inventory opened interface.
						else if (x >= 567 && y >= 192 && x <= Client.getClientWidth() && y <= Client.getClientHeight())
						{
								if (!Client.hideInventoryInterfaceAction && !Client.isFixedScreen())
								{
										return true;
								}
						}

				}
				else
				{
						// The whole inventory tab area with the tab interface.
						if (x >= 530 && y >= 168 && x <= Client.getClientWidth() && y <= Client.getClientHeight())
						{
								return true;
						}
				}

				// Chatbox area.
				if (super.mouseX >= 0 && super.mouseX <= 519 && super.mouseY <= Client.getClientHeight() && mouseY >= Client.getClientHeight() - 205)
				{
						return true;
				}
				return false;
		}

		void login(String s, String s1, boolean flag)
		{
				SignLink.errorname = s;
				try
				{
						if (rememberMe)
						{
								savedUsername = myUsername;
								savedPassword = myPassword;
								Settings.saveSettings();
						}

						if (myUsername.length() == 0)
						{
								setLoginMessage1("Please enter a username");
								return;
						}
						else if (myPassword.length() == 0)
						{
								setLoginMessage1("Please enter a password");
								return;
						}
						if (!flag)
						{
								setLoginMessage1("Connecting...");
						}
						socketStream = new RSSocket(this, openSocket(43594 + portOff));
						long l = TextClass.longForName(s);
						int i = (int) (l >> 16 & 31L);
						stream.currentOffset = 0;
						stream.writeWordBigEndian(14);
						stream.writeWordBigEndian(i);
						socketStream.queueBytes(2, stream.buffer);
						for (int j = 0; j < 8; j++)
						{
								socketStream.read();
						}

						int k = socketStream.read();
						int i1 = k;
						if (k == 0)
						{
								socketStream.flushInputStream(inStream.buffer, 8);
								inStream.currentOffset = 0;
								serverSeed = inStream.readQWord();
								int ai[] = new int[4];
								ai[0] = (int) (Math.random() * 99999999D);
								ai[1] = (int) (Math.random() * 99999999D);
								ai[2] = (int) (serverSeed >> 32);
								ai[3] = (int) serverSeed;
								stream.currentOffset = 0;
								try
								{

										stream.writeWordBigEndian(10);
										stream.writeDWord(ai[0]);
										stream.writeDWord(ai[1]);
										stream.writeDWord(ai[2]);
										stream.writeDWord(ai[3]);
										stream.writeDWord(clientIdVersion);
										stream.writeString(addressMac);
										stream.writeString(addressUid);
								}
								catch (Exception e)
								{
										e.printStackTrace();
								}
								stream.writeString(s);
								stream.writeString(s1);
								stream.doKeys();
								aStream_847.currentOffset = 0;
								if (flag)
								{
										aStream_847.writeWordBigEndian(18);
								}
								else
								{
										aStream_847.writeWordBigEndian(16);
								}
								aStream_847.writeWordBigEndian(stream.currentOffset + 36 + 1 + 1 + 2);
								aStream_847.writeWordBigEndian(255);
								aStream_847.writeWord(317);
								aStream_847.writeWordBigEndian(lowMem ? 1 : 0);
								for (int l1 = 0; l1 < 9; l1++)
								{
										aStream_847.writeDWord(expectedCRCs[l1]);
								}

								aStream_847.writeBytes(stream.buffer, stream.currentOffset, 0);
								stream.encryption = new ISAACRandomGen(ai);
								for (int j2 = 0; j2 < 4; j2++)
								{
										ai[j2] += 50;
								}

								encryption = new ISAACRandomGen(ai);
								socketStream.queueBytes(aStream_847.currentOffset, aStream_847.buffer);
								k = socketStream.read();
						}
						if (k == 1)
						{
								try
								{
										Thread.sleep(2000L);
								}
								catch (Exception _ex)
								{
								}
								login(s, s1, flag);
								return;
						}
						if (k == 2)
						{
								myPrivilege = socketStream.read();
								socketStream.read(); // Must leave here, it was used by the mouse movement tracker by Jagex.
								lastClickTime = 0L;
								super.awtFocus = true;
								isFocused = true;
								setLoggedIn(true);
								stream.currentOffset = 0;
								inStream.currentOffset = 0;
								packetType = -1;
								ptype0 = -1;
								ptype1 = -1;
								ptype2 = -1;
								pktSize = 0;
								netIdleCycles = 0;
								systemUpdateCycle = 0;
								logoutCycle = 0;
								markType = 0;
								menuActionRow = 0;
								menuOpen = false;
								super.idleTime = 0;
								for (int j1 = 0; j1 < 500; j1++) // Fix chat box, It will remove old chat messages after you relog.
								{
										chatMessages[j1] = null;
								}
								itemSelected = 0;
								spellSelected = 0;
								setLoadingStage(0);
								currentSound = 0;
								cameraOffsetX = 0;
								cameraOffsetY = 0;
								viewRotationOffset = 0;
								minimapRotation = 0;
								minimapZoom = 0;
								viewRotation = 0;
								minimapState = 0;
								lastPlane = -1;
								destX = 0;
								destY = 0;
								playerCount = 0;
								npcCount = 0;
								for (int i2 = 0; i2 < maxPlayers; i2++)
								{
										playerArray[i2] = null;
										aStreamArray895s[i2] = null;
								}

								for (int k2 = 0; k2 < 16384; k2++)
								{
										npcArray[k2] = null;
								}
								myPlayer = playerArray[myPlayerIndex] = new Player();
								projectiles.removeAll();
								spotanims.removeAll();
								for (int l2 = 0; l2 < 4; l2++)
								{
										for (int i3 = 0; i3 < 104; i3++)
										{
												for (int k3 = 0; k3 < 104; k3++)
												{
														groundArray[l2][i3][k3] = null;
												}

										}

								}

								objects = new NodeList();
								fullscreenInterfaceID = -1;
								friendserverState = 0;
								friendsCount = 0;
								dialogId = -1;
								backDialogID = -1;
								setInterfaceDisplayed(-1);
								setInvOverlayInterfaceID(-1);
								walkableInterfaceId = -1;
								setDialogueOptionsShowing(false);
								setTabId(3, true);
								inputDialogState = 0;
								menuOpen = false;
								setMessagePromptRaised(false);
								notifyMessage = null;
								anInt1055 = 0;
								flashingSidebarTab = -1;
								selectedMaleIdentityKit = true;
								resetCharacterCreation();
								for (int j3 = 0; j3 < 5; j3++)
								{
										selectedIdentityKitColor[j3] = 0;
								}

								for (int l3 = 0; l3 < 5; l3++)
								{
										atPlayerActions[l3] = null;
										atPlayerArray[l3] = false;
								}

								anInt1175 = 0;
								anInt1134 = 0;
								anInt986 = 0;
								anInt1288 = 0;
								anInt924 = 0;
								anInt1188 = 0;
								anInt1155 = 0;
								anInt1226 = 0;
								resetImageProducers2();
								logInUpdate();
								return;
						}
						if (k == 3)
						{
								setLoginMessage1("Invalid username or password.");
								return;
						}
						if (k == 5)
						{
								setLoginMessage1("Your account is logged in, try again in 60 seconds.");
								return;
						}
						if (k == 6)
						{
								return;
						}
						if (k == 7)
						{
								setLoginMessage1("This world is full.");
								return;
						}
						if (k == 8)
						{
								setLoginMessage1("Unable to connect, login server offline.");
								return;
						}
						if (k == 9)
						{
								setLoginMessage1("Login limit exceeded.");
								return;
						}
						if (k == 10)
						{
								setLoginMessage1("Your account has been banned.");
								return;
						}
						if (k == 11)
						{
								setLoginMessage1("Login server rejected session.");
								return;
						}
						if (k == 12)
						{
								setLoginMessage1("You need a members account to login to this world.");
								return;
						}
						if (k == 13)
						{
								setLoginMessage1("Could not complete login.");
								return;
						}
						if (k == 14)
						{
								setLoginMessage1("The server is being updated, please wait 1 minute and try again.");
								return;
						}
						if (k == 15)
						{
								setLoggedIn(true);
								stream.currentOffset = 0;
								inStream.currentOffset = 0;
								packetType = -1;
								ptype0 = -1;
								ptype1 = -1;
								ptype2 = -1;
								pktSize = 0;
								netIdleCycles = 0;
								systemUpdateCycle = 0;
								menuActionRow = 0;
								menuOpen = false;
								aLong824 = System.currentTimeMillis();
								return;
						}
						if (k == 16)
						{
								setLoginMessage1("Login attempts exceeded, please wait 1 minute and try again.");
								return;
						}
						if (k == 17)
						{
								setLoginMessage1("You are standing in a members-only area.");
								return;
						}
						if (k == 20)
						{
								setLoginMessage1("Invalid loginserver requested");
								return;
						}
						if (k == 24)
						{
								setLoginMessage1("Outdated client, please reload the client.");
								return;
						}
						if (k == 21)
						{
								for (int k1 = socketStream.read(); k1 >= 0; k1--)
								{
										setLoginMessage1("You have only just left another world");
										Content.drawLoginScreen();
										try
										{
												Thread.sleep(1000L);
										}
										catch (Exception _ex)
										{
										}
								}
								login(s, s1, flag);
								return;
						}
						if (k == -1)
						{
								if (i1 == 0)
								{
										try
										{
												Thread.sleep(2000L);
										}
										catch (Exception _ex)
										{
										}
										login(s, s1, flag);
										return;
								}
								else
								{
										setLoginMessage1("Error connecting.");
										return;
								}
						}
						else
						{
								setLoginMessage1("Unexpected server response");
								return;
						}
				}
				catch (IOException _ex)
				{
						setLoginMessage1("");
				}
				setLoginMessage1("Failed to connect.");
		}

		protected boolean doWalkTo(int i, int j, int k, int i1, int j1, int k1, int l1, int i2, int j2, boolean flag, int k2)
		{
				byte byte0 = 104;
				byte byte1 = 104;
				for (int l2 = 0; l2 < byte0; l2++)
				{
						for (int i3 = 0; i3 < byte1; i3++)
						{
								pathWaypoint[l2][i3] = 0;
								pathDistance[l2][i3] = 0x5f5e0ff;
						}
				}
				int j3 = j2;
				int k3 = j1;
				try
				{
						pathWaypoint[j2][j1] = 99;
						pathDistance[j2][j1] = 0;
				}
				catch (Exception e)
				{
						return false;
				}
				int l3 = 0;
				int i4 = 0;
				bigX[l3] = j2;
				bigY[l3++] = j1;
				boolean flag1 = false;
				int j4 = bigX.length;
				int ai[][] = collisionMap[plane].flags;
				while (i4 != l3)
				{
						j3 = bigX[i4];
						k3 = bigY[i4];
						i4 = (i4 + 1) % j4;
						if (j3 == k2 && k3 == i2)
						{
								flag1 = true;
								break;
						}
						if (i1 != 0)
						{
								if ((i1 < 5 || i1 == 10) && collisionMap[plane].atWall(k2, j3, k3, j, i1 - 1, i2))
								{
										flag1 = true;
										break;
								}
								if (i1 < 10 && collisionMap[plane].atDecoration(k2, i2, k3, i1 - 1, j, j3))
								{
										flag1 = true;
										break;
								}
						}
						if (k1 != 0 && k != 0 && collisionMap[plane].atObject(i2, k2, j3, k, l1, k1, k3))
						{
								flag1 = true;
								break;
						}
						int l4 = pathDistance[j3][k3] + 1;
						if (j3 > 0 && pathWaypoint[j3 - 1][k3] == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0)
						{
								bigX[l3] = j3 - 1;
								bigY[l3] = k3;
								l3 = (l3 + 1) % j4;
								pathWaypoint[j3 - 1][k3] = 2;
								pathDistance[j3 - 1][k3] = l4;
						}
						if (j3 < byte0 - 1 && pathWaypoint[j3 + 1][k3] == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0)
						{
								bigX[l3] = j3 + 1;
								bigY[l3] = k3;
								l3 = (l3 + 1) % j4;
								pathWaypoint[j3 + 1][k3] = 8;
								pathDistance[j3 + 1][k3] = l4;
						}
						if (k3 > 0 && pathWaypoint[j3][k3 - 1] == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0)
						{
								bigX[l3] = j3;
								bigY[l3] = k3 - 1;
								l3 = (l3 + 1) % j4;
								pathWaypoint[j3][k3 - 1] = 1;
								pathDistance[j3][k3 - 1] = l4;
						}
						if (k3 < byte1 - 1 && pathWaypoint[j3][k3 + 1] == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0)
						{
								bigX[l3] = j3;
								bigY[l3] = k3 + 1;
								l3 = (l3 + 1) % j4;
								pathWaypoint[j3][k3 + 1] = 4;
								pathDistance[j3][k3 + 1] = l4;
						}
						if (j3 > 0 && k3 > 0 && pathWaypoint[j3 - 1][k3 - 1] == 0 && (ai[j3 - 1][k3 - 1] & 0x128010e) == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0)
						{
								bigX[l3] = j3 - 1;
								bigY[l3] = k3 - 1;
								l3 = (l3 + 1) % j4;
								pathWaypoint[j3 - 1][k3 - 1] = 3;
								pathDistance[j3 - 1][k3 - 1] = l4;
						}
						if (j3 < byte0 - 1 && k3 > 0 && pathWaypoint[j3 + 1][k3 - 1] == 0 && (ai[j3 + 1][k3 - 1] & 0x1280183) == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0 && (ai[j3][k3 - 1] & 0x1280102) == 0)
						{
								bigX[l3] = j3 + 1;
								bigY[l3] = k3 - 1;
								l3 = (l3 + 1) % j4;
								pathWaypoint[j3 + 1][k3 - 1] = 9;
								pathDistance[j3 + 1][k3 - 1] = l4;
						}
						if (j3 > 0 && k3 < byte1 - 1 && pathWaypoint[j3 - 1][k3 + 1] == 0 && (ai[j3 - 1][k3 + 1] & 0x1280138) == 0 && (ai[j3 - 1][k3] & 0x1280108) == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0)
						{
								bigX[l3] = j3 - 1;
								bigY[l3] = k3 + 1;
								l3 = (l3 + 1) % j4;
								pathWaypoint[j3 - 1][k3 + 1] = 6;
								pathDistance[j3 - 1][k3 + 1] = l4;
						}
						if (j3 < byte0 - 1 && k3 < byte1 - 1 && pathWaypoint[j3 + 1][k3 + 1] == 0 && (ai[j3 + 1][k3 + 1] & 0x12801e0) == 0 && (ai[j3 + 1][k3] & 0x1280180) == 0 && (ai[j3][k3 + 1] & 0x1280120) == 0)
						{
								bigX[l3] = j3 + 1;
								bigY[l3] = k3 + 1;
								l3 = (l3 + 1) % j4;
								pathWaypoint[j3 + 1][k3 + 1] = 12;
								pathDistance[j3 + 1][k3 + 1] = l4;
						}
				}
				anInt1264 = 0;
				if (!flag1)
				{
						if (flag)
						{
								int i5 = 100;
								for (int k5 = 1; k5 < 2; k5++)
								{
										for (int i6 = k2 - k5; i6 <= k2 + k5; i6++)
										{
												for (int l6 = i2 - k5; l6 <= i2 + k5; l6++)
														if (i6 >= 0 && l6 >= 0 && i6 < 104 && l6 < 104 && pathDistance[i6][l6] < i5)
														{
																i5 = pathDistance[i6][l6];
																j3 = i6;
																k3 = l6;
																anInt1264 = 1;
																flag1 = true;
														}

										}

										if (flag1)
												break;
								}

						}
						if (!flag1)
								return false;
				}
				i4 = 0;
				bigX[i4] = j3;
				bigY[i4++] = k3;
				int l5;
				for (int j5 = l5 = pathWaypoint[j3][k3]; j3 != j2 || k3 != j1; j5 = pathWaypoint[j3][k3])
				{
						if (j5 != l5)
						{
								l5 = j5;
								bigX[i4] = j3;
								bigY[i4++] = k3;
						}
						if ((j5 & 2) != 0)
								j3++;
						else if ((j5 & 8) != 0)
								j3--;
						if ((j5 & 1) != 0)
								k3++;
						else if ((j5 & 4) != 0)
								k3--;
				}
				// if(cancelWalk) { return i4 > 0; }
				if (i4 > 0)
				{
						int k4 = i4;
						if (k4 > 25)
						{
								k4 = 25;
						}
						i4--;
						int k6 = bigX[i4];
						int i7 = bigY[i4];
						anInt1288 += k4;
						if (anInt1288 >= 92)
						{
								stream.createFrame(36);
								stream.writeDWord(0);
								anInt1288 = 0;
						}
						if (i == 0)
						{
								stream.createFrame(164);
								stream.writeWordBigEndian(k4 + k4 + 3);
						}
						if (i == 1)
						{
								stream.createFrame(248);
								stream.writeWordBigEndian(k4 + k4 + 3 + 14);
						}
						if (i == 2)
						{
								stream.createFrame(98);
								stream.writeWordBigEndian(k4 + k4 + 3);
						}
						stream.method433(k6 + baseX);
						destX = bigX[0];
						destY = bigY[0];
						for (int j7 = 1; j7 < k4; j7++)
						{
								i4--;
								stream.writeWordBigEndian(bigX[i4] - k6);
								stream.writeWordBigEndian(bigY[i4] - i7);
						}

						stream.method431(i7 + baseY);
						stream.method424(super.keyArray[5] != 1 ? 0 : 1);
						return true;
				}
				return i != 1;
		}


		private void buildAtNPCMenu(EntityDefinition entityDef, int a, int j, int k, int npcArrayIndex)
		{
				if (menuActionRow >= 400)
						return;
				if (entityDef.childrenIDs != null)
						entityDef = entityDef.getOverride();
				if (entityDef == null)
						return;
				if (!entityDef.interactable)
						return;
				String npcName = entityDef.name;
				if (entityDef.combatLevel != 0)
				{
						npcName = npcName + Content.combatDiffColor(myPlayer.combatLevel, entityDef.combatLevel) + " (level: " + entityDef.combatLevel + ")";
				}

				// If pet does not belong to me, then do not show pick up option or anything at all.
				if (entityDef.actions != null)
				{
						for (int l = 4; l >= 0; l--)
						{
								// Is not an attack option.
								if (entityDef.actions[l] != null)
								{
										if (entityDef.actions[l].equalsIgnoreCase("Pick-up"))
										{
												if (npcPetId != npcArrayIndex)
												{
														return;
												}
										}
								}
						}
				}
				if (itemSelected == 1)
				{
						menuActionName[menuActionRow] = "Use " + selectedItemName + " with @yel@" + npcName;
						menuActionID[menuActionRow] = 582;
						menuActionCmd1[menuActionRow] = a;
						menuActionCmd2[menuActionRow] = k;
						menuActionCmd3[menuActionRow] = j;
						menuActionRow++;
						return;
				}
				if (spellSelected == 1)
				{
						if ((spellUsableOn & 2) == 2)
						{
								menuActionName[menuActionRow] = spellTooltip + " @yel@" + npcName;
								menuActionID[menuActionRow] = 413;
								menuActionCmd1[menuActionRow] = a;
								menuActionCmd2[menuActionRow] = k;
								menuActionCmd3[menuActionRow] = j;
								menuActionRow++;
						}
				}
				else
				{
						if (entityDef.actions != null)
						{
								for (int l = 4; l >= 0; l--)
								{
										// Is not an attack option.
										if (entityDef.actions[l] != null && !entityDef.actions[l].equalsIgnoreCase("attack"))
										{
												menuActionName[menuActionRow] = entityDef.actions[l] + " @yel@" + npcName;
												if (l == 0)
														menuActionID[menuActionRow] = 20;
												if (l == 1)
														menuActionID[menuActionRow] = 412;
												if (l == 2)
														menuActionID[menuActionRow] = 225;
												if (l == 3)
														menuActionID[menuActionRow] = 965;
												if (l == 4)
														menuActionID[menuActionRow] = 478;
												menuActionCmd1[menuActionRow] = a;
												menuActionCmd2[menuActionRow] = k;
												menuActionCmd3[menuActionRow] = j;
												menuActionRow++;
										}
								}

						}
						if (entityDef.actions != null)
						{
								for (int i1 = 4; i1 >= 0; i1--)
								{
										if (entityDef.actions[i1] != null && entityDef.actions[i1].equalsIgnoreCase("attack"))
										{
												char c = '\0';
												/*
												if (entityDef.combatLevel > myPlayer.combatLevel)
												{
														//c = '\u07D0';
													//TODO #TIP uncomment to enable right clicking higher level npcs.
												}
												*/
												menuActionName[menuActionRow] = entityDef.actions[i1] + " @yel@" + npcName;
												if (i1 == 0)
														menuActionID[menuActionRow] = 20 + c;
												if (i1 == 1)
														menuActionID[menuActionRow] = 412 + c;
												if (i1 == 2)
														menuActionID[menuActionRow] = 225 + c;
												if (i1 == 3)
														menuActionID[menuActionRow] = 965 + c;
												if (i1 == 4)
														menuActionID[menuActionRow] = 478 + c;
												menuActionCmd1[menuActionRow] = a;
												menuActionCmd2[menuActionRow] = k;
												menuActionCmd3[menuActionRow] = j;
												menuActionRow++;
										}
								}

						}
						if (ClientConfiguration.DEBUG_MODE)
						{
								menuActionName[menuActionRow] = "Examine @yel@" + npcName + ", " + entityDef.type;
						}
						else
						{
								menuActionName[menuActionRow] = "Examine @yel@" + npcName;
						}
						menuActionID[menuActionRow] = 1025;
						menuActionCmd1[menuActionRow] = a;
						menuActionCmd2[menuActionRow] = k;
						menuActionCmd3[menuActionRow] = j;
						menuActionRow++;
				}
		}

		private void buildAtPlayerMenu(int i, int j, Player player, int k)
		{
				if (player == myPlayer)
				{
						return;
				}
				if (menuActionRow >= 400)
				{
						return;
				}
				String s;
				s = "<col=ffff00>" + player.gameModeTitle + (player.gameModeTitle.isEmpty() ? "" : " ") + PlayerTitle.rightClickPlayerString(player) + Content.combatDiffColor(myPlayer.combatLevel, player.combatLevel) + " (level: " + player.combatLevel + ")";
				if (itemSelected == 1)
				{
						menuActionName[menuActionRow] = "Use " + selectedItemName + " with @whi@" + s;
						menuActionID[menuActionRow] = 491;
						menuActionCmd1[menuActionRow] = j;
						menuActionCmd2[menuActionRow] = i;
						menuActionCmd3[menuActionRow] = k;
						menuActionRow++;
				}
				else if (spellSelected == 1)
				{
						if ((spellUsableOn & 8) == 8)
						{
								boolean skip = false;
								if (!skip)
								{
										menuActionName[menuActionRow] = spellTooltip + " @whi@" + s;
										menuActionID[menuActionRow] = 365;
										menuActionCmd1[menuActionRow] = j;
										menuActionCmd2[menuActionRow] = i;
										menuActionCmd3[menuActionRow] = k;
										menuActionRow++;
								}
						}
				}
				else
				{
						for (int l = 4; l >= 0; l--)
						{
								if (atPlayerActions[l] != null)
								{
										menuActionName[menuActionRow] = atPlayerActions[l] + " @whi@" + s;
										char c = '\0';
										if (atPlayerActions[l].equalsIgnoreCase("attack"))
										{
												/*
													if (player.combatLevel > myPlayer.combatLevel)
													{
															c = '\u07D0';
													}
													*/

												if (myPlayer.team != 0 && player.team != 0)
												{
														if (myPlayer.team == player.team)
														{
																c = '\u07D0';
														}
														else
														{
																c = '\0';
														}
												}
										}
										else if (atPlayerArray[l])
										{
												c = '\u07D0';
										}
										int[] l2 = {561, 779, 27, 577, 729};
										menuActionID[menuActionRow] = l2[l] + c;
										menuActionCmd1[menuActionRow] = j;
										menuActionCmd2[menuActionRow] = i;
										menuActionCmd3[menuActionRow] = k;
										menuActionRow++;
								}
						}

				}
				for (int i1 = 0; i1 < menuActionRow; i1++)
				{
						if (menuActionID[i1] == 516)
						{
								menuActionName[i1] = "Walk here @whi@" + s;
								return;
						}
				}

		}

		private void handleTemporaryObjects(TemporaryObject class30_sub1)
		{
				int i = 0;
				int j = -1;
				int k = 0;
				int l = 0;
				if (class30_sub1.classType == 0)
						i = landScape.getWallUID(class30_sub1.plane, class30_sub1.x, class30_sub1.y);
				if (class30_sub1.classType == 1)
						i = landScape.getWallDecorationUID(class30_sub1.plane, class30_sub1.x, class30_sub1.y);
				if (class30_sub1.classType == 2)
						i = landScape.getObjectUID(class30_sub1.plane, class30_sub1.x, class30_sub1.y);
				if (class30_sub1.classType == 3)
						i = landScape.getGroundDecorationUID(class30_sub1.plane, class30_sub1.x, class30_sub1.y);
				if (i != 0)
				{
						int i1 = landScape.getArrangement(class30_sub1.plane, class30_sub1.x, class30_sub1.y, i);
						j = i >> 14 & 0x7fff;
						k = i1 & 0x1f;
						l = i1 >> 6;
				}
				class30_sub1.locIndex = j;
				class30_sub1.locType = k;
				class30_sub1.locRotation = l;
		}

		/**
		 *
		 * @param circleX
		 *        X coordinate of the circle, the most X of the circle.
		 * @param circleY
		 *        Y coordinate of the circle, the most Y of the circle.
		 * @param clickX
		 *        Current position of the player click/mouse.
		 * @param clickY
		 *        Current position of the player click/mouse.
		 * @param radius
		 *        How big the circle is.
		 * @return True, if the player click/mouse is in the circle.
		 */
		public static boolean inCircle(int circleX, int circleY, int clickX, int clickY, int radius)
		{
				return java.lang.Math.pow((circleX + radius - clickX), 2) + java.lang.Math.pow((circleY + radius - clickY), 2) < java.lang.Math.pow(radius, 2);
		}

		private String interfaceIntToString(int j)
		{
				if (j < 0x3b9ac9ff)
						return String.valueOf(j);
				else
						return "*";
		}

		private void showErrorScreen()
		{
				Graphics g = getGameComponent().getGraphics();
				g.setColor(Color.black);
				g.fillRect(0, 0, getClientWidth(), getClientHeight());
				method4(1);
				if (loadingError)
				{
						updateFlames = false;
						g.setFont(new Font("Helvetica", 1, 16));
						g.setColor(Color.yellow);
						int k = 35;
						g.drawString("Sorry, an error has occured whilst loading ShatterScape", 30, k);
						k += 50;
						g.setColor(Color.white);
						g.drawString("To fix this, try one of the following:", 30, k);
						k += 50;
						g.setColor(Color.white);
						g.setFont(new Font("Helvetica", 1, 12));
						g.drawString("1: Try closing ALL browsers and load ShatterScape again", 30, k);
						k += 30;
						g.drawString("2: Use the Download Client instead", 30, k);
						k += 30;
						g.drawString("3: Restart your computer", 30, k);
						k += 30;
						g.drawString("4. Update your java at www.java.com", 30, k);
						k += 30;
						g.drawString("", 30, k);
				}
				if (genericLoadingError)
				{
						updateFlames = false;
						g.setFont(new Font("Helvetica", 1, 20));
						g.setColor(Color.white);
						g.drawString("Error - unable to load game!", 50, 50);
						g.drawString("To play RuneScape make sure you play from", 50, 100);
						g.drawString("http://www.runescape.com", 50, 150);
				}
				if (rsAlreadyLoaded)
				{
						updateFlames = false;
						g.setColor(Color.yellow);
						int l = 35;
						g.drawString("Error a copy of RuneScape already appears to be loaded", 30, l);
						l += 50;
						g.setColor(Color.white);
						g.drawString("To fix this try the following (in order):", 30, l);
						l += 50;
						g.setColor(Color.white);
						g.setFont(new Font("Helvetica", 1, 12));
						g.drawString("1: Try closing ALL open web-browser windows, and reloading", 30, l);
						l += 30;
						g.drawString("2: Try rebooting your computer, and reloading", 30, l);
						l += 30;
				}
		}

		@SuppressWarnings({"unchecked", "rawtypes"})
		public void openURL(String url)
		{
				String osName = System.getProperty("os.name");
				try
				{
						if (osName.startsWith("Mac OS"))
						{
								Class fileMgr = Class.forName("com.apple.eio.FileManager");
								Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[] {String.class});
								openURL.invoke(null, new Object[] {url});
						}
						else if (osName.startsWith("Windows"))
								Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + url);
						else
						{ //assume Unix or Linux
								String[] browsers = {"firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape", "safari"};
								String browser = null;
								for (int count = 0; count < browsers.length && browser == null; count++)
										if (Runtime.getRuntime().exec(new String[] {"which", browsers[count]}).waitFor() == 0)
												browser = browsers[count];
								if (browser == null)
								{
										throw new Exception("Could not find web browser");
								}
								else
										Runtime.getRuntime().exec(new String[] {browser, url});
						}
				}
				catch (Exception e)
				{
						pushMessage("Failed to open URL.", 0, "");
				}
		}

		public URL getCodeBase()
		{
				try
				{
						return new URL(server + ":" + (80 + portOff));
				}
				catch (Exception _ex)
				{
				}
				return null;
		}

		private void drawGameScreenInterfaces()
		{
				if (fullscreenInterfaceID != -1 && (getLoadingStage() == 2 || super.fullGameScreen != null))
				{
						if (getLoadingStage() == 2)
						{
								handleInterfaceSequences(animCycle, fullscreenInterfaceID);
								if (getInterfaceDisplayed() != -1)
								{
										handleInterfaceSequences(animCycle, getInterfaceDisplayed());
								}
								animCycle = 0;
								resetAllImageProducers();
								super.fullGameScreen.initDrawingArea();
								Rasterizer.offsets = fullScreenTextureArray;
								DrawingArea.setAllPixelsToZero();
								welcomeScreenRaised = true;
								if (getInterfaceDisplayed() != -1)
								{
										RSInterface rsInterface_1 = RSInterface.interfaceCache[getInterfaceDisplayed()];
										if (rsInterface_1.width == getGameScreenWidth() && rsInterface_1.height == getGameScreenHeight() && rsInterface_1.getType() == 0)
										{
												rsInterface_1.width = 765;
												rsInterface_1.height = 502;
										}
										drawInterface(0, 0, rsInterface_1, 8);
								}
								RSInterface rsInterface = RSInterface.interfaceCache[fullscreenInterfaceID];
								if (rsInterface.width == getGameScreenWidth() && rsInterface.height == getGameScreenHeight() && rsInterface.getType() == 0)
								{
										rsInterface.width = 765;
										rsInterface.height = 502;
								}
								drawInterface(0, 0, rsInterface, 8);

								if (!menuOpen)
								{
										processRightClick();
										drawTooltip();
								}
								else
								{
										drawMenu();
								}
						}
						drawCount++;
						super.fullGameScreen.drawGraphics(0, super.graphics, 0);
						return;
				}
				else
				{
						if (drawCount != 0)
						{
								resetImageProducers2();
						}
				}
				if (welcomeScreenRaised)
				{
						welcomeScreenRaised = false;
						if (isFixedScreen())
						{
								topFrame.drawGraphics(0, super.graphics, 0);
								leftFrame.drawGraphics(4, super.graphics, 0);
								rightFrame.drawGraphics(4, super.graphics, 516);
						}
						setInputTaken(true);
						setTabAreaAltered(true);
						if (getLoadingStage() != 2)
						{
								inGameScreen.drawGraphics(isFixedScreen() ? 4 : 0, super.graphics, isFixedScreen() ? 4 : 0);
								if (isFixedScreen())
								{
										mapBackImage.drawGraphics(0, super.graphics, 516);
								}
						}
				}
				if (getInvOverlayInterfaceID() != -1)
				{
						handleInterfaceSequences(animCycle, getInvOverlayInterfaceID());
				}
				if (isFixedScreen())
				{
						InventoryTab.drawTabArea(this);
				}
				if (backDialogID == -1)
				{
						chatInterface.scrollPosition = chatScrollHeight - chatScrollAmount - 110;
						//TODO #FULLSCREEN ADJUST interfaces chat box scrolling via mouse click
						int yPosOffset = Client.isFixedScreen() ? 0 : Client.getClientHeight() - 543;
						if (super.mouseX > 478 && super.mouseX < 580 && super.mouseY > 342 + yPosOffset)
						{
								handleScrollbarMouse(494, 110, super.mouseX - 0, super.mouseY - 348 - yPosOffset, chatInterface, 0, false, chatScrollHeight);
						}

						int i = chatScrollHeight - 110 - chatInterface.scrollPosition;
						if (i < 0)
						{
								i = 0;
						}
						if (i > chatScrollHeight - 110)
						{
								i = chatScrollHeight - 110;
						}
						if (chatScrollAmount != i)
						{
								chatScrollAmount = i;
								setInputTaken(true);
						}
				}
				if (backDialogID != -1)
				{
						boolean flag2 = handleInterfaceSequences(animCycle, backDialogID);
						if (flag2)
						{
								setInputTaken(true);
						}
				}
				if (atInventoryInterfaceType == 3)
				{
						setInputTaken(true);
				}
				if (activeInterfaceType == 3)
				{
						setInputTaken(true);
				}
				if (notifyMessage != null)
				{
						setInputTaken(true);
				}
				if (menuOpen && getMenuScreenArea() == 2)
				{
						setInputTaken(true);
				}
				if (isInputTaken() && isFixedScreen())
				{
						ChatArea.drawChatArea(this);
						setInputTaken(false);
				}
				if (getLoadingStage() == 2)
				{
						drawScene();
						if (isFixedScreen())
						{
								MiniMap.drawMinimap(this);
						}
				}

				if (flashingSidebarTab != -1)
				{
						setTabAreaAltered(true);
				}
				if (isTabAreaAltered())
				{
						if (flashingSidebarTab != -1 && flashingSidebarTab == getTabId())
						{
								flashingSidebarTab = -1;
								stream.createFrame(120);
								stream.writeWordBigEndian(getTabId());
						}
						setTabAreaAltered(false);
						inGameScreen.initDrawingArea();
				}
				animCycle = 0;
		}


		/**
		 * Server Internet protocol address.
		 */
		public static String server = ClientConfiguration.LOCAL_HOST ? "localhost" : "176.31.249.209";

		private void drawSpotAnims()
		{
				SceneSpotAnim class30_sub2_sub4_sub3 = (SceneSpotAnim) spotanims.reverseGetFirst();
				for (; class30_sub2_sub4_sub3 != null; class30_sub2_sub4_sub3 = (SceneSpotAnim) spotanims.reverseGetNext())
						if (class30_sub2_sub4_sub3.plane != plane || class30_sub2_sub4_sub3.isFinished)
								class30_sub2_sub4_sub3.unlink();
						else if (loopCycle >= class30_sub2_sub4_sub3.endCycle)
						{
								class30_sub2_sub4_sub3.update(animCycle);
								if (class30_sub2_sub4_sub3.isFinished)
										class30_sub2_sub4_sub3.unlink();
								else
										landScape.add(class30_sub2_sub4_sub3.plane, 0, class30_sub2_sub4_sub3.z, -1, class30_sub2_sub4_sub3.y, 60, class30_sub2_sub4_sub3.x, class30_sub2_sub4_sub3, false);
						}

		}

		void drawInterface(int scrollPosition, int k, RSInterface class9, int gameAreaType)
		{
				if (class9 == null)
				{
						class9 = RSInterface.interfaceCache[21356];
				}
				if (class9 == null || class9.getType() != 0 || class9.children == null)
				{
						return;
				}
				if (class9.interfaceShown && focusedViewportWidget != class9.id && focusedSidebarWidget != class9.id && focusedChatWidget != class9.id)
				{
						return;
				}
				int i1 = DrawingArea.topX;
				int j1 = DrawingArea.topY;
				int k1 = DrawingArea.getBottomX();
				int l1 = DrawingArea.getBottomY();
				DrawingArea.setDrawingArea(gameAreaType + class9.height, k, k + class9.width, gameAreaType);
				int i2 = class9.children.length;
				for (int j2 = 0; j2 < i2; j2++)
				{
						int xPosition = class9.childX[j2] + k;
						int yPosition = (class9.childY[j2] + gameAreaType) - scrollPosition;
						RSInterface id = RSInterface.interfaceCache[class9.children[j2]];
						xPosition += id.offsetX;
						yPosition += id.offsetY;
						if (id.actionType > 0)
						{
								drawFriendsListOrWelcomeScreen(id);
						}

						// Ancient magicks spellbook and Modern 1151
						if (Client.tabInterfaceId[6] == 1151 || Client.tabInterfaceId[6] == 24836 || Client.tabInterfaceId[6] == 24818 || Client.tabInterfaceId[6] == 24800)
						{
								for (int m5 = 0; m5 < ClientConstants.IDs.length; m5++)
								{
										if (id.id == ClientConstants.IDs[m5] + 1)
										{
												if (m5 > 61)
												{
														Content.drawBlackBox(xPosition + 1, yPosition);
												}
												else
												{
														Content.drawBlackBox(xPosition, yPosition + 1);
												}
										}
								}
						}

						/*// This is not modern or ancients.
						for (int r = 0; r < ClientConstants.runeChildren.length; r++)
						{
								if (id.id == ClientConstants.runeChildren[r])
								{
										id.modelZoom = 775;
								}
						}
						*/
						if (id.getType() == 0)
						{
								int scrollMax = id.scrollMax;
								if (scrollMax > 0)
								{
										//Utility.print(id.parentId);
								}
								if (id.scrollPosition > scrollMax - id.height)
								{
										id.scrollPosition = scrollMax - id.height;
								}
								if (id.scrollPosition < 0)
								{
										id.scrollPosition = 0;
								}
								drawInterface(id.scrollPosition, xPosition, id, yPosition);
								if (scrollMax > id.height)
								{
										drawScrollbar(id.height, id.scrollPosition, yPosition, xPosition + id.width, scrollMax);
								}
						}
						else if (id.getType() == 2)
						{

								int i3 = class9.invStartIndex;
								for (int l3 = 0; l3 < id.height; l3++)
								{
										for (int l4 = 0; l4 < id.width; l4++)
										{

												if (i3 >= id.inv.length)
												{
														continue;
												}
												int x = xPosition + l4 * (32 + id.invSpritePadX);
												int y = yPosition + l3 * (32 + id.invSpritePadY);
												if (i3 < id.spritesX.length)
												{
														x += id.spritesX[i3];
														y += id.spritesY[i3];
												}
												int itemId = id.inv[i3] - 1;
												if (itemId > 0)
												{
														int k6 = 0;
														int j7 = 0;
														if (x > DrawingArea.topX - 32 && x < DrawingArea.getBottomX() && y > DrawingArea.topY - 32 && y < DrawingArea.getBottomY() || activeInterfaceType != 0 && dragFromSlot == i3)
														{
																int l9 = 0;
																if (itemSelected == 1 && anInt1283 == i3 && anInt1284 == id.id)
																{
																		l9 = 0xffffff;
																}
																int amount = id.invStackSizes[i3];
																int spriteAmount = amount;
																// It only is 0 when showing no item amount.
																// Turn to 5 so the sprite stack becomes the maximum one.
																if (spriteAmount == 0)
																{
																		spriteAmount = 5;
																}
																Sprite itemSprite = ItemDefinition.getSprite(itemId, spriteAmount, l9);
																if (itemSprite != null)
																{
																		boolean transparent = false;
																		int transparency = 0;

																		// Rune pouch interface.
																		if (id.parentId == 22921)
																		{
																				if (itemId < 554 || itemId > 566 && itemId != 9075)
																				{
																						transparent = true;
																						transparency = 90;
																				}
																		}
																		if (activeInterfaceType != 0 && dragFromSlot == i3 && focusedDragWidget == id.id)
																		{
																				k6 = super.mouseX - pressX;
																				j7 = super.mouseY - pressY;
																				if (k6 < 5 && k6 > -5)
																				{
																						k6 = 0;
																				}
																				if (j7 < 5 && j7 > -5)
																				{
																						j7 = 0;
																				}
																				if (dragCycle < draggingSensitivity) // increase for more Click sensitivity, this has to be matched with the drag int
																				{
																						k6 = 0;
																						j7 = 0;
																				}
																				if (transparent)
																				{
																						itemSprite.drawTransparentSprite(x + k6, y + j7, transparency);
																				}
																				else
																				{
																						itemSprite.drawSprite1(x + k6, y + j7);
																				}
																				if (y + j7 < DrawingArea.topY && class9.scrollPosition > 0)
																				{
																						int i10 = (animCycle * (DrawingArea.topY - y - j7)) / 3;
																						if (i10 > animCycle * 10)
																						{
																								i10 = animCycle * 10;
																						}

																						// This is to stop the interface from scrolling upwards when i drag an item on the bank
																						// interface to a different tab.
																						if (i10 >= 5)
																						{
																								i10 = 0;
																						}
																						if (i10 > class9.scrollPosition)
																						{
																								i10 = class9.scrollPosition;
																						}
																						class9.scrollPosition -= i10;
																						pressY += i10;
																				}
																				if (y + j7 + 32 > DrawingArea.getBottomY() && class9.scrollPosition < class9.scrollMax - class9.height)
																				{
																						int j10 = (animCycle * ((y + j7 + 32) - DrawingArea.getBottomY())) / 3;
																						if (j10 > animCycle * 10)
																						{
																								j10 = animCycle * 10;
																						}
																						if (j10 > class9.scrollMax - class9.height - class9.scrollPosition)
																						{
																								j10 = class9.scrollMax - class9.height - class9.scrollPosition;
																						}
																						class9.scrollPosition += j10;
																						pressY -= j10;
																				}
																		}
																		else if (atInventoryInterfaceType != 0 && atInventoryIndex == i3 && atInventoryInterface == id.id)
																		{
																				if (transparent)
																				{
																						itemSprite.drawTransparentSprite(x, y, transparency);
																				}
																				else
																				{
																						itemSprite.drawSprite1(x, y);
																				}
																		}
																		else
																		{
																				if (transparent)
																				{
																						itemSprite.drawTransparentSprite(x, y, transparency);
																				}
																				else
																				{
																						itemSprite.drawSprite(x, y);
																				}
																		}
																		if (itemSprite.maxWidth == 33 || id.invStackSizes[i3] != 1)
																		{
																				boolean removeNumberAmount = id.removeStackableNumber;

																				// Infinite/Infinity icon.
																				//cacheSprite[1].drawSprite(x + k6, y + j7);

																				if (amount != 0)
																				{
																						int x1 = x + 2 + k6;
																						int y1 = y + 9 + j7;
																						int x2 = x + k6 + 1;
																						int y2 = y + 8 + j7;
																						if (id.parentId == 3824)
																						{
																								x1 += 6;
																								x2 += 6;
																								y1 -= 7;
																								y2 -= 7;
																								smallText.method385(0, removeNumberAmount ? "" : intToKOrMil(amount, id.parentId), x1, y1);
																								smallText.method385(0xFFFF00, removeNumberAmount ? "" : intToKOrMil(amount, id.parentId), x2, y2);
																						}
																						else
																						{
																								smallText.method385(0, removeNumberAmount ? "" : intToKOrMil(amount, id.parentId), x1, y1);
																								if (amount > 99999 && amount < 10000000)
																								{
																										smallText.method385(0xFFFFFF, removeNumberAmount ? "" : intToKOrMil(amount, id.parentId), x2, y2);
																								}
																								else if (amount > 9999999)
																								{
																										smallText.method385(0x00ff80, removeNumberAmount ? "" : intToKOrMil(amount, id.parentId), x2, y2);
																								}
																								else
																								{
																										smallText.method385(0xFFFF00, removeNumberAmount ? "" : intToKOrMil(amount, id.parentId), x2, y2);
																								}
																						}
																				}
																		}
																}
														}
												}
												else if (id.sprites != null && i3 < 20)
												{
														Sprite class30_sub2_sub1_sub1_1 = id.sprites[i3];
														if (class30_sub2_sub1_sub1_1 != null)
														{
																class30_sub2_sub1_sub1_1.drawSprite(x, y);
														}
												}
												i3++;
										}
								}
						}
						else if (id.getType() == 3)
						{
								boolean flag = false;
								if (focusedChatWidget == id.id || focusedSidebarWidget == id.id || focusedViewportWidget == id.id)
								{
										flag = true;
								}
								int j3;
								if (interfaceIsSelected(id))
								{
										j3 = id.colourEnabled;
										if (flag && id.hoverColorEnabled != 0)
										{
												j3 = id.hoverColorEnabled;
										}
								}
								else
								{
										j3 = id.textColour;
										if (flag && id.hoverColorDisabled != 0)
										{
												j3 = id.hoverColorDisabled;
										}
								}
								if (id.opacity == 0)
								{
										if (id.isFilled)
										{
												DrawingArea.drawPixels(id.height, yPosition, xPosition, j3, id.width);
										}
										else
										{
												DrawingArea.fillPixels(xPosition, id.width, id.height, j3, yPosition);
										}
								}
								else if (id.isFilled)
								{
										DrawingArea.method335(j3, yPosition, id.width, id.height, 256 - (id.opacity & 0xff), xPosition);
								}
								else
								{
										DrawingArea.method338(yPosition, id.height, 256 - (id.opacity & 0xff), j3, id.width, xPosition);
								}
						}
						else if (id.getType() == 4)
						{
								TextDrawingArea textDrawingArea = id.textDrawingAreas;
								String s = id.message;
								Sprite sprite;
								if (id.textIsClicked)
								{
										sprite = id.textSpriteClicked;
										sprite.drawSprite(xPosition - id.textClickedX, yPosition - id.textClickedY, 0xffffff);
								}
								boolean flag1 = false;
								if (focusedChatWidget == id.id || focusedSidebarWidget == id.id || focusedViewportWidget == id.id)
								{
										flag1 = true;
								}
								int i4;
								if (interfaceIsSelected(id))
								{
										i4 = id.colourEnabled;
										if (flag1 && id.hoverColorEnabled != 0)
										{
												i4 = id.hoverColorEnabled;
										}
										if (id.messageEnabled.length() > 0)
										{
												s = id.messageEnabled;
										}
								}
								else
								{
										i4 = id.textColour;
										if (flag1 && id.hoverColorDisabled != 0)
										{
												i4 = id.hoverColorDisabled;
										}
								}
								if (id.atActionType == 6 && isDialogueOptionsShowing())
								{
										s = "Please wait...";
										i4 = id.textColour;
								}
								//TODO #TIP changing the green hover to white when hovering over dialogue text options.
								if (Client.isFixedScreen())
								{
										if (DrawingArea.width == 516)
										{

												// This changes the yellow Click here to continue text to blue.
												if (i4 == 0xffff00)
												{
														i4 = 255;
												}

												// This changes the green to white.
												if (i4 == 49152)
												{
														i4 = 0xffffff;
												}
										}
								}
								else
								{
										//Utility.print(id.parentId);
										// Change all interfaces text except for 3917 which is skilltab on 474 revision.
										// 197 is Old wilderness interface.
										if (id.parentId != 3917 && id.parentId != 197 && id.parentId != 3443 && id.parentId != 3559 && id.parentId != 994 && id.parentId != 2808 && id.parentId != 7424)
										{
												// This changes the yellow Click here to continue text to blue.
												if (i4 == 0xffff00)
												{
														i4 = 255;
												}

												// This changes the green to white.
												if (i4 == 49152)
												{
														i4 = 0xffffff;
												}
										}
								}
								if ((id.parentId == 1151) || (id.parentId == 12855))
								{
										switch (i4)
										{
												case 16773120:
														i4 = 0xFE981F;
														break;
												case 7040819:
														i4 = 0xAF6A1A;
														break;
										}
								}
								for (int l6 = yPosition + textDrawingArea.anInt1497; s.length() > 0; l6 += textDrawingArea.anInt1497)
								{
										if (s.indexOf("%") != -1)
										{
												do
												{
														int k7 = s.indexOf("%1");
														if (k7 == -1)
																break;
														if (id.id < 4000 || id.id > 5000 && id.id != 13921 && id.id != 13922 && id.id != 12171 && id.id != 12172)
																s = s.substring(0, k7) + methodR(extractInterfaceValues(id, 0)) + s.substring(k7 + 2);
														else
																s = s.substring(0, k7) + interfaceIntToString(extractInterfaceValues(id, 0)) + s.substring(k7 + 2);
												}
												while (true);
												do
												{
														int l7 = s.indexOf("%2");
														if (l7 == -1)
																break;
														s = s.substring(0, l7) + interfaceIntToString(extractInterfaceValues(id, 1)) + s.substring(l7 + 2);
												}
												while (true);
												do
												{
														int i8 = s.indexOf("%3");
														if (i8 == -1)
																break;
														s = s.substring(0, i8) + interfaceIntToString(extractInterfaceValues(id, 2)) + s.substring(i8 + 2);
												}
												while (true);
												do
												{
														int j8 = s.indexOf("%4");
														if (j8 == -1)
																break;

														s = s.substring(0, j8) + interfaceIntToString(extractInterfaceValues(id, 3)) + s.substring(j8 + 2);
												}
												while (true);
												do
												{
														int k8 = s.indexOf("%5");
														if (k8 == -1)
																break;
														s = s.substring(0, k8) + interfaceIntToString(extractInterfaceValues(id, 4)) + s.substring(k8 + 2);
												}
												while (true);
										}
										int l8 = s.indexOf("\\n");
										String s1;
										if (l8 != -1)
										{
												s1 = s.substring(0, l8);
												s = s.substring(l8 + 2);
										}
										else
										{
												s1 = s;
												s = "";
										}
										/*
										if (id.parentId == 3917)
										{
										
												if (s1.contains("Next Level At:"))
												{
														s1 = "Next level at:";
												}
												else
												{
														boolean isNumeric = s1.chars().allMatch(Character::isDigit);
														if (isNumeric)
														{
																int number = Integer.parseInt(s1);
																s1 = "" + NumberFormat.getInstance().format(number);
														}
												}
										}
										*/
										if (id.centerText)
										{
												if (s1.contains("<img="))
												{
														s1 = RSFont.replaceOldWithCol(s1);
														newSmallFont.drawBasicString1(s1, xPosition, l6 + (newFontOnLaunch ? -4 : 0), id.textShadow, i4, true);
												}
												else
												{
														if (newFontOnLaunch && (id.textSize == 2 || id.textSize == 1))
														{
																textDrawingArea.method382(i4, xPosition + id.width / 2, s1, l6 - 4, id.textShadow);
														}
														else
														{
																textDrawingArea.method382(i4, xPosition + id.width / 2, s1, l6 - (newFontOnLaunch ? 2 : 0), id.textShadow);
														}
												}

										}
										else
										{
												if (s1.contains("<img="))
												{

														s1 = RSFont.replaceOldWithCol(s1);
														newSmallFont.drawBasicString1(s1, xPosition, l6 + (newFontOnLaunch ? -4 : 0), id.textShadow, i4, false);
												}
												else
												{
														if (newFontOnLaunch && (id.textSize == 2 || id.textSize == 1))
														{
																textDrawingArea.method389(id.textShadow, xPosition, i4, s1, l6 - 4);
														}
														else
														{
																textDrawingArea.method389(id.textShadow, xPosition, i4, s1, l6 - (newFontOnLaunch ? 2 : 0));
														}
												}

										}
								}
						}
						else if (id.getType() == 5)
						{
								Sprite sprite = null;
								if (interfaceIsSelected(id))
								{
										sprite = id.sprite2;
								}
								else
								{

										// Rigour glow
										if (id.id == 22963 && !rigourUnlocked)
										{
												sprite = id.sprite2;
										}
										// Augury glow.
										else if (id.id == 22965 && !auguryUnlocked)
										{
												sprite = id.sprite2;
										}
										else
										{
												sprite = id.sprite1;
										}
								}

								if (id.isClicked)
								{
										sprite = id.spriteClicked;
								}
								else
								{
										if (RSInterface.interfaceCache[id.id - 2] != null)
										{
												if (RSInterface.interfaceCache[id.id - 2].isClicked)
												{
														sprite = RSInterface.interfaceCache[id.id - 2].spriteClicked;
												}
										}
								}
								if (spellSelected == 1 && id.id == spellId && spellId != 0 && sprite != null)
								{
										sprite.drawSprite(xPosition, yPosition, 0xffffff);
								}
								else
								{
										if (sprite != null)
										{
												if (id.drawsTransparent)
												{
														sprite.drawTransparentSprite(xPosition, yPosition, id.transparency);
												}
												else
												{

														if (id.hoverScrollBar)
														{
																if (id.hoverHasText)
																{
																		if (!RSInterface.interfaceCache[id.id + 1].message.isEmpty())
																		{
																				DrawingArea.setDrawingArea(l1, i1, k1, j1);
																				sprite.drawSpriteTEST(xPosition, yPosition);
																		}

																}
																else
																{
																		//if an id is an hover id, this is needed so when the hover image is at the end of the scroll bar height, it will crop it. This fixed the hover images on scrollbar bug.
																		DrawingArea.setDrawingArea(l1, i1, k1, j1);
																		sprite.drawSpriteTEST(xPosition, yPosition);
																}
														}
														else
														{
																sprite.drawSprite(xPosition, yPosition);
														}
												}
										}
								}
								if (Autocast && id.id == autocastId)
								{
										cacheSprite[58].drawSprite(xPosition - 3, yPosition - 3);
								}
						}
						else if (id.getType() == 6)
						{
								int k3 = Rasterizer.centerX;
								int j4 = Rasterizer.centerY;
								Rasterizer.centerX = xPosition + id.width / 2;
								Rasterizer.centerY = yPosition + id.height / 2;
								int value2 = Rasterizer.sin[id.modelRotationY] * id.modelZoom >> 16;
								int value1 = Rasterizer.cos[id.modelRotationY] * id.modelZoom >> 16;
								boolean flag2 = interfaceIsSelected(id);
								int i7;
								if (flag2)
								{
										i7 = id.sequenceEnabled;
								}
								else
								{
										i7 = id.sequenceDisabled;
								}
								Model model;
								if (i7 == -1)
								{
										model = id.method209(-1, -1, flag2);
								}
								else
								{
										Animation animation = Animation.anims[i7];
										model = id.method209(animation.secondary[id.sequenceFrame], animation.primary[id.sequenceFrame], flag2);
								}
								if (model != null)
								{
										model.method482(id.modelRotationX, 0, id.modelRotationY, 0, value2 + id.mediaIdOffset1, value1 + id.mediaIdOffset2);
										// One of it's uses is drawing the item model on the server sided method of
										// sendItemChat1 etc.
								}
								Rasterizer.centerX = k3;
								Rasterizer.centerY = j4;
						}
						else if (id.getType() == 7)
						{
								TextDrawingArea textDrawingArea_1 = id.textDrawingAreas;
								int k4 = 0;
								for (int j5 = 0; j5 < id.height; j5++)
								{
										for (int i6 = 0; i6 < id.width; i6++)
										{
												if (id.inv[k4] > 0)
												{
														ItemDefinition itemDef = ItemDefinition.forId(id.inv[k4] - 1);
														String s2 = itemDef.name;
														if (itemDef.stackable || id.invStackSizes[k4] != 1)
														{
																s2 = s2 + " x" + intToKOrMilLongName(id.invStackSizes[k4]);
														}
														int i9 = xPosition + i6 * (115 + id.invSpritePadX);
														int k9 = yPosition + j5 * (12 + id.invSpritePadY);
														if (id.centerText)
														{
																textDrawingArea_1.method382(id.textColour, i9 + id.width / 2, s2, k9, id.textShadow);
														}
														else
														{
																textDrawingArea_1.method389(id.textShadow, i9, id.textColour, s2, k9);
														}
												}
												k4++;
										}
								}
						}

						// Hover box drawing. Skill tab, emote tab etc...
						else if (id.getType() == 9 && (anInt1500 == id.id || anInt1044 == id.id || anInt1129 == id.id) && menuHoveredTimer == 50 && !menuOpen)
						{
								int boxWidth = 0;
								int boxHeight = 0;
								TextDrawingArea textDrawingArea_2 = aTextDrawingArea_1271;
								// Tooltip message for the emote tab.
								if (class9.parentId == 148)
								{
										id.message = currentTooltip;
								}
								for (String s1 = id.message; s1.length() > 0;)
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
								int xPos = (xPosition + id.width) - 5 - boxWidth;
								int yPos = yPosition + id.height + 5;
								if (id.id == 24363)
								{
										xPos -= 30;
										yPos -= 7;
								}
								if (xPos < xPosition + 5)
								{
										xPos = xPosition + 5;
								}
								if (xPos + boxWidth > k + class9.width)
								{
										xPos = (k + class9.width) - boxWidth;
								}
								if (yPos + boxHeight > gameAreaType + class9.height)
								{
										yPos = (yPosition - boxHeight);
								}
								// This fixes skillhovers for the skills on the right side.
								// Also for emotes on the right side.
								//TODO #FULLSCREEN ADJUST interface hover for skilltab and emote tab
								int xAmount = isFixedScreen() ? 90 : Client.getClientWidth() - 190;
								if (xPos > xAmount)
								{
										xPos = xAmount;
								}
								if (id.hasType9Hover)
								{
										xPos = id.type9HoverXposition;
										yPos = id.type9HoverYposition;

										//TODO #FULLSCREEN ADJUST interface hover for emote tab
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
								}

								// This is for emote tab, so tooltip positions itself with scrollbar.
								if (class9.parentId == 148)
								{
										//TODO #FULLSCREEN ADJUST interface hover for emote tab
										int yAmount = isFixedScreen() ? 265 : Client.getClientHeight() - 110;
										if (!Client.isFixedScreen() && Client.getInventoryLayout("DOUBLE STACK"))
										{
												yAmount -= 38;
										}

										if (!Client.isFixedScreen() && (Client.is562GameFrame || Client.is562PlusGameFrame))
										{
												yAmount += 2;
										}
										yPos -= class9.scrollPosition;
										if (yPos >= yAmount)
										{
												yPos = yAmount;
										}
								}
								DrawingArea.drawPixels(boxHeight, yPos, xPos, 0xFFFFA0, boxWidth);
								DrawingArea.fillPixels(xPos, boxWidth, boxHeight, 0, yPos);
								String s2 = id.message;
								for (int j11 = yPos + textDrawingArea_2.anInt1497 + (Client.newFont ? -2 : 2); s2.length() > 0; j11 += textDrawingArea_2.anInt1497 - (Client.newFont ? 4 : 0))
								{
										int l11 = s2.indexOf("\\n");
										String toolTipString;
										if (l11 != -1)
										{
												toolTipString = s2.substring(0, l11);
												s2 = s2.substring(l11 + 2);
										}
										else
										{
												toolTipString = s2;
												s2 = "";
										}
										if (id.centerText)
										{
												textDrawingArea_2.method382(yPos, xPos + (id.width / 2), toolTipString, j11, false);
										}
										else
										{
												textDrawingArea_2.method389(false, xPos + 3, 0, toolTipString, j11);
										}
								}
						}

						if (id.getType() == 5 && id.toolTipSpecialX > 0)
						{
								timeValue = System.currentTimeMillis();
								toolTipX = id.toolTipSpecialX;
								toolTipY = id.toolTipSpecialY;
								toolTipString = id.message;
						}

						if (System.currentTimeMillis() - timeValue < 50 && (getInterfaceDisplayed() == 25403 || getInterfaceDisplayed() == 25590) && !toolTipString.isEmpty())
						{
								if (!isFixedScreen() || isFixedScreen() && gameAreaType == 0)
								{
										TextDrawingArea textDrawingArea_2 = aTextDrawingArea_1271;
										int x = toolTipX;
										int y = toolTipY;

										//TODO #FULLSCREEN ADJUST interfaces hover on Weapon tracker and profile skilling tab.
										int x1 = isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 256;
										int y1 = isFixedScreen() ? 0 : (Client.getClientHeight() / 2) - 267;
										x += x1;
										y += y1;
										int width = toolTipString.contains("Total Xp:") ? 135 : 105;
										int height = 20;
										if (toolTipString.contains("Used"))
										{
												y += 13;
												width = 70;
										}

										boolean decrease = x < 40 && toolTipString.contains("Xp") ? true : false;

										// Box brown outline for skill icons on Profile skilling interface tab.
										if (!toolTipString.contains("Total Xp") && !toolTipString.contains("Used"))
										{
												DrawingArea.fillPixels(x + 18, 105 - 60, 20 + 10, 0x564f42, y + 21); // Outline.
										}

										if (toolTipString.contains("Used"))
										{
												x += 16;
										}
										// X, width, length, colour, Y
										DrawingArea.fillPixels((x - (17)) + (decrease ? 22 : 0), width + 2, height + 2, 0, y - 1); // Outline.
										// length, y, x, colour, width
										DrawingArea.drawPixels(height, y, (x - (16)) + (decrease ? 22 : 0), 0xFFFFA0, width); // Background.
										if (toolTipString.contains("Used"))
										{
												x -= 16;
										}
										// Colour, x, String, Y, Shadow.
										if (toolTipString.contains("Total Xp:"))
										{
												textDrawingArea_2.method382(0, ((x + 36) + (decrease ? 22 : 0)) + 17, toolTipString.substring(0, 10) + Long.parseLong(toolTipString.substring(10)) + " million", y + 15, false);
										}
										else if (toolTipString.startsWith("Xp:"))
										{
												textDrawingArea_2.method382(0, ((x + 36) + (decrease ? 22 : 0)) + 0, toolTipString.substring(0, 4) + "" + formatNumber(Integer.parseInt(toolTipString.substring(4))), y + 15, false);
										}
										else
										{
												textDrawingArea_2.method382(0, ((x + 36) + (decrease ? 22 : 0)) + 0, toolTipString.substring(0, 4) + ": " + formatNumber(Integer.parseInt(toolTipString.substring(5))), y + 15, false);
										}
								}
						}
				}
				DrawingArea.setDrawingArea(l1, i1, k1, j1);
		}

		private long timeValue;

		private int toolTipX;

		private int toolTipY;

		private String toolTipString = "";

		private void handleCamera()
		{
				try
				{
						int j = myPlayer.x + cameraOffsetX;
						int k = myPlayer.y + cameraOffsetY;
						if (chaseCameraX - j < -500 || chaseCameraX - j > 500 || chaseCameraY - k < -500 || chaseCameraY - k > 500)
						{
								chaseCameraX = j;
								chaseCameraY = k;
						}
						if (chaseCameraX != j)
						{
								chaseCameraX += (j - chaseCameraX) / 16;
						}
						if (chaseCameraY != k)
						{
								chaseCameraY += (k - chaseCameraY) / 16;
						}

						//24, 12 original.

						// Left arrow key.
						if (super.keyArray[1] == 1)
						{
								if (customCameraPosition)
								{
										xCameraPos -= 10;
								}
								else
								{
										cameraYawTranslate += (-Camera.getCameraSpeed("X") - cameraYawTranslate) / 2;
								}
						}

						// Right arrow key.
						else if (super.keyArray[2] == 1)
						{
								if (customCameraPosition)
								{
										xCameraPos += 10;
								}
								else
								{
										cameraYawTranslate += (Camera.getCameraSpeed("X") - cameraYawTranslate) / 2;
								}
						}
						else
						{
								cameraYawTranslate /= 2;
						}

						// Up arrow key.
						if (super.keyArray[3] == 1)
						{
								if (customCameraPosition)
								{
										yCameraPos += 10;
								}
								else
								{
										cameraPitchTranslate += (Camera.getCameraSpeed("Y") - cameraPitchTranslate) / 2;
								}
						}

						// Down arrow key.
						else if (super.keyArray[4] == 1)
						{
								if (customCameraPosition)
								{
										yCameraPos -= 10;
								}
								else
								{
										cameraPitchTranslate += (-Camera.getCameraSpeed("Y") - cameraPitchTranslate) / 2;
								}
						}
						else
						{
								cameraPitchTranslate /= 2;
						}
						viewRotation = viewRotation + cameraYawTranslate / 2 & 0x7ff;
						chaseCameraPitch += cameraPitchTranslate / 2;
						if (chaseCameraPitch < 128)
						{
								chaseCameraPitch = 128;
						}
						if (chaseCameraPitch > 383)
						{
								chaseCameraPitch = 383;
						}
						int l = chaseCameraX >> 7;
						int i1 = chaseCameraY >> 7;
						int j1 = getLand(plane, chaseCameraY, chaseCameraX);
						int k1 = 0;
						if (l > 3 && i1 > 3 && l < 100 && i1 < 100)
						{
								for (int l1 = l - 4; l1 <= l + 4; l1++)
								{
										for (int k2 = i1 - 4; k2 <= i1 + 4; k2++)
										{
												int l2 = plane;
												if (l2 < 3 && (byteGroundArray[1][l1][k2] & 2) == 2)
														l2++;
												int i3 = j1 - intGroundArray[l2][l1][k2];
												if (i3 > k1)
														k1 = i3;
										}

								}

						}
						anInt1005++;
						if (anInt1005 > 1512)
						{
								anInt1005 = 0;
								stream.createFrame(77);
								stream.writeWordBigEndian(0);
								int i2 = stream.currentOffset;
								stream.writeWordBigEndian((int) (Math.random() * 256D));
								stream.writeWordBigEndian(101);
								stream.writeWordBigEndian(233);
								stream.writeWord(45092);
								if ((int) (Math.random() * 2D) == 0)
										stream.writeWord(35784);
								stream.writeWordBigEndian((int) (Math.random() * 256D));
								stream.writeWordBigEndian(64);
								stream.writeWordBigEndian(38);
								stream.writeWord((int) (Math.random() * 65536D));
								stream.writeWord((int) (Math.random() * 65536D));
								stream.writeBytes(stream.currentOffset - i2);
						}
						int j2 = k1 * 192;
						if (j2 > 0x17f00)
								j2 = 0x17f00;
						if (j2 < 32768)
								j2 = 32768;
						if (j2 > minCameraPitch)
						{
								minCameraPitch += (j2 - minCameraPitch) / 24;
								return;
						}
						if (j2 < minCameraPitch)
						{
								minCameraPitch += (j2 - minCameraPitch) / 80;
						}
				}
				catch (Exception _ex)
				{
						SignLink.reporterror("glfc_ex " + myPlayer.x + "," + myPlayer.y + "," + chaseCameraX + "," + chaseCameraY + "," + regionX + "," + regionY + "," + baseX + "," + baseY);
						throw new RuntimeException("eek");
				}
		}

		public void processDrawing()
		{
				if (rsAlreadyLoaded || loadingError || genericLoadingError)
				{
						showErrorScreen();
						return;
				}
				if (!isLoggedIn())
				{
						Content.drawLoginScreen();
				}
				else
				{
						drawGameScreenInterfaces();
				}


				if (Client.clientFrameSaveNeeded && System.currentTimeMillis() - Client.clientFrameSaveNeededTime >= 500)
				{
						if (System.currentTimeMillis() - Client.clientDimenionsSavedTime >= 3000)
						{
								if (!Client.isFixedScreenSaved && !Client.clientMaximized && !Client.isFixedScreen())
								{
										Client.clientWidthSaved = Client.getClientWidth();
										Client.clientHeightSaved = Client.getClientHeight();
								}
								if (Client.isFixedScreen() && Client.maximizable)
								{
										Client.maximizableWidth = Jframe.frame.getWidth();
										Client.maximizableHeight = Jframe.frame.getHeight();
								}
								Settings.saveSettingsJframe();
								Client.clientFrameSaveNeeded = false;
								Client.clientDimenionsSavedTime = System.currentTimeMillis();
						}
				}
				if (Client.clientMaximizedPreviously && !Client.isFixedScreen() && !Client.clientMaximized)
				{
						Client.clientMaximizedPreviously = false;
						Jframe.frame.setLocation((int) Client.clientResizedLocationX, (int) Client.clientResizedLocationY);
				}
				if (clickMode2 == 0)
				{
						clickedX = -1;
						clickedY = -1;
				}
				clickCycle = 0;
		}

		public boolean isFriendOrSelf(String s)
		{
				if (s == null)
						return false;
				for (int i = 0; i < friendsCount; i++)
						if (s.equalsIgnoreCase(friendsList[i]))
								return true;
				return s.equalsIgnoreCase(myPlayer.getName());
		}

		private void draw3dScreen()
		{
				MiniMap.drawSplitPrivateChat();
				int clickPosition = isFixedScreen() ? 12 : 9;
				if (crossType == 1)
				{
						if (newClick)
						{
								cacheSprite[(crossIndex / 100) + 123].drawAdvancedSprite(crossX - clickPosition, crossY - clickPosition);
						}
						else
						{
								crosses[crossIndex / 100].drawSprite(crossX - clickPosition, crossY - clickPosition);
						}
						anInt1142++;
						if (anInt1142 > 67)
						{
								anInt1142 = 0;
								stream.createFrame(78);
						}
				}
				if (crossType == 2)
				{
						if (newClick)
						{
								cacheSprite[(4 + crossIndex / 100) + 123].drawAdvancedSprite(crossX - clickPosition, crossY - clickPosition);
						}
						else
						{

								crosses[4 + crossIndex / 100].drawSprite(crossX - clickPosition, crossY - clickPosition);
						}
				}
				Content.characterRotation();
				/*
				if (isDisconnected() || (System.currentTimeMillis() - timeReceivedPacket > 5000))
				{
						Content.connectionLostAlert();
				}
				*/


				int x1 = 0;
				int y1 = 0;
				//TODO #FULLSCREEN ADJUST interfaces on 3d screen, walkable interfaces.
				if (walkableInterfaceId != -1)
				{
						// Top right interfaces.
						// Wilderness interface & Gwd.
						if (walkableInterfaceId == 24390 || walkableInterfaceId == 25957 || walkableInterfaceId == 20230 || walkableInterfaceId == 20240 && !Client.isFixedScreen())
						{
								x1 = isFixedScreen() ? 0 : Client.getClientWidth() - 780;
								y1 = 0;

								if (walkableInterfaceId == 20240)
								{
										x1 = (Client.getClientWidth() / 2) - 263;
								}
								if (Client.counterOn)
								{
										if (walkableInterfaceId == 24390 && !Client.isFixedScreen())
										{
												y1 += 25;
										}
										else if (walkableInterfaceId == 20230)
										{
												if (!Client.isFixedScreen())
												{
														x1 -= 66;
														if (Client.is474GameFrame)
														{
																y1 -= 1;
																x1 -= 18;
														}
												}
												else
												{
														if (Client.is474GameFrame)
														{
																y1 -= 1;
																x1 -= 120;
														}
												}
										}
								}
						}

						// Bottom right interfaces.
						// Barrows interface & Duel arena & Wilderness interface and Wilderness interface 474 version.
						else if (walkableInterfaceId == 22045 || walkableInterfaceId == 201 || walkableInterfaceId == 24395)
						{
								x1 = isFixedScreen() ? 0 : Client.getClientWidth() - 780;
								y1 = isFixedScreen() ? 0 : Client.getClientHeight() - 539;
						}
						else if (walkableInterfaceId == 197)
						{
								x1 = isFixedScreen() ? 0 : Client.getClientWidth() - 570;
								y1 = isFixedScreen() ? 0 : -85;
						}


						handleInterfaceSequences(animCycle, walkableInterfaceId);
						drawInterface(0, 0 + x1, RSInterface.interfaceCache[walkableInterfaceId], 0 + y1);

						// Wilderness interfaces, draw city timer.
						if (walkableInterfaceId == 24395 || walkableInterfaceId == 24390 || walkableInterfaceId == 197)
						{
								if (cityTimer)
								{
										long timer = System.currentTimeMillis() - Client.timeCityTimerStarted;
										if (timer < 10000)
										{
												int time = (int) (10 - (timer / 1000));
												if (time == 0)
												{
														cityTimer = false;
												}
												else
												{
														sendFrame126("@red@" + time, 24396);
														sendFrame126("@red@" + time, 24391);
														sendFrame126("@red@" + time, 199);
												}
										}
								}
						}
				}

				Achievements.achievementInterface();
				TitleInterface.drawTitleInterfaceLoadingBar();
				CompletionistCapeInterface.drawMainColours();
				CompletionistCapeInterface.drawSubColours();
				Content.zombieReadyInterface();
				Orbs.drawExperienceCounterBar();
				//TODO #FULLSCREEN ADJUST interfaces on 3d screen, normal interfaces.
				if (getInterfaceDisplayed() != -1)
				{

						x1 = isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 256;
						y1 = isFixedScreen() ? 0 : (Client.getClientHeight() / 2) - 267;
						handleInterfaceSequences(animCycle, getInterfaceDisplayed());
						drawInterface(0, 0 + x1, RSInterface.interfaceCache[getInterfaceDisplayed()], 0 + y1);
				}

				//TODO #FULLSCREEN ADJUST interfaces, multi-combat sign.
				if (anInt1055 == 1)
				{
						x1 = isFixedScreen() ? 0 : Client.getClientWidth() - 513;
						y1 = isFixedScreen() ? 0 : -120;
						multiOverlay.drawSprite(464 + x1, 296 + y1);
				}
				handleMessageState();
				CompletionistCapeInterface.drawMainClicked();
				CompletionistCapeInterface.drawSubClicked();
				Content.drawBankClickedButtons();
				Content.sendSearchToServer();
				GameModeInterface.drawStarterInterfaceTick();
				Profile.drawSearch();
				Content.drawShopSearch();
				Profile.drawBiography();
				Settings.drawResizableSettings();
				Achievements.drawAchievementPopUp();
				ArrowTutorial.drawTutorial(true);
				Content.drawVengeanceTimer();

				if (!menuOpen)
				{
						processRightClick();
						drawTooltip();
						saveRightClickCoordinates = true;
				}
				else if (getMenuScreenArea() == 0)
				{
						drawMenu();
				}
				else
				{
						saveRightClickCoordinates = true;
				}
				int yPosOffset = Client.isFixedScreen() ? 0 : Client.getClientHeight() - 540;
				if (fpsOn && !clientData)
				{
						aTextDrawingArea_1271.method385(0xffff00, "Fps: " + super.fps, 5, 324 + yPosOffset);
				}
				int x = baseX + (myPlayer.x - 6 >> 7);
				int y = baseY + (myPlayer.y - 6 >> 7);
				if (clientData)
				{
						if (ClientConfiguration.DEBUG_MODE)
						{
								String[] data = {

										"Fps: " + super.fps,
										"Coordinates: " + x + ", " + y,
										"Tab x: " + (super.mouseX - 549) + ", Tab y: " + (super.mouseY - 208),
										"Client original: 512, 334",
										"Client width: " + getClientWidth(),
										"Client height: " + getClientHeight(),
										"Floor:" + floorData,
										"Object:" + ObjectData,
										"Mouse X: " + super.mouseX + " , Mouse Y: " + super.mouseY,};
								drawScreenData(data);
						}
						else
						{
								String[] data = {

										"Fps: " + super.fps,
										"Coordinates: " + x + ", " + y,};
								drawScreenData(data);
						}
				}
				if (systemUpdateCycle != 0)
				{
						int j = systemUpdateCycle / 50;
						int l = j / 60;
						j %= 60;
						if (j < 10)
						{
								aTextDrawingArea_1271.method385(0xffff00, "System update in: " + l + ":0" + j, 4, 329);
						}
						else
						{
								aTextDrawingArea_1271.method385(0xffff00, "System update in: " + l + ":" + j, 4, 329);
						}
						systemUpdateHeartbeat++;
						if (systemUpdateHeartbeat > 75)
						{
								systemUpdateHeartbeat = 0;
								stream.createFrame(148);
						}
				}
		}

		static long timeShopSearchSent;

		/**
		 * The shop string sent to the server.
		 */
		public static String shopStringSent = "";

		private void drawScreenData(String[] data)
		{

				for (int index = 0; index < data.length; index++)
				{
						aTextDrawingArea_1271.method385(0xffff00, data[index], 5, 440 - (index * 16) + (Client.isFixedScreen() ? -113 : (Client.getClientHeight() - 650)));
				}

		}

		public static String bankSearchSent = "";

		private void handleObjects()
		{
				if (getLoadingStage() == 2)
				{
						for (TemporaryObject class30_sub1 = (TemporaryObject) objects.reverseGetFirst(); class30_sub1 != null; class30_sub1 = (TemporaryObject) objects.reverseGetNext())
						{
								if (class30_sub1.cycle > 0)
								{
										class30_sub1.cycle--;
								}
								if (class30_sub1.cycle == 0)
								{
										if (class30_sub1.locIndex < 0 || ObjectManager.objectIsValid(class30_sub1.locIndex, class30_sub1.locType))
										{
												addObject(class30_sub1.y, class30_sub1.plane, class30_sub1.locRotation, class30_sub1.locType, class30_sub1.x, class30_sub1.classType, class30_sub1.locIndex);
												class30_sub1.unlink();
										}
								}
								else
								{
										if (class30_sub1.spawnCycle > 0)
										{
												class30_sub1.spawnCycle--;
										}
										if (class30_sub1.spawnCycle == 0 && class30_sub1.x >= 1 && class30_sub1.y >= 1 && class30_sub1.x <= 102 && class30_sub1.y <= 102 && (class30_sub1.objectId < 0 || ObjectManager.objectIsValid(class30_sub1.objectId, class30_sub1.type)))
										{
												addObject(class30_sub1.y, class30_sub1.plane, class30_sub1.rotation, class30_sub1.type, class30_sub1.x, class30_sub1.classType, class30_sub1.objectId);
												class30_sub1.spawnCycle = -1;
												if (class30_sub1.objectId == class30_sub1.locIndex && class30_sub1.locIndex == -1)
												{
														class30_sub1.unlink();
												}
												else if (class30_sub1.objectId == class30_sub1.locIndex && class30_sub1.rotation == class30_sub1.locRotation && class30_sub1.type == class30_sub1.locType)
												{
														class30_sub1.unlink();
												}
										}
								}
						}

				}
		}

		private void determineMenuSize()
		{
				int i = chatTextDrawingArea.getTextWidth("Choose Option");
				for (int j = 0; j < menuActionRow; j++)
				{
						int k = chatTextDrawingArea.getTextWidth(menuActionName[j]);
						if (k > i)
						{
								i = k;
						}
				}

				i += 8;
				int l = 15 * menuActionRow + 21;
				if (isFixedScreen())
				{
						if (super.saveClickX > 4 && super.saveClickY > 4 && super.saveClickX < getGameScreenWidth() + 6 && super.saveClickY < getGameScreenHeight() + 4)
						{
								int i1 = super.saveClickX - 4 - i / 2;
								if (i1 + i > getGameScreenWidth())
								{
										i1 = getGameScreenWidth() - i;
								}
								if (i1 < 0)
								{
										i1 = 0;
								}
								int l1 = super.saveClickY - 4;
								if (l1 + l > getGameScreenHeight())
								{
										l1 = getGameScreenHeight() - l;
								}
								if (l1 < 0)
								{
										l1 = 0;
								}
								menuOpen = true;
								setMenuScreenArea(0);
								menuOffsetX = i1;
								menuOffsetY = l1;
								menuWidth = i;
								menuHeight = 15 * menuActionRow + 22;
						}
						if (super.saveClickX > 519 && super.saveClickY > 168 && super.saveClickX < getClientWidth() && super.saveClickY < 502)
						{
								int j1 = super.saveClickX - 519 - i / 2;
								if (j1 < 0)
										j1 = 0;
								else if (j1 + i > 245)
										j1 = 245 - i;
								int i2 = super.saveClickY - 168;
								if (i2 < 0)
										i2 = 0;
								else if (i2 + l > 333)
										i2 = 333 - l;
								menuOpen = true;
								setMenuScreenArea(1);
								menuOffsetX = j1;
								menuOffsetY = i2;
								menuWidth = i;
								menuHeight = 15 * menuActionRow + 22;
						}

						if (super.saveClickX > 0 && super.saveClickY > 338 && super.saveClickX < 516 && super.saveClickY < 502)
						{
								int k1 = super.saveClickX - 0 - i / 2;
								if (k1 < 0)
										k1 = 0;
								else if (k1 + i > 516)
										k1 = 516 - i;
								int j2 = super.saveClickY - 338;
								if (j2 < 0)
										j2 = 0;
								else if (j2 + l > 165)
										j2 = 165 - l;
								menuOpen = true;
								setMenuScreenArea(2);
								menuOffsetX = k1;
								menuOffsetY = j2;
								menuWidth = i;
								menuHeight = 15 * menuActionRow + 22;
						}
						if (super.saveClickX >= 515 && super.saveClickX <= getClientWidth() && super.saveClickY >= 0 && super.saveClickY <= 169)
						{
								int x = super.saveClickX - 515 - i / 2;
								if (x < 0)
								{
										x = 0;
								}
								else if (x + i > 249)
								{
										x = 249 - i;
								}

								int y = super.saveClickY;
								if (y < 0)
								{
										y = 0;
								}
								else if (y + l > 165)
								{
										y = 165 - l;
								}
								menuOpen = true;
								setMenuScreenArea(3);
								menuOffsetX = x;
								menuOffsetY = y;
								menuWidth = i;
								menuHeight = 15 * menuActionRow + 22;
						}
				}
				else
				{
						//TODO #FULLSCREEN ADJUST menu right click size, so it does not no-clip out of screen.
						if (super.saveClickX > 0 && super.saveClickY > 0 && super.saveClickX < Client.getClientWidth() && super.saveClickY < Client.getClientHeight())
						{
								int i1 = super.saveClickX - 0 - i / 2;
								if (i1 + i > Client.getClientWidth() - 16)
								{
										i1 = Client.getClientWidth() - i - 16;
								}
								if (i1 < 0)
								{
										i1 = 0;
								}
								int l1 = super.saveClickY - 0;
								if (l1 + l > Client.getClientHeight() - 41)
								{
										l1 = Client.getClientHeight() - l - 41;
								}
								if (l1 < 0)
								{
										l1 = 0;
								}
								menuOpen = true;
								menuScreenArea = 0;
								menuOffsetX = i1;
								menuOffsetY = l1;
								menuWidth = i;
								menuHeight = 15 * menuActionRow + 22;
						}
				}
		}

		private void nullLoader()
		{
				updateFlames = false;
		}

		private boolean handleInterfaceSequences(int i, int j)
		{
				boolean flag1 = false;
				RSInterface class9 = RSInterface.interfaceCache[j];
				if (class9 == null || class9.children == null)
				{
						return true;
				}
				for (int k = 0; k < class9.children.length; k++)
				{
						if (class9.children[k] == -1)
						{
								break;
						}
						RSInterface class9_1 = RSInterface.interfaceCache[class9.children[k]];
						if (class9_1.getType() == 1)
						{
								flag1 |= handleInterfaceSequences(i, class9_1.id);
						}
						if (class9_1.getType() == 6 && (class9_1.sequenceDisabled != -1 || class9_1.sequenceEnabled != -1))
						{
								boolean flag2 = interfaceIsSelected(class9_1);
								int l;
								if (flag2)
								{
										l = class9_1.sequenceEnabled;
								}
								else
								{
										l = class9_1.sequenceDisabled;
								}
								if (l != -1)
								{
										Animation animation = Animation.anims[l];
										for (class9_1.sequenceCycle += i; class9_1.sequenceCycle > animation.getDuration(class9_1.sequenceFrame);)
										{
												class9_1.sequenceCycle -= animation.getDuration(class9_1.sequenceFrame) + 1;
												class9_1.sequenceFrame++;
												if (class9_1.sequenceFrame >= animation.length)
												{
														class9_1.sequenceFrame -= animation.padding;
														if (class9_1.sequenceFrame < 0 || class9_1.sequenceFrame >= animation.length)
														{
																class9_1.sequenceFrame = 0;
														}
												}
												flag1 = true;
										}

								}
						}
				}

				return flag1;
		}

		private int getTopPlane()
		{
				if (!enableRoof)
				{
						return plane;
				}
				int j = 3;
				if (yCameraCurve < 310)
				{
						int k = xCameraPos >> 7;
						int l = yCameraPos >> 7;
						int i1 = myPlayer.x >> 7;
						int j1 = myPlayer.y >> 7;
						if ((byteGroundArray[plane][k][l] & 4) != 0)
								j = plane;
						int k1;
						if (i1 > k)
								k1 = i1 - k;
						else
								k1 = k - i1;
						int l1;
						if (j1 > l)
								l1 = j1 - l;
						else
								l1 = l - j1;
						if (k1 > l1)
						{
								int i2 = (l1 * 0x10000) / k1;
								int k2 = 32768;
								while (k != i1)
								{
										if (k < i1)
												k++;
										else if (k > i1)
												k--;
										if ((byteGroundArray[plane][k][l] & 4) != 0)
												j = plane;
										k2 += i2;
										if (k2 >= 0x10000)
										{
												k2 -= 0x10000;
												if (l < j1)
														l++;
												else if (l > j1)
														l--;
												if ((byteGroundArray[plane][k][l] & 4) != 0)
														j = plane;
										}
								}
						}
						else
						{
								int j2 = (k1 * 0x10000) / l1;
								int l2 = 32768;
								while (l != j1)
								{
										if (l < j1)
												l++;
										else if (l > j1)
												l--;
										if ((byteGroundArray[plane][k][l] & 4) != 0)
												j = plane;
										l2 += j2;
										if (l2 >= 0x10000)
										{
												l2 -= 0x10000;
												if (k < i1)
														k++;
												else if (k > i1)
														k--;
												if ((byteGroundArray[plane][k][l] & 4) != 0)
														j = plane;
										}
								}
						}
				}
				if ((byteGroundArray[plane][myPlayer.x >> 7][myPlayer.y >> 7] & 4) != 0)
						j = plane;
				return j;
		}

		private int getTopCutscenePlane()
		{
				if (!enableRoof)
				{
						return plane;
				}
				int j = getLand(plane, yCameraPos, xCameraPos);
				if (j - zCameraPos < 800 && (byteGroundArray[plane][xCameraPos >> 7][yCameraPos >> 7] & 4) != 0)
						return plane;
				else
						return 3;
		}

		public void chatJoin(long l)
		{
				try
				{
						if (l == 0L)
								return;

						stream.createFrame(60);
						stream.writeQWord(l);
						return;
				}
				catch (RuntimeException runtimeexception)
				{
						SignLink.reporterror("47229, " + 3 + ", " + l + ", " + runtimeexception.toString());
				}
				throw new RuntimeException();

		}

		public String getParameter(String s)
		{
				if (SignLink.mainapp != null)
						return SignLink.mainapp.getParameter(s);
				else
						return super.getParameter(s);
		}

		private int extractInterfaceValues(RSInterface interfaceData, int value)
		{
				if (interfaceData.valueIndexArray == null || value >= interfaceData.valueIndexArray.length)
						return -2;
				try
				{
						int ai[] = interfaceData.valueIndexArray[value];
						int k = 0;
						int l = 0;
						int i1 = 0;
						do
						{
								int j1 = ai[l++];
								int k1 = 0;
								byte byte0 = 0;
								if (j1 == 0)
								{
										return k;
								}
								if (j1 == 1)
								{
										k1 = baseSkillLevel[ai[l++]];
								}
								if (j1 == 2)
								{
										k1 = maxStats[ai[l++]];
								}
								if (j1 == 3)
								{
										k1 = skillExperience[ai[l++]];
								}
								if (j1 == 4)
								{

										// This is used to make the spellbook spells become lit up when the runes are ready for it.
										RSInterface class9_1 = RSInterface.interfaceCache[ai[l++]];
										int itemRequested = ai[l++];
										if (itemRequested >= 0 && itemRequested < ItemDefinition.total602 && (!ItemDefinition.forId(itemRequested).membersObject || isMembers))
										{
												for (int index = 0; index < class9_1.inv.length; index++)
												{
														if (class9_1.inv[index] == itemRequested + 1)
														{
																k1 += class9_1.invStackSizes[index];
														}
														else if (class9_1.inv[index] == 18820 + 1)
														{
																// Search rune pouch for runes.
																RSInterface class9_2 = RSInterface.interfaceCache[22917];
																for (int i = 0; i < class9_2.inv.length; i++)
																{
																		if (class9_2.inv[i] == itemRequested + 1)
																		{
																				k1 += class9_2.invStackSizes[i];
																		}

																}
														}
												}

										}
								}
								if (j1 == 5)
								{
										k1 = variousSettings[ai[l++]];
								}
								if (j1 == 6)
								{
										int index = ai[l++];
										if (maxStats[index] <= 98)
										{
												k1 = XP_LOOKUP[maxStats[index] - 1] - skillExperience[index];
										}
										else
										{
												k1 = 0;
										}
								}
								if (j1 == 7)
								{
										k1 = (variousSettings[ai[l++]] * 100) / 46875;
								}
								if (j1 == 8)
								{
										k1 = myPlayer.combatLevel;
								}
								if (j1 == 9)
								{
										for (int l1 = 0; l1 < Skills.skillsCount; l1++)
										{
												if (Skills.skillEnabled[l1])
												{
														k1 += maxStats[l1];
												}
										}

								}
								if (j1 == 10)
								{
										RSInterface class9_2 = RSInterface.interfaceCache[ai[l++]];
										int l2 = ai[l++] + 1;
										if (l2 >= 0 && l2 < ItemDefinition.total602 && (!ItemDefinition.forId(l2).membersObject || isMembers))
										{
												for (int k3 = 0; k3 < class9_2.inv.length; k3++)
												{
														if (class9_2.inv[k3] != l2)
																continue;
														k1 = 0x3b9ac9ff;
														break;
												}

										}
								}
								if (j1 == 12)
								{
										k1 = weight;
								}
								if (j1 == 13)
								{
										int i2 = variousSettings[ai[l++]];
										int i3 = ai[l++];
										k1 = (i2 & 1 << i3) == 0 ? 0 : 1;
								}
								if (j1 == 14)
								{
										int j2 = ai[l++];
										VarBit varBit = VarBit.cache[j2];
										int l3 = varBit.setting;
										int i4 = varBit.startbit;
										int j4 = varBit.endbit;
										int k4 = BIT_MASK[j4 - i4];
										k1 = variousSettings[l3] >> i4 & k4;
								}
								if (j1 == 15)
								{
										byte0 = 1;
								}
								if (j1 == 16)
								{
										byte0 = 2;
								}
								if (j1 == 17)
								{
										byte0 = 3;
								}
								if (j1 == 18)
								{
										k1 = (myPlayer.x >> 7) + baseX;
								}
								if (j1 == 19)
								{
										k1 = (myPlayer.y >> 7) + baseY;
								}
								if (j1 == 20)
								{
										k1 = ai[l++];
								}
								if (byte0 == 0)
								{
										if (i1 == 0)
										{
												k += k1;
										}
										if (i1 == 1)
										{
												k -= k1;
										}
										if (i1 == 2 && k1 != 0)
										{
												k /= k1;
										}
										if (i1 == 3)
										{
												k *= k1;
										}
										i1 = 0;
								}
								else
								{
										i1 = byte0;
								}
						}
						while (true);
				}
				catch (Exception _ex)
				{
						return -1;
				}
		}

		private void drawTooltip()
		{
				if (menuActionRow < 2 && itemSelected == 0 && spellSelected == 0)
				{
						autoCastSpellTooltip = false;
						return;
				}
				String s1;
				if (itemSelected == 1 && menuActionRow < 2)
				{
						s1 = "Use " + selectedItemName + " with...";
				}
				else if (spellSelected == 1 && menuActionRow < 2)
				{
						s1 = spellTooltip + "...";
				}
				else
				{
						s1 = menuActionName[menuActionRow - 1];

				}
				if (menuActionRow > 2)
				{
						s1 = s1 + "@whi@ / " + (menuActionRow - 2) + " more options";
				}
				if (s1.contains("Autocast Spell"))
				{
						autoCastSpellTooltip = true;
				}
				else
				{
						autoCastSpellTooltip = false;
				}
				s1 = RSFont.replaceOldWithCol(s1);
				boolean textShadow = true;
				currentTooltip = s1;
				newBoldFont.drawBasicString1(s1, 4, 11, textShadow, 0xffffff, false);
		}

		private static String currentTooltip = "";

		public void npcScreenPos(Entity entity, int i, String npcName)
		{
				calcEntityScreenPos(entity.x, i, entity.y, npcName);
		}

		private void calcEntityScreenPos(int i, int j, int l, String npcName)
		{
				if (i < 128 || l < 128 || i > 13056 || l > 13056)
				{
						spriteDrawX = -1;
						spriteDrawY = -1;
						return;
				}
				int i1 = getLand(plane, l, i) - j;
				i -= xCameraPos;
				i1 -= zCameraPos;
				l -= yCameraPos;
				int j1 = Model.modelIntArray1[yCameraCurve];
				int k1 = Model.modelIntArray2[yCameraCurve];
				int l1 = Model.modelIntArray1[xCameraCurve];
				int i2 = Model.modelIntArray2[xCameraCurve];
				int j2 = l * l1 + i * i2 >> 16;
				l = l * i2 - i * l1 >> 16;
				i = j2;
				j2 = i1 * k1 - l * j1 >> 16;
				l = i1 * j1 + l * k1 >> 16;
				i1 = j2;
				if (l >= 50)
				{
						spriteDrawX = Rasterizer.centerX + (i << viewDistance) / l;
						spriteDrawY = Rasterizer.centerY + (i1 << viewDistance) / l + 4;
				}
				else
				{
						spriteDrawX = -1;
						spriteDrawY = -1;
				}
		}

		private void addTemporaryObject(int j, int objectId, int l, int i1, int y, int type, int l1, int x, int j2)
		{
				TemporaryObject tempObject = null;
				for (TemporaryObject class30_sub1_1 = (TemporaryObject) objects.reverseGetFirst(); class30_sub1_1 != null; class30_sub1_1 = (TemporaryObject) objects.reverseGetNext())
				{
						if (class30_sub1_1.plane != l1 || class30_sub1_1.x != x || class30_sub1_1.y != y || class30_sub1_1.classType != i1)
						{
								continue;
						}
						tempObject = class30_sub1_1;
						break;
				}

				if (tempObject == null)
				{
						tempObject = new TemporaryObject();
						tempObject.plane = l1;
						tempObject.classType = i1;
						tempObject.x = x;
						tempObject.y = y;
						handleTemporaryObjects(tempObject);
						objects.insertHead(tempObject);
				}
				tempObject.objectId = objectId;
				tempObject.type = type;
				tempObject.rotation = l;
				tempObject.spawnCycle = j2;
				tempObject.cycle = j;
		}

		private boolean interfaceIsSelected(RSInterface rsi)
		{
				if (rsi.scriptCompareType == null)
				{
						return false;
				}
				for (int i = 0; i < rsi.scriptCompareType.length; i++)
				{
						int j = extractInterfaceValues(rsi, i);
						int valueRequired = rsi.scriptCompareValue[i];
						if (rsi.scriptCompareType[i] == 2)
						{
								if (j >= valueRequired)
								{
										return false;
								}
						}
						else if (rsi.scriptCompareType[i] == 3)
						{
								if (j <= valueRequired)
								{
										return false;
								}
						}
						else if (rsi.scriptCompareType[i] == 4)
						{
								if (j == valueRequired)
								{
										return false;
								}
						}
						else if (j != valueRequired)
						{
								return false;
						}
				}

				return true;
		}

		private DataInputStream openJagGrabInputStream(String s) throws IOException
		{
				// if(!aBoolean872)
				// if(signlink.mainapp != null)
				// return signlink.openurl(s);
				// else
				// return new DataInputStream((new URL(getCodeBase(), s)).openStream());
				if (jaggrabSocket != null)
				{
						try
						{
								jaggrabSocket.close();
						}
						catch (Exception _ex)
						{
						}
						jaggrabSocket = null;
				}
				jaggrabSocket = openSocket(43594);
				jaggrabSocket.setSoTimeout(10000);
				java.io.InputStream inputstream = jaggrabSocket.getInputStream();
				OutputStream outputstream = jaggrabSocket.getOutputStream();
				outputstream.write(("JAGGRAB /" + s + "\n\n").getBytes());
				return new DataInputStream(inputstream);
		}


		public void raiseWelcomeScreen()
		{
				welcomeScreenRaised = true;
		}

		protected void handleSecondaryPacket(Stream stream, int j)
		{
				//44 = drop an item
				//156 remove an item
				// Ground item packet.
				if (j == 84)
				{
						int k = stream.readUnsignedByte();
						int j3 = anInt1268 + (k >> 4 & 7);
						int i6 = anInt1269 + (k & 7);
						int l8 = stream.readUnsignedWord();
						int k11 = stream.readUnsignedWord();
						int l13 = stream.readUnsignedWord();
						if (j3 >= 0 && i6 >= 0 && j3 < 104 && i6 < 104)
						{
								NodeList class19_1 = groundArray[plane][j3][i6];
								if (class19_1 != null)
								{
										for (Item class30_sub2_sub4_sub2_3 = (Item) class19_1.reverseGetFirst(); class30_sub2_sub4_sub2_3 != null; class30_sub2_sub4_sub2_3 = (Item) class19_1.reverseGetNext())
										{
												if (class30_sub2_sub4_sub2_3.itemId != (l8 & 0x7fff) || class30_sub2_sub4_sub2_3.amount != k11)
														continue;
												class30_sub2_sub4_sub2_3.amount = l13;
												break;
										}

										spawnGroundItem(j3, i6);
								}
						}
						return;
				}
				if (j == 105)
				{
						int l = stream.readUnsignedByte();
						int k3 = anInt1268 + (l >> 4 & 7);
						int j6 = anInt1269 + (l & 7);
						int i9 = stream.readUnsignedWord();
						int l11 = stream.readUnsignedByte();
						int i14 = l11 >> 4 & 0xf;
						int i16 = l11 & 7;
						if (myPlayer.smallX[0] >= k3 - i14 && myPlayer.smallX[0] <= k3 + i14 && myPlayer.smallY[0] >= j6 - i14 && myPlayer.smallY[0] <= j6 + i14 && soundsAreEnabled && !lowMem && currentSound < 50)
						{
								sound[currentSound] = i9;
								soundType[currentSound] = i16;
								soundDelay[currentSound] = WaveSound.delays[i9];
								currentSound++;
						}
				}
				if (j == 215)
				{
						int i1 = stream.method435();
						int l3 = stream.method428();
						int k6 = anInt1268 + (l3 >> 4 & 7);
						int j9 = anInt1269 + (l3 & 7);
						int i12 = stream.method435();
						int j14 = stream.readUnsignedWord();
						if (k6 >= 0 && j9 >= 0 && k6 < 104 && j9 < 104 && i12 != unknownInt10)
						{
								Item class30_sub2_sub4_sub2_2 = new Item();
								class30_sub2_sub4_sub2_2.itemId = i1;
								class30_sub2_sub4_sub2_2.amount = j14;
								if (groundArray[plane][k6][j9] == null)
										groundArray[plane][k6][j9] = new NodeList();
								groundArray[plane][k6][j9].insertHead(class30_sub2_sub4_sub2_2);
								spawnGroundItem(k6, j9);
						}
						return;
				}
				//156 remove an item
				if (j == 156)
				{
						int j1 = stream.method426();
						int i4 = anInt1268 + (j1 >> 4 & 7);
						int l6 = anInt1269 + (j1 & 7);
						int itemId = stream.readUnsignedWord();
						if (i4 >= 0 && l6 >= 0 && i4 < 104 && l6 < 104)
						{
								NodeList class19 = groundArray[plane][i4][l6];
								if (class19 != null)
								{
										for (Item item = (Item) class19.reverseGetFirst(); item != null; item = (Item) class19.reverseGetNext())
										{
												if (item.itemId != (itemId & 0x7fff))
												{
														continue;
												}
												item.unlink();
												break;
										}

										if (class19.reverseGetFirst() == null)
										{
												groundArray[plane][i4][l6] = null;
										}
										spawnGroundItem(i4, l6);
								}
						}
						return;
				}
				if (j == 160)
				{
						int k1 = stream.method428();
						int j4 = anInt1268 + (k1 >> 4 & 7);
						int i7 = anInt1269 + (k1 & 7);
						int l9 = stream.method428();
						int j12 = l9 >> 2;
						int k14 = l9 & 3;
						int j16 = ClientConstants.anIntArray1177[j12];
						int j17 = stream.method435();
						if (j4 >= 0 && i7 >= 0 && j4 < 103 && i7 < 103)
						{
								int j18 = intGroundArray[plane][j4][i7];
								int i19 = intGroundArray[plane][j4 + 1][i7];
								int l19 = intGroundArray[plane][j4 + 1][i7 + 1];
								int k20 = intGroundArray[plane][j4][i7 + 1];
								if (j16 == 0)
								{
										WallLoc class10 = landScape.getWall(plane, j4, i7);
										if (class10 != null)
										{
												int k21 = class10.uid >> 14 & 0x7fff;
												if (j12 == 2)
												{
														class10.root = new SceneObject(k21, 4 + k14, 2, i19, l19, j18, k20, j17, false);
														class10.extension = new SceneObject(k21, k14 + 1 & 3, 2, i19, l19, j18, k20, j17, false);
												}
												else
												{
														class10.root = new SceneObject(k21, k14, j12, i19, l19, j18, k20, j17, false);
												}
										}
								}
								if (j16 == 1)
								{
										WallDecoration class26 = landScape.getWallDecoration(j4, i7, plane);
										if (class26 != null)
												class26.node = new SceneObject(class26.uid >> 14 & 0x7fff, 0, 4, i19, l19, j18, k20, j17, false);
								}
								if (j16 == 2)
								{
										StaticObject class28 = landScape.getObject(j4, i7, plane);
										if (j12 == 11)
												j12 = 10;
										if (class28 != null)
												class28.node = new SceneObject(class28.uid >> 14 & 0x7fff, k14, j12, i19, l19, j18, k20, j17, false);
								}
								if (j16 == 3)
								{
										GroundDecoration class49 = landScape.getGroundDecoration(i7, j4, plane);
										if (class49 != null)
												class49.node = new SceneObject(class49.uid >> 14 & 0x7fff, k14, 22, i19, l19, j18, k20, j17, false);
								}
						}
						return;
				}
				if (j == 147)
				{
						int l1 = stream.method428();
						int k4 = anInt1268 + (l1 >> 4 & 7);
						int j7 = anInt1269 + (l1 & 7);
						int i10 = stream.readUnsignedWord();
						byte byte0 = stream.method430();
						int l14 = stream.method434();
						byte byte1 = stream.method429();
						int k17 = stream.readUnsignedWord();
						int k18 = stream.method428();
						int j19 = k18 >> 2;
						int i20 = k18 & 3;
						int l20 = ClientConstants.anIntArray1177[j19];
						byte byte2 = stream.readSignedByte();
						int l21 = stream.readUnsignedWord();
						byte byte3 = stream.method429();
						Player player;
						if (i10 == unknownInt10)
								player = myPlayer;
						else
								player = playerArray[i10];
						if (player != null)
						{
								ObjectDefinition class46 = ObjectDefinition.forID(l21);
								int i22 = intGroundArray[plane][k4][j7];
								int j22 = intGroundArray[plane][k4 + 1][j7];
								int k22 = intGroundArray[plane][k4 + 1][j7 + 1];
								int l22 = intGroundArray[plane][k4][j7 + 1];
								Model model = class46.getAdjustedModel(j19, i20, i22, j22, k22, l22, -1);
								if (model != null)
								{
										addTemporaryObject(k17 + 1, -1, 0, l20, j7, 0, plane, k4, l14 + 1);
										player.objectStartCycle = l14 + loopCycle;
										player.objectEndCycle = k17 + loopCycle;
										player.aModel_1714 = model;
										int i23 = class46.sizeX;
										int j23 = class46.sizeY;
										if (i20 == 1 || i20 == 3)
										{
												i23 = class46.sizeY;
												j23 = class46.sizeX;
										}
										player.objectX = k4 * 128 + i23 * 64;
										player.objectY = j7 * 128 + j23 * 64;
										player.objectZ = getLand(plane, player.objectY, player.objectX);
										if (byte2 > byte0)
										{
												byte byte4 = byte2;
												byte2 = byte0;
												byte0 = byte4;
										}
										if (byte3 > byte1)
										{
												byte byte5 = byte3;
												byte3 = byte1;
												byte1 = byte5;
										}
										player.objectX0 = k4 + byte2;
										player.objectY0 = k4 + byte0;
										player.objectX1 = j7 + byte3;
										player.objectY1 = j7 + byte1;
								}
						}
				}
				if (j == 151)
				{
						int i2 = stream.method426();
						int l4 = anInt1268 + (i2 >> 4 & 7);
						int k7 = anInt1269 + (i2 & 7);
						int objectId = stream.method434();
						int k12 = stream.method428();
						int type = k12 >> 2;
						int k16 = k12 & 3;
						int l17 = ClientConstants.anIntArray1177[type];
						if (l4 >= 0 && k7 >= 0 && l4 < 104 && k7 < 104)
						{
								addTemporaryObject(-1, objectId, k16, l17, k7, type, plane, l4, 0);
						}
						return;
				}
				if (j == 4)
				{
						int j2 = stream.readUnsignedByte();
						int i5 = anInt1268 + (j2 >> 4 & 7);
						int l7 = anInt1269 + (j2 & 7);
						int k10 = stream.readUnsignedWord();
						int l12 = stream.readUnsignedByte();
						int j15 = stream.readUnsignedWord();
						if (i5 >= 0 && l7 >= 0 && i5 < 104 && l7 < 104)
						{
								i5 = i5 * 128 + 64;
								l7 = l7 * 128 + 64;
								SceneSpotAnim class30_sub2_sub4_sub3 = new SceneSpotAnim(plane, loopCycle, j15, k10, getLand(plane, l7, i5) - l12, l7, i5);
								spotanims.insertHead(class30_sub2_sub4_sub3);
						}
						return;
				}

				//44 = drop an item
				if (j == 44)
				{
						int itemId = stream.method436();
						int amount = stream.readUnsignedWord();
						int i8 = stream.readUnsignedByte();
						int regionX = anInt1268 + (i8 >> 4 & 7);
						int regionY = anInt1269 + (i8 & 7);
						if (regionX >= 0 && regionY >= 0 && regionX < 104 && regionY < 104)
						{
								Item class30_sub2_sub4_sub2_1 = new Item();
								class30_sub2_sub4_sub2_1.itemId = itemId;
								class30_sub2_sub4_sub2_1.amount = amount;
								if (groundArray[plane][regionX][regionY] == null)
										groundArray[plane][regionX][regionY] = new NodeList();
								groundArray[plane][regionX][regionY].insertHead(class30_sub2_sub4_sub2_1);
								spawnGroundItem(regionX, regionY);
						}
						return;
				}
				if (j == 101)
				{
						int l2 = stream.method427();
						int k5 = l2 >> 2;
						int j8 = l2 & 3;
						int i11 = ClientConstants.anIntArray1177[k5];
						int j13 = stream.readUnsignedByte();
						int xConverted = anInt1268 + (j13 >> 4 & 7);
						int yConverted = anInt1269 + (j13 & 7);

						if (xConverted >= 0 && yConverted >= 0 && xConverted < 104 && yConverted < 104)
						{
								//Utility.print(j8 + ", " + i11 + ", " + k5 + ", " + plane);//0, 3, 22, 0
								addTemporaryObject(-1, -1, j8, i11, yConverted, k5, plane, xConverted, 0);
						}
						return;
				}
				if (j == 117)
				{
						int i3 = stream.readUnsignedByte();
						int l5 = anInt1268 + (i3 >> 4 & 7);
						int k8 = anInt1269 + (i3 & 7);
						int j11 = l5 + stream.readSignedByte();
						int k13 = k8 + stream.readSignedByte();
						int l15 = stream.readSignedWord();
						int projectileId = stream.readUnsignedWord();
						int i18 = stream.readUnsignedByte() * 4;
						int l18 = stream.readUnsignedByte() * 4;
						int k19 = stream.readUnsignedWord();
						int j20 = stream.readUnsignedWord();
						int i21 = stream.readUnsignedByte();
						int j21 = stream.readUnsignedByte();
						if (projectileId == 1842 && Client.clientRevision("474"))
						{
								projectileId = 344;
						}
						if (l5 >= 0 && k8 >= 0 && l5 < 104 && k8 < 104 && j11 >= 0 && k13 >= 0 && j11 < 104 && k13 < 104 && projectileId != 65535)
						{
								l5 = l5 * 128 + 64;
								k8 = k8 * 128 + 64;
								j11 = j11 * 128 + 64;
								k13 = k13 * 128 + 64;
								SceneProjectile class30_sub2_sub4_sub4 = new SceneProjectile(i21, l18, k19 + loopCycle, j20 + loopCycle, j21, plane, getLand(plane, k8, l5) - i18, k8, l5, l15, projectileId);
								class30_sub2_sub4_sub4.update(k19 + loopCycle, k13, getLand(plane, k13, j11) - l18, j11);
								projectiles.insertHead(class30_sub2_sub4_sub4);
						}
				}
		}

		private void addObject(int y, int j, int k, int l, int x, int type, int objectId)
		{
				if (x >= 1 && y >= 1 && x <= 102 && y <= 102)
				{
						if (lowMem && j != plane)
						{
								return;
						}
						int i2 = 0;
						if (type == 0)
						{
								i2 = landScape.getWallUID(j, x, y);
						}
						if (type == 1)
						{
								i2 = landScape.getWallDecorationUID(j, x, y);
						}
						if (type == 2)
						{
								i2 = landScape.getObjectUID(j, x, y);
						}
						if (type == 3)
						{
								i2 = landScape.getGroundDecorationUID(j, x, y);
						}
						if (i2 != 0)
						{
								int i3 = landScape.getArrangement(j, x, y, i2);
								int j2 = i2 >> 14 & 0x7fff;
								int k2 = i3 & 0x1f;
								int l2 = i3 >> 6;
								if (type == 0)
								{
										landScape.removeWall(x, j, y, (byte) -119);
										ObjectDefinition class46 = ObjectDefinition.forID(j2);
										if (class46.blocksWalk)
										{
												collisionMap[j].removeWall(l2, k2, class46.blocksProjectiles, x, y);
										}
								}
								if (type == 1)
								{
										landScape.removeWallDecoration(y, j, x);
								}
								if (type == 2)
								{
										landScape.removeObjects(j, x, y);
										ObjectDefinition class46_1 = ObjectDefinition.forID(j2);
										if (x + class46_1.sizeX > 103 || y + class46_1.sizeX > 103 || x + class46_1.sizeY > 103 || y + class46_1.sizeY > 103)
										{
												return;
										}
										if (class46_1.blocksWalk)
										{
												collisionMap[j].removeObject(l2, class46_1.sizeX, x, y, class46_1.sizeY, class46_1.blocksProjectiles);
										}
								}
								if (type == 3)
								{
										landScape.removeGroundDecoration(j, y, x);
										ObjectDefinition class46_2 = ObjectDefinition.forID(j2);
										if (class46_2.blocksWalk && class46_2.hasActions)
										{
												collisionMap[j].method218(y, x);
										}
								}
						}
						if (objectId >= 0)
						{
								int j3 = j;
								if (j3 < 3 && (byteGroundArray[1][x][y] & 2) == 2)
								{
										j3++;
								}
								ObjectManager.addObject(landScape, k, y, l, j3, collisionMap[j], intGroundArray, x, objectId, j);
						}
				}
		}

		public static boolean customCameraPosition;


		private void setCameraPos(int value1, int value2, int value3, int value4, int value5, int value6)
		{
				if (customCameraPosition)
				{
						return;
				}
				int l1 = 2048 - value2 & 0x7ff;
				int i2 = 2048 - value5 & 0x7ff;
				int j2 = 0;
				int k2 = 0;
				int l2 = value1;
				// value3 == x position on the map, value6 is y position
				if (l1 != 0)
				{
						int i3 = Model.modelIntArray1[l1];
						int k3 = Model.modelIntArray2[l1];
						int i4 = k2 * k3 - l2 * i3 >> 16;
						l2 = k2 * i3 + l2 * k3 >> 16;
						k2 = i4;
				}
				if (i2 != 0)
				{
						int j3 = Model.modelIntArray1[i2];
						int l3 = Model.modelIntArray2[i2];
						int j4 = l2 * j3 + j2 * l3 >> 16;
						l2 = l2 * l3 - j2 * j3 >> 16;
						j2 = j4;
				}
				xCameraPos = value3 - j2;
				zCameraPos = value4 - k2;
				yCameraPos = value6 - l2;
				yCameraCurve = value2;
				xCameraCurve = value5;
		}

		public void sendFrame126(String string, int interfaceId)
		{
				if (interfaceId == 4439 && musicVolume == 0)
				{
						string = "No music selected.";
						Client.instance.sendCommandPacket("::nomusicselected");
				}
				if (RSInterface.interfaceCache[interfaceId] == null)
				{
						if (interfaceId == 20246) // Server sends this combat level id update because it cannot detect 525 version, didn't bother to add.
						{
								return;
						}
						Utility.print("Interface frame is null: " + interfaceId + ", string: " + string);
				}
				else
				{
						RSInterface.interfaceCache[interfaceId].message = string;
				}
		}

		public void changeColour(int id, int colour)
		{
				int i19 = colour >> 10 & 0x1f;
				int i22 = colour >> 5 & 0x1f;
				int l24 = colour & 0x1f;
				RSInterface.interfaceCache[id].textColour = (i19 << 19) + (i22 << 11) + (l24 << 3);
		}

		public void sendPacket185(int button, int toggle, int type)
		{
				switch (type)
				{
						case 135:
								RSInterface class9 = RSInterface.interfaceCache[button];
								boolean flag8 = true;
								if (class9.actionType > 0)
										flag8 = promptUserForInput(class9);
								if (flag8)
								{
										stream.createFrame(185);
										stream.writeWord(button);
								}
								break;
						case 646:
								stream.createFrame(185);
								stream.writeWord(button);
								RSInterface class9_2 = RSInterface.interfaceCache[button];
								if (class9_2.valueIndexArray != null && class9_2.valueIndexArray[0][0] == 5)
								{
										if (variousSettings[toggle] != class9_2.scriptCompareValue[0])
										{
												variousSettings[toggle] = class9_2.scriptCompareValue[0];
												handleVarp(toggle);
										}
								}
								break;
						case 169:
								stream.createFrame(185);
								stream.writeWord(button);
								RSInterface class9_3 = RSInterface.interfaceCache[button];
								if (class9_3.valueIndexArray != null && class9_3.valueIndexArray[0][0] == 5)
								{
										variousSettings[toggle] = 1 - variousSettings[toggle];
										handleVarp(toggle);
								}
								break;
				}
		}

		public void sendFrame36(int id, int state)
		{
				anIntArray1045[id] = state;
				if (variousSettings[id] != state)
				{
						variousSettings[id] = state;
						handleVarp(id);
						if (dialogId != -1)
						{
								setInputTaken(true);
						}
				}
		}

		public void sendFrame219()
		{
				if (getInvOverlayInterfaceID() != -1)
				{
						setInvOverlayInterfaceID(-1);
						setTabAreaAltered(true);
				}
				if (backDialogID != -1)
				{
						backDialogID = -1;
						setInputTaken(true);
				}
				if (inputDialogState != 0)
				{
						inputDialogState = 0;
						setInputTaken(true);
				}
				setInterfaceDisplayed(-1);
				setDialogueOptionsShowing(false);
		}

		public void sendFrame248(int interfaceID, int sideInterfaceID)
		{
				if (backDialogID != -1)
				{
						backDialogID = -1;
						setInputTaken(true);
				}
				if (inputDialogState != 0)
				{
						inputDialogState = 0;
						setInputTaken(true);
				}
				setInterfaceDisplayed(interfaceID);
				setInvOverlayInterfaceID(sideInterfaceID);
				setTabAreaAltered(true);
				setDialogueOptionsShowing(false);
		}


		protected static long timeReceivedPacket;

		public void setSidebarInterface(int sidebarID, int interfaceID)
		{
				tabInterfaceId[sidebarID] = interfaceID;
				setTabId(sidebarID, true);
				setTabAreaAltered(true);
		}

		private void drawScene()
		{
				sceneCycle++;
				drawPlayers(true);
				drawPlayers(false);
				drawNPCs(true);
				drawNPCs(false);
				drawProjectiles();
				drawSpotAnims();
				if (!inCutsceneMode)
				{
						int i = chaseCameraPitch;
						if (minCameraPitch / 256 > i)
						{
								i = minCameraPitch / 256;
						}
						if (cameraEffectEnabled[4] && anIntArray1203[4] + 128 > i)
						{
								i = anIntArray1203[4] + 128;
						}
						int k = viewRotation + viewRotationOffset & 0x7ff;
						int cameraZoom = CameraPos2;
						int yOffset = 0;
						// Adjust the camera height, without this, if i zoom in, then move camera down to as near as possible to the ground level, it will make character not in center y axis.
						if (Client.isFixedScreen())
						{
								yOffset = 383 - chaseCameraPitch;
								yOffset /= 5;
						}
						setCameraPos(cameraZoom + i * CameraPos1, i, chaseCameraX, getLand(plane, myPlayer.y, myPlayer.x) - (50 + yOffset), k, chaseCameraY);
						// myPlayer.turnDirection = 1092 - k & 0x7ff; // enable this, so
						// when the player uses arrow keys, the character faces that
						// direction
				}
				int j;
				if (!inCutsceneMode)
				{
						j = getTopPlane();
				}
				else
				{
						j = getTopCutscenePlane();
				}
				int l = xCameraPos;
				int i1 = zCameraPos;
				int j1 = yCameraPos;
				int k1 = yCameraCurve;
				int l1 = xCameraCurve;
				for (int i2 = 0; i2 < 5; i2++)
				{
						if (cameraEffectEnabled[i2])
						{
								int j2 = (int) ((Math.random() * (double) (anIntArray873[i2] * 2 + 1) - (double) anIntArray873[i2]) + Math.sin((double) cameraEffectCycles[i2] * ((double) anIntArray928[i2] / 100D)) * (double) anIntArray1203[i2]);
								if (i2 == 0)
										xCameraPos += j2;
								if (i2 == 1)
										zCameraPos += j2;
								if (i2 == 2)
										yCameraPos += j2;
								if (i2 == 3)
										xCameraCurve = xCameraCurve + j2 & 0x7ff;
								if (i2 == 4)
								{
										yCameraCurve += j2;
										if (yCameraCurve < 128)
												yCameraCurve = 128;
										if (yCameraCurve > 383)
												yCameraCurve = 383;
								}
						}
				}
				int k2 = Rasterizer.cycle;
				Model.aBoolean1684 = true;
				Model.anInt1687 = 0;
				Model.anInt1685 = super.mouseX - 4;
				Model.anInt1686 = super.mouseY - 4;
				DrawingArea.setAllPixelsToZero();
				DrawingArea.drawPixels(getClientHeight(), 0, 0, FogHandler.fogColour, getClientWidth()); // Gfx fix for fog.
				landScape.draw(xCameraPos, yCameraPos, xCameraCurve, zCameraPos, j, yCameraCurve);
				landScape.clearObj5Cache();
				FogHandler.renderFog(Client.instance.inGameScreen.pixels, Client.instance.inGameScreen.depthBuffer);
//				if (ClientConfiguration.DEBUG_MODE)
//				{
//						aTextDrawingArea_1271.method389(true, 15, 0xFFFFFF, "X: " + this.mouseX + "", 60);
//						aTextDrawingArea_1271.method389(true, 15, 0xFFFFFF, "Y: " + this.mouseY + "", 80);
//				}
				UpdateEntity.updateEntities();
				drawHeadIcon();
				InventoryTab.drawTabArea(this);
				if (!isFixedScreen())
				{
						MiniMap.drawMinimap(this);
						ChatArea.drawChatArea(this);
				}
				updateTextures(k2);
				draw3dScreen();
				if (isDisconnected() && ENABLE_RECONNECTING)
				{
						newRegularFont.drawBasicString1(17 - ((System.currentTimeMillis() - timeDisconnected) / 1000) + "", contextMenu.equals("NEW") ? 187 : 101, contextMenu.equals("NEW") ? 30 : 17, false, contextMenu.equals("NEW") ? 0xc8c8c8 : 0xffffff, false);
				}
				inGameScreen.drawGraphics(isFixedScreen() ? 4 : 0, super.graphics, isFixedScreen() ? 4 : 0);
				xCameraPos = l;
				zCameraPos = i1;
				yCameraPos = j1;
				yCameraCurve = k1;
				xCameraCurve = l1;

				if (Client.RESIZABLE_WIDTH != Jframe.frame.getWidth() || Client.RESIZABLE_HEIGHT != Jframe.frame.getHeight())
				{
						if (!Client.isFixedScreen())
						{
								Client.RESIZABLE_WIDTH = Jframe.frame.getWidth();
								Client.RESIZABLE_HEIGHT = Jframe.frame.getHeight();
								int newWidth = Client.RESIZABLE_WIDTH;
								int newHeight = Client.RESIZABLE_HEIGHT;
								if (Jframe.frame.getWidth() % 4 == 0)
								{
										// even
								}
								else
								{
										newWidth++;
								}
								if (Jframe.frame.getHeight() % 4 == 0)
								{
										// even
								}
								else
								{
										newHeight++;
								}
								Jframe.frame.setSize(newWidth, newHeight);
								setBounds();
						}
				}
		}

		public void clearTopInterfaces()
		{
				stream.createFrame(130);
				if (getInvOverlayInterfaceID() != -1)
				{
						setInvOverlayInterfaceID(-1);
						setDialogueOptionsShowing(false);
						setTabAreaAltered(true);
				}
				if (backDialogID != -1)
				{
						backDialogID = -1;
						setInputTaken(true);
						setDialogueOptionsShowing(false);
				}
				inputValue = -1;
				setInterfaceDisplayed(-1);
				fullscreenInterfaceID = -1;
		}

		public Client()
		{
				try
				{
						Music.midiPlayer = new MidiPlayer();
				}
				catch (Exception e)
				{
						e.printStackTrace();
				}
				if (Music.midiPlayer == null)
				{
						ClientConfiguration.connorSettings = true;
				}
				mapBack = new Background[2];
				xpCounter = 0;
				backgroundSprite = new Sprite[2];
				fullscreenInterfaceID = -1;
				chatRights = new int[500];
				chatTypeView = 0;
				clanChatMode = 0;
				cButtonHPos = -1;
				cButtonCPos = 0;
				crown = new Sprite[21];
				pathDistance = new int[104][104];
				friendsNodeIds = new int[200];
				groundArray = new NodeList[4][104][104];
				updateFlames = false;
				aStream_834 = new Stream(new byte[5000]);
				npcArray = new Npc[50000];
				npcIndices = new int[50000];
				entityUpdateIndices = new int[1000];
				aStream_847 = Stream.create();
				soundsAreEnabled = true;
				setInterfaceDisplayed(-1);
				skillExperience = new int[Skills.skillsCount];
				useJagGrab = false;
				anIntArray873 = new int[5];
				cameraEffectEnabled = new boolean[5];
				drawFlames = false;
				unknownInt10 = -1;
				menuOpen = false;
				inputString = "";
				maxPlayers = 2048;
				myPlayerIndex = 2047;
				playerArray = new Player[maxPlayers];
				playerIndices = new int[maxPlayers];
				entityIndices = new int[maxPlayers];
				aStreamArray895s = new Stream[maxPlayers];
				pathWaypoint = new int[104][104];
				tmpTexture = new byte[16384];
				baseSkillLevel = new int[Skills.skillsCount];
				ignoreListAsLongs = new long[100];
				loadingError = false;
				anIntArray928 = new int[5];
				tileCycleMap = new int[104][104];
				chatTypes = new int[500];
				chatNames = new String[500];
				chatMessages = new String[500];
				chatButtons = new Sprite[4];
				isFocused = true;
				friendsListAsLongs = new long[200];
				currentSong = -1;
				spriteDrawX = -1;
				spriteDrawY = -1;
				mapbackOffsets0 = new int[33];
				decompressors = new Decompressor[6];
				variousSettings = new int[2000];
				aBoolean972 = false;
				spokenMaxCount = 50;
				spokenX = new int[spokenMaxCount];
				spokenY = new int[spokenMaxCount];
				spokenOffsetY = new int[spokenMaxCount];
				spokenOffsetX = new int[spokenMaxCount];
				spokenColor = new int[spokenMaxCount];
				spokenEffect = new int[spokenMaxCount];
				spokenCycle = new int[spokenMaxCount];
				spokenMessage = new String[spokenMaxCount];
				lastPlane = -1;
				hitMarks = new Sprite[20];
				selectedIdentityKitColor = new int[5];
				aBoolean994 = false;
				amountOrNameInput = "";
				projectiles = new NodeList();
				cameraSendingInfo = false;
				walkableInterfaceId = -1;
				cameraEffectCycles = new int[5];
				updateCharacterCreation = false;
				mapFunctions = new Sprite[100];
				dialogId = -1;
				maxStats = new int[Skills.skillsCount];
				anIntArray1045 = new int[2000];
				selectedMaleIdentityKit = true;
				compassOffsets0 = new int[151];
				flashingSidebarTab = -1;
				spotanims = new NodeList();
				mapbackOffsets1 = new int[33];
				chatInterface = new RSInterface();
				mapScenes = new Background[100];
				barFillColor = 0x4d4233;
				clotheIds = new int[7];
				objectIconX = new int[1000];
				objectIconY = new int[1000];
				sceneIsLoading = false;
				friendsList = new String[200];
				inStream = Stream.create();
				expectedCRCs = new int[9];
				menuActionCmd2 = new int[500];
				menuActionCmd3 = new int[500];
				menuActionID = new int[500];
				menuActionCmd1 = new int[500];
				headIcons = new Sprite[20];
				skullIcons = new Sprite[20];
				headIconsHint = new Sprite[20];
				setTabAreaAltered(false);
				inputMessage = "";
				atPlayerActions = new String[5];
				atPlayerArray = new boolean[5];
				regionChunkUIDs = new int[4][13][13];
				objectIcon = new Sprite[1000];
				regionIsRestricted = false;
				setDialogueOptionsShowing(false);
				crosses = new Sprite[8];
				musicEnabled = true;
				setLoggedIn(false);
				canMute = false;
				loadingReceivedMap = false;
				inCutsceneMode = false;
				myUsername = "";
				myPassword = "";
				genericLoadingError = false;
				reportAbuseInterfaceID = -1;
				objects = new NodeList();
				chaseCameraPitch = 128;
				setInvOverlayInterfaceID(-1);
				stream = Stream.create();
				menuActionName = new String[500];
				anIntArray1203 = new int[5];
				sound = new int[50];
				chatScrollHeight = 78;
				promptInput = "";
				bankSearchSent = "";
				setTabId(3, false);
				setInputTaken(false);
				compassOffsets1 = new int[151];
				collisionMap = new CollisionMap[4];
				soundType = new int[50];
				isDragging = false;
				soundDelay = new int[50];
				soundVolume = new int[50];
				rsAlreadyLoaded = false;
				welcomeScreenRaised = false;
				setMessagePromptRaised(false);
				setLoginMessage1("Enter your username and password.");
				backDialogID = -1;
				bigX = new int[4000];
				bigY = new int[4000];
		}

		public void resetAllImageProducers()
		{
				if (super.fullGameScreen != null)
				{
						return;
				}
				chatBackImage = null;
				mapBackImage = null;
				inventoryBackImage = null;
				inGameScreen = null;
				aRSImageProducer_1107 = null;
				aRSImageProducer_1109 = null;
				super.fullGameScreen = constructGraphicsBuffer(getClientWidth(), getClientHeight(), getGameComponent());
				welcomeScreenRaised = true;
		}

		static
		{
				XP_LOOKUP = new int[99];
				int i = 0;
				for (int j = 0; j < 99; j++)
				{
						int l = j + 1;
						int i1 = (int) ((double) l + 300D * Math.pow(2D, (double) l / 7D));
						i += i1;
						XP_LOOKUP[j] = i / 4;
				}
				BIT_MASK = new int[32];
				i = 2;
				for (int k = 0; k < 32; k++)
				{
						BIT_MASK[k] = i - 1;
						i += i;
				}
		}

		private static String intToKOrMilLongName(int i)
		{
				String s = String.valueOf(i);
				for (int k = s.length() - 3; k > 0; k -= 3)
				{
						s = s.substring(0, k) + "," + s.substring(k);
				}

				if (s.length() > 8)
				{
						s = "@gre@" + s.substring(0, s.length() - 8) + " million @whi@(" + s + ")";
				}
				else if (s.length() > 4)
				{
						s = "@cya@" + s.substring(0, s.length() - 4) + "K @whi@(" + s + ")";
				}
				return " " + s;
		}

		static int getInterfaceDisplayed()
		{
				return interfaceDisplayed;
		}

		static void setInterfaceDisplayed(int openInterfaceId)
		{
				Client.interfaceDisplayed = openInterfaceId;
				if (openInterfaceId == -1)
				{
						Content.closeSearch(true, true);
				}
				if (openInterfaceId == 15106 || openInterfaceId == 15150)
				{
						setTabId(3, true);
						usingEquipmentInterface = true;
						setTabAreaAltered(true);
				}
				else
				{
						usingEquipmentInterface = false;
				}
				if (openInterfaceId != 24959)
				{
						Content.closeSearch(true, true);
				}

				// Bank interface and shop interface and duel arena interface
				if (openInterfaceId == 24959 || openInterfaceId == 3824 || openInterfaceId == 6575)
				{
						setShowSettingTicks(false);
				}
				Content.drawOnBankInterface();
		}

		static int[] soundVolume = new int[50];

		/**
		 * Cache downloading loading bar.
		 * This method has to be kept here because of the image being loaded from the jar file
		 */
		public void drawLoadingTextCacheDownloader(int amount, String text)
		{
				if (RSApplet.shouldClearScreen)
				{
						Client.instance.graphics.setColor(Color.black);
						Client.instance.graphics.fillRect(0, 0, Client.instance.myWidth, Client.instance.myHeight);
						RSApplet.shouldClearScreen = false;
						BufferedImage background;
						try
						{
								background = ImageIO.read(this.getClass().getResource("image/background.jpg"));
								Client.instance.graphics.drawImage(background, 0, 0, 768, 506, null);
						}
						catch (IOException e)
						{
								e.printStackTrace();
						}
				}
				Client.instance.drawLoadingText((int) (amount * 2.60), text);
		}

		/**
		 * Select the data.
		 * This method has to be kept here because of the image being loaded from the jar file
		 */
		public void selectData() throws IOException
		{
				if (ClientConfiguration.SKIP_DATA_SELECTION)
				{
						Client.clientRevision = ClientConfiguration.SKIP_DATA_SELECTION_TO;
						SignLink.setCacheDirectory();
						loadingGameString = "Loading " + ClientConfiguration.SKIP_DATA_SELECTION_TO + " era...";
						return;
				}
				Settings.loadLastDataSelected();
				Client.showSelectDataImages = true;
				BufferedImage background = ImageIO.read(this.getClass().getResource("image/background.jpg"));
				BufferedImage image474 = ImageIO.read(this.getClass().getResource("image/474.jpg"));
				BufferedImage image525 = ImageIO.read(this.getClass().getResource("image/525.jpg"));
				BufferedImage image602 = ImageIO.read(this.getClass().getResource("image/602.jpg"));
				BufferedImage image474Dark = ImageIO.read(this.getClass().getResource("image/474 dark.jpg"));
				BufferedImage image525Dark = ImageIO.read(this.getClass().getResource("image/525 dark.jpg"));
				BufferedImage image602Dark = ImageIO.read(this.getClass().getResource("image/602 dark.jpg"));
				BufferedImage leftArrow = ImageIO.read(this.getClass().getResource("image/arrow left.png"));
				BufferedImage rightArrow = ImageIO.read(this.getClass().getResource("image/arrow right.png"));
				BufferedImage leftArrowHover = ImageIO.read(this.getClass().getResource("image/arrow left hover.png"));
				BufferedImage rightArrowHover = ImageIO.read(this.getClass().getResource("image/arrow right hover.png"));
				BufferedImage border = ImageIO.read(this.getClass().getResource("image/border.png"));

				int wtf = 0;
				int mainImageX = 97;
				int mainImageY = 55;
				int mainImageWidth = 570;
				int mainImageHeight = 375;

				int arrowWidth = 43;
				int arrowHeight = 29;

				int leftArrowX = 38;
				int leftArrowY = 229;

				int rightArrowX = 683;
				int rightArrowY = leftArrowY;
				String eraData = lastDataSelected;

				String[][] eraList = {{"2007", "474"}, {"2009", "525"}, {"2010", "602"}};
				String era = "2007";
				for (int index = 0; index < eraList.length; index++)
				{
						if (eraList[index][1].equals(eraData))
						{
								era = eraList[index][0];
						}
				}

				while (!Client.choseData)
				{
						wtf++;
						if (wtf == 1)
						{
								Utility.print(""); // If i don't put this here, when i used the jarred client, it will freeze at select data -.- Java pls.
						}
						if (Client.showSelectDataImages || RSApplet.shouldClearScreen)
						{
								RSApplet.shouldClearScreen = false;
								Client.instance.graphics.drawImage(background, 0, 0, 768, 506, null);
								Client.instance.graphics.drawImage(era.equals("2007") ? image474Dark : era.equals("2009") ? image525Dark : image602Dark, mainImageX, mainImageY, mainImageWidth, mainImageHeight, null);
								Client.instance.graphics.drawImage(leftArrow, leftArrowX, leftArrowY, arrowWidth, arrowHeight, null);
								Client.instance.graphics.drawImage(rightArrow, rightArrowX, rightArrowY, arrowWidth, arrowHeight, null);
								Client.instance.drawLoadingText(0, "Click on the image to play using the " + era + " era.");
								Client.showSelectDataImages = false;
						}
						if (Client.isWithIn(leftArrowX, leftArrowX + arrowWidth, leftArrowY, leftArrowY + arrowHeight))
						{
								if (Client.instance.clickMode2 == 1 && !hasClicked)
								{
										hasClicked = true;
										for (int index = 0; index < eraList.length; index++)
										{
												if (era.equals(eraList[index][0]))
												{
														if (index == 0)
														{
																index = eraList.length;
														}
														era = eraList[index - 1][0];
														eraData = eraList[index - 1][1];
														Client.instance.drawLoadingText(0, "Click on the image to play using the " + era + " era.");
														Client.instance.graphics.drawImage(era.equals("2007") ? image474Dark : era.equals("2009") ? image525Dark : image602Dark, mainImageX, mainImageY, mainImageWidth, mainImageHeight, null);
														break;
												}
										}
								}
								if (!Client.imageToDraw.equals("left"))
								{
										Client.imageToDraw = "left";
										Client.instance.graphics.drawImage(leftArrowHover, leftArrowX, leftArrowY, arrowWidth, arrowHeight, null);
								}
						}
						else if (Client.isWithIn(rightArrowX, rightArrowX + arrowWidth, rightArrowY, rightArrowY + arrowHeight))
						{
								if (Client.instance.clickMode2 == 1 && !hasClicked)
								{
										hasClicked = true;
										for (int index = 0; index < eraList.length; index++)
										{
												if (era.equals(eraList[index][0]))
												{
														if (index == eraList.length - 1)
														{
																index = -1;
														}
														era = eraList[index + 1][0];
														eraData = eraList[index + 1][1];
														Client.instance.drawLoadingText(0, "Click on the image to play using the " + era + " era.");
														Client.instance.graphics.drawImage(era.equals("2007") ? image474Dark : era.equals("2009") ? image525Dark : image602Dark, mainImageX, mainImageY, mainImageWidth, mainImageHeight, null);
														break;
												}
										}
								}
								if (!Client.imageToDraw.equals("right"))
								{
										Client.imageToDraw = "right";
										Client.instance.graphics.drawImage(rightArrowHover, rightArrowX, rightArrowY, arrowWidth, arrowHeight, null);
								}
						}
						else if (Client.isWithIn(mainImageX, mainImageX + mainImageWidth, mainImageY, mainImageY + mainImageHeight))
						{
								if (Client.instance.clickMode2 == 1 && !hasClicked)
								{
										hasClicked = true;
										Client.instance.drawLoadingText(0, era + " era selected");
										Client.choseData = true;
										Client.clientRevision = eraData;
										System.out.println("The " + eraData + " era has been selected.");
										System.out.println("We are now using the cache at: " + new File(ClientConstants.getCacheRevisionLocation()).getAbsolutePath());
										SignLink.setCacheDirectory();
										RSApplet.clickX = 1;
										RSApplet.clickY = 1;
										loadingGameString = "Loading " + era + " era...";
										lastDataSelected = eraData;
										Settings.saveLastDataSelected();
										Client.instance.graphics.drawImage(border, mainImageX - 2, mainImageY - 2, mainImageWidth + 4, mainImageHeight + 4, null);
								}
								if (!Client.imageToDraw.equals("middle"))
								{
										Client.imageToDraw = "middle";
										Client.instance.graphics.drawImage(era.equals("2007") ? image474 : era.equals("2009") ? image525 : image602, mainImageX, mainImageY, mainImageWidth, mainImageHeight, null);
								}
						}
						else
						{
								if (!Client.imageToDraw.equals("none"))
								{
										Client.imageToDraw = "none";
										Client.instance.graphics.drawImage(leftArrow, leftArrowX, leftArrowY, arrowWidth, arrowHeight, null);
										Client.instance.graphics.drawImage(rightArrow, rightArrowX, rightArrowY, arrowWidth, arrowHeight, null);
										Client.instance.graphics.drawImage(era.equals("2007") ? image474Dark : era.equals("2009") ? image525Dark : image602Dark, mainImageX, mainImageY, mainImageWidth, mainImageHeight, null);
								}
						}
				}
		}

		public static boolean isLoggedIn()
		{
				return loggedIn;
		}

		public static void setLoggedIn(boolean loggedIn)
		{
				Client.loggedIn = loggedIn;
		}

		public static boolean isShowSettingTicks()
		{
				return showSettingTicks;
		}

		public static void setShowSettingTicks(boolean showSettingTicks)
		{
				Client.showSettingTicks = showSettingTicks;
		}

		/**
		 * Width of the client at fixed mode.
		 */
		public static int FIXED_CLIENT_WIDTH = 764;

		public static int FIXED_CLIENT_HEIGHT = 504;

		/**
		 * Width of the game screen at fixed mode.
		 */
		public static int FIXED_GAME_SCREEN_WIDTH = 512;

		public static int FIXED_GAME_SCREEN_HEIGHT = 334;

		/**
		 * Width of the client at resizable mode.
		 * <p>
		 * note: the client size and the game screen size of resizable is exactly the same.
		 */
		public static int RESIZABLE_WIDTH = 1374;

		public static int RESIZABLE_HEIGHT = 732;

		public static String displayMode = "FIXED";

		private static boolean isFixedScreen = displayMode.equals("FIXED");

		public static int getGameScreenWidth()
		{
				switch (displayMode)
				{
						case "FIXED":
								return FIXED_GAME_SCREEN_WIDTH;

						case "RESIZABLE":
								return RESIZABLE_WIDTH;
				}

				return 0;
		}

		public static int getGameScreenHeight()
		{
				switch (displayMode)
				{
						case "FIXED":
								return FIXED_GAME_SCREEN_HEIGHT;

						case "RESIZABLE":
								return RESIZABLE_HEIGHT;
				}

				return 0;
		}

		public static String osName = "";

		public static int getClientHeight()
		{
				switch (displayMode)
				{
						case "FIXED":
								return FIXED_CLIENT_HEIGHT;

						case "RESIZABLE":
								return RESIZABLE_HEIGHT + (Client.osName.equals("Windows 7") ? 11 : 0);
				}

				return 0;
		}

		public static int getClientWidth()
		{
				switch (displayMode)
				{
						case "FIXED":
								return FIXED_CLIENT_WIDTH;

						case "RESIZABLE":
								return RESIZABLE_WIDTH + (Client.osName.equals("Windows 7") ? 8 : 0);
				}

				return 0;
		}

		public static void setBounds()
		{
				// If this is changed, also got to change the screenshot positions.
				Rasterizer.prepare3d2(getClientWidth(), getClientHeight());
				Client.instance.fullScreenTextureArray = Rasterizer.offsets;
				Rasterizer.prepare3d2(isFixedScreen() ? 516 : getClientWidth(), isFixedScreen() ? 165 : getClientHeight());
				Client.instance.chatOffsets = Rasterizer.offsets;
				Rasterizer.prepare3d2(isFixedScreen() ? 250 : getClientWidth(), isFixedScreen() ? 335 : getClientHeight());
				Client.instance.sidebarOffsets = Rasterizer.offsets;
				Rasterizer.prepare3d2(getGameScreenWidth(), getGameScreenHeight());
				Client.instance.viewportOffsets = Rasterizer.offsets;
				int ai[] = new int[9];
				for (int i8 = 0; i8 < 9; i8++)
				{
						int k8 = 128 + i8 * 32 + 15;
						int l8 = 600 + k8 * 3;
						int i9 = Rasterizer.sin[k8];
						ai[i8] = l8 * i9 >> 16;
				}
				Landscape.prepare(500, 800, getGameScreenWidth(), getGameScreenHeight(), ai);
				if (loggedIn)
				{
						Client.instance.inGameScreen = constructGraphicsBuffer(getGameScreenWidth(), getGameScreenHeight(), Client.instance.getGameComponent());
				}
		}

		@SuppressWarnings("unused")
		private void logInUpdate()
		{
				setDisconnected(false);
				if (!Client.isFixedScreenSaved)
				{
						setToResizable();
				}

				if (!Client.isFixedScreen())
				{
						Jframe.frame.setResizable(true);
				}
				setShowSettingTicks(false);
				Music.stopMidi();
				Content.updateMusicVolume(); // Left here because Connor's one would crash on startup method.

				// Inform server that the client is using 474 gameframe to use old wild interface.
				if (is474GameFrame)
				{
						Client.instance.sendCommandPacket("::oldgameframe");
				}

				if (filtered)
				{
						Client.instance.sendCommandPacket("::filteron");
				}
				else
				{
						Client.instance.sendCommandPacket("::filteroff");
				}
				Client.instance.sendCommandPacket("::graphics" + (Client.clientRevision.equals("474") ? "2007" : Client.clientRevision.equals("525") ? "2009" : "2010"));

				boolean autoLoop = false;
				if (autoLoop)
				{
						Client.interfacesReloadLoop = !Client.interfacesReloadLoop;
						Client.interfacesReloaded = !Client.interfacesReloaded;
						Client.instance.pushMessage("Interface looping: " + Client.interfacesReloadLoop, 0, "");
				}
				if (ClientConfiguration.FORCE_OPEN_INTERFACE > 0)
				{
						setInterfaceDisplayed(ClientConfiguration.FORCE_OPEN_INTERFACE);
				}
		}

		public static int astralRuneAmount;

		public static int deathRuneAmount;

		public static int earthRuneAmount;

		public static void displayInputBox(int inputValueNumber, String inputTitle)
		{
				setInputTaken(true);
				inputDialogState = 0;
				setMessagePromptRaised(true);
				promptInput = "";
				bankSearchSent = "";
				inputValue = inputValueNumber;
				inputMessage = inputTitle;
				friendsListAction = 0;
		}

		public static String getMacAddress()
		{
				try
				{
						InetAddress a = InetAddress.getLocalHost();
						NetworkInterface n = NetworkInterface.getByInetAddress(a);
						byte[] m = n.getHardwareAddress();
						if (m == null)
						{
								return "INVALID1";
						}
						StringBuilder sb = new StringBuilder();
						for (int i = 0; i < m.length; i++)
						{
								sb.append(String.format("%02X%s", m[i], (i < m.length - 1) ? "-" : ""));
						}
						return sb.toString();
				}
				catch (SocketException | UnknownHostException e)
				{
						e.printStackTrace();
				}
				return "INVALID2";
		}

		String getLoginMessage1()
		{
				return loginMessage1;
		}

		void setLoginMessage1(String loginMessage1)
		{
				this.loginMessage1 = loginMessage1;
		}

		static boolean isTabAreaAltered()
		{
				return tabAreaAltered;
		}

		static void setTabAreaAltered(boolean tabAreaAltered)
		{
				Client.tabAreaAltered = tabAreaAltered;
		}

		public static int getTutorialStage()
		{
				return tutorialStage;
		}

		public static void setTutorialStage(int tutorialStage)
		{
				Client.tutorialStage = tutorialStage;
		}

		public static void loadTextFonts()
		{
				Client.instance.smallText = new TextDrawingArea(false, "p11_full" + (Client.newFont ? "_new" : ""), Client.instance.titleStreamLoader);
				Client.instance.newSmallFont = new RSFont(false, "p11_full" + (Client.newFont ? "_new" : ""), Client.instance.titleStreamLoader);
				Client.instance.newRegularFont = new RSFont(false, "p12_full" + (Client.newFont ? "_new" : ""), Client.instance.titleStreamLoader);
				Client.instance.aTextDrawingArea_1271 = new TextDrawingArea(false, "p12_full" + (Client.newFont ? "_new" : ""), Client.instance.titleStreamLoader);
				Client.instance.chatTextDrawingArea = new TextDrawingArea(false, "b12_full" + (Client.newFont ? "_new" : ""), Client.instance.titleStreamLoader);
				Client.instance.newBoldFont = new RSFont(false, "b12_full" + (Client.newFont ? "_new" : ""), Client.instance.titleStreamLoader);
		}

		/**
		 * Dumps the item images for all items in the cache.
		 * Put it in a command to dump images.
		 * @param dumpByName
		 */
		public static void dumpItemImages(boolean dumpByName)
		{
				for (int id = 0; id < 18763; id++)
				{
						ItemDefinition.forId(id);
						Sprite image = ItemDefinition.getSprite(id, id, 0);
						if (image != null)
						{
								dumpImage(image, dumpByName ? ItemDefinition.forId(id).name : Integer.toString(id));
						}
						else
						{
								Utility.print("Item is null.");
						}
				}
		}

		static int amount = 0;

		/**
		 * Dumps a sprite with the specified name.
		 * @param id
		 * @param image
		 */
		public static void dumpImage(Sprite image, String name)
		{
				File directory = new File("dump/");
				if (!directory.exists())
				{
						directory.mkdir();
				}
				BufferedImage bi = new BufferedImage(image.myWidth, image.myHeight, BufferedImage.TYPE_INT_RGB);
				bi.setRGB(0, 0, image.myWidth, image.myHeight, image.myPixels, 0, image.myWidth);
				Image img = makeColorTransparent(bi, new Color(0, 0, 0));
				BufferedImage trans = imageToBufferedImage(img);
				File f = new File("dump/" + name + ".png");
				boolean duplicate = false;
				if (f.exists() && !f.isDirectory())
				{
						amount++;
						duplicate = true;
				}
				try
				{
						Utility.print("Dump: " + name);
						if (duplicate)
						{
								File out = new File("dump/" + name + " " + amount + ".png");
								ImageIO.write(trans, "png", out);
						}
						else
						{
								File out = new File("dump/" + name + ".png");
								ImageIO.write(trans, "png", out);
						}
				}
				catch (Exception e)
				{
						e.printStackTrace();
				}
		}

		/**
		 * Turns an Image into a BufferedImage.
		 * @param image
		 * @return
		 */
		private static BufferedImage imageToBufferedImage(Image image)
		{
				BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
				Graphics2D g2 = bufferedImage.createGraphics();
				g2.drawImage(image, 0, 0, null);
				g2.dispose();
				return bufferedImage;
		}

		/**
		 * Makes the specified color transparent in a buffered image.
		 * @param im
		 * @param color
		 * @return
		 */
		public static Image makeColorTransparent(BufferedImage im, final Color color)
		{
				RGBImageFilter filter = new RGBImageFilter()
				{
						public int markerRGB = color.getRGB() | 0xFF000000;

						public final int filterRGB(int x, int y, int rgb)
						{
								if ((rgb | 0xFF000000) == markerRGB)
								{
										return 0x00FFFFFF & rgb;
								}
								else
								{
										return rgb;
								}
						}
				};
				ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
				return Toolkit.getDefaultToolkit().createImage(ip);
		}

		/**
		 * List of xp drops to display, so it stacks.
		 */
		public static ArrayList<String> xpDropsToDisplay = new ArrayList<String>();


		/**
		 * Used for storing all the clicked interfaces set to true. So when a new clicked interface is changed to true, the ones stored here
		 * can be reset.
		 */
		private static ArrayList<String> interfaceClickedList = new ArrayList<String>();

		/**
		 * Used for storing all the clicked texts set to true. So when a new clicked interface is changed to true, the ones stored here
		 * can be reset.
		 */
		public static ArrayList<String> textClickedList = new ArrayList<String>();

		/**
		 * True to update items live, to allow for live editing and results.
		 */
		public static boolean itemUpdate;

		public static long lastItemUpdate;

		public static long timeAchievementOpened;

		/**
		 * Have a specific interface button to have the clicked sprite.
		 * @param interfaceId
		 * @param clicked
		 */
		protected static void setInterfaceClicked(int interfaceId, boolean clicked)
		{
				for (int index = 0; index < interfaceClickedList.size(); index++)
				{
						RSInterface.interfaceCache[Integer.parseInt(interfaceClickedList.get(index))].isClicked = false;
				}
				interfaceClickedList.clear();
				RSInterface.interfaceCache[interfaceId].isClicked = clicked;
				if (clicked)
				{
						interfaceClickedList.add("" + interfaceId);
				}
		}

		protected static void clearTextClicked()
		{
				for (int index = 0; index < textClickedList.size(); index++)
				{
						RSInterface.interfaceCache[Integer.parseInt(textClickedList.get(index))].textIsClicked = false;
				}
				textClickedList.clear();
		}

		/**
		 * Have a specific interface text to have the clicked sprite.
		 * @param interfaceId
		 * @param clicked
		 */
		protected static void setTextClicked(int interfaceId, boolean clicked)
		{
				if (clicked && RSInterface.interfaceCache[interfaceId].message.isEmpty())
				{
						return;
				}
				for (int index = 0; index < textClickedList.size(); index++)
				{
						RSInterface.interfaceCache[Integer.parseInt(textClickedList.get(index))].textIsClicked = false;
				}
				textClickedList.clear();
				RSInterface.interfaceCache[interfaceId].textIsClicked = clicked;
				if (clicked)
				{
						textClickedList.add("" + interfaceId);
				}
		}

		public static void dumpidx(int cacheIndex, int startId, int endId)
		{
				Utility.print("Unpacking idx: " + cacheIndex);
				try
				{
						File firstFolder = new File(ClientConstants.getCacheRevisionLocation() + "/" + cacheIndex);
						if (!firstFolder.exists())
						{
								firstFolder.mkdir();
						}

						for (int i = startId; i < (endId + 1); i++)
						{
								try
								{
										byte[] indexByteArray = Client.instance.decompressors[cacheIndex].decompress(i);
										if (indexByteArray == null)
										{
												Utility.print("Empty at: " + i);
												continue;
										}
										Utility.print("Dumping: " + i);
										BufferedOutputStream gzip = new BufferedOutputStream(new GZIPOutputStream(new FileOutputStream(ClientConstants.getCacheRevisionLocation() + "/" + cacheIndex + "/" + i + ".gz")));
										if (indexByteArray.length == 0)
												continue;
										else
										{
												gzip.write(indexByteArray);
												gzip.close();

										}
								}
								catch (IOException io)
								{
										throw new IOException("could not write to folder indicated");
								}
						}
				}
				catch (Exception e)
				{
						e.printStackTrace();
				}
		}

		int getMenuScreenArea()
		{
				return menuScreenArea;
		}

		void setMenuScreenArea(int menuScreenArea)
		{
				this.menuScreenArea = menuScreenArea;
		}

		public static void setToResizable()
		{
				if (!Client.isFixedScreen())
				{
						return;
				}

				// Change resizable button to clicked.
				if (Client.CameraPos2 < 400)
				{
						Client.CameraPos2 = 400;
				}
				Client.instance.sendFrame36(200, 1);
				Client.isFixedScreenSaved = false;
				Client.displayMode = "RESIZABLE";
				Client.setFixedScreen(false);
				Client.RESIZABLE_WIDTH = Client.clientWidthSaved;
				Client.RESIZABLE_HEIGHT = Client.clientHeightSaved;
				Jframe.rebuild(false);

				if (!Client.isFixedScreenSaved && Client.clientMaximized)
				{
						Client.clientMaximizedPreviously = true;
						Jframe.frame.setSize(Client.clientWidthSaved, Client.clientHeightSaved);
						Jframe.frame.setExtendedState(Jframe.frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
				}
				Client.setBounds();
				Client.CameraPos1 = 1;

		}

		public static boolean isFixedScreen()
		{
				return isFixedScreen;
		}

		public static void setFixedScreen(boolean isFixedScreen)
		{
				Client.isFixedScreen = isFixedScreen;
		}

		public static boolean isInputTaken()
		{
				return inputTaken;
		}

		public static void setInputTaken(boolean inputTaken)
		{
				Client.inputTaken = inputTaken;
		}

		static int getTabId()
		{
				return tabId;
		}

		void mouseWheelDragged(int i, int j)
		{
				if (!mouseWheelDown)
						return;

				int speed = 3;
				for (Camera.CameraData data : Camera.CameraData.values())
				{
						if (Client.cameraSpeed.equals(data.toString()))
						{
								speed = 3 + data.ordinal();
						}
				}
				this.cameraYawTranslate += i * speed;
				this.cameraPitchTranslate += (j << 1);
		}

		static void setTabId(int tabId, boolean ignoreHideInventory)
		{
				if (Client.usingEquipmentInterface)
				{
						return;
				}
				setTabAreaAltered(true);
				if (!ignoreHideInventory && !Client.getInventoryLayout("OLD"))
				{
						if (getTabId() == tabId)
						{
								if (Client.hideInventoryInterface && !Client.isFixedScreen())
								{
										Client.hideInventoryInterfaceAction = !Client.hideInventoryInterfaceAction;
								}
						}
						else
						{
								Client.hideInventoryInterfaceAction = false;
						}
				}
				else
				{
						Client.hideInventoryInterfaceAction = false;
				}
				Client.tabId = tabId;
		}

		static int getInvOverlayInterfaceID()
		{
				return invOverlayInterfaceID;
		}

		static void setInvOverlayInterfaceID(int invOverlayInterfaceID)
		{
				Client.invOverlayInterfaceID = invOverlayInterfaceID;
		}

		public int getLoadingStage()
		{
				return loadingStage;
		}

		public void setLoadingStage(int loadingStage)
		{
				this.loadingStage = loadingStage;
		}

		boolean isDisconnected()
		{
				return disconnected;
		}

		void setDisconnected(boolean disconnected)
		{
				this.disconnected = disconnected;
		}

		public static boolean isDialogueOptionsShowing()
		{
				return dialogueOptionsShowing;
		}

		public static void setDialogueOptionsShowing(boolean dialogueOptionsShowing)
		{
				Client.dialogueOptionsShowing = dialogueOptionsShowing;
		}

		public static boolean isMessagePromptRaised()
		{
				return messagePromptRaised;
		}

		public static void setMessagePromptRaised(boolean messagePromptRaised)
		{
				Client.messagePromptRaised = messagePromptRaised;
		}

		public static int getDialogueOptionUsed()
		{
				return dialogueOptionUsed;
		}

		public static void setDialogueOptionUsed(int dialogueOptionUsed)
		{
				Client.dialogueOptionUsed = dialogueOptionUsed;
				if (dialogueOptionUsed != 0 && !Client.isDialogueOptionsShowing() && Client.backDialogID > 0 && Client.inputValue == -1)
				{
						try
						{
								RSInterface.interfaceCache[Client.dialogueOptionUsed].message = "Please wait...";
						}
						catch (Exception e)
						{
								Utility.print("Error55: " + e);
						}
				}
		}

		public static String formatNumber(int number)
		{
				// Do not use return NumberFormat.getIntegerInstance().format(number);. It is 9 times slower.
				String string = Integer.toString(number);
				if (number < 1000)
				{
						return string;
				}
				if (number >= 1000 && number < 10000)
				{
						return string.substring(0, 1) + "," + string.substring(1);
				}
				if (number < 100000)
				{
						return string.substring(0, 2) + "," + string.substring(2);
				}
				if (number < 1000000)
				{
						return string.substring(0, 3) + "," + string.substring(3);
				}
				if (number < 10000000)
				{
						return string.substring(0, 1) + "," + string.substring(1, 4) + "," + string.substring(4, 7);
				}
				if (number < 100000000)
				{
						return string.substring(0, 2) + "," + string.substring(2, 5) + "," + string.substring(5, 8);
				}
				if (number < 1000000000)
				{
						return string.substring(0, 3) + "," + string.substring(3, 6) + "," + string.substring(6, 9);
				}
				if (number < Integer.MAX_VALUE)
				{
						return string.substring(0, 1) + "," + string.substring(1, 4) + "," + string.substring(4, 7) + "," + string.substring(7, 10);
				}
				return string;
		}
}