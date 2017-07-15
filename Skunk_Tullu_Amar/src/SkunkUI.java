import java.util.Scanner;

public class SkunkUI 
{


	
	public int getNumPlayersFromUser()
	{
		int numPlayers = 0;
		
		
		while (numPlayers < 2)
		{
	
			System.out.print("Welcome to Skunk \rPlease enter the # of Players >>");
			
		
			
			Scanner in = new Scanner(System.in);
			numPlayers = in.nextInt();
			
		
			if (numPlayers < 2)
			{
				System.out.print("\n You MUST have 2 or more players in order to play Skunk!");
			}
		}
		
	return numPlayers;
	}
	
	public  String getPlayerNamesFromUser(int num_Players, int count)
	{
		String player_name = "";
		Scanner in = new Scanner(System.in);
		
		System.out.print("\n Please enter the name of Player #" + count + "   >>");
		
		player_name = in.nextLine();
	
		return player_name;
	}
	
	public String promptAndReturn(String question)
	{
		String result = "";
		Scanner in = new Scanner(System.in);
	//	result = in.nextLine();
		
		System.out.println(question + " >>");
		result =  in.nextLine();
		
		return result;
	}
	
	public void print(String output)
	{
		System.out.println(output);
	}

}
