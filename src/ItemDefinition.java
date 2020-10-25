public final class ItemDefinition
{

		public static void nullLoader()
		{
				mruNodes2 = null;
				mruNodes1 = null;
				streamIndices602 = null;
				streamIndices525 = null;
				streamIndices474 = null;
				cache = null;
				stream602 = null;
				stream525 = null;
				stream474 = null;
		}

		public boolean faceIsValid(int j)
		{
				int k = manHead0;
				int l = manHead1;
				if (j == 1)
				{
						k = womanHead0;
						l = womanHead1;
				}
				if (k == -1)
						return true;
				boolean flag = true;
				if (!Model.method463(k))
						flag = false;
				if (l != -1 && !Model.method463(l))
						flag = false;
				return flag;
		}

		public Model getHead(int j)
		{
				int k = manHead0;
				int l = manHead1;
				if (j == 1)
				{
						k = womanHead0;
						l = womanHead1;
				}
				if (k == -1)
						return null;
				Model model = Model.getModel(k);
				if (l != -1)
				{
						Model model_1 = Model.getModel(l);
						Model models[] = {model, model_1};
						model = new Model(2, models);
				}
				if (modelColourToEdit != null)
				{
						for (int i1 = 0; i1 < modelColourToEdit.length; i1++)
								model.setColour(modelColourToEdit[i1], newModelColourProduced[i1]);
				}
				return model;
		}

		public boolean modelIsValid(int j)
		{
				int k = maleModel;
				int l = maleEquip2;
				int i1 = manModel2;
				if (j == 1)
				{
						k = femaleModel;
						l = femaleEquip2;
						i1 = womanModel2;
				}
				if (k == -1)
						return true;
				boolean flag = true;
				if (!Model.method463(k))
						flag = false;
				if (l != -1 && !Model.method463(l))
						flag = false;
				if (i1 != -1 && !Model.method463(i1))
						flag = false;
				return flag;
		}

		private final String[] femaleWeaponsFor474 = {"maul", "ket-om", "anchor", "halberd", "scimitar", "sword", "xil-ek", "spear", "knife", "hatchet", "pickaxe", "crossbow", "cross bow"};

		public Model getWornModel(int genderType)
		{
				int j = maleModel;
				int k = maleEquip2;
				int l = manModel2;
				int FEMALE = 1;
				int MALE = 0;
				if (genderType == FEMALE)
				{
						j = femaleModel;
						k = femaleEquip2;
						l = womanModel2;
				}
				if (j == -1)
						return null;
				Model model = Model.getModel(j);
				if (k != -1)
				{
						if (l != -1)
						{
								Model model_1 = Model.getModel(k);
								Model model_3 = Model.getModel(l);
								Model model_1s[] = {model, model_1, model_3};
								model = new Model(3, model_1s);
						}
						else
						{
								Model model_2 = Model.getModel(k);
								Model models[] = {model, model_2};
								model = new Model(2, models);
						}
				}
				femaleItemFixes602And525(model, genderType);
				maleItemFixes602And525(model, genderType);
				femaleItemFixes474(model, genderType);
				maleItemFixes474(model, genderType);


				if (Client.clientRevision("525"))
				{

						if (genderType == MALE && name.contains("Morrigan's javelin"))
						{
								model.method475(0, -11, 0);
						}
						else if (genderType == MALE && name.contains("Armadyl crossbow"))
						{
								model.method475(0, 14, -5);
						}
				}

				applyTexturing(model, itemId);
				if (modelColourToEdit != null)
				{
						for (int i1 = 0; i1 < modelColourToEdit.length; i1++)
						{
								model.setColour(modelColourToEdit[i1], newModelColourProduced[i1]);
						}
				}
				return model;
		}

		private void femaleItemFixes474(Model model, int genderType)
		{
				if (!Client.clientRevision("474"))
				{
						return;
				}
				int FEMALE = 1;
				if (genderType != FEMALE)
				{
						return;
				}

				String itemName = name.toLowerCase();

				if (itemName.contains("white unicorn mask"))
				{
						model.method475(0, 3, 0);
				}

				else if (itemName.contains("sagacious spectacles"))
				{
						model.method475(0, 2, 5);
				}

				if (itemName.contains("briefcase"))
				{
						model.method475(-4, 6, 0);
				}
				else if (itemName.contains("book of darkness"))
				{
						model.method475(-4, 0, 0);
				}
				else if (itemName.contains("book of balance"))
				{
						model.method475(-4, 0, 0);
				}
				else if (itemName.contains("book of law"))
				{
						model.method475(-4, 0, 0);
				}


				if (itemName.contains("amulet of fury"))
				{
						model.method475(0, 0, 0);
				}
				else if (itemName.contains("amulet of ranging"))
				{
						model.method475(0, 4, -3);
				}
				else if (itemName.contains("toxic blowpipe"))
				{
						model.method475(-2, 8, 0);
				}
				else if (itemName.equals("elder maul"))
				{
						model.method475(8, 0, 1);
				}
				else if (itemName.contains("ballista"))
				{
						model.method475(0, 6, 0);
				}
				else if (itemName.contains("arcane stream necklace"))
				{
						model.method475(0, 7, 0);
				}
				else if (itemName.contains("amulet of torture"))
				{
						model.method475(0, 3, 0);
				}
				else if (itemName.contains("occult necklace"))
				{
						model.method475(0, 5, 0);
				}
				else if (itemName.contains("necklace") && !itemName.contains("berserker"))
				{
						model.method475(0, 1, 0);
				}


				if (name.equalsIgnoreCase("staff of light"))
				{
						model.method475(5, -8, 3);
				}
				else if (itemName.contains("dragon cane"))
				{
						model.method475(-2, 11, 0);
				}
				else if (itemName.contains("abyssal dagger"))
				{
						model.method475(3, 6, 0);
				}
				else if (itemName.contains("abyssal tentacle"))
				{
						model.method475(2, 6, 0);
				}
				else if (itemName.contains("dragon warhammer"))
				{
						model.method475(-2, 2, 0);
				}
				else if (name.contains("Dragon dagger"))
				{
						model.method475(4, 4, 0);
				}
				else if (name.contains("Master wand"))
				{
						model.method475(3, 3, 0);
				}
				else if (name.contains("Dragon claws"))
				{
						model.method475(0, 3, 0);
				}
				else if (name.contains("shortbow") || name.contains("mace"))
				{
						model.method475(2, 4, 0);
				}
				else if (name.toLowerCase().contains("vesta's longsword"))
				{
						model.method475(6, -7, 2);
				}
				else if (name.toLowerCase().contains("statius's warhammer"))
				{
						model.method475(6, -7, 2);
				}
				else if (name.toLowerCase().contains("vesta's spear"))
				{
						model.method475(6, -7, 2);
				}
				else if (name.toLowerCase().contains("hand cannon"))
				{
						model.method475(6, -3, 0);
				}
				// Coloured dark bows.
				else if (itemId >= 15701 && itemId <= 15704)
				{
						model.method475(2, -5, 1);
				}
				else if (name.contains("cane") && !name.contains("shield") && !name.contains("stream necklace"))
				{
						model.method475(5, -7, 2);
				}

				else if (name.contains("Rubber chicken") || name.contains("flail") || name.contains("Toy kite"))
				{
						model.method475(5, 0, 0);
				}

				else if (name.contains("Dharok's greataxe"))
				{
						model.method475(3, 5, 0);
				}


				else if (name.contains("whip"))
				{
						model.method475(1, 7, 0);
				}
				else if (itemName.equals("dragon sword"))
				{
						model.method475(3, 6, 0);
				}
				else if (itemName.equals("dragon hunter crossbow"))
				{
						model.method475(3, 6, 0);
				}

				else if (name.toLowerCase().contains("staff"))
				{
						model.method475(3, 3, 1);
				}
				else if (name.toLowerCase().contains("morrigan's javelin"))
				{
						model.method475(5, -20, 0);
				}

				else if (name.toLowerCase().contains("morrigan's throwing"))
				{
						model.method475(5, -9, 2);
				}
				else if (name.contains("Dragon pickaxe"))
				{
						model.method475(2, 4, 0);
				}
				else if (name.contains("Easter carrot"))
				{
						model.method475(4, -7, 2);
				}
				else if (name.contains("blessed sword") || name.contains("Saradomin sword"))
				{
						model.method475(3, 4, 0);
				}
				else
				{
						for (int i = 0; i < femaleWeaponsFor474.length; i++)
						{
								if (name.contains(femaleWeaponsFor474[i]))
								{
										model.method475(0, 6, 0);
										break;
								}
						}
				}

				if (name.contains("Dragon defender"))
				{
						model.method475(0, 0, -2);
				}
				else if (name.contains("defender"))
				{
						model.method475(-5, 0, 0);
				}
				else if (name.contains("book"))
				{
						model.method475(-4, 0, 6);
				}
				else if (name.contains("Dragonfire shield") || name.contains("Anti-dragon") || name.contains("Dragon sq"))
				{
						model.method475(-4, 0, 6);
				}
				else if (name.contains("Spectral spirit shield"))
				{
						model.method475(-10, 0, 0);
				}
				else if (name.contains("Arcane spirit shield"))
				{
						model.method475(-12, 0, 0);
				}
				else if (name.equals("Spirit shield"))
				{
						model.method475(-6, 0, 0);
				}
				else if (name.equals("Elysian spirit shield"))
				{
						model.method475(-6, 0, 0);
				}
				else if (name.equals("Divine spirit shield"))
				{
						model.method475(-6, 0, 0);
				}
				else if (name.equals("Blessed spirit shield"))
				{
						model.method475(-7, 0, 0);
				}
				else if (itemName.equals("twisted buckler"))
				{
						model.method475(-6, 0, 0);
				}
				else if (itemName.equals("malediction ward") || itemName.equals("odium ward"))
				{
						model.method475(-7, -3, 0);
				}

				if (name.equalsIgnoreCase("completionist cape"))
				{
						model.method475(0, 10, -5);
				}
				else if (itemName.contains("max cape"))
				{
						model.method475(0, 3, -1);
				}

		}

	//@formatter:off
	private final String[] femaleWeaponsFor525And602 =
	{
		"javelin", "anchor", "halberd", 
		"staff", "scimitar", "sword", "xil-ek", "crossbow", 
		"Staff of light", "spear", "knife", 
		"Statius's warhammer", "Master wand", "shortbow", 
		"mace", "Rubber chicken", "xil-ul"
	};
	//@formatter:on

		private void femaleItemFixes602And525(Model model, int genderType)
		{

				if (Client.clientRevision("474"))
				{
						return;
				}
				int FEMALE = 1;
				if (genderType != FEMALE)
				{
						return;
				}
				String itemName = name.toLowerCase();


				for (int index = 0; index < osrsMasksFor525And602.length; index++)
				{
						if (name.equalsIgnoreCase(osrsMasksFor525And602[index]))
						{
								model.method475(0, -1, 5);
								break;
						}
				}

				if (itemName.contains("amulet of fury"))
				{
						model.method475(0, 4, 3);
				}
				else if (itemName.contains("occult necklace"))
				{
						model.method475(0, 2, 3);
				}
				else if (itemName.contains("necklace of anguish"))
				{
						model.method475(0, 0, 5);
				}
				else if (itemName.contains("amulet of torture"))
				{
						model.method475(0, 0, 5);
				}
				else if (itemName.contains("amulet") || itemName.contains("arcane stream necklace"))
				{
						model.method475(0, 2, 4);
				}
				else if (itemName.contains("necklace") && !itemName.contains("berserker"))
				{
						model.method475(0, 3, 1);
				}




				if (name.equalsIgnoreCase("completionist cape"))
				{
						model.method475(0, 6, -1);
				}
				else if (itemName.contains("max cape"))
				{
						model.method475(0, -1, 3);
				}
				else if (name.contains("3rd age cloak"))
				{
						model.method475(0, -1, 4);
				}

				if (name.contains("Hand cannon"))
				{
						model.method475(4, -7, 0);
				}

				else if (itemName.contains("staff of the dead"))
				{
						model.method475(2, 0, 3);
				}
				else if (itemName.contains("toxic blowpipe"))
				{
						model.method475(-5, 4, 0);
				}
				else if (itemName.equals("dragon sword"))
				{
						model.method475(2, 3, 0);
				}
				else if (itemName.equals("dragon hunter crossbow"))
				{
						model.method475(2, 3, 3);
				}
				else if (itemName.equals("elder maul"))
				{
						model.method475(-18, 5, 15);
				}
				else if (itemName.contains("ballista"))
				{
						model.method475(58, 0, 28);
				}
				else if (itemName.contains("abyssal dagger"))
				{
						model.method475(0, 0, 0);
				}
				else if (name.toLowerCase().contains("staff"))
				{
						model.method475(4, -12, 6);
				}
				else if (name.equalsIgnoreCase("Dragon cane"))
				{
						model.method475(0, 1, 5);
				}
				else if (itemName.equalsIgnoreCase("trident of the swamp"))
				{
						model.method475(0, -3, 0);
				}
				else if (itemName.equalsIgnoreCase("dragon warhammer"))
				{
						model.method475(-2, -3, 0);
				}
				else if (name.contains("3rd age longsword"))
				{
						model.method475(0, 1, 5);
				}
				else if (name.contains("Dragon dagger"))
				{
						model.method475(5, -13, 5);
				}
				else if (name.contains("Granite maul (or)"))
				{
						model.method475(5, 5, 0);
				}
				// Coloured dark bows.
				else if (name.contains("Dark bow"))
				{
						model.method475(3, -9, 6);
				}
				else if (name.contains("Armadyl crossbow"))
				{
						model.method475(3, 2, 2);
				}
				else if (name.contains("2h") || name.contains("Saradomin sword") || (name.contains("Abyssal") && Client.clientRevision("602")) || name.contains("Granite maul"))
				{
						model.method475(5, -8, 5);
				}
				else if (name.contains("godsword"))
				{
						model.method475(5, -8, 16);
				}
				else if (name.contains("Morrigan's javelin"))
				{
						model.method475(5, -23, 10);
				}
				else if ((name.contains("Scythe") || name.contains("Toy kite")))
				{
						model.method475(3, 0, 0);
				}
				else if (name.contains("Dragon pickaxe") && Client.clientRevision("525"))
				{
						model.method475(0, 0, 3);
				}
				else if ((name.contains("Vesta's spear") || name.contains("flail") || name.contains("hatchet")))
				{
						model.method475(6, -11, 5);
				}
				else if (name.contains("Easter carrot"))
				{
						model.method475(5, -15, 8);
				}
				else if (Client.clientRevision("602") && name.contains("blessed sword"))
				{
						model.method475(3, 4, 0);
				}
				else if (Client.clientRevision("602") && (name.contains("ket-om") || name.contains("axe")))
				{
						model.method475(4, -12, 5);
				}
				else if (Client.clientRevision("525") && (name.contains("ket-om") || name.contains("axe")))
				{
						model.method475(4, -10, 8);
				}
				else if (name.contains("cane") && !name.contains("shield") && !name.contains("stream necklace"))
				{
						model.method475(4, -12, 5);
				}
				else if (name.contains("Dragon defender") && Client.clientRevision("525"))
				{
						model.method475(5, 2, -2);
				}

				else if (name.contains("blessed sword") && Client.clientRevision("525"))
				{
						model.method475(5, 5, 0);
				}
				else
				{
						for (int i = 0; i < femaleWeaponsFor525And602.length; i++)
						{
								if (name.contains(femaleWeaponsFor525And602[i]))
								{
										model.method475(4, -12, 5);
										break;
								}
						}
				}


				if (name.contains("defender"))
				{
						model.method475(-3, name.contains("Dragon") ? -8 : -13, 5);
				}
				else if (name.contains("Spectral spirit shield"))
				{
						model.method475(-10, -15, 0);
				}
				else if (name.contains("Arcane spirit shield"))
				{
						model.method475(-8, -3, 0);
				}
				else if (name.contains("shield"))
				{
						model.method475(-6, -15, 0);
				}
				else if (itemName.equals("twisted buckler"))
				{
						model.method475(-3, -7, 0);
				}
				else if (itemName.equals("malediction ward") || itemName.equals("odium ward"))
				{
						model.method475(-4, -27, 5);
				}

				if (name.contains("Sagacious spectacles"))
				{
						model.method475(0, -1, 8);
				}
				else if (name.contains("White unicorn mask"))
				{
						model.method475(0, 3, 0);
				}
		}

		private void maleItemFixes474(Model model, int genderType)
		{
				if (!Client.clientRevision("474"))
				{
						return;
				}
				int MALE = 0;

				if (genderType != MALE)
				{
						return;
				}

				String itemName = name.toLowerCase();

				if (itemName.contains("arcane stream necklace"))
				{
						model.method475(0, 0, 4);
				}

				if (name.equalsIgnoreCase("staff of light"))
				{
						model.method475(2, -12, 1);
				}
				else if (itemName.contains("trident of the swamp"))
				{
						model.method475(-5, -3, 0);
				}
				else if (name.contains("Dragon claws"))
				{
						model.method475(0, 0, 0);
				}
				else if (itemName.equals("elder maul"))
				{
						model.method475(3, 0, 2);
				}
				else if (itemName.contains("toxic blowpipe"))
				{
						model.method475(-7, 3, 0);
				}
				else if (name.toLowerCase().contains("vesta's longsword"))
				{
						model.method475(1, -13, 0);
				}
				else if (name.toLowerCase().contains("statius's warhammer"))
				{
						model.method475(1, -13, 0);
				}
				else if (name.toLowerCase().contains("vesta's spear"))
				{
						model.method475(2, -15, 0);
				}
				else if (name.toLowerCase().contains("hand cannon"))
				{
						model.method475(6, -3, 0);
				}
				// Coloured dark bows.
				else if (itemId >= 15701 && itemId <= 15704)
				{
						model.method475(2, -7, -1);
				}

				else if (name.contains("cane") && !name.contains("shield") && !name.contains("stream necklace"))
				{
						model.method475(0, -11, 1);
				}

				else if (name.toLowerCase().contains("morrigan's javelin"))
				{
						model.method475(2, -25, 0);
				}

				else if (name.toLowerCase().contains("morrigan's throwing"))
				{
						model.method475(0, -13, 2);
				}
				else if (genderType == MALE && name.contains("Armadyl crossbow"))
				{
						model.method475(-3, 0, 0);
				}

				if (name.toLowerCase().contains("spectral spirit shield"))
				{
						model.method475(-6, 0, 0);
				}
				else if (name.toLowerCase().contains("arcane spirit shield"))
				{
						model.method475(-6, -3, 0);
				}
				else if (itemName.equals("twisted buckler"))
				{
						model.method475(0, -5, 0);
				}
				else if (itemName.equals("malediction ward") || itemName.equals("odium ward"))
				{
						model.method475(-2, -6, 0);
				}

				if (name.equalsIgnoreCase("completionist cape"))
				{
						model.method475(0, 7, 0);
				}
				else if (itemName.contains("max cape"))
				{
						model.method475(0, 5, -2);
				}

		}

		private final static String[] osrsMasksFor525And602 = {
				"imp mask",
				"goblin mask",
				"black dragon mask",
				"blue dragon mask",
				"red dragon mask",
				"green dragon mask",
				"lava dragon mask",
				"white unicorn mask",
				"tanzanite helm",
				"serpentine helm",
				"magma helm"};

		private void maleItemFixes602And525(Model model, int genderType)
		{
				if (Client.clientRevision("474"))
				{
						return;
				}
				int MALE = 0;

				if (genderType != MALE)
				{
						return;
				}
				String itemName = name.toLowerCase();

				for (int index = 0; index < osrsMasksFor525And602.length; index++)
				{
						if (name.equalsIgnoreCase(osrsMasksFor525And602[index]))
						{
								model.method475(0, 4, 4);
								break;
						}
				}


				if (itemName.contains("amulet of fury"))
				{
						model.method475(0, 5, 3);
				}
				else if (itemName.contains("amulet") || itemName.contains("arcane stream necklace"))
				{
						model.method475(0, 2, 4);
				}
				else if (itemName.contains("necklace") && !itemName.contains("berserker"))
				{
						model.method475(0, 3, 1);
				}

				if (name.equalsIgnoreCase("completionist cape"))
				{
						model.method475(0, 7, 0);
				}
				else if (itemName.contains("max cape"))
				{
						model.method475(0, 6, 1);
				}


				if (itemName.contains("tormented bracelet"))
				{
						model.method475(0, 13, 0);
				}



				if (name.contains("Morrigan's javelin") && Client.clientRevision("602"))
				{
						model.method475(2, -10, 0);
				}
				else if (itemName.equals("dragon sword"))
				{
						model.method475(-2, 15, -2);
				}
				else if (itemName.equals("dragon hunter crossbow"))
				{
						model.method475(-2, 15, -2);
				}
				else if (name.contains("godsword"))
				{
						model.method475(0, 4, 11);
				}
				else if (itemName.equals("elder maul"))
				{
						model.method475(-17, 17, 10);
				}
				else if (name.contains("blessed sword"))
				{
						model.method475(0, 14, -5);
				}
				else if (itemName.contains("ballista"))
				{
						model.method475(46, 6, 20);
				}
				else if (name.contains("Granite maul (or)"))
				{
						model.method475(0, 14, -5);
				}
				else if (itemName.contains("trident of the swamp"))
				{
						model.method475(-6, 10, 0);
				}
				else if (itemName.contains("abyssal dagger"))
				{
						model.method475(-2, 11, -3);
				}
				else if (itemName.contains("abyssal tentacle"))
				{
						model.method475(-2, 13, -3);
				}
				else if (itemName.contains("toxic blowpipe"))
				{
						model.method475(-7, 17, 0);
				}
				else if (itemName.contains("staff of the dead"))
				{
						model.method475(-2, 13, -3);
				}
				else if (itemName.contains("dragon warhammer"))
				{
						model.method475(-1, 11, -3);
				}
				else if (name.contains("Dragon pickaxe") && Client.clientRevision("525"))
				{
						model.method475(-2, 11, 0);
				}
				else if (name.equals("Dragon cane") || name.equals("3rd age longsword"))
				{
						model.method475(-2, 13, 0);
				}

				if (name.equalsIgnoreCase("arcane spirit shield"))
				{
						model.method475(-3, 0, 0);
				}
				else if (name.contains("Spectral spirit shield"))
				{
						model.method475(-4, 0, 0);
				}
				else if (name.contains("Dragon defender") && Client.clientRevision("525"))
				{
						model.method475(0, 13, -3);
				}
				else if (itemName.equals("twisted buckler"))
				{
						model.method475(0, 7, 0);
				}
				else if (itemName.equals("malediction ward") || itemName.equals("odium ward"))
				{
						model.method475(-1, -13, 0);
				}
		}

		public void setDefaults()
		{
				inventoryModel = 0;
				name = null;
				description = null;
				modelColourToEdit = null;
				newModelColourProduced = null;
				inventoryModelZoom = 2000;
				inventory3dRotationY = 0;
				inventory3dRotationX = 0;
				inventory3dRotationZ = 0;
				inventoryX = 0;
				inventoryY = 0;
				stackable = false;
				value = 1;
				membersObject = false;
				groundOptions = null;
				inventoryOptions = null;
				maleModel = -1;
				maleEquip2 = -1;
				maleEquipOffset = 0;
				femaleModel = -1;
				femaleEquip2 = -1;
				femaleEquipOffset = 0;
				manModel2 = -1;
				womanModel2 = -1;
				manHead0 = -1;
				manHead1 = -1;
				womanHead0 = -1;
				womanHead1 = -1;
				stackIds = null;
				stackAmounts = null;
				unNotedId = -1;
				notedItemTemplate = -1;
				scaleX = 128;
				scaleY = 128;
				scaleZ = 128;
				ambient = 0;
				contrast = 0;
				team = 0;
				lendId = -1;
				lentItemId = -1;
		}

		public static void unpackConfig(StreamLoader streamLoader)
		{
				stream602 = new Stream(streamLoader.getDataForName("obj.dat"));
				Stream stream602 = new Stream(streamLoader.getDataForName("obj.idx"));
				total602 = stream602.readUnsignedWord();
				streamIndices602 = new int[total602 + 1000];
				int i = 2;
				for (int j = 0; j < total602; j++)
				{
						streamIndices602[j] = i;
						i += stream602.readUnsignedWord();
				}

				if (Client.clientRevision("525"))
				{
						stream525 = new Stream(streamLoader.getDataForName("obj525.dat"));
						Stream stream525 = new Stream(streamLoader.getDataForName("obj525.idx"));
						total525 = stream525.readUnsignedWord();
						streamIndices525 = new int[total525 + 1000];
						int i2 = 2;
						for (int j = 0; j < total525; j++)
						{
								streamIndices525[j] = i2;
								i2 += stream525.readUnsignedWord();
						}
				}

				if (Client.clientRevision("474"))
				{
						stream474 = new Stream(streamLoader.getDataForName("obj474.dat"));
						Stream stream474 = new Stream(streamLoader.getDataForName("obj474.idx"));
						total474 = stream474.readUnsignedWord();
						streamIndices474 = new int[total474 + 1000];
						int i2 = 2;
						for (int j = 0; j < total474; j++)
						{
								streamIndices474[j] = i2;
								i2 += stream474.readUnsignedWord();
						}
				}


				cache = new ItemDefinition[10];
				for (int k = 0; k < 10; k++)
				{
						cache[k] = new ItemDefinition();
				}
		}

		// These item ids have to be loaded from 602 read values for the skillcape emotes to work on the 474 and 525 graphics.
		// For some reason some animations load data from items..
		private final static int[] itemIdsForSkillCapeEmotesToWork = {9897, 9896, 9899, 9898, 9894, 9895, 9893};

		public static ItemDefinition forId(int itemId)
		{
				if (itemId > streamIndices602.length)
				{
						Utility.print("Wrong item id: " + itemId);
						return null;
				}
				if (!Client.itemUpdate)
				{
						for (int j = 0; j < 10; j++)
						{
								if (cache[j].itemId == itemId)
								{
										return cache[j];
								}
						}
				}
				cacheIndex = (cacheIndex + 1) % 10;
				ItemDefinition itemDef = cache[cacheIndex];
				itemDef.itemId = itemId;
				boolean loadFrom602 = false;
				if (Client.clientRevision("525") || Client.clientRevision("474"))
				{
						for (int index = 0; index < itemIdsForSkillCapeEmotesToWork.length; index++)
						{
								if (itemIdsForSkillCapeEmotesToWork[index] == itemId)
								{
										loadFrom602 = true;
										break;
								}
						}
				}
				if (Client.clientRevision("602") || loadFrom602)
				{
						stream602.currentOffset = streamIndices602[itemId];
						itemDef.setDefaults();
						itemDef.readValues602(stream602);
				}
				else if (Client.clientRevision("525"))
				{
						if (itemId < total525)
						{
								stream525.currentOffset = streamIndices525[itemId];
								itemDef.setDefaults();
								itemDef.readValues525(stream525);
						}
						else
						{
								stream602.currentOffset = streamIndices602[itemId];
								itemDef.setDefaults();
								itemDef.readValues602(stream602);
						}
				}
				else if (Client.clientRevision("474"))
				{
						if (itemId < total474)
						{
								stream474.currentOffset = streamIndices474[itemId];
								itemDef.setDefaults();
								itemDef.readValues474(stream474);
						}
						else
						{
								stream602.currentOffset = streamIndices602[itemId];
								itemDef.setDefaults();
								itemDef.readValues602(stream602);
						}
				}
				CustomItem.applyCustomItems(itemDef, itemId);
				if (itemDef.notedItemTemplate != -1)
				{
						itemDef.toNote();
				}
				if (itemDef.lentItemId != -1)
				{
						itemDef.toLend();
				}
				if (itemDef.modelColourToEdit != null)
				{
						for (int i2 = 0; i2 < itemDef.modelColourToEdit.length; i2++)
						{
								if (itemDef.newModelColourProduced[i2] == 0)
								{
										itemDef.newModelColourProduced[i2] = 1;
								}
						}
				}
				return itemDef;
		}

		public void readValues602(Stream stream)
		{
				do
				{
						int i = stream.readUnsignedByte();
						if (i == 0)
								return;
						if (i == 1)
						{
								inventoryModel = stream.readUnsignedWord();
						}
						else if (i == 2)
						{
								name = stream.readString();
						}
						else if (i == 3)
						{
								description = stream.readString();
						}
						else if (i == 4)
						{
								inventoryModelZoom = stream.readUnsignedWord();
						}
						else if (i == 5)
						{
								inventory3dRotationY = stream.readUnsignedWord();
						}
						else if (i == 6)
						{
								inventory3dRotationX = stream.readUnsignedWord();
						}
						else if (i == 7)
						{
								inventoryX = stream.readUnsignedWord();
								if (inventoryX > 32767)
								{
										inventoryX -= 0x10000;
								}
						}
						else if (i == 8)
						{
								inventoryY = stream.readUnsignedWord();
								if (inventoryY > 32767)
								{
										inventoryY -= 0x10000;
								}
						}
						else if (i == 10)
						{
								stream.readUnsignedWord();
						}
						else if (i == 11)
						{
								stackable = true;
						}
						else if (i == 12)
						{
								value = stream.readUnsignedWord();
						}
						else if (i == 16)
						{
								membersObject = true;
						}
						else if (i == 23)
						{
								maleModel = stream.readUnsignedWord();
								maleEquipOffset = stream.readSignedByte();
						}
						else if (i == 24)
						{
								maleEquip2 = stream.readUnsignedWord();
						}
						else if (i == 25)
						{
								femaleModel = stream.readUnsignedWord();
								femaleEquipOffset = stream.readSignedByte();
						}
						else if (i == 26)
						{
								femaleEquip2 = stream.readUnsignedWord();
						}
						else if (i >= 30 && i < 35)
						{
								if (groundOptions == null)
								{
										groundOptions = new String[5];
								}
								groundOptions[i - 30] = stream.readString();
								if (groundOptions[i - 30].equalsIgnoreCase("hidden"))
								{
										groundOptions[i - 30] = null;
								}
						}
						else if (i >= 35 && i < 40)
						{
								if (inventoryOptions == null)
								{
										inventoryOptions = new String[5];
								}
								inventoryOptions[i - 35] = stream.readString();
								if (inventoryOptions[i - 35].equalsIgnoreCase("null"))
								{
										inventoryOptions[i - 35] = null;
								}
						}
						else if (i == 40)
						{
								int j = stream.readUnsignedByte();
								modelColourToEdit = new int[j];
								newModelColourProduced = new int[j];
								for (int k = 0; k < j; k++)
								{
										modelColourToEdit[k] = stream.readUnsignedWord();
										newModelColourProduced[k] = stream.readUnsignedWord();
								}
						}
						else if (i == 78)
						{
								manModel2 = stream.readUnsignedWord();
						}
						else if (i == 79)
						{
								womanModel2 = stream.readUnsignedWord();
						}
						else if (i == 90)
						{
								manHead0 = stream.readUnsignedWord();
						}
						else if (i == 91)
						{
								womanHead0 = stream.readUnsignedWord();
						}
						else if (i == 92)
						{
								manHead1 = stream.readUnsignedWord();
						}
						else if (i == 93)
						{
								womanHead1 = stream.readUnsignedWord();
						}
						else if (i == 95)
						{
								inventory3dRotationZ = stream.readUnsignedWord();
						}
						else if (i == 97)
						{
								unNotedId = stream.readUnsignedWord();
						}
						else if (i == 98)
						{
								notedItemTemplate = stream.readUnsignedWord();
						}
						else if (i >= 100 && i < 110)
						{
								if (stackIds == null)
								{
										stackIds = new int[10];
										stackAmounts = new int[10];
								}
								stackIds[i - 100] = stream.readUnsignedWord();
								stackAmounts[i - 100] = stream.readUnsignedWord();
						}
						else if (i == 110)
						{
								scaleX = stream.readUnsignedWord();
						}
						else if (i == 111)
						{
								scaleY = stream.readUnsignedWord();
						}
						else if (i == 112)
						{
								scaleZ = stream.readUnsignedWord();
						}
						else if (i == 113)
						{
								ambient = stream.readSignedByte();
						}
						else if (i == 114)
						{
								contrast = stream.readSignedByte() * 5;
						}
						else if (i == 115)
						{
								team = stream.readUnsignedByte();
						}
						else if (i == 121)
						{
								lendId = stream.readUnsignedWord();
						}
						else if (i == 122)
						{
								lendTemplateId = stream.readUnsignedWord();
						}

				}
				while (true);
		}

		public void readValues525(Stream stream)
		{
				do
				{
						int i = stream.readUnsignedByte();
						if (i == 0)
								return;
						if (i == 1)
						{
								inventoryModel = stream.readUnsignedWord();
						}
						else if (i == 2)
						{
								name = stream.readString();
						}
						else if (i == 3)
						{
								description = stream.readString();
						}
						else if (i == 4)
						{
								inventoryModelZoom = stream.readUnsignedWord();
						}
						else if (i == 5)
						{
								inventory3dRotationY = stream.readUnsignedWord();
						}
						else if (i == 6)
						{
								inventory3dRotationX = stream.readUnsignedWord();
						}
						else if (i == 7)
						{
								inventoryX = stream.readUnsignedWord();
								if (inventoryX > 32767)
								{
										inventoryX -= 0x10000;
								}
						}
						else if (i == 8)
						{
								inventoryY = stream.readUnsignedWord();
								if (inventoryY > 32767)
								{
										inventoryY -= 0x10000;
								}
						}
						else if (i == 10)
						{
								stream.readUnsignedWord();
						}
						else if (i == 11)
						{
								stackable = true;
						}
						else if (i == 12)
						{
								value = stream.readDWord(); // Only difference from 602.
						}
						else if (i == 16)
						{
								membersObject = true;
						}
						else if (i == 23)
						{
								maleModel = stream.readUnsignedWord();
								maleEquipOffset = stream.readSignedByte();
						}
						else if (i == 24)
						{
								maleEquip2 = stream.readUnsignedWord();
						}
						else if (i == 25)
						{
								femaleModel = stream.readUnsignedWord();
								femaleEquipOffset = stream.readSignedByte();
						}
						else if (i == 26)
						{
								femaleEquip2 = stream.readUnsignedWord();
						}
						else if (i >= 30 && i < 35)
						{
								if (groundOptions == null)
								{
										groundOptions = new String[5];
								}
								groundOptions[i - 30] = stream.readString();
								if (groundOptions[i - 30].equalsIgnoreCase("hidden"))
								{
										groundOptions[i - 30] = null;
								}
						}
						else if (i >= 35 && i < 40)
						{
								if (inventoryOptions == null)
								{
										inventoryOptions = new String[5];
								}
								inventoryOptions[i - 35] = stream.readString();
								if (inventoryOptions[i - 35].equalsIgnoreCase("null"))
								{
										inventoryOptions[i - 35] = null;
								}
						}
						else if (i == 40)
						{
								int j = stream.readUnsignedByte();
								modelColourToEdit = new int[j];
								newModelColourProduced = new int[j];
								for (int k = 0; k < j; k++)
								{
										modelColourToEdit[k] = stream.readUnsignedWord();
										newModelColourProduced[k] = stream.readUnsignedWord();
								}
						}
						else if (i == 78)
						{
								manModel2 = stream.readUnsignedWord();
						}
						else if (i == 79)
						{
								womanModel2 = stream.readUnsignedWord();
						}
						else if (i == 90)
						{
								manHead0 = stream.readUnsignedWord();
						}
						else if (i == 91)
						{
								womanHead0 = stream.readUnsignedWord();
						}
						else if (i == 92)
						{
								manHead1 = stream.readUnsignedWord();
						}
						else if (i == 93)
						{
								womanHead1 = stream.readUnsignedWord();
						}
						else if (i == 95)
						{
								inventory3dRotationZ = stream.readUnsignedWord();
						}
						else if (i == 97)
						{
								unNotedId = stream.readUnsignedWord();
						}
						else if (i == 98)
						{
								notedItemTemplate = stream.readUnsignedWord();
						}
						else if (i >= 100 && i < 110)
						{
								if (stackIds == null)
								{
										stackIds = new int[10];
										stackAmounts = new int[10];
								}
								stackIds[i - 100] = stream.readUnsignedWord();
								stackAmounts[i - 100] = stream.readUnsignedWord();
						}
						else if (i == 110)
						{
								scaleX = stream.readUnsignedWord();
						}
						else if (i == 111)
						{
								scaleY = stream.readUnsignedWord();
						}
						else if (i == 112)
						{
								scaleZ = stream.readUnsignedWord();
						}
						else if (i == 113)
						{
								ambient = stream.readSignedByte();
						}
						else if (i == 114)
						{
								contrast = stream.readSignedByte() * 5;
						}
						else if (i == 115)
						{
								team = stream.readUnsignedByte();
						}
						else if (i == 121)
						{
								lendId = stream.readUnsignedWord();
						}
						else if (i == 122)
						{
								lendTemplateId = stream.readUnsignedWord();
						}

				}
				while (true);
		}

		public void readValues474(Stream stream)
		{
				do
				{
						int i = stream.readUnsignedByte();
						if (i == 0)
								return;
						if (i == 1)
						{
								inventoryModel = stream.readUnsignedWord();
						}
						else if (i == 2)
						{
								name = stream.readString();
						}
						else if (i == 3)
						{
								description = stream.readString();
						}
						else if (i == 4)
						{
								inventoryModelZoom = stream.readUnsignedWord();
						}
						else if (i == 5)
						{
								inventory3dRotationY = stream.readUnsignedWord();
						}
						else if (i == 6)
						{
								inventory3dRotationX = stream.readUnsignedWord();
						}
						else if (i == 7)
						{
								inventoryX = stream.readUnsignedWord();
								if (inventoryX > 32767)
								{
										inventoryX -= 0x10000;
								}
						}
						else if (i == 8)
						{
								inventoryY = stream.readUnsignedWord();
								if (inventoryY > 32767)
								{
										inventoryY -= 0x10000;
								}
						}
						else if (i == 10)
						{
								stream.readUnsignedWord();
						}
						else if (i == 11)
						{
								stackable = true;
						}
						else if (i == 12)
						{
								value = stream.readDWord();
						}
						else if (i == 16)
						{
								membersObject = true;
						}
						else if (i == 23)
						{
								maleModel = stream.readUnsignedWord();
								maleEquipOffset = stream.readSignedByte();
						}
						else if (i == 24)
						{
								maleEquip2 = stream.readUnsignedWord();
						}
						else if (i == 25)
						{
								femaleModel = stream.readUnsignedWord();
								femaleEquipOffset = stream.readSignedByte();
						}
						else if (i == 26)
						{
								femaleEquip2 = stream.readUnsignedWord();
						}
						else if (i >= 30 && i < 35)
						{
								if (groundOptions == null)
								{
										groundOptions = new String[5];
								}
								groundOptions[i - 30] = stream.readString();
								if (groundOptions[i - 30].equalsIgnoreCase("hidden"))
								{
										groundOptions[i - 30] = null;
								}
						}
						else if (i >= 35 && i < 40)
						{
								if (inventoryOptions == null)
								{
										inventoryOptions = new String[5];
								}
								inventoryOptions[i - 35] = stream.readString();
						}
						else if (i == 40)
						{
								int j = stream.readUnsignedByte();
								modelColourToEdit = new int[j];
								newModelColourProduced = new int[j];
								for (int k = 0; k < j; k++)
								{
										modelColourToEdit[k] = stream.readUnsignedWord();
										newModelColourProduced[k] = stream.readUnsignedWord();
								}
						}
						else if (i == 78)
						{
								manModel2 = stream.readUnsignedWord();
						}
						else if (i == 79)
						{
								womanModel2 = stream.readUnsignedWord();
						}
						else if (i == 90)
						{
								manHead0 = stream.readUnsignedWord();
						}
						else if (i == 91)
						{
								womanHead0 = stream.readUnsignedWord();
						}
						else if (i == 92)
						{
								manHead1 = stream.readUnsignedWord();
						}
						else if (i == 93)
						{
								womanHead1 = stream.readUnsignedWord();
						}
						else if (i == 95)
						{
								inventory3dRotationZ = stream.readUnsignedWord();
						}
						else if (i == 97)
						{
								unNotedId = stream.readUnsignedWord();
						}
						else if (i == 98)
						{
								notedItemTemplate = stream.readUnsignedWord();
						}
						else if (i >= 100 && i < 110)
						{
								if (stackIds == null)
								{
										stackIds = new int[10];
										stackAmounts = new int[10];
								}
								stackIds[i - 100] = stream.readUnsignedWord();
								stackAmounts[i - 100] = stream.readUnsignedWord();
						}
						else if (i == 110)
						{
								scaleX = stream.readUnsignedWord();
						}
						else if (i == 111)
						{
								scaleY = stream.readUnsignedWord();
						}
						else if (i == 112)
						{
								scaleZ = stream.readUnsignedWord();
						}
						else if (i == 113)
						{
								ambient = stream.readSignedByte();
						}
						else if (i == 114)
						{
								contrast = stream.readSignedByte() * 5;
						}
						else if (i == 115)
						{
								team = stream.readUnsignedByte();
						}
				}
				while (true);
		}


		public void toNote()
		{
				ItemDefinition itemDef = forId(notedItemTemplate);
				inventoryModel = itemDef.inventoryModel;
				inventoryModelZoom = itemDef.inventoryModelZoom;
				inventory3dRotationY = itemDef.inventory3dRotationY;
				inventory3dRotationX = itemDef.inventory3dRotationX;
				inventory3dRotationZ = itemDef.inventory3dRotationZ;
				inventoryX = itemDef.inventoryX;
				inventoryY = itemDef.inventoryY;
				modelColourToEdit = itemDef.modelColourToEdit;
				newModelColourProduced = itemDef.newModelColourProduced;
				ItemDefinition itemDef_1 = forId(unNotedId);
				name = itemDef_1.name;
				membersObject = itemDef_1.membersObject;
				value = itemDef_1.value;
				String s = "a";
				char c = itemDef_1.name.charAt(0);
				if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U')
						s = "an";
				description = ("Swap this note at any bank for " + s + " " + itemDef_1.name + ".");
				stackable = true;
		}

		private void toLend()
		{
				ItemDefinition itemDef = forId(lentItemId);
				inventoryOptions = new String[5];
				inventoryModel = itemDef.inventoryModel;
				inventoryX = itemDef.inventoryX;
				inventory3dRotationX = itemDef.inventory3dRotationX;
				inventoryY = itemDef.inventoryY;
				inventoryModelZoom = itemDef.inventoryModelZoom;
				inventory3dRotationY = itemDef.inventory3dRotationY;
				inventory3dRotationZ = itemDef.inventory3dRotationZ;
				value = 0;
				ItemDefinition itemDef_1 = forId(lendId);
				manHead1 = itemDef_1.manHead1;
				modelColourToEdit = itemDef_1.modelColourToEdit;
				manModel2 = itemDef_1.manModel2;
				maleEquip2 = itemDef_1.maleEquip2;
				womanHead1 = itemDef_1.womanHead1;
				manHead0 = itemDef_1.manHead0;
				groundOptions = itemDef_1.groundOptions;
				maleModel = itemDef_1.maleModel;
				name = itemDef_1.name;
				femaleModel = itemDef_1.femaleModel;
				membersObject = itemDef_1.membersObject;
				womanHead0 = itemDef_1.womanHead0;
				femaleEquip2 = itemDef_1.femaleEquip2;
				womanModel2 = itemDef_1.womanModel2;
				newModelColourProduced = itemDef_1.newModelColourProduced;
				team = itemDef_1.team;
				if (itemDef_1.inventoryOptions != null)
				{
						for (int i_33_ = 0; i_33_ < 4; i_33_++)
								inventoryOptions[i_33_] = itemDef_1.inventoryOptions[i_33_];
				}
				inventoryOptions[4] = "Discard";
		}

		public static Sprite getSprite(int itemId, int j, int k)
		{
				if (k == 0)
				{
						Sprite sprite = (Sprite) mruNodes1.insertFromCache(itemId);
						if (sprite != null && sprite.maxHeight != j && sprite.maxHeight != -1)
						{
								sprite.unlink();
								sprite = null;
						}
						if (sprite != null)
								return sprite;
				}
				ItemDefinition itemDef = forId(itemId);
				if (itemDef == null)
				{
						return null;
				}
				if (itemDef.stackIds == null)
						j = -1;
				if (j > 1)
				{
						int i1 = -1;

						// Turning a coin into a larger pile of coins.
						for (int j1 = 0; j1 < 10; j1++)
						{
								if (j >= itemDef.stackAmounts[j1] && itemDef.stackAmounts[j1] != 0)
								{
										i1 = itemDef.stackIds[j1];
								}
						}

						if (i1 != -1)
						{
								itemDef = forId(i1);
						}
				}
				Model model = itemDef.getModel(1);
				if (model == null)
						return null;
				Sprite sprite = null;
				if (itemDef.notedItemTemplate != -1)
				{
						sprite = getSprite(itemDef.unNotedId, 10, -1);
						if (sprite == null)
								return null;
				}
				if (itemDef.lentItemId != -1)
				{
						sprite = getSprite(itemDef.lendId, 50, 0);
						if (sprite == null)
								return null;
				}
				Sprite sprite2 = new Sprite(32, 32);
				int k1 = Rasterizer.centerX;
				int l1 = Rasterizer.centerY;
				int ai[] = Rasterizer.offsets;
				int ai1[] = DrawingArea.pixels;
				float depthBuffer[] = DrawingArea.depthBuffer;
				int i2 = DrawingArea.width;
				int j2 = DrawingArea.height;
				int k2 = DrawingArea.topX;
				int l2 = DrawingArea.getBottomX();
				int i3 = DrawingArea.topY;
				int j3 = DrawingArea.getBottomY();
				Rasterizer.drawTexturized = false;
				DrawingArea.initDrawingArea(32, 32, sprite2.myPixels, new float[32 * 32]);
				DrawingArea.drawPixels(32, 0, 0, 0, 32);
				Rasterizer.prepare3d1();
				int k3 = itemDef.inventoryModelZoom;
				if (k == -1)
						k3 = (int) ((double) k3 * 1.5D);
				if (k > 0)
						k3 = (int) ((double) k3 * 1.04D);
				int l3 = Rasterizer.sin[itemDef.inventory3dRotationY] * k3 >> 16;
				int i4 = Rasterizer.cos[itemDef.inventory3dRotationY] * k3 >> 16;
				model.method482(itemDef.inventory3dRotationX, itemDef.inventory3dRotationZ, itemDef.inventory3dRotationY, itemDef.inventoryX, l3 + model.modelHeight / 2 + itemDef.inventoryY, i4 + itemDef.inventoryY);
				for (int i5 = 31; i5 >= 0; i5--)
				{
						for (int j4 = 31; j4 >= 0; j4--)
								if (sprite2.myPixels[i5 + j4 * 32] == 0)
										if (i5 > 0 && sprite2.myPixels[(i5 - 1) + j4 * 32] > 1)
												sprite2.myPixels[i5 + j4 * 32] = 1;
										else if (j4 > 0 && sprite2.myPixels[i5 + (j4 - 1) * 32] > 1)
												sprite2.myPixels[i5 + j4 * 32] = 1;
										else if (i5 < 31 && sprite2.myPixels[i5 + 1 + j4 * 32] > 1)
												sprite2.myPixels[i5 + j4 * 32] = 1;
										else if (j4 < 31 && sprite2.myPixels[i5 + (j4 + 1) * 32] > 1)
												sprite2.myPixels[i5 + j4 * 32] = 1;
				}
				if (k > 0)
				{
						for (int j5 = 31; j5 >= 0; j5--)
						{
								for (int k4 = 31; k4 >= 0; k4--)
										if (sprite2.myPixels[j5 + k4 * 32] == 0)
												if (j5 > 0 && sprite2.myPixels[(j5 - 1) + k4 * 32] == 1)
														sprite2.myPixels[j5 + k4 * 32] = k;
												else if (k4 > 0 && sprite2.myPixels[j5 + (k4 - 1) * 32] == 1)
														sprite2.myPixels[j5 + k4 * 32] = k;
												else if (j5 < 31 && sprite2.myPixels[j5 + 1 + k4 * 32] == 1)
														sprite2.myPixels[j5 + k4 * 32] = k;
												else if (k4 < 31 && sprite2.myPixels[j5 + (k4 + 1) * 32] == 1)
														sprite2.myPixels[j5 + k4 * 32] = k;
						}
				}
				else if (k == 0)
				{
						for (int k5 = 31; k5 >= 0; k5--)
						{
								for (int l4 = 31; l4 >= 0; l4--)
										if (sprite2.myPixels[k5 + l4 * 32] == 0 && k5 > 0 && l4 > 0 && sprite2.myPixels[(k5 - 1) + (l4 - 1) * 32] > 0)
												sprite2.myPixels[k5 + l4 * 32] = 0x302020;
						}
				}
				if (itemDef.notedItemTemplate != -1)
				{
						int l5 = sprite.maxWidth;
						int j6 = sprite.maxHeight;
						sprite.maxWidth = 32;
						sprite.maxHeight = 32;
						sprite.drawSprite(0, 0);
						sprite.maxWidth = l5;
						sprite.maxHeight = j6;
				}
				if (itemDef.lentItemId != -1)
				{
						int l5 = sprite.maxWidth;
						int j6 = sprite.maxHeight;
						sprite.maxWidth = 32;
						sprite.maxHeight = 32;
						sprite.drawSprite(0, 0);
						sprite.maxWidth = l5;
						sprite.maxHeight = j6;
				}
				if (k == 0)
						mruNodes1.removeFromCache(sprite2, itemId);
				DrawingArea.initDrawingArea(j2, i2, ai1, depthBuffer);
				DrawingArea.setDrawingArea(j3, k2, l2, i3);
				Rasterizer.centerX = k1;
				Rasterizer.centerY = l1;
				Rasterizer.offsets = ai;
				Rasterizer.drawTexturized = true;
				if (itemDef.stackable)
						sprite2.maxWidth = 33;
				else
						sprite2.maxWidth = 32;
				sprite2.maxHeight = j;
				return sprite2;
		}

		public Model getModel(int i)
		{
				if (stackIds != null && i > 1)
				{
						int j = -1;
						for (int k = 0; k < 10; k++)
						{
								if (i >= stackAmounts[k] && stackAmounts[k] != 0)
								{
										j = stackIds[k];
								}
						}
						if (j != -1)
						{
								return forId(j).getModel(1);
						}
				}
				Model model = (Model) mruNodes2.insertFromCache(itemId);
				if (model != null)
				{
						return model;
				}
				model = Model.getModel(inventoryModel);
				if (model == null)
				{
						return null;
				}
				applyTexturing(model, itemId);
				if (scaleX != 128 || scaleY != 128 || scaleZ != 128)
				{
						model.scaleModel(scaleX, scaleZ, scaleY);
				}
				if (modelColourToEdit != null)
				{
						for (int l = 0; l < modelColourToEdit.length; l++)
						{
								model.setColour(modelColourToEdit[l], newModelColourProduced[l]);
						}
				}
				model.method479(64 + ambient, 768 + contrast, -50, -10, -50, true);
				model.isClickable = true;
				mruNodes2.removeFromCache(model, itemId);
				return model;
		}

		public static void applyTexturing(Model model, int id)
		{
				switch (id)
				{

						// Lava dragon mask.
						case 18685:
								model.setTexture(38119, 40);
								break;

						case 18675:
								model.setTexture(815, 40);
								break;

						// Lava scale.
						case 18823:
								model.setTexture(47155, 40);
								break;
				}
		}

		public Model getInterfaceModel(int i)
		{
				if (stackIds != null && i > 1)
				{
						int j = -1;
						for (int k = 0; k < 10; k++)
						{
								if (i >= stackAmounts[k] && stackAmounts[k] != 0)
								{
										j = stackIds[k];
								}
						}

						if (j != -1)
						{
								return forId(j).getInterfaceModel(1);
						}
				}
				Model model = Model.getModel(inventoryModel);
				if (model == null)
				{
						return null;
				}
				if (modelColourToEdit != null)
				{
						for (int l = 0; l < modelColourToEdit.length; l++)
						{
								model.setColour(modelColourToEdit[l], newModelColourProduced[l]);
						}
				}
				return model;
		}

		public ItemDefinition()
		{
				itemId = -1;
		}

		public static int[] streamIndices474;

		public static int total474;

		public static int[] streamIndices525;

		public static int total525;

		public static byte femaleEquipOffset;

		public int value;

		public int[] modelColourToEdit;

		public int itemId;

		static MRUNodes mruNodes1 = new MRUNodes(100);

		public static MRUNodes mruNodes2 = new MRUNodes(50);

		public int[] newModelColourProduced;

		public boolean membersObject;

		public int womanModel2;

		public int notedItemTemplate;

		public int femaleEquip2;

		public int maleModel;

		public int manHead1;

		public int scaleX;

		public String groundOptions[];

		public int inventoryX;

		public String name;

		public static ItemDefinition[] cache;

		public int womanHead1;

		public int inventoryModel;

		public int manHead0;

		public boolean stackable;

		public String description;

		public int unNotedId;

		public static int cacheIndex;

		public int inventoryModelZoom;

		public static Stream stream602;

		private static Stream stream525;

		private static Stream stream474;

		public int contrast;

		public int manModel2;

		public int maleEquip2;

		public String inventoryOptions[];

		public int inventory3dRotationY;

		public int scaleZ;

		public int scaleY;

		public int[] stackIds;

		public int inventoryY;

		public static int[] streamIndices602;

		public int ambient;

		public int womanHead0;

		public int inventory3dRotationX;

		public int femaleModel;

		public int[] stackAmounts;

		public int team;

		public static int total602;

		public int inventory3dRotationZ;

		public static byte maleEquipOffset;

		public int lendId;

		public int lentItemId;

		public int lendTemplateId;

		public static void reloadItems()
		{
				if (!Client.itemUpdate)
				{
						return;
				}
				if (System.currentTimeMillis() - Client.lastItemUpdate < 500)
				{
						return;
				}
				Client.lastItemUpdate = System.currentTimeMillis();
				mruNodes2.unlinkAll();
				mruNodes1.unlinkAll();
				Client.preloadModels();

		}
}