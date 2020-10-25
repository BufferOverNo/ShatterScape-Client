public class ClientConstants
{

		public final static int YELLOW = 0xffff01;

		public final static int WHITE = 0xffffff;

		public final static int ORANGE = 0xff981f;

		public final static int PALE_ORANGE = 0xc8aa64;

		public final static int RED = 0xfe3200;

		public final static int GREEN = 0x09FF00;

		public final static int PALE_GREEN = 0x46b556;

		/**
		 * Download link of cache in zip format.
		 */
		public final static String getCacheDownloadLink = "https://www.dropbox.com/s/wtmosljqxbsmi6r/cache.zip?dl=1";

		public static String getRevisionDownloadLink()
		{
				switch (Client.clientRevision)
				{
						case "474":
								return "https://www.dropbox.com/s/kg8negvnr3baxus/474cache.zip?dl=1";
						case "525":
								return "https://www.dropbox.com/s/m5wrqg5i3feky7s/525cache.zip?dl=1";
						case "602":
								return "https://www.dropbox.com/s/hfvou11qgdrq010/602cache.zip?dl=1";
				}
				return "";
		}

		/**
		 * Name of the cache folder.
		 */
		public final static String getCacheName = "dawntained_cache";

		/**
		 * ShatterScape folder directory.
		 */
		public final static String SHATTERSCAPE_CACHE_LOCATION = ClientConfiguration.LOCAL_CACHE ? ClientConstants.getCacheName + "/" : System.getProperty("user.home") + "/" + ClientConstants.getCacheName + "/";

		/**
		 * The cache directory.
		 */
		public final static String MAIN_CACHE_LOCATION = SHATTERSCAPE_CACHE_LOCATION + ClientConfiguration.CACHE_VERSION + "/";


		public final static String CACHE_LOCATION = MAIN_CACHE_LOCATION + "cache_" + ClientConfiguration.SPRITES_CACHE_VERSION + "/";

		/**
		 * The location of the sprites folder.
		 */
		public final static String SPRITES_LOCATION = CACHE_LOCATION + "sprites/";

		public final static String SCREEN_SHOT_LOCATION = SHATTERSCAPE_CACHE_LOCATION + "settings/screenshot.txt";

		/**
		 * Location of the 602 cache data.
		 */
		public static String getCacheRevisionLocation()
		{
				return MAIN_CACHE_LOCATION + Client.clientRevision + "_cache";
		}

		public final static int FIRST_LOG_IN_BOX_MOUSE_X_BEGIN = 289;

		public final static int FIRST_LOG_IN_BOX_MOUSE_X_END = 475;

		public final static int FIRST_LOG_IN_BOX_MOUSE_Y_BEGIN = 160;

		public final static int FIRST_LOG_IN_BOX_MOUSE_Y_END = 185;

		public final static int STANDARD_DETAIL_MOUSE_X_BEGIN = 293;

		public final static int STANDARD_DETAIL_MOUSE_X_END = 373;

		public final static int STANDARD_DETAIL_MOUSE_Y_BEGIN = 280;

		public final static int STANDARD_DETAIL_MOUSE_Y_END = 326;

		public final static int HIGH_DETAIL_MOUSE_X_BEGIN = 402;

		public final static int HIGH_DETAIL_MOUSE_X_END = 457;

		public final static int HIGH_DETAIL_MOUSE_Y_BEGIN = 280;

		public final static int HIGH_DETAIL_MOUSE_Y_END = 326;


		public final static int USERNAME_BOX_MOUSE_X_BEGIN = 278;

		public final static int USERNAME_BOX_MOUSE_X_END = 493;

		public final static int USERNAME_BOX_MOUSE_Y_BEGIN = 207;

		public final static int USERNAME_BOX_MOUSE_Y_END = 235;

		public final static int PASSWORD_BOX_MOUSE_X_BEGIN = 278;

		public final static int PASSWORD_BOX_MOUSE_X_END = 493;

		public final static int PASSWORD_BOX_MOUSE_Y_BEGIN = 261;

		public final static int PASSWORD_BOX_MOUSE_Y_END = 288;

		public final static int LOG_IN_BOX_MOUSE_X_BEGIN = 296;

		public final static int LOG_IN_BOX_MOUSE_X_END = 473;

		public final static int LOG_IN_BOX_MOUSE_Y_BEGIN = 310;

		public final static int LOG_IN_BOX_MOUSE_Y_END = 338;

		public final static int[] anIntArray1177 =
		// Cannot find refactor.
		{0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};

		public final static int[] IDs = {
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
				18471, /* Ancients */
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

		public final static int[] runeChildren = {
				1202,
				1203,
				1209,
				1210,
				1211,
				1218,
				1219,
				1220,
				1227,
				1228,
				1234,
				1235,
				1236,
				1243,
				1244,
				1245,
				1252,
				1253,
				1254,
				1261,
				1262,
				1263,
				1270,
				1271,
				1277,
				1278,
				1279,
				1286,
				1287,
				1293,
				1294,
				1295,
				1302,
				1303,
				1304,
				1311,
				1312,
				1318,
				1319,
				1320,
				1327,
				1328,
				1329,
				1336,
				1337,
				1343,
				1344,
				1345,
				1352,
				1353,
				1354,
				1361,
				1362,
				1363,
				1370,
				1371,
				1377,
				1378,
				1384,
				1385,
				1391,
				1392,
				1393,
				1400,
				1401,
				1407,
				1408,
				1410,
				1417,
				1418,
				1424,
				1425,
				1426,
				1433,
				1434,
				1440,
				1441,
				1442,
				1449,
				1450,
				1456,
				1457,
				1463,
				1464,
				1465,
				1472,
				1473,
				1474,
				1481,
				1482,
				1488,
				1489,
				1490,
				1497,
				1498,
				1499,
				1506,
				1507,
				1508,
				1515,
				1516,
				1517,
				1524,
				1525,
				1526,
				1533,
				1534,
				1535,
				1547,
				1548,
				1549,
				1556,
				1557,
				1558,
				1566,
				1567,
				1568,
				1576,
				1577,
				1578,
				1586,
				1587,
				1588,
				1596,
				1597,
				1598,
				1605,
				1606,
				1607,
				1616,
				1617,
				1618,
				1627,
				1628,
				1629,
				1638,
				1639,
				1640,
				6007,
				6008,
				6011,
				8673,
				8674,
				12041,
				12042,
				12429,
				12430,
				12431,
				12439,
				12440,
				12441,
				12449,
				12450,
				12451,
				12459,
				12460,
				15881,
				15882,
				15885,
				18474,
				18475,
				18478};

		public final static int[] SPOKEN_PALETTE = {0xffff00, 0xff0000, 65280, 65535, 0xff00ff, 0xffffff};

		/**
		 * Colour of the second colour of certain torsos, for example, the black one: http://prntscr.com/6ds7ke
		 */
		public final static int[] anIntArray1204 = {9104, 10275, 7595, 3610, 7975, 8526, 918, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486, 20, 95, -15801, 38820, 38733, 38808, 38802};

		// Make-over-mage clothes outfit colour.
		public final static int[][] CLOTHES_COLOUR = {{6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193, 1, 35003, -15701
						// Hair.
						}, {8741, 12, 64030, 43162, 7735, 8404, 1701, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239, 1, 107, -15701, 38802, 38750, 38820, 38430
						// Torso.
						}, {25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 1, 107, -15701, 38802, 38750, 38820, 38430
						// Legs.
						}, {4626, 11146, 6439, 12, 4758, 10270, 1, 107
						// Feet.
						}, {4550, 4537, 5681, 5673, 5790, 6806, 8076, 1, 4574
						// Skin.
						}};

		public final static int[] SKILL_ID_TO_SPRITE = {576, 580, 595, 586, 591, 590, 588, 578, 598, 584, 583, 582, 579, 594, 589, 585, 575, 597, 593, 581, 592};

		public final static int BRIGHTNESS_VERY_DARK = 1;

		public final static int BRIGHTNESS_DARK = 2;

		public final static int BRIGHTNESS_NORMAL = 3;

		public final static int BRIGHTNESS_BRIGHT = 4;

				//@formatter:off.
				public final static int[] buggedBallistaBoots525Male = {
					4127, 4129, 4131, // Mith/Adamant/Rune boots
					1061, // Leather boots
					3105, //Climbing boots
					6920, // Infinity boots
					11732, // Dragon boots
					};

								public final static int[] buggedBallistaBoots602Female = {
								6328, // Snakeskin boots
								4097, 4107, 4117, // Mystic boots set
								4127, 4129, 4131, // Mith/Adamant/Rune boots
								6920, // Infinity boots
								11732, // Dragon boots
								9073, // Moonclan boots
								};

																public final static int[] buggedBallistaBoots525Female = {
																	6328, // Snakeskin boots
																	4127, 4129, 4131, // Mith/Adamant/Rune boots
																	9073, // Moonclan boots
																	4097, 4107, 4117, // Mystic boots set
																	};
																//@formatter:on.

																																public final static int[] buggedBallistaBoots602Male = {
																																4127, 4129, 4131, // Mith/Adamant/Rune boots
																																1061, // Leather boots
																																3105, //Climbing boots
																																6920, // Infinity boots
																																11732, // Dragon boots
																																};

}