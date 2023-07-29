package comparableAndComparator;
import java.util.Arrays;

//sorting Primitive array 

public class A1 {
public static void main(String[] args) {
	
	int a[]= {10,2,3,6,20};
	System.out.println("Before Sorting");
	for(int ele:a)
		System.out.println(ele+" ");
	
	Arrays.sort(a);
	System.out.println();
	
	System.out.println("After Sorting");
	for(int ele:a)
		System.out.println(ele+" ");	
}
}
