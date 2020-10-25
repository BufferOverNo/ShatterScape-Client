import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Execute the game.
 * @author MGT Madness, created on 24-03-2015.
 */
public class Game
{
		/**
		* Main settings to launch the client.
		 * @throws Exception 
		*/
		static void clientLaunch() throws Exception
		{
				try
				{
						Client.nodeID = 10;
						Client.portOff = 0;
						Client.isMembers = true;
						SignLink.storeid = 32;
						SignLink.startpriv(InetAddress.getLocalHost());
						Client.addressMac = Client.getMacAddress();
						Client.addressUid = CreateUID.generateUID();
						Client.clientIdVersion = 1099070941;
				}
				catch (UnknownHostException e)
				{
				}
		}

}
