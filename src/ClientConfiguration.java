/**
 * Main client configurations.
 * @author MGT Madness Created on: 11-11-2013
 */
public class ClientConfiguration
{

		/**
		 * True to connect the client to local host.
		 */
		public static boolean LOCAL_HOST = true;

		/**
		 * Where the player downloads the whole Client in a zip folder.
		 */
		public final static boolean ZIP_CLIENT_VERSION = false;

		/**
		 * True, to load the sprites from an external folder instead of cache packed.
		 */
		public static final boolean DEBUG_SPRITES = false;

		/**
		 * True, to use cache beside the client.
		 * <p>
		 * False, to use the cache in the user folder, for the live server.
		 */
		public static boolean LOCAL_CACHE = true;

		/**
		 * True for the noclip command to work.
		 */
		public final static boolean NO_CLIP_COMMAND = false;

		/**
		 * True, to use CacheDownloader class.
		 */
		public final static boolean DOWNLOAD_LATEST_CACHE = false;

		/**
		 * True, to skip the data selection process.
		 */
		public static boolean SKIP_DATA_SELECTION = false;

		/**
		 * The revision to skip to.
		 */
		public static String SKIP_DATA_SELECTION_TO = "474";

		/**
		 * True, to log-in as MGT Madness automatically.
		 */
		public final static boolean FORCE_LOG_IN = false;

		/**
		 * True, to make the client position itself at the top right of my screen on startup.
		 */
		public final static boolean CLIENT_TOP_RIGHT = false;

		/**
		 * True, to show in-depth debugging information.
		 */
		public static boolean DEBUG_MODE = true;

		/**
		 * True, to debug interface IDs used. 21030-22000 is highscores. 22260-22450 is achievements. (with extra space counted for expansion)
		 */
		public static final boolean DEBUG_INTERFACES = false;

		/**
		 * Force open an interface on log-in. 0 for none.
		 */
		public final static int FORCE_OPEN_INTERFACE = 0;

		/**
		 * Amount of sprites.
		 */
		public static final int SPRITES_AMOUNT = 750;

		/**
		 * True to dump sprites.
		 */
		public static final boolean DUMP_SPRITES = false;

		/**
		 * Used to locate the version folder of the sprites location.
		 */
		public static String SPRITES_CACHE_VERSION = "v12";

		/**
		 * The cache folder name. This will be the folder name inside the ShatterScape folder.
		 */
		public static String CACHE_VERSION = "v5";

		/**
		 * @return
		 * 			The cache size.
		 */
		public static int getCacheDataSize()
		{
				if (Client.clientRevision("474"))
				{
						return 97760382;
				}
				else if (Client.clientRevision("525"))
				{
						return 98456142;
				}
				else if (Client.clientRevision("602"))
				{
						return 97161342;
				}
				return 0;
		}

		/**
		 * Size of the sprites.dat file.
		 */
		public static final long SPRITES_SIZE = 1338461;

		public static boolean connorSettings = false;
}
