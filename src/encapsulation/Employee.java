package encapsulation;

public class Employee {
	
	//non static variables
	private int id;
	private double salary;
	private String name;
	
	Employee(){} //no argument constructor
	
	Employee(int id,double salary,String name)
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
	}
	//getter and setter for id
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	//getter and setter for salary
	public double getSalary()
	{
		return salary;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}	//getter and setter for name
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	//non-static method
	public void display()
	{
		System.out.println("Employee id="+this.id);
		System.out.println("Employee salary="+this.salary);
		System.out.println("Employee name="+this.name);
	}
}
