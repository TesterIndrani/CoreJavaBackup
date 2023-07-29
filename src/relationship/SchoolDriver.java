package relationship;
import java.util.Scanner;
public class SchoolDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		School obj = new School("Karen International","Marie");
		boolean exit = true;
		while(exit)
		{
			System.out.println("Enter your choice");
			System.out.println("1.Get Admission\n 2.Cancel Admission\n 3.Student Details\n 4.Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
		case 1:
			{
				System.out.println("Enter the student name");
				String name=sc.next();
				System.out.println("Enter Student id");
				int id= sc.nextInt();
				System.out.println("Enter Student contact number");
				long cNo= sc.nextLong();
				System.out.println(obj.admitStudent(new Student(name,id,cNo)));
				System.out.println("***********************");
			}
		break;
		case 2:
			{
				obj.cancelAdmission();
				System.out.println("***********************");
			}
		break;
		case 3:
			{
				obj.display();
				System.out.println("***********************");
			}
		break;
		case 4:
			{
			exit=false;
			System.out.println("Thank you!!!!");
			}
		break;
		default: System.out.println("Invalid choice");
		}
	}
}
}
