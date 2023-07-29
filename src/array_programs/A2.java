package array_programs;
import java.util.Scanner;

public class A2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	final int size = sc.nextInt();
	
	int a[] = new int[size];  //5
	System.out.println("Enter the numbers");
	for(int i=0; i<a.length; i++)
	{
		a[i] = sc.nextInt();
	}
	
	System.out.println("The values are as follows:");
	
	for(int ele:a)
	{
		System.out.println(ele);
	}
}
}
