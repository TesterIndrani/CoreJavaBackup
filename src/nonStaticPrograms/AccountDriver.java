package nonStaticPrograms;

public class AccountDriver {

	public static void main(String[] args) {
		
		Account a1 = new Account("Indrani",2222444466668888l,"JavaClass@",50000.0);
		System.out.println(a1);
		a1.displayAccountDetails();
		
		Account a2 = new Account("ABC",1111333355557777l,"JavaClass$",250000.45);
		System.out.println(a2);
		a2.displayAccountDetails();

	}
	
}
