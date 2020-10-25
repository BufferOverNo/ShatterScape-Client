/**
 * Custom items.
 * 
 * @author MGT Madness, created on 21-03-2015.
 */
public class CustomItem
{


		//56917 is the highest model id used by the client.
		// 65k+ seems to be the max model packable.
		// Start from 64k.
		// start from 64093 is used by callisto, 64130 and 64131 used by Venenatis
		// 64126 is used by Completionist cape stand.
		public static void applyCustomItems(ItemDefinition itemDefinition, int itemId)
		{
				boolean debug = false;
				if (itemId == 7462 && debug)
				{
						Utility.print("Name: " + itemDefinition.name);
						Utility.print("Female model: " + itemDefinition.femaleModel);
						Utility.print("Male model: " + itemDefinition.maleModel);
						Utility.print("Inventory model: " + itemDefinition.inventoryModel);
				}

				bloodMoney(itemDefinition, itemId);

				if (itemId >= 14876 && itemId <= 14892)
				{
						itemDefinition.inventoryOptions = new String[] {"Break", null, null, null, "Drop"};
						return;
				}

				switch (itemId)
				{
						case 18849:
								itemDefinition.modelColourToEdit = new int[] {5563};
								itemDefinition.newModelColourProduced = new int[] {5351};
								itemDefinition.name = "Arcane prayer scroll";
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = "Read";
								itemDefinition.inventoryOptions[1] = null;
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								itemDefinition.inventoryOptions[4] = null;
								itemDefinition.inventoryModel = 64816;
								itemDefinition.maleModel = -1;
								itemDefinition.femaleModel = -1;
								itemDefinition.inventoryModelZoom = 1032;
								itemDefinition.inventory3dRotationX = 1454;
								itemDefinition.inventory3dRotationY = 364;
								itemDefinition.inventoryX = -3;
								itemDefinition.inventoryY = 0;
								break;
						case 18848:
								itemDefinition.name = "Dexterous prayer scroll";
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = "Read";
								itemDefinition.inventoryOptions[1] = null;
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								itemDefinition.inventoryOptions[4] = null;
								itemDefinition.inventoryModel = 64816;
								itemDefinition.maleModel = -1;
								itemDefinition.femaleModel = -1;
								itemDefinition.inventoryModelZoom = 1032;
								itemDefinition.inventory3dRotationX = 1454;
								itemDefinition.inventory3dRotationY = 364;
								itemDefinition.inventoryX = -3;
								itemDefinition.inventoryY = 0;
								break;

						case 3016:
						case 3018:
						case 3020:
						case 3022:
								itemDefinition.name = itemDefinition.name.replace("Super energy", "Stamina");
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.newModelColourProduced[0] = 5679;
								break;
						case 14484:
								if (Client.clientRevision("474"))
								{
										itemDefinition.maleModel = 64794;
										itemDefinition.femaleModel = 64794;
								}
								break;
						case 18846:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;

						case 18845:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Odium ward";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 908;
								itemDefinition.newModelColourProduced[0] = 15252;
								itemDefinition.inventoryModel = 9354;
								itemDefinition.inventoryModelZoom = 1200;
								itemDefinition.inventory3dRotationY = 568;
								itemDefinition.inventory3dRotationX = 1836;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 3;
								itemDefinition.maleModel = 9347;
								itemDefinition.femaleModel = 9347;
								break;
						case 18844:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18843:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Malediction ward";
								itemDefinition.description = "Its an Malediction ward";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 908;
								itemDefinition.newModelColourProduced[0] = 43928;
								itemDefinition.inventoryModel = 9354;
								itemDefinition.inventoryModelZoom = 1200;
								itemDefinition.inventory3dRotationY = 568;
								itemDefinition.inventory3dRotationX = 1836;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 3;
								itemDefinition.maleModel = 9347;
								itemDefinition.femaleModel = 9347;
								break;

						case 4067:
								itemDefinition.name = "Vote ticket";
								break;
						case 18842:
								ItemDefinition originalCoin = ItemDefinition.forId(1004);
								itemDefinition.stackIds = originalCoin.stackIds;
								itemDefinition.stackAmounts = originalCoin.stackAmounts;
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								break;
						case 18841:
								ItemDefinition coin5 = ItemDefinition.forId(1004);
								itemDefinition.groundOptions = coin5.groundOptions;
								itemDefinition.name = "Blood money 1500";
								itemDefinition.description = "It's Blood money";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 8128;
								itemDefinition.newModelColourProduced[0] = 947;
								itemDefinition.inventoryModel = coin5.inventoryModel;
								itemDefinition.inventory3dRotationX = coin5.inventory3dRotationX;
								itemDefinition.inventory3dRotationY = coin5.inventory3dRotationY;
								itemDefinition.inventoryModelZoom = coin5.inventoryModelZoom;
								itemDefinition.inventoryX = coin5.inventoryX;
								itemDefinition.inventoryY = coin5.inventoryY;
								ItemDefinition originalCoin6 = ItemDefinition.forId(1004);
								itemDefinition.stackIds = originalCoin6.stackIds;
								itemDefinition.stackAmounts = originalCoin6.stackAmounts;
								itemDefinition.stackable = true;
								break;
						case 18840:
								ItemDefinition coin4 = ItemDefinition.forId(1004);
								itemDefinition.groundOptions = coin4.groundOptions;
								itemDefinition.name = "Blood money 7k";
								itemDefinition.description = "It's Blood money";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 8128;
								itemDefinition.newModelColourProduced[0] = 947;
								itemDefinition.inventoryModel = coin4.inventoryModel;
								itemDefinition.inventory3dRotationX = coin4.inventory3dRotationX;
								itemDefinition.inventory3dRotationY = coin4.inventory3dRotationY;
								itemDefinition.inventoryModelZoom = coin4.inventoryModelZoom;
								itemDefinition.inventoryX = coin4.inventoryX;
								itemDefinition.inventoryY = coin4.inventoryY;
								ItemDefinition originalCoin2 = ItemDefinition.forId(1004);
								itemDefinition.stackIds = originalCoin2.stackIds;
								itemDefinition.stackAmounts = originalCoin2.stackAmounts;
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								break;
						case 18839:
								coin4 = ItemDefinition.forId(1004);
								itemDefinition.groundOptions = coin4.groundOptions;
								itemDefinition.name = "Blood money 7k";
								itemDefinition.description = "It's Blood money";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 8128;
								itemDefinition.newModelColourProduced[0] = 947;
								itemDefinition.inventoryModel = coin4.inventoryModel;
								itemDefinition.inventory3dRotationX = coin4.inventory3dRotationX;
								itemDefinition.inventory3dRotationY = coin4.inventory3dRotationY;
								itemDefinition.inventoryModelZoom = coin4.inventoryModelZoom;
								itemDefinition.inventoryX = coin4.inventoryX;
								itemDefinition.inventoryY = coin4.inventoryY;
								originalCoin2 = ItemDefinition.forId(1004);
								itemDefinition.stackIds = originalCoin2.stackIds;
								itemDefinition.stackAmounts = originalCoin2.stackAmounts;
								itemDefinition.stackable = true;
								break;

						case 3105:
						case 3106:
								itemDefinition.name = "Climbing boots";
								break;

						case 18826:
								itemDefinition.name = "Elder maul";
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = null;
								itemDefinition.inventoryOptions[1] = "Wield";
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								itemDefinition.inventoryOptions[4] = null;
								itemDefinition.modelColourToEdit = new int[3];
								itemDefinition.newModelColourProduced = new int[3];
								itemDefinition.modelColourToEdit[0] = 60370;
								itemDefinition.newModelColourProduced[0] = 60370;
								itemDefinition.modelColourToEdit[1] = 58322;
								itemDefinition.newModelColourProduced[1] = 58322;
								itemDefinition.modelColourToEdit[2] = 61394;
								itemDefinition.newModelColourProduced[2] = 61394;
								itemDefinition.inventoryModel = 64791;
								itemDefinition.maleModel = 64771;
								itemDefinition.femaleModel = 64771;
								itemDefinition.inventoryModelZoom = 1744;
								itemDefinition.inventory3dRotationX = 429;
								itemDefinition.inventory3dRotationY = 237;
								itemDefinition.inventoryX = -3;
								itemDefinition.inventoryY = -58;
								break;
						case 18827:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18828:
								itemDefinition.name = "Dragon thrownaxe";
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = null;
								itemDefinition.inventoryOptions[1] = "Wield";
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								itemDefinition.inventoryOptions[4] = null;
								itemDefinition.inventoryModel = 64773;
								itemDefinition.maleModel = 64774;
								itemDefinition.femaleModel = 64775;
								itemDefinition.inventoryModelZoom = 912;
								itemDefinition.inventory3dRotationX = 1799;
								itemDefinition.inventory3dRotationY = 525;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 8;
								break;
						case 18830:
								itemDefinition.name = "Twisted bow";
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = null;
								itemDefinition.inventoryOptions[1] = "Wield";
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								itemDefinition.inventoryOptions[4] = null;
								itemDefinition.inventoryModel = 64776;
								itemDefinition.maleModel = 64777;
								itemDefinition.femaleModel = 64778;
								itemDefinition.inventoryModelZoom = 2000;
								itemDefinition.inventory3dRotationX = 1500;
								itemDefinition.inventory3dRotationY = 720;
								itemDefinition.inventoryX = -3;
								itemDefinition.inventoryY = 1;
								break;
						case 18831:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18832:
								itemDefinition.name = "Twisted buckler";
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = null;
								itemDefinition.inventoryOptions[1] = "Wear";
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								itemDefinition.inventoryOptions[4] = null;
								itemDefinition.inventoryModel = 64779;
								itemDefinition.maleModel = 64780;
								itemDefinition.femaleModel = 64781;
								itemDefinition.inventoryModelZoom = 792;
								itemDefinition.inventory3dRotationX = 525;
								itemDefinition.inventory3dRotationY = 494;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventoryY = 1;
								break;
						case 18833:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18834:
								itemDefinition.name = "Dragon sword";
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = null;
								itemDefinition.inventoryOptions[1] = "Wield";
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								itemDefinition.inventoryOptions[4] = null;
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 36133;
								itemDefinition.newModelColourProduced[0] = 36133;
								itemDefinition.inventoryModel = 64782;
								itemDefinition.maleModel = 64783;
								itemDefinition.femaleModel = 64784;
								itemDefinition.inventoryModelZoom = 1168;
								itemDefinition.inventory3dRotationX = 478;
								itemDefinition.inventory3dRotationY = 691;
								itemDefinition.inventoryX = 3;
								itemDefinition.inventoryY = 1;
								break;
						case 18835:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18836:
								itemDefinition.name = "Dragon hunter crossbow";
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = null;
								itemDefinition.inventoryOptions[1] = "Wield";
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								itemDefinition.inventoryOptions[4] = null;
								itemDefinition.inventoryModel = 64785;
								itemDefinition.maleModel = 64786;
								itemDefinition.femaleModel = 64787;
								itemDefinition.inventoryModelZoom = 926;
								itemDefinition.inventory3dRotationX = 258;
								itemDefinition.inventory3dRotationY = 432;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 9;
								break;
						case 18837:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18838:
								itemDefinition.name = "Black chinchompa";
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = null;
								itemDefinition.inventoryOptions[1] = "Wield";
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								itemDefinition.inventoryOptions[4] = "Release";
								itemDefinition.modelColourToEdit = new int[6];
								itemDefinition.newModelColourProduced = new int[6];
								itemDefinition.modelColourToEdit[0] = 20;
								itemDefinition.newModelColourProduced[0] = 20;
								itemDefinition.modelColourToEdit[1] = 33;
								itemDefinition.newModelColourProduced[1] = 33;
								itemDefinition.modelColourToEdit[2] = 12;
								itemDefinition.newModelColourProduced[2] = 12;
								itemDefinition.modelColourToEdit[3] = 37;
								itemDefinition.newModelColourProduced[3] = 37;
								itemDefinition.modelColourToEdit[4] = 45;
								itemDefinition.newModelColourProduced[4] = 45;
								itemDefinition.modelColourToEdit[5] = 49;
								itemDefinition.newModelColourProduced[5] = 49;
								itemDefinition.inventoryModel = 64788;
								itemDefinition.maleModel = 64789;
								itemDefinition.femaleModel = 64790;
								itemDefinition.inventoryModelZoom = 1000;
								itemDefinition.inventory3dRotationX = 1800;
								itemDefinition.inventory3dRotationY = 284;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventoryY = 27;
								break;


						case 18825:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.name = "Blood key";
								itemDefinition.inventoryModel = 64770;
								itemDefinition.inventoryModelZoom = 842;
								itemDefinition.inventory3dRotationY = 619;
								itemDefinition.inventory3dRotationX = 1858;
								itemDefinition.inventoryX = -2;
								itemDefinition.inventoryY = 1;
								itemDefinition.maleModel = -1;
								itemDefinition.femaleModel = -1;
								break;

						case 18823:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.name = "Lava scale";
								itemDefinition.inventoryModel = 8797;
								itemDefinition.inventoryModelZoom = 1370;
								itemDefinition.inventory3dRotationY = 212;
								itemDefinition.inventory3dRotationX = 148;
								itemDefinition.inventoryX = 7;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = -1;
								itemDefinition.femaleModel = -1;
								break;

						case 18824:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;

						case 18821:
								itemDefinition.inventoryOptions = new String[] {"Bury", null, null, null, null};
								itemDefinition.name = "Lava dragon bones";
								itemDefinition.inventoryModel = 64769;
								itemDefinition.inventoryModelZoom = 1830;
								itemDefinition.inventory3dRotationY = 216;
								itemDefinition.inventory3dRotationX = 648;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = -1;
								itemDefinition.femaleModel = -1;
								break;

						case 18822:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;

						case 18820:
								itemDefinition.inventoryOptions = new String[] {"Open", null, null, "Empty", "Destroy"};
								itemDefinition.inventoryModel = 5453;
								itemDefinition.name = "Rune pouch";
								itemDefinition.inventory3dRotationY = 512;
								itemDefinition.inventory3dRotationX = 475;
								itemDefinition.inventoryModelZoom = 350;
								itemDefinition.inventoryX = -5;
								itemDefinition.inventoryY = 0;
								break;
						case 3040:
						case 3042:
						case 3044:
						case 3046:

								itemDefinition.modelColourToEdit = new int[] {61};
								itemDefinition.newModelColourProduced = new int[] {2524};
								break;

						case 18763:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Amulet of the damned (full)";
								itemDefinition.description = "Its an Amulet of the damned (full)";
								itemDefinition.inventoryModel = 64702;
								itemDefinition.inventoryModelZoom = 480;
								itemDefinition.inventory3dRotationY = 512;
								itemDefinition.inventory3dRotationX = 108;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 2;
								itemDefinition.maleModel = 64703;
								itemDefinition.femaleModel = 64704;
								break;
						case 18764:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18765:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Occult necklace";
								itemDefinition.description = "Its an Occult necklace";
								itemDefinition.inventoryModel = 64705;
								itemDefinition.inventoryModelZoom = 589;
								itemDefinition.inventory3dRotationY = 431;
								itemDefinition.inventory3dRotationX = 81;
								itemDefinition.inventoryX = 3;
								itemDefinition.inventoryY = 21;
								itemDefinition.maleModel = 64706;
								itemDefinition.femaleModel = 64707;
								break;
						case 18766:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18767:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Abyssal tentacle";
								itemDefinition.description = "Its an Abyssal tentacle";
								itemDefinition.inventoryModel = 64708;
								itemDefinition.inventoryModelZoom = 840;
								itemDefinition.inventory3dRotationY = 280;
								itemDefinition.inventory3dRotationX = 121;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 56;
								itemDefinition.maleModel = 64709;
								itemDefinition.femaleModel = 64710;
								break;
						case 18768:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18769:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Trident of the swamp";
								itemDefinition.description = "Its an Trident of the swamp";
								itemDefinition.inventoryModel = 64711;
								itemDefinition.inventoryModelZoom = 2421;
								itemDefinition.inventory3dRotationY = 1549;
								itemDefinition.inventory3dRotationX = 1818;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 9;
								itemDefinition.maleModel = 64712;
								itemDefinition.femaleModel = 64713;
								break;
						case 18770:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18771:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Dragon warhammer";
								itemDefinition.description = "Its an Dragon warhammer";
								itemDefinition.inventoryModel = 64714;
								itemDefinition.inventoryModelZoom = 1600;
								itemDefinition.inventory3dRotationY = 1510;
								itemDefinition.inventory3dRotationX = 1785;
								itemDefinition.inventoryX = 9;
								itemDefinition.inventoryY = -4;
								itemDefinition.maleModel = 64715;
								itemDefinition.femaleModel = 64716;
								break;
						case 18772:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18773:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Tanzanite helm";
								itemDefinition.description = "Its an Tanzanite helm";
								itemDefinition.inventoryModel = 64717;
								itemDefinition.inventoryModelZoom = 700;
								itemDefinition.inventory3dRotationY = 215;
								itemDefinition.inventory3dRotationX = 1724;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -17;
								itemDefinition.maleModel = 64718;
								itemDefinition.femaleModel = 64719;
								break;
						case 18775:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Magma helm";
								itemDefinition.description = "Its an Magma helm";
								itemDefinition.inventoryModel = 64720;
								itemDefinition.inventoryModelZoom = 700;
								itemDefinition.inventory3dRotationY = 215;
								itemDefinition.inventory3dRotationX = 1724;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -17;
								itemDefinition.maleModel = 64721;
								itemDefinition.femaleModel = 64722;
								break;
						case 18777:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Serpentine helm";
								itemDefinition.description = "Its an Serpentine helm";
								itemDefinition.inventoryModel = 64723;
								itemDefinition.inventoryModelZoom = 700;
								itemDefinition.inventory3dRotationY = 215;
								itemDefinition.inventory3dRotationX = 1724;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -17;
								itemDefinition.maleModel = 64724;
								itemDefinition.femaleModel = 64725;
								break;
						case 18778:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18779:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", "Check", "Unload", null};
								itemDefinition.name = "Toxic blowpipe";
								itemDefinition.description = "Its an Toxic blowpipe";
								itemDefinition.inventoryModel = 64726;
								itemDefinition.inventoryModelZoom = 1158;
								itemDefinition.inventory3dRotationY = 768;
								itemDefinition.inventory3dRotationX = 189;
								itemDefinition.inventoryX = -7;
								itemDefinition.inventoryY = 4;
								itemDefinition.maleModel = 64727;
								itemDefinition.femaleModel = 64728;
								break;
						case 18780:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18781:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Staff of the dead";
								itemDefinition.description = "Its an Staff of the dead";
								itemDefinition.modelColourToEdit = new int[4];
								itemDefinition.newModelColourProduced = new int[4];
								itemDefinition.modelColourToEdit[0] = 17467;
								itemDefinition.modelColourToEdit[1] = 43117;
								itemDefinition.modelColourToEdit[2] = 7073;
								itemDefinition.modelColourToEdit[3] = 61;
								itemDefinition.newModelColourProduced[0] = 18626;
								itemDefinition.newModelColourProduced[1] = 18626;
								itemDefinition.newModelColourProduced[2] = 18626;
								itemDefinition.newModelColourProduced[3] = 18626;
								itemDefinition.inventoryModel = 64729;
								itemDefinition.inventoryModelZoom = 1490;
								itemDefinition.inventory3dRotationY = 138;
								itemDefinition.inventory3dRotationX = 1300;
								itemDefinition.inventoryX = -5;
								itemDefinition.inventoryY = 2;
								itemDefinition.maleModel = 64730;
								itemDefinition.femaleModel = 64731;
								break;
						case 18782:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18783:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Toxic staff of the dead";
								itemDefinition.description = "Its an Toxic staff of the dead";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 17467;
								itemDefinition.newModelColourProduced[0] = 21947;
								itemDefinition.inventoryModel = 64732;
								itemDefinition.inventoryModelZoom = 2150;
								itemDefinition.inventory3dRotationY = 512;
								itemDefinition.inventory3dRotationX = 1010;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 64733;
								itemDefinition.femaleModel = 64734;
								break;
						case 18784:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18785:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Abyssal dagger (p++)";
								itemDefinition.inventoryModel = 64735;
								itemDefinition.inventoryModelZoom = 1347;
								itemDefinition.inventory3dRotationY = 1589;
								itemDefinition.inventory3dRotationX = 781;
								itemDefinition.inventoryX = -5;
								itemDefinition.inventoryY = 3;
								itemDefinition.maleModel = 64736;
								itemDefinition.femaleModel = 64736;
								break;
						case 18786:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18787:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Abyssal bludgeon";
								itemDefinition.description = "Its an Abyssal bludgeon";
								itemDefinition.inventoryModel = 64738;
								itemDefinition.inventoryModelZoom = 2611;
								itemDefinition.inventory3dRotationY = 1508;
								itemDefinition.inventory3dRotationX = 552;
								itemDefinition.inventoryX = -17;
								itemDefinition.inventoryY = 3;
								itemDefinition.maleModel = 64739;
								itemDefinition.femaleModel = 64740;
								break;
						case 18788:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18789:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", "Preach", null, null};
								itemDefinition.name = "Book of law";
								itemDefinition.description = "Its an Book of law";
								itemDefinition.modelColourToEdit = new int[3];
								itemDefinition.newModelColourProduced = new int[3];
								itemDefinition.modelColourToEdit[0] = 5018;
								itemDefinition.modelColourToEdit[1] = 61;
								itemDefinition.modelColourToEdit[2] = 10351;
								itemDefinition.newModelColourProduced[0] = 43096;
								itemDefinition.newModelColourProduced[1] = 11177;
								itemDefinition.newModelColourProduced[2] = 61;
								itemDefinition.inventoryModel = 64741;
								itemDefinition.inventoryModelZoom = 830;
								itemDefinition.inventory3dRotationY = 244;
								itemDefinition.inventory3dRotationX = 116;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventoryY = -21;
								itemDefinition.maleModel = 64742;
								itemDefinition.femaleModel = 64743;
								break;


						case 18790:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", "Preach", null, null};
								itemDefinition.name = "Book of darkness";
								itemDefinition.description = "Its a Book of darkness";
								itemDefinition.modelColourToEdit = new int[] {5018, 61, 10351};
								itemDefinition.newModelColourProduced = new int[] {-16870, 11177, 61};
								itemDefinition.inventoryModel = 64741;
								itemDefinition.inventoryModelZoom = 830;
								itemDefinition.inventory3dRotationY = 244;
								itemDefinition.inventory3dRotationX = 116;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventoryY = -21;
								itemDefinition.maleModel = 64742;
								itemDefinition.femaleModel = 64743;
								break;
						case 18791:
								itemDefinition.inventoryOptions = new String[] {"Drink", null, null, "Empty", null};
								itemDefinition.name = "Stamina potion(4)";
								itemDefinition.description = "Its an Stamina potion(4)";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.newModelColourProduced[0] = 5679;
								itemDefinition.inventoryModel = 64744;
								itemDefinition.inventoryModelZoom = 550;
								itemDefinition.inventory3dRotationY = 84;
								itemDefinition.inventory3dRotationX = 1996;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -1;
								break;
						case 18792:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18793:
								itemDefinition.inventoryOptions = new String[] {"Drink", null, null, "Empty", null};
								itemDefinition.name = "Stamina potion(3)";
								itemDefinition.description = "Its an Stamina potion(3)";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.newModelColourProduced[0] = 5679;
								itemDefinition.inventoryModel = 64745;
								itemDefinition.inventoryModelZoom = 550;
								itemDefinition.inventory3dRotationY = 84;
								itemDefinition.inventory3dRotationX = 1996;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -1;
								break;
						case 18794:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18795:
								itemDefinition.inventoryOptions = new String[] {"Drink", null, null, "Empty", null};
								itemDefinition.name = "Stamina potion(2)";
								itemDefinition.description = "Its an Stamina potion(2)";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.newModelColourProduced[0] = 5679;
								itemDefinition.inventoryModel = 64746;
								itemDefinition.inventoryModelZoom = 550;
								itemDefinition.inventory3dRotationY = 84;
								itemDefinition.inventory3dRotationX = 1996;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -1;
								break;
						case 18796:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18797:
								itemDefinition.inventoryOptions = new String[] {"Drink", null, null, "Empty", null};
								itemDefinition.name = "Stamina potion(1)";
								itemDefinition.description = "Its an Stamina potion(1)";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.newModelColourProduced[0] = 5679;
								itemDefinition.inventoryModel = 64747;
								itemDefinition.inventoryModelZoom = 550;
								itemDefinition.inventory3dRotationY = 84;
								itemDefinition.inventory3dRotationX = 1996;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -1;
								break;
						case 18798:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18799:
								itemDefinition.inventoryOptions = new String[] {"Drink", null, null, "Empty", null};
								itemDefinition.name = "Super combat potion(4)";
								itemDefinition.description = "Its an Super combat potion(4)";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.newModelColourProduced[0] = 21396;
								itemDefinition.inventoryModel = 64744;
								itemDefinition.inventoryModelZoom = 550;
								itemDefinition.inventory3dRotationY = 84;
								itemDefinition.inventory3dRotationX = 1996;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -1;
								break;
						case 18800:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18801:
								itemDefinition.inventoryOptions = new String[] {"Drink", null, null, "Empty", null};
								itemDefinition.name = "Super combat potion(3)";
								itemDefinition.description = "Its an Super combat potion(3)";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.newModelColourProduced[0] = 21396;
								itemDefinition.inventoryModel = 64745;
								itemDefinition.inventoryModelZoom = 550;
								itemDefinition.inventory3dRotationY = 84;
								itemDefinition.inventory3dRotationX = 1996;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -1;
								break;
						case 18802:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18803:
								itemDefinition.inventoryOptions = new String[] {"Drink", null, null, "Empty", null};
								itemDefinition.name = "Super combat potion(2)";
								itemDefinition.description = "Its an Super combat potion(2)";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.newModelColourProduced[0] = 21396;
								itemDefinition.inventoryModel = 64746;
								itemDefinition.inventoryModelZoom = 550;
								itemDefinition.inventory3dRotationY = 84;
								itemDefinition.inventory3dRotationX = 1996;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -1;
								break;
						case 18804:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18805:
								itemDefinition.inventoryOptions = new String[] {"Drink", null, null, "Empty", null};
								itemDefinition.name = "Super combat potion(1)";
								itemDefinition.description = "Its an Super combat potion(1)";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.newModelColourProduced[0] = 21396;
								itemDefinition.inventoryModel = 64747;
								itemDefinition.inventoryModelZoom = 550;
								itemDefinition.inventory3dRotationY = 84;
								itemDefinition.inventory3dRotationX = 1996;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -1;
								break;
						case 18806:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18807:
								itemDefinition.femaleModel = 64748;
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.inventoryModel = 64760;
								itemDefinition.maleModel = 64749;
								itemDefinition.name = "Heavy ballista";
								itemDefinition.inventory3dRotationY = 189;
								itemDefinition.inventoryX = 8;
								itemDefinition.inventory3dRotationX = 148;
								itemDefinition.inventoryY = -18;
								itemDefinition.inventoryModelZoom = 1284;
								break;
						case 18808:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18809:
								itemDefinition.femaleModel = 64750;
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.inventoryModel = 64751;
								itemDefinition.maleModel = 64752;
								itemDefinition.name = "Amulet of torture";
								itemDefinition.inventory3dRotationY = 424;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventory3dRotationX = 68;
								itemDefinition.inventoryY = 16;
								itemDefinition.inventoryModelZoom = 620;
								break;
						case 18810:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18811:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", "Uncharge", null, null};
								itemDefinition.inventoryModel = 64753;
								itemDefinition.name = "Ring of suffering";
								itemDefinition.inventory3dRotationY = 268;
								itemDefinition.inventoryX = 3;
								itemDefinition.inventory3dRotationX = 180;
								itemDefinition.inventoryY = -35;
								itemDefinition.inventoryModelZoom = 830;
								break;
						case 18812:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18813:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.inventoryModel = 64753;
								itemDefinition.name = "Ring of suffering (i)";
								itemDefinition.inventory3dRotationY = 268;
								itemDefinition.inventoryX = 3;
								itemDefinition.inventory3dRotationX = 180;
								itemDefinition.inventoryY = -35;
								itemDefinition.inventoryModelZoom = 830;
								itemDefinition.modelColourToEdit = new int[] {3008, 5056};
								itemDefinition.newModelColourProduced = new int[] {6088, 6104};
								break;
						case 18814:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.inventoryModel = 64753;
								itemDefinition.name = "Ring of suffering (ri)";
								itemDefinition.inventory3dRotationY = 268;
								itemDefinition.inventoryX = 3;
								itemDefinition.inventory3dRotationX = 180;
								itemDefinition.inventoryY = -35;
								itemDefinition.inventoryModelZoom = 830;
								itemDefinition.modelColourToEdit = new int[] {3008, 5056};
								itemDefinition.newModelColourProduced = new int[] {6088, 6104};
								break;
						case 18815:
								itemDefinition.femaleModel = 64754;
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.inventoryModel = 64755;
								itemDefinition.maleModel = 64756;
								itemDefinition.name = "Necklace of anguish";
								itemDefinition.inventory3dRotationY = 332;
								itemDefinition.inventory3dRotationX = 2020;
								itemDefinition.inventoryY = -16;
								itemDefinition.inventoryModelZoom = 1020;
								break;
						case 18816:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18817:
								itemDefinition.femaleModel = 64757;
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.inventoryModel = 64758;
								itemDefinition.maleModel = 64759;
								itemDefinition.name = "Tormented bracelet";
								itemDefinition.inventory3dRotationY = 184;
								itemDefinition.inventory3dRotationX = 1909;
								itemDefinition.inventoryY = -7;
								itemDefinition.inventoryModelZoom = 659;
								break;
						case 18818:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;

						case 18819:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.inventoryModel = 64761;
								itemDefinition.name = "Dragon javelin";
								itemDefinition.inventory3dRotationY = 268;
								itemDefinition.inventoryX = -2;
								itemDefinition.inventory3dRotationX = 1964;
								itemDefinition.inventoryY = 63;
								itemDefinition.inventoryModelZoom = 1470;
								break;

						case 18762:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.name = "Hellpuppy";
								itemDefinition.description = "Its a Hellpuppy.";
								itemDefinition.inventoryModel = 64631;
								itemDefinition.inventoryModelZoom = 1616;
								itemDefinition.inventory3dRotationY = 3;
								itemDefinition.inventory3dRotationX = 213;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = -1;
								itemDefinition.femaleModel = -1;
								break;
						case 18744:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18743:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.name = "Eternal crystal";
								itemDefinition.description = "Its an Eternal crystal";
								itemDefinition.inventoryModel = 64607;
								itemDefinition.inventoryModelZoom = 740;
								itemDefinition.inventory3dRotationY = 429;
								itemDefinition.inventory3dRotationX = 225;
								itemDefinition.inventoryX = 5;
								itemDefinition.inventoryY = 5;
								break;
						case 18746:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18745:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.name = "Pegasian crystal";
								itemDefinition.description = "Its an Pegasian crystal";
								itemDefinition.inventoryModel = 64608;
								itemDefinition.inventoryModelZoom = 740;
								itemDefinition.inventory3dRotationY = 429;
								itemDefinition.inventory3dRotationX = 225;
								itemDefinition.inventoryX = 5;
								itemDefinition.inventoryY = 5;
								break;
						case 18748:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18747:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.name = "Primordial crystal";
								itemDefinition.description = "Its an Primordial crystal";
								itemDefinition.inventoryModel = 64609;
								itemDefinition.inventoryModelZoom = 740;
								itemDefinition.inventory3dRotationY = 429;
								itemDefinition.inventory3dRotationX = 225;
								itemDefinition.inventoryX = 5;
								itemDefinition.inventoryY = 5;
								break;
						case 18750:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18749:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.name = "Smouldering stone";
								itemDefinition.description = "Its an Smouldering stone";
								itemDefinition.inventoryModel = 64610;
								itemDefinition.inventoryModelZoom = 653;
								itemDefinition.inventory3dRotationY = 229;
								itemDefinition.inventory3dRotationX = 1818;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -8;
								itemDefinition.maleModel = 64611;
								itemDefinition.femaleModel = 64612;
								break;
						case 18752:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18751:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Eternal boots";
								itemDefinition.description = "Its an Eternal boots";
								itemDefinition.inventoryModel = 64613;
								itemDefinition.inventoryModelZoom = 976;
								itemDefinition.inventory3dRotationY = 147;
								itemDefinition.inventory3dRotationX = 279;
								itemDefinition.inventoryX = 5;
								itemDefinition.inventoryY = -5;
								itemDefinition.maleModel = 64614;
								itemDefinition.femaleModel = 64615;
								break;
						case 18754:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18753:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Pegasian boots";
								itemDefinition.description = "Its an Pegasian boots";
								itemDefinition.inventoryModel = 64616;
								itemDefinition.inventoryModelZoom = 976;
								itemDefinition.inventory3dRotationY = 147;
								itemDefinition.inventory3dRotationX = 279;
								itemDefinition.inventoryX = 5;
								itemDefinition.inventoryY = -5;
								itemDefinition.maleModel = 64617;
								itemDefinition.femaleModel = 64618;
								break;
						case 18756:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18755:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Primordial boots";
								itemDefinition.description = "Its an Primordial boots";
								itemDefinition.inventoryModel = 64619;
								itemDefinition.inventoryModelZoom = 976;
								itemDefinition.inventory3dRotationY = 147;
								itemDefinition.inventory3dRotationX = 279;
								itemDefinition.inventoryX = 5;
								itemDefinition.inventoryY = -5;
								itemDefinition.maleModel = 64620;
								itemDefinition.femaleModel = 64621;
								break;
						case 18757:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Infernal axe";
								itemDefinition.description = "Its an Infernal axe";
								itemDefinition.inventoryModel = 64622;
								itemDefinition.inventoryModelZoom = 1663;
								itemDefinition.inventory3dRotationY = 512;
								itemDefinition.inventory3dRotationX = 1212;
								itemDefinition.inventoryX = 7;
								itemDefinition.inventoryY = 16;
								itemDefinition.maleModel = 64623;
								itemDefinition.femaleModel = 64624;
								break;
						case 18758:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Infernal pickaxe";
								itemDefinition.description = "Its an Infernal pickaxe";
								itemDefinition.inventoryModel = 64625;
								itemDefinition.inventoryModelZoom = 1221;
								itemDefinition.inventory3dRotationY = 1683;
								itemDefinition.inventory3dRotationX = 1885;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = -9;
								itemDefinition.maleModel = 64626;
								itemDefinition.femaleModel = 64627;
								break;

						case 405:
								itemDefinition.name = "1m coins casket";
								itemDefinition.inventoryOptions = new String[] {"Open", null, null, null, "Drop"};
								break;
						case 3849:
								itemDefinition.name = "Community event casket";
								itemDefinition.inventoryOptions = new String[] {"Open", null, null, null, "Drop"};
								break;
						case 18736:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18735:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "White unicorn mask";
								itemDefinition.inventoryModel = 64164;
								itemDefinition.inventoryModelZoom = 1104;
								itemDefinition.inventory3dRotationX = 1571;
								itemDefinition.inventory3dRotationY = 568;
								itemDefinition.inventoryX = -5;
								itemDefinition.inventoryY = -1;
								itemDefinition.maleModel = 64159;
								itemDefinition.femaleModel = 64160;
								break;
						case 18734:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18733:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Green dragon mask";
								itemDefinition.inventoryModel = 64154;
								itemDefinition.inventoryModelZoom = 905;
								itemDefinition.inventory3dRotationX = 121;
								itemDefinition.inventory3dRotationY = 202;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 22;
								itemDefinition.maleModel = 64137;
								itemDefinition.femaleModel = 64139;
								itemDefinition.modelColourToEdit = new int[3];
								itemDefinition.newModelColourProduced = new int[3];
								itemDefinition.modelColourToEdit[0] = 127;
								itemDefinition.newModelColourProduced[0] = 22049;
								itemDefinition.modelColourToEdit[1] = 38119;
								itemDefinition.newModelColourProduced[1] = 21910;
								itemDefinition.modelColourToEdit[2] = 38315;
								itemDefinition.newModelColourProduced[2] = 25484;
								break;
						case 18732:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18731:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Blue dragon mask";
								itemDefinition.inventoryModel = 64154;
								itemDefinition.inventoryModelZoom = 905;
								itemDefinition.inventory3dRotationX = 121;
								itemDefinition.inventory3dRotationY = 202;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 22;
								itemDefinition.maleModel = 64137;
								itemDefinition.femaleModel = 64139;
								itemDefinition.modelColourToEdit = new int[3];
								itemDefinition.newModelColourProduced = new int[3];
								itemDefinition.modelColourToEdit[0] = 127;
								itemDefinition.newModelColourProduced[0] = 38437;
								itemDefinition.modelColourToEdit[1] = 38119;
								itemDefinition.newModelColourProduced[1] = 38695;
								itemDefinition.modelColourToEdit[2] = 38315;
								itemDefinition.newModelColourProduced[2] = 38691;
								break;
						case 18730:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18729:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Red dragon mask";
								itemDefinition.inventoryModel = 64154;
								itemDefinition.inventoryModelZoom = 905;
								itemDefinition.inventory3dRotationX = 121;
								itemDefinition.inventory3dRotationY = 202;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 22;
								itemDefinition.maleModel = 64137;
								itemDefinition.femaleModel = 64139;
								itemDefinition.modelColourToEdit = new int[3];
								itemDefinition.newModelColourProduced = new int[3];
								itemDefinition.modelColourToEdit[0] = 127;
								itemDefinition.newModelColourProduced[0] = 935;
								itemDefinition.modelColourToEdit[1] = 38119;
								itemDefinition.newModelColourProduced[1] = 941;
								itemDefinition.modelColourToEdit[2] = 38315;
								itemDefinition.newModelColourProduced[2] = 716;
								break;
						case 18728:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18727:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Black dragon mask";
								itemDefinition.inventoryModel = 64154;
								itemDefinition.inventoryModelZoom = 905;
								itemDefinition.inventory3dRotationX = 121;
								itemDefinition.inventory3dRotationY = 202;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 22;
								itemDefinition.maleModel = 64137;
								itemDefinition.femaleModel = 64139;
								itemDefinition.modelColourToEdit = new int[3];
								itemDefinition.newModelColourProduced = new int[3];
								itemDefinition.modelColourToEdit[0] = 127;
								itemDefinition.newModelColourProduced[0] = 1;
								itemDefinition.modelColourToEdit[1] = 38119;
								itemDefinition.newModelColourProduced[1] = 30;
								itemDefinition.modelColourToEdit[2] = 38315;
								itemDefinition.newModelColourProduced[2] = 26;
								break;
						case 18726:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;


						case 18725:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "3rd age cloak";
								itemDefinition.description = "Its a 3rd age cloak.";
								itemDefinition.inventoryModel = 64148;
								itemDefinition.inventoryModelZoom = 2000;
								itemDefinition.inventory3dRotationY = 282;
								itemDefinition.inventory3dRotationX = 962;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 64134;
								itemDefinition.femaleModel = 64142;
								break;
						case 18724:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18723:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "3rd age longsword";
								itemDefinition.description = "Its a 3rd age longsword.";
								itemDefinition.inventoryModel = 64146;
								itemDefinition.inventoryModelZoom = 1726;
								itemDefinition.inventory3dRotationY = 1576;
								itemDefinition.inventory3dRotationX = 242;
								itemDefinition.inventoryX = 5;
								itemDefinition.inventoryY = 4;
								itemDefinition.maleModel = 64144;
								itemDefinition.femaleModel = 64144;
								break;
						case 18722:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18721:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Red beret";
								itemDefinition.description = "Its n Red beret.";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 10659;
								itemDefinition.newModelColourProduced[0] = 65443;
								itemDefinition.inventoryModel = 3373;
								itemDefinition.inventoryModelZoom = 560;
								itemDefinition.inventory3dRotationY = 136;
								itemDefinition.inventory3dRotationX = 1936;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = -4;
								itemDefinition.maleModel = 198;
								itemDefinition.femaleModel = 373;
								break;
						case 18716:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18715:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Holy sandals";
								itemDefinition.description = "Its an Holy sandals";
								itemDefinition.inventoryModel = 64158;
								itemDefinition.inventoryModelZoom = 848;
								itemDefinition.inventory3dRotationY = 363;
								itemDefinition.inventory3dRotationX = 120;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 64156;
								itemDefinition.femaleModel = 64157;
								break;
						case 18714:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18713:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "White headband";
								itemDefinition.description = "Its an White headband";
								itemDefinition.modelColourToEdit = new int[2];
								itemDefinition.newModelColourProduced = new int[2];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.modelColourToEdit[1] = 41;
								itemDefinition.newModelColourProduced[0] = 119;
								itemDefinition.newModelColourProduced[1] = 119;
								itemDefinition.inventoryModel = 3377;
								itemDefinition.inventoryModelZoom = 380;
								itemDefinition.inventory3dRotationY = 108;
								itemDefinition.inventory3dRotationX = 56;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 201;
								itemDefinition.femaleModel = 376;
								break;
						case 18712:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18711:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Blue headband";
								itemDefinition.description = "Its an Blue headband";
								itemDefinition.modelColourToEdit = new int[2];
								itemDefinition.newModelColourProduced = new int[2];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.modelColourToEdit[1] = 41;
								itemDefinition.newModelColourProduced[0] = 40871;
								itemDefinition.newModelColourProduced[1] = 40871;
								itemDefinition.inventoryModel = 3377;
								itemDefinition.inventoryModelZoom = 380;
								itemDefinition.inventory3dRotationY = 108;
								itemDefinition.inventory3dRotationX = 56;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 201;
								itemDefinition.femaleModel = 376;
								break;
						case 18710:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18709:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Gold headband";
								itemDefinition.description = "Its an Gold headband";
								itemDefinition.modelColourToEdit = new int[2];
								itemDefinition.newModelColourProduced = new int[2];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.modelColourToEdit[1] = 41;
								itemDefinition.newModelColourProduced[0] = 10805;
								itemDefinition.newModelColourProduced[1] = 10805;
								itemDefinition.inventoryModel = 3377;
								itemDefinition.inventoryModelZoom = 380;
								itemDefinition.inventory3dRotationY = 108;
								itemDefinition.inventory3dRotationX = 56;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 201;
								itemDefinition.femaleModel = 376;
								break;
						case 18708:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18707:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Pink headband";
								itemDefinition.description = "Its an Pink headband";
								itemDefinition.modelColourToEdit = new int[2];
								itemDefinition.newModelColourProduced = new int[2];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.modelColourToEdit[1] = 41;
								itemDefinition.newModelColourProduced[0] = 58316;
								itemDefinition.newModelColourProduced[1] = 58316;
								itemDefinition.inventoryModel = 3377;
								itemDefinition.inventoryModelZoom = 380;
								itemDefinition.inventory3dRotationY = 108;
								itemDefinition.inventory3dRotationX = 56;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 201;
								itemDefinition.femaleModel = 376;
								break;
						case 18706:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18705:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Green headband";
								itemDefinition.description = "Its an Green headband";
								itemDefinition.modelColourToEdit = new int[2];
								itemDefinition.newModelColourProduced = new int[2];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.modelColourToEdit[1] = 41;
								itemDefinition.newModelColourProduced[0] = 22451;
								itemDefinition.newModelColourProduced[1] = 22451;
								itemDefinition.inventoryModel = 3377;
								itemDefinition.inventoryModelZoom = 380;
								itemDefinition.inventory3dRotationY = 108;
								itemDefinition.inventory3dRotationX = 56;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 201;
								itemDefinition.femaleModel = 376;
								break;
						case 18704:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18703:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "White cavalier";
								itemDefinition.description = "Its an White cavalier";
								itemDefinition.modelColourToEdit = new int[2];
								itemDefinition.newModelColourProduced = new int[2];
								itemDefinition.modelColourToEdit[0] = 7073;
								itemDefinition.modelColourToEdit[1] = 127;
								itemDefinition.newModelColourProduced[0] = 5231;
								itemDefinition.newModelColourProduced[1] = 24;
								itemDefinition.inventoryModel = 2451;
								itemDefinition.inventoryModelZoom = 690;
								itemDefinition.inventory3dRotationY = 160;
								itemDefinition.inventory3dRotationX = 1856;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = -8;
								itemDefinition.maleModel = 186;
								itemDefinition.femaleModel = 362;
								break;
						case 18702:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18701:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Red cavalier";
								itemDefinition.description = "Its an Red cavalier";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 7073;
								itemDefinition.newModelColourProduced[0] = 662;
								itemDefinition.inventoryModel = 2451;
								itemDefinition.inventoryModelZoom = 690;
								itemDefinition.inventory3dRotationY = 160;
								itemDefinition.inventory3dRotationX = 1856;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = -8;
								itemDefinition.maleModel = 186;
								itemDefinition.femaleModel = 362;
								break;
						case 18700:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18699:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Navy cavalier";
								itemDefinition.description = "Its an Navy cavalier";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 7073;
								itemDefinition.newModelColourProduced[0] = 41633;
								itemDefinition.inventoryModel = 2451;
								itemDefinition.inventoryModelZoom = 690;
								itemDefinition.inventory3dRotationY = 160;
								itemDefinition.inventory3dRotationX = 1856;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = -8;
								itemDefinition.maleModel = 186;
								itemDefinition.femaleModel = 362;
								break;
						case 18698:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18697:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Gilded boots";
								itemDefinition.description = "Its an Gilded boots";
								itemDefinition.modelColourToEdit = new int[2];
								itemDefinition.newModelColourProduced = new int[2];
								itemDefinition.modelColourToEdit[0] = 61;
								itemDefinition.modelColourToEdit[1] = 5400;
								itemDefinition.newModelColourProduced[0] = 7114;
								itemDefinition.newModelColourProduced[1] = 7104;
								itemDefinition.inventoryModel = 5037;
								itemDefinition.inventoryModelZoom = 770;
								itemDefinition.inventory3dRotationY = 164;
								itemDefinition.inventory3dRotationX = 156;
								itemDefinition.inventoryX = 3;
								itemDefinition.inventoryY = -3;
								itemDefinition.maleModel = 4954;
								itemDefinition.femaleModel = 5031;
								break;
						case 18696:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18695:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Explorer backpack";
								itemDefinition.description = "Its an Explorer backpack";
								itemDefinition.inventoryModel = 64147;
								itemDefinition.inventoryModelZoom = 1040;
								itemDefinition.inventory3dRotationY = 454;
								itemDefinition.inventory3dRotationX = 1283;
								itemDefinition.inventoryX = -4;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 64135;
								itemDefinition.femaleModel = 64135;
								break;
						case 18694:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18693:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Dragon cane";
								itemDefinition.description = "Its an Dragon cane";
								itemDefinition.inventoryModel = 64151;
								itemDefinition.inventoryModelZoom = 3280;
								itemDefinition.inventory3dRotationY = 1679;
								itemDefinition.inventory3dRotationX = 258;
								itemDefinition.inventoryX = 21;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 64145;
								itemDefinition.femaleModel = 64145;
								break;
						case 18692:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18691:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Briefcase";
								itemDefinition.description = "Its an Briefcase";
								itemDefinition.inventoryModel = 64149;
								itemDefinition.inventoryModelZoom = 968;
								itemDefinition.inventory3dRotationY = 135;
								itemDefinition.inventory3dRotationX = 714;
								itemDefinition.inventoryX = -5;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 8954;
								itemDefinition.femaleModel = 8954;
								break;
						case 18690:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18689:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Sagacious spectacles";
								itemDefinition.description = "Its an Sagacious spectacles";
								itemDefinition.inventoryModel = 64152;
								itemDefinition.inventoryModelZoom = 463;
								itemDefinition.inventory3dRotationY = 323;
								itemDefinition.inventory3dRotationX = 1024;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 64136;
								itemDefinition.femaleModel = 64136;
								break;
						case 18686:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;


						case 18685:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Lava dragon mask";
								itemDefinition.description = "Its an Lava dragon mask";
								itemDefinition.inventoryModel = 64153;
								itemDefinition.inventoryModelZoom = 905;
								itemDefinition.inventory3dRotationY = 202;
								itemDefinition.inventory3dRotationX = 121;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 22;
								itemDefinition.maleModel = 64138;
								itemDefinition.femaleModel = 64143;
								break;
						case 18684:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;


						case 18683:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Imp mask";
								itemDefinition.description = "Its an Imp mask";
								itemDefinition.inventoryModel = 64155;
								itemDefinition.inventoryModelZoom = 779;
								itemDefinition.inventory3dRotationY = 593;
								itemDefinition.inventory3dRotationX = 13;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 17;
								itemDefinition.maleModel = 64133;
								itemDefinition.femaleModel = 64141;
								break;
						case 18682:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = itemDefinition.itemId - 1;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18681:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Goblin mask";
								itemDefinition.description = "Its an Goblin mask";
								itemDefinition.inventoryModel = 64150;
								itemDefinition.inventoryModelZoom = 587;
								itemDefinition.inventory3dRotationY = 566;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 64132;
								itemDefinition.femaleModel = 64140;
								break;


						// Arcane stream necklace noted.
						case 18336:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = 18335;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18761:
								itemDefinition.name = "Venenatis spiderling";
								itemDefinition.inventory3dRotationX = 80;
								itemDefinition.inventory3dRotationY = 300;
								itemDefinition.inventoryModelZoom = 6000;
								itemDefinition.inventoryY = 0;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 64130;
								break;

						case 18680:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Achievement diary cape (t)";
								itemDefinition.description = "Its an Achievement diary cape (t)";
								itemDefinition.modelColourToEdit = new int[2];
								itemDefinition.newModelColourProduced = new int[2];
								itemDefinition.modelColourToEdit[0] = 22451;
								itemDefinition.modelColourToEdit[1] = 25511;
								itemDefinition.newModelColourProduced[0] = 22174;
								itemDefinition.newModelColourProduced[1] = 27422;
								itemDefinition.inventoryModel = 64128;
								itemDefinition.inventoryModelZoom = 2128;
								itemDefinition.inventory3dRotationY = 504;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 1;
								itemDefinition.maleModel = 64129;
								itemDefinition.femaleModel = 64127;
								break;
						case 18674:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Max cape";
								itemDefinition.description = "Its an Max cape";
								itemDefinition.inventoryModel = 64123;
								itemDefinition.inventoryModelZoom = 2232;
								itemDefinition.inventory3dRotationY = 687;
								itemDefinition.inventory3dRotationX = 27;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -5;
								itemDefinition.maleModel = 64124;
								itemDefinition.femaleModel = 64125;
								break;

						case 18675:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Fire max cape";
								itemDefinition.description = "Its an Fire max cape";
								itemDefinition.modelColourToEdit = new int[5];
								itemDefinition.newModelColourProduced = new int[5];
								itemDefinition.modelColourToEdit[0] = 668;
								itemDefinition.modelColourToEdit[1] = 675;
								itemDefinition.modelColourToEdit[2] = 673;
								itemDefinition.modelColourToEdit[3] = 815;
								itemDefinition.modelColourToEdit[4] = 784;
								//Leave this with no model colours produced, if i remove this code, it will show red stripes instead of black.
								itemDefinition.inventoryModel = 64123;
								itemDefinition.inventoryModelZoom = 2232;
								itemDefinition.inventory3dRotationY = 687;
								itemDefinition.inventory3dRotationX = 27;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -5;
								itemDefinition.maleModel = 64124;
								itemDefinition.femaleModel = 64125;
								break;

						case 18676:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Saradomin max cape";
								itemDefinition.description = "Its an Saradomin max cape";
								itemDefinition.modelColourToEdit = new int[5];
								itemDefinition.newModelColourProduced = new int[5];
								itemDefinition.modelColourToEdit[0] = 668;
								itemDefinition.modelColourToEdit[1] = 675;
								itemDefinition.modelColourToEdit[2] = 784;
								itemDefinition.modelColourToEdit[3] = 815;
								itemDefinition.modelColourToEdit[4] = 673;
								itemDefinition.newModelColourProduced[0] = 43924;
								itemDefinition.newModelColourProduced[1] = 43924;
								itemDefinition.newModelColourProduced[2] = 43924;
								itemDefinition.newModelColourProduced[3] = 115;
								itemDefinition.newModelColourProduced[4] = 111;
								itemDefinition.inventoryModel = 64123;
								itemDefinition.inventoryModelZoom = 2232;
								itemDefinition.inventory3dRotationY = 687;
								itemDefinition.inventory3dRotationX = 27;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -5;
								itemDefinition.maleModel = 64124;
								itemDefinition.femaleModel = 64125;
								break;

						case 18677:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Zamorak max cape";
								itemDefinition.description = "Its an Zamorak max cape";
								itemDefinition.modelColourToEdit = new int[5];
								itemDefinition.newModelColourProduced = new int[5];
								itemDefinition.modelColourToEdit[0] = 668;
								itemDefinition.modelColourToEdit[1] = 675;
								itemDefinition.modelColourToEdit[2] = 784;
								itemDefinition.modelColourToEdit[3] = 815;
								itemDefinition.modelColourToEdit[4] = 673;
								itemDefinition.newModelColourProduced[0] = 0;
								itemDefinition.newModelColourProduced[1] = 0;
								itemDefinition.newModelColourProduced[2] = 926;
								itemDefinition.newModelColourProduced[3] = 12;
								itemDefinition.newModelColourProduced[4] = 12;
								itemDefinition.inventoryModel = 64123;
								itemDefinition.inventoryModelZoom = 2232;
								itemDefinition.inventory3dRotationY = 687;
								itemDefinition.inventory3dRotationX = 27;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -5;
								itemDefinition.maleModel = 64124;
								itemDefinition.femaleModel = 64125;
								break;

						case 18678:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Guthix max cape";
								itemDefinition.description = "Its an Guthix max cape";
								itemDefinition.modelColourToEdit = new int[5];
								itemDefinition.newModelColourProduced = new int[5];
								itemDefinition.modelColourToEdit[0] = 668;
								itemDefinition.modelColourToEdit[1] = 675;
								itemDefinition.modelColourToEdit[2] = 784;
								itemDefinition.modelColourToEdit[3] = 815;
								itemDefinition.modelColourToEdit[4] = 673;
								itemDefinition.newModelColourProduced[0] = 33690;
								itemDefinition.newModelColourProduced[1] = 33690;
								itemDefinition.newModelColourProduced[2] = 22426;
								itemDefinition.newModelColourProduced[3] = 22439;
								itemDefinition.newModelColourProduced[4] = 36783;
								itemDefinition.inventoryModel = 64123;
								itemDefinition.inventoryModelZoom = 2232;
								itemDefinition.inventory3dRotationY = 687;
								itemDefinition.inventory3dRotationX = 27;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -5;
								itemDefinition.maleModel = 64124;
								itemDefinition.femaleModel = 64125;
								break;

						case 18679:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, null};
								itemDefinition.name = "Ava's max cape";
								itemDefinition.description = "Its an Ava's max cape";
								itemDefinition.modelColourToEdit = new int[5];
								itemDefinition.newModelColourProduced = new int[5];
								itemDefinition.modelColourToEdit[0] = 668;
								itemDefinition.modelColourToEdit[1] = 675;
								itemDefinition.modelColourToEdit[2] = 784;
								itemDefinition.modelColourToEdit[3] = 815;
								itemDefinition.modelColourToEdit[4] = 673;
								itemDefinition.newModelColourProduced[0] = 16536;
								itemDefinition.newModelColourProduced[1] = 0;
								itemDefinition.newModelColourProduced[2] = 10291;
								itemDefinition.newModelColourProduced[3] = 10407;
								itemDefinition.newModelColourProduced[4] = 103;
								itemDefinition.inventoryModel = 64123;
								itemDefinition.inventoryModelZoom = 2232;
								itemDefinition.inventory3dRotationY = 687;
								itemDefinition.inventory3dRotationX = 27;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -5;
								itemDefinition.maleModel = 64124;
								itemDefinition.femaleModel = 64125;
								break;

						case 15259:
								if (Client.clientRevision("602"))
								{
										return;
								}
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, null};
								itemDefinition.name = "Dragon pickaxe";
								itemDefinition.description = "Its a Dragon pickaxe.";
								itemDefinition.inventoryModel = 64121;
								itemDefinition.inventoryModelZoom = 1070;
								itemDefinition.inventory3dRotationY = 224;
								itemDefinition.inventory3dRotationX = 1056;
								itemDefinition.inventoryX = -2;
								itemDefinition.inventoryY = -19;
								itemDefinition.maleModel = 64122;
								itemDefinition.femaleModel = 64122;
								break;


