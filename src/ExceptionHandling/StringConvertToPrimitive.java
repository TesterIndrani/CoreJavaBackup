//CONVERTING STRING TO PRIMITIVE
package ExceptionHandling;

public class StringConvertToPrimitive {
public static void main(String[] args) {
	
	String str1="23";
	String str2="23.90";
	String str3="Hello";
	
	try
	{
		int num1=Integer.parseInt(str1);	//PARSING
		System.out.println(num1);
		float num2=Float.parseFloat(str2);
		System.out.println(num2);
		int num3=Integer.parseInt(str3);	//will throw Number Format Exception as str3 is non-numeric type string
		System.out.println(num3);
	}
	catch(NumberFormatException n)
	{
		n.printStackTrace();
	}
	finally
	{
		System.out.println("Finally Block");
	}
}
}
