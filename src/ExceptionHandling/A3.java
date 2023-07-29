//THROWS INTERRUPTED EXCEPTION
package ExceptionHandling;

public class A3 {
	public static void main(String[] args) throws InterruptedException
	{	
		System.out.println("Go to sleep");
		Thread.sleep(3000);		//throws Interrupted Exception as another thread might try to interact with this thread while it's asleep
		System.out.println("Awake");
		
	}

}
