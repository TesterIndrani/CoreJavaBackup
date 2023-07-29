package nonStaticPrograms;
//class loading process---->static members(initializers invoked from top to bottom) are loaded
public class NonStaticContext {

	{
		System.out.println("Multi line Non Static Initializers");
	}
	
	static
	{
		System.out.println("Static Initializers 1");
		int a=40;
		System.out.println(a+50);
	}
	int b=367;

	static
	{
		System.out.println("Static Initializers 2");
	}
	
	static int i=29;
	public static void main(String[] args) {
		System.out.println("Main statrts");
		NonStaticContext obj = new NonStaticContext();
		obj.b = 78;//non static accessed---->reference variable obj
		obj.i= 90;//static accessed---->reference variable as well as the class
		System.out.println(i);//90
		NonStaticContext.i=39;
		System.out.println(i);//39
		System.out.println("Main ends");
	}
}
