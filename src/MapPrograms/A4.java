//LinkedHashMap

package MapPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class A4 {
public static void main(String[] args) {
		
		LinkedHashMap<Integer,String>t1 = new LinkedHashMap<>();
		t1.put(104,null);
		t1.put(101,"riya");
		t1.put(103,"pooja");
		t1.put(null,null);
		t1.put(null,"adithi");  	//the previous null key row will be replaced by the latest null key row
		
		System.out.println(t1.isEmpty());
		System.out.println(t1.size());
		System.out.println(t1.keySet());
		System.out.println(t1.values());
		System.out.println(t1.get(302)); //will return null as there is no key with 302
		System.out.println(t1.containsKey(104));
		System.out.println(t1.containsValue("riya"));
		//t1.put(780.0,'j');	//cannot accept non-generic data
		
		System.out.println("******************************");
		//to access key-value pair one by one from TreeMap
		System.out.println("key-value pairs are:-");
		for(Map.Entry<Integer,String>i:t1.entrySet())
			//System.out.println(i); OR 
			System.out.println("Key="+i.getKey()+" Value="+i.getValue());	//will display in ascending order of keys
	
		System.out.println("******************************");
		LinkedHashMap<Integer,String>t2 = new LinkedHashMap<>();
		t2.putAll(t1);
		System.out.println("key-value pairs are:-");
		for(Map.Entry<Integer,String>i:t2.entrySet())
			//System.out.println(i); OR 
			System.out.println("Key="+i.getKey()+" Value="+i.getValue());
		
		System.out.println(t1.equals(t2));
		
		t1.remove(104);	//will remove row with key as 104
		System.out.println(t1);
	
	
	}

}
