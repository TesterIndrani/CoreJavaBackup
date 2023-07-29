package array_programs;

public class A5 {
public static void main(String[] args) {
	int[] n = {10,33,45,68,73,61,12,24,89};
	
	System.out.println("The Even numbers are as follows:");
	for(int i=0; i<n.length; i++)
	{
		if(n[i]%2==0)
		{
			System.out.println(n[i]);
		}
	}
	
	System.out.println("The Odd numbers as follows:");
	for(int i=0; i<n.length; i++)
	{
		if(n[i]%2!=0)
		{
			System.out.println(n[i]);
		}
	}
}
}
