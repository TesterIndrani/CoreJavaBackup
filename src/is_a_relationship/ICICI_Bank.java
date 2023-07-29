package is_a_relationship;

public class ICICI_Bank extends Bank {
	
	String manager_Name;
	
	public ICICI_Bank(String bname, String branch, String ifsc, String manager_Name)
	{
		super(bname, branch, ifsc);//calling or invoking the constructor of parent class
		this.manager_Name=manager_Name;
	}
	
	public void display()
	{
			System.out.println(bname);
			System.out.println(branch);
			System.out.println(ifsc);
			System.out.println(manager_Name);
	}
	
}
