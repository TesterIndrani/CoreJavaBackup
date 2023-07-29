package polymorphism;

//Method shadowing & Variable Shadowing

public class A2_A3_Driver {
public static void main(String[] args) {
	
	A2 obj1 = new A3();  //upcasting
	obj1.m1();
	System.out.println(obj1.a);
	System.out.println(obj1.b);
	
	A3 obj2 = new A3();
	obj2.m1();
	System.out.println(obj2.a);
	System.out.println(obj2.b);
	
	A2 obj3=obj2;
	obj3.m1();
	System.out.println(obj3.a);
	System.out.println(obj3.b);
	
	A2 obj4 = new A2();
	System.out.println(obj1 instanceof A2);
	System.out.println(obj2 instanceof A2);
	System.out.println(obj4 instanceof A3);
}
}
