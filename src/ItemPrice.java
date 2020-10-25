public class ItemPrice
{

	public static final ItemPrice[] DEFINITIONS = new ItemPrice[22000];

	public final int itemId;

	public final int itemPrice;


	public ItemPrice(int itemId, int itemPrice)
	{
		this.itemId = itemId;
		this.itemPrice = itemPrice;
	}

	public static ItemPrice[] getDefinitions()
	{
		return DEFINITIONS;
	}

}
