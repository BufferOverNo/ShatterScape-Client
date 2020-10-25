final class Item extends SceneNode
{

	public final Model getRotatedModel()
	{
		ItemDefinition itemDef = ItemDefinition.forId(itemId);
		return itemDef.getModel(amount);
	}

	public Item()
	{
	}

	public int itemId;

	public int x;

	public int y;

	public int amount;
}
