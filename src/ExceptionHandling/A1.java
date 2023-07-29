//invalid combination of try, catch, finally
package ExceptionHandling;

public class A1 {
public static void div()
{
	try
	{
	int a=10,b=10,c;
	c=a/b;		//10/0-->risky statement
	System.out.println(c);		//unexecuted statement when the exception occurs
	}
	catch(ArithmeticException a1) //can write Exception or Throwable type if don’t know the type of exception
	{
		System.out.println("Exception handled"); //unexecuted statement when the exception doesn't occur
	}
	finally
	{
		System.out.println("Completed executing div()");
	}

}
	
public static void main(String[] args) {
	div();
}

}
