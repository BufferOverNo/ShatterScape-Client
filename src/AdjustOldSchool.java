/**
 * Adjust oldschool animations.
 * @author MGT Madness, created on 16-02-2016.
 */
public class AdjustOldSchool
{

		public static int adjustPlayerGfx(int gfx)
		{
				if (Client.clientRevision("602"))
				{
						return gfx;
				}
				if (Client.clientRevision("474"))
				{
						// High alchemy gfx to old style.
						if (gfx == 1693 || gfx == 1691)
						{
								return 2621;
						}

						// Victim getting teleblocked.
						if (gfx == 1843)
						{
								return 345;
						}
						if (gfx == 1841)
						{
								return -1;
						}

						// Turn barrage orb into normal barrage.
						if (gfx == 1677)
						{
								return 369;
						}
				}
				return gfx;
		}

		public static int adjustPlayerGfxHeight(int gfx, int height)
		{
				// Low alchemy.
				if (gfx == 2621)
				{
						return 6553600;
				}

				// Oldschool barrage.
				if (gfx == 369)
				{
						return 65536;
				}
				return height;
		}

		public static int adjustPlayerAnimation(int anim)
		{
				if (Client.clientRevision("602"))
				{
						if (anim == 13725)
						{
								return -1;
						}
						else if (anim == 1819)
						{
								return 10503;
						}
						else if (anim == 13732)
						{
								return -1;
						}
						return anim;
				}
				if (Client.clientRevision("525"))
				{
						if (anim == 13725)
						{
								return -1;
						}
						else if (anim == 1819)
						{
								return 10503;
						}
						else if (anim == 13732)
						{
								return -1;
						}
				}

				// Teleblock animation cast.
				if (anim == 1841)
				{
						return -1;
				}
				// Eating with hand cannon while walking/running.
				if (anim == 829 && Client.myPlayer.moveSequence == 12154 && Client.clientRevision("474"))
				{
						return -1;
				}

				// High alchemy.
				if (anim == 9633 && Client.clientRevision("474"))
				{
						return 713;
				}

				// Zamororakian spear block emote.
				if (anim == 12008)
				{
						return 424;
				}

				// Block emotes.
				if (anim == 12030 || anim == 12806 || anim == 12004)
				{
						return 404;
				}

				// Whip block emote.
				if (anim == 11974)
				{
						return 1659;
				}

				// Whip special attack emote.
				if (anim == 11956)
				{
						return 1658;
				}

				// Staff of light block emote.
				if (anim == 13046)
				{
						return 420;
				}

				// Godsword block emote.
				if (anim == 13051 && Client.clientRevision("474"))
				{
						anim = 7050;
				}
				return anim;
		}



		public static int adjustNpcAnimation(int anim)
		{
				if (Client.clientRevision("602") || Client.clientRevision("525"))
				{
						return anim;
				}

				// Tzhaar-xil.
				if (anim == 9286)
				{
						return 2611;
				}
				if (anim == 9289)
				{
						return 2607;
				}
				if (anim == 9287)
				{
						return 2606;
				}


				// Pyrefiend
				if (anim == 8080)
				{
						return 1582;
				}
				if (anim == 8079)
				{
						return 1581;
				}
				if (anim == 8078)
				{
						return 1580;
				}

				// Cave crawler.
				if (anim == 266)
				{
						return 227;
				}
				if (anim == 267)
				{
						return -1;
				}
				if (anim == 265)
				{
						return 228;
				}

				// Turoth.
				if (anim == 9481)
				{
						return 1595;
				}
				if (anim == 9483)
				{
						return 1596;
				}
				if (anim == 9482)
				{
						return 1597;
				}

				// Rockslug.

				if (anim == 9506)
				{
						return 1567;
				}
				if (anim == 9508)
				{
						return 1565;
				}
				if (anim == 9507)
				{
						return 1568;
				}

				// Basilik.
				if (anim == 260)
				{
						return 1546;
				}
				if (anim == 21)
				{
						return -1;
				}
				if (anim == 264)
				{
						return 1548;
				}

				// Kurask.
				if (anim == 9439)
				{
						return 1512;
				}
				if (anim == 9441)
				{
						return 1514;
				}
				if (anim == 9440)
				{
						return 1513;
				}

				// Cockatrice.
				if (anim == 7762)
				{
						return 1562;
				}
				if (anim == 7761)
				{
						return 1560;
				}
				if (anim == 7763)
				{
						return 1563;
				}

				switch (anim)
				{

						// Nechryael.
						case 9491:
								return 1528;

						case 9489:
								return -1;

						case 9488:
								return 1530;
						/*
						 * 
						"melee_attack_animation": 9277,
						"ranged_attack_animation": 9276,
						"magic_attack_animation": 9300,
						 */

						// TzTok-Jad
						case 9277:
								return 2655;
						case 9276:
								return 2652;
						case 9300:
								return 2656;

						// Crawling hand.
						case 9125:
								return 1592;
						case 9127:
								return 1591;
						case 9126:
								return 1590;

						// Bloodveld.
						case 9436:
								return 1552;
						case 9431:
								return 1550;
						case 9430:
								return 1553;

						// Banshee.
						case 9449:
								return 1525;
						case 9451:
								return 1521;
						case 9450:
								return 1524;

						// Gargoyle.
						case 9454:
								return 1519;
						case 9455:
								return 1518;

				}


				return anim;
		}

		public static int adjustNpcId(int value)
		{
				if (Client.clientRevision("602"))
				{
						return value;
				}
				if (Client.clientRevision("474"))
				{


						// Fix Rockslug.
						if (value == 1632)
						{
								value = 1622;
						}

						// Skeleton is invisible for some reason.
						else if (value == 90)
						{
								value = 92;
						}
				}
				// Fix Mandrith.
				if (value == 8725 && Client.clientRevision("525"))
				{
						value = 6537;
				}

				// Fix Turoth
				if (value == 1627)
				{
						value = 1629;
				}

				// Fix guide.
				if (value == 7949)
				{
						value = 2244;
				}
				return value;
		}



		public static int adjustPlayerRunAnimation(int runId, int walk, int turnRight)
		{
				if (Client.clientRevision("602"))
				{

						if (runId == 13724)
						{
								return 13723;
						}
						if (runId == 13731)
						{
								return 13734;
						}
						return runId;
				}

				if (Client.clientRevision("525"))
				{
						if (runId == 13724)
						{
								return 13723;
						}
						if (runId == 13731)
						{
								return 13734;
						}
				}

				// Ancient staff
				if (runId == 824 && walk == 1146 && turnRight == 1207)
				{
						return 1210;
				}

				// Dharok's axe.
				if (runId == 12001)
				{
						return 1664;
				}

				// Abyssal whip.
				if (runId == 11976)
				{
						return 1661;
				}

				// Dragon scimitar.
				if (runId == 1210 && walk != 1146 && turnRight != 1207)
				{
						return 824;
				}
				return runId;
		}



		public static int adjustPlayerWalkAnimation(int walkId)
		{
				if (Client.clientRevision("602"))
				{
						return walkId;
				}
				// Abyssal whip.
				if (walkId == 11975)
				{
						return 1660;
				}
				return walkId;
		}



		public static int adjustPlayerStandAnimation(int standId)
		{


				if (Client.clientRevision("602"))
				{
						return standId;
				}
				// Dragon halberd.
				if (standId == 12010)
				{
						return Client.clientRevision("525") ? 809 : 813;
				}

				// Abyssal whip.
				if (standId == 11973)
				{
						return Client.clientRevision("525") ? 1832 : 808;
				}
				return standId;
		}


}
