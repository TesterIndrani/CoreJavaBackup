//User-defined Exception
package ExceptionHandling;

public class InsufficientBalanceException extends RuntimeException{

	InsufficientBalanceException(String msg)
	{
		System.out.println(msg);
	}
}
