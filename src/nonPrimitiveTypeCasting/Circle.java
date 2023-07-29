package nonPrimitiveTypeCasting;

public class Circle extends Shape {
double radius; //declared member
//area is inherited member

public Circle(double area, double radius) {
	super(area);
	this.radius = radius;
}	
}
