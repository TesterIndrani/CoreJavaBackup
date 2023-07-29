package interfaceProgram;

public class Vehicle_Driver {
public static void main(String[] args) {
	
	Bike b1 = new Bike();
	System.out.println("The number of wheels in Bike = "+b1.getNoOfWheels());
	
	Auto a1 = new Auto();
	System.out.println("The number of wheels in Auto = "+a1.getNoOfWheels());
	
	Car c1 = new Car();
	System.out.println("The number of wheels in Car = "+c1.getNoOfWheels());
	
	Truck t1 = new Truck();
	System.out.println("The number of wheels in Truck = "+t1.getNoOfWheels());
}
}
