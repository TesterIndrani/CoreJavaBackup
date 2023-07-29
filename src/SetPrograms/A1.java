package SetPrograms;

import java.util.HashSet;

public class A1 {
	public static void main(String[] args) {
		
		HashSet h1 = new HashSet();
		h1.add(67);
		h1.add("hello");
		h1.add(45.10);
		h1.add('b');
		h1.add(true);
		
		System.out.println("Size="+h1.size());
		System.out.println(h1);
		h1.add(67);
		h1.add('b');
		
		for(Object i:h1)
		{
			System.out.print(i+" ");
		}

	}

}
