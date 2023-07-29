package StringPrograms;

public class A1 {
public static void main(String[] args) {
	
	
	String str = "abcdefgh";
	System.out.println("Length of the String is: "+str.length());

	String str2= str.substring(2,4);
	System.out.println(str2);
	
	String str3 = "ABCdeFgH";
	System.out.println("Is str equal to str3: "+str.equals(str3));
	
	System.out.println("Is str equal to str3 irrespective of case: "+str.equalsIgnoreCase(str3));
	
	System.out.println("Does str contain efg: "+str.contains("efg"));
	
	char ch[]=str.toCharArray();
	System.out.println("Elements of String converted to Character Array:");
	for(char ele:ch)
	{
		System.out.println(ele);
	}
	
}
}
