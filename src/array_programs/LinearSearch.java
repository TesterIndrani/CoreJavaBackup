//without method call statement

package array_programs;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array");
	final int size = sc.nextInt();
	int a[] = new int[size]; 
	int k=0;
	System.out.println("Enter the numbers");
	for(int i=0; i<a.length; i++)
	{
		a[i] = sc.nextInt();
	}
	System.out.println("Enter the element to be searched:");
	int searchNo = sc.nextInt();
	//searching
	for(int i=0; i<a.length; i++)
	{
		if(a[i]==searchNo)
			k=1;
	}
	if(k==1)
		System.out.println("The element is present in the array");
	else
		System.out.println("The element is not present in the array");
	
}
}
