package Object_Class;

public class Demo {
public static void main(String[] args) {
	Demo obj = new Demo();
	System.out.println(obj.toString());
	System.out.println(obj); //is equivalent to obj.toString() as toString() is called implicitly while printing object reference
}
}
