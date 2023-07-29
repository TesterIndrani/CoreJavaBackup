package relationship;

public class CarDriver {
public static void main(String[] args) {
	Car c1=new Car("Black");
	System.out.println("Car color="+c1.getColor());
	System.out.println("Engine CC="+c1.getEngine().getCC());
	c1.setColor("White");
	System.out.println("Car color="+c1.getColor());
}
}
