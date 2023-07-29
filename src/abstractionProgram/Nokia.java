package abstractionProgram;

public class Nokia extends Mobile {

	void camera()	//overriding abstract method and providing implementation
	{
		System.out.println("3D camera");
	}
	void screen()	//overriding abstract method and providing implementation 
	{
		System.out.println("4.5 inch screen");
	}
	void ram()		//overriding concrete method 
	{
		System.out.println("6 GB ram");
	}
}
