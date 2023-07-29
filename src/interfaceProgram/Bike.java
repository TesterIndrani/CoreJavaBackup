package interfaceProgram;

public class Bike implements Vehicle {

	@Override
	public int getNoOfWheels()  //have to give access modifier greater than the parent class getNoOfWheels()..so public is mandatory
	{
		return 2;
	}
}
