package SetPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class A3 {
public static void main(String[] args) {
	
	HashSet<Integer> h1 = new HashSet<>();
	h1.add(67);
	h1.add(72);
	h1.add(45);
	h1.add(10);
	h1.add(29);
	
	System.out.println("Size="+h1.size());
	System.out.println(h1);
	
	//Converting the HashSet into ArrayList as ArrayList maintains insertion order
	ArrayList a1 = new ArrayList(h1); 
	Collections.sort(a1);
	for(Object i:a1)	//As ArrayList is not declared as Integer type, we need to traverse it through as heterogeneous data of Object type
	System.out.println(i);
	
	
}
}
