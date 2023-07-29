package nonPrimitiveTypeCasting;

public class Mini extends Ola {

	String color;
	String carNo;
	
	public Mini() {}

	public Mini(double price, String color, String carNo) 
	{
		super(price);
		this.color = color;
		this.carNo = carNo;
	}
	
	public void display()
	{
		System.out.println("Car Number="+carNo);
		System.out.println("Color="+color);
		System.out.println("Price="+price);
	}
	
}
