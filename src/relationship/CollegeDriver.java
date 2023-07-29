package relationship;

import java.util.Scanner;

public class CollegeDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		College obj = new College("Ladies Sriram College","Delhi");
		boolean exit = true;
		while(exit)
		{
			System.out.println("Enter your choice");
			System.out.println("1.Get Admission\n 2.Cancel Admission\n 3.Update Details \n4.Display Details\n 5.Exit");
			int choice = sc.nextInt();
			switch(choice)
			{
		case 1:
			{
				System.out.println("Enter the student name");
				String name=sc.next();
				System.out.println("Enter Student email");
				String email= sc.next();
				System.out.println("Enter Student contact number");
				long cNo= sc.nextLong();
				System.out.println(obj.getAdmission(new College_Student(name,email,cNo)));
				System.out.println("***********************");
			}
		break;
		case 2:
			{
				obj.removeAdmission();
				System.out.println("***********************");
			}
		break;
		case 3:
			{
				System.out.println("Enter latest Student email");
				String email= sc.next();
				System.out.println("Enter latest Student contact number");
				long cNo= sc.nextLong();
				obj.updateStudentDetails(email,cNo); 
				System.out.println("***********************");

			}
		break;
		case 4:
			{
				obj.displayDetails();
				System.out.println("***********************");
			}
		break;
		case 5:
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
