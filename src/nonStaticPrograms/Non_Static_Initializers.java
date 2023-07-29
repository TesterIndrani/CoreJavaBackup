package nonStaticPrograms;

public class Non_Static_Initializers {

	int a=32;	//Single line non-static initializer
	
	{
		System.out.println("First Multi line Non-static Initializer");
		System.out.println(a);
		m1();
	}
	
	public void m1()
	{
		System.out.println("Non-static m1() method is executing");
		System.out.println("m1() method is paused");
		m2();
		System.out.println("m1 method resumes");
		System.out.println("m1() will end");
	}

	public void m2()
	{
		System.out.println("Non-static m2() method is executing");
		System.out.println("Task of m2() is completed");
	}
	
	{
		System.out.println("Second Multi line Non-static Initializer");
		a=66;
		System.out.println(a);
	}
	
	
}
