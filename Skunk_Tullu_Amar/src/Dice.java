
public class Dice 
{
	private Die die_1 = new Die();
	private Die die_2 = new Die();
	
	Dice()
	{
		
		die_1.setValue(0); 
		die_2.setValue(0); 
	}
	
	public int roll_dice()
	{
		int sum = 0;
		
		int roll_1 = die_1.roll();
		int roll_2 = die_2.roll();
		
		sum = roll_1 + roll_2;
		
		return sum;
	}
}
