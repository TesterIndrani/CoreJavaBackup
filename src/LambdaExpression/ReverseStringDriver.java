package LambdaExpression;
import java.util.Scanner;


public class ReverseStringDriver{

public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a String to reverse:");
			String str1 = sc.nextLine();
		
	ReverseString r1=(str)->{
								String str2="";
								for(int i=str1.length()-1;i>=0; i--)
								{
									str2 = str2+str.charAt(i);
								}
								System.out.println("Reverse String = "+str2);
							};
	r1.work(str1);

}
}
