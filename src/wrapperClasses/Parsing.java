package wrapperClasses;

//converting non-primitive String type to primitive type

public class Parsing {
public static void main(String[] args) {
	
	String str = "Hello@howru?";	
	int i= Integer.parseInt(str);	//will throw Number Format Exception as String variable has non-numeric value
	System.out.println(i);

	
}
}
