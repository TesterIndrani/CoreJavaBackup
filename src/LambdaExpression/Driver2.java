package LambdaExpression;
import java.util.Scanner;

//implementing Trial class through Lambda expression in driver class itself

class Driver2 {
public static void main(String[] args) {
	//Lambda Expression
	//task: to implement the demo(int a,int b) of the Trial interface in multiple ways
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the 2 integer numbers");
	int a= sc.nextInt();
	int b= sc.nextInt();

	System.out.println("Enter the choice");
	int choice = sc.nextInt();
	switch(choice)
	{
	case 1:{
				Trial t1=(x,y)->{
								System.out.println("Sum="+(x+y));
								};
				 t1.demo(a,b);

			}
	break;
	case 2:{
				Trial t1=(x,y)->{
								System.out.println("Difference="+(x-y));
								};
				 t1.demo(a,b);

			}
	break;
	case 3:{
				Trial t1=(x,y)->{
								System.out.println("Product="+(x*y));
								};
				 t1.demo(a,b);

			}
	break;
	case 4:{
				Trial t1=(x,y)->{
								System.out.println("Quotient="+(x/y));
								};
				 t1.demo(a,b);
			}
	break;
}
}
}