package Object_Class;

public class Laptop_Driver {

	public static void main(String[] args)
	{
		Laptop l1 = new Laptop(4,1,"Intel core i5");
		Laptop l2 = new Laptop(4,1,"Intel core i5");

		
		System.out.println("******** toString() of Laptop class overriding toString() of Object class ******");
		System.out.println(l1.toString());
		System.out.println(l2.toString());

		System.out.println("\n******** equals(obj) of Laptop class overriding equals(obj) of Object class ******");

		System.out.println("Is address of both objects same:");
		System.out.println(l1==l2); //false
		System.out.println("Is value of l1 and l2 same:");
		System.out.println(l1.equals(l2));
		
		System.out.println("\n******* hashCode() of Laptop class overriding hashCode() of Object class *******");
		int h1 = l1.hashCode();
		int h2 = l2.hashCode();
		System.out.println(h1==h2);
		
		l2.setRam(8);
		l2.setHardDisk(2);
		l2.setProcessor("Intel core i7");
		
		System.out.println("\n******** toString() of Laptop class overriding toString() of Object class ******");
		System.out.println(l1.toString());
		System.out.println(l2.toString());

		System.out.println("\n******** equals(obj) of Laptop class overriding equals(obj) of Object class ******");

		System.out.println("Is address of both objects same:");
		System.out.println(l1==l2); //false
		System.out.println("Is value of l1 and l2 same:");
		System.out.println(l1.equals(l2));
		
		System.out.println("\n******* hashCode() of Laptop class overriding hashCode() of Object class *******");
		int h3 = l1.hashCode();
		int h4 = l2.hashCode();
		System.out.println(h3==h4);	
	}
}
