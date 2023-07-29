package nonPrimitiveTypeCasting;

public class Driver1 {
public static void main(String[] args) {
	Shape obj = new Shape(34);
	System.out.println(obj.area);
	//downcasting
	//System.out.println((Circle)obj);
	System.out.println(obj instanceof Shape);
	System.out.println(obj instanceof Circle);
}
}
