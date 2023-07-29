package comparableAndComparator;
//implementing compareTo() method of Comparable interface to make the objects comparable based on brand

public class Mobile implements Comparable
{
	String brand;
	double price;

	public Mobile(String brand, double price)
	{
		this.brand=brand;
		this.price=price;
	}

/*internally this method is called by Arrays.sort(). Ex: the array mob has multiple objects m1, m2, m3...
So each object is compared with all other objects i.e. m1 is compared with m2, m3...and then m2 is compared with m1, m3...
Syntax of calling statement: m1.compareTo(m2) where m1 is considered as 'this' and m2 is considered as obj */
	
@Override
public int compareTo(Object obj)	//Upcasting the Mobile class object to Object class type
{
	//downcasting
	Mobile temp = (Mobile)obj;	//downcasting the Object type to Mobile type
		
    return this.brand.compareTo(temp.brand); //using compareTo method of String class to compare both Strings based on Unicode
}
}
