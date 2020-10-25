public final class SpotAnim
{


		public static void unpackConfig(StreamLoader streamLoader)
		{
				Stream stream602 = new Stream(streamLoader.getDataForName("spotanim.dat"));

				int length602 = stream602.readUnsignedWord();

				if (cache == null)
				{
						cache = new SpotAnim[length602 + 50];
				}
				for (int gfxId = 0; gfxId < length602; gfxId++)
				{
						if (cache[gfxId] == null)
						{
								cache[gfxId] = new SpotAnim();
						}
						cache[gfxId].index = gfxId;
						cache[gfxId].readValues(stream602);
				}
				cache[85].ambient = 60;
				cache[85].contrast = 60;

				//Trident of the swamp end gfx on the npc when the projectile lands.
				cache[2625] = new SpotAnim();
				cache[2625].ambient = 0;
				cache[2625].contrast = 0;
				cache[2625].height = 128;
				cache[2625].index = 1042;
				cache[2625].model = 64793;
				cache[2625].rotation = 0;
				cache[2625].scale = 128;
				cache[2625].sequenceIndex = 5461;
				cache[2625].aAnimation_407 = Animation.anims[5461];
				cache[2625].srcColors = new int[6];
				cache[2625].srcColors[0] = 43051;
				cache[2625].srcColors[1] = 43038;
				cache[2625].srcColors[2] = 4;
				cache[2625].srcColors[3] = 0;
				cache[2625].srcColors[4] = 0;
				cache[2625].srcColors[5] = 0;
				cache[2625].dstColors = new int[6];
				cache[2625].dstColors[0] = 33558;
				cache[2625].dstColors[1] = 33438;
				cache[2625].dstColors[2] = 29985;
				cache[2625].dstColors[3] = 0;
				cache[2625].dstColors[4] = 0;
				cache[2625].dstColors[5] = 0;

				//Trident of the swamp projectile
				cache[2624] = new SpotAnim();
				cache[2624].ambient = 0;
				cache[2624].contrast = 0;
				cache[2624].height = 128;
				cache[2624].index = 1040;
				cache[2624].model = 64792;
				cache[2624].rotation = 0;
				cache[2624].scale = 128;
				cache[2624].sequenceIndex = 5462;
				cache[2624].aAnimation_407 = Animation.anims[5462];
				cache[2624].srcColors = new int[6];
				cache[2624].srcColors[0] = 43270;
				cache[2624].srcColors[1] = 43038;
				cache[2624].srcColors[2] = 0;
				cache[2624].srcColors[3] = 0;
				cache[2624].srcColors[4] = 0;
				cache[2624].srcColors[5] = 0;
				cache[2624].dstColors = new int[6];
				cache[2624].dstColors[0] = 33558;
				cache[2624].dstColors[1] = 33438;
				cache[2624].dstColors[2] = 0;
				cache[2624].dstColors[3] = 0;
				cache[2624].dstColors[4] = 0;
				cache[2624].dstColors[5] = 0;


				// Abyssal dagger special attack gfx.
				cache[2623] = new SpotAnim();
				cache[2623].ambient = 0;
				cache[2623].contrast = 0;
				cache[2623].height = 128;
				cache[2623].index = 1283;
				cache[2623].model = 64763;
				cache[2623].rotation = 0;
				cache[2623].scale = 128;
				cache[2623].sequenceIndex = 13728;
				cache[2623].aAnimation_407 = Animation.anims[13728];

				// Dragon javelin projectile
				cache[2622] = new SpotAnim();
				cache[2622].model = 64762;


				// Slayer cape gfx.
				cache[827].model = 19088;
				cache[827].sequenceIndex = 4968;
				cache[827].aAnimation_407 = Animation.anims[4968];

				/*
				cache[2622] = new SpotAnim();
				cache[2622].ambient = 75;
				cache[2622].contrast = 75;
				cache[2622].height = 100;
				cache[2622].index = 113;
				cache[2622].model = 393;
				cache[2622].rotation = 0;
				cache[2622].scale = 300;
				cache[2622].sequenceIndex = 65535;
				cache[2622].aAnimation_407 = null;
				*/

				// High alchemy gfx.
				cache[2621] = new SpotAnim();
				cache[2621].ambient = 75;
				cache[2621].contrast = 75;
				cache[2621].height = 128;
				cache[2621].index = 113;
				cache[2621].model = 64630;
				cache[2621].rotation = 0;
				cache[2621].scale = 128;
				cache[2621].sequenceIndex = 13714;
				cache[2621].aAnimation_407 = Animation.anims[13714];

				// Low alchemy gfx.
				cache[2620] = new SpotAnim();
				cache[2620].ambient = 100;
				cache[2620].contrast = 100;
				cache[2620].height = 128;
				cache[2620].index = 112;
				cache[2620].model = 64630;
				cache[2620].rotation = 0;
				cache[2620].scale = 128;
				cache[2620].sequenceIndex = 13713;
				cache[2620].aAnimation_407 = Animation.anims[13713];
				cache[2620].srcColors = new int[6];
				cache[2620].srcColors[0] = 0;
				cache[2620].srcColors[1] = 0;
				cache[2620].srcColors[2] = 0;
				cache[2620].srcColors[3] = 0;
				cache[2620].srcColors[4] = 0;
				cache[2620].srcColors[5] = 0;
				cache[2620].dstColors = new int[6];
				cache[2620].dstColors[0] = 0;
				cache[2620].dstColors[1] = 0;
				cache[2620].dstColors[2] = 0;
				cache[2620].dstColors[3] = 0;
				cache[2620].dstColors[4] = 0;
				cache[2620].dstColors[5] = 0;

				// Armadyl crossbow gfx.
				cache[2619] = new SpotAnim();
				cache[2619].ambient = 30;
				cache[2619].contrast = 10;
				cache[2619].height = 128;
				cache[2619].index = 301;
				cache[2619].model = 64629;
				cache[2619].rotation = 0;
				cache[2619].scale = 128;
				cache[2619].sequenceIndex = 13711;
				cache[2619].aAnimation_407 = Animation.anims[13711];
				cache[2619].srcColors = new int[6];
				cache[2619].srcColors[0] = 0;
				cache[2619].srcColors[1] = 0;
				cache[2619].srcColors[2] = 0;
				cache[2619].srcColors[3] = 0;
				cache[2619].srcColors[4] = 0;
				cache[2619].srcColors[5] = 0;
				cache[2619].dstColors = new int[6];
				cache[2619].dstColors[0] = 0;
				cache[2619].dstColors[1] = 0;
				cache[2619].dstColors[2] = 0;
				cache[2619].dstColors[3] = 0;
				cache[2619].dstColors[4] = 0;
				cache[2619].dstColors[5] = 0;



				// Cerberus projectile.
				cache[2618] = new SpotAnim();
				cache[2618].ambient = 0;
				cache[2618].contrast = 0;
				cache[2618].height = 128;
				cache[2618].index = 2618;
				cache[2618].model = 64166;
				cache[2618].rotation = 0;
				cache[2618].scale = 128;
				cache[2618].sequenceIndex = 13703;
				cache[2618].aAnimation_407 = Animation.anims[13703];
				cache[2618].srcColors = new int[6];
				cache[2618].srcColors[0] = 0;
				cache[2618].srcColors[1] = 0;
				cache[2618].srcColors[2] = 0;
				cache[2618].srcColors[3] = 0;
				cache[2618].srcColors[4] = 0;
				cache[2618].srcColors[5] = 0;
				cache[2618].dstColors = new int[6];
				cache[2618].dstColors[0] = 0;
				cache[2618].dstColors[1] = 0;
				cache[2618].dstColors[2] = 0;
				cache[2618].dstColors[3] = 0;
				cache[2618].dstColors[4] = 0;
				cache[2618].dstColors[5] = 0;

				// Max cape emote gfx.
				cache[2617] = new SpotAnim();
				cache[2617].ambient = 0;
				cache[2617].contrast = 0;
				cache[2617].height = 128;
				cache[2617].index = 1286;
				cache[2617].model = 64628;
				cache[2617].rotation = 0;
				cache[2617].scale = 128;
				cache[2617].sequenceIndex = 13710;
				cache[2617].aAnimation_407 = Animation.anims[13710];
				cache[2617].srcColors = new int[6];
				cache[2617].srcColors[0] = 0;
				cache[2617].srcColors[1] = 0;
				cache[2617].srcColors[2] = 0;
				cache[2617].srcColors[3] = 0;
				cache[2617].srcColors[4] = 0;
				cache[2617].srcColors[5] = 0;
				cache[2617].dstColors = new int[6];
				cache[2617].dstColors[0] = 0;
				cache[2617].dstColors[1] = 0;
				cache[2617].dstColors[2] = 0;
				cache[2617].dstColors[3] = 0;
				cache[2617].dstColors[4] = 0;
				cache[2617].dstColors[5] = 0;
		}

		private void readValues(Stream stream)
		{
				sequenceIndex = stream.readUnsignedWord();
				model = stream.readUnsignedWord();
				if (Animation.anims != null && sequenceIndex != 65535 && sequenceIndex != -1)
						aAnimation_407 = Animation.anims[sequenceIndex];
				scale = stream.readUnsignedByte();
				height = stream.readUnsignedByte();
				int j = stream.readUnsignedWord();
				if (j != 65535)
				{
						for (int k = 0; k < j; k++)
								dstColors[k] = stream.readUnsignedWord();
						for (int k = 0; k < j; k++)
								srcColors[k] = stream.readUnsignedWord();
				}
		}

		public Model getModel()
		{
				Model model = (Model) aMRUNodes_415.insertFromCache(index);
				if (model != null)
				{
						return model;
				}
				model = Model.getModel(this.model);
				if (model == null)
				{
						return null;
				}
				for (int i = 0; i < 6; i++)
				{
						if (srcColors[0] != 0)
						{
								model.setColour(srcColors[i], dstColors[i]);
						}
				}

				aMRUNodes_415.removeFromCache(model, index);
				return model;
		}

		private SpotAnim()
		{
				sequenceIndex = -1;
				srcColors = new int[6];
				dstColors = new int[6];
				scale = 128;
				height = 128;
		}

		public static SpotAnim cache[];

		private int index;

		private int model;

		private int sequenceIndex;

		public Animation aAnimation_407;

		private int[] srcColors;

		private int[] dstColors;

		public int scale;

		public int height;

		public int rotation;

		public int ambient;

		public int contrast;

		public static MRUNodes aMRUNodes_415 = new MRUNodes(30);

}