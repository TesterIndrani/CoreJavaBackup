package comparableAndComparator;
import java.util.Arrays;
//after implementing compareTo() method of comparable interface

public class MobileDriver
{
	public static void main(String[] args) {
		
	//creating Array of objects of Mobile class
	Mobile[] mob = { new Mobile ("Redmi",15000),
					new Mobile ("Samsung",11000), 
					new Mobile ("Lenovo",13000), 
					new Mobile ("Oppo",21000)};
	
	System.out.println("Before Sorting");
	for(Mobile m:mob)
		System.out.println(m.brand+" "+m.price);
	
	Arrays.sort(mob);  //internally calls compareTo(Object obj) of comparable interface implemented in Mobile.java

	System.out.println("\nAfter Sorting\n");
	for(Mobile m:mob)
		System.out.println(m.brand+" "+m.price);
}
}