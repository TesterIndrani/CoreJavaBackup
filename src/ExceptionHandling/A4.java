//DECLARING AND HANDLING CHECKED EXCEPTION
package ExceptionHandling;

public class A4 {
	
	
	public static void m1() throws InterruptedException
	{
		System.out.println("Go to sleep");
		Thread.sleep(3000);	
		System.out.println("Awake");
		
	}
	public static void main(String[] args) {
		
		System.out.println("In main()");
		try
		{
			m1();
		}
		catch(InterruptedException i)
		{
		}
		
		
}
}
