package ExceptionHandling;

import java.util.Scanner;

public class VotingDriver {

	public static void check(int age)
	{
		if(age<18)
			throw new VotingException("Not eligible for Voting");
		else
			System.out.println("You are eligible for voting");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		check(age);
		
	}
}
