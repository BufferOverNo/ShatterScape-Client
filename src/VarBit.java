public final class VarBit
{

	public static void unpackConfig(StreamLoader streamLoader)
	{
		Stream stream = new Stream(streamLoader.getDataForName("varbit.dat"));
		int cacheSize = stream.readUnsignedWord();
		if (cache == null)
			cache = new VarBit[cacheSize];
		for (int j = 0; j < cacheSize; j++)
		{
			if (cache[j] == null)
				cache[j] = new VarBit();
			cache[j].readValues(stream);
			if (cache[j].aBoolean651)
				Varp.cache[cache[j].setting].aBoolean713 = true;
		}

		if (stream.currentOffset != stream.buffer.length)
			Utility.print("varbit load mismatch");
	}

	private void readValues(Stream stream)
	{
		do
		{
			int j = stream.readUnsignedByte();
			if (j == 0)
				return;
			if (j == 1)
			{
				setting = stream.readUnsignedWord();
				startbit = stream.readUnsignedByte();
				endbit = stream.readUnsignedByte();
			}
			else if (j == 10)
				stream.readString();
			else if (j == 2)
				aBoolean651 = true;
			else if (j == 3)
				stream.readDWord();
			else if (j == 4)
				stream.readDWord();
			else
				Utility.print("Error unrecognised config code: " + j);
		}
		while (true);
	}

	private VarBit()
	{
		aBoolean651 = false;
	}

	public static VarBit cache[];

	public int setting;

	public int startbit;

	public int endbit;

	private boolean aBoolean651; // Dummy?
}
