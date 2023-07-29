package array_programs;

import java.util.Scanner;
//with method call statement

public class BinarySearch2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		final int size = sc.nextInt();
		int a[] = new int[size]; 
		
		int start=0, mid=0, last=a.length-1;
		System.out.println("Enter the numbers");
		for(int i=0; i<a.length; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the element to be searched:");
		int searchNo = sc.nextInt();
		
		int index=search(a,start,last,searchNo);
		
		if(index==-1)
			System.out.println("The element is not present in the array");
		else
			System.out.println(searchNo+" is present at "+index+" index");
}
	
	public static int search(int a[],int start, int last, int searchNo)
	{
		while(start<=last)
		{
			int mid=(start+last)/2;
			if(a[mid]<searchNo)
				start=mid+1;
			if(a[mid]>searchNo)
				last=mid-1;
			if(a[mid]==searchNo)
				{
				return mid;
				}
		}
		return -1;
	}
}
