import java.util.ArrayList;

public class SkunkApp 
{
             
	int NumberofPlayer;
	
	
	private int numPlayers;
	private Player activePlayer;
	private int playerNumber = 0;
              

     public int getNumberofPlayer()
     {
    	 return NumberofPlayer; 
     }
     
     public void setNumberOfPlayers(int num)
     {
    	 
    	this.NumberofPlayer = num;
     }

	public void playGame()
	{
		
		SkunkUI UI = new SkunkUI();

		SkunkController controller = new SkunkController();
		
		
		int number = UI.getNumPlayersFromUser();
		
		setNumberOfPlayers(number);

		ArrayList<Player> players = new ArrayList<Player>();
		
		 
		
		players = controller.createPlayers(getNumberofPlayer());
		
		
		
		Player p = players.get(playerNumber); 
		
	
		this.activePlayer = p;
		this.playerNumber = playerNumber + 1;
		
		
		System.out.println("");
		UI.print("---------Player #" + (playerNumber) + " " + p.getPlayerName() + ", turn #1----------------");
		
		int roll_of_dice = 0;
		
		Dice myDice = new Dice();
		
	
		
		roll_of_dice = myDice.roll_dice();
		
		
		p.setPointsThisRound(roll_of_dice);
		
		System.out.println("Roll #" + p.rollsThisRound + ", points = " + roll_of_dice );
	

		String again = "";
		
		while (!again.equals("N") && !again.equals("n"))
		{
			
			
			again = UI.promptAndReturn("Want to roll again? 'Y' = Yes 'N' = No");
			
			if (again.equals("Y") || again.equals("y"))
			{
				
				
				p.rollsThisRound++;

				roll_of_dice = myDice.roll_dice();
				
				System.out.println("Roll #" + p.rollsThisRound + ", points = " + roll_of_dice);
				
			
				
				p.setPointsThisRound(roll_of_dice);
				
				UI.print("Total points = " + p.get_points_this_round());
				
			}
		
		}
		
		
	}

    public Boolean rollAgain()
    {
   	 	Boolean b = true;
   	 	
   	 	return b;
    }
}
