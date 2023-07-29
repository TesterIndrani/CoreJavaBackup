package relationship;

public class College_Student {
	
private String name;
private String email;
private long cNo;

public String getName() {
	return name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getcNo() {
	return cNo;
}

public void setcNo(long cNo) {
	this.cNo = cNo;
}

public College_Student() {}

public College_Student(String name, String email, long cNo) {
	this.name = name;
	this.email = email;
	this.cNo = cNo;
}


}
