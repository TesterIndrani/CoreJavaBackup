package polymorphism;

//Non-static method overloading

public class A1 {

	public void m1()
	{
		System.out.println("method 1");
	}
	public void m1(int a)
	{
		System.out.println("method 2");
	}
	public void m1(double d)
	{
		System.out.println("method 3");
	}
	
	public static void main(String[] args) {
		A1 obj = new A1();
		obj.m1();
		obj.m1(9);
		obj.m1(12.0);
	}
}
