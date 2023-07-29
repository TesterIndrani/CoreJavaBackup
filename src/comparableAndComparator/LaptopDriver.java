package comparableAndComparator;
import java.util.Arrays;

public class LaptopDriver
{
	public static void main(String args[])
	{
		Laptop[] lappys = { new Laptop("White",65000), 
							new Laptop("Yellow",55000), 
							new Laptop("Red",89000), 
							new Laptop("Black",38000)};

		System.out.println("Before Sorting");
		for (Laptop l:lappys)
				System.out.println(l.color+" "+l.price);

		System.out.println("*****************************");
		System.out.println("After sorting in terms of Color");
Arrays.sort(lappys, new LaptopColorComparator()); //passing arrayReference and colorComparatorcInstance to sort the array based on colour
		for (Laptop l:lappys)
				System.out.println(l.color+" "+l.price);

		System.out.println("*****************************");

		System.out.println("After sorting in terms of Price");
Arrays.sort(lappys, new LaptopPriceComparator()); //passing arrayReference and colorComparatorcInstance to sort the array based on price
		for (Laptop l:lappys)
				System.out.println(l.color+" "+l.price);
	}
}

