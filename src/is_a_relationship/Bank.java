package is_a_relationship;

public class Bank {

	String bname;
	String branch;
	String ifsc;
	
	public Bank(String bname, String branch, String ifsc) {
		//super();  //here super class of Bank is Object class
		this.bname = bname;
		this.branch = branch;
		this.ifsc = ifsc;
	}
	
}
