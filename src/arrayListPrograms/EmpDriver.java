package arrayListPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class EmpDriver {
public static void main(String[] args) {
	
	Emp e1 = new Emp(105,"Richa",80000.0);
	Emp e2 = new Emp(104,"Amit",74000.0);
	Emp e3 = new Emp(101,"Sumit",90000.0);
	Emp e4 = new Emp(103,"Shweta",83000.0);
	Emp e5 = new Emp(102,"Rahul",72000.0);
	
	ArrayList<Emp> a1 = new ArrayList<>();
	a1.add(e1);
	a1.add(e2);
	a1.add(e3);
	a1.add(e4);
	a1.add(e5);
	
	System.out.println("Before Sorting");
	System.out.println(a1);
	System.out.println("****************************");
	System.out.println("After Sorting based on the employee id");
	Collections.sort(a1);
	System.out.println(a1);
	System.out.println("****************************");
	System.out.println("After Sorting based on the employee id");
	Collections.sort(a1,new EmpSalaryComparator());
	System.out.println(a1);
/*
	System.out.println("****************************");
	System.out.println("After Sorting based on the employee id");
	Collections.sort(a1,new EmpNameComparator());
	System.out.println(a1);
*/	
}
}
