package Object_Class;

public class Driver1 {
public static void main(String[] args) {
	Book b1 = new Book("Java",102);
	Book b2 = b1;
	
	System.out.println(b1);
	System.out.println(b2);
	System.out.println(b1==b2); //'==' compares the address of the objects
	System.out.println(b1.equals(b2));
	//equals() method- If not overriden, compares address of the objects. If overriden, compares state of the objects.
	
//hashCode() method- If not overriden, returns UIN based on address of the objects. If overriden, returns UIN based on state of the objects.
	int h1= b1.hashCode();   
	int h2= b2.hashCode();
	System.out.println(h1);
	System.out.println(h2);
	System.out.println(h1==h2); //compares if both integer values are same
}
}
