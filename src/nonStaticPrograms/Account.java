package nonStaticPrograms;

public class Account {

	//non static variables
	String accHolderName;
	long accNo;
	String pswd;
	double avlBalance;
	
	public Account(String accHolderName, long accNo, String pswd,double avlBalance)
	{
	this.accHolderName= accHolderName;
	this.accNo= accNo;
	this.pswd= pswd;
	this.avlBalance= avlBalance;
	}
	
	public void displayAccountDetails()
	{
		System.out.println(accHolderName);
		System.out.println(accNo);
		System.out.println(pswd);
		System.out.println(avlBalance);
	}
}
