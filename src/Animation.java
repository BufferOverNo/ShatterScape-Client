public final class Animation
{

		public static int length474;

		public static int length525;

		public static void unpackConfig(StreamLoader streamLoader)
		{
				Stream stream602 = new Stream(streamLoader.getDataForName("seq.dat"));
				int length602 = stream602.readUnsignedWord();
				if (anims == null)
				{
						anims = new Animation[length602 + 6000];
				}

				// go to SequenceFrame > load method for the file id in the cache.

				for (int animationId = 0; animationId < length602; animationId++)
				{
						if (anims[animationId] == null)
						{
								anims[animationId] = new Animation();
						}
						anims[animationId].readValues602(stream602);
				}

				if (Client.clientRevision("525"))
				{
						Stream stream525 = new Stream(streamLoader.getDataForName("525seq.dat"));
						length525 = stream525.readUnsignedWord();
						for (int animationId = 0; animationId < length525; animationId++)
						{
								if (anims[animationId] == null)
								{
										anims[animationId] = new Animation();
								}
								anims[animationId].readValues525(stream525);
						}
				}

				if (Client.clientRevision("474"))
				{
						Stream stream474 = new Stream(streamLoader.getDataForName("474seq.dat"));
						length474 = stream474.readUnsignedWord();
						for (int animationId = 0; animationId < length474; animationId++)
						{
								if (anims[animationId] == null)
								{
										anims[animationId] = new Animation();
								}
								anims[animationId].readValues474(stream474);
						}
				}

				boolean debug = false;
				int animationToDebug = 1658;
				String random = "00";
				String random1 = "00";
				random = random + random1;
				if (debug)
				{
						Utility.print("anims[" + random + "].allowsRotation = " + anims[animationToDebug].allowsRotation + ";");
						Utility.print("anims[" + random + "].delayType = " + anims[animationToDebug].delayType + ";");
						Utility.print("anims[" + random + "].length = " + anims[animationToDebug].length + ";");
						Utility.print("anims[" + random + "].padding = " + anims[animationToDebug].padding + ";");
						Utility.print("anims[" + random + "].priority1 = " + anims[animationToDebug].priority1 + ";");
						Utility.print("anims[" + random + "].resetCycle = " + anims[animationToDebug].resetCycle + ";");
						Utility.print("anims[" + random + "].runFlag = " + anims[animationToDebug].runFlag + ";");
						Utility.print("anims[" + random + "].shield = " + anims[animationToDebug].shield + ";");
						Utility.print("anims[" + random + "].walkFlag = " + anims[animationToDebug].walkFlag + ";");
						Utility.print("anims[" + random + "].weapon = " + anims[animationToDebug].weapon + ";");
						if (anims[animationToDebug].vertices != null)
						{
								Utility.print("anims[" + random + "].vertices = new int[" + anims[animationToDebug].vertices.length + "];");
								for (int index = 0; index < anims[animationToDebug].vertices.length; index++)
								{
										Utility.print("anims[" + random + "].vertices[" + index + "] = " + anims[animationToDebug].vertices[index] + ";");
								}
						}
						if (anims[animationToDebug].duration != null)
						{
								Utility.print("anims[" + random + "].duration = new int[" + anims[animationToDebug].duration.length + "];");
								for (int index = 0; index < anims[animationToDebug].duration.length; index++)
								{
										Utility.print("anims[" + random + "].duration[" + index + "] = " + anims[animationToDebug].duration[index] + ";");
								}
						}
						if (anims[animationToDebug].primary != null)
						{
								Utility.print("anims[" + random + "].primary = new int[" + anims[animationToDebug].primary.length + "];");
								for (int index = 0; index < anims[animationToDebug].primary.length; index++)
								{
										Utility.print("anims[" + random + "].primary[" + index + "] = " + anims[animationToDebug].primary[index] + ";");
								}
						}
						if (anims[animationToDebug].secondary != null)
						{
								Utility.print("anims[" + random + "].secondary = new int[" + anims[animationToDebug].secondary.length + "];");
								for (int index = 0; index < anims[animationToDebug].secondary.length; index++)
								{
										Utility.print("anims[" + random + "].secondary[" + index + "] = " + anims[animationToDebug].secondary[index] + ";");
								}
						}
				}


				boolean debugFileId = false;
				int variableToDebug = 123011087;
				if (debugFileId)
				{
						String s = "";
						int fileId = 0;
						@SuppressWarnings("unused")
						int k = 0;
						s = Integer.toHexString(variableToDebug);
						fileId = Integer.parseInt(s.substring(0, s.length() - 4), 16);
						Utility.print("File id: " + fileId);
				}

				// Elder maul walk
				anims[13734].allowsRotation = false;
				anims[13734].delayType = 1;
				anims[13734].length = 16;
				anims[13734].padding = -1;
				anims[13734].priority1 = 5;
				anims[13734].resetCycle = 99;
				anims[13734].runFlag = 0;
				anims[13734].shield = -1;
				anims[13734].walkFlag = 0;
				anims[13734].weapon = -1;
				anims[13734].duration = new int[16];
				anims[13734].duration[0] = 4;
				anims[13734].duration[1] = 4;
				anims[13734].duration[2] = 4;
				anims[13734].duration[3] = 4;
				anims[13734].duration[4] = 4;
				anims[13734].duration[5] = 4;
				anims[13734].duration[6] = 4;
				anims[13734].duration[7] = 4;
				anims[13734].duration[8] = 4;
				anims[13734].duration[9] = 4;
				anims[13734].duration[10] = 4;
				anims[13734].duration[11] = 4;
				anims[13734].duration[12] = 4;
				anims[13734].duration[13] = 4;
				anims[13734].duration[14] = 4;
				anims[13734].duration[15] = 4;
				anims[13734].primary = new int[16];
				anims[13734].primary[0] = 123011075;
				anims[13734].primary[1] = 123011095;
				anims[13734].primary[2] = 123011127;
				anims[13734].primary[3] = 123011126;
				anims[13734].primary[4] = 123011121;
				anims[13734].primary[5] = 123011098;
				anims[13734].primary[6] = 123011114;
				anims[13734].primary[7] = 123011097;
				anims[13734].primary[8] = 123011112;
				anims[13734].primary[9] = 123011083;
				anims[13734].primary[10] = 123011129;
				anims[13734].primary[11] = 123011079;
				anims[13734].primary[12] = 123011104;
				anims[13734].primary[13] = 123011096;
				anims[13734].primary[14] = 123011084;
				anims[13734].primary[15] = 123011128;


				// Elder maul stand
				anims[13733].allowsRotation = false;
				anims[13733].delayType = 1;
				anims[13733].length = 10;
				anims[13733].padding = -1;
				anims[13733].priority1 = 5;
				anims[13733].resetCycle = 99;
				anims[13733].runFlag = 0;
				anims[13733].shield = -1;
				anims[13733].walkFlag = 0;
				anims[13733].weapon = -1;
				if (Client.clientRevision("474"))
				{
						anims[13733].duration = new int[10];
						anims[13733].duration[0] = 12;
						anims[13733].duration[1] = 12;
						anims[13733].duration[2] = 12;
						anims[13733].duration[3] = 12;
						anims[13733].duration[4] = 12;
						anims[13733].duration[5] = 12;
						anims[13733].duration[6] = 12;
						anims[13733].duration[7] = 12;
						anims[13733].duration[8] = 12;
						anims[13733].duration[9] = 12;
						anims[13733].primary = new int[10];
						anims[13733].primary[0] = 123011135;
						anims[13733].primary[1] = 123011106;
						anims[13733].primary[2] = 123011101;
						anims[13733].primary[3] = 123011100;
						anims[13733].primary[4] = 123011085;
						anims[13733].primary[5] = 123011094;
						anims[13733].primary[6] = 123011131;
						anims[13733].primary[7] = 123011091;
						anims[13733].primary[8] = 123011111;
						anims[13733].primary[9] = 123011103;
				}
				else
				{
						int index = 0;
						int size = 10;
						anims[13733].duration = new int[size];
						anims[13733].primary = new int[size];

						anims[13733].duration[index] = 12;
						anims[13733].primary[index] = 123011106;
						index++;
						anims[13733].duration[index] = 12;
						anims[13733].primary[index] = 123011106;
						index++;
						anims[13733].duration[index] = 12;
						anims[13733].primary[index] = 123011101;
						index++;
						anims[13733].duration[index] = 12;
						anims[13733].primary[index] = 123011100;
						index++;
						anims[13733].duration[index] = 12;
						anims[13733].primary[index] = 123011085;
						index++;
						anims[13733].duration[index] = 12;
						anims[13733].primary[index] = 123011094;
						index++;
						anims[13733].duration[index] = 12;
						anims[13733].primary[index] = 123011131;
						index++;
						anims[13733].duration[index] = 12;
						anims[13733].primary[index] = 123011091;
						index++;
						anims[13733].duration[index] = 12;
						anims[13733].primary[index] = 123011111;
						index++;
						anims[13733].duration[index] = 12;
						anims[13733].primary[index] = 123011103;
				}

				// Elder maul block.
				anims[13732].allowsRotation = false;
				anims[13732].delayType = 1;
				anims[13732].length = 6;
				anims[13732].padding = -1;
				anims[13732].priority1 = 5;
				anims[13732].resetCycle = 99;
				anims[13732].runFlag = 2;
				anims[13732].shield = -1;
				anims[13732].walkFlag = 2;
				anims[13732].weapon = -1;
				anims[13732].vertices = new int[28];
				anims[13732].vertices[0] = 1;
				anims[13732].vertices[1] = 2;
				anims[13732].vertices[2] = 9;
				anims[13732].vertices[3] = 11;
				anims[13732].vertices[4] = 13;
				anims[13732].vertices[5] = 15;
				anims[13732].vertices[6] = 17;
				anims[13732].vertices[7] = 19;
				anims[13732].vertices[8] = 37;
				anims[13732].vertices[9] = 39;
				anims[13732].vertices[10] = 41;
				anims[13732].vertices[11] = 43;
				anims[13732].vertices[12] = 45;
				anims[13732].vertices[13] = 164;
				anims[13732].vertices[14] = 166;
				anims[13732].vertices[15] = 168;
				anims[13732].vertices[16] = 170;
				anims[13732].vertices[17] = 172;
				anims[13732].vertices[18] = 174;
				anims[13732].vertices[19] = 176;
				anims[13732].vertices[20] = 178;
				anims[13732].vertices[21] = 180;
				anims[13732].vertices[22] = 182;
				anims[13732].vertices[23] = 183;
				anims[13732].vertices[24] = 185;
				anims[13732].vertices[25] = 191;
				anims[13732].vertices[26] = 192;
				anims[13732].vertices[27] = 9999999;
				anims[13732].duration = new int[6];
				anims[13732].duration[0] = 5;
				anims[13732].duration[1] = 5;
				anims[13732].duration[2] = 5;
				anims[13732].duration[3] = 5;
				anims[13732].duration[4] = 5;
				anims[13732].duration[5] = 5;
				anims[13732].primary = new int[6];
				anims[13732].primary[0] = 123011130;
				anims[13732].primary[1] = 123011080;
				anims[13732].primary[2] = 123011089;
				anims[13732].primary[3] = 123011093;
				anims[13732].primary[4] = 123011108;
				anims[13732].primary[5] = 123011132;

				// Elder maul run.
				anims[13731].allowsRotation = false;
				anims[13731].delayType = 1;
				anims[13731].length = 15;
				anims[13731].padding = -1;
				anims[13731].priority1 = 5;
				anims[13731].resetCycle = 99;
				anims[13731].runFlag = 0;
				anims[13731].shield = -1;
				anims[13731].walkFlag = 0;
				anims[13731].weapon = -1;
				anims[13731].duration = new int[15];
				anims[13731].duration[0] = 2;
				anims[13731].duration[1] = 2;
				anims[13731].duration[2] = 2;
				anims[13731].duration[3] = 2;
				anims[13731].duration[4] = 2;
				anims[13731].duration[5] = 2;
				anims[13731].duration[6] = 2;
				anims[13731].duration[7] = 2;
				anims[13731].duration[8] = 2;
				anims[13731].duration[9] = 2;
				anims[13731].duration[10] = 2;
				anims[13731].duration[11] = 2;
				anims[13731].duration[12] = 2;
				anims[13731].duration[13] = 2;
				anims[13731].duration[14] = 2;
				anims[13731].primary = new int[15];
				anims[13731].primary[0] = 123011115;
				anims[13731].primary[1] = 123011105;
				anims[13731].primary[2] = 123011107;
				anims[13731].primary[3] = 123011119;
				anims[13731].primary[4] = 123011073;
				anims[13731].primary[5] = 123011124;
				anims[13731].primary[6] = 123011109;
				anims[13731].primary[7] = 123011072;
				anims[13731].primary[8] = 123011134;
				anims[13731].primary[9] = 123011082;
				anims[13731].primary[10] = 123011087;
				anims[13731].primary[11] = 123011117;
				anims[13731].primary[12] = 123011118;
				anims[13731].primary[13] = 123011099;
				anims[13731].primary[14] = 123011076;

				// Elder maul attack.
				anims[13730].allowsRotation = false;
				anims[13730].delayType = 1;
				anims[13730].length = 19;
				anims[13730].padding = -1;
				anims[13730].priority1 = 6;
				anims[13730].resetCycle = 99;
				anims[13730].runFlag = 2;
				anims[13730].shield = -1;
				anims[13730].walkFlag = 2;
				anims[13730].weapon = -1;
				anims[13730].vertices = new int[28];
				anims[13730].vertices[0] = 1;
				anims[13730].vertices[1] = 2;
				anims[13730].vertices[2] = 9;
				anims[13730].vertices[3] = 11;
				anims[13730].vertices[4] = 13;
				anims[13730].vertices[5] = 15;
				anims[13730].vertices[6] = 17;
				anims[13730].vertices[7] = 19;
				anims[13730].vertices[8] = 37;
				anims[13730].vertices[9] = 39;
				anims[13730].vertices[10] = 41;
				anims[13730].vertices[11] = 43;
				anims[13730].vertices[12] = 45;
				anims[13730].vertices[13] = 164;
				anims[13730].vertices[14] = 166;
				anims[13730].vertices[15] = 168;
				anims[13730].vertices[16] = 170;
				anims[13730].vertices[17] = 172;
				anims[13730].vertices[18] = 174;
				anims[13730].vertices[19] = 176;
				anims[13730].vertices[20] = 178;
				anims[13730].vertices[21] = 180;
				anims[13730].vertices[22] = 182;
				anims[13730].vertices[23] = 183;
				anims[13730].vertices[24] = 185;
				anims[13730].vertices[25] = 191;
				anims[13730].vertices[26] = 192;
				anims[13730].vertices[27] = 9999999;
				anims[13730].duration = new int[19];
				anims[13730].duration[0] = 4;
				anims[13730].duration[1] = 4;
				anims[13730].duration[2] = 4;
				anims[13730].duration[3] = 4;
				anims[13730].duration[4] = 4;
				anims[13730].duration[5] = 4;
				anims[13730].duration[6] = 4;
				anims[13730].duration[7] = 4;
				anims[13730].duration[8] = 4;
				anims[13730].duration[9] = 4;
				anims[13730].duration[10] = 4;
				anims[13730].duration[11] = 4;
				anims[13730].duration[12] = 4;
				anims[13730].duration[13] = 4;
				anims[13730].duration[14] = 4;
				anims[13730].duration[15] = 4;
				anims[13730].duration[16] = 4;
				anims[13730].duration[17] = 4;
				anims[13730].duration[18] = 4;
				anims[13730].primary = new int[19];
				anims[13730].primary[0] = 123011122;
				anims[13730].primary[1] = 123011088;
				anims[13730].primary[2] = 123011133;
				anims[13730].primary[3] = 123011116;
				anims[13730].primary[4] = 123011113;
				anims[13730].primary[5] = 123011086;
				anims[13730].primary[6] = 123011125;
				anims[13730].primary[7] = 123011120;
				anims[13730].primary[8] = 123011092;
				anims[13730].primary[9] = 123011078;
				anims[13730].primary[10] = 123011077;
				anims[13730].primary[11] = 123011081;
				anims[13730].primary[12] = 123011074;
				anims[13730].primary[13] = 123011123;
				anims[13730].primary[14] = 123011136;
				anims[13730].primary[15] = 123011110;
				anims[13730].primary[16] = 123011102;
				anims[13730].primary[17] = 123011090;
				anims[13730].primary[18] = 123011137;

				// Toxic blowpipe attack animation.
				anims[13729].allowsRotation = false;
				anims[13729].delayType = 1;
				anims[13729].length = 13;
				anims[13729].padding = -1;
				anims[13729].priority1 = 6;
				anims[13729].resetCycle = 99;
				anims[13729].runFlag = 0;
				anims[13729].shield = 0;
				anims[13729].walkFlag = 0;
				anims[13729].weapon = 19291;
				anims[13729].vertices = new int[28];
				anims[13729].vertices[0] = 1;
				anims[13729].vertices[1] = 2;
				anims[13729].vertices[2] = 9;
				anims[13729].vertices[3] = 11;
				anims[13729].vertices[4] = 13;
				anims[13729].vertices[5] = 15;
				anims[13729].vertices[6] = 17;
				anims[13729].vertices[7] = 19;
				anims[13729].vertices[8] = 37;
				anims[13729].vertices[9] = 39;
				anims[13729].vertices[10] = 41;
				anims[13729].vertices[11] = 43;
				anims[13729].vertices[12] = 45;
				anims[13729].vertices[13] = 164;
				anims[13729].vertices[14] = 166;
				anims[13729].vertices[15] = 168;
				anims[13729].vertices[16] = 170;
				anims[13729].vertices[17] = 172;
				anims[13729].vertices[18] = 174;
				anims[13729].vertices[19] = 176;
				anims[13729].vertices[20] = 178;
				anims[13729].vertices[21] = 180;
				anims[13729].vertices[22] = 182;
				anims[13729].vertices[23] = 183;
				anims[13729].vertices[24] = 185;
				anims[13729].vertices[25] = 191;
				anims[13729].vertices[26] = 192;
				anims[13729].vertices[27] = 9999999;
				anims[13729].duration = new int[13];
				anims[13729].duration[0] = 4;
				anims[13729].duration[1] = 3;
				anims[13729].duration[2] = 3;
				anims[13729].duration[3] = 4;
				anims[13729].duration[4] = 10;
				anims[13729].duration[5] = 10;
				anims[13729].duration[6] = 15;
				anims[13729].duration[7] = 10;
				anims[13729].duration[8] = 10;
				anims[13729].duration[9] = 4;
				anims[13729].duration[10] = 3;
				anims[13729].duration[11] = 3;
				anims[13729].duration[12] = 4;
				anims[13729].primary = new int[13];
				anims[13729].primary[0] = 19267601;
				anims[13729].primary[1] = 19267602;
				anims[13729].primary[2] = 19267603;
				anims[13729].primary[3] = 19267604;
				anims[13729].primary[4] = 19267605;
				anims[13729].primary[5] = 19267606;
				anims[13729].primary[6] = 19267607;
				anims[13729].primary[7] = 19267606;
				anims[13729].primary[8] = 19267605;
				anims[13729].primary[9] = 19267604;
				anims[13729].primary[10] = 19267603;
				anims[13729].primary[11] = 19267602;
				anims[13729].primary[12] = 19267601;

				// Abyssal dagger special attack gfx animation.
				anims[13728].allowsRotation = false;
				anims[13728].delayType = 1;
				anims[13728].length = 17;
				anims[13728].padding = -1;
				anims[13728].priority1 = 5;
				anims[13728].resetCycle = 99;
				anims[13728].runFlag = 0;
				anims[13728].shield = -1;
				anims[13728].walkFlag = 0;
				anims[13728].weapon = -1;
				anims[13728].duration = new int[17];
				anims[13728].duration[0] = 5;
				anims[13728].duration[1] = 4;
				anims[13728].duration[2] = 3;
				anims[13728].duration[3] = 3;
				anims[13728].duration[4] = 3;
				anims[13728].duration[5] = 3;
				anims[13728].duration[6] = 3;
				anims[13728].duration[7] = 3;
				anims[13728].duration[8] = 3;
				anims[13728].duration[9] = 3;
				anims[13728].duration[10] = 3;
				anims[13728].duration[11] = 3;
				anims[13728].duration[12] = 3;
				anims[13728].duration[13] = 3;
				anims[13728].duration[14] = 3;
				anims[13728].duration[15] = 4;
				anims[13728].duration[16] = 3;
				anims[13728].primary = new int[17];
				anims[13728].primary[0] = 118947840;
				anims[13728].primary[1] = 118947854;
				anims[13728].primary[2] = 118947852;
				anims[13728].primary[3] = 118947855;
				anims[13728].primary[4] = 118947844;
				anims[13728].primary[5] = 118947847;
				anims[13728].primary[6] = 118947849;
				anims[13728].primary[7] = 118947853;
				anims[13728].primary[8] = 118947850;
				anims[13728].primary[9] = 118947842;
				anims[13728].primary[10] = 118947848;
				anims[13728].primary[11] = 118947841;
				anims[13728].primary[12] = 118947843;
				anims[13728].primary[13] = 118947856;
				anims[13728].primary[14] = 118947845;
				anims[13728].primary[15] = 118947846;
				anims[13728].primary[16] = 118947851;

				if (!Client.clientRevision("474"))
				{
						// Heavy ballista special attack.
						anims[13727].allowsRotation = false;
						anims[13727].delayType = 1;
						anims[13727].length = 13;
						anims[13727].padding = -1;
						anims[13727].priority1 = 5;
						anims[13727].resetCycle = 99;
						anims[13727].runFlag = 0;
						anims[13727].shield = -1;
						anims[13727].walkFlag = 1;
						anims[13727].weapon = -1;
						anims[13727].duration = new int[13];
						int index = 0;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 12;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].duration[index] = 4;
						index++;
						anims[13727].primary = new int[13];

						index = 0;
						anims[13727].primary[index] = 121110579;
						index++;
						anims[13727].primary[index] = 121110547;
						index++;
						anims[13727].primary[index] = 121110602;
						index++;
						anims[13727].primary[index] = 121110544;
						index++;
						anims[13727].primary[index] = 121110561;
						index++;
						anims[13727].primary[index] = 121110621;
						index++;
						anims[13727].primary[index] = 121110598;
						index++;
						anims[13727].primary[index] = 121110609;
						index++;
						anims[13727].primary[index] = 121110556;
						index++;
						anims[13727].primary[index] = 121110594;
						index++;
						anims[13727].primary[index] = 121110550;
						index++;
						anims[13727].primary[index] = 121110562;
						index++;
						anims[13727].primary[index] = 121110610;
						index++;

						// Heavy ballista attack.
						anims[13726].allowsRotation = false;
						anims[13726].delayType = 1;
						anims[13726].length = 10;
						anims[13726].padding = -1;
						anims[13726].priority1 = 5;
						anims[13726].resetCycle = 99;
						anims[13726].runFlag = 0;
						anims[13726].shield = -1;
						anims[13726].walkFlag = 2;
						anims[13726].weapon = -1;
						anims[13726].duration = new int[10];
						anims[13726].duration[0] = 4;
						anims[13726].duration[1] = 4;
						anims[13726].duration[2] = 4;
						anims[13726].duration[3] = 4;
						anims[13726].duration[4] = 4;
						anims[13726].duration[5] = 5;
						anims[13726].duration[6] = 5;
						anims[13726].duration[7] = 5;
						anims[13726].duration[8] = 5;
						anims[13726].duration[9] = 10;
						//anims[13726].duration[10] = 4;
						//anims[13726].duration[11] = 4;
						//anims[13726].duration[12] = 4;
						anims[13726].primary = new int[10];
						anims[13726].primary[0] = 121110531;
						anims[13726].primary[1] = 121110603;
						anims[13726].primary[2] = 121110555;
						anims[13726].primary[3] = 121110552;
						anims[13726].primary[4] = 121110586;
						anims[13726].primary[5] = 121110596;
						anims[13726].primary[6] = 121110563;
						anims[13726].primary[7] = 121110599;
						anims[13726].primary[8] = 121110566;
						anims[13726].primary[9] = 121110585;
						//anims[13726].primary[10] = 121110542;
						//anims[13726].primary[11] = 121110538;
						//anims[13726].primary[12] = 121110570;
				}
				else
				{
						// Heavy ballista special attack.
						anims[13727].allowsRotation = false;
						anims[13727].delayType = 1;
						anims[13727].length = 18;
						anims[13727].padding = -1;
						anims[13727].priority1 = 5;
						anims[13727].resetCycle = 99;
						anims[13727].runFlag = 0;
						anims[13727].shield = -1;
						anims[13727].walkFlag = 1;
						anims[13727].weapon = -1;
						anims[13727].duration = new int[18];
						anims[13727].duration[0] = 4;
						anims[13727].duration[1] = 4;
						anims[13727].duration[2] = 4;
						anims[13727].duration[3] = 4;
						anims[13727].duration[4] = 4;
						anims[13727].duration[5] = 4;
						anims[13727].duration[6] = 4;
						anims[13727].duration[7] = 4;
						anims[13727].duration[8] = 4;
						anims[13727].duration[9] = 12;
						anims[13727].duration[10] = 4;
						anims[13727].duration[11] = 4;
						anims[13727].duration[12] = 4;
						anims[13727].duration[13] = 4;
						anims[13727].duration[14] = 4;
						anims[13727].duration[15] = 4;
						anims[13727].duration[16] = 4;
						anims[13727].duration[17] = 4;
						anims[13727].primary = new int[18];
						anims[13727].primary[0] = 121110557;
						anims[13727].primary[1] = 121110580;
						anims[13727].primary[2] = 121110576;
						anims[13727].primary[3] = 121110551;
						anims[13727].primary[4] = 121110574;
						anims[13727].primary[5] = 121110579;
						anims[13727].primary[6] = 121110547;
						anims[13727].primary[7] = 121110602;
						anims[13727].primary[8] = 121110544;
						anims[13727].primary[9] = 121110561;
						anims[13727].primary[10] = 121110621;
						anims[13727].primary[11] = 121110598;
						anims[13727].primary[12] = 121110609;
						anims[13727].primary[13] = 121110556;
						anims[13727].primary[14] = 121110594;
						anims[13727].primary[15] = 121110550;
						anims[13727].primary[16] = 121110562;
						anims[13727].primary[17] = 121110610;

						// Heavy ballista attack.
						anims[13726].allowsRotation = false;
						anims[13726].delayType = 1;
						anims[13726].length = 18;
						anims[13726].padding = -1;
						anims[13726].priority1 = 5;
						anims[13726].resetCycle = 99;
						anims[13726].runFlag = 0;
						anims[13726].shield = -1;
						anims[13726].walkFlag = 2;
						anims[13726].weapon = -1;
						anims[13726].duration = new int[18];
						anims[13726].duration[0] = 4;
						anims[13726].duration[1] = 4;
						anims[13726].duration[2] = 4;
						anims[13726].duration[3] = 4;
						anims[13726].duration[4] = 4;
						anims[13726].duration[5] = 5;
						anims[13726].duration[6] = 5;
						anims[13726].duration[7] = 5;
						anims[13726].duration[8] = 5;
						anims[13726].duration[9] = 10;
						anims[13726].duration[10] = 4;
						anims[13726].duration[11] = 4;
						anims[13726].duration[12] = 4;
						anims[13726].duration[13] = 5;
						anims[13726].duration[14] = 5;
						anims[13726].duration[15] = 5;
						anims[13726].duration[16] = 5;
						anims[13726].duration[17] = 5;
						anims[13726].primary = new int[18];
						anims[13726].primary[0] = 121110531;
						anims[13726].primary[1] = 121110603;
						anims[13726].primary[2] = 121110555;
						anims[13726].primary[3] = 121110552;
						anims[13726].primary[4] = 121110586;
						anims[13726].primary[5] = 121110596;
						anims[13726].primary[6] = 121110563;
						anims[13726].primary[7] = 121110599;
						anims[13726].primary[8] = 121110566;
						anims[13726].primary[9] = 121110585;
						anims[13726].primary[10] = 121110542;
						anims[13726].primary[11] = 121110538;
						anims[13726].primary[12] = 121110570;
						anims[13726].primary[13] = 121110617;
						anims[13726].primary[14] = 121110600;
						anims[13726].primary[15] = 121110559;
						anims[13726].primary[16] = 121110537;
						anims[13726].primary[17] = 121110568;
				}

				// Heavy ballista block.
				anims[13725].allowsRotation = true;
				anims[13725].delayType = 1;
				anims[13725].length = 16;
				anims[13725].padding = -1;
				anims[13725].priority1 = 5;
				anims[13725].resetCycle = 99;
				anims[13725].runFlag = 0;
				anims[13725].shield = -1;
				anims[13725].walkFlag = 1;
				anims[13725].weapon = -1;
				anims[13725].duration = new int[16];
				anims[13725].duration[0] = 4;
				anims[13725].duration[1] = 4;
				anims[13725].duration[2] = 4;
				anims[13725].duration[3] = 4;
				anims[13725].duration[4] = 4;
				anims[13725].duration[5] = 4;
				anims[13725].duration[6] = 4;
				anims[13725].duration[7] = 4;
				anims[13725].duration[8] = 4;
				anims[13725].duration[9] = 4;
				anims[13725].duration[10] = 4;
				anims[13725].duration[11] = 4;
				anims[13725].duration[12] = 4;
				anims[13725].duration[13] = 4;
				anims[13725].duration[14] = 4;
				anims[13725].duration[15] = 5;
				anims[13725].primary = new int[16];
				anims[13725].primary[0] = 121110539;
				anims[13725].primary[1] = 121110593;
				anims[13725].primary[2] = 121110571;
				anims[13725].primary[3] = 121110581;
				anims[13725].primary[4] = 121110619;
				anims[13725].primary[5] = 121110532;
				anims[13725].primary[6] = 121110573;
				anims[13725].primary[7] = 121110612;
				anims[13725].primary[8] = 121110604;
				anims[13725].primary[9] = 121110605;
				anims[13725].primary[10] = 121110572;
				anims[13725].primary[11] = 121110529;
				anims[13725].primary[12] = 121110549;
				anims[13725].primary[13] = 121110618;
				anims[13725].primary[14] = 121110616;
				anims[13725].primary[15] = 121110554;

				// Heavy ballista run.
				anims[13724].allowsRotation = false;
				anims[13724].delayType = 1;
				anims[13724].length = 16;
				anims[13724].padding = -1;
				anims[13724].priority1 = 5;
				anims[13724].resetCycle = 99;
				anims[13724].runFlag = 0;
				anims[13724].shield = -1;
				anims[13724].walkFlag = 0;
				anims[13724].weapon = -1;
				anims[13724].duration = new int[16];
				anims[13724].duration[0] = 2;
				anims[13724].duration[1] = 2;
				anims[13724].duration[2] = 2;
				anims[13724].duration[3] = 2;
				anims[13724].duration[4] = 2;
				anims[13724].duration[5] = 2;
				anims[13724].duration[6] = 2;
				anims[13724].duration[7] = 2;
				anims[13724].duration[8] = 2;
				anims[13724].duration[9] = 2;
				anims[13724].duration[10] = 2;
				anims[13724].duration[11] = 2;
				anims[13724].duration[12] = 2;
				anims[13724].duration[13] = 2;
				anims[13724].duration[14] = 2;
				anims[13724].duration[15] = 2;
				anims[13724].primary = new int[16];
				anims[13724].primary[0] = 121110564;
				anims[13724].primary[1] = 121110589;
				anims[13724].primary[2] = 121110623;
				anims[13724].primary[3] = 121110553;
				anims[13724].primary[4] = 121110541;
				anims[13724].primary[5] = 121110591;
				anims[13724].primary[6] = 121110615;
				anims[13724].primary[7] = 121110540;
				anims[13724].primary[8] = 121110622;
				anims[13724].primary[9] = 121110597;
				anims[13724].primary[10] = 121110625;
				anims[13724].primary[11] = 121110590;
				anims[13724].primary[12] = 121110577;
				anims[13724].primary[13] = 121110530;
				anims[13724].primary[14] = 121110592;
				anims[13724].primary[15] = 121110560;

				// Heavy ballista walk.
				anims[13723].allowsRotation = false;
				anims[13723].delayType = 1;
				anims[13723].length = 16;
				anims[13723].padding = -1;
				anims[13723].priority1 = 5;
				anims[13723].resetCycle = 99;
				anims[13723].runFlag = 0;
				anims[13723].shield = -1;
				anims[13723].walkFlag = 0;
				anims[13723].weapon = -1;
				anims[13723].duration = new int[16];
				anims[13723].duration[0] = 3;
				anims[13723].duration[1] = 3;
				anims[13723].duration[2] = 3;
				anims[13723].duration[3] = 2;
				anims[13723].duration[4] = 3;
				anims[13723].duration[5] = 2;
				anims[13723].duration[6] = 2;
				anims[13723].duration[7] = 2;
				anims[13723].duration[8] = 3;
				anims[13723].duration[9] = 2;
				anims[13723].duration[10] = 3;
				anims[13723].duration[11] = 2;
				anims[13723].duration[12] = 3;
				anims[13723].duration[13] = 2;
				anims[13723].duration[14] = 3;
				anims[13723].duration[15] = 2;
				anims[13723].primary = new int[16];
				anims[13723].primary[0] = 121110578;
				anims[13723].primary[1] = 121110614;
				anims[13723].primary[2] = 121110606;
				anims[13723].primary[3] = 121110588;
				anims[13723].primary[4] = 121110613;
				anims[13723].primary[5] = 121110607;
				anims[13723].primary[6] = 121110608;
				anims[13723].primary[7] = 121110535;
				anims[13723].primary[8] = 121110595;
				anims[13723].primary[9] = 121110611;
				anims[13723].primary[10] = 121110548;
				anims[13723].primary[11] = 121110582;
				anims[13723].primary[12] = 121110565;
				anims[13723].primary[13] = 121110601;
				anims[13723].primary[14] = 121110545;
				anims[13723].primary[15] = 121110583;

				// Heavy ballista stand animation
				anims[13722].allowsRotation = false;
				anims[13722].delayType = 1;
				anims[13722].length = 13;
				anims[13722].padding = -1;
				anims[13722].priority1 = 5;
				anims[13722].resetCycle = 99;
				anims[13722].runFlag = 0;
				anims[13722].shield = -1;
				anims[13722].walkFlag = 0;
				anims[13722].weapon = -1;
				anims[13722].duration = new int[13];
				anims[13722].duration[0] = 4;
				anims[13722].duration[1] = 5;
				anims[13722].duration[2] = 4;
				anims[13722].duration[3] = 5;
				anims[13722].duration[4] = 5;
				anims[13722].duration[5] = 5;
				anims[13722].duration[6] = 4;
				anims[13722].duration[7] = 5;
				anims[13722].duration[8] = 4;
				anims[13722].duration[9] = 5;
				anims[13722].duration[10] = 5;
				anims[13722].duration[11] = 5;
				anims[13722].duration[12] = 4;
				anims[13722].primary = new int[13];
				anims[13722].primary[0] = 121110558;
				anims[13722].primary[1] = 121110528;
				anims[13722].primary[2] = 121110543;
				anims[13722].primary[3] = 121110584;
				anims[13722].primary[4] = 121110587;
				anims[13722].primary[5] = 121110534;
				anims[13722].primary[6] = 121110575;
				anims[13722].primary[7] = 121110533;
				anims[13722].primary[8] = 121110546;
				anims[13722].primary[9] = 121110620;
				anims[13722].primary[10] = 121110536;
				anims[13722].primary[11] = 121110624;
				anims[13722].primary[12] = 121110569;

				// Abyssal tentacle attack animation for 602.
				anims[13721].allowsRotation = true;
				anims[13721].delayType = 2;
				anims[13721].length = 15;
				anims[13721].padding = -1;
				anims[13721].priority1 = 6;
				anims[13721].resetCycle = 99;
				anims[13721].runFlag = 2;
				anims[13721].shield = -1;
				anims[13721].walkFlag = 2;
				anims[13721].weapon = -1;
				anims[13721].vertices = new int[15];
				anims[13721].vertices[0] = 9;
				anims[13721].vertices[1] = 11;
				anims[13721].vertices[2] = 13;
				anims[13721].vertices[3] = 15;
				anims[13721].vertices[4] = 17;
				anims[13721].vertices[5] = 19;
				anims[13721].vertices[6] = 165;
				anims[13721].vertices[7] = 167;
				anims[13721].vertices[8] = 169;
				anims[13721].vertices[9] = 171;
				anims[13721].vertices[10] = 173;
				anims[13721].vertices[11] = 175;
				anims[13721].vertices[12] = 177;
				anims[13721].vertices[13] = 179;
				anims[13721].vertices[14] = 9999999;
				anims[13721].duration = new int[15];
				anims[13721].duration[0] = 4;
				anims[13721].duration[1] = 3;
				anims[13721].duration[2] = 2;
				anims[13721].duration[3] = 1;
				anims[13721].duration[4] = 1;
				anims[13721].duration[5] = 4;
				anims[13721].duration[6] = 2;
				anims[13721].duration[7] = 2;
				anims[13721].duration[8] = 8;
				anims[13721].duration[9] = 1;
				anims[13721].duration[10] = 2;
				anims[13721].duration[11] = 2;
				anims[13721].duration[12] = 3;
				anims[13721].duration[13] = 2;
				anims[13721].duration[14] = 2;
				anims[13721].primary = new int[15];
				anims[13721].primary[0] = 19660990;
				anims[13721].primary[1] = 19661014;
				anims[13721].primary[2] = 19661015;
				anims[13721].primary[3] = 19661016;
				anims[13721].primary[4] = 19661017;
				anims[13721].primary[5] = 19661018;
				anims[13721].primary[6] = 19661019;
				anims[13721].primary[7] = 19661020;
				anims[13721].primary[8] = 19661021;
				anims[13721].primary[9] = 19661008;
				anims[13721].primary[10] = 19661009;
				anims[13721].primary[11] = 19661010;
				anims[13721].primary[12] = 19661011;
				anims[13721].primary[13] = 19661012;
				anims[13721].primary[14] = 19661013;

				// Abyssal tentacle run animation for 602.
				anims[13720].allowsRotation = false;
				anims[13720].delayType = 2;
				anims[13720].length = 24;
				anims[13720].padding = -1;
				anims[13720].priority1 = 5;
				anims[13720].resetCycle = 99;
				anims[13720].runFlag = 0;
				anims[13720].shield = -1;
				anims[13720].walkFlag = 0;
				anims[13720].weapon = -1;
				anims[13720].duration = new int[24];
				anims[13720].duration[0] = 1;
				anims[13720].duration[1] = 2;
				anims[13720].duration[2] = 1;
				anims[13720].duration[3] = 2;
				anims[13720].duration[4] = 1;
				anims[13720].duration[5] = 2;
				anims[13720].duration[6] = 1;
				anims[13720].duration[7] = 2;
				anims[13720].duration[8] = 1;
				anims[13720].duration[9] = 2;
				anims[13720].duration[10] = 1;
				anims[13720].duration[11] = 2;
				anims[13720].duration[12] = 1;
				anims[13720].duration[13] = 2;
				anims[13720].duration[14] = 1;
				anims[13720].duration[15] = 2;
				anims[13720].duration[16] = 1;
				anims[13720].duration[17] = 2;
				anims[13720].duration[18] = 1;
				anims[13720].duration[19] = 2;
				anims[13720].duration[20] = 1;
				anims[13720].duration[21] = 2;
				anims[13720].duration[22] = 1;
				anims[13720].duration[23] = 2;
				anims[13720].primary = new int[24];
				anims[13720].primary[0] = 143065980;
				anims[13720].primary[1] = 143065915;
				anims[13720].primary[2] = 143065910;
				anims[13720].primary[3] = 143065902;
				anims[13720].primary[4] = 143065890;
				anims[13720].primary[5] = 143065945;
				anims[13720].primary[6] = 143065883;
				anims[13720].primary[7] = 143065935;
				anims[13720].primary[8] = 143065913;
				anims[13720].primary[9] = 143065961;
				anims[13720].primary[10] = 143065966;
				anims[13720].primary[11] = 143065882;
				anims[13720].primary[12] = 143065914;
				anims[13720].primary[13] = 143065899;
				anims[13720].primary[14] = 143065924;
				anims[13720].primary[15] = 143065903;
				anims[13720].primary[16] = 143065959;
				anims[13720].primary[17] = 143065984;
				anims[13720].primary[18] = 143065986;
				anims[13720].primary[19] = 143065973;
				anims[13720].primary[20] = 143065908;
				anims[13720].primary[21] = 143065916;
				anims[13720].primary[22] = 143065976;
				anims[13720].primary[23] = 143065936;

				// Sara's blessed sword special attack animation. Copy normal saradomin sword special attack animation and change weapon ids.
				anims[13719].allowsRotation = false;
				anims[13719].delayType = 2;
				anims[13719].length = 28;
				anims[13719].padding = -1;
				anims[13719].priority1 = 6;
				anims[13719].resetCycle = 99;
				anims[13719].runFlag = 2;
				anims[13719].shield = 19172;
				anims[13719].walkFlag = 2;
				anims[13719].weapon = 19172;
				anims[13719].vertices = new int[15];
				anims[13719].vertices[0] = 9;
				anims[13719].vertices[1] = 11;
				anims[13719].vertices[2] = 13;
				anims[13719].vertices[3] = 15;
				anims[13719].vertices[4] = 17;
				anims[13719].vertices[5] = 19;
				anims[13719].vertices[6] = 165;
				anims[13719].vertices[7] = 167;
				anims[13719].vertices[8] = 169;
				anims[13719].vertices[9] = 171;
				anims[13719].vertices[10] = 173;
				anims[13719].vertices[11] = 175;
				anims[13719].vertices[12] = 177;
				anims[13719].vertices[13] = 179;
				anims[13719].vertices[14] = 9999999;
				anims[13719].duration = new int[28];
				anims[13719].duration[0] = 2;
				anims[13719].duration[1] = 2;
				anims[13719].duration[2] = 2;
				anims[13719].duration[3] = 2;
				anims[13719].duration[4] = 2;
				anims[13719].duration[5] = 2;
				anims[13719].duration[6] = 2;
				anims[13719].duration[7] = 3;
				anims[13719].duration[8] = 2;
				anims[13719].duration[9] = 2;
				anims[13719].duration[10] = 2;
				anims[13719].duration[11] = 2;
				anims[13719].duration[12] = 2;
				anims[13719].duration[13] = 2;
				anims[13719].duration[14] = 2;
				anims[13719].duration[15] = 2;
				anims[13719].duration[16] = 2;
				anims[13719].duration[17] = 2;
				anims[13719].duration[18] = 2;
				anims[13719].duration[19] = 2;
				anims[13719].duration[20] = 2;
				anims[13719].duration[21] = 2;
				anims[13719].duration[22] = 2;
				anims[13719].duration[23] = 2;
				anims[13719].duration[24] = 30;
				anims[13719].duration[25] = 2;
				anims[13719].duration[26] = 2;
				anims[13719].duration[27] = 2;
				anims[13719].primary = new int[28];
				anims[13719].primary[0] = 114491686;
				anims[13719].primary[1] = 114491883;
				anims[13719].primary[2] = 114491569;
				anims[13719].primary[3] = 114491757;
				anims[13719].primary[4] = 114491919;
				anims[13719].primary[5] = 114491644;
				anims[13719].primary[6] = 114491744;
				anims[13719].primary[7] = 114491524;
				anims[13719].primary[8] = 114491951;
				anims[13719].primary[9] = 114491890;
				anims[13719].primary[10] = 114491887;
				anims[13719].primary[11] = 114491808;
				anims[13719].primary[12] = 114491791;
				anims[13719].primary[13] = 114491517;
				anims[13719].primary[14] = 114491879;
				anims[13719].primary[15] = 114491592;
				anims[13719].primary[16] = 114491473;
				anims[13719].primary[17] = 114491877;
				anims[13719].primary[18] = 114491449;
				anims[13719].primary[19] = 114491710;
				anims[13719].primary[20] = 114491630;
				anims[13719].primary[21] = 114491461;
				anims[13719].primary[22] = 114491923;
				anims[13719].primary[23] = 114491603;
				anims[13719].primary[24] = 114491603;
				anims[13719].primary[25] = 114491392;
				anims[13719].primary[26] = 114491532;
				anims[13719].primary[27] = 114491686;

				// Fire animation at Edgeville furnace.
				anims[13718].allowsRotation = false;
				anims[13718].delayType = 1;
				anims[13718].length = 6;
				anims[13718].padding = 6;
				anims[13718].priority1 = 5;
				anims[13718].resetCycle = 99;
				anims[13718].runFlag = 0;
				anims[13718].shield = -1;
				anims[13718].walkFlag = 0;
				anims[13718].weapon = -1;
				anims[13718].duration = new int[6];
				anims[13718].duration[0] = 6;
				anims[13718].duration[1] = 5;
				anims[13718].duration[2] = 6;
				anims[13718].duration[3] = 6;
				anims[13718].duration[4] = 5;
				anims[13718].duration[5] = 5;
				anims[13718].primary = new int[6];
				anims[13718].primary[0] = 12320768;
				anims[13718].primary[1] = 12320770;
				anims[13718].primary[2] = 12320772;
				anims[13718].primary[3] = 12320773;
				anims[13718].primary[4] = 12320769;
				anims[13718].primary[5] = 12320771;


				// Altar of the occult animation.
				anims[13717].allowsRotation = false;
				anims[13717].delayType = 1;
				anims[13717].length = 16;
				anims[13717].padding = 16;
				anims[13717].priority1 = 5;
				anims[13717].resetCycle = 99;
				anims[13717].runFlag = 0;
				anims[13717].shield = -1;
				anims[13717].walkFlag = 0;
				anims[13717].weapon = -1;
				anims[13717].duration = new int[16];
				anims[13717].duration[0] = 5;
				anims[13717].duration[1] = 5;
				anims[13717].duration[2] = 5;
				anims[13717].duration[3] = 5;
				anims[13717].duration[4] = 5;
				anims[13717].duration[5] = 5;
				anims[13717].duration[6] = 5;
				anims[13717].duration[7] = 5;
				anims[13717].duration[8] = 5;
				anims[13717].duration[9] = 5;
				anims[13717].duration[10] = 5;
				anims[13717].duration[11] = 5;
				anims[13717].duration[12] = 5;
				anims[13717].duration[13] = 5;
				anims[13717].duration[14] = 5;
				anims[13717].duration[15] = 5;
				anims[13717].primary = new int[16];
				anims[13717].primary[0] = 121765913;
				anims[13717].primary[1] = 121765895;
				anims[13717].primary[2] = 121765898;
				anims[13717].primary[3] = 121765915;
				anims[13717].primary[4] = 121765896;
				anims[13717].primary[5] = 121765918;
				anims[13717].primary[6] = 121765904;
				anims[13717].primary[7] = 121765892;
				anims[13717].primary[8] = 121765906;
				anims[13717].primary[9] = 121765891;
				anims[13717].primary[10] = 121765900;
				anims[13717].primary[11] = 121765893;
				anims[13717].primary[12] = 121765908;
				anims[13717].primary[13] = 121765909;
				anims[13717].primary[14] = 121765919;
				anims[13717].primary[15] = 121765889;


				// Fire object animation at Lizard Shaman.
				anims[13716].allowsRotation = false;
				anims[13716].delayType = 2;
				anims[13716].length = 13;
				anims[13716].padding = 13;
				anims[13716].priority1 = 5;
				anims[13716].resetCycle = 99;
				anims[13716].runFlag = 0;
				anims[13716].shield = -1;
				anims[13716].walkFlag = 0;
				anims[13716].weapon = -1;
				anims[13716].duration = new int[13];
				anims[13716].duration[0] = 5;
				anims[13716].duration[1] = 5;
				anims[13716].duration[2] = 5;
				anims[13716].duration[3] = 5;
				anims[13716].duration[4] = 5;
				anims[13716].duration[5] = 5;
				anims[13716].duration[6] = 5;
				anims[13716].duration[7] = 5;
				anims[13716].duration[8] = 5;
				anims[13716].duration[9] = 5;
				anims[13716].duration[10] = 5;
				anims[13716].duration[11] = 5;
				anims[13716].duration[12] = 5;
				anims[13716].primary = new int[13];
				anims[13716].primary[0] = 110428160;
				anims[13716].primary[1] = 110428165;
				anims[13716].primary[2] = 110428166;
				anims[13716].primary[3] = 110428167;
				anims[13716].primary[4] = 110428168;
				anims[13716].primary[5] = 110428169;
				anims[13716].primary[6] = 110428170;
				anims[13716].primary[7] = 110428171;
				anims[13716].primary[8] = 110428172;
				anims[13716].primary[9] = 110428161;
				anims[13716].primary[10] = 110428162;
				anims[13716].primary[11] = 110428163;
				anims[13716].primary[12] = 110428164;

				// Fire object animation at Lizard Shaman.
				anims[13715].allowsRotation = false;
				anims[13715].delayType = 2;
				anims[13715].length = 26;
				anims[13715].padding = 26;
				anims[13715].priority1 = 5;
				anims[13715].resetCycle = 99;
				anims[13715].runFlag = 0;
				anims[13715].shield = -1;
				anims[13715].walkFlag = 0;
				anims[13715].weapon = -1;
				anims[13715].duration = new int[26];
				anims[13715].duration[0] = 5;
				anims[13715].duration[1] = 5;
				anims[13715].duration[2] = 5;
				anims[13715].duration[3] = 5;
				anims[13715].duration[4] = 5;
				anims[13715].duration[5] = 5;
				anims[13715].duration[6] = 5;
				anims[13715].duration[7] = 5;
				anims[13715].duration[8] = 5;
				anims[13715].duration[9] = 5;
				anims[13715].duration[10] = 5;
				anims[13715].duration[11] = 5;
				anims[13715].duration[12] = 5;
				anims[13715].duration[13] = 5;
				anims[13715].duration[14] = 5;
				anims[13715].duration[15] = 5;
				anims[13715].duration[16] = 5;
				anims[13715].duration[17] = 5;
				anims[13715].duration[18] = 5;
				anims[13715].duration[19] = 5;
				anims[13715].duration[20] = 5;
				anims[13715].duration[21] = 5;
				anims[13715].duration[22] = 5;
				anims[13715].duration[23] = 5;
				anims[13715].duration[24] = 5;
				anims[13715].duration[25] = 5;
				anims[13715].primary = new int[26];
				anims[13715].primary[0] = 110493722;
				anims[13715].primary[1] = 110493733;
				anims[13715].primary[2] = 110493741;
				anims[13715].primary[3] = 110493742;
				anims[13715].primary[4] = 110493743;
				anims[13715].primary[5] = 110493744;
				anims[13715].primary[6] = 110493745;
				anims[13715].primary[7] = 110493746;
				anims[13715].primary[8] = 110493747;
				anims[13715].primary[9] = 110493723;
				anims[13715].primary[10] = 110493724;
				anims[13715].primary[11] = 110493725;
				anims[13715].primary[12] = 110493726;
				anims[13715].primary[13] = 110493727;
				anims[13715].primary[14] = 110493728;
				anims[13715].primary[15] = 110493729;
				anims[13715].primary[16] = 110493730;
				anims[13715].primary[17] = 110493731;
				anims[13715].primary[18] = 110493732;
				anims[13715].primary[19] = 110493734;
				anims[13715].primary[20] = 110493735;
				anims[13715].primary[21] = 110493736;
				anims[13715].primary[22] = 110493737;
				anims[13715].primary[23] = 110493738;
				anims[13715].primary[24] = 110493739;
				anims[13715].primary[25] = 110493740;

				// High alchemy gfx animation.
				anims[13714].allowsRotation = false;
				anims[13714].delayType = 1;
				anims[13714].length = 19;
				anims[13714].padding = -1;
				anims[13714].priority1 = 5;
				anims[13714].resetCycle = 99;
				anims[13714].runFlag = 0;
				anims[13714].shield = -1;
				anims[13714].walkFlag = 0;
				anims[13714].weapon = -1;
				anims[13714].duration = new int[19];
				anims[13714].duration[0] = 8;
				anims[13714].duration[1] = 8;
				anims[13714].duration[2] = 8;
				anims[13714].duration[3] = 8;
				anims[13714].duration[4] = 8;
				anims[13714].duration[5] = 8;
				anims[13714].duration[6] = 8;
				anims[13714].duration[7] = 8;
				anims[13714].duration[8] = 8;
				anims[13714].duration[9] = 8;
				anims[13714].duration[10] = 7;
				anims[13714].duration[11] = 7;
				anims[13714].duration[12] = 7;
				anims[13714].duration[13] = 7;
				anims[13714].duration[14] = 7;
				anims[13714].duration[15] = 7;
				anims[13714].duration[16] = 7;
				anims[13714].duration[17] = 7;
				anims[13714].duration[18] = 4;
				anims[13714].primary = new int[19];
				anims[13714].primary[0] = 61538310;
				anims[13714].primary[1] = 61538311;
				anims[13714].primary[2] = 61538312;
				anims[13714].primary[3] = 61538313;
				anims[13714].primary[4] = 61538314;
				anims[13714].primary[5] = 61538305;
				anims[13714].primary[6] = 61538306;
				anims[13714].primary[7] = 61538305;
				anims[13714].primary[8] = 61538314;
				anims[13714].primary[9] = 61538313;
				anims[13714].primary[10] = 61538312;
				anims[13714].primary[11] = 61538311;
				anims[13714].primary[12] = 61538310;
				anims[13714].primary[13] = 61538311;
				anims[13714].primary[14] = 61538312;
				anims[13714].primary[15] = 61538313;
				anims[13714].primary[16] = 61538314;
				anims[13714].primary[17] = 61538305;
				anims[13714].primary[18] = 61538306;
				anims[13714].secondary = new int[19];
				anims[13714].secondary[0] = -1;
				anims[13714].secondary[1] = -1;
				anims[13714].secondary[2] = -1;
				anims[13714].secondary[3] = -1;
				anims[13714].secondary[4] = -1;
				anims[13714].secondary[5] = -1;
				anims[13714].secondary[6] = -1;
				anims[13714].secondary[7] = -1;
				anims[13714].secondary[8] = -1;
				anims[13714].secondary[9] = -1;
				anims[13714].secondary[10] = -1;
				anims[13714].secondary[11] = -1;
				anims[13714].secondary[12] = -1;
				anims[13714].secondary[13] = -1;
				anims[13714].secondary[14] = -1;
				anims[13714].secondary[15] = -1;
				anims[13714].secondary[16] = -1;
				anims[13714].secondary[17] = -1;
				anims[13714].secondary[18] = -1;

				// Low alchemy gfx animation.
				anims[13713].allowsRotation = false;
				anims[13713].delayType = 1;
				anims[13713].length = 11;
				anims[13713].padding = -1;
				anims[13713].priority1 = 5;
				anims[13713].resetCycle = 99;
				anims[13713].runFlag = 0;
				anims[13713].shield = -1;
				anims[13713].walkFlag = 0;
				anims[13713].weapon = -1;
				anims[13713].duration = new int[11];
				anims[13713].duration[0] = 4;
				anims[13713].duration[1] = 4;
				anims[13713].duration[2] = 4;
				anims[13713].duration[3] = 4;
				anims[13713].duration[4] = 4;
				anims[13713].duration[5] = 4;
				anims[13713].duration[6] = 4;
				anims[13713].duration[7] = 4;
				anims[13713].duration[8] = 4;
				anims[13713].duration[9] = 4;
				anims[13713].duration[10] = 4;
				anims[13713].primary = new int[11];
				anims[13713].primary[0] = 61538304;
				anims[13713].primary[1] = 61538307;
				anims[13713].primary[2] = 61538308;
				anims[13713].primary[3] = 61538309;
				anims[13713].primary[4] = 61538310;
				anims[13713].primary[5] = 61538311;
				anims[13713].primary[6] = 61538312;
				anims[13713].primary[7] = 61538313;
				anims[13713].primary[8] = 61538314;
				anims[13713].primary[9] = 61538305;
				anims[13713].primary[10] = 61538306;
				anims[13713].secondary = new int[11];
				anims[13713].secondary[0] = -1;
				anims[13713].secondary[1] = -1;
				anims[13713].secondary[2] = -1;
				anims[13713].secondary[3] = -1;
				anims[13713].secondary[4] = -1;
				anims[13713].secondary[5] = -1;
				anims[13713].secondary[6] = -1;
				anims[13713].secondary[7] = -1;
				anims[13713].secondary[8] = -1;
				anims[13713].secondary[9] = -1;
				anims[13713].secondary[10] = -1;

				// Animation of Armadyl crossbow gfx.
				anims[13711].allowsRotation = false;
				anims[13711].delayType = 1;
				anims[13711].length = 18;
				anims[13711].padding = -1;
				anims[13711].priority1 = 5;
				anims[13711].resetCycle = 99;
				anims[13711].runFlag = 0;
				anims[13711].shield = -1;
				anims[13711].walkFlag = 0;
				anims[13711].weapon = -1;
				anims[13711].duration = new int[18];
				anims[13711].duration[0] = 4;
				anims[13711].duration[1] = 4;
				anims[13711].duration[2] = 4;
				anims[13711].duration[3] = 4;
				anims[13711].duration[4] = 4;
				anims[13711].duration[5] = 4;
				anims[13711].duration[6] = 4;
				anims[13711].duration[7] = 4;
				anims[13711].duration[8] = 4;
				anims[13711].duration[9] = 4;
				anims[13711].duration[10] = 4;
				anims[13711].duration[11] = 4;
				anims[13711].duration[12] = 4;
				anims[13711].duration[13] = 4;
				anims[13711].duration[14] = 4;
				anims[13711].duration[15] = 4;
				anims[13711].duration[16] = 5;
				anims[13711].duration[17] = 6;
				anims[13711].primary = new int[18];
				anims[13711].primary[0] = 31522826;
				anims[13711].primary[1] = 31522817;
				anims[13711].primary[2] = 31522825;
				anims[13711].primary[3] = 31522818;
				anims[13711].primary[4] = 31522831;
				anims[13711].primary[5] = 31522821;
				anims[13711].primary[6] = 31522828;
				anims[13711].primary[7] = 31522822;
				anims[13711].primary[8] = 31522823;
				anims[13711].primary[9] = 31522830;
				anims[13711].primary[10] = 31522824;
				anims[13711].primary[11] = 31522829;
				anims[13711].primary[12] = 31522832;
				anims[13711].primary[13] = 31522827;
				anims[13711].primary[14] = 31522819;
				anims[13711].primary[15] = 31522816;
				anims[13711].primary[16] = 31522820;
				anims[13711].primary[17] = 31522828;
				anims[13711].secondary = new int[18];
				anims[13711].secondary[0] = -1;
				anims[13711].secondary[1] = -1;
				anims[13711].secondary[2] = -1;
				anims[13711].secondary[3] = -1;
				anims[13711].secondary[4] = -1;
				anims[13711].secondary[5] = -1;
				anims[13711].secondary[6] = -1;
				anims[13711].secondary[7] = -1;
				anims[13711].secondary[8] = -1;
				anims[13711].secondary[9] = -1;
				anims[13711].secondary[10] = -1;
				anims[13711].secondary[11] = -1;
				anims[13711].secondary[12] = -1;
				anims[13711].secondary[13] = -1;
				anims[13711].secondary[14] = -1;
				anims[13711].secondary[15] = -1;
				anims[13711].secondary[16] = -1;
				anims[13711].secondary[17] = -1;


				if (Client.clientRevision("474"))
				{

						// Air guitar animation.
						anims[2414].allowsRotation = false;
						anims[2414].delayType = 2;
						anims[2414].length = 53;
						anims[2414].padding = -1;
						anims[2414].priority1 = 10;
						anims[2414].resetCycle = 99;
						anims[2414].runFlag = 1;
						anims[2414].shield = 0;
						anims[2414].walkFlag = 1;
						anims[2414].weapon = 0;
						anims[2414].duration = new int[53];
						anims[2414].duration[0] = 3;
						anims[2414].duration[1] = 3;
						anims[2414].duration[2] = 3;
						anims[2414].duration[3] = 3;
						anims[2414].duration[4] = 3;
						anims[2414].duration[5] = 3;
						anims[2414].duration[6] = 3;
						anims[2414].duration[7] = 3;
						anims[2414].duration[8] = 3;
						anims[2414].duration[9] = 3;
						anims[2414].duration[10] = 3;
						anims[2414].duration[11] = 3;
						anims[2414].duration[12] = 3;
						anims[2414].duration[13] = 3;
						anims[2414].duration[14] = 3;
						anims[2414].duration[15] = 3;
						anims[2414].duration[16] = 3;
						anims[2414].duration[17] = 3;
						anims[2414].duration[18] = 3;
						anims[2414].duration[19] = 3;
						anims[2414].duration[20] = 3;
						anims[2414].duration[21] = 3;
						anims[2414].duration[22] = 3;
						anims[2414].duration[23] = 3;
						anims[2414].duration[24] = 3;
						anims[2414].duration[25] = 3;
						anims[2414].duration[26] = 3;
						anims[2414].duration[27] = 3;
						anims[2414].duration[28] = 3;
						anims[2414].duration[29] = 3;
						anims[2414].duration[30] = 3;
						anims[2414].duration[31] = 3;
						anims[2414].duration[32] = 3;
						anims[2414].duration[33] = 3;
						anims[2414].duration[34] = 3;
						anims[2414].duration[35] = 3;
						anims[2414].duration[36] = 3;
						anims[2414].duration[37] = 3;
						anims[2414].duration[38] = 3;
						anims[2414].duration[39] = 3;
						anims[2414].duration[40] = 3;
						anims[2414].duration[41] = 3;
						anims[2414].duration[42] = 3;
						anims[2414].duration[43] = 3;
						anims[2414].duration[44] = 3;
						anims[2414].duration[45] = 3;
						anims[2414].duration[46] = 3;
						anims[2414].duration[47] = 3;
						anims[2414].duration[48] = 3;
						anims[2414].duration[49] = 3;
						anims[2414].duration[50] = 3;
						anims[2414].duration[51] = 3;
						anims[2414].duration[52] = 3;
						anims[2414].primary = new int[53];
						anims[2414].primary[0] = 84543403;
						anims[2414].primary[1] = 84543348;
						anims[2414].primary[2] = 84543402;
						anims[2414].primary[3] = 84543385;
						anims[2414].primary[4] = 84543365;
						anims[2414].primary[5] = 84543371;
						anims[2414].primary[6] = 84543381;
						anims[2414].primary[7] = 84543338;
						anims[2414].primary[8] = 84543354;
						anims[2414].primary[9] = 84543364;
						anims[2414].primary[10] = 84543378;
						anims[2414].primary[11] = 84543370;
						anims[2414].primary[12] = 84543399;
						anims[2414].primary[13] = 84543345;
						anims[2414].primary[14] = 84543395;
						anims[2414].primary[15] = 84543376;
						anims[2414].primary[16] = 84543347;
						anims[2414].primary[17] = 84543400;
						anims[2414].primary[18] = 84543343;
						anims[2414].primary[19] = 84543359;
						anims[2414].primary[20] = 84543386;
						anims[2414].primary[21] = 84543380;
						anims[2414].primary[22] = 84543392;
						anims[2414].primary[23] = 84543382;
						anims[2414].primary[24] = 84543372;
						anims[2414].primary[25] = 84543344;
						anims[2414].primary[26] = 84543349;
						anims[2414].primary[27] = 84543388;
						anims[2414].primary[28] = 84543363;
						anims[2414].primary[29] = 84543340;
						anims[2414].primary[30] = 84543342;
						anims[2414].primary[31] = 84543396;
						anims[2414].primary[32] = 84543397;
						anims[2414].primary[33] = 84543353;
						anims[2414].primary[34] = 84543355;
						anims[2414].primary[35] = 84543374;
						anims[2414].primary[36] = 84543346;
						anims[2414].primary[37] = 84543356;
						anims[2414].primary[38] = 84543384;
						anims[2414].primary[39] = 84543391;
						anims[2414].primary[40] = 84543341;
						anims[2414].primary[41] = 84543401;
						anims[2414].primary[42] = 84543389;
						anims[2414].primary[43] = 84543394;
						anims[2414].primary[44] = 84543352;
						anims[2414].primary[45] = 84543375;
						anims[2414].primary[46] = 84543357;
						anims[2414].primary[47] = 84543379;
						anims[2414].primary[48] = 84543369;
						anims[2414].primary[49] = 84543398;
						anims[2414].primary[50] = 84543367;
						anims[2414].primary[51] = 84543362;
						anims[2414].primary[52] = 84543361;

						// Air guitar gfx animation.
						anims[2415].allowsRotation = false;
						anims[2415].delayType = 2;
						anims[2415].length = 42;
						anims[2415].padding = -1;
						anims[2415].priority1 = 5;
						anims[2415].resetCycle = 99;
						anims[2415].runFlag = 0;
						anims[2415].shield = -1;
						anims[2415].walkFlag = 0;
						anims[2415].weapon = -1;
						anims[2415].duration = new int[42];
						anims[2415].duration[0] = 31;
						anims[2415].duration[1] = 8;
						anims[2415].duration[2] = 3;
						anims[2415].duration[3] = 3;
						anims[2415].duration[4] = 3;
						anims[2415].duration[5] = 3;
						anims[2415].duration[6] = 3;
						anims[2415].duration[7] = 3;
						anims[2415].duration[8] = 3;
						anims[2415].duration[9] = 3;
						anims[2415].duration[10] = 3;
						anims[2415].duration[11] = 3;
						anims[2415].duration[12] = 3;
						anims[2415].duration[13] = 3;
						anims[2415].duration[14] = 3;
						anims[2415].duration[15] = 3;
						anims[2415].duration[16] = 3;
						anims[2415].duration[17] = 3;
						anims[2415].duration[18] = 3;
						anims[2415].duration[19] = 3;
						anims[2415].duration[20] = 3;
						anims[2415].duration[21] = 3;
						anims[2415].duration[22] = 3;
						anims[2415].duration[23] = 3;
						anims[2415].duration[24] = 3;
						anims[2415].duration[25] = 3;
						anims[2415].duration[26] = 3;
						anims[2415].duration[27] = 3;
						anims[2415].duration[28] = 3;
						anims[2415].duration[29] = 3;
						anims[2415].duration[30] = 3;
						anims[2415].duration[31] = 3;
						anims[2415].duration[32] = 3;
						anims[2415].duration[33] = 3;
						anims[2415].duration[34] = 3;
						anims[2415].duration[35] = 3;
						anims[2415].duration[36] = 3;
						anims[2415].duration[37] = 3;
						anims[2415].duration[38] = 3;
						anims[2415].duration[39] = 3;
						anims[2415].duration[40] = 3;
						anims[2415].duration[41] = 3;
						anims[2415].primary = new int[42];
						anims[2415].primary[0] = 140247080;
						anims[2415].primary[1] = 140247070;
						anims[2415].primary[2] = 140247063;
						anims[2415].primary[3] = 140247052;
						anims[2415].primary[4] = 140247059;
						anims[2415].primary[5] = 140247047;
						anims[2415].primary[6] = 140247042;
						anims[2415].primary[7] = 140247043;
						anims[2415].primary[8] = 140247044;
						anims[2415].primary[9] = 140247049;
						anims[2415].primary[10] = 140247051;
						anims[2415].primary[11] = 140247078;
						anims[2415].primary[12] = 140247053;
						anims[2415].primary[13] = 140247057;
						anims[2415].primary[14] = 140247046;
						anims[2415].primary[15] = 140247060;
						anims[2415].primary[16] = 140247079;
						anims[2415].primary[17] = 140247056;
						anims[2415].primary[18] = 140247064;
						anims[2415].primary[19] = 140247072;
						anims[2415].primary[20] = 140247055;
						anims[2415].primary[21] = 140247054;
						anims[2415].primary[22] = 140247045;
						anims[2415].primary[23] = 140247048;
						anims[2415].primary[24] = 140247068;
						anims[2415].primary[25] = 140247041;
						anims[2415].primary[26] = 140247050;
						anims[2415].primary[27] = 140247076;
						anims[2415].primary[28] = 140247073;
						anims[2415].primary[29] = 140247058;
						anims[2415].primary[30] = 140247074;
						anims[2415].primary[31] = 140247075;
						anims[2415].primary[32] = 140247040;
						anims[2415].primary[33] = 140247071;
						anims[2415].primary[34] = 140247061;
						anims[2415].primary[35] = 140247069;
						anims[2415].primary[36] = 140247066;
						anims[2415].primary[37] = 140247067;
						anims[2415].primary[38] = 140247065;
						anims[2415].primary[39] = 140247081;
						anims[2415].primary[40] = 140247077;
						anims[2415].primary[41] = 140247062;
				}

				// Max cape gfx animation. file 2617
				anims[13710].allowsRotation = false;
				anims[13710].delayType = 1;
				anims[13710].length = 50;
				anims[13710].padding = -1;
				anims[13710].priority1 = 5;
				anims[13710].resetCycle = 99;
				anims[13710].runFlag = 0;
				anims[13710].shield = -1;
				anims[13710].walkFlag = 0;
				anims[13710].weapon = -1;
				anims[13710].duration = new int[50];
				anims[13710].duration[0] = 4;
				anims[13710].duration[1] = 5;
				anims[13710].duration[2] = 5;
				anims[13710].duration[3] = 4;
				anims[13710].duration[4] = 4;
				anims[13710].duration[5] = 5;
				anims[13710].duration[6] = 4;
				anims[13710].duration[7] = 4;
				anims[13710].duration[8] = 5;
				anims[13710].duration[9] = 5;
				anims[13710].duration[10] = 5;
				anims[13710].duration[11] = 5;
				anims[13710].duration[12] = 4;
				anims[13710].duration[13] = 5;
				anims[13710].duration[14] = 5;
				anims[13710].duration[15] = 5;
				anims[13710].duration[16] = 5;
				anims[13710].duration[17] = 4;
				anims[13710].duration[18] = 5;
				anims[13710].duration[19] = 5;
				anims[13710].duration[20] = 5;
				anims[13710].duration[21] = 5;
				anims[13710].duration[22] = 5;
				anims[13710].duration[23] = 5;
				anims[13710].duration[24] = 5;
				anims[13710].duration[25] = 5;
				anims[13710].duration[26] = 5;
				anims[13710].duration[27] = 5;
				anims[13710].duration[28] = 5;
				anims[13710].duration[29] = 5;
				anims[13710].duration[30] = 5;
				anims[13710].duration[31] = 5;
				anims[13710].duration[32] = 5;
				anims[13710].duration[33] = 5;
				anims[13710].duration[34] = 5;
				anims[13710].duration[35] = 5;
				anims[13710].duration[36] = 5;
				anims[13710].duration[37] = 5;
				anims[13710].duration[38] = 5;
				anims[13710].duration[39] = 5;
				anims[13710].duration[40] = 5;
				anims[13710].duration[41] = 5;
				anims[13710].duration[42] = 5;
				anims[13710].duration[43] = 5;
				anims[13710].duration[44] = 5;
				anims[13710].duration[45] = 5;
				anims[13710].duration[46] = 5;
				anims[13710].duration[47] = 5;
				anims[13710].duration[48] = 5;
				anims[13710].duration[49] = 5;
				anims[13710].primary = new int[50];
				anims[13710].primary[0] = 119668784;
				anims[13710].primary[1] = 119668749;
				anims[13710].primary[2] = 119668778;
				anims[13710].primary[3] = 119668752;
				anims[13710].primary[4] = 119668747;
				anims[13710].primary[5] = 119668783;
				anims[13710].primary[6] = 119668773;
				anims[13710].primary[7] = 119668739;
				anims[13710].primary[8] = 119668774;
				anims[13710].primary[9] = 119668760;
				anims[13710].primary[10] = 119668738;
				anims[13710].primary[11] = 119668762;
				anims[13710].primary[12] = 119668785;
				anims[13710].primary[13] = 119668751;
				anims[13710].primary[14] = 119668761;
				anims[13710].primary[15] = 119668750;
				anims[13710].primary[16] = 119668753;
				anims[13710].primary[17] = 119668772;
				anims[13710].primary[18] = 119668755;
				anims[13710].primary[19] = 119668779;
				anims[13710].primary[20] = 119668766;
				anims[13710].primary[21] = 119668770;
				anims[13710].primary[22] = 119668743;
				anims[13710].primary[23] = 119668748;
				anims[13710].primary[24] = 119668759;
				anims[13710].primary[25] = 119668744;
				anims[13710].primary[26] = 119668768;
				anims[13710].primary[27] = 119668767;
				anims[13710].primary[28] = 119668756;
				anims[13710].primary[29] = 119668737;
				anims[13710].primary[30] = 119668780;
				anims[13710].primary[31] = 119668745;
				anims[13710].primary[32] = 119668776;
				anims[13710].primary[33] = 119668782;
				anims[13710].primary[34] = 119668754;
				anims[13710].primary[35] = 119668757;
				anims[13710].primary[36] = 119668777;
				anims[13710].primary[37] = 119668746;
				anims[13710].primary[38] = 119668740;
				anims[13710].primary[39] = 119668769;
				anims[13710].primary[40] = 119668771;
				anims[13710].primary[41] = 119668781;
				anims[13710].primary[42] = 119668736;
				anims[13710].primary[43] = 119668742;
				anims[13710].primary[44] = 119668763;
				anims[13710].primary[45] = 119668764;
				anims[13710].primary[46] = 119668758;
				anims[13710].primary[47] = 119668741;
				anims[13710].primary[48] = 119668765;
				anims[13710].primary[49] = 119668775;

				// Max cape emote animation. file 1825
				anims[13709].allowsRotation = false;
				anims[13709].delayType = 1;
				anims[13709].length = 44;
				anims[13709].padding = -1;
				anims[13709].priority1 = 5;
				anims[13709].resetCycle = 99;
				anims[13709].runFlag = 1;
				anims[13709].shield = 0;
				anims[13709].walkFlag = 1;
				anims[13709].weapon = 0;
				anims[13709].duration = new int[44];
				anims[13709].duration[0] = 2;
				anims[13709].duration[1] = 4;
				anims[13709].duration[2] = 4;
				anims[13709].duration[3] = 4;
				anims[13709].duration[4] = 4;
				anims[13709].duration[5] = 4;
				anims[13709].duration[6] = 5;
				anims[13709].duration[7] = 4;
				anims[13709].duration[8] = 5;
				anims[13709].duration[9] = 5;
				anims[13709].duration[10] = 6;
				anims[13709].duration[11] = 5;
				anims[13709].duration[12] = 5;
				anims[13709].duration[13] = 3;
				anims[13709].duration[14] = 6;
				anims[13709].duration[15] = 6;
				anims[13709].duration[16] = 6;
				anims[13709].duration[17] = 6;
				anims[13709].duration[18] = 6;
				anims[13709].duration[19] = 8;
				anims[13709].duration[20] = 7;
				anims[13709].duration[21] = 6;
				anims[13709].duration[22] = 6;
				anims[13709].duration[23] = 6;
				anims[13709].duration[24] = 6;
				anims[13709].duration[25] = 6;
				anims[13709].duration[26] = 6;
				anims[13709].duration[27] = 6;
				anims[13709].duration[28] = 6;
				anims[13709].duration[29] = 6;
				anims[13709].duration[30] = 6;
				anims[13709].duration[31] = 5;
				anims[13709].duration[32] = 5;
				anims[13709].duration[33] = 7;
				anims[13709].duration[34] = 7;
				anims[13709].duration[35] = 7;
				anims[13709].duration[36] = 8;
				anims[13709].duration[37] = 8;
				anims[13709].duration[38] = 6;
				anims[13709].duration[39] = 5;
				anims[13709].duration[40] = 8;
				anims[13709].duration[41] = 2;
				anims[13709].duration[42] = 2;
				anims[13709].duration[43] = 17;
				anims[13709].primary = new int[44];
				anims[13709].primary[0] = 119603235;
				anims[13709].primary[1] = 119603226;
				anims[13709].primary[2] = 119603239;
				anims[13709].primary[3] = 119603205;
				anims[13709].primary[4] = 119603238;
				anims[13709].primary[5] = 119603224;
				anims[13709].primary[6] = 119603209;
				anims[13709].primary[7] = 119603237;
				anims[13709].primary[8] = 119603212;
				anims[13709].primary[9] = 119603207;
				anims[13709].primary[10] = 119603227;
				anims[13709].primary[11] = 119603229;
				anims[13709].primary[12] = 119603208;
				anims[13709].primary[13] = 119603230;
				anims[13709].primary[14] = 119603213;
				anims[13709].primary[15] = 119603225;
				anims[13709].primary[16] = 119603236;
				anims[13709].primary[17] = 119603219;
				anims[13709].primary[18] = 119603218;
				anims[13709].primary[19] = 119603210;
				anims[13709].primary[20] = 119603206;
				anims[13709].primary[21] = 119603203;
				anims[13709].primary[22] = 119603240;
				anims[13709].primary[23] = 119603211;
				anims[13709].primary[24] = 119603228;
				anims[13709].primary[25] = 119603223;
				anims[13709].primary[26] = 119603215;
				anims[13709].primary[27] = 119603222;
				anims[13709].primary[28] = 119603220;
				anims[13709].primary[29] = 119603201;
				anims[13709].primary[30] = 119603221;
				anims[13709].primary[31] = 119603233;
				anims[13709].primary[32] = 119603232;
				anims[13709].primary[33] = 119603202;
				anims[13709].primary[34] = 119603214;
				anims[13709].primary[35] = 119603216;
				anims[13709].primary[36] = 119603217;
				anims[13709].primary[37] = 119603243;
				anims[13709].primary[38] = 119603200;
				anims[13709].primary[39] = 119603231;
				anims[13709].primary[40] = 119603241;
				anims[13709].primary[41] = 119603234;
				anims[13709].primary[42] = 119603242;
				anims[13709].primary[43] = 119603204;

				// File 207
				// Infernal axe animation.
				anims[13708].allowsRotation = false;
				anims[13708].delayType = 1;
				anims[13708].length = 6;
				anims[13708].padding = 6;
				anims[13708].priority1 = 0;
				anims[13708].resetCycle = 4;
				anims[13708].runFlag = 1;
				anims[13708].shield = 19269;
				anims[13708].walkFlag = 1;
				anims[13708].weapon = 0;
				anims[13708].duration = new int[6];
				anims[13708].duration[0] = 4;
				anims[13708].duration[1] = 4;
				anims[13708].duration[2] = 10;
				anims[13708].duration[3] = 12;
				anims[13708].duration[4] = 6;
				anims[13708].duration[5] = 4;
				anims[13708].primary = new int[6];
				anims[13708].primary[0] = 13566336;
				anims[13708].primary[1] = 13566337;
				anims[13708].primary[2] = 13566338;
				anims[13708].primary[3] = 13566339;
				anims[13708].primary[4] = 13566340;
				anims[13708].primary[5] = 13566341;

				// File 207
				// Infernal pickaxe animation.
				anims[13707].allowsRotation = false;
				anims[13707].delayType = 1;
				anims[13707].length = 12;
				anims[13707].padding = 8;
				anims[13707].priority1 = 0;
				anims[13707].resetCycle = 8;
				anims[13707].runFlag = 0;
				anims[13707].shield = 0;
				anims[13707].walkFlag = 1;
				anims[13707].weapon = 19270;
				anims[13707].duration = new int[12];
				anims[13707].duration[0] = 5;
				anims[13707].duration[1] = 3;
				anims[13707].duration[2] = 3;
				anims[13707].duration[3] = 3;
				anims[13707].duration[4] = 3;
				anims[13707].duration[5] = 3;
				anims[13707].duration[6] = 3;
				anims[13707].duration[7] = 3;
				anims[13707].duration[8] = 16;
				anims[13707].duration[9] = 3;
				anims[13707].duration[10] = 5;
				anims[13707].duration[11] = 5;
				anims[13707].primary = new int[12];
				anims[13707].primary[0] = 13566129;
				anims[13707].primary[1] = 13566133;
				anims[13707].primary[2] = 13566134;
				anims[13707].primary[3] = 13566135;
				anims[13707].primary[4] = 13566136;
				anims[13707].primary[5] = 13566137;
				anims[13707].primary[6] = 13566138;
				anims[13707].primary[7] = 13566139;
				anims[13707].primary[8] = 13566140;
				anims[13707].primary[9] = 13566130;
				anims[13707].primary[10] = 13566131;
				anims[13707].primary[11] = 13566132;

				// Cerberus death animation.
				anims[13706].allowsRotation = false;
				anims[13706].delayType = 1;
				anims[13706].length = 14;
				anims[13706].padding = 1;
				anims[13706].priority1 = 10;
				anims[13706].resetCycle = 99;
				anims[13706].runFlag = 0;
				anims[13706].shield = -1;
				anims[13706].walkFlag = 0;
				anims[13706].weapon = -1;
				anims[13706].duration = new int[14];
				anims[13706].duration[0] = 5;
				anims[13706].duration[1] = 5;
				anims[13706].duration[2] = 5;
				anims[13706].duration[3] = 5;
				anims[13706].duration[4] = 5;
				anims[13706].duration[5] = 5;
				anims[13706].duration[6] = 3;
				anims[13706].duration[7] = 3;
				anims[13706].duration[8] = 5;
				anims[13706].duration[9] = 5;
				anims[13706].duration[10] = 3;
				anims[13706].duration[11] = 3;
				anims[13706].duration[12] = 4;
				anims[13706].duration[13] = 4;
				anims[13706].primary = new int[14];
				anims[13706].primary[0] = 117309441;
				anims[13706].primary[1] = 117309557;
				anims[13706].primary[2] = 117309612;
				anims[13706].primary[3] = 117309536;
				anims[13706].primary[4] = 117309603;
				anims[13706].primary[5] = 117309563;
				anims[13706].primary[6] = 117309609;
				anims[13706].primary[7] = 117309567;
				anims[13706].primary[8] = 117309502;
				anims[13706].primary[9] = 117309607;
				anims[13706].primary[10] = 117309516;
				anims[13706].primary[11] = 117309626;
				anims[13706].primary[12] = 117309463;
				anims[13706].primary[13] = 117309514;


				// Cerberus map, fire object animation.
				anims[13705].allowsRotation = false;
				anims[13705].delayType = 1;
				anims[13705].length = 5;
				anims[13705].padding = 5;
				anims[13705].priority1 = 5;
				anims[13705].resetCycle = 99;
				anims[13705].runFlag = 0;
				anims[13705].shield = -1;
				anims[13705].walkFlag = 0;
				anims[13705].weapon = -1;
				anims[13705].duration = new int[5];
				anims[13705].duration[0] = 4;
				anims[13705].duration[1] = 3;
				anims[13705].duration[2] = 3;
				anims[13705].duration[3] = 3;
				anims[13705].duration[4] = 3;
				anims[13705].primary = new int[5];
				anims[13705].primary[0] = 55181312;
				anims[13705].primary[1] = 55181313;
				anims[13705].primary[2] = 55181314;
				anims[13705].primary[3] = 55181315;
				anims[13705].primary[4] = 55181316;


				// Cerberus map, skull object animation.
				anims[13704].allowsRotation = false;
				anims[13704].delayType = 1;
				anims[13704].length = 23;
				anims[13704].padding = 23;
				anims[13704].priority1 = 5;
				anims[13704].resetCycle = 99;
				anims[13704].runFlag = 0;
				anims[13704].shield = -1;
				anims[13704].walkFlag = 0;
				anims[13704].weapon = -1;
				anims[13704].duration = new int[23];
				anims[13704].duration[0] = 5;
				anims[13704].duration[1] = 5;
				anims[13704].duration[2] = 5;
				anims[13704].duration[3] = 5;
				anims[13704].duration[4] = 5;
				anims[13704].duration[5] = 5;
				anims[13704].duration[6] = 6;
				anims[13704].duration[7] = 6;
				anims[13704].duration[8] = 6;
				anims[13704].duration[9] = 6;
				anims[13704].duration[10] = 5;
				anims[13704].duration[11] = 6;
				anims[13704].duration[12] = 5;
				anims[13704].duration[13] = 5;
				anims[13704].duration[14] = 5;
				anims[13704].duration[15] = 5;
				anims[13704].duration[16] = 5;
				anims[13704].duration[17] = 5;
				anims[13704].duration[18] = 5;
				anims[13704].duration[19] = 5;
				anims[13704].duration[20] = 5;
				anims[13704].duration[21] = 5;
				anims[13704].duration[22] = 5;
				anims[13704].primary = new int[23];
				anims[13704].primary[0] = 117374999;
				anims[13704].primary[1] = 117374998;
				anims[13704].primary[2] = 117374986;
				anims[13704].primary[3] = 117374985;
				anims[13704].primary[4] = 117374991;
				anims[13704].primary[5] = 117374982;
				anims[13704].primary[6] = 117375002;
				anims[13704].primary[7] = 117374984;
				anims[13704].primary[8] = 117374976;
				anims[13704].primary[9] = 117375001;
				anims[13704].primary[10] = 117374983;
				anims[13704].primary[11] = 117374988;
				anims[13704].primary[12] = 117375000;
				anims[13704].primary[13] = 117375004;
				anims[13704].primary[14] = 117374978;
				anims[13704].primary[15] = 117374993;
				anims[13704].primary[16] = 117374977;
				anims[13704].primary[17] = 117374992;
				anims[13704].primary[18] = 117374989;
				anims[13704].primary[19] = 117374995;
				anims[13704].primary[20] = 117375005;
				anims[13704].primary[21] = 117374996;
				anims[13704].primary[22] = 117374981;


				// Cerberus stand animation.
				anims[13700].allowsRotation = false;
				anims[13700].delayType = 1;
				anims[13700].length = 14;
				anims[13700].padding = -1;
				anims[13700].priority1 = 5;
				anims[13700].resetCycle = 99;
				anims[13700].runFlag = 0;
				anims[13700].shield = -1;
				anims[13700].walkFlag = 0;
				anims[13700].weapon = -1;
				anims[13700].duration = new int[14];
				anims[13700].duration[0] = 3;
				anims[13700].duration[1] = 5;
				anims[13700].duration[2] = 7;
				anims[13700].duration[3] = 7;
				anims[13700].duration[4] = 11;
				anims[13700].duration[5] = 7;
				anims[13700].duration[6] = 7;
				anims[13700].duration[7] = 5;
				anims[13700].duration[8] = 7;
				anims[13700].duration[9] = 5;
				anims[13700].duration[10] = 6;
				anims[13700].duration[11] = 9;
				anims[13700].duration[12] = 8;
				anims[13700].duration[13] = 4;
				anims[13700].primary = new int[14];
				anims[13700].primary[0] = 117309461;
				anims[13700].primary[1] = 117309547;
				anims[13700].primary[2] = 117309462;
				anims[13700].primary[3] = 117309623;
				anims[13700].primary[4] = 117309548;
				anims[13700].primary[5] = 117309621;
				anims[13700].primary[6] = 117309454;
				anims[13700].primary[7] = 117309599;
				anims[13700].primary[8] = 117309473;
				anims[13700].primary[9] = 117309488;
				anims[13700].primary[10] = 117309559;
				anims[13700].primary[11] = 117309541;
				anims[13700].primary[12] = 117309588;
				anims[13700].primary[13] = 117309622;

				// Cerberus walk animation
				anims[13701].allowsRotation = false;
				anims[13701].delayType = 1;
				anims[13701].length = 15;
				anims[13701].padding = -1;
				anims[13701].priority1 = 5;
				anims[13701].resetCycle = 99;
				anims[13701].runFlag = 0;
				anims[13701].shield = -1;
				anims[13701].walkFlag = 0;
				anims[13701].weapon = -1;
				anims[13701].duration = new int[15];
				anims[13701].duration[0] = 4;
				anims[13701].duration[1] = 4;
				anims[13701].duration[2] = 4;
				anims[13701].duration[3] = 4;
				anims[13701].duration[4] = 4;
				anims[13701].duration[5] = 4;
				anims[13701].duration[6] = 4;
				anims[13701].duration[7] = 4;
				anims[13701].duration[8] = 4;
				anims[13701].duration[9] = 4;
				anims[13701].duration[10] = 4;
				anims[13701].duration[11] = 4;
				anims[13701].duration[12] = 4;
				anims[13701].duration[13] = 4;
				anims[13701].duration[14] = 4;
				anims[13701].primary = new int[15];
				anims[13701].primary[0] = 117309535;
				anims[13701].primary[1] = 117309468;
				anims[13701].primary[2] = 117309534;
				anims[13701].primary[3] = 117309569;
				anims[13701].primary[4] = 117309581;
				anims[13701].primary[5] = 117309507;
				anims[13701].primary[6] = 117309443;
				anims[13701].primary[7] = 117309598;
				anims[13701].primary[8] = 117309444;
				anims[13701].primary[9] = 117309466;
				anims[13701].primary[10] = 117309576;
				anims[13701].primary[11] = 117309551;
				anims[13701].primary[12] = 117309464;
				anims[13701].primary[13] = 117309543;
				anims[13701].primary[14] = 117309446;

				// Cerberus attack animation.
				anims[13702].allowsRotation = false;
				anims[13702].delayType = 1;
				anims[13702].length = 12;
				anims[13702].padding = -1;
				anims[13702].priority1 = 6;
				anims[13702].resetCycle = 99;
				anims[13702].runFlag = 0;
				anims[13702].shield = -1;
				anims[13702].walkFlag = 0;
				anims[13702].weapon = -1;
				anims[13702].duration = new int[12];
				anims[13702].duration[0] = 5;
				anims[13702].duration[1] = 5;
				anims[13702].duration[2] = 5;
				anims[13702].duration[3] = 5;
				anims[13702].duration[4] = 5;
				anims[13702].duration[5] = 5;
				anims[13702].duration[6] = 5;
				anims[13702].duration[7] = 5;
				anims[13702].duration[8] = 5;
				anims[13702].duration[9] = 5;
				anims[13702].duration[10] = 5;
				anims[13702].duration[11] = 5;
				anims[13702].primary = new int[12];
				anims[13702].primary[0] = 117309506;
				anims[13702].primary[1] = 117309477;
				anims[13702].primary[2] = 117309519;
				anims[13702].primary[3] = 117309483;
				anims[13702].primary[4] = 117309558;
				anims[13702].primary[5] = 117309619;
				anims[13702].primary[6] = 117309613;
				anims[13702].primary[7] = 117309561;
				anims[13702].primary[8] = 117309476;
				anims[13702].primary[9] = 117309512;
				anims[13702].primary[10] = 117309452;
				anims[13702].primary[11] = 117309495;

				// Animation of Cerberus gfx
				anims[13703].allowsRotation = false;
				anims[13703].delayType = 1;
				anims[13703].length = 3;
				anims[13703].padding = -1;
				anims[13703].priority1 = 5;
				anims[13703].resetCycle = 99;
				anims[13703].runFlag = 0;
				anims[13703].shield = -1;
				anims[13703].walkFlag = 0;
				anims[13703].weapon = -1;
				anims[13703].duration = new int[3];
				anims[13703].duration[0] = 5;
				anims[13703].duration[1] = 5;
				anims[13703].duration[2] = 5;
				anims[13703].primary = new int[3];
				anims[13703].primary[0] = 117506056;
				anims[13703].primary[1] = 117506050;
				anims[13703].primary[2] = 117506060;
		}

		public int getDuration(int i)
		{
				int j = duration[i];
				if (j == 0)
				{
						SequenceFrame class36 = SequenceFrame.get(primary[i]);
						if (class36 != null)
						{
								j = duration[i] = 0;
						}
				}
				if (j == 0)
				{
						j = 1;
				}
				return j;
		}

		private Animation()
		{
				padding = -1;
				allowsRotation = false;
				priority1 = 5;
				shield = -1;
				weapon = -1;
				resetCycle = 99;
				runFlag = -1;
				walkFlag = -1;
				delayType = 2;
		}

		public static Animation get(int id)
		{
				return id >= 0 && id < anims.length ? anims[id] : null;
		}

		public int getFrame(int id)
		{
				return id >= 0 && primary != null && id < primary.length ? primary[id] : -1;
		}

		private void readValues525(Stream stream)
		{
				do
				{
						int i = stream.readUnsignedByte();
						if (i == 0)
								break;
						if (i == 1)
						{
								length = stream.readUnsignedWord();
								primary = new int[length];
								secondary = new int[length];
								duration = new int[length];
								for (int j = 0; j < length; j++)
								{
										primary[j] = stream.readDWord();
										secondary[j] = -1;
								}


								for (int j = 0; j < length; j++)
										duration[j] = stream.readUnsignedByte();

						}
						else if (i == 2)
								padding = stream.readUnsignedWord();
						else if (i == 3)
						{
								int k = stream.readUnsignedByte();
								vertices = new int[k + 1];
								for (int l = 0; l < k; l++)
										vertices[l] = stream.readUnsignedByte();
								vertices[k] = 0x98967f;
						}
						else if (i == 4)
								allowsRotation = true;
						else if (i == 5)
								priority1 = stream.readUnsignedByte();
						else if (i == 6)
								shield = stream.readUnsignedWord();
						else if (i == 7)
								weapon = stream.readUnsignedWord();
						else if (i == 8)
								resetCycle = stream.readUnsignedByte();
						else if (i == 9)
								runFlag = stream.readUnsignedByte();
						else if (i == 10)
								walkFlag = stream.readUnsignedByte();
						else if (i == 11)
								delayType = stream.readUnsignedByte();
						else
								Utility.print("Error unrecognised seq config code: " + i);
				}
				while (true);
				if (length == 0)
				{
						length = 1;
						primary = new int[1];
						primary[0] = -1;
						secondary = new int[1];
						secondary[0] = -1;
						duration = new int[1];
						duration[0] = -1;
				}
				if (runFlag == -1)
						if (vertices != null)
								runFlag = 2;
						else
								runFlag = 0;
				if (walkFlag == -1)
				{
						if (vertices != null)
						{
								walkFlag = 2;
								return;
						}
						walkFlag = 0;
				}
				/*
				if (shield == 65535)
					shield = 0;
				if (weapon == 65535)
					weapon = 0;
					*/
		}


		private void readValues602(Stream stream)
		{
				do
				{
						int i = stream.readUnsignedByte();
						if (i == 0)
								break;
						if (i == 1)
						{
								length = stream.readUnsignedWord();
								primary = new int[length];
								secondary = new int[length];
								duration = new int[length];
								for (int j = 0; j < length; j++)
								{
										primary[j] = stream.readDWord();
										secondary[j] = -1;
								}


								for (int j = 0; j < length; j++)
										duration[j] = stream.readUnsignedByte();

						}
						else if (i == 2)
								padding = stream.readUnsignedWord();
						else if (i == 3)
						{
								int k = stream.readUnsignedByte();
								vertices = new int[k + 1];
								for (int l = 0; l < k; l++)
										vertices[l] = stream.readUnsignedByte();
								vertices[k] = 0x98967f;
						}
						else if (i == 4)
								allowsRotation = true;
						else if (i == 5)
								priority1 = stream.readUnsignedByte();
						else if (i == 6)
								shield = stream.readUnsignedWord();
						else if (i == 7)
								weapon = stream.readUnsignedWord();
						else if (i == 8)
								resetCycle = stream.readUnsignedByte();
						else if (i == 9)
								runFlag = stream.readUnsignedByte();
						else if (i == 10)
								walkFlag = stream.readUnsignedByte();
						else if (i == 11)
								delayType = stream.readUnsignedByte();
						else if (i == 12)
								stream.readDWord();
						else
								Utility.print("Error unrecognised seq config code: " + i);
				}
				while (true);
				if (length == 0)
				{
						length = 1;
						primary = new int[1];
						primary[0] = -1;
						secondary = new int[1];
						secondary[0] = -1;
						duration = new int[1];
						duration[0] = -1;
				}
				if (runFlag == -1)
						if (vertices != null)
								runFlag = 2;
						else
								runFlag = 0;
				if (walkFlag == -1)
				{
						if (vertices != null)
						{
								walkFlag = 2;
								return;
						}
						walkFlag = 0;
				}
				if (shield == 65535)
						shield = 0;
				if (weapon == 65535)
						weapon = 0;
		}

		public void readValues474(Stream stream)
		{
				do
				{
						int i = stream.readUnsignedByte();
						if (i == 0)
								break;
						if (i == 1)
						{
								length = stream.readUnsignedWord();
								primary = new int[length];
								secondary = new int[length];
								duration = new int[length];
								for (int j = 0; j < length; j++)
								{
										duration[j] = stream.readUnsignedWord();
										secondary[j] = -1;
								}
								for (int j = 0; j < length; j++)
										primary[j] = stream.readUnsignedWord();
								for (int i1 = 0; i1 < length; i1++)
								{
										primary[i1] = (stream.readUnsignedWord() << 16) + primary[i1];
								}
						}
						else if (i == 2)
								padding = stream.readUnsignedWord();
						else if (i == 3)
						{
								int k = stream.readUnsignedByte();
								vertices = new int[k + 1];
								for (int l = 0; l < k; l++)
										vertices[l] = stream.readUnsignedByte();

								vertices[k] = 0x98967f;
						}
						else if (i == 4)
								allowsRotation = true;
						else if (i == 5)
								priority1 = stream.readUnsignedByte();
						else if (i == 6)
								shield = stream.readUnsignedWord();
						else if (i == 7)
						{
								weapon = stream.readUnsignedWord();
						}
						else if (i == 8)
								resetCycle = stream.readUnsignedByte();
						else if (i == 9)
								runFlag = stream.readUnsignedByte();
						else if (i == 10)
								walkFlag = stream.readUnsignedByte();
						else if (i == 11)
								delayType = stream.readUnsignedByte();
						else if (i == 12)
								stream.readDWord();
						else
						{
								Utility.print("Error unrecognised seq config code: " + i);
						}
				}
				while (true);
				if (length == 0)
				{
						length = 1;
						primary = new int[1];
						primary[0] = -1;
						secondary = new int[1];
						secondary[0] = -1;
						duration = new int[1];
						duration[0] = -1;
				}
				if (runFlag == -1)
						if (vertices != null)
								runFlag = 2;
						else
								runFlag = 0;
				if (walkFlag == -1)
				{
						if (vertices != null)
						{
								walkFlag = 2;
								return;
						}
						walkFlag = 0;
				}
		}

		public static Animation anims[];

		public int length;

		public int primary[];

		public int secondary[];

		int[] duration;

		public int padding;

		public int vertices[];

		public boolean allowsRotation;

		public int priority1;

		/**
		 * Shield item, this value will be the item id needed + 512.
		 */
		public int shield;

		/**
		 * Weapon item, this value will be the item id needed + 512.
		 */
		public int weapon;

		public int resetCycle;

		public int runFlag;

		public int walkFlag;

		public int delayType;
}