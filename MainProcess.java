
public class MainProcess 
{
	public static void main(String[] args) 
	{

		System.out.println("Start");
		for (int i = 0; i < 25; i++) 
		{
		     Runnable T1 = new Dice(10000L + i); 
		     Runnable T2 = new Dice(10000L + 2*i);
		     
		     System.out.println("Starting Executor!");
		     
		     ExecutorService threadExcecutor = Executors.newCachedThreadPool();
		     
		     threadExcecutor.execute(T1);
		     threadExcecutor.execute(T2);
		}
	    System.out.println("Complete");
	 }

}
