public class PlayerTitle
{
		public static String getTitleSpacing(String title)
		{
				if (title.isEmpty())
				{
						return "";
				}
				else
				{
						return " ";
				}
		}

		public static String reduceTextWidth(String string)
		{
				for (int b = 0; b < PlayerTitle.titleColours.length; b++)
				{
						if (string.contains(PlayerTitle.titleColours[b]))
						{
								string = string.replaceAll(PlayerTitle.titleColours[b], "");
						}
				}
				return string;
		}

		/**
		 * List of title colours, to also scan for title colours of other players, which is why we cannot use the player variable of titleColour.
		 */
		public final static String[] titleColours = {
				"<col=ED700E>", // Orange.
				"<col=ebebeb>", // Pale white.
				"<col=bb44aa>", // Purple.
				"<col=cb4ab9>",};

		public static String getLessStrikingColour(String titleColour)
		{
				switch (titleColour)
				{
						case "<col=ED700E>":
								return "<col=ED700E>";
						case "<col=bb44aa>":
								return "<col=cb4ab9>";
				}
				return "";
		}

		public static String rightClickPlayerString(Player player)
		{
				if (player.titleSwap == 1)
				{
						return "<col=ebebeb>" + player.getName() + getTitleSpacing(player.playerTitle) + getLessStrikingColour(player.titleColour) + player.playerTitle;
				}
				else
				{
						return getLessStrikingColour(player.titleColour) + player.playerTitle + getTitleSpacing(player.playerTitle) + "<col=ebebeb>" + player.getName();
				}
		}

		public static String myNameInTextTypingArea(Player myPlayer)
		{
				if (myPlayer.titleSwap == 1)
				{
						return "<col=00000>" + myPlayer.getName() + PlayerTitle.getTitleSpacing(myPlayer.playerTitle) + myPlayer.titleColour + myPlayer.playerTitle + "<col=00000>";
				}
				else
				{
						return myPlayer.titleColour + myPlayer.playerTitle + PlayerTitle.getTitleSpacing(myPlayer.playerTitle) + "<col=00000>" + myPlayer.getName();
				}
		}

		public static String myMessagesInMyChat(Player myPlayer)
		{
				if (myPlayer.titleSwap == 1)
				{
						return "<col=0>" + Client.myPlayer.getName() + PlayerTitle.getTitleSpacing(Client.myPlayer.playerTitle) + Client.myPlayer.titleColour + Client.myPlayer.playerTitle + "<col=0>";
				}
				else
				{
						return Client.myPlayer.titleColour + Client.myPlayer.playerTitle + PlayerTitle.getTitleSpacing(Client.myPlayer.playerTitle) + "<col=0>" + Client.myPlayer.getName();
				}
		}

		public static String quickChatString(Player myPlayer)
		{
				if (myPlayer.titleSwap == 1)
				{

						return "<col=0>" + Client.myPlayer.getName() + Client.myPlayer.titleColour + PlayerTitle.getTitleSpacing(Client.myPlayer.playerTitle) + Client.myPlayer.playerTitle + "<col=0>";
				}
				else
				{
						return Client.myPlayer.titleColour + Client.myPlayer.playerTitle + PlayerTitle.getTitleSpacing(Client.myPlayer.playerTitle) + "<col=0>" + Client.myPlayer.getName();
				}
		}

		public static String messagesOfOtherPlayers(Player player)
		{
				if (player.titleSwap == 1)
				{
						return "<col=0>" + player.getName() + PlayerTitle.getTitleSpacing(player.playerTitle) + player.titleColour + player.playerTitle + "<col=0>";
				}
				else
				{
						return player.titleColour + player.playerTitle + PlayerTitle.getTitleSpacing(player.playerTitle) + "<col=0>" + player.getName();
				}

		}
}
