public final class EntityDefinition
{

		public static EntityDefinition forId(int i)
		{
				for (int j = 0; j < 20; j++)
				{
						if (cache[j].type == (long) i)
						{
								return cache[j];
						}
				}

				cachePosition = (cachePosition + 1) % 20;
				EntityDefinition npc = cache[cachePosition] = new EntityDefinition();
				if (i == 65535)
				{
						i = 0;
				}
				npc.type = i;

				if (Client.clientRevision("474"))
				{
						if (i < total474)
						{
								stream474.currentOffset = streamIndices474[i];
								npc.readValues474(stream474);
						}
						else
						{
								stream602.currentOffset = streamIndices602[i];
								npc.readValues602(stream602);
						}
				}
				else if (Client.clientRevision("525"))
				{
						if (i < total525)
						{
								stream525.currentOffset = streamIndices525[i];
								npc.readValues525(stream525);
						}
						else
						{
								stream602.currentOffset = streamIndices602[i];
								npc.readValues602(stream602);
						}
				}
				else
				{
						if (i <= 11200)
						{
								stream602.currentOffset = streamIndices602[i];
								npc.readValues602(stream602);
						}
				}

				boolean debug = false;
				int npcId = 6969;
				if (debug)
				{
						if (npcId == i)
						{
								Utility.print("NPC: " + i + ", stand: " + npc.standAnim + ", " + npc.walkAnim);

								if (npc.models != null)
								{
										for (int index = 0; index < npc.models.length; index++)
										{
												Utility.print("NPC: " + i + ", model[" + index + "]: " + npc.models[index]);
										}
								}

						}
				}
				switch (i)
				{

						case 11262: //dh tournament
								npc.actions = new String[] {"Information", "Enter", null, null, null}; // Actions for the npc
								npc.models = new int[] {6651, 6702, 6670, 6639, 6660, 290, 13307, 9638, 27638}; // Models
								npc.newModelColour = new int[] {10394, 10388, 10394, 10388, 127, 5916, 4882}; // Colour you want to change to
								npc.originalModelColour = new int[] {10388, 10508, 10512, 10760, 960, 127, 127}; // Original colour
								npc.standAnim = 2065; // Npc's Stand Emote
								npc.walkAnim = 1146;
								npc.name = "Dharok's tournament";
								npc.combatLevel = 1337; //Combat Level
								npc.description = "Enter the Dharok's tournament here!".getBytes();
								break;

						case 11263: //pure hybrid tournament
								npc.actions = new String[] {"Information", "Enter", null, null, null}; // Actions for the npc
								npc.models = new int[] {8383, 8382, 202, 6232, 13307, 556, 323, 3704, 235, 290}; // Models
								npc.newModelColour = new int[] {38814, 10394, 8656, 5018, 61, 10351, 926, 7700, 11200, 6032, 4626, 127, 5916, 4882}; // Colour you want to change to
								npc.originalModelColour = new int[] {22428, 21662, 21776, 22428, 11177, 61, 22426, 22426, -31846, -31846, 28, -14425, 127, 127}; // Original colour
								npc.standAnim = 809; // Npc's Stand Emote
								npc.walkAnim = 1146;
								npc.name = "Pure Hybrid tournament";
								npc.combatLevel = 1337; //Combat Level
								npc.description = "Enter the Pure Hybrid tournament here!".getBytes();
								break;

						case 11264: //zerk hybrid tournament
								npc.actions = new String[] {"Information", "Enter", null, null, null}; // Actions for the npc
								npc.models = new int[] {6232, 4952, 4953, 5028, 4844, 323, 3704, 290, 556, 5027, 210}; // Models
								npc.newModelColour = new int[] {40045, 40918, 40384, 119, 5018, 61, 10351, 926, 7700, 11200, 6032, 40384, 40918, 127, 5916, 4882}; // Colour you want to change to
								npc.originalModelColour = new int[] {924, 148, 0, 924, 937, 11177, 61, 0, 0, 926, 926, 924, 0, -14425, 127, 127}; // Original
								npc.standAnim = 809; // Npc's Stand Emote
								npc.walkAnim = 1146;
								npc.name = "Zerk Hybrid tournament";
								npc.combatLevel = 1337; //Combat Level
								npc.description = "Enter the Zerk hybrid tournament here!".getBytes();
								break;

						case 11265: //main welf hybrid tournament
								npc.actions = new String[] {"Information", "Enter", null, null, null}; // Actions for the npc
								npc.models = new int[] {6232, 21873, 4952, 4953, 5028, 4844, 323, 3704, 290, 556}; // Models
								npc.originalModelColour = new int[] {127, -21593, 10714, 127, 28, -14425, 127, 127, 937, 11177, 61}; // Colour you want to change to
								npc.newModelColour = new int[] {926, 7700, 11200, 6032, 4628, 127, 5916, 4882, 5018, 61, 10351}; // Original colour
								npc.standAnim = 809; // Npc's Stand Emote
								npc.walkAnim = 1146;
								npc.name = "Main Welfare Brid tournament";
								npc.combatLevel = 1337; //Combat Level
								npc.description = "Enter the Main Welfare Brid tournament here!".getBytes();
								break;

						case 11266: //max main hybrid tournament
								npc.actions = new String[] {"Information", "Enter", null, null, null}; // Actions for the npc
								npc.models = new int[10]; //Number of models it uses
								npc.models[0] = 6669; //Ahrims body
								npc.models[1] = 6659; //Ahrims skirt
								npc.models[2] = 13307; //Barrows gloves
								npc.models[3] = 170; //Ahrims (arms)
								npc.models[4] = 64614; //Eternal Boots
								npc.models[5] = 64733; //Toxic staff of the dead
								npc.models[6] = 64724; //Serp helm
								npc.models[7] = 40944; //Arcane spirit shield
								npc.models[8] = 64705; // Fury (or)
								npc.models[9] = 556; //Ardy cloak
								npc.originalModelColour = new int[] {10512, 10512}; // Colour you want to change to
								npc.newModelColour = new int[] {8741, 14490}; // Original colour
								npc.standAnim = 809; // Npc's Stand Emote
								npc.walkAnim = 1146;
								npc.name = "Max Main Brid tournament";
								npc.combatLevel = 1337;//Combat Level
								npc.description = "Enter the Max Main Brid tournament here!".getBytes();
								break;

						case 11267: //barrows welfare hybrid tournament
								npc.actions = new String[] {"Information", "Enter", null, null, null}; // Actions for the npc
								npc.models = new int[] {6232, 21873, 323, 3704, 290, 556, 6669, 170, 6659, 13307}; // Models
								npc.originalModelColour = new int[] {127, -21593, 10714, 127, 28, -14425, 127, 127, 937, 11177, 61, 10512, 10512, 10512, -21696}; // Colour you want to change to
								npc.newModelColour = new int[] {926, 7700, 11200, 6032, 4628, 127, 5916, 4882, 5018, 61, 10351, 8741, 14490, 14490, -20068}; // Original colour
								npc.standAnim = 809; // Npc's Stand Emote
								npc.walkAnim = 1146;
								npc.name = "Barrows Welfare Brid tournament";
								npc.combatLevel = 1337; //Combat Level
								npc.description = "Enter the Barrows Welfare Brid tournament here!".getBytes();
								break;

						case 534:
								npc.name = "Fairy";
								npc.actions = new String[5];
								npc.actions[0] = "Change title";
								break;

						// Cleaner npc at resource wilderness area.
						case 5916:
								npc.actions = new String[5];
								npc.actions[0] = "Note-items";
								npc.actions[2] = "Take 10 coal";
								break;

						case 11261:
								npc.name = "Mandrith";
								npc.combatLevel = 0;
								npc.walkAnim = 2947;
								npc.standAnim = 2945;
								npc.actions = new String[5];
								npc.actions[0] = "Talk-to";
								npc.models = new int[3];
								npc.models[0] = 64812;
								npc.models[1] = 64814;
								npc.models[2] = 64815;
								npc.scaleX = 128;
								npc.scaleZ = 128;
								npc.size = 1;
								break;
						// Cow1337killr.
						case 5210:
								npc.actions = new String[5];
								npc.actions[0] = "Join tournament";
								break;


						case 11260:
								npc.name = "Lava dragon";
								npc.combatLevel = 252;
								npc.walkAnim = 79;
								npc.standAnim = 90;
								npc.actions = new String[5];
								npc.actions[1] = "Attack";
								npc.models = new int[4];
								npc.models[0] = 64765;
								npc.models[1] = 64766;
								npc.models[2] = 64767;
								npc.models[3] = 64768;
								npc.scaleX = 110;
								npc.scaleZ = 110;
								npc.size = 4;
								break;
						case 11259:
								npc.name = "Pvp task master";
								npc.combatLevel = 0;
								npc.walkAnim = 1205;
								npc.standAnim = 813;
								npc.actions = new String[5];
								npc.actions[0] = "Talk-to";
								npc.actions[2] = "Obtain task";
								npc.actions[3] = "Claim reward";
								npc.actions[4] = "Kills left";
								npc.models = new int[8];
								npc.models[0] = 5449;
								npc.models[1] = 181;
								npc.models[2] = 249;
								npc.models[3] = 5450;
								npc.models[4] = 28226;
								npc.models[5] = 176;
								npc.models[6] = 28223;
								npc.models[7] = 5036;
								npc.originalModelColour = new int[6];
								npc.originalModelColour[0] = 94;
								npc.originalModelColour[1] = 43449;
								npc.originalModelColour[2] = 43439;
								npc.originalModelColour[3] = 43228;
								npc.originalModelColour[4] = 43115;
								npc.originalModelColour[5] = 43340;
								npc.newModelColour = new int[6];
								npc.newModelColour[0] = 10776;
								npc.newModelColour[1] = 10892;
								npc.newModelColour[2] = 10776;
								npc.newModelColour[3] = 10892;
								npc.newModelColour[4] = 10892;
								npc.newModelColour[5] = 10892;
								npc.scaleX = 128;
								npc.scaleZ = 128;
								npc.size = 1;
								break;

						case 11257:
								npc.name = "Adam";
								npc.models = new int[7];
								npc.models[0] = 64634;
								npc.models[1] = 64635;
								npc.models[2] = 64636;
								npc.models[3] = 64637;
								npc.models[4] = 64638;
								npc.models[5] = 64639;
								npc.models[6] = 64640;
								npc.originalModelColour = new int[6];
								npc.originalModelColour[0] = 6798;
								npc.originalModelColour[1] = 24;
								npc.originalModelColour[2] = 61;
								npc.originalModelColour[3] = 41;
								npc.originalModelColour[4] = 57;
								npc.originalModelColour[5] = 10394;
								npc.newModelColour = new int[6];
								npc.newModelColour[0] = 55192;
								npc.newModelColour[1] = 61;
								npc.newModelColour[2] = 33;
								npc.newModelColour[3] = 24;
								npc.newModelColour[4] = 33;
								npc.newModelColour[5] = 5652;
								npc.actions = new String[5];
								npc.actions[0] = "Talk-to";
								npc.walkAnim = 819;
								npc.standAnim = 808;
								break;

						case 11258:
								npc.name = "Hatius Cosaintus";
								npc.models = new int[12];
								npc.models[0] = 28518;
								npc.models[1] = 12137;
								npc.models[2] = 20138;
								npc.models[3] = 20154;
								npc.models[4] = 20120;
								npc.models[5] = 177; // hands
								npc.models[6] = 4929;
								npc.models[7] = 28480;
								npc.models[8] = 28483;
								npc.models[9] = 8954;
								npc.models[10] = Client.clientRevision("474") ? 64633 : 177;
								npc.models[11] = 246; //face
								npc.originalModelColour = new int[3];
								npc.originalModelColour[0] = 21685;
								npc.originalModelColour[1] = 21795;
								npc.originalModelColour[2] = 103;
								npc.newModelColour = new int[3];
								npc.newModelColour[0] = 36133;
								npc.newModelColour[1] = 33453;
								npc.newModelColour[2] = 51111;
								npc.actions = new String[5];
								npc.actions[0] = "Talk-to";
								npc.walkAnim = 819;
								npc.standAnim = 808;
								break;

						case 11201:
								npc.name = "Hellpuppy";
								npc.models[0] = 64632;
								npc.newModelColour = new int[] {25238, 8741, 6798};
								npc.originalModelColour = new int[] {127, 127, 127};
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.walkAnim = 6560;
								npc.standAnim = 6561;
								break;

						case 4045:
								npc.name = "Cerberus";
								npc.combatLevel = 318;
								npc.models[0] = 64165;
								npc.originalModelColour[0] = 17467;
								npc.newModelColour[0] = 18626;
								npc.walkAnim = 13701;
								npc.standAnim = 13700;
								npc.actions = new String[] {null, "Attack", null, null, null};
								npc.scaleX = 120;
								npc.scaleZ = 120;
								npc.size = 4;
								break;

						// Low, medium, high mage.
						case 3956:
								copyZombie(npc, 7791, 24);
								break;
						case 3957:
								copyZombie(npc, 94, 42);
								break;
						case 3958:
								copyZombie(npc, 5317, 68);
								break;


						// Low, medium, high ranged.
						case 3959:
								copyZombie(npc, 73, 29);
								break;
						case 3960:
								copyZombie(npc, 77, 49);
								break;
						case 3961:
								copyZombie(npc, 3065, 76);
								break;


						// Low, medium, high melee.
						case 3962:
								copyZombie(npc, 5319, 35);
								break;
						case 3963:
								copyZombie(npc, 5314, 57);
								break;
						case 3964:
								copyZombie(npc, 3059, 88);
								break;
						case 3246:
								npc.combatLevel = 0;
								npc.actions = new String[] {"Trade", null, null, null, null};
								break;
						// Ajjat.
						case 4288:
								npc.actions = new String[] {"Talk-to", null, "Trade", null, null};
								break;

						// King Arthur.
						case 251:
								npc.actions = new String[] {"Talk-to", null, "Restore stats", null, null};
								break;

						// Aubury.
						case 553:
								npc.actions = new String[] {"Talk-to", null, "Teleport", null, null};
								break;

						case 4042:
								npc.name = "Twiggy O'Korn";
								npc.combatLevel = 0;
								npc.walkAnim = 819;
								npc.standAnim = 808;
								npc.actions = new String[5];
								npc.actions[0] = "Talk-to";
								npc.models = new int[8];
								npc.models[0] = 390;
								npc.models[1] = 456;
								npc.models[2] = 332;
								npc.models[3] = 64086;
								npc.models[4] = 421;
								npc.models[5] = 16011;
								npc.models[6] = 64087;
								npc.models[7] = 3353;
								npc.originalModelColour = new int[6];
								npc.originalModelColour[0] = 25238;
								npc.originalModelColour[1] = 8741;
								npc.originalModelColour[2] = 43072;
								npc.originalModelColour[3] = 6798;
								npc.originalModelColour[4] = 22451;
								npc.originalModelColour[5] = 25511;
								npc.newModelColour = new int[6];
								npc.newModelColour[0] = 33300;
								npc.newModelColour[1] = 231;
								npc.newModelColour[2] = 4550;
								npc.newModelColour[3] = 5045;
								npc.newModelColour[4] = 22174;
								npc.newModelColour[5] = 27422;
								npc.scaleX = 128;
								npc.scaleZ = 128;
								npc.size = 1;
								break;

						// Void knight.
						case 3788:
								npc.name = "Blood money merchant";
								npc.actions[0] = "More-shops";
								npc.actions[1] = null;
								npc.actions[2] = "Blood money";
								npc.actions[3] = "Untradeables";
								npc.actions[4] = "Buy-back untradeables";
								break;

						case 587: // Jatix
						case 579: // Drogo dwarf.
						case 2258: // Mage if zamorak.
								npc.actions[0] = "Trade";
								npc.actions[1] = null;
								npc.actions[2] = null;
								break;

						case 526: // Shopkeeper.
								npc.actions[0] = "More-shops";
								npc.actions[1] = null;
								npc.actions[2] = "Cape shop";
								npc.actions[3] = "Supplies";
								npc.actions[4] = "Decant";
								break;

						case 528: // Shopkeeper at Entrana.
								npc.actions[0] = "Skilling";
								npc.actions[1] = null;
								npc.actions[2] = "Decant";
								break;

						// Martin the master gardener.
						case 3299:
								// Face model bugged only on 525 version.
								if (Client.clientRevision("525"))
								{
										npc.models[1] = 217;
								}
								npc.actions[2] = null;
								break;

						// Ellis.
						case 2824:
								npc.actions[2] = null;
								break;

						// Kolodion.
						case 905:
								npc.actions[0] = "Trade";
								break;

						// Farmer.
						case 7:
								npc.actions[1] = null;
								break;

						// Paladin.
						case 2256:
								npc.actions[1] = null;
								break;

						// Hero.
						case 21:
						case 20: // Paladin
						case 23: // Knight of ardougne
								npc.actions[1] = null;
								break;

						// Sigmund the Merchant.
						case 1282:
								npc.actions[0] = null;
								break;


						// Gundai at Mage-bank.
						case 902:
								npc.actions[3] = null;
								break;
						case 316:
								npc.name = "Fishing spot";
								npc.actions[0] = "Fish-shrimp";
								npc.actions[1] = null;
								npc.actions[2] = "Fish-trout/salmon";
								npc.actions[3] = null;
								npc.actions[4] = null;
								npc.description = "Shrimp can be found here.".getBytes();
								break;
						case 324:
								npc.name = "Fishing spot";
								npc.actions[0] = "Fish-lobster";
								npc.actions[1] = null;
								npc.actions[2] = "Fish-tuna/swordfish";
								npc.actions[3] = null;
								npc.actions[4] = null;
								npc.description = "Lobsters can be found here.".getBytes();
								break;
						case 325:
								npc.name = "Fishing spot";
								npc.actions[0] = "Fish-dark crab";
								npc.actions[1] = null;
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								npc.description = "Dark crabs can be fished here.".getBytes();
								break;
						case 326:
								npc.name = "Fishing spot";
								npc.actions[0] = "Fish-monkfish";
								npc.actions[1] = null;
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								npc.description = "Monkfish can be found here.".getBytes();
								break;
						case 334:
								npc.name = "Fishing spot";
								npc.actions[0] = "Fish-shark";
								npc.actions[1] = null;
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								npc.description = "Sharks can be found here.".getBytes();
								break;
						case 6869:
								npc.interactable = false;
								break;
						case 7949:
						case 2244:
								npc.name = "Guide";
								npc.actions = new String[5];
								npc.actions[0] = "Talk-to";
								npc.actions[1] = null;
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								break;
						case 2423:
								npc.actions[1] = "Attack";
								break;
						case 6:
								npc.actions[0] = "Pickpocket";
								npc.actions[1] = null;
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								break;
						// Horvik.
						case 549:
								npc.actions[0] = "More-shops";
								npc.actions[1] = null;
								npc.actions[2] = "Melee";
								npc.actions[3] = "Ranged";
								npc.actions[4] = "Magic";
								break;

						case 6538:
								npc.actions[0] = "Bank";
								npc.actions[1] = null;
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								break;

						case 4040:
								npc.name = "Callisto";
								npc.combatLevel = 470;
								npc.models[0] = 64093;
								EntityDefinition callisto = forId(105);
								npc.standAnim = callisto.standAnim;
								npc.walkAnim = callisto.walkAnim;
								npc.actions = callisto.actions;
								npc.description = "A Callisto.".getBytes();
								npc.scaleX = 120;
								npc.scaleZ = 120;
								npc.size = 4;
								break;

						case 4041:
								npc.name = "Callisto cub";
								npc.models[0] = 64093;
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								EntityDefinition callisto1 = forId(105);
								npc.standAnim = callisto1.standAnim;
								npc.walkAnim = callisto1.walkAnim;
								npc.scaleZ = 35;
								npc.scaleX = 30;
								npc.description = "A Baby Callisto.".getBytes();
								break;

						case 4043:
								npc.models = new int[2];
								npc.models[0] = 64130;
								npc.models[1] = 64131;
								npc.name = "Venenatis";
								npc.actions = new String[] {null, "Attack", null, null, null};
								npc.scaleZ = 200;
								npc.scaleX = 200;
								EntityDefinition ven = forId(60);
								npc.standAnim = ven.standAnim;
								npc.walkAnim = ven.walkAnim;
								npc.combatLevel = 464;
								npc.size = 4;
								break;

						case 4044:
								npc.models = new int[2];
								npc.models[0] = 64130;
								npc.models[1] = 64131;
								npc.name = "Venenatis spiderling";
								npc.actions = new String[] {"Pick-up", null, null, null, null};
								npc.scaleZ = 50;
								npc.scaleX = 50;
								EntityDefinition ven1 = forId(60);
								npc.standAnim = ven1.standAnim;
								npc.walkAnim = ven1.walkAnim;
								break;

						case 4000:
								npc.name = "Prince black dragon";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[4];
								npc.models[0] = 17414;
								npc.models[1] = 17415;
								npc.models[2] = 17429;
								npc.models[3] = 17422;
								npc.standAnim = 90;
								npc.walkAnim = 4635;
								npc.scaleZ = 35;
								npc.scaleX = 35;
								break;

						case 4001:
								npc.name = "General Graardor Jr.";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[2];
								npc.models[0] = 27785;
								npc.models[1] = 27789;
								npc.standAnim = 7059;
								npc.walkAnim = 7058;
								npc.scaleZ = 30;
								npc.scaleX = 30;
								break;

						case 4002:
								npc.name = "TzRek-Jad";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[1];
								npc.models[0] = 34131;
								npc.scaleZ = 25;
								npc.scaleX = 25;
								npc.standAnim = 9274;
								npc.walkAnim = 9273;
								break;

						case 4003:
								npc.name = "Chaos Elemental Jr.";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[1];
								npc.models[0] = 11216;
								npc.standAnim = 3144;
								npc.walkAnim = 3145;
								npc.scaleZ = 40;
								npc.scaleX = 40;
								break;

						case 4005:
								npc.name = "Kree Arra Jr.";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[2];
								npc.models[0] = 28003;
								npc.models[1] = 28004;
								npc.standAnim = 6972;
								npc.walkAnim = 6973;
								npc.scaleZ = 24;
								npc.scaleX = 24;
								break;

						case 4006:
								npc.name = "K'ril Tsutsaroth Jr.";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								EntityDefinition kril = forId(6203);
								npc.models = kril.models;
								npc.standAnim = 6943;
								npc.walkAnim = 6942;
								npc.scaleZ = 23;
								npc.scaleX = 23;
								break;

						case 4007:
								npc.name = "Zilyana Jr.";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[4];
								npc.models[0] = 28057;
								npc.models[1] = 28071;
								npc.models[2] = 28078;
								npc.models[3] = 28056;
								npc.standAnim = 6963;
								npc.walkAnim = 6962;
								npc.scaleZ = 56;
								npc.scaleX = 56;
								break;

						case 4008:
								npc.name = "Dagannoth Supreme Jr.";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[2];
								npc.models[0] = 9941;
								npc.models[1] = 9943;
								npc.standAnim = 2850;
								npc.walkAnim = 2849;
								npc.scaleZ = 58;
								npc.scaleX = 58;
								break;

						case 4009:
								npc.name = "Dagannoth Prime Jr.";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[3];
								npc.models[0] = 9940;
								npc.models[1] = 9943;
								npc.models[2] = 9942;
								npc.newModelColour = new int[] {11930, 27144, 16536, 16540};
								npc.originalModelColour = new int[] {5931, 1688, 21530, 21534};
								npc.standAnim = 2850;
								npc.walkAnim = 2849;
								npc.scaleZ = 58;
								npc.scaleX = 58;
								break;

						case 4010:
								npc.name = "Dagannoth Rex Jr.";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[1];
								npc.models[0] = 9941;
								npc.newModelColour = new int[] {16536, 16540, 27144, 2477};
								npc.originalModelColour = new int[] {7322, 7326, 10403, 2595};
								npc.standAnim = 2850;
								npc.walkAnim = 2849;
								npc.scaleZ = 58;
								npc.scaleX = 58;
								break;

						case 4011:
								npc.name = "Ahrim the Blighted";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[1];
								npc.models[0] = 6668;
								npc.standAnim = 813;
								npc.walkAnim = 1205;
								npc.scaleZ = 78;
								npc.scaleX = 78;
								break;

						case 4012:
								npc.name = "Dharok the Wretched";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[6];
								npc.models[0] = 6652;
								npc.models[1] = 6671;
								npc.models[2] = 6640;
								npc.models[3] = 6661;
								npc.models[4] = 6703;
								npc.models[5] = 6679;
								npc.standAnim = 2065;
								npc.walkAnim = 2064;
								npc.scaleZ = 78;
								npc.scaleX = 78;
								break;

						case 4013:
								npc.name = "Guthan the Infested";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[6];
								npc.models[0] = 6654;
								npc.models[1] = 6674;
								npc.models[2] = 6642;
								npc.models[3] = 6666;
								npc.models[4] = 6679;
								npc.models[5] = 6710;
								npc.standAnim = 813;
								npc.walkAnim = 1205;
								npc.scaleZ = 78;
								npc.scaleX = 78;
								break;

						case 4014:
								npc.name = "Karil the Tainted";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[1];
								npc.models[0] = 6675;
								npc.standAnim = 2074;
								npc.walkAnim = 2076;
								npc.scaleZ = 78;
								npc.scaleX = 78;
								break;

						case 4015:
								npc.name = "Torag the Corrupted";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[6];
								npc.models[0] = 6657;
								npc.models[1] = 6677;
								npc.models[2] = 6645;
								npc.models[3] = 6663;
								npc.models[4] = 6708;
								npc.models[5] = 6679;
								npc.standAnim = 808;
								npc.walkAnim = 819;
								npc.scaleZ = 78;
								npc.scaleX = 78;
								break;

						case 4016:
								npc.name = "Verac the Defiled";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[2];
								npc.models[0] = 6678;
								npc.models[1] = 6705;
								npc.standAnim = 2061;
								npc.walkAnim = 2060;
								npc.scaleZ = 78;
								npc.scaleX = 78;
								break;
						case 4017:
								npc.name = "Dark Core";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[1];
								npc.models[0] = 42314;
								npc.standAnim = 10392;
								npc.walkAnim = 10392;
								npc.scaleZ = 88;
								npc.scaleX = 88;
								break;

						case 4018:
								npc.name = "Barrelchest";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[1];
								npc.models[0] = 22790;
								npc.standAnim = 5893;
								npc.walkAnim = 5892;
								npc.scaleZ = 40;
								npc.scaleX = 40;
								break;

						case 4019:
								npc.name = "Abyssal demon";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[1];
								npc.models[0] = 5062;
								npc.standAnim = 1536;
								npc.walkAnim = 1534;
								npc.scaleZ = 45;
								npc.scaleX = 45;
								break;

						case 4020:
								npc.name = "Dark beast";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[1];
								npc.models[0] = 26395;
								npc.standAnim = 2730;
								npc.walkAnim = 2729;
								npc.combatLevel = 182;
								npc.scaleZ = 50;
								npc.scaleX = 50;
								break;

						case 4021:
								npc.name = "Tormented demon";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = new int[1];
								npc.models[0] = 44733;
								npc.standAnim = 10921;
								npc.walkAnim = 10920;
								npc.scaleZ = 40;
								npc.scaleX = 40;
								break;

						case 4022:
								EntityDefinition ice = forId(9463);
								npc.name = "Ice strykewyrm pet";
								npc.actions = new String[5];
								npc.actions[0] = "Pick-up";
								npc.models = ice.models;
								npc.standAnim = ice.standAnim;
								npc.walkAnim = ice.walkAnim;
								npc.scaleZ = 33;
								npc.scaleX = 33;
								break;
						// Kree'arra
						case 6222:
								npc.scaleZ = 100;
								npc.scaleX = 100;
								break;

						case 1597:
								npc.actions[0] = "Talk-to";
								npc.actions[1] = null;
								npc.actions[2] = "Normal-task";
								npc.actions[3] = "Boss-task";
								npc.actions[4] = "Reset-task";
								break;

						// Gargoyle.
						case 1610:
								npc.actions[0] = null;
								npc.actions[1] = "Attack";
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								break;

						// Bob
						case 519:
								npc.actions[2] = null;
								break;

						case 7605:
								npc.name = "Credits Manager";
								npc.actions[1] = null;
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								npc.description = "A place where you can buy expensive items from.".getBytes();
								break;

						case 5196:
								npc.name = "Teleporter";
								npc.actions[1] = null;
								npc.actions[2] = "Last-teleport";
								npc.actions[3] = null;
								npc.actions[4] = null;
								npc.description = "A teleporter.".getBytes();
								break;

						// Thessalia
						case 548:
								npc.actions[0] = "Talk-to";
								npc.actions[1] = null;
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								npc.description = "The mother of clothing.".getBytes();
								break;

						case 6970:
								npc.name = "Pikkupstix";
								npc.actions[1] = null;
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								npc.description = "A pet owner.".getBytes();
								break;

						case 596:
								npc.name = "Merchant";
								npc.actions[0] = "Open shop-of";
								npc.actions[1] = null;
								npc.actions[2] = null;
								npc.actions[3] = null;
								npc.actions[4] = null;
								npc.description = "A merchant.".getBytes();
								break;

				}

				return npc;
		}

