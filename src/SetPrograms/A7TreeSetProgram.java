//display elements of TreeSet in Descending order using MyComparator class
package SetPrograms;

import java.util.TreeSet;

public class A7TreeSetProgram {
public static void main(String[] args) {
	
	TreeSet t1 = new TreeSet(new MyComparator());//passing instance of MyComparator will internally invoke compare() method of that class
	t1.add(90);
	t1.add(56);
	t1.add(110);
	t1.add(45);
	t1.add(66);
	
	System.out.println(t1);
}
}
