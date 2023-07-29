package array_programs;

import java.util.Scanner;

public class SelectionSort {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	final int size = sc.nextInt();
	int a[] = new int[size]; 
	int min;
	
	System.out.println("Enter the numbers");
	for(int i=0; i<a.length; i++)
		{
		a[i] = sc.nextInt();
		}
	
	for(int i=0; i<a.length; i++)
	{
	    min=i;
	    
	    //finding the smallest element's position in unsorted array
		for(int j=i+1; j<a.length; j++)
		{
			if(a[j]<a[min])
			min=j;
		}
		
		//swapping the first element with smallest element in unsorted array
		int temp=a[i];
		a[i]=a[min];
		a[min]=temp;
	}
	
	
System.out.println("The numbers are arranged in the ascending order:");
	for(int i=0; i<a.length; i++)
	{
	System.out.println(a[i]);
	}
}
}