		private static void copyZombie(EntityDefinition npc, int npcCopyId, int combatLevel)
		{
				npc.name = "Zombie";
				npc.combatLevel = combatLevel;
				EntityDefinition zombie = forId(npcCopyId);
				npc.models = zombie.models;
				npc.standAnim = zombie.standAnim;
				npc.walkAnim = zombie.walkAnim;
				npc.actions = new String[] {null, "Attack", null, null, null};
				npc.scaleX = zombie.scaleX;
				npc.scaleZ = zombie.scaleZ;
				npc.size = zombie.size;
		}

		public Model getHead()
		{
				if (childrenIDs != null)
				{
						EntityDefinition entityDef = getOverride();
						if (entityDef == null)
								return null;
						else
								return entityDef.getHead();
				}
				if (faceModels == null)
						return null;
				boolean flag1 = false;
				for (int i = 0; i < faceModels.length; i++)
						if (!Model.method463(faceModels[i]))
								flag1 = true;

				if (flag1)
						return null;
				Model aclass30_sub2_sub4_sub6s[] = new Model[faceModels.length];
				for (int j = 0; j < faceModels.length; j++)
						aclass30_sub2_sub4_sub6s[j] = Model.getModel(faceModels[j]);

				Model model;
				if (aclass30_sub2_sub4_sub6s.length == 1)
						model = aclass30_sub2_sub4_sub6s[0];
				else
						model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);

