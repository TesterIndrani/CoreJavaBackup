package SetPrograms;

import java.util.HashSet;
import java.util.Iterator;

public class A2 {
public static void main(String[] args) {
		
		HashSet <String> h1= new HashSet<>();
		h1.add("67");
		h1.add("hello");
		h1.add("45.10");
		h1.add("b");
		h1.add("true");
		
		System.out.println("Size="+h1.size());
		System.out.println(h1);
		h1.add("true");		//doesn't allow duplicate objects. So, won't be added
		h1.add("True");
		h1.add(null);		//allows null value 
		
		Iterator <String> i = h1.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");		//insertion order won't be maintained
		}

	}

}
