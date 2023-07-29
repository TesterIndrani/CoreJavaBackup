//Map with non-generic/heterogeneous data
package MapPrograms;

import java.util.HashMap;

public class A1 {
public static void main(String[] args) {
	
	HashMap h1 = new HashMap();
	System.out.println(h1.isEmpty());
	h1.put(1,"Naveen");
	h1.put(34.23,"Pramod");
	h1.put(false,689);	//boolean type of key
	System.out.println(h1);
	h1.put(1, 45.12);		//cannot have duplicate key..so this overrides the previous row with key as 1
	System.out.println(h1);
	System.out.println(h1.size());
	System.out.println(h1.containsKey(34.23));
	System.out.println(h1.containsValue(32));
	System.out.println(h1.get(false));
	h1.remove(34.23);
	System.out.println(h1);
	
}
}
