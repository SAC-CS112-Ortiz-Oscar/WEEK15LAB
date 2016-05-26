
public class Dice implements Runnable  
{
	private final long counter;
	
	public Dice(long counter)
	{
		this.counter = counter;
	}
	
	public int throwDice() 
	{
		return 1 + (int)(Math.random() * 6);
	}

	@Override
	public void run() 
	{
		long diceRoll = 0;
		long count = 0;
		for(count = 0; count < counter; count++)
		{
			diceRoll = throwDice();
		}
		
		System.out.printf("Dice roll is: %d.\n", diceRoll);
	}

}
