package is_a_relationship;

public class Y extends X{
	int i=20;
	int j;
 static int b=20;
 
 public void display()
 {
	 System.out.println(i);		//20
	 System.out.println(super.i);		//10
 }
}
