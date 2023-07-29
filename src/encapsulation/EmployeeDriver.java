package encapsulation;

public class EmployeeDriver {
  
	public static void main(String[] args) {
	 
		Employee e1 = new Employee(101,50000.0,"Indrani");
		System.out.println(e1.getSalary());
		e1.setSalary(60000.0);
		e1.display();
		
		Employee e2 = new Employee(102,25000.0,"Karthik");
		System.out.println(e2.getName());
		e2.setName("Karthika");
		e2.display();
}
}
