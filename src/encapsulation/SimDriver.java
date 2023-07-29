package encapsulation;

public class SimDriver {
public static void main(String[] args) {
	
	Sim s1 = new Sim("MTNL",9123456780l,399.5,"Rose gold");
	System.out.println(s1);
	System.out.println(s1.getServiceProvider());
	System.out.println(s1.getSimNo());
	s1.display();

	
	Sim s2 = new Sim("Tata Docomo",9876543210l,110.2,"White");
	System.out.println(s2);
	System.out.println(s2.getServiceProvider());
	System.out.println(s2.getSimNo());
	s2.display();

	
	Sim s3 = new Sim("Airtel",9012345678l,900.7,"Black");
	System.out.println(s3);
	System.out.println(s3.getServiceProvider());
	System.out.println(s3.getSimNo());
	s3.setServiceProvider("Vodafone");	
	s3.display();	
}
	
}
