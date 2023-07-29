//CONDITIONAL EXCEPTION
package ExceptionHandling;

public class A7 {
	
public static void check(int age)
{
	if(age<18)
		throw new ArithmeticException("Not eligible for voting");
	else
		System.out.println("You are eligible for voting");
}

public static void main(String[] args) {
		check(16);
}
}
