package nonPrimitiveTypeCasting;

public class Driver {
public static void main(String[] args) {
	
	Circle c= new Circle(12.0,8.0);
	Shape s=c; //upcasting or Generalization
	//Shape s = new Circle(12.0,8.0); //we are creating object of Circle(child) and storing the same address in Shape(parent) object
	System.out.println(c.area); //inherited
	System.out.println(c.radius); //declared
	System.out.println(s.area); //declared
	//System.out.println(s.radius); //CTE because, Shape cannot cannot access radius
	System.out.println(c==s);
	Circle c1 = (Circle)s;	//Downcasting
	System.out.println(c1.radius);
	c= (Circle)s;   //Downcasting
	System.out.println(c.radius);
	System.out.println(s instanceof Shape);//true because s is object of Shape
	System.out.println(s instanceof Circle);//true because s is holding the address of Circle type object
}
}
