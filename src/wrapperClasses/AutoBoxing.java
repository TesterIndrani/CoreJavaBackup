package wrapperClasses;
//implicitly converted from primitive to non-primitive without using valueOf() method
public class AutoBoxing {

	public static void main(String[] args) {
		int a=10;
		double d=20.90;
		
		Integer i=a;		
		System.out.println(i);	//toString() is overriden..hence value is printed instead of object reference
		
		Double j=d;
		System.out.println(j);	//toString() is overriden..hence value is printed instead of object reference
	}
}
