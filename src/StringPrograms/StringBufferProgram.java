package StringPrograms;

import java.lang.StringBuffer;

public class StringBufferProgram
{
		public static void main(String[] args)
{
		StringBuffer s1 = new StringBuffer("");
		System.out.println("Length of s1= "+s1.length());	//length of String : 0
		System.out.println("Capacity of s1= "+s1.capacity()); //initial capacity to store characters: 16
		
		s1 = new StringBuffer("Core Java");		
		System.out.println("Length of s1= "+s1.length());	//length of String : 9
		System.out.println("Capacity of s1= "+s1.capacity()); //default capacity + length i.e. 16+9 = 25
		System.out.println("character at index 5= "+s1.charAt(5));  //character at index=5
	System.out.println("index of substring Java in s1= "+ s1.indexOf("Java")); //returns first occurrence of "Java"
    System.out.println("index of substring a in s1= "+s1.indexOf("a", 7));//returns first occurrence of "a" from index=7
	System.out.println("last index of substring ore in s1= "+s1.lastIndexOf("ore"));//returns rightmost occurrence of "ore"
	System.out.println("last index of substring a in s1= "+s1.lastIndexOf("a", 7));//returns rightmost occurrence of "a" from index="7"
	System.out.println("substring staring from index 3= "+s1.substring(3));//returns substring starting from index=3
	System.out.println("substring staring from index 5 to 8= "+s1.substring(5,9));//returns substring from start to end-1 i.e. 5 to 8
		
		
		s1 = new StringBuffer("Core");
		System.out.println("Capacity of s1= "+s1.capacity()); //default capacity + length i.e. 16+4 = 20
		System.out.println("s1= "+ s1+ ", s1 hashcode= " + s1.hashCode()); //s1= Core, s1 hashcode= 312116338
		s1.append("Programming");
		System.out.println("s1= "+ s1+ ", s1 hashcode= " + s1.hashCode()); //s1= CoreProgramming, s1 hashcode= 312116338
		s1.append(90);
		System.out.println("s1= "+ s1+ ", s1 hashcode= " + s1.hashCode()); //s1= CoreProgramming90, s1 hashcode= 312116338
		
		StringBuffer s2 = new StringBuffer("Hello How are you.");
		s2.insert(0, 5);	//inserts 2nd argument(integer here) at 1st argument index i.e. inserts 5 at index=0 of s2
		System.out.println("s2 = " + s2);
		s2.insert(3, true);  //inserts 2nd argument(boolean here) at 1st argument index i.e. inserts true at index=3 of s2
		System.out.println("s2 = " + s2);
		s2.insert(5, 34.89); //inserts 2nd argument(double here) at 1st argument index i.e. inserts 34.89 at index=5 of s2
		System.out.println("s2 = " + s2);

		char[] ch1 = {'s','w','a','t','i'}; //inserts 2nd argument(char[] here) at 1st argument index i.e. inserts char array at index=5 of s2
		s1.insert(9, ch1);
		System.out.println("s1 = " + s1);
		
		StringBuffer s3 = new StringBuffer("Java Programming");
		s3.reverse();	//reverses the String
		System.out.println("s3 = " + s3);
		
		StringBuffer s4 = new StringBuffer("Java Programming");
		s4.delete(0, 3);	//deletes substring from s4 with index = start till end-1 i.e. 0 till 2
		System.out.println("s4 = " + s4);
		s4.deleteCharAt(7);	//deletes character at index=7 from s4
		System.out.println("s4 = " + s4);
		
		StringBuffer s5 = new StringBuffer(" Core Java");
		s5.replace(4, 8, "hi"); //replaces characters present at index = start to end-1 i.e. 4 to 7 with "hi"
		System.out.println("s5 = " + s5);
		
		String s6 = new String(s5);	//initializing String object by passing StringBuffer object as argument
		System.out.println("s6 = " + s6);
}
}