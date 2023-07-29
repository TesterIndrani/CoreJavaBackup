//Declaring and Handling Unchecked Exception
package ExceptionHandling;

public class A5 {

	public static void m1() throws NullPointerException
	{
		String s1=null;
		if(s1.equals("swati"))		//throws NullPointerException. As s1 is null, we cannot compare it with another String
			System.out.println(s1);
		else
			System.out.println("null");
	
	}
	public static void main(String[] args)
	{
		try
		{
			m1();
		}
		catch(NullPointerException e)
		{
			System.out.println("Exception handled");
		}
	}
}
