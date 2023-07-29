package nonPrimitiveTypeCasting;

public class OlaDriver {
public static void main(String[] args) {
	
	Mini m1 = new Mini(12,"Green","KAJK2222");
	System.out.println("\nMini cab details:");
	m1.display();
	
	System.out.println("\n************************\n");

	Prime p1 = new Prime(17,"Purple","KA4DL5555");
	System.out.println("Prime cab details:");
	p1.display();
	
	System.out.println("\n************************\n");

	Ola o3 = new Ola(14);
	System.out.println("Ola cab o3 price:"+o3.price);
	
	System.out.println("\n*************Upcasting beings*************\n");
	
	Ola o1 = m1;
	System.out.println("Price of Ola o1 which is a Mini="+o1.price);
	Ola o2 = p1;
	System.out.println("Price of Ola o2 which is a Prime="+o2.price);
	
			
			
	System.out.println("\n*************Downcasting beings*************\n");
	
	Mini m2 = (Mini)o1;
	System.out.println("Color and Car number of Mini= "+m2.color+" , "+m2.carNo);
	Prime p2 = (Prime)o2;
	System.out.println("Color and Car number of Prime= "+p2.color+" , "+p2.carNo);
	
	System.out.println("\n*************Instance of verification*************\n");
	
	System.out.print("Is Ola o1 instance of Ola: ");
	System.out.println(o1 instanceof Ola);
	System.out.print("Is Ola o1 instance of Mini: ");
	System.out.println(o1 instanceof Mini);
	System.out.print("Is Ola o2 instance of Ola: ");
	System.out.println(o2 instanceof Ola);
	System.out.print("Is Ola o2 instance of Prime: ");
	System.out.println(o2 instanceof Prime);
	System.out.print("Is Ola o3 instance of Prime: ");
	System.out.println(o3 instanceof Prime);

}
}
