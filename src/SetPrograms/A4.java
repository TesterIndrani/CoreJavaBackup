package SetPrograms;

import java.util.Iterator;
import java.util.TreeSet;

public class A4 {
	public static void main(String[] args) {
		
		TreeSet t1 = new TreeSet();
		t1.add(34);
		t1.add(78);
	  //t1.add('i'); --> ClassCastException
		t1.add(45);
		t1.add(45);
		System.out.println(t1);
		System.out.println(t1.size());
		Iterator i = t1.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
	}
}

//use other inherited methods of Collection interface and Iterator as well to practice