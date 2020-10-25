/**
 * Arrow tutorial feature.
 * 
 * @author MGT Madness, created on 19-03-2015.
 */
public class ArrowTutorial
{

		/**
		 * Begin the tutorial.
		 */
		public static void startTutorial()
		{
				if (!Client.isFixedScreen())
				{
						Client.setToFixed();
				}
				Client.setTutorialStage(10);
		}

		/**
		 * Cancel the tutorial.
		 */
		public static void cancelTutorial()
		{
				Client.setTutorialStage(0);
		}

		/**
		 * Draw the arrow on the screen.
		 * @param x
				 *            X position of the arrow.
		 * @param y
				 *            Y position of the arrow.
		 */
		private static void drawArrow(boolean pointUp, int x, int y, boolean interfaceDrawn)
		{
				Client.cacheSprite[pointUp ? 122 : 121].drawSprite(x, y);
		}

		/**
		 * Apply the arrow tutorial on the screen.
		 */
		public static void drawTutorial(boolean screen)
		{
				if (Client.getTutorialStage() == 0)
				{
						return;
				}
				if (Client.loopCycle % 30 >= 20)
				{
						return;
				}
				if (!screen)
				{
						if (Client.getTutorialStage() == 10)
						{
								if (Client.is562GameFrame || Client.is562PlusGameFrame)
								{
										drawArrow(false, 130, 270, false);
								}
								else
								{
										drawArrow(false, 150, 270, false);
								}
						}
						else if (Client.getTutorialStage() == 20)
						{
								if (Client.getTabId() == 11)
								{
										if (Client.tabInterfaceId[11] == 904)
										{
												drawArrow(false, 177, 218, false);
										}
										else
										{
												Client.setTutorialStage(30);
										}
								}
								else
								{
										if (Client.getTabId() != 11)
										{
												Client.setTutorialStage(10);
										}
								}
						}
						else if (Client.getTutorialStage() == 30)
						{
								if (Client.getTabId() == 11 && (Client.tabInterfaceId[11] == 17300 || Client.tabInterfaceId[11] == 17338 || Client.tabInterfaceId[11] == 17367 || Client.tabInterfaceId[11] == 17299))
								{

								}
								else
								{
										Client.setTutorialStage(20);
								}
								drawArrow(false, 120, 56, false);
						}
						else if (Client.getTutorialStage() == 40)
						{
								if (Client.is562GameFrame || Client.is562PlusGameFrame)
								{
										drawArrow(true, 101, 32, false);
								}
								else
								{
										drawArrow(true, 83, 30, false);
								}
						}
						else if (Client.getTutorialStage() == 50)
						{
								drawArrow(false, 70, 18, false);
								if (Client.getTabId() != 14 && Client.is562GameFrame || Client.getTabId() != 2 && !Client.is562GameFrame)
								{
										Client.setTutorialStage(40);
								}
						}
						else if (Client.getTutorialStage() == 60)
						{
								drawArrow(false, 165, 18, false);
								if (Client.getTabId() != 14 && Client.is562GameFrame || Client.getTabId() != 2 && !Client.is562GameFrame)
								{
										Client.setTutorialStage(40);
								}
						}
						// Client class, change stage == 7 to stage == 9
						// and uncomment out case 28008:

						else if (Client.getTutorialStage() == 70)
						{
								drawArrow(false, 160, 47, false);
								if (Client.getTabId() != 14 && Client.is562GameFrame || Client.getTabId() != 2 && !Client.is562GameFrame)
								{
										Client.setTutorialStage(40);
								}
						}

						else if (Client.getTutorialStage() == 80)
						{
								drawArrow(false, 70, 47, false);
								if (Client.getTabId() != 14 && Client.is562GameFrame || Client.getTabId() != 2 && !Client.is562GameFrame)
								{
										Client.setTutorialStage(40);
								}
						}
						/*// Point to clan chat tab.
						else if (Client.getTutorialStage() == 80)
						{
								if (Client.is562GameFrame || Client.is562PlusGameFrame)
								{
										drawArrow(false, 100, 270, false);
								}
								else if (Client.is474GameFrame || Client.is474PlusGameFrame)
								{
										drawArrow(false, 15, 270, false);
								}
								else
								{
										drawArrow(false, 116, 270, false);
								}
						}
						*/
				}
				else
				{
						/*
							if (Client.getTutorialStage() == 51 && Client.timeAchievementOpened != 0 && System.currentTimeMillis() - Client.timeAchievementOpened >= 800)
							{
									if (Client.getInterfaceDisplayed() == 22260)
									{
											drawArrow(true, 420, 40, true);
									}
									else
									{
											Client.setTutorialStage(50);
											Client.timeAchievementOpened = 0;
									}
							}
							*/
				}
		}
}