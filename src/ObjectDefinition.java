public final class ObjectDefinition
{

		public static void applyTexturing(Model model, int id)
		{
				// Venenatis webs texture on floor and triangle shaped web that is in many web places.
				if (id == 26764 || id == 705)
				{
						model.setTexture(26);
				}
		}

		public static ObjectDefinition forID(int objectId)
		{
				if (objectId > streamIndices.length - 1)
				{
						return null;
				}

				objectId = objectIdFixes(objectId);

				if (objectId > streamIndices.length)
				{
						objectId = streamIndices.length - 1;
				}
				for (int j = 0; j < 20; j++)
				{
						if (cache[j].type == objectId)
						{
								return cache[j];
						}
				}
				cacheIndex = (cacheIndex + 1) % 20;
				ObjectDefinition objectDef = cache[cacheIndex];
				stream.currentOffset = streamIndices[objectId];
				objectDef.type = objectId;
				objectDef.setDefaults();
				objectDef.readValues(stream);

				boolean debug = false;
				int objectToDebug = 444;
				if (debug)
				{
						if (objectId == objectToDebug)
						{
								Utility.print("Name: " + objectDef.name);
								Utility.print("Animation: " + objectDef.sequence);

								if (objectDef.models != null)
								{
										for (int index = 0; index < objectDef.models.length; index++)
										{
												Utility.print("objectDef.models[" + index + "] = " + objectDef.models[index] + ";");
										}
								}
						}
				}
				debug(objectDef);


				if (objectDef.models != null)
				{
						if (objectDef.models[0] == 1105)
						{
								objectDef.models[0] = 64602;
								return objectDef;
						}
						else if (objectDef.models[0] == 7699)
						{
								objectDef.models[0] = 64606;
								return objectDef;
						}
						else if (objectDef.models[0] == 10530)
						{
								objectDef.models[0] = 64600;
								return objectDef;
						}
						else if (objectDef.models[0] == 24029)
						{
								objectDef.models[0] = 64603;
								return objectDef;
						}
						else if (objectDef.models[0] == 27732)
						{
								objectDef.models[0] = 64605;
								return objectDef;
						}
						else if (objectDef.models[0] == 27729)
						{
								objectDef.models[0] = 64604;
								return objectDef;
						}
						else if (objectDef.models[0] == 11045)
						{
								objectDef.models[0] = 64601;
								return objectDef;
						}

				}
				boolean enable = true;
				if (enable)
				{
						switch (objectId)
						{
								// Invisible rocks at edgeville wilderness.
								case 444:
								case 445:
								case 446:
								case 1281:
										objectDef.blocksWalk = false;
										objectDef.blocksProjectiles = false;
										break;

								case 27990:
										objectDef.models[0] = 64795;
										break;
								case 16406:
										objectDef.models[0] = 64810;
										break;
								case 27557:
										objectDef.models[0] = 64810;
										break;
								case 27878:
										objectDef.models[0] = 64811;
										break;
								case 27980:
										objectDef.models[0] = 64813;
										break;



								case 27277:
										objectDef.name = "Blood key chest";
										objectDef.actions = new String[5];
										break;
								case 29300:
										objectDef.name = "Box of Health";
										objectDef.contrast = 30;
										objectDef.sizeX = 1;
										objectDef.sizeY = 1;
										objectDef.models = new int[1];
										objectDef.models[0] = 64764;
										objectDef.actions = new String[5];
										objectDef.actions[0] = "Open";
										objectDef.hasActions = true;
										objectDef.blocksWalk = true;
										break;

								case 16469:
										objectDef.sequence = 13718;
										break;
								// Anvil.
								case 2031:
										objectDef.actions = new String[5];
										break;

								// Glitched chest/snake at Duel arena.
								case 3193:
										objectDef.sequence = -1;
										break;
								// Altar of the occult.
								case 29150:
										objectDef.sequence = 13717;
										objectDef.actions = new String[5];
										objectDef.actions[0] = "Spellbook-swap";
										objectDef.actions[1] = "Modern";
										objectDef.actions[2] = "Ancient magicks";
										objectDef.actions[3] = "Lunar";
										break;

								case 25156:
										if (!Client.clientRevision("474"))
										{
												objectDef.sequence = 13715;
										}
										break;
								case 25155:
										if (!Client.clientRevision("474"))
										{
												objectDef.sequence = 13716;
										}
										break;

								case 732:
										if (!Client.clientRevision("474"))
										{
												objectDef.sequence = 13705;
										}
										break;

								case 2640:
										objectDef.actions = new String[5];
										objectDef.actions[0] = "Restore prayer";
										break;
								case 563:
										objectDef.name = "Highscores Statue";
										objectDef.actions = new String[5];
										objectDef.actions[0] = "Inspect";
										objectDef.description = "The statue of the greatest.".getBytes();
										break;

								case 7800:
										objectDef.name = "Mysterious cape";
										objectDef.description = "Mysterious cape is hanging here.".getBytes();
										objectDef.sizeX = 2;
										objectDef.sizeY = 1;
										objectDef.models = new int[1];
										objectDef.models[0] = 64126;
										objectDef.actions = new String[5];
										objectDef.actions[0] = "Investigate";
										objectDef.hasActions = true;
										objectDef.blocksWalk = true;
										objectDef.adjustsToTerrain = false;
										objectDef.isFlatShaded = false;
										break;
								case 26350:
										objectDef.models[0] = 64170;
										objectDef.models[1] = 64171;
										break;
								case 26353:
										objectDef.models[0] = 64172;
										break;
								case 26355:
										objectDef.models[0] = 64173;
										break;
								case 26357:
										objectDef.models[0] = 64174;
										break;
								case 26359:
										objectDef.models[0] = 64175;
										objectDef.models[1] = 64176;
										break;
								case 26360:
										objectDef.models[0] = 64177;
										break;
								case 26362:
										objectDef.models[0] = 64178;
										break;
								case 26426:
										objectDef.models[0] = 64180;
										break;
								case 26435:
										objectDef.models[0] = 64313;
										objectDef.models[1] = 64314;
										objectDef.models[2] = 64181;
										break;

								case 26440:
										objectDef.models[1] = 64182;
										objectDef.models[0] = 64545;
										break;
								case 26423:
										objectDef.models[1] = 64179;
										objectDef.models[0] = 64312;
										break;
								case 26441:
										objectDef.models[0] = 64183;
										break;
								case 26471:
										objectDef.models[0] = 64184;
										break;
								case 26472:
										objectDef.models[0] = 64185;
										break;
								case 26473:
										objectDef.models[0] = 64186;
										break;
								case 26475:
										objectDef.models[0] = 64187;
										break;
								case 26481:
										objectDef.models[0] = 64188;
										break;
								case 84:
										objectDef.models[0] = 64189;
										objectDef.models[2] = 64190;
										objectDef.models[4] = 64191;
										break;
								case 85:
										objectDef.models[0] = 64189;
										objectDef.models[2] = 64190;
										objectDef.models[4] = 64191;
										break;
								case 26348:
										objectDef.models[0] = 64192;
										objectDef.models[1] = 64193;
										break;
								case 26349:
										objectDef.models[0] = 64194;
										objectDef.models[1] = 64195;
										break;
								case 26354:
										objectDef.models[0] = 64196;
										break;
								case 26356:
										objectDef.models[0] = 64197;
										break;
								case 26358:
										objectDef.models[0] = 64198;
										break;
								case 26361:
										objectDef.models[0] = 64199;
										break;
								case 26463:
										objectDef.models[0] = 64200;
										break;
								case 26464:
										objectDef.models[0] = 64200;
										break;
								case 26465:
										objectDef.models[0] = 64201;
										break;
								case 26466:
										objectDef.models[0] = 64201;
										break;
								case 26467:
										objectDef.models[0] = 64202;
										break;
								case 26468:
										objectDef.models[0] = 64202;
										break;
								case 26469:
										objectDef.models[1] = 64203;
										break;
								case 26476:
										objectDef.models[0] = 64204;
										break;
								case 26477:
										objectDef.models[0] = 64205;
										break;
								case 26478:
										objectDef.models[0] = 64206;
										break;
								case 26480:
										objectDef.models[0] = 64207;
										break;
								case 26485:
										objectDef.models[0] = 64208;
										break;
								case 26351:
										objectDef.models[0] = 64209;
										objectDef.models[1] = 64210;
										break;
								case 26430:
										objectDef.models[0] = 64211;
										break;
								case 26368:
										objectDef.models[0] = 64212;
										break;
								case 4451:
										objectDef.models[0] = 64189;
										objectDef.models[2] = 64190;
										objectDef.models[4] = 64191;
										break;
								case 1247:
										objectDef.models[0] = 64213;
										break;
								case 1162:
										objectDef.models[0] = 64214;
										break;
								case 83:
										objectDef.models[0] = 64189;
										objectDef.models[2] = 64190;
										objectDef.models[4] = 64191;
										break;
								case 1250:
										objectDef.models[0] = 64213;
										break;
								case 1252:
										objectDef.models[0] = 64213;
										break;
								case 10062:
										objectDef.models[0] = 64215;
										break;
								case 10063:
										objectDef.models[0] = 64216;
										break;
								case 10643:
										objectDef.models[0] = 64217;
										break;
								case 10644:
										objectDef.models[0] = 64218;
										break;
								case 10645:
										objectDef.models[1] = 64219;
										break;
								case 10646:
										objectDef.models[2] = 64220;
										break;
								case 10648:
										objectDef.models[2] = 64221;
										break;
								case 10649:
										objectDef.models[2] = 64221;
										break;
								case 10657:
										objectDef.models[0] = 64222;
										break;
								case 10666:
										objectDef.models[0] = 64223;
										break;
								case 10667:
										objectDef.models[0] = 64223;
										break;
								case 10668:
										objectDef.models[1] = 64224;
										break;
								case 10669:
										objectDef.models[1] = 64224;
										break;
								case 10674:
										objectDef.models[1] = 64225;
										objectDef.models[2] = 64226;
										break;
								case 10675:
										objectDef.models[0] = 64227;
										break;
								case 10676:
										objectDef.models[1] = 64228;
										objectDef.models[2] = 64229;
										break;
								case 10677:
										objectDef.models[1] = 64228;
										objectDef.models[2] = 64229;
										break;
								case 10678:
										objectDef.models[0] = 64230;
										break;
								case 10686:
										objectDef.models[1] = 64231;
										break;
								case 11711:
										objectDef.models[0] = 64232;
										break;
								case 11714:
										objectDef.models[0] = 64233;
										break;
								case 15810:
										objectDef.models[0] = 64234;
										break;
								case 16155:
										objectDef.models[0] = 64235;
										break;
								case 5112:
										objectDef.models[0] = 64236;
										break;
								case 5114:
										objectDef.models[0] = 64236;
										break;
								case 26262:
										objectDef.models[0] = 64237;
										break;
								case 13466:
										objectDef.models[0] = 64238;
										break;
								case 13471:
										objectDef.models[0] = 64239;
										break;
								case 13472:
										objectDef.models[0] = 64240;
										break;
								case 13474:
										objectDef.models[0] = 64241;
										break;
								case 27564:
										objectDef.models[0] = 64560;
										objectDef.models[2] = 64242;
										break;
								case 27565:
										objectDef.models[0] = 64243;
										objectDef.models[1] = 64244;
										break;
								case 27566:
										objectDef.models[1] = 64245;
										break;
								case 27567:
										objectDef.models[0] = 64246;
										break;
								case 27568:
										objectDef.models[0] = 64247;
										break;
								case 27571:
										objectDef.models[0] = 64248;
										break;
								case 27572:
										objectDef.models[0] = 64249;
										break;
								case 27573:
										objectDef.models[0] = 64250;
										break;
								case 27574:
										objectDef.models[0] = 64251;
										break;
								case 27575:
										objectDef.models[0] = 64252;
										break;
								case 27576:
										objectDef.models[0] = 64253;
										break;
								case 27583:
										objectDef.models[0] = 64254;
										break;
								case 27584:
										objectDef.models[0] = 64255;
										objectDef.models[1] = 64256;
										break;
								case 27585:
										objectDef.models[2] = 64257;
										break;
								case 27589:
										objectDef.models[0] = 64258;
										break;
								case 27590:
										objectDef.models[0] = 64259;
										break;
								case 27592:
										objectDef.models[0] = 64260;
										break;
								case 27594:
										objectDef.models[0] = 64261;
										objectDef.models[1] = 64262;
										break;
								case 27603:
										objectDef.models[1] = 64263;
										break;
								case 27604:
										objectDef.models[0] = 64264;
										break;
								case 27616:
										objectDef.models[0] = 64265;
										break;
								case 27620:
										objectDef.models[0] = 64266;
										break;
								case 27621:
										objectDef.models[0] = 64267;
										break;
								case 27622:
										objectDef.models[0] = 64268;
										break;
								case 27623:
										objectDef.models[0] = 64269;
										break;
								case 27625:
										objectDef.models[0] = 64270;
										break;
								case 27626:
										objectDef.models[0] = 64271;
										break;
								case 27627:
										objectDef.models[0] = 64272;
										break;
								case 27630:
										objectDef.models[0] = 64271;
										break;
								case 27631:
										objectDef.models[0] = 64272;
										break;
								case 27638:
										objectDef.models[0] = 64273;
										break;
								case 27649:
										objectDef.models[0] = 64274;
										break;
								case 27650:
										objectDef.models[0] = 64275;
										break;
								case 27651:
										objectDef.models[0] = 64276;
										break;
								case 27655:
										objectDef.models[0] = 64277;
										break;
								case 27659:
										objectDef.models[0] = 64278;
										break;
								case 27660:
										objectDef.models[0] = 64279;
										break;
								case 27758:
										objectDef.models[0] = 64236;
										break;
								case 26352:
										objectDef.models[0] = 64280;
										break;
								case 26497:
										objectDef.models[0] = 64281;
										break;
								case 26499:
										objectDef.models[0] = 64282;
										break;
								case 26364:
										objectDef.models[0] = 64283;
										break;
								case 26520:
										objectDef.models[0] = 64284;
										objectDef.models[1] = 64285;
										objectDef.models[2] = 64286;
										break;
								case 26522:
										objectDef.models[0] = 64287;
										break;
								case 26523:
										objectDef.models[0] = 64288;
										objectDef.models[1] = 64289;
										objectDef.models[2] = 64290;
										break;
								case 26524:
										objectDef.models[0] = 64291;
										break;
								case 26525:
										objectDef.models[0] = 64292;
										break;
								case 26526:
										objectDef.models[0] = 64293;
										objectDef.models[1] = 64294;
										objectDef.models[2] = 64295;
										break;
								case 26527:
										objectDef.models[0] = 64296;
										break;
								case 26528:
										objectDef.models[0] = 64297;
										break;
								case 26365:
										objectDef.models[0] = 64298;
										objectDef.models[1] = 64299;
										break;
								case 7457:
										objectDef.models[0] = 64300;
										break;
								case 7491:
										objectDef.models[0] = 64300;
										break;
								case 14572:
										objectDef.models[0] = 64213;
										break;
								case 14601:
										objectDef.models[0] = 64213;
										break;
								case 14740:
										objectDef.models[0] = 64236;
										break;
								case 14643:
										objectDef.models[0] = 64213;
										break;
								case 14452:
										objectDef.models[0] = 64301;
										break;
								case 4909:
										objectDef.models[0] = 64189;
										objectDef.models[2] = 64190;
										objectDef.models[4] = 64191;
										break;
								case 26724:
										objectDef.models[0] = 64191;
										break;
								case 14181:
										objectDef.models[0] = 64302;
										break;
								case 14183:
										objectDef.models[0] = 64303;
										break;
								case 14188:
										objectDef.models[0] = 64304;
										break;
								case 28505:
										objectDef.models[0] = 64305;
										break;
								case 28507:
										objectDef.models[0] = 64306;
										break;
								case 28513:
										objectDef.models[0] = 64307;
										break;
								case 28540:
										objectDef.models[1] = 64308;
										break;
								case 8961:
										objectDef.models[0] = 64309;
										break;
								case 28511:
										objectDef.models[0] = 64310;
										break;
								case 14702:
										objectDef.models[0] = 64213;
										break;
								case 5539:
										objectDef.models[0] = 64214;
										break;
								case 5540:
										objectDef.models[0] = 64214;
										break;
								case 5541:
										objectDef.models[0] = 64214;
										break;
								case 7487:
										objectDef.models[0] = 64300;
										break;
								case 7455:
										objectDef.models[0] = 64300;
										break;
								case 7459:
										objectDef.models[0] = 64300;
										break;
								case 7489:
										objectDef.models[0] = 64300;
										break;
								case 7493:
										objectDef.models[0] = 64300;
										break;
								case 26521:
										objectDef.models[0] = 64311;
										break;
								case 17237:
										objectDef.models[1] = 64546;
										objectDef.models[0] = 64345;
										break;
								case 26436:
										objectDef.models[0] = 64315;
										break;
								case 26483:
										objectDef.models[0] = 64316;
										break;
								case 26484:
										objectDef.models[0] = 64317;
										break;
								case 26486:
										objectDef.models[0] = 64318;
										break;
								case 26493:
										objectDef.models[0] = 64319;
										break;
								case 2752:
										objectDef.models[0] = 64320;
										break;
								case 26366:
										objectDef.models[0] = 64321;
										break;
								case 26461:
										objectDef.models[0] = 64322;
										break;
								case 26474:
										objectDef.models[0] = 64323;
										break;
								case 26510:
										objectDef.models[0] = 64324;
										break;
								//TODO ##OBJECT model 27732, Gwd
								case 26511:
										objectDef.models[0] = 64605;
										break;
								case 16431:
										objectDef.models[0] = 64325;
										break;
								case 26427:
										objectDef.models[1] = 64325;
										objectDef.models[2] = 64326;
										break;
								case 26431:
										objectDef.models[0] = 64327;
										break;
								case 16399:
										objectDef.models[0] = 64328;
										break;
								case 18405:
										objectDef.models[0] = 64328;
										break;
								case 26367:
										objectDef.models[0] = 64328;
										break;
								case 21761:
										objectDef.models[0] = 64329;
										break;
								case 21762:
										objectDef.models[0] = 64330;
										break;
								case 21763:
										objectDef.models[0] = 64331;
										break;
								case 21765:
										objectDef.models[0] = 64332;
										break;
								case 21766:
										objectDef.models[0] = 64333;
										break;
								case 21767:
										objectDef.models[0] = 64334;
										break;
								case 21769:
										objectDef.models[0] = 64335;
										break;
								case 21770:
										objectDef.models[0] = 64336;
										break;

								// Cerberus skull.
								case 21773:
										objectDef.models[0] = 64337;
										objectDef.sequence = 13704;
										break;
								case 23101:
										objectDef.models[0] = 64338;
										break;
								case 23102:
										objectDef.models[0] = 64339;
										break;
								case 23104:
										objectDef.models[0] = 64340;
										break;
								case 8932:
										objectDef.models[2] = 64341;
										break;
								case 8933:
										objectDef.models[2] = 64342;
										break;
								case 675:
										objectDef.models[0] = 64342;
										break;
								case 676:
										objectDef.models[0] = 64343;
										break;
								case 677:
										objectDef.models[0] = 64344;
										break;
								case 2745:
										objectDef.models[0] = 64345;
										break;

								//TODO ##OBJECT model 11045, Corporeal beast.
								case 6820:
										objectDef.models[2] = 64601;
										break;
								case 17658:
										objectDef.models[0] = 64346;
										break;
								case 1276:
										objectDef.models[0] = 64347;
										break;
								case 16411:
										objectDef.models[0] = 64348;
										break;
								case 7389:
										objectDef.models[0] = 64348;
										break;
								case 16393:
										objectDef.models[0] = 64348;
										break;
								case 16434:
										objectDef.models[0] = 64348;
										break;
								case 16438:
										objectDef.models[0] = 64348;
										break;
								case 23590:
										objectDef.models[0] = 64348;
										break;
								case 16394:
										objectDef.models[0] = 64348;
										break;

								//TODO ##OBJECT model 1105, New Duel arena clan wars.
								case 2738:
										objectDef.models[0] = 64602;
										break;
								case 2770:
										objectDef.models[0] = 64348;
										break;
								case 2771:
										objectDef.models[0] = 64348;
										break;
								case 2772:
										objectDef.models[0] = 64348;
										break;
								case 2775:
										objectDef.models[0] = 64348;
										break;
								case 7183:
										objectDef.models[0] = 64348;
										break;
								case 10095:
										objectDef.models[0] = 64349;
										break;
								case 16407:
										objectDef.models[0] = 64349;
										break;
								case 825:
										objectDef.models[0] = 64349;
										break;
								case 7054:
										objectDef.models[0] = 64350;
										break;
								case 16458:
										objectDef.models[0] = 64350;
										break;
								case 16459:
										objectDef.models[0] = 64350;
										break;
								case 16460:
										objectDef.models[0] = 64350;
										break;
								case 16461:
										objectDef.models[0] = 64350;
										break;
								case 16462:
										objectDef.models[0] = 64350;
										break;
								case 16463:
										objectDef.models[0] = 64350;
										break;
								case 17030:
										objectDef.models[0] = 64350;
										break;
								case 26301:
										objectDef.models[0] = 64350;
										break;
								case 16408:
										objectDef.models[0] = 64350;
										break;
								case 2739:
										objectDef.models[0] = 64350;
										break;
								case 2744:
										objectDef.models[0] = 64350;
										break;
								case 2767:
										objectDef.models[0] = 64350;
										break;
								case 7172:
										objectDef.models[0] = 64350;
										break;
								case 7176:
										objectDef.models[0] = 64351;
										break;
								case 7191:
										objectDef.models[0] = 64352;
										break;
								case 7431:
										objectDef.models[0] = 64353;
										break;
								case 7441:
										objectDef.models[0] = 64354;
										break;
								case 7442:
										objectDef.models[0] = 64355;
										break;
								case 7447:
										objectDef.models[0] = 64356;
										break;
								case 16433:
										objectDef.models[0] = 64357;
										break;
								case 16397:
										objectDef.models[0] = 64357;
										break;
								case 21807:
										objectDef.models[0] = 64357;
										break;

								//TODO ##OBJECT model 1105, Blood altar
								case 27120:
										objectDef.models[0] = 64602;
										break;
								case 27788:
										objectDef.models[0] = 64357;
										objectDef.models[1] = 64358;
										break;
								case 27789:
										objectDef.models[0] = 64359;
										break;
								case 27790:
										objectDef.models[0] = 64360;
										break;
								case 27791:
										objectDef.models[0] = 64361;
										break;
								case 27794:
										objectDef.models[0] = 64362;
										break;
								case 27795:
										objectDef.models[0] = 64363;
										break;
								case 27796:
										objectDef.models[0] = 64364;
										break;
								case 27798:
										objectDef.models[0] = 64365;
										break;
								case 27799:
										objectDef.models[0] = 64366;
										break;
								case 27800:
										objectDef.models[0] = 64367;
										objectDef.models[1] = 64368;
										break;
								case 27801:
										objectDef.models[0] = 64369;
										objectDef.models[1] = 64370;
										break;
								case 27802:
										objectDef.models[0] = 64371;
										break;
								case 27803:
										objectDef.models[0] = 64372;
										break;
								case 27804:
										objectDef.models[0] = 64373;
										break;
								case 27805:
										objectDef.models[0] = 64374;
										break;
								case 27806:
										objectDef.models[0] = 64375;
										break;
								case 27808:
										objectDef.models[0] = 64376;
										break;
								case 27809:
										objectDef.models[0] = 64377;
										break;
								case 27810:
										objectDef.models[0] = 64378;
										break;
								case 27811:
										objectDef.models[0] = 64379;
										break;
								case 27819:
										objectDef.models[0] = 64380;
										break;
								case 27834:
										objectDef.models[0] = 64381;
										break;
								case 27836:
										objectDef.models[0] = 64382;
										break;
								case 27837:
										objectDef.models[0] = 64383;
										break;
								case 27838:
										objectDef.models[0] = 64383;
										break;
								case 27839:
										objectDef.models[0] = 64383;
										break;
								case 27840:
										objectDef.models[0] = 64383;
										break;
								case 27841:
										objectDef.models[0] = 64384;
										break;
								case 27842:
										objectDef.models[0] = 64384;
										break;
								case 27843:
										objectDef.models[0] = 64384;
										break;
								case 27844:
										objectDef.models[0] = 64384;
										break;
								case 27845:
										objectDef.models[0] = 64385;
										break;
								case 27846:
										objectDef.models[0] = 64385;
										break;
								case 27847:
										objectDef.models[0] = 64385;
										break;
								case 27851:
										objectDef.models[0] = 64385;
										break;
								case 27852:
										objectDef.models[0] = 64386;
										break;
								case 27853:
										objectDef.models[0] = 64387;
										break;
								case 27854:
										objectDef.models[0] = 64388;
										break;
								case 27855:
										objectDef.models[0] = 64389;
										break;
								case 27856:
										objectDef.models[0] = 64390;
										break;
								case 27857:
										objectDef.models[0] = 64391;
										objectDef.models[1] = 64392;
										objectDef.models[2] = 64393;
										objectDef.models[3] = 64394;
										break;
								case 27858:
										objectDef.models[0] = 64395;
										objectDef.models[1] = 64396;
										break;
								case 27859:
										objectDef.models[0] = 64397;
										break;
								case 27860:
										objectDef.models[1] = 64398;
										break;
								case 27861:
										objectDef.models[0] = 64399;
										break;
								case 27862:
										objectDef.models[0] = 64400;
										break;
								case 27864:
										objectDef.models[0] = 64401;
										objectDef.models[1] = 64402;
										objectDef.models[3] = 64403;
										break;
								case 27865:
										objectDef.models[0] = 64404;
										objectDef.models[1] = 64405;
										objectDef.models[2] = 64406;
										objectDef.models[3] = 64407;
										break;
								case 27866:
										objectDef.models[0] = 64408;
										objectDef.models[1] = 64409;
										objectDef.models[2] = 64410;
										break;
								case 27867:
										objectDef.models[0] = 64411;
										objectDef.models[1] = 64412;
										break;
								case 27868:
										objectDef.models[0] = 64413;
										objectDef.models[1] = 64414;
										break;
								case 27870:
										objectDef.models[0] = 64415;
										break;
								case 27871:
										objectDef.models[0] = 64416;
										break;
								case 27874:
										objectDef.models[0] = 64417;
										break;
								case 27875:
										objectDef.models[0] = 64418;
										break;
								case 27876:
										objectDef.models[0] = 64419;
										break;
								case 27877:
										objectDef.models[0] = 64420;
										break;
								case 27881:
										objectDef.models[0] = 64421;
										break;
								case 27882:
										objectDef.models[0] = 64422;
										break;
								case 27885:
										objectDef.models[0] = 64423;
										break;
								case 27886:
										objectDef.models[0] = 64424;
										break;
								case 27889:
										objectDef.models[0] = 64425;
										break;
								case 27890:
										objectDef.models[0] = 64426;
										break;
								case 27891:
										objectDef.models[0] = 64427;
										break;
								case 27895:
										objectDef.models[0] = 64428;
										break;
								case 27896:
										objectDef.models[0] = 64429;
										break;
								case 27897:
										objectDef.models[0] = 64430;
										break;
								case 27899:
										objectDef.models[0] = 64431;
										objectDef.models[1] = 64432;
										break;
								case 27900:
										objectDef.models[0] = 64433;
										objectDef.models[1] = 64434;
										break;
								case 27901:
										objectDef.models[0] = 64435;
										objectDef.models[1] = 64435;
										break;
								case 27902:
										objectDef.models[1] = 64435;
										break;
								case 27903:
										objectDef.models[1] = 64436;
										break;
								case 27904:
										objectDef.models[0] = 64436;
										objectDef.models[1] = 64437;
										break;
								case 27905:
										objectDef.models[0] = 64438;
										objectDef.models[1] = 64438;
										break;
								case 27907:
										objectDef.models[0] = 64438;
										break;
								case 27909:
										objectDef.models[0] = 64439;
										objectDef.models[1] = 64440;
										break;
								case 27910:
										objectDef.models[0] = 64441;
										objectDef.models[1] = 64442;
										break;
								case 27911:
										objectDef.models[0] = 64443;
										objectDef.models[1] = 64443;
										break;
								case 27912:
										objectDef.models[0] = 64443;
										objectDef.models[1] = 64444;
										break;
								case 27913:
										objectDef.models[0] = 64445;
										objectDef.models[1] = 64445;
										break;
								case 27916:
										objectDef.models[0] = 64445;
										break;
								case 27918:
										objectDef.models[0] = 64446;
										break;
								case 27920:
										objectDef.models[0] = 64447;
										break;
								case 27921:
										objectDef.models[0] = 64448;
										break;
								case 27922:
										objectDef.models[0] = 64449;
										break;
								case 27923:
										objectDef.models[0] = 64450;
										break;
								case 27937:
										objectDef.models[0] = 64451;
										objectDef.models[1] = 64452;
										objectDef.models[2] = 64453;
										objectDef.models[3] = 64454;
										break;
								case 27938:
										objectDef.models[0] = 64455;
										objectDef.models[2] = 64456;
										break;
								case 27939:
										objectDef.models[0] = 64457;
										objectDef.models[1] = 64458;
										break;
								case 27940:
										objectDef.models[0] = 64459;
										objectDef.models[1] = 64460;
										break;
								case 27941:
										objectDef.models[0] = 64461;
										objectDef.models[1] = 64462;
										break;
								case 27942:
										objectDef.models[0] = 64463;
										objectDef.models[1] = 64464;
										break;
								case 27943:
										objectDef.models[0] = 64465;
										break;
								case 27944:
										objectDef.models[0] = 64466;
										break;
								case 27978:
										objectDef.models[0] = 64467;
										break;
								case 28456:
										objectDef.models[0] = 64468;
										break;
								case 28459:
										objectDef.models[0] = 64469;
										break;
								case 28461:
										objectDef.models[0] = 64469;
										break;
								case 28462:
										objectDef.models[0] = 64469;
										break;
								case 21806:
										objectDef.models[0] = 64469;
										break;
								case 27787:
										objectDef.models[0] = 64469;
										break;
								case 27879:
										objectDef.models[0] = 64470;
										break;
								case 27883:
										objectDef.models[0] = 64471;
										break;
								case 27887:
										objectDef.models[0] = 64472;
										break;
								case 27892:
										objectDef.models[0] = 64473;
										break;
								case 27893:
										objectDef.models[0] = 64474;
										break;
								case 27894:
										objectDef.models[0] = 64475;
										break;
								case 27898:
										objectDef.models[0] = 64796;
										objectDef.models[1] = 64797;
										break;
								case 27906:
										objectDef.models[0] = 64796;
										break;
								case 27908:
										objectDef.models[0] = 64796;
										objectDef.models[1] = 64797;
										break;
								case 27914:
										objectDef.models[0] = 64796;
										break;
								case 27915:
										objectDef.models[0] = 64477;
										break;
								case 27917:
										objectDef.models[0] = 64478;
										break;
								case 27933:
										objectDef.models[0] = 64479;
										objectDef.models[1] = 64480;
										break;
								case 27945:
										objectDef.models[0] = 64481;
										objectDef.models[1] = 64482;
										objectDef.models[2] = 64483;
										break;
								case 27946:
										objectDef.models[0] = 64484;
										break;
								case 27947:
										objectDef.models[0] = 64485;
										objectDef.models[1] = 64486;
										break;
								case 27948:
										objectDef.models[0] = 64487;
										break;
								case 27949:
										objectDef.models[0] = 64488;
										objectDef.models[1] = 64489;
										break;
								case 27952:
										objectDef.models[0] = 64490;
										break;
								case 27953:
										objectDef.models[0] = 64491;
										break;
								case 27955:
										objectDef.models[0] = 64492;
										break;
								case 27956:
										objectDef.models[0] = 64493;
										break;
								case 27957:
										objectDef.models[0] = 64494;
										break;
								case 27958:
										objectDef.models[0] = 64495;
										break;
								case 27959:
										objectDef.models[0] = 64496;
										break;
								case 27960:
										objectDef.models[0] = 64497;
										break;
								case 27961:
										objectDef.models[0] = 64498;
										break;
								case 27962:
										objectDef.models[0] = 64499;
										break;
								case 27963:
										objectDef.models[0] = 64500;
										break;
								case 27964:
										objectDef.models[0] = 64501;
										break;
								case 27965:
										objectDef.models[0] = 64502;
										break;
								case 27966:
										objectDef.models[0] = 64503;
										break;
								case 27967:
										objectDef.models[0] = 64504;
										break;
								case 27969:
										objectDef.models[0] = 64505;
										break;
								case 27970:
										objectDef.models[0] = 64506;
										break;
								case 27971:
										objectDef.models[0] = 64507;
										break;
								case 27972:
										objectDef.models[0] = 64508;
										break;
								case 27973:
										objectDef.models[0] = 64509;
										break;
								case 27974:
										objectDef.models[0] = 64510;
										break;
								case 27976:
										objectDef.models[0] = 64511;
										break;
								case 27977:
										objectDef.models[0] = 64512;
										break;
								case 15461:
										objectDef.models[0] = 64513;
										break;
								case 27595:
										objectDef.models[1] = 64514;
										break;
								case 27637:
										objectDef.models[0] = 64515;
										break;
								case 27653:
										objectDef.models[0] = 64516;
										break;
								case 27682:
										objectDef.models[0] = 64517;
										break;
								case 27688:
										objectDef.models[0] = 64518;
										break;
								case 27700:
										objectDef.models[0] = 64519;
										break;
								case 27764:
										objectDef.models[0] = 64520;
										break;
								case 27884:
										objectDef.models[0] = 64521;
										break;
								case 2741:
										objectDef.models[0] = 64522;
										break;
								case 16427:
										objectDef.models[0] = 64522;
										break;
								case 26303:
										objectDef.models[0] = 64522;
										break;
								case 21804:
										objectDef.models[0] = 64522;
										break;
								case 26519:
										objectDef.models[0] = 64522;
										break;
								case 26457:
										objectDef.models[0] = 64523;
										break;
								case 26514:
										objectDef.models[0] = 64524;
										break;

								//TODO ##OBJECT model 27729, Gwd
								case 26515:
										objectDef.models[0] = 64604;
										break;
								case 16553:
										objectDef.models[0] = 64525;
										break;
								case 2742:
										objectDef.models[0] = 64525;
										break;
								case 11969:
										objectDef.models[0] = 64525;
										break;
								case 16449:
										objectDef.models[0] = 64526;
										break;
								case 10627:
										objectDef.models[0] = 64526;
										break;
								case 16390:
										objectDef.models[0] = 64526;
										break;
								case 16416:
										objectDef.models[0] = 64526;
										break;
								case 16435:
										objectDef.models[0] = 64526;
										break;
								case 16443:
										objectDef.models[0] = 64526;
										break;
								case 16403:
										objectDef.models[0] = 64526;
										break;
								case 16421:
										objectDef.models[0] = 64526;
										break;
								case 16422:
										objectDef.models[0] = 64526;
										break;
								case 16439:
										objectDef.models[0] = 64526;
										break;
								case 16444:
										objectDef.models[0] = 64526;
										break;
								case 17410:
										objectDef.models[0] = 64526;
										break;
								case 5315:
										objectDef.models[2] = 64526;
										break;
								case 5316:
										objectDef.models[2] = 64526;
										break;
								case 5317:
										objectDef.models[2] = 64526;
										break;
								case 5318:
										objectDef.models[2] = 64526;
										break;
								case 8721:
										objectDef.models[0] = 64526;
										break;
								case 16412:
										objectDef.models[0] = 64526;
										break;
								case 16413:
										objectDef.models[0] = 64526;
										break;
								case 364:
										objectDef.models[0] = 64526;
										break;
								case 2733:
										objectDef.models[0] = 64527;
										break;
								case 2764:
										objectDef.models[0] = 64527;
										break;
								case 8723:
										objectDef.models[0] = 64527;
										break;
								case 16446:
										objectDef.models[0] = 64527;
										break;
								case 16453:
										objectDef.models[0] = 64527;
										break;
								case 10159:
										objectDef.models[0] = 64527;
										break;
								case 16430:
										objectDef.models[0] = 64527;
										break;
								case 16452:
										objectDef.models[0] = 64527;
										break;
								case 16424:
										objectDef.models[0] = 64527;
										break;
								case 26185:
										objectDef.models[0] = 64527;
										break;
								case 16395:
										objectDef.models[0] = 64528;
										break;
								case 17271:
										objectDef.models[0] = 64528;
										break;
								case 18138:
										objectDef.models[0] = 64528;
										break;
								case 21805:
										objectDef.models[0] = 64528;
										break;
								case 18409:
										objectDef.models[0] = 64528;
										break;
								case 20984:
										objectDef.models[0] = 64528;
										break;
								case 12299:
										objectDef.models[0] = 64528;
										break;
								case 28501:
										objectDef.models[0] = 64529;
										break;
								case 28502:
										objectDef.models[0] = 64530;
										break;
								case 28514:
										objectDef.models[0] = 64531;
										break;
								case 13435:
										objectDef.models[0] = 64532;
										break;
								case 13440:
										objectDef.models[0] = 64533;
										break;
								case 28500:
										objectDef.models[0] = 64534;
										break;
								case 28503:
										objectDef.models[0] = 64535;
										break;
								case 28504:
										objectDef.models[0] = 64536;
										break;
								case 28509:
										objectDef.models[0] = 64537;
										break;
								case 28510:
										objectDef.models[0] = 64538;
										break;
								case 28512:
										objectDef.models[0] = 64539;
										break;
								case 28546:
										objectDef.models[0] = 64540;
										break;
								case 28548:
										objectDef.models[0] = 64541;
										break;
								case 28550:
										objectDef.models[0] = 64542;
										break;
								case 28508:
										objectDef.models[0] = 64543;
										break;
								case 2756:
										objectDef.models[0] = 64544;
										break;
								case 16396:
										objectDef.models[0] = 64544;
										break;

								//TODO ##OBJECT model 1105, New Duel arena clan wars area
								case 738:
										objectDef.models[0] = 64602;
										break;

								//TODO ##OBJECT model 7699, New Duel arena clan wars area
								case 7514:
										objectDef.models[0] = 64606;
										break;
								case 16448:
										objectDef.models[0] = 64544;
										break;
								case 16410:
										objectDef.models[0] = 64544;
										break;
								case 16401:
										objectDef.models[0] = 64544;
										break;
								case 16388:
										objectDef.models[0] = 64544;
										break;
								case 16389:
										objectDef.models[0] = 64544;
										break;
								case 16392:
										objectDef.models[0] = 64544;
										break;
								case 16554:
										objectDef.models[0] = 64544;
										break;
								case 2097:
										objectDef.actions = new String[5];
										objectDef.models[0] = 64544;
										break;
								case 2743:
										objectDef.models[0] = 64545;
										break;
								case 2759:
										objectDef.models[0] = 64545;
										break;
								case 11696:
										objectDef.models[0] = 64547;
										break;
								case 9371:
										objectDef.models[0] = 64548;
										break;
								case 10651:
										objectDef.models[0] = 64549;
										break;


								//TODO ##OBJECT model 10530, G.E
								case 10652:
										objectDef.models[0] = 64600;
										break;


								//TODO ##OBJECT model 24029, G.E
								case 10689:
										objectDef.models[0] = 64603;
										break;
								case 10692:
										objectDef.models[0] = 64550;
										break;
								case 10694:
										objectDef.models[0] = 64551;
										break;
								case 10706:
										objectDef.models[0] = 64552;
										break;
								case 10711:
										objectDef.models[0] = 64553;
										break;
								case 10712:
										objectDef.models[0] = 64554;
										break;
								case 10713:
										objectDef.models[0] = 64555;
										break;
								case 11705:
										objectDef.models[0] = 64556;
										break;
								case 11706:
										objectDef.models[0] = 64557;
										break;
								case 13473:
										objectDef.models[0] = 64558;
										break;
								case 28837:
										objectDef.models[0] = 64559;
										break;
								case 27652:
										objectDef.models[0] = 64561;
										break;
								case 27675:
										objectDef.models[0] = 64562;
										break;
								case 27982:
										objectDef.models[0] = 64563;
										break;
								case 27983:
										objectDef.models[0] = 64564;
										break;
								case 12531:
										objectDef.models[0] = 64565;
										break;
								case 26558:
										objectDef.models[0] = 64566;
										break;
								case 3263:
										objectDef.models[0] = 64566;
										break;
								case 26890:
										objectDef.models[0] = 64567;
										break;
								case 26925:
										objectDef.models[0] = 64568;
										break;
								case 26948:
										objectDef.models[0] = 64569;
										break;
								case 26893:
										objectDef.models[0] = 64570;
										break;
								case 26898:
										objectDef.models[0] = 64571;
										break;
								case 26932:
										objectDef.models[0] = 64572;
										break;
								case 26933:
										objectDef.models[0] = 64573;
										break;
								case 26934:
										objectDef.models[0] = 64574;
										break;
								case 3232:
										objectDef.models[0] = 64575;
										break;
								case 684:
										objectDef.models[0] = 64576;
										break;
								case 14180:
										objectDef.models[0] = 64576;
										break;
								case 3961:
										objectDef.models[0] = 64577;
										break;
								case 27250:
										objectDef.models[0] = 64577;
										break;
								case 27251:
										objectDef.models[0] = 64578;
										break;
								case 27504:
										objectDef.models[0] = 64579;
										break;
								case 27505:
										objectDef.models[0] = 64580;
										break;
								case 28649:
										objectDef.models[0] = 64581;
										break;
								case 28686:
										objectDef.models[0] = 64582;
										break;
								case 28690:
										objectDef.models[1] = 64583;
										break;
								case 28692:
										objectDef.models[1] = 64584;
										break;
								case 28695:
										objectDef.models[0] = 64585;
										break;
								case 28698:
										objectDef.models[0] = 64586;
										break;
								case 28699:
										objectDef.models[0] = 64587;
										break;
								case 28701:
										objectDef.models[0] = 64588;
										break;
								case 28702:
										objectDef.models[0] = 64589;
										break;
								case 28703:
										objectDef.models[0] = 64590;
										break;
								case 28705:
										objectDef.models[0] = 64591;
										break;
								case 28708:
										objectDef.models[0] = 64592;
										break;
								case 28710:
										objectDef.models[0] = 64593;
										break;
								case 28712:
										objectDef.models[0] = 64594;
										break;
								case 28717:
										objectDef.models[0] = 64595;
										break;
								case 28718:
										objectDef.models[0] = 64596;
										break;
								case 28719:
										objectDef.models[0] = 64597;
										break;
								case 28720:
										objectDef.models[0] = 64598;
										break;
								case 28704:
										objectDef.models[0] = 64599;
										break;

						}
				}
				return objectDef;
		}

		private static int objectIdFixes(int objectId)
		{
				// Farming patch fix at Entrana, so weird.
				// the object is 8174, but all the data it grabs is from object 8210, other clients have this sorted out except mine..
				if (objectId == 8174)
				{
						return 8210;
				}
				if (objectId >= 2570 && objectId <= 2574)
				{
						objectId = 1;
				}

				// Change fire object to the 525/602 version so the animation of the fire works.
				if (!Client.clientRevision("474"))
				{
						if (objectId == 26185)
						{
								return 5249;
						}
				}
				return objectId;
		}

		private static void debug(ObjectDefinition objectDef)
		{



				/*
				if (objectDef.models != null)
				{
						for (int index = 0; index < objectDef.models.length; index++)
						{
								boolean collision = false;
								for (int a = 0; a < KeyBoardAction.test.size(); a++)
								{
										if (KeyBoardAction.test.get(a).equals(objectId + " " + index + " " + objectDef.models[index]))
										{
												collision = true;
												break;
										}
								}
								if (!collision)
								{
										KeyBoardAction.test.add(objectId + " " + index + " " + objectDef.models[index]);
										//Utility.print("Added model: " + objectDef.models[index]);
								}
						}
				}
				*/

				/*
								boolean collision = false;
								for (int a = 0; a < KeyBoardAction.test.size(); a++)
								{
										if (KeyBoardAction.test.get(a).equals(objectId + ""))
										{
												collision = true;
												break;
										}
								}
								
								if (!collision && objectDef.sequence >= 0)
								{
										KeyBoardAction.test.add(objectId + "");
										Utility.print(objectId + ",");
										objectDef.sequence = -1;
										return objectDef;
								}
								*/
				/*
				if (objectId == 732 && objectDef.sequence >= 0)
				{
						Utility.print(objectId + ",");
						objectDef.sequence = -1;
						return objectDef;
				}
				*/


				/*
			//@formatter:off
			int[] list = {
				25156, 
				25155,
			};
			//@formatter:on
			for (int index = 0; index < list.length; index++)
			{
					if (list[index] == objectId)
					{
							if (objectDef.sequence > -1)
							{
									boolean collision = false;
									for (int a = 0; a < KeyBoardAction.test.size(); a++)
									{
											if (KeyBoardAction.test.get(a).equals(objectDef.sequence + ", " + objectId))
											{
													collision = true;
													break;
											}
									}
									if (!collision)
									{
											KeyBoardAction.test.add(objectDef.sequence + ", " + objectId);
											Utility.print(objectDef.sequence + ", " + objectId);
									}
							}
					}
			}
*/
		}

		public void setDefaults()
		{
				models = null;
				modelTypes = null;
				name = null;
				description = null;
				srcColors = null;
				dstColors = null;
				sizeX = 1;
				sizeY = 1;
				blocksWalk = true;
				blocksProjectiles = true;
				hasActions = false;
				adjustsToTerrain = false;
				isFlatShaded = false;
				isSolid = false;
				sequence = -1;
				wallWidth = 16;
				brightness = 0;
				contrast = 0;
				actions = null;
				icon = -1;
				mapscene = -1;
				rotateLeft = false;
				castsShadow = true;
				scaleX = 128;
				scaleY = 128;
				scaleZ = 128;
				rotationFlags = 0;
				offsetX = 0;
				offsetY = 0;
				offsetZ = 0;
				isDecoration = false;
				ghost = false;
				holdsItemPiles = -1;
				varbit = -1;
				setting = -1;
				childrenIDs = null;
		}

		public void requestModels(OnDemandFetcher class42_sub1)
		{
				if (models == null)
						return;
				for (int j = 0; j < models.length; j++)
						class42_sub1.sendPassively(models[j] & 0xffff, 0);
		}

		public static void nullLoader()
		{
				mruNodes1 = null;
				mruNodes2 = null;
				streamIndices = null;
				cache = null;
				stream = null;
		}

		public static void unpackConfig(StreamLoader streamLoader)
		{
				stream = new Stream(streamLoader.getDataForName("loc.dat"));
				Stream stream = new Stream(streamLoader.getDataForName("loc.idx"));
				int totalObjects = stream.readUnsignedWord();

				streamIndices = new int[totalObjects + 50];
				int i = 2;
				for (int j = 0; j < totalObjects; j++)
				{
						streamIndices[j] = i;
						i += stream.readUnsignedWord();
				}
				cache = new ObjectDefinition[20];
				for (int k = 0; k < 20; k++)
						cache[k] = new ObjectDefinition();
		}

		public boolean modelIsValid(int i)
		{
				if (modelTypes == null)
				{
						if (models == null)
								return true;
						if (i != 10)
								return true;
						boolean flag1 = true;
						for (int k = 0; k < models.length; k++)
						{
								flag1 &= Model.method463(models[k] & 0xffff);
						}
						return flag1;
				}
				for (int j = 0; j < modelTypes.length; j++)
				{
						if (modelTypes[j] == i)
						{
								return Model.method463(models[j] & 0xffff);
						}
				}
				return true;
		}

		public Model getAdjustedModel(int i, int j, int k, int l, int i1, int j1, int k1)
		{
				Model model = getModel(i, k1, j);
				if (model == null)
						return null;
				if (adjustsToTerrain || isFlatShaded)
						model = new Model(adjustsToTerrain, isFlatShaded, model);
				if (adjustsToTerrain)
				{
						int l1 = (k + l + i1 + j1) / 4;
						for (int i2 = 0; i2 < model.vertexCount; i2++)
						{
								int j2 = model.anIntArray1627[i2];
								int k2 = model.anIntArray1629[i2];
								int l2 = k + ((l - k) * (j2 + 64)) / 128;
								int i3 = j1 + ((i1 - j1) * (j2 + 64)) / 128;
								int j3 = l2 + ((i3 - l2) * (k2 + 64)) / 128;
								model.anIntArray1628[i2] += j3 - l1;
						}

						model.method467();
				}
				return model;
		}

		public boolean modelIsValid()
		{
				if (models == null)
						return true;
				boolean flag1 = true;
				for (int i = 0; i < models.length; i++)
						flag1 &= Model.method463(models[i] & 0xffff);
				return flag1;
		}

		public ObjectDefinition getOverride()
		{
				int i = -1;
				if (varbit != -1)
				{
						VarBit varBit = VarBit.cache[varbit];
						int j = varBit.setting;
						int k = varBit.startbit;
						int l = varBit.endbit;
						int i1 = Client.BIT_MASK[l - k];
						i = clientInstance.variousSettings[j] >> k & i1;
				}
				else if (setting != -1)
						i = clientInstance.variousSettings[setting];
				if (i < 0 || i >= childrenIDs.length || childrenIDs[i] == -1)
						return null;
				else
						return forID(childrenIDs[i]);
		}

		public Model getModel(int j, int k, int l)
		{
				Model model = null;
				long l1;
				if (modelTypes == null)
				{
						if (j != 10)
								return null;
						l1 = (long) ((type << 6) + l) + ((long) (k + 1) << 32);
						Model model_1 = (Model) mruNodes2.insertFromCache(l1);
						if (model_1 != null)
								return model_1;
						if (models == null)
								return null;
						boolean flag1 = rotateLeft ^ (l > 3);
						int k1 = models.length;
						for (int i2 = 0; i2 < k1; i2++)
						{
								int l2 = models[i2];
								if (flag1)
								{
										l2 += 0x10000;
								}
								model = (Model) mruNodes1.insertFromCache(l2);
								if (model == null)
								{
										model = Model.getModel(l2 & 0xffff);
										if (model == null)
												return null;
										if (flag1)
												model.method477();
										mruNodes1.removeFromCache(model, l2);
								}
								if (k1 > 1)
										aModelArray741s[i2] = model;
						}

						if (k1 > 1)
								model = new Model(k1, aModelArray741s);
				}
				else
				{
						int i1 = -1;
						for (int j1 = 0; j1 < modelTypes.length; j1++)
						{
								if (modelTypes[j1] != j)
										continue;
								i1 = j1;
								break;
						}

						if (i1 == -1)
								return null;
						l1 = (long) ((type << 8) + (i1 << 3) + l) + ((long) (k + 1) << 32);
						Model model_2 = (Model) mruNodes2.insertFromCache(l1);
						if (model_2 != null)
								return model_2;
						int j2 = models[i1];
						boolean flag3 = rotateLeft ^ (l > 3);
						if (flag3)
								j2 += 0x10000;
						model = (Model) mruNodes1.insertFromCache(j2);
						if (model == null)
						{
								model = Model.getModel(j2 & 0xffff);
								applyTexturing(model, type);
								if (model == null)
										return null;
								if (flag3)
										model.method477();
								mruNodes1.removeFromCache(model, j2);
						}
				}
				boolean flag;
				flag = scaleX != 128 || scaleY != 128 || scaleZ != 128;
				boolean flag2;
				flag2 = offsetX != 0 || offsetY != 0 || offsetZ != 0;
				Model model_3 = new Model(srcColors == null, SequenceFrame.isNegativeZero(k), l == 0 && k == -1 && !flag && !flag2, model);
				if (k != -1)
				{
						model_3.method469();
						model_3.method470(k);
						model_3.anIntArrayArray1658 = null;
						model_3.anIntArrayArray1657 = null;
				}
				while (l-- > 0)
						model_3.method473();
				if (srcColors != null)
				{
						for (int k2 = 0; k2 < srcColors.length; k2++)
								model_3.setColour(srcColors[k2], dstColors[k2]);

				}
				if (flag)
						model_3.scaleModel(scaleX, scaleZ, scaleY);
				if (flag2)
						model_3.method475(offsetX, offsetY, offsetZ);
				int brightness = 84;

				// if objectId == energy barrier, increase brightness.
				if (type == 20839)
				{
						brightness = 200;
				}
				model_3.method479(brightness, 1500, -90, -280, -70, !isFlatShaded);
				if (holdsItemPiles == 1)
						model_3.anInt1654 = model_3.modelHeight;
				mruNodes2.removeFromCache(model_3, l1);
				return model_3;
		}

		public void readValues(Stream stream)
		{
				int flag = -1;
				do
				{
						int type = stream.readUnsignedByte();
						if (type == 0)
								break;
						if (type == 1)
						{
								int len = stream.readUnsignedByte();
								if (len > 0)
								{
										if (models == null || lowMem)
										{
												modelTypes = new int[len];
												models = new int[len];
												for (int k1 = 0; k1 < len; k1++)
												{
														models[k1] = stream.readUnsignedWord();
														modelTypes[k1] = stream.readUnsignedByte();
												}
										}
										else
										{
												stream.currentOffset += len * 3;
										}
								}
						}
						else if (type == 2)
								name = stream.readString();
						else if (type == 3)
								description = stream.readBytes();
						else if (type == 5)
						{
								int len = stream.readUnsignedByte();
								if (len > 0)
								{
										if (models == null || lowMem)
										{
												modelTypes = null;
												models = new int[len];
												for (int l1 = 0; l1 < len; l1++)
														models[l1] = stream.readUnsignedWord();
										}
										else
										{
												stream.currentOffset += len * 2;
										}
								}
						}
						else if (type == 14)
								sizeX = stream.readUnsignedByte();
						else if (type == 15)
								sizeY = stream.readUnsignedByte();
						else if (type == 17)
								blocksWalk = false;
						else if (type == 18)
								blocksProjectiles = false;
						else if (type == 19)
						{
								flag = stream.readUnsignedByte();
								if (flag == 1)
										hasActions = true;
						}
						else if (type == 21)
								adjustsToTerrain = true;
						else if (type == 22)
								isFlatShaded = false;
						else if (type == 23)
								isSolid = true;
						else if (type == 24)
						{
								sequence = stream.readUnsignedWord();
								if (sequence == 65535)
										sequence = -1;
						}
						else if (type == 28)
								wallWidth = stream.readUnsignedByte();
						else if (type == 29)
								brightness = stream.readSignedByte();
						else if (type == 39)
								contrast = stream.readSignedByte();
						else if (type >= 30 && type < 39)
						{
								if (actions == null)
										actions = new String[5];
								actions[type - 30] = stream.readString();
								if (actions[type - 30].equalsIgnoreCase("hidden"))
										actions[type - 30] = null;
						}
						else if (type == 40)
						{
								int i1 = stream.readUnsignedByte();
								srcColors = new int[i1];
								dstColors = new int[i1];
								for (int i2 = 0; i2 < i1; i2++)
								{
										srcColors[i2] = stream.readUnsignedWord();
										dstColors[i2] = stream.readUnsignedWord();
								}

						}
						else if (type == 41)
						{
								int j2 = stream.readUnsignedByte();
								modifiedTexture = new short[j2];
								originalTexture = new short[j2];
								for (int k = 0; k < j2; k++)
								{
										modifiedTexture[k] = (short) stream.readUnsignedWord();
										originalTexture[k] = (short) stream.readUnsignedWord();
								}

						}
						else if (type == 60)
								icon = stream.readUnsignedWord();
						else if (type == 62)
								rotateLeft = true;
						else if (type == 64)
								castsShadow = false;
						else if (type == 65)
								scaleX = stream.readUnsignedWord();
						else if (type == 66)
								scaleY = stream.readUnsignedWord();
						else if (type == 67)
								scaleZ = stream.readUnsignedWord();
						else if (type == 68)
								mapscene = stream.readUnsignedWord();
						else if (type == 69)
								rotationFlags = stream.readUnsignedByte();
						else if (type == 70)
								offsetX = stream.readSignedWord();
						else if (type == 71)
								offsetY = stream.readSignedWord();
						else if (type == 72)
								offsetZ = stream.readSignedWord();
						else if (type == 73)
								isDecoration = true;
						else if (type == 74)
								ghost = true;
						else if (type == 75)
								holdsItemPiles = stream.readUnsignedByte();
						else if (type == 77)
						{
								varbit = stream.readUnsignedWord();
								if (varbit == 65535)
										varbit = -1;
								setting = stream.readUnsignedWord();
								if (setting == 65535)
										setting = -1;
								int j1 = stream.readUnsignedByte();
								childrenIDs = new int[j1 + 1];
								for (int j2 = 0; j2 <= j1; j2++)
								{
										childrenIDs[j2] = stream.readUnsignedWord();
										if (childrenIDs[j2] == 65535)
												childrenIDs[j2] = -1;
								}
						}
				}
				while (true);
				if (flag == -1 && name != "null" && name != null)
				{
						hasActions = models != null && (modelTypes == null || modelTypes[0] == 10);
						if (actions != null)
								hasActions = true;
				}
				if (ghost)
				{
						blocksWalk = false;
						blocksProjectiles = false;
				}
				if (holdsItemPiles == -1)
						holdsItemPiles = blocksWalk ? 1 : 0;
		}

		public ObjectDefinition()
		{
				type = -1;
		}

		public boolean isDecoration;

		public byte brightness;

		public int offsetX;

		public String name;

		public int scaleZ;

		public static final Model[] aModelArray741s = new Model[4];

		public byte contrast;

		public int sizeX;

		public int offsetY;

		public int icon;

		public int[] dstColors;

		public int scaleX;

		public int setting;

		public boolean rotateLeft;

		public static boolean lowMem;

		public static Stream stream;

		public int type;

		public static int[] streamIndices;

		public boolean blocksProjectiles;

		public int mapscene;

		public int childrenIDs[];

		public int holdsItemPiles;

		public int sizeY;

		public boolean adjustsToTerrain;

		public boolean isSolid;

		public static Client clientInstance;

		public boolean ghost;

		public boolean blocksWalk;

		public int rotationFlags;

		public boolean isFlatShaded;

		public static int cacheIndex;

		public int scaleY;

		public int[] models;

		public int varbit;

		public int wallWidth;

		public int[] modelTypes;

		public byte description[];

		public boolean hasActions;

		public boolean castsShadow;

		public static MRUNodes mruNodes2 = new MRUNodes(30);

		public int sequence;

		public static ObjectDefinition[] cache;

		public int offsetZ;

		public int[] srcColors;

		public static MRUNodes mruNodes1 = new MRUNodes(500);

		public String actions[];

		private short[] originalTexture;

		private short[] modifiedTexture;

}