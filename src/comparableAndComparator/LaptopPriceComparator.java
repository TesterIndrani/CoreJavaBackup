package comparableAndComparator;
import java.util.Comparator;
//implementing compare() method of Comparator interface to make the objects comparable based on price


/* this method is called by Arrays.sort(User-definedClass arrayRef, LaptopColorComparator instance) internally.
* Ex: We created object array of User-defined class Laptop and its objects are l1, l2, l3...
So each object is compared with all other objects i.e. l1 is compared with l2, l3...and then l2 is compared with l1, l3...
Syntax of internal calling statement from Arrays.sort() :compare(l1, l2) */	
public class LaptopPriceComparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Laptop l1,l2;
		l1 = (Laptop)o1;
		l2 = (Laptop)o2;

		if(l1.price==l2.price)
			return 0;
	//	if(l1.price > l2.price) //for ascending order
		if(l1.price < l2.price) //for descending order
			return 1;
		return -1;	
	}
}

