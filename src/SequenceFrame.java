public final class SequenceFrame
{

		public static void method528(int i)
		{
				animationlist = new SequenceFrame[4000][0];
		}

		public static void load(int fileId, byte[] fileData)
		{
				// File id in the cache.
				if (Client.clientRevision("474"))
				{
						// 1771 is the animation file of the Ags gfx.
						// 1662 is the dog pet walk animation.
						if (fileId > 1845 || fileId == 1771 || fileId == 1662)
						{
								load602(fileId, fileData);
						}
						else
						{
								load474(fileId, fileData);
						}
				}
				else
				{
						load602(fileId, fileData);
				}
		}

		public static void nullLoader()
		{
				animationlist = null;
		}

		public static SequenceFrame get(int j)
		{
				// j is one of the primary variables in the Animation class.
				// So for Cerberus it is going to be any of the following:
				/*
				 * anims[13700].primary = new int[14];
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
				 */
				// if file == 1790, check if the j is equal to one of the primary arrays above, if it is, change file id to a different one.


				try
				{
						String s = "";
						int file = 0;
						int k = 0;
						s = Integer.toHexString(j);
						file = Integer.parseInt(s.substring(0, s.length() - 4), 16);
						k = Integer.parseInt(s.substring(s.length() - 4), 16);

						// On the osrs client, it uses 1790 file id for the animation, i got to change it to an unused id so it doesn't ruin my other animations.
						// It decrypts the file id from the primary array.
						// Some file ids can manage multiple animations.
						boolean foundMatch = false;
						int newFileId = 0;
						int animationId = 0;



						// Animation 13707, Infernal pickaxe animation.
						if (file == 207)
						{
								if (!foundMatch)
								{
										newFileId = 3148;
										animationId = 13707;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Animation 13708, Infernal pickaxe animation.
						else if (file == 207)
						{
								if (!foundMatch)
								{
										newFileId = 3148;
										animationId = 13708;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Max cape emote animation. 
						else if (file == 1825)
						{
								if (!foundMatch)
								{
										newFileId = 3149;
										animationId = 13709;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Max cape emote gfx animation. 
						else if (file == 1826)
						{
								if (!foundMatch)
								{
										newFileId = 3150;
										animationId = 13710;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Air guitar animation
						else if (file == 1290 && Client.clientRevision("474"))
						{
								if (!foundMatch)
								{
										newFileId = 3151;
										animationId = 2414;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Armadyl crossbow gfx animation.
						else if (file == 481)
						{
								if (!foundMatch)
								{
										newFileId = 3152;
										animationId = 13711;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Altar of the occult object animation.
						else if (file == 1858)
						{
								if (!foundMatch)
								{
										newFileId = 3155;
										animationId = 13717;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Fire animation at Edgeville furnace.
						else if (file == 188)
						{
								if (!foundMatch)
								{
										newFileId = 3156;
										animationId = 13718;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Fire animation at Edgeville furnace.
						else if (file == 188)
						{
								if (!foundMatch)
								{
										newFileId = 3156;
										animationId = 13718;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Abyssal tentacle run animation for 602.
						else if (file == 2183 && Client.clientRevision("602"))
						{
								if (!foundMatch)
								{
										newFileId = 3157;
										animationId = 13720;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Abyssal tentacle attack animation for 602.
						else if (file == 3158 && Client.clientRevision("602"))
						{
								if (!foundMatch)
								{
										newFileId = 3158;
										animationId = 13721;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						// Heavy ballista animation
						else if (file == 1848)
						{
								if (!foundMatch)
								{
										newFileId = 3159;
										animationId = 13722;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
								if (!foundMatch)
								{
										newFileId = 3159;
										animationId = 13723;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
								if (!foundMatch)
								{
										newFileId = 3159;
										animationId = 13724;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
								if (!foundMatch)
								{
										newFileId = 3159;
										animationId = 13725;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
								if (!foundMatch)
								{
										newFileId = 3159;
										animationId = 13726;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
								if (!foundMatch)
								{
										newFileId = 3159;
										animationId = 13727;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}
						// Abyssal dagger special attack gfx animation.
						else if (file == 1815)
						{
								if (!foundMatch)
								{
										newFileId = 3160;
										animationId = 13728;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}
						// Abyssal dagger special attack gfx animation.
						else if (file == 294 && Client.clientRevision("602"))
						{
								if (!foundMatch)
								{
										newFileId = 3161;
										animationId = 13729;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}
						// Elder maul animations.
						else if (file == 1877)
						{
								if (!foundMatch)
								{
										newFileId = 3162;
										animationId = 13730;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
								if (!foundMatch)
								{
										newFileId = 3162;
										animationId = 13731;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
								if (!foundMatch)
								{
										newFileId = 3162;
										animationId = 13732;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
								if (!foundMatch)
								{
										newFileId = 3162;
										animationId = 13733;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
								if (!foundMatch)
								{
										newFileId = 3162;
										animationId = 13734;
										for (int index = 0; index < Animation.anims[animationId].primary.length; index++)
										{
												if (Animation.anims[animationId].primary[index] == j)
												{
														file = newFileId;
														foundMatch = true;
														break;
												}
										}
								}
						}

						if (animationlist[file].length == 0)
						{
								Client.onDemandFetcher.sendImmediately(1, file);
								return null;
						}
						if (file > animationlist.length - 1)
						{
								return null;
						}
						if (k > animationlist[file].length - 1)
						{
								return null;
						}
						return animationlist[file][k];
				}
				catch (

				Exception e)

				{
						e.printStackTrace();
						return null;
				}

		}

		public static boolean isNegativeZero(int i)
		{
				return i == -1;
		}

		private SequenceFrame()
		{
		}

		public static void loadOsrs(int file, byte[] fileData)
		{
				try
				{
						final Stream stream = new Stream(fileData);
						SkinList b2 = new SkinList(stream, file, true); // Have to change SkinList method.
						final int n = stream.readUnsignedWord();
						;
						animationlist[file] = new SequenceFrame[n * 3];
						final int[] array2 = new int[500];
						final int[] array3 = new int[500];
						final int[] array4 = new int[500];
						final int[] array5 = new int[500];
						for (int j = 0; j < n; ++j)
						{
								final int k = stream.readUnsignedWord();
								;
								final SequenceFrame[] array6 = animationlist[file];
								final int n2 = k;
								final SequenceFrame q = new SequenceFrame();
								array6[n2] = q;
								final SequenceFrame q2 = q;
								q.skinlist = b2;
								final int f = stream.readUnsignedByte();
								int c2 = 0;
								int n3 = -1;
								for (int l = 0; l < f; ++l)
								{
										final int f2;
										if ((f2 = stream.readUnsignedByte()) > 0)
										{
												if (b2.opcode[l] != 0)
												{
														for (int n4 = l - 1; n4 > n3; --n4)
														{
																if (b2.opcode[n4] == 0)
																{
																		array2[c2] = n4;
																		array3[c2] = 0;
																		array5[c2] = (array4[c2] = 0);
																		++c2;
																		break;
																}
														}
												}
												array2[c2] = l;
												int n4 = 0;
												if (b2.opcode[l] == 3)
												{
														n4 = 128;
												}
												if ((f2 & 0x1) != 0x0)
												{
														array3[c2] = stream.readShort2();
												}
												else
												{
														array3[c2] = n4;
												}
												if ((f2 & 0x2) != 0x0)
												{
														array4[c2] = stream.readShort2();
												}
												else
												{
														array4[c2] = n4;
												}
												if ((f2 & 0x4) != 0x0)
												{
														array5[c2] = stream.readShort2();
												}
												else
												{
														array5[c2] = n4;
												}
												n3 = l;
												++c2;
										}
								}
								q2.stepcount = c2;
								q2.opcodeLinkTable = new int[c2];
								q2.modifier1 = new int[c2];
								q2.modifier2 = new int[c2];
								q2.modifier3 = new int[c2];
								for (int l = 0; l < c2; ++l)
								{
										q2.opcodeLinkTable[l] = array2[l];
										q2.modifier1[l] = array3[l];
										q2.modifier2[l] = array4[l];
										q2.modifier3[l] = array5[l];
								}
						}
				}
				catch (Exception ex)
				{
				}
		}

		private static void load602(int file, byte[] fileData)
		{
				try
				{
						Stream stream = new Stream(fileData);
						SkinList class18 = new SkinList(stream, file, false);
						int k1 = stream.readUnsignedWord();
						animationlist[file] = new SequenceFrame[(int) (k1 * 3.0)];
						int ai[] = new int[500];
						int ai1[] = new int[500];
						int ai2[] = new int[500];
						int ai3[] = new int[500];
						for (int l1 = 0; l1 < k1; l1++)
						{
								int i2 = stream.readUnsignedWord();
								SequenceFrame class36 = animationlist[file][i2] = new SequenceFrame();
								class36.skinlist = class18;
								int j2 = stream.readUnsignedByte();
								int l2 = 0;
								int k2 = -1;
								for (int i3 = 0; i3 < j2; i3++)
								{
										int j3 = stream.readUnsignedByte();
										if (j3 > 0)
										{
												if (class18.opcode[i3] != 0)
												{
														for (int l3 = i3 - 1; l3 > k2; l3--)
														{
																if (class18.opcode[l3] != 0)
																		continue;
																ai[l2] = l3;
																ai1[l2] = 0;
																ai2[l2] = 0;
																ai3[l2] = 0;
																l2++;
																break;
														}
												}
												ai[l2] = i3;
												int c = 0;
												if (class18.opcode[i3] == 3)
												{
														c = (short) 128;
												}

												if ((j3 & 1) != 0)
												{
														ai1[l2] = (short) stream.readShort2();
												}
												else
												{
														ai1[l2] = c;
												}
												if ((j3 & 2) != 0)
												{
														ai2[l2] = stream.readShort2();
												}
												else
												{
														ai2[l2] = c;
												}
												if ((j3 & 4) != 0)
												{
														ai3[l2] = stream.readShort2();
												}
												else
												{
														ai3[l2] = c;
												}
												if (Client.newTweening && Client.tweening)
												{
														if (class18.opcode[i3] == 2)
														{
																ai1[l2] = ((ai1[l2] & 0xff) << 3) + (ai1[l2] >> 8 & 0x7);
																ai2[l2] = ((ai2[l2] & 0xff) << 3) + (ai2[l2] >> 8 & 0x7);
																ai3[l2] = ((ai3[l2] & 0xff) << 3) + (ai3[l2] >> 8 & 0x7);
														}
												}
												k2 = i3;
												l2++;
										}
								}
								class36.stepcount = l2;
								class36.opcodeLinkTable = new int[l2];
								class36.modifier1 = new int[l2];
								class36.modifier2 = new int[l2];
								class36.modifier3 = new int[l2];
								for (int k3 = 0; k3 < l2; k3++)
								{
										class36.opcodeLinkTable[k3] = ai[k3];
										class36.modifier1[k3] = ai1[k3];
										class36.modifier2[k3] = ai2[k3];
										class36.modifier3[k3] = ai3[k3];
								}
						}
				}
				catch (Exception exception)
				{
				}
		}

		private static void load474(int file, byte[] fileData)
		{
				Stream stream = new Stream(fileData);
				stream.currentOffset = fileData.length - 12;
				int i = stream.readDWord();
				int j = stream.readDWord();
				int k = stream.readDWord();
				int i1 = 0;
				Stream stream_1 = new Stream(fileData);
				stream_1.currentOffset = i1;
				i1 += i + 4;
				Stream stream_2 = new Stream(fileData);
				stream_2.currentOffset = i1;
				i1 += j;
				Stream stream_3 = new Stream(fileData);
				stream_3.currentOffset = i1;
				i1 += k;
				Stream stream_4 = new Stream(fileData);
				stream_4.currentOffset = i1;
				SkinList class18 = new SkinList(stream_4, file, true);
				int k1 = stream_1.readDWord();
				animationlist[file] = new SequenceFrame[(int) (k1 * 3.0)];
				int ai[] = new int[500];
				int ai1[] = new int[500];
				int ai2[] = new int[500];
				int ai3[] = new int[500];
				for (int l1 = 0; l1 < k1; l1++)
				{
						int i2 = stream_1.readDWord();
						SequenceFrame class36 = animationlist[file][i2] = new SequenceFrame();
						class36.skinlist = class18;
						int j2 = stream_1.readUnsignedByte();
						int k2 = -1;
						int l2 = 0;
						for (int i3 = 0; i3 < j2; i3++)
						{
								int j3 = stream_2.readUnsignedByte();
								if (j3 > 0)
								{
										if (class18.opcode[i3] != 0)
										{
												for (int l3 = i3 - 1; l3 > k2; l3--)
												{
														if (class18.opcode[l3] != 0)
																continue;
														ai[l2] = l3;
														ai1[l2] = 0;
														ai2[l2] = 0;
														ai3[l2] = 0;
														l2++;
														break;
												}

										}
										ai[l2] = i3;
										char c = '\0';
										if (class18.opcode[i3] == 3)
												c = '\200';
										if ((j3 & 1) != 0)
												ai1[l2] = stream_3.method421();
										else
												ai1[l2] = c;
										if ((j3 & 2) != 0)
												ai2[l2] = stream_3.method421();
										else
												ai2[l2] = c;
										if ((j3 & 4) != 0)
												ai3[l2] = stream_3.method421();
										else
												ai3[l2] = c;


										if (Client.newTweening && Client.tweening)
										{
												if (class18.opcode[i3] == 2)
												{
														ai1[l2] = ((ai1[l2] & 0xff) << 3) + (ai1[l2] >> 8 & 0x7);
														ai2[l2] = ((ai2[l2] & 0xff) << 3) + (ai2[l2] >> 8 & 0x7);
														ai3[l2] = ((ai3[l2] & 0xff) << 3) + (ai3[l2] >> 8 & 0x7);
												}
										}
										k2 = i3;
										l2++;
								}
						}

						class36.stepcount = l2;
						class36.opcodeLinkTable = new int[l2];
						class36.modifier1 = new int[l2];
						class36.modifier2 = new int[l2];
						class36.modifier3 = new int[l2];
						for (int k3 = 0; k3 < l2; k3++)
						{
								class36.opcodeLinkTable[k3] = ai[k3];
								class36.modifier1[k3] = ai1[k3];
								class36.modifier2[k3] = ai2[k3];
								class36.modifier3[k3] = ai3[k3];
						}

				}

		}

		public static SequenceFrame animationlist[][];

		public SkinList skinlist;

		public int stepcount;

		public int opcodeLinkTable[];

		public int modifier1[];

		public int modifier2[];

		public int modifier3[];

}