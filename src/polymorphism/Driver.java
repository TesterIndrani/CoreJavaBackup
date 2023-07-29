package polymorphism;

public class Driver {
public static void main(String[] args) {
	
	Square sq = new Square();
	sq.area();
	
	Shape sh = new Shape();
	sh.area();
	
	Shape sh1 = new Square(); //upcasting
	sh1.area(); //child area method gets called due to runtime polymorphism and Method overriding
}
}
