
public class MainProcess 
{
	public static void main(String[] args) 
	{

		System.out.println("Start");
		for (int i = 0; i < 25; i++) 
		{
		      Runnable T1 = new Dice(10000L + i);
		      Thread roll = new Thread(T1);
		      // We can set the name of the thread
		      roll.setName(String.valueOf(100));
		      // Start the thread, never call method run() direct
		      roll.start();
	      
		     Runnable T2 = new Dice(10000L + 2*i);
		      Thread roll2 = new Thread(T2);
		      // We can set the name of the thread
		      roll2.setName(String.valueOf(100));
		      // Start the thread, never call method run() direct
		      roll2.start();
		}
	    System.out.println("Complete");
	 }

}
