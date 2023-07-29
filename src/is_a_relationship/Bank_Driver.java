package is_a_relationship;

public class Bank_Driver {
public static void main(String[] args) {
	
	ICICI_Bank obj1 = new ICICI_Bank("ICICI","Mumbai","ICICI44556677","King");
	obj1.display();
	System.out.println("***************************");
	
	SBI_Bank obj2 = new SBI_Bank("SBI","Delhi","SBI12345678","Raj");
	obj2.display();
	System.out.println("***************************");
}
}
