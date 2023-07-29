package relationship;

public class College {

	//non static variable
		String location;
		String collegeName;
		College_Student s; 
		College(){}
		
		public College(String collegeName, String location)
		{
			this.collegeName=collegeName;
			this.location=location;

		}
		public String getAdmission(College_Student s) //reference helper method
		{
			if(this.s==null) //verification if student is created before or not
			{
				this.s=s;
				return "Admission successful";
			}
			else
				return "No seat available";
		}
		public void removeAdmission() //not taking parameter because, we have only one student
		{
			if(this.s==null)
			System.out.println("The admission is already cancelled");
			else
			{
				this.s=null;
				System.out.println("Admission is now cancelled");
			}
		}
		public void updateStudentDetails(String email,long cNo)
		{
			if(this.s==null)
				System.out.println("No student admitted");
				else
				{
					this.s.setEmail(email);
					this.s.setcNo(cNo);
					System.out.println("Student details are updated");
				}
		}
		public void displayDetails()
		{
		if(this.s==null)
			System.out.println("No student admitted");
			else
			{
				System.out.println("Student name="+s.getName());
				System.out.println("Student Email="+s.getEmail());
				System.out.println("cNo="+s.getcNo());
				System.out.println("College Name="+collegeName);
				System.out.println("Location="+location);
			}
		}
		
	}

