//Nested try

package ExceptionHandling;

public class A2 {
public static void main(String[] args) {
	
	int a=10, b=0, c;
	int m[] = new int[3];	
	
	try		//outer try
	{		
		try		//inner try catch block1
		{ 		
		System.out.println("Number divided by zero");
		c=a/b; 	//10/0-->risky statement
		}
		catch(ArithmeticException a1)
		{
			System.out.println("Exception handled for inner try block 1");
		}
		
		try 		//inner try catch finally block2
		{		
		m[3]=90;	//beyond declared size --> risky statement			
		}
		catch(ArrayIndexOutOfBoundsException a2)
		{
			System.out.println("Exception handled for inner try block 2");
		}
		finally
		{
			System.out.println("Finally block for inner try block 2");
		}
	  System.out.println("This is outer try");
	   m[4]=100;
	 }
   catch(Exception e)
	{
		System.out.println("Outer Exception handled");
	}
   finally
	{
		System.out.println("Nested try is closed");
	}
}	
}