				if (originalModelColour != null)
				{
						for (int k = 0; k < originalModelColour.length; k++)
								model.setColour(originalModelColour[k], newModelColour[k]);

				}
				return model;
		}

		public EntityDefinition getOverride()
		{
				int j = -1;
				if (varbit != -1)
				{
						VarBit varBit = VarBit.cache[varbit];
						int k = varBit.setting;
						int l = varBit.startbit;
						int i1 = varBit.endbit;
						int j1 = Client.BIT_MASK[i1 - l];
						j = clientInstance.variousSettings[k] >> l & j1;
				}
				else
				{
						if (setting != -1)
						{
								j = clientInstance.variousSettings[setting];
						}
				}
				if (j < 0 || j >= childrenIDs.length || childrenIDs[j] == -1)
				{
						return null;
				}
				else
				{
						return forId(childrenIDs[j]);
				}
		}

		public static int total474;

		public static int total525;

		public static void unpackConfig(StreamLoader streamLoader)
		{
				stream602 = new Stream(streamLoader.getDataForName("npc.dat"));
				Stream stream2 = new Stream(streamLoader.getDataForName("npc.idx"));
				int total602 = stream2.readUnsignedWord();
				streamIndices602 = new int[total602 + 50];
				int i = 2;
				for (int j = 0; j < total602; j++)
				{
						streamIndices602[j] = i;
						i += stream2.readUnsignedWord();
				}
				if (Client.clientRevision("474"))
				{
						stream474 = new Stream(streamLoader.getDataForName("474npc.dat"));
						Stream stream474 = new Stream(streamLoader.getDataForName("474npc.idx"));
						total474 = stream474.readUnsignedWord();
						streamIndices474 = new int[total474];
						int i2 = 2;
						for (int j = 0; j < total474; j++)
						{
								streamIndices474[j] = i2;
								i2 += stream474.readUnsignedWord();
						}
				}
				if (Client.clientRevision("525"))
				{
						stream525 = new Stream(streamLoader.getDataForName("525npc.dat"));
						Stream stream525 = new Stream(streamLoader.getDataForName("525npc.idx"));
						total525 = stream525.readUnsignedWord();
						streamIndices525 = new int[total525];
						int i2 = 2;
						for (int j = 0; j < total525; j++)
						{
								streamIndices525[j] = i2;
								i2 += stream525.readUnsignedWord();
						}
				}

				cache = new EntityDefinition[20];
				for (int k = 0; k < 20; k++)
				{
						cache[k] = new EntityDefinition();
				}

		}

		public static void nullLoader()
		{
				mruNodes = null;
				streamIndices602 = null;
				cache = null;
				stream602 = null;
		}

		public Model method164(int j, int frame, int ai[], int nextFrame, int idk, int idk2)
		{
				if (childrenIDs != null)
				{
						EntityDefinition entityDef = getOverride();
						if (entityDef == null)
								return null;
						else
								return entityDef.method164(j, frame, ai, nextFrame, idk, idk2);
				}
				Model model = (Model) mruNodes.insertFromCache(type);
				if (model == null)
				{
						boolean flag = false;
						for (int i1 = 0; i1 < models.length; i1++)
								if (!Model.method463(models[i1]))
										flag = true;

						if (flag)
								return null;
						Model aclass30_sub2_sub4_sub6s[] = new Model[models.length];
						for (int j1 = 0; j1 < models.length; j1++)
								aclass30_sub2_sub4_sub6s[j1] = Model.getModel(models[j1]);

						if (aclass30_sub2_sub4_sub6s.length == 1)
								model = aclass30_sub2_sub4_sub6s[0];
						else
								model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
						if (originalModelColour != null)
						{
								for (int k1 = 0; k1 < originalModelColour.length; k1++)
										model.setColour(originalModelColour[k1], newModelColour[k1]);

						}
						model.method469();
						model.scaleModel(132, 132, 132);
						model.method479(84 + brightness, 1000 + contrast, -90, -580, -90, true);
						mruNodes.removeFromCache(model, type);
				}
				Model model_1 = Model.aModel_1621;
				model_1.method464(model, SequenceFrame.isNegativeZero(frame) & SequenceFrame.isNegativeZero(j) & SequenceFrame.isNegativeZero(nextFrame));
				if (frame != -1 && j != -1)
						model_1.method471(ai, j, frame);
				else if (frame != -1 && nextFrame != -1)
						model_1.method470(frame, nextFrame, idk, idk2);
				else if (frame != -1)
						model_1.method470(frame);
				if (scaleX != 128 || scaleZ != 128)
						model_1.scaleModel(scaleX, scaleX, scaleZ);
				model_1.method466();
				model_1.anIntArrayArray1658 = null;
				model_1.anIntArrayArray1657 = null;
				if (size == 1)
						model_1.isClickable = true;
				return model_1;
		}

		private void readValues474(Stream stream)
		{
				do
				{
						int i = stream.readUnsignedByte();
						if (i == 0)
								return;
						if (i == 1)
						{
								int j = stream.readUnsignedByte();
								models = new int[j];
								for (int j1 = 0; j1 < j; j1++)
								{
										models[j1] = stream.readUnsignedWord();
								}

						}
						else if (i == 2)
						{
								name = stream.readNewString();
						}
						else if (i == 3)
								description = stream.readBytes();
						else if (i == 12)
								size = stream.readSignedByte();
						else if (i == 13)
								standAnim = stream.readUnsignedWord();
						else if (i == 14)
								walkAnim = stream.readUnsignedWord();
						else if (i == 17)
						{
								walkAnim = stream.readUnsignedWord();
								turn180Sequence = stream.readUnsignedWord();
								turnRightSequence = stream.readUnsignedWord();
								turnLeftSequence = stream.readUnsignedWord();
						}
						else if (i >= 30 && i < 40)
						{
								if (actions == null)
										actions = new String[5];
								actions[i - 30] = stream.readNewString();
								if (actions[i - 30].equalsIgnoreCase("hidden"))
										actions[i - 30] = null;
						}
						else if (i == 40)
						{
								int k = stream.readUnsignedByte();
								originalModelColour = new int[k];
								newModelColour = new int[k];
								for (int k1 = 0; k1 < k; k1++)
								{
										originalModelColour[k1] = stream.readUnsignedWord();
										newModelColour[k1] = stream.readUnsignedWord();
								}

						}
						else if (i == 60)
						{
								int l = stream.readUnsignedByte();
								faceModels = new int[l];
								for (int l1 = 0; l1 < l; l1++)
										faceModels[l1] = stream.readUnsignedWord();

						}
						else if (i == 90)
								stream.readUnsignedWord();
						else if (i == 91)
								stream.readUnsignedWord();
						else if (i == 92)
								stream.readUnsignedWord();
						else if (i == 93)
								showOnMinimap = false;
						else if (i == 95)
								combatLevel = stream.readUnsignedWord();
						else if (i == 97)
								scaleX = stream.readUnsignedWord();
						else if (i == 98)
								scaleZ = stream.readUnsignedWord();
						else if (i == 99)
								aBoolean93 = true;
						else if (i == 100)
								brightness = stream.readSignedByte();
						else if (i == 101)
								contrast = stream.readSignedByte() * 5;
						else if (i == 102)
								headicons = stream.readUnsignedWord();
						else if (i == 103)
								turnSpeed = stream.readUnsignedWord();
						else if (i == 106)
						{
								varbit = stream.readUnsignedWord();
								if (varbit == 65535)
										varbit = -1;
								setting = stream.readUnsignedWord();
								if (setting == 65535)
										setting = -1;
								int i1 = stream.readUnsignedByte();
								childrenIDs = new int[i1 + 1];
								for (int i2 = 0; i2 <= i1; i2++)
								{
										childrenIDs[i2] = stream.readUnsignedWord();
										if (childrenIDs[i2] == 65535)
												childrenIDs[i2] = -1;
								}

						}
						else if (i == 107)
								interactable = false;
				}
				while (true);
		}

		private void readValues602(Stream stream)
		{
				do
				{
						int i = stream.readUnsignedByte();
						if (i == 0)
								return;
						if (i == 1)
						{
								int j = stream.readUnsignedByte();
								models = new int[j];
								for (int j1 = 0; j1 < j; j1++)
								{
										models[j1] = stream.readUnsignedWord();
								}

						}
						else if (i == 2)
								name = stream.readString(); //name = stream.readNewString();
						else if (i == 3)
								description = stream.readBytes();
						else if (i == 12)
								size = stream.readSignedByte();
						else if (i == 13)
								standAnim = stream.readUnsignedWord();
						else if (i == 14)
								walkAnim = stream.readUnsignedWord();
						else if (i == 17)
						{
								walkAnim = stream.readUnsignedWord();
								turn180Sequence = stream.readUnsignedWord();
								turnRightSequence = stream.readUnsignedWord();
								turnLeftSequence = stream.readUnsignedWord();
								turn180Sequence = walkAnim;//not existing.
								turnRightSequence = walkAnim;//not existing.
								turnLeftSequence = walkAnim;//not existing.
						}
						else if (i >= 30 && i < 40)
						{
								if (actions == null)
										actions = new String[5];
								actions[i - 30] = stream.readString();
								if (actions[i - 30].equalsIgnoreCase("hidden"))
										actions[i - 30] = null;
						}
						else if (i == 40)
						{
								int k = stream.readUnsignedByte();
								originalModelColour = new int[k];
								newModelColour = new int[k];
								for (int k1 = 0; k1 < k; k1++)
								{
										originalModelColour[k1] = stream.readUnsignedWord();
										newModelColour[k1] = stream.readUnsignedWord();
								}

						}
						else if (i == 60)
						{
								int l = stream.readUnsignedByte();
								faceModels = new int[l];
								for (int l1 = 0; l1 < l; l1++)
										faceModels[l1] = stream.readUnsignedWord();

						}
						else if (i == 90)
								stream.readUnsignedWord();
						else if (i == 91)
								stream.readUnsignedWord();
						else if (i == 92)
								stream.readUnsignedWord();
						else if (i == 93)
								showOnMinimap = false;
						else if (i == 95)
								combatLevel = stream.readUnsignedWord();
						else if (i == 97)
								scaleX = stream.readUnsignedWord();
						else if (i == 98)
								scaleZ = stream.readUnsignedWord();
						else if (i == 99)
								aBoolean93 = true;
						else if (i == 100)
								brightness = stream.readSignedByte();
						else if (i == 101)
								contrast = stream.readSignedByte() * 5;
						else if (i == 102)
								headicons = stream.readUnsignedWord();
						else if (i == 103)
								turnSpeed = stream.readUnsignedWord();
						else if (i == 106)
						{
								varbit = stream.readUnsignedWord();
								if (varbit == 65535)
										varbit = -1;
								setting = stream.readUnsignedWord();
								if (setting == 65535)
										setting = -1;
								int i1 = stream.readUnsignedByte();
								childrenIDs = new int[i1 + 1];
								for (int i2 = 0; i2 <= i1; i2++)
								{
										childrenIDs[i2] = stream.readUnsignedWord();
										if (childrenIDs[i2] == 65535)
												childrenIDs[i2] = -1;
								}

						}
						else if (i == 107)
								interactable = false;
				}
				while (true);
		}

		private void readValues525(Stream stream)
		{
				do
				{
						int i = stream.readUnsignedByte();
						if (i == 0)
								return;
						if (i == 1)
						{
								int j = stream.readUnsignedByte();
								models = new int[j];
								for (int j1 = 0; j1 < j; j1++)
								{
										models[j1] = stream.readUnsignedWord();
								}

						}
						else if (i == 2)
								name = stream.readString().replaceAll("_", " ");
						else if (i == 3)
								description = stream.readBytes();
						else if (i == 12)
								size = stream.readSignedByte();
						else if (i == 13)
								standAnim = stream.readUnsignedWord();
						else if (i == 14)
								walkAnim = stream.readUnsignedWord();
						else if (i == 17)
						{
								walkAnim = stream.readUnsignedWord();
								turn180Sequence = stream.readUnsignedWord();
								turnRightSequence = stream.readUnsignedWord();
								turnLeftSequence = stream.readUnsignedWord();
								/*
								turn180Sequence = walkAnim;//not existing.
								turnRightSequence = walkAnim;//not existing.
								turnLeftSequence = walkAnim;//not existing.
								*/
								if (walkAnim == 65535)
										walkAnim = -1;
								if (turn180Sequence == 65535)
										turn180Sequence = -1;
								if (turnRightSequence == 65535)
										turnRightSequence = -1;
								if (turnLeftSequence == 65535)
										turnLeftSequence = -1;
						}
						else if (i >= 30 && i < 40)
						{
								if (actions == null)
										actions = new String[5];
								actions[i - 30] = stream.readString();
								if (actions[i - 30].equalsIgnoreCase("hidden"))
										actions[i - 30] = null;
						}
						else if (i == 40)
						{
								int k = stream.readUnsignedByte();
								originalModelColour = new int[k];
								newModelColour = new int[k];
								for (int k1 = 0; k1 < k; k1++)
								{
										originalModelColour[k1] = stream.readUnsignedWord();
										newModelColour[k1] = stream.readUnsignedWord();
								}

						}
						else if (i == 60)
						{
								int l = stream.readUnsignedByte();
								faceModels = new int[l];
								for (int l1 = 0; l1 < l; l1++)
										faceModels[l1] = stream.readUnsignedWord();

						}
						else if (i == 90)
								stream.readUnsignedWord();
						else if (i == 91)
								stream.readUnsignedWord();
						else if (i == 92)
								stream.readUnsignedWord();
						else if (i == 93)
								showOnMinimap = false;
						else if (i == 95)
								combatLevel = stream.readUnsignedWord();
						else if (i == 97)
								scaleX = stream.readUnsignedWord();
						else if (i == 98)
								scaleZ = stream.readUnsignedWord();
						else if (i == 99)
								aBoolean93 = true;
						else if (i == 100)
								brightness = stream.readSignedByte();
						else if (i == 101)
								contrast = stream.readSignedByte() * 5;
						else if (i == 102)
								headicons = stream.readUnsignedWord();
						else if (i == 103)
								turnSpeed = stream.readUnsignedWord();
						else if (i == 106)
						{
								varbit = stream.readUnsignedWord();
								if (varbit == 65535)
										varbit = -1;
								setting = stream.readUnsignedWord();
								if (setting == 65535)
										setting = -1;
								int i1 = stream.readUnsignedByte();
								childrenIDs = new int[i1 + 1];
								for (int i2 = 0; i2 <= i1; i2++)
								{
										childrenIDs[i2] = stream.readUnsignedWord();
										if (childrenIDs[i2] == 65535)
												childrenIDs[i2] = -1;
								}

						}
						else if (i == 107)
								interactable = false;
				}
				while (true);
		}

		private EntityDefinition()
		{
				turnLeftSequence = -1;
				varbit = -1;
				turn180Sequence = -1;
				setting = -1;
				combatLevel = -1;
				walkAnim = -1;
				size = 1;
				headicons = -1;
				standAnim = -1;
				type = -1L;
				turnSpeed = 32;
				turnRightSequence = -1;
				interactable = true;
				scaleZ = 128;
				showOnMinimap = true;
				scaleX = 128;
				aBoolean93 = false;
		}

		public int turnLeftSequence;

		private static int cachePosition;

		private int varbit;

		public int turn180Sequence;

		private int setting;

		private static Stream stream602;

		private static Stream stream474;

		private static Stream stream525;

		public int combatLevel;

		public String name;

		public String actions[];

		public int walkAnim;

		public byte size;

		private int[] newModelColour;

		private static int[] streamIndices602;

		private static int[] streamIndices474;

		private static int[] streamIndices525;

		private int[] faceModels;

		public int headicons;

		private int[] originalModelColour;

		public int standAnim;

		public long type;

		public int turnSpeed;

		private static EntityDefinition[] cache;

		public static Client clientInstance;

		public int turnRightSequence;

		public boolean interactable;

		private int brightness;

		private int scaleZ;

		public boolean showOnMinimap;

		public int childrenIDs[];

		public byte description[];

		private int scaleX;

		private int contrast;

		public boolean aBoolean93; // Cannot find refactor.

		private int[] models;

		public static MRUNodes mruNodes = new MRUNodes(30);

}