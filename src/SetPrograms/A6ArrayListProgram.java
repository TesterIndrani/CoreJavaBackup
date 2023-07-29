package SetPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class A6ArrayListProgram {
public static void main(String[] args) {
	
	ArrayList<Integer> a1=new ArrayList<>();
	a1.add(14);
	a1.add(9);
	a1.add(23);
	a1.add(10);
	a1.add(18);
	System.out.println(a1);
	Collections.sort(a1,new MyComparator());
	System.out.println(a1);
}
}
