package array_programs;
import java.util.Scanner;

public class A4 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size");
	final int size = sc.nextInt();
	int n[] = new int[size];
	
	for (int i=0; i<n.length; i++)
	{
		n[i] = sc.nextInt();
	}

//find the sum
	int sum=0;
	for(int ele:n)
	{
		sum+=ele;
	}

//find the avg
double avg = (double)sum/size;  //typecasting explicitly from int to double before assigning to get accurate decimal value

System.out.println("Sum="+sum);
System.out.println("Average="+avg);
}
}
