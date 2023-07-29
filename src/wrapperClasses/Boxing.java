package wrapperClasses;

//converting primitive value into non-primitive value

public class Boxing {
public static void main(String[] args) {

	int a=10;
	double d=20.90;
	
	Integer i = Integer.valueOf(a);
	System.out.println(i);	//toString() is overriden..hence value is printed instead of object reference
	
	Double j = Double.valueOf(d);
	System.out.println(j);	//toString() is overriden..hence value is printed instead of object reference
}
}
