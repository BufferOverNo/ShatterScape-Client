/**
 * Easy way to edit player rank icons.
 * @author MGT Madness, created on 18-01-206.
 */
public class PlayerRank
{
		public static String getIconText(int rank)
		{
				if (rank == 0)
				{
						return "";
				}
				else
				{
						return "<img=" + rank + ">";
				}
		}

		public static int getClanWidth(int rank)
		{
				switch (rank)
				{
						case 1:
								return 14;
						case 2:
								return 14;
						case 3:
						case 4:
						case 5:
						case 6:
								return 10;
						case 9:
								return 11;
						case 10:
								return 14;
						case 8:
								return 15;
				}
				return 0;
		}

		public static void drawClanIcon(Client client, int rank, int j2, int yPos)
		{
				if (rank == 0)
				{
						return;
				}
				Client.instance.crown[rank].drawSprite(j2 - 16, yPos - 11);
		}

		/**
		 * X position of the lower part of the chat that shows my own name and the text i'm typing.
		 */
		public static int getMyChatX(int playerRights)
		{
				if (playerRights == 1 || playerRights == 2)
				{
						return 13;
				}
				else if (playerRights == 3)
				{
						return 8;
				}
				else if (playerRights == 4)
				{
						return 8;
				}
				else if (playerRights == 5)
				{
						return 8;
				}
				else if (playerRights == 6)
				{
						return 8;
				}
				else if (playerRights == 9)
				{
						return 10;
				}
				else if (playerRights == 10)
				{
						return 13;
				}
				return 0;
		}

		/**
		 * Draw the icons on the lower part of the chat that shows my own name and the text i'm typing.
		 */
		public static void drawMyChatIcon(int playerRights, int yPosOffset)
		{
				if (playerRights == 0)
				{
						return;
				}
				Client.instance.crown[playerRights].drawSprite(11, 122 + yPosOffset);
		}

}
