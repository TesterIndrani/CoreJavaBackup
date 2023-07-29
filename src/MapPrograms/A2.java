//Map with homogeneous/generic data
package MapPrograms;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A2 {
public static void main(String[] args) {
	

	HashMap<Integer,String>h1 = new HashMap<>();
	h1.put(101,"Naveen");
	h1.put(501,"Prakash");
	h1.put(391,"Ashitha");
	h1.put(425,"Sunidhi");
	h1.put(309,"Manoj");
	h1.put(400,"Pramod");
	System.out.println(h1);
	HashMap<Integer,String>h2 = new HashMap<>();
	h2.putAll(h1);
	System.out.println(h2);
	System.out.println(h1.equals(h2));
	
	System.out.println("******************************");
	//display keys-->KeySet()-->returns Set
	System.out.println("Keys are:-");
	Set s = h1.keySet();
	for(Object i:s)
		System.out.println(i);
	
	System.out.println("******************************");
	//display values-->value()-->returns Collection
		System.out.println("Values are:-");
		Collection c = h1.values();
		for(Object i:c)
			System.out.println(i);
		
	System.out.println("******************************");
	//to access key-value pair one by one from HashMap
	System.out.println("key-value pairs are:-");
	for(Map.Entry<Integer,String>i:h1.entrySet())
		//System.out.println(i); OR 
		System.out.println("Key="+i.getKey()+" Value="+i.getValue());
}
}
