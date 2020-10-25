/**
 * Starter interface.
 * @author MGT Madness, created on 05-07-2015.
 */
public class GameModeInterface
{

		public static void closeInterface()
		{
				if (!Client.starterType.isEmpty())
				{
						Client.starterType = "";
				}
		}

		/**
		 * Draw the ticks on the starter interface.
		 */
		public static void drawStarterInterfaceTick()
		{
				if (Client.getInterfaceDisplayed() != 25100)
				{
						return;
				}
				//TODO #FULLSCREEN ADJUST interface, game mode interface.
				int x1 = Client.isFixedScreen() ? 0 : (Client.getClientWidth() / 2) - 256;
				int y1 = Client.isFixedScreen() ? 0 : (Client.getClientHeight() / 2) - 267;
				Client.cacheSprite[Client.starterType.equals("DEFENDER") ? 341 : 340].drawSprite(107 + x1, 89 + y1);
				Client.cacheSprite[Client.starterType.equals("VETERAN") ? 341 : 340].drawSprite(107 + x1, 129 + y1);
				Client.cacheSprite[Client.starterType.equals("GLADIATOR") ? 341 : 340].drawSprite(107 + x1, 169 + y1);
				Client.cacheSprite[Client.starterType.equals("IRON MAN") ? 341 : 340].drawSprite(107 + x1, 209 + y1);
		}

		/**
		 * Append the actions of the starter interface buttons.
		 * @param buttonId
		 * 			The button identity used.
		 * @return
		 * 			True, if the button belongs to the starter interface.
		 */
		public static boolean starterInterfaceButtons(int buttonId)
		{
				switch (buttonId)
				{
						case 25109:
								Client.starterType = "DEFENDER";
								return true;
						case 25113:
								Client.starterType = "VETERAN";
								return true;
						case 25117:
								Client.starterType = "GLADIATOR";
								return true;
						case 25121:
								Client.starterType = "IRON MAN";
								return true;
				}
				return false;
		}

}