						case 18673:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, "Drop"};
								itemDefinition.name = "Ring of the gods (i)";
								itemDefinition.description = "Its a Ring of the gods (i).";
								itemDefinition.inventoryModel = 64120;
								itemDefinition.inventoryModelZoom = 900;
								itemDefinition.inventory3dRotationY = 393;
								itemDefinition.inventory3dRotationX = 1589;
								itemDefinition.inventoryX = -9;
								itemDefinition.inventoryY = -12;
								break;
						case 18672:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, "Drop"};
								itemDefinition.name = "Treasonous ring (i)";
								itemDefinition.description = "A Treasonous ring (i).";
								itemDefinition.inventoryModel = 64119;
								itemDefinition.inventoryModelZoom = 750;
								itemDefinition.inventory3dRotationY = 342;
								itemDefinition.inventory3dRotationX = 252;
								itemDefinition.inventoryX = -3;
								itemDefinition.inventoryY = -12;
								break;
						case 18671:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, "Drop"};
								itemDefinition.name = "Tyrannical ring (i)";
								itemDefinition.description = "A Tyrannical ring (i).";
								itemDefinition.inventoryModel = 64118;
								itemDefinition.inventoryModelZoom = 592;
								itemDefinition.inventory3dRotationY = 285;
								itemDefinition.inventory3dRotationX = 1163;
								itemDefinition.inventoryX = -3;
								break;

						case 18670:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = 18669;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;

						case 18669:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, "Drop"};
								itemDefinition.name = "Ring of the gods";
								itemDefinition.description = "A Ring of the gods.";
								itemDefinition.inventoryModel = 64117;
								itemDefinition.inventoryModelZoom = 900;
								itemDefinition.inventory3dRotationY = 393;
								itemDefinition.inventory3dRotationX = 1589;
								itemDefinition.inventory3dRotationZ = 0;
								itemDefinition.inventoryX = -9;
								itemDefinition.inventoryY = -12;
								break;


						case 18668:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = 18667;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;
						case 18667:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, "Drop"};
								itemDefinition.name = "Treasonous ring";
								itemDefinition.description = "A Treasonous ring.";
								itemDefinition.inventoryModel = 64116;
								itemDefinition.inventoryModelZoom = 750;
								itemDefinition.inventory3dRotationY = 342;
								itemDefinition.inventory3dRotationX = 252;
								itemDefinition.inventoryX = -3;
								itemDefinition.inventoryY = -12;
								break;

						case 18666:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = 18665;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;

						case 18665:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, "Drop"};
								itemDefinition.name = "Tyrannical ring";
								itemDefinition.description = "A Tyrannical ring.";
								itemDefinition.inventoryModel = 64115;
								itemDefinition.inventoryModelZoom = 592;
								itemDefinition.inventory3dRotationY = 285;
								itemDefinition.inventory3dRotationX = 1163;
								itemDefinition.inventoryX = -3;
								break;

						case 18664:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, "Drop"};
								itemDefinition.name = "Rogue's revenge";
								itemDefinition.description = "A Rogue's revenge.";
								itemDefinition.inventoryModel = 64112;
								itemDefinition.inventoryModelZoom = 1000;
								itemDefinition.inventory3dRotationY = 108;
								itemDefinition.inventory3dRotationX = 215;
								itemDefinition.inventory3dRotationZ = 1993;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventoryY = -17;
								itemDefinition.maleModel = 64113;
								itemDefinition.femaleModel = 64114;
								break;

						case 18663:
								itemDefinition.inventoryOptions = new String[] {null, "Wear", null, null, "Drop"};
								itemDefinition.name = "Hunter's honour";
								itemDefinition.description = "A Hunter's honour.";
								itemDefinition.inventoryModel = 64109;
								itemDefinition.inventoryModelZoom = 1000;
								itemDefinition.inventory3dRotationY = 108;
								itemDefinition.inventory3dRotationX = 215;
								itemDefinition.inventory3dRotationZ = 1993;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventoryY = -15;
								itemDefinition.maleModel = 64110;
								itemDefinition.femaleModel = 64111;
								break;

						case 18662:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, "Drop"};
								itemDefinition.name = "Granite maul (or)";
								itemDefinition.description = "A Granite maul (or).";
								itemDefinition.inventoryModel = 64107;
								itemDefinition.inventoryModelZoom = 1789;
								itemDefinition.inventory3dRotationY = 157;
								itemDefinition.inventory3dRotationX = 148;
								itemDefinition.inventory3dRotationZ = 0;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventoryY = -11;
								itemDefinition.maleModel = 64108;
								itemDefinition.femaleModel = 64108;
								break;

						case 18661:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.name = "Granite clamp";
								itemDefinition.description = "Its a Granite clamp.";
								itemDefinition.inventoryModel = 64106;
								itemDefinition.inventoryModelZoom = 1280;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventory3dRotationZ = 1818;
								itemDefinition.inventoryX = -22;
								itemDefinition.inventoryY = -7;
								break;

						case 18660:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, "Destroy"};
								itemDefinition.name = "Sara's blessed sword";
								itemDefinition.description = "Its a Sara's blessed sword";
								itemDefinition.modelColourToEdit = new int[3];
								itemDefinition.newModelColourProduced = new int[3];
								itemDefinition.modelColourToEdit[0] = 43098;
								itemDefinition.modelColourToEdit[1] = 43111;
								itemDefinition.modelColourToEdit[2] = 43086;
								itemDefinition.newModelColourProduced[0] = 7097;
								itemDefinition.newModelColourProduced[1] = 7114;
								itemDefinition.newModelColourProduced[2] = 7114;
								itemDefinition.inventoryModel = 64104;
								itemDefinition.inventoryModelZoom = 2151;
								itemDefinition.inventory3dRotationY = 636;
								itemDefinition.inventory3dRotationX = 1521;
								itemDefinition.inventory3dRotationZ = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 3;
								itemDefinition.maleModel = 64105;
								itemDefinition.femaleModel = 64105;
								break;

						case 18659:
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, "Destroy"};
								itemDefinition.name = "Magic shortbow (i)";
								itemDefinition.description = "Its an Magic shortbow (i)";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 6674;
								itemDefinition.newModelColourProduced[0] = 31505;
								itemDefinition.inventoryModel = 2562;
								itemDefinition.inventoryModelZoom = 1200;
								itemDefinition.inventory3dRotationY = 508;
								itemDefinition.inventory3dRotationX = 124;
								itemDefinition.inventoryX = 7;
								itemDefinition.inventoryY = 2;
								itemDefinition.maleModel = 512;
								itemDefinition.femaleModel = 512;
								break;

						case 18658:

								itemDefinition.inventoryOptions = new String[] {"Check", null, "Withdraw all", null, "Destroy"};
								itemDefinition.name = "Looting bag";
								itemDefinition.description = "Its an Looting bag";
								itemDefinition.modelColourToEdit = new int[4];
								itemDefinition.newModelColourProduced = new int[4];
								itemDefinition.modelColourToEdit[0] = 6430;
								itemDefinition.modelColourToEdit[1] = 7467;
								itemDefinition.modelColourToEdit[2] = 6798;
								itemDefinition.modelColourToEdit[3] = 7223;
								itemDefinition.newModelColourProduced[0] = 32807;
								itemDefinition.newModelColourProduced[1] = 32798;
								itemDefinition.newModelColourProduced[2] = 32786;
								itemDefinition.newModelColourProduced[3] = 58669;
								itemDefinition.inventoryModel = 7508;
								itemDefinition.inventoryModelZoom = 740;
								itemDefinition.inventory3dRotationY = 67;
								itemDefinition.inventory3dRotationX = 471;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = -1;
								itemDefinition.femaleModel = -1;
								break;
						case 18657:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.name = "Saradomin's tear";
								itemDefinition.description = "Its an Saradomin's tear";
								itemDefinition.inventoryModel = 64103;
								itemDefinition.inventoryModelZoom = 905;
								itemDefinition.inventory3dRotationY = 512;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryY = -4;
								break;

						case 18656:
								itemDefinition.inventoryOptions = new String[] {"Wear", null, null, null, "Destroy"};
								ItemDefinition copy3 = ItemDefinition.forId(2572);
								itemDefinition.groundOptions = copy3.groundOptions;
								itemDefinition.name = "Ring of wealth (i)";
								itemDefinition.description = "It's an imbued Ring of wealth.";
								itemDefinition.inventoryModel = 64102;
								itemDefinition.inventory3dRotationX = copy3.inventory3dRotationX;
								itemDefinition.inventory3dRotationY = copy3.inventory3dRotationY;
								itemDefinition.inventoryModelZoom = copy3.inventoryModelZoom;
								itemDefinition.inventoryX = copy3.inventoryX;
								itemDefinition.inventoryY = copy3.inventoryY;
								itemDefinition.inventoryOptions = copy3.inventoryOptions;
								break;

						case 18654:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								ItemDefinition copy = ItemDefinition.forId(2745);
								itemDefinition.groundOptions = copy.groundOptions;
								itemDefinition.name = "Ring of wealth scroll";
								itemDefinition.description = "It's a scroll.";
								itemDefinition.modelColourToEdit = new int[5];
								itemDefinition.newModelColourProduced = new int[5];
								itemDefinition.modelColourToEdit[0] = 6464;
								itemDefinition.modelColourToEdit[1] = 6587;
								itemDefinition.modelColourToEdit[2] = 6604;
								itemDefinition.modelColourToEdit[3] = 6608;
								itemDefinition.modelColourToEdit[4] = 6740;
								itemDefinition.newModelColourProduced[0] = 6699;
								itemDefinition.newModelColourProduced[1] = 4399;
								itemDefinition.newModelColourProduced[2] = 5437;
								itemDefinition.newModelColourProduced[3] = 5442;
								itemDefinition.newModelColourProduced[4] = 5436;
								itemDefinition.inventoryModel = copy.inventoryModel;
								itemDefinition.inventory3dRotationX = 628;
								itemDefinition.inventory3dRotationY = copy.inventory3dRotationY;
								itemDefinition.inventoryModelZoom = copy.inventoryModelZoom;
								itemDefinition.inventoryX = copy.inventoryX;
								itemDefinition.inventoryY = copy.inventoryY;
								break;

						case 18655:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								ItemDefinition copy1 = ItemDefinition.forId(2745);
								itemDefinition.groundOptions = copy1.groundOptions;
								itemDefinition.name = "Magic shortbow scroll";
								itemDefinition.description = "It's a scroll.";
								itemDefinition.modelColourToEdit = new int[5];
								itemDefinition.newModelColourProduced = new int[5];
								itemDefinition.modelColourToEdit[0] = 6464;
								itemDefinition.modelColourToEdit[1] = 6587;
								itemDefinition.modelColourToEdit[2] = 6604;
								itemDefinition.modelColourToEdit[3] = 6608;
								itemDefinition.modelColourToEdit[4] = 6740;
								itemDefinition.newModelColourProduced[0] = 6699;
								itemDefinition.newModelColourProduced[1] = 4399;
								itemDefinition.newModelColourProduced[2] = 5437;
								itemDefinition.newModelColourProduced[3] = 5442;
								itemDefinition.newModelColourProduced[4] = 5446;
								itemDefinition.inventoryModel = copy1.inventoryModel;
								itemDefinition.inventory3dRotationX = copy1.inventory3dRotationX;
								itemDefinition.inventory3dRotationY = copy1.inventory3dRotationY;
								itemDefinition.inventoryModelZoom = copy1.inventoryModelZoom;
								itemDefinition.inventoryX = copy1.inventoryX;
								itemDefinition.inventoryY = copy1.inventoryY;
								break;

						case 18644:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								ItemDefinition coin = ItemDefinition.forId(995);
								itemDefinition.groundOptions = coin.groundOptions;
								itemDefinition.name = "Blood money";
								itemDefinition.description = "It's Blood money";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 8128;
								itemDefinition.newModelColourProduced[0] = 947;
								itemDefinition.inventoryModel = coin.inventoryModel;
								itemDefinition.inventory3dRotationX = coin.inventory3dRotationX;
								itemDefinition.inventory3dRotationY = coin.inventory3dRotationY;
								itemDefinition.inventoryModelZoom = coin.inventoryModelZoom;
								itemDefinition.inventoryX = coin.inventoryX;
								itemDefinition.inventoryY = coin.inventoryY;
								itemDefinition.stackable = coin.stackable;
								itemDefinition.stackIds = new int[10];
								itemDefinition.stackAmounts = new int[10];
								itemDefinition.stackIds[0] = 18645;
								itemDefinition.stackAmounts[0] = 2;
								itemDefinition.stackIds[1] = 18646;
								itemDefinition.stackAmounts[1] = 3;
								itemDefinition.stackIds[2] = 18647;
								itemDefinition.stackAmounts[2] = 4;
								itemDefinition.stackIds[3] = 18648;
								itemDefinition.stackAmounts[3] = 5;
								itemDefinition.stackIds[4] = 18649;
								itemDefinition.stackAmounts[4] = 25;
								itemDefinition.stackIds[5] = 18650;
								itemDefinition.stackAmounts[5] = 100;
								itemDefinition.stackIds[6] = 18651;
								itemDefinition.stackAmounts[6] = 250;
								itemDefinition.stackIds[7] = 18652;
								itemDefinition.stackAmounts[7] = 1000;
								itemDefinition.stackIds[8] = 18653;
								itemDefinition.stackAmounts[8] = 10000;
								break;

						case 18642:
								itemDefinition.name = "Armadyl crossbow";
								itemDefinition.inventoryModelZoom = 1325;
								itemDefinition.inventory3dRotationY = 240;
								itemDefinition.inventory3dRotationX = 110;
								itemDefinition.inventoryX = -6;
								itemDefinition.inventoryY = -40;
								itemDefinition.newModelColourProduced = new int[] {115, 107, 10167, 10171};
								itemDefinition.modelColourToEdit = new int[] {5409, 5404, 6449, 7390};
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, "Drop"};
								itemDefinition.inventoryModel = 64100;
								itemDefinition.maleModel = 64101;
								itemDefinition.femaleModel = 64101;
								break;



						case 18643:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = 18642;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;

						// White whip.
						case 15443:
								if (Client.clientRevision("474") || Client.clientRevision("525"))
								{
										itemDefinition.modelColourToEdit = new int[2];
										itemDefinition.newModelColourProduced = new int[2];
										itemDefinition.modelColourToEdit[0] = 528;
										itemDefinition.newModelColourProduced[0] = 127;
								}
								break;

						// Blue whip.
						case 15442:
								if (Client.clientRevision("474") || Client.clientRevision("525"))
								{
										itemDefinition.modelColourToEdit = new int[2];
										itemDefinition.newModelColourProduced = new int[2];
										itemDefinition.modelColourToEdit[0] = 528;
										itemDefinition.newModelColourProduced[0] = 302770;
								}
								break;

						// Green whip.
						case 15444:
								if (Client.clientRevision("474") || Client.clientRevision("525"))
								{
										itemDefinition.modelColourToEdit = new int[2];
										itemDefinition.newModelColourProduced = new int[2];
										itemDefinition.modelColourToEdit[0] = 528;
										itemDefinition.newModelColourProduced[0] = 347770;
								}
								break;

						// Yellow whip.
						case 15441:
								if (Client.clientRevision("474") || Client.clientRevision("525"))
								{
										itemDefinition.modelColourToEdit = new int[2];
										itemDefinition.newModelColourProduced = new int[2];
										itemDefinition.modelColourToEdit[0] = 528;
										itemDefinition.newModelColourProduced[0] = 338770;
								}
								break;

						case 2528:
								itemDefinition.name = "Prayer lamp";
								break;

						case 18741:
								duplicateItem(itemDefinition, "Xp lamp (400k)", 2528);
								break;

						case 18742:
								duplicateItem(itemDefinition, "Xp lamp (500k)", 2528);
								break;

						case 18635:
								itemDefinition.name = "Raw dark crab";
								itemDefinition.inventoryModelZoom = 1300;
								itemDefinition.inventory3dRotationY = 222;
								itemDefinition.inventory3dRotationX = 1805;
								itemDefinition.inventoryX = 5;
								itemDefinition.inventoryY = 25;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 64088;
								break;

						case 18636:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = 18635;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;

						case 18637:
								itemDefinition.name = "Dark crab";
								itemDefinition.inventoryModelZoom = 1300;
								itemDefinition.inventory3dRotationY = 222;
								itemDefinition.inventory3dRotationX = 1805;
								itemDefinition.inventoryX = 5;
								itemDefinition.inventoryY = 25;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {"Eat", null, null, null, "Drop"};
								itemDefinition.inventoryModel = 64089;
								break;

						case 18638:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = 18637;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;

						case 18639:
								itemDefinition.name = "Burnt dark crab";
								itemDefinition.inventoryModelZoom = 1300;
								itemDefinition.inventory3dRotationY = 222;
								itemDefinition.inventory3dRotationX = 1805;
								itemDefinition.inventoryX = 5;
								itemDefinition.inventoryY = 25;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 64090;
								break;

						case 18640:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = 18639;
								itemDefinition.notedItemTemplate = 799;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								break;

						// Runecrafter hat (green).
						case 13613:
								itemDefinition.inventoryOptions[2] = "Goggles";
								break;

						case 10835:
								itemDefinition.name = "10 million coins";
								itemDefinition.inventoryOptions[0] = "Open";
								break;

						case 18739:
								itemDefinition.groundOptions = new String[5];
								itemDefinition.inventoryOptions[1] = "Wear";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 926;
								itemDefinition.newModelColourProduced[0] = 1;
								itemDefinition.inventoryModel = 2635;
								itemDefinition.inventoryModelZoom = 440;
								itemDefinition.inventory3dRotationY = 105;
								itemDefinition.inventory3dRotationX = 1850;
								itemDefinition.inventory3dRotationZ = 0;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventoryY = 0;
								itemDefinition.maleModel = 187;
								itemDefinition.femaleModel = 363;
								itemDefinition.manHead0 = -1;
								itemDefinition.womanHead0 = -1;
								itemDefinition.name = "Black partyhat";
								itemDefinition.description = "A Black partyhat";
								break;

						case 18740:
								itemDefinition.stackable = true;
								itemDefinition.unNotedId = 18739;
								itemDefinition.notedItemTemplate = 799;
								break;

						case 18759:
								if (Client.clientRevision("602"))
								{
										itemDefinition.name = "Dragon defender";
										itemDefinition.inventoryModelZoom = 592;
										itemDefinition.inventory3dRotationY = 323;
										itemDefinition.inventory3dRotationX = 1845;
										itemDefinition.inventoryX = -16;
										itemDefinition.inventoryY = -3;
										itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
										itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, "Drop"};
										itemDefinition.inventoryModel = 62368;
										itemDefinition.maleModel = 62367;
										itemDefinition.femaleModel = 62367;
								}
								else
								{
										itemDefinition.name = "Dragon defender";
										itemDefinition.inventoryModelZoom = 589;
										itemDefinition.inventory3dRotationY = 498;
										itemDefinition.inventory3dRotationX = 256;
										itemDefinition.inventoryX = 8;
										itemDefinition.inventoryY = 8;
										itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
										itemDefinition.inventoryOptions = new String[] {null, "Wield", null, null, "Drop"};
										itemDefinition.inventoryModel = 64096;
										itemDefinition.maleModel = 64094;
										itemDefinition.femaleModel = 64095;
								}
								break;

						case 19111:
								itemDefinition.name = "TokHaar-Kal";
								itemDefinition.maleModel = 62575;
								itemDefinition.femaleModel = 62582;
								itemDefinition.groundOptions = new String[5];
								itemDefinition.groundOptions[2] = "Take";
								itemDefinition.inventoryX = -4;
								itemDefinition.inventoryModel = 62592;
								itemDefinition.description = "A cape made of ancient, enchanted rocks.";
								itemDefinition.inventoryModelZoom = 1616;
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[1] = "Wear";
								itemDefinition.inventoryOptions[4] = "Drop";
								itemDefinition.inventoryY = 0;
								itemDefinition.inventory3dRotationY = 339;
								itemDefinition.inventory3dRotationX = 192;
								break;

						case 7028:
								itemDefinition.inventoryModel = 12266;
								itemDefinition.name = "Troll mask";
								itemDefinition.description = "Troll";
								itemDefinition.inventoryModelZoom = 985;
								itemDefinition.inventory3dRotationY = 85;
								itemDefinition.inventory3dRotationX = 1867;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -3;
								itemDefinition.maleModel = 12244;
								itemDefinition.femaleModel = 12244;
								itemDefinition.groundOptions = new String[5];
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[1] = "Wear";
								break;

						// Dye white
						case 1773:
								itemDefinition.name = "White dye";
								itemDefinition.description = "A white dye.";
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced[0] = 127;
								itemDefinition.modelColourToEdit[0] = 61;
								break;

						// Healer hat.
						case 10547:
								if (Client.clientRevision("602"))
								{
										itemDefinition.inventoryX = 0;
										itemDefinition.inventoryY = -13;
								}
								break;

						case 14011:
								itemDefinition.inventoryModel = 65258;
								itemDefinition.name = "Completionist cape";
								itemDefinition.inventoryModelZoom = 1316;
								itemDefinition.inventory3dRotationY = 252;
								itemDefinition.inventory3dRotationX = 1020;
								itemDefinition.inventoryX = -1;
								itemDefinition.inventoryY = 24;
								itemDefinition.membersObject = true;
								itemDefinition.maleModel = 65295;
								itemDefinition.femaleModel = 65328;
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[1] = "Wear";
								itemDefinition.inventoryOptions[2] = "Customise";
								break;

						case 18641:
								itemDefinition.inventoryModel = 64098;
								itemDefinition.name = "Callisto cub";
								itemDefinition.inventoryModelZoom = 7500;
								itemDefinition.inventoryX = 55;
								itemDefinition.inventoryOptions = new String[5];
								break;

						// Dice
						case 15098:
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = "Roll";
								itemDefinition.inventoryOptions[2] = "Withdraw seeds";
								break;

						case 15349:
								itemDefinition.groundOptions = new String[5];
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[1] = "Wear";
								itemDefinition.inventoryOptions[4] = "Drop";
								itemDefinition.name = "Ardougne cloak 4";
								itemDefinition.description = "An Ardougne cloak 4.";
								break;

						case 8013:
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = "Break";
								itemDefinition.name = "Teleport home";
								itemDefinition.description = "The only method to teleport out of Pvp combat.";
								break;

						case 2720:
								itemDefinition.name = "Coin casket (low)";
								break;

						case 2717:
								itemDefinition.name = "Coin casket (medium)";
								break;

						case 2714:
								itemDefinition.name = "Coin casket (high)";
								break;

						case 15220:
								itemDefinition.name = "Berserker ring (i)";
								itemDefinition.inventoryModelZoom = 580;
								itemDefinition.inventory3dRotationY = 295;
								itemDefinition.inventory3dRotationX = 1900;
								itemDefinition.inventoryY = -23;
								itemDefinition.inventoryX = 4;
								itemDefinition.inventoryModel = 7735;
								break;

						case 7011:
								itemDefinition.name = "Rainbow partyhat";
								itemDefinition.inventoryModelZoom = 440;
								itemDefinition.inventory3dRotationY = 76;
								itemDefinition.inventory3dRotationX = 1852;
								itemDefinition.inventoryX = 1;
								itemDefinition.inventoryY = 1;
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[1] = "Wear";
								itemDefinition.inventoryOptions[2] = "Dismantle";
								itemDefinition.inventoryModel = 64097;
								itemDefinition.maleModel = 64091;
								itemDefinition.femaleModel = 64092;
								break;

						case 7013:
								itemDefinition.name = "Black h'ween mask";
								itemDefinition.inventoryModelZoom = 730;
								itemDefinition.inventory3dRotationY = 500;
								itemDefinition.inventoryY = -10;
								itemDefinition.newModelColourProduced = new int[] {3, 9152};
								itemDefinition.modelColourToEdit = new int[] {926, 0};
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[1] = "Wear";
								itemDefinition.inventoryModel = 2438;
								itemDefinition.maleModel = 3188;
								itemDefinition.femaleModel = 3192;
								break;

						// Enchanted gem.
						case 4155:
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = "Activate";
								itemDefinition.inventoryOptions[1] = null;
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								break;

						// Monkey greegree.
						case 4024:
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[0] = "Transform into...";
								itemDefinition.inventoryOptions[1] = null;
								itemDefinition.inventoryOptions[2] = null;
								itemDefinition.inventoryOptions[3] = null;
								break;

						case 11995:
								itemDefinition.name = "Pet chaos elemental";
								itemDefinition.inventoryModelZoom = 1500; // zoom.
								itemDefinition.inventory3dRotationY = 50; // 3d y rotation.
								itemDefinition.inventory3dRotationX = 0; // 3d x rotation.
								itemDefinition.inventoryX = 0; // X coordinate in inventory
								itemDefinition.inventoryY = 95; // Y coordinate in inventory
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 28256;
								break;

						case 12649:
								itemDefinition.name = "Pet kree'arra";
								itemDefinition.inventoryModelZoom = 1000; // zoom.
								itemDefinition.inventory3dRotationX = 1900; // 3d x rotation.
								itemDefinition.inventory3dRotationY = 0; // 3d y rotation.
								itemDefinition.inventoryX = -10; // X coordinate in inventory
								itemDefinition.inventoryY = -5; // Y coordinate in inventory
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 28873;
								break;

						case 12650:
								itemDefinition.name = "Pet general graardor";
								itemDefinition.inventoryModelZoom = 1670;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventory3dRotationX = 100;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -10;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 28874;
								break;

						case 12651:
								itemDefinition.name = "Pet commander zilyana";
								itemDefinition.inventoryModelZoom = 1000; // zoom.
								itemDefinition.inventory3dRotationY = 0; // 3d x rotation.
								itemDefinition.inventory3dRotationX = 100; // 3d y rotation.
								itemDefinition.inventoryX = -5; // X coordinate in inventory
								itemDefinition.inventoryY = -7; // Y coordinate in inventory
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 28870;
								break;

						case 12652:
								itemDefinition.name = "Pet k'ril tsutsaroth";
								itemDefinition.inventoryModelZoom = 1168;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventoryX = 0; // X coordinate in inventory
								itemDefinition.inventoryY = -10; // Y coordinate in inventory
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 28868;
								break;

						case 12653:
								itemDefinition.name = "Prince black dragon";
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 28872;
								itemDefinition.inventoryModelZoom = 1400; // zoom.
								itemDefinition.inventory3dRotationY = 0; // 3d x rotation.
								itemDefinition.inventory3dRotationX = 0; // 3d y rotation.
								itemDefinition.inventoryX = 0; // X coordinate in inventory
								itemDefinition.inventoryY = -7; // Y coordinate in inventory
								break;
						case 14000:
								itemDefinition.name = "Pet Ahrim";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 3500;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -10;
								itemDefinition.inventoryModel = 6668;
								break;
						case 14001:
								itemDefinition.name = "Pet Dharok";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 1000;
								itemDefinition.inventory3dRotationY = 120;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 89;
								itemDefinition.inventoryModel = 6652;
								break;
						case 14002:
								itemDefinition.name = "Pet Guthan";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 1000;
								itemDefinition.inventory3dRotationY = 120;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 120;
								itemDefinition.inventoryModel = 6654;
								break;
						case 14003:
								itemDefinition.name = "Pet Karil";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 3470;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -8;
								itemDefinition.inventoryModel = 6675;
								break;
						case 14004:
								itemDefinition.name = "Pet Torag";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 1000;
								itemDefinition.inventory3dRotationY = 30;
								itemDefinition.inventory3dRotationX = 265;
								itemDefinition.inventoryX = 10;
								itemDefinition.inventoryY = 80;
								itemDefinition.inventoryModel = 6657;
								break;
						case 14005:
								itemDefinition.name = "Pet Verac";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 3400;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -8;
								itemDefinition.inventoryModel = 6678;
								break;
						case 14006:
								itemDefinition.name = "Pet dark core";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 2500;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 0;
								itemDefinition.inventoryModel = 42314;
								break;
						case 14007:
								itemDefinition.name = "Barrelchest pet";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 6500;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -45;
								itemDefinition.inventoryModel = 22790;
								break;
						case 14008:
								itemDefinition.name = "Abyssal demon pet";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 5000;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 0;
								itemDefinition.inventoryModel = 5062;
								break;
						case 14009:
								itemDefinition.name = "Dark beast pet";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 3400;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 0;
								itemDefinition.inventoryModel = 26395;
								break;
						case 14010:
								itemDefinition.name = "Tormented demon pet";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 7300;
								itemDefinition.inventory3dRotationY = 0;
								itemDefinition.inventory3dRotationX = 0;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = -140;
								itemDefinition.inventoryModel = 44733;
								break;
						case 14012:
								itemDefinition.name = "Ice strykewyrm pet";
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModelZoom = 7500;
								itemDefinition.inventory3dRotationY = 30;
								itemDefinition.inventory3dRotationX = 70;
								itemDefinition.inventoryX = 0;
								itemDefinition.inventoryY = 0;
								itemDefinition.inventoryModel = 51847;
								break;
						case 12643:
								itemDefinition.name = "Pet dagannoth supreme";
								itemDefinition.inventoryModelZoom = 4560;
								itemDefinition.inventory3dRotationX = 2042;
								itemDefinition.inventory3dRotationY = 1868;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 9941;
								break;

						case 12644:
								itemDefinition.name = "Pet dagannoth prime";
								itemDefinition.inventoryModelZoom = 4560;
								itemDefinition.inventory3dRotationX = 2042;
								itemDefinition.inventory3dRotationY = 1868;
								itemDefinition.modelColourToEdit = new int[] {5931, 1688, 21530, 21534};
								itemDefinition.newModelColourProduced = new int[] {11930, 27144, 16536, 16540};
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 9941;
								break;

						case 12646:
								itemDefinition.name = "Pet dagannoth rex";
								itemDefinition.inventoryModelZoom = 4560;
								itemDefinition.inventory3dRotationX = 2042;
								itemDefinition.inventory3dRotationY = 1868;
								itemDefinition.modelColourToEdit = new int[] {7322, 7326, 10403, 2595};
								itemDefinition.newModelColourProduced = new int[] {16536, 16540, 27144, 2477};
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 9941;
								break;

						case 7041:
								itemDefinition.name = "Tzrek-jad";
								itemDefinition.inventory3dRotationX = 175;
								itemDefinition.inventory3dRotationY = 175;
								itemDefinition.inventoryModelZoom = 11000;
								itemDefinition.inventoryY = -120;
								itemDefinition.groundOptions = new String[] {null, null, "Take", null, null};
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.inventoryModel = 9319;
								break;

						case 7042:
								itemDefinition.inventoryOptions = new String[5];
								itemDefinition.inventoryOptions[1] = "Wear";
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced[0] = 3;
								itemDefinition.modelColourToEdit[0] = 933;
								itemDefinition.inventoryModel = 2537;
								itemDefinition.inventoryModelZoom = 540;
								itemDefinition.inventory3dRotationY = 72;
								itemDefinition.inventory3dRotationX = 136;
								itemDefinition.maleModel = 189;
								itemDefinition.femaleModel = 366;
								itemDefinition.name = "Black santa hat";
								itemDefinition.description = "It's a black santa hat!";
								break;

						// Obsidian cape.
						case 6568:
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 0;
								itemDefinition.newModelColourProduced[0] = 1;
								break;

						// Christmas cracker.
						case 962:
								itemDefinition.inventoryOptions = new String[] {"Open", null, null, null, "Drop"};
								break;

						case 7478:
								itemDefinition.inventoryOptions = new String[] {null, null, null, null, "Drop"};
								itemDefinition.name = "Donator token";
								break;

						case 18760:
								duplicateItem(itemDefinition, "Name change scroll", 2716);
								break;

						// Monk's robe (top).
						case 544:
								if (Client.clientRevision("525"))
								{
										itemDefinition.inventoryX = -4;
										itemDefinition.inventoryModelZoom = 1495;
								}
								break;

						// Dragon platebody.
						case 14479:
								if (Client.clientRevision("525"))
								{
										itemDefinition.inventory3dRotationX = 2047;
										itemDefinition.inventory3dRotationY = 443;
										itemDefinition.inventoryX = -1;
										itemDefinition.inventoryY = 11;
								}
								break;

						// Morrigan's body.
						case 13870:
								if (Client.clientRevision("525"))
								{
										itemDefinition.inventoryX = 1;
										itemDefinition.inventoryModelZoom = 1385;
								}
								break;

						case 1349:
						case 1350:
						case 1351:
						case 1352:
						case 1353:
						case 1354:
						case 1355:
						case 1356:
						case 1357:
						case 1358:
						case 1359:
						case 1360:
						case 1361:
						case 1362:
								if (Client.clientRevision("474") || Client.clientRevision("525"))
								{
										if (itemDefinition.name != null)
										{
												itemDefinition.name = itemDefinition.name.replace("axe", "hatchet");
										}
								}
								break;

						case 9185:
								if (Client.clientRevision("474"))
								{
										if (itemDefinition.name != null)
										{
												itemDefinition.name = itemDefinition.name.replace("c'bow", "crossbow");
										}
								}
								break;
				}



				if (itemId >= 4298 && itemId <= 4311 && Client.clientRevision("602"))
				{
						if (itemDefinition.name != null)
						{
								itemDefinition.name = itemDefinition.name.replace("H.a.m.", "Ham");
						}
				}
		}

		private static void bloodMoney(ItemDefinition itemDefinition, int itemId)
		{

				for (int index = 0; index < 9; index++)
				{
						int bloodMoneyId = 18645 + index;
						if (itemId == bloodMoneyId)
						{
								ItemDefinition coin1 = ItemDefinition.forId(996 + index);
								itemDefinition.groundOptions = coin1.groundOptions;
								itemDefinition.name = "Blood money";
								itemDefinition.description = "It's Blood money";
								itemDefinition.modelColourToEdit = new int[1];
								itemDefinition.newModelColourProduced = new int[1];
								itemDefinition.modelColourToEdit[0] = 8128;
								itemDefinition.newModelColourProduced[0] = 947;
								itemDefinition.inventoryModel = coin1.inventoryModel;
								itemDefinition.inventory3dRotationX = coin1.inventory3dRotationX;
								itemDefinition.inventory3dRotationY = coin1.inventory3dRotationY;
								itemDefinition.inventoryModelZoom = coin1.inventoryModelZoom;
								itemDefinition.inventoryX = coin1.inventoryX;
								itemDefinition.inventoryY = coin1.inventoryY;
								itemDefinition.stackable = coin1.stackable;
								ItemDefinition originalCoin = ItemDefinition.forId(18644);
								itemDefinition.stackIds = originalCoin.stackIds;
								itemDefinition.stackAmounts = originalCoin.stackAmounts;
								return;
						}
				}
		}

		private static void duplicateItem(ItemDefinition itemDefinition, String name, int itemId)
		{
				itemDefinition.name = name;
				ItemDefinition scroll = ItemDefinition.forId(itemId);
				itemDefinition.inventoryModel = scroll.inventoryModel;
				itemDefinition.inventoryOptions = scroll.inventoryOptions;
				itemDefinition.inventoryModelZoom = scroll.inventoryModelZoom;
				itemDefinition.inventory3dRotationX = scroll.inventory3dRotationX;
				itemDefinition.inventory3dRotationY = scroll.inventory3dRotationY;
				itemDefinition.inventoryX = scroll.inventoryX;
				itemDefinition.inventoryY = scroll.inventoryY;
		}

}