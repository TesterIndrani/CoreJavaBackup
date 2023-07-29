package nonStaticPrograms;

public class MobileDriver {

	public static void main(String[] args) {
	
		Mobile m1 = new Mobile("Samsung",8,128,15000.0);
		System.out.println(m1);
		m1.display();
		
		System.out.println("******************");
		
		Mobile m2 = new Mobile("Lenovo",4,64);
		System.out.println(m2);
		m2.display();
		
		System.out.println("******************");
		
		Mobile m3 = new Mobile("Nokia",3);
		System.out.println(m3);
		m3.display();
		
		System.out.println("******************");
		
		Mobile m4 = new Mobile("OnePlus",256,45000.0);
		System.out.println(m4);
		m4.display();
		
		System.out.println("******************");
		
		Mobile m5 = new Mobile(3,"Oppo",18000.0);
		System.out.println(m5);
		m5.display();
		
		System.out.println("******************");
		
		Mobile m6 = new Mobile(12000.0,"Redmi");
		System.out.println(m6);
		m6.display();
	}
}
