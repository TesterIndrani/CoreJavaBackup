package array_programs;

public class A6 {
public static void main(String[] args) {
	
	int a[] = {67,67,34,56,78,90,90,34,55,12,34,99,100};
	
	System.out.println("Duplicate elements are as follows:");
	for(int i=0; i<a.length; i++)
	{
		for(int j=i+1; j<a.length; j++)
		{
			if(a[i]==a[j])
			System.out.println(a[j]);
		}
	}
}
}
