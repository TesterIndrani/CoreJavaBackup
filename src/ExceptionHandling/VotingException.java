//User-defined/Customised Exception

package ExceptionHandling;

public class VotingException extends RuntimeException {

	public VotingException(String msg)
	{
		System.out.println(msg);
	}
}
