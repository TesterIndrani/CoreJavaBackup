package ExceptionHandling;

import java.util.Scanner;

public class Account {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance");
		double balance = sc.nextDouble();
		System.out.println("Enter the amount to withdraw");
		double wAmount = sc.nextDouble();
		
		if(wAmount>balance)
			throw new InsufficientBalanceException("Insufficient Balance");
		else
			System.out.println("Collect your money");
	}
}
