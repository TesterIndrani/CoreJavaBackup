package nonStaticPrograms;

public class Mobile {

	//non static variables
	String brand;
	int ram;
	int rom;
	double price;	
		
	//non static paramterized method
	public Mobile(String brand,int ram,int rom,double price)
	{
		this.brand = brand;	
		this.ram = ram;
		this.rom = rom;
		this.price = price;
	}
	
	public Mobile(String brand,int ram,int rom)
	{
		this.brand = brand;	
		this.ram = ram;
		this.rom = rom;
	}
	
	public Mobile(String brand,int ram)
	{
		this.brand = brand;	
		this.ram = ram;
	}
		

	public Mobile(String brand,int rom,double price)
	{
		this.brand = brand;	
		this.rom = rom;
		this.price = price;
	}
	
	public Mobile(int ram,String brand,double price)
	{
		this.brand = brand;	
		this.ram = ram;
		this.price = price;
	}
	
	public Mobile(double price,String brand)
	{
		this.price = price;
		this.brand = brand;	
	}
	

	//non static method
	public void display()
	{
		System.out.println(brand);
		System.out.println(ram);
		System.out.println(rom);
		System.out.println(price);	
	}
}	
