package relationship;

public class Student {
//non-static variables
	
private String name;
private int id;
private long cNo;

public String getName() {
	return name;
}

public int getId() {
	return id;
}

public long getcNo() {
	return cNo;
}
public void setcNo(long cNo) {
	this.cNo = cNo;
}

public Student(){}

public Student(String name, int id, long cNo) {
	this.name = name;
	this.id = id;
	this.cNo = cNo;
}
}
