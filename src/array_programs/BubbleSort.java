package array_programs;
import java.util.Scanner;

public class BubbleSort {
public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	final int size = sc.nextInt();
	int a[] = new int[size]; 
	
	System.out.println("Enter the numbers");
	for(int i=0; i<a.length; i++)
	{
		a[i] = sc.nextInt();
	}
	
	//no of passes
	for(int j=0; j<a.length-1; j++)
	{	
		//for adjacent elements
		for(int i=0; i<a.length-j-1; i++)
		{
			//then we will compare both the adjacent elements
			if(a[i]>a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
		}
	}
	for(int i=0; i<a.length; i++)
		System.out.println(a[i]);
}
}
