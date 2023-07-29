package Object_Class;

public class Circle {

	int radius;
	String color;
	Circle(int radius,String color)
	{
		this.radius=radius;
		this.color=color;
	}
@Override	//Annotation

public String toString() //Overriding toString() method in Object class
{
	return "radius="+radius+"\n"+"Color="+color;
}

public static void main(String[] args)
{
	Circle obj = new Circle(10,"White");
	System.out.println(obj); // i.e. obj.toString() of Circle class is called instead of Object Class 
}

}
