package relationship;

public class School {
//non static variable
	String schoolName;
	String pName;
	Student s; //HAS-A relationship with Lazy instantiation i.e. Student shouldn't be created, when School itself is created
				//Student will be created, when student takes admission
	School(){}
	public School(String schoolName, String pName)
	{
		this.schoolName=schoolName;
		this.pName=pName;
	}
	public String admitStudent(Student s) //reference helper method
	{
		if(this.s==null) //verification if student is created before or not
		{
			this.s=s;
			return "Admission successful";
		}
		else
			return "No seat available";
	}
	public void cancelAdmission() //not taking parameter because, we have only one student
	{
		if(this.s==null)
		System.out.println("The admission is already cancelled");
		else
		{
			this.s=null;
			System.out.println("Admission is now cancelled");
		}
	}
	public void display()
	{
	if(this.s==null)
		System.out.println("No student admitted");
		else
		{
			System.out.println("Student Id="+s.getId());
			System.out.println("Student Name="+s.getName());
			System.out.println("cNo="+s.getcNo());
			System.out.println("School Name="+schoolName);
			System.out.println("Principal Name="+pName);
		}
	}
	
}
