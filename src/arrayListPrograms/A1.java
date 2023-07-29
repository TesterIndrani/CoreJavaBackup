package arrayListPrograms;

//Heterogeneous Array List

import java.util.ArrayList;

public class A1 {
public static void main(String[] args) {
	
	ArrayList a1 = new ArrayList();	//
	System.out.println("Is a1 empty?  "+a1.isEmpty());	//empty list has capacity of storing 10 elements
	System.out.println("Size of a1:  "+a1.size());
	
	//Inserting Wrapper class type of objects into ArrayList. Note: Here formal arguments are not of primitive type  
	a1.add(10);
	a1.add('p');
	a1.add("hello");
	a1.add(true);
	a1.add(34.78);
	a1.add('p');	//accepts duplicate elements
	System.out.println("Is a1 empty after insertion?  "+a1.isEmpty());	//After insertion check if it is empty
	System.out.println("a1 = "+a1);		//elements are stored and displayed in the order of insertion
	System.out.println("Size of a1 after insertion:  "+a1.size());

	ArrayList a2 = new ArrayList();
	a2.add(100);
	a2.add('i');
	a2.add("hi");
	a2.add(false);
	a2.add(3.7);
	System.out.println("a2=  "+a2);
	
	a1.add(a2);	//inserting a2(ArrayList type of object) into a1 arrayList
	//add() adds the arraylist as a single object because, its argument is of Object type 
	System.out.println("a1 = "+a1);		//elements are stored and displayed in the order of insertion
	System.out.println("Size of a1 after insertion:  "+a1.size());

	
	a1.addAll(a2);		
	//addAll() adds each element of the a2 arrayList as separate objects into a1 arrayList because, its argument is of Collection type
	System.out.println("a1 = "+a1);		//elements are stored and displayed in the order of insertion
	System.out.println("Size of a1 after insertion:  "+a1.size());

	
	
	
	
	

	
	
}
}
