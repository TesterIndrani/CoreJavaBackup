package SetPrograms;

import java.util.LinkedHashSet;

public class A5 {
public static void main(String[] args) {
	
	LinkedHashSet h1 = new LinkedHashSet();
	h1.add(67);
	h1.add('w');
	h1.add("hello");
	h1.add(10.90);
	h1.add(29);
	
	System.out.println("Size="+h1.size());
	System.out.println(h1);
	for(Object i:h1)
		System.out.println(i);
	
}
}
