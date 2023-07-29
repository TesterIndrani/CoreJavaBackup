package Object_Class;

public class Driver2 {
public static void main(String[] args) {
	
	Book b1 = new Book("C++",101);
	Book b2 = new Book("C++",101);
	System.out.println(b1);
	System.out.println(b2);

	System.out.println(b1==b2); //false..compares address of the objects
	System.out.println(b1.equals(b2)); //true..as equals() method is overridden, compares states of the objects
	
//hashCode() method- If not overriden, returns UIN based on address of the objects. If overriden, returns UIN based on state of the objects.
	int h1= b1.hashCode(); //since overriden, returns UIN based on state of the object
	int h2= b2.hashCode();
	System.out.println(h1);
	System.out.println(h2);
	System.out.println(h1==h2); //returns true since, UIN is based on state of the object
}
}
