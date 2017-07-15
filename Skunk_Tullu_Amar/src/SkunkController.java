import java.util.ArrayList;
import java.util.List;



public class SkunkController
{
	int numPlayers = 0;
	int kitty = 0;
	
	Boolean wantsToQuit;
	Boolean oneOrMoreRoll;
	
	ArrayList<Player> list = new ArrayList<Player>();
	
	public ArrayList<Player> createPlayers(int numberOfPlayers)
	{
		SkunkUI ui = new SkunkUI();
		
		for (int i = 0; i < numberOfPlayers; i++)
		{
			ArrayList<Player> list = new ArrayList<Player>();
			
		String name = ui.getPlayerNamesFromUser(numberOfPlayers, (i+1));
			
			Player p = new Player("name");
			
			this.list.add(p);
			
		}
	return list;
	}
	
	public static void main(String[] args) 
	{
		SkunkApp app = new SkunkApp();
		
		app.playGame();
		
	

	}

}
