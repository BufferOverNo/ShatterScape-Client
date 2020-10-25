
public final class Tile extends Node
{

	public Tile(int i, int j, int k)
	{
		objects = new StaticObject[5];
		objectFlags = new int[5];
		plane = z = i;
		x = j;
		y = k;
	}

	int z;

	final int x;

	final int y;

	final int plane;

	public TileUnderlay underlay;

	public Class40 overlay;

	public WallLoc wall;

	public WallDecoration wallDecoration;

	public GroundDecoration groundDecoration;

	public ItemPile itemPile;

	int objectCount;

	public final StaticObject[] objects;

	final int[] objectFlags;

	int flags;

	int topPlane;

	boolean aBoolean1322;

	boolean aBoolean1323;

	boolean aBoolean1324;

	int anInt1325;

	int anInt1326;

	int anInt1327;

	int anInt1328;

	public Tile aClass30_Sub3_1329;
}
