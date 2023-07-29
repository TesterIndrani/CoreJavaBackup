package StringPrograms;

//methods to operate on String
/* Note: Since, we are using only S.o.p.l.n. statements in this program, output of substring(), concat(), replaceAll() methods 
 * are only printed and not stored in any reference variable in Heap memory. Hence, the existing string values aren't updated */

public class StringMethods {

	public static void main(String[] args)
	{
		String str1 = "Hello, Good Evening";
		String str2 = new String("Today is Saturday");
		String str3 = "Hello, Good Evening";
		String str4 = "HELLO, GOOD EVENING";
		String str5 = "      swati hello   ";
		String str6 = "";
		String str7 = " ";
		String str8 = " Today is Saturday";
		String str9 = "Good Evening";
		String str10 = "Happy Morning";
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1.equals(str3));	//will check if str1 exactly matches str3
		System.out.println(str1.equals(str4));	//will check if str1 exactly matches str4
		System.out.println(str1.equalsIgnoreCase(str4));	//will check if str1 and str4 are same ignoring case
		System.out.println(str1.length());		//will return length of the str1
		System.out.println(str2.charAt(10));	//will return character at index=10 with index from 0 to length-1
		System.out.println(str5.trim());	//removes leading and trailing spaces in the str5
		System.out.println(str3.substring(5));  //extracts substring from index=(5 till length-1) i.e. end of the string
		System.out.println(str3.substring(7,11)); //extracts substring from index=(start till end-1) i.e. 7 to 10
		System.out.println(str2.indexOf('y'));  //returns index of first occurrence of character 'y' in str2
	    System.out.println(str2.indexOf('y', 5));  //returns index of first occurrence of character 'y' in str2 by searching from index=5
		System.out.println(str3.indexOf("Good")); //returns starting index of "Good" in str3
		System.out.println(str3.indexOf("Good", 3)); //returns starting index of "Good" in str3 by searching from index=3
		System.out.println(str1.toUpperCase());	//converts the string to Uppercase
		System.out.println(str4.toLowerCase());  //converts the string to Lowercase
		System.out.println(str1.startsWith("Hello"));	//checks if str1 starts with "Hello"
		System.out.println(str1.endsWith("ing"));	//checks if str1 ends with "ing"
		System.out.println(str2.contains("is"));		//checks if str2 contains "is"
		System.out.println(str6.isEmpty());		//checks if str6 is Empty i.e. length=0
		System.out.println(str7.isEmpty());		//checks if str7 is Empty i.e. length=0
		System.out.println(str7.isBlank());		//checks if str7 is Blank i.e. either empty or has white spaces
		System.out.println(str3.concat(str8));	//concatenates str3 and str8
		System.out.println(str2.concat(". We are attending Core Java class.")); //concatenates str2 and String literal
		System.out.println(str3.replace('o', 'a'));	//replaces all occurrences of 'o' character with 'a'
		System.out.println(str3.replaceAll(str9, str10));	//replaces entire str9 string present in str3 with str10
		System.out.println(str2.replaceAll("Saturday", "Monday"));  //replaces "Saturday" with "Monday" in str2
		System.out.println(str3.replaceAll("[A-Z]", "*"));	//replaces all uppercase letters in str3 with "*"
		System.out.println(str1.replaceAll("[aeEiou]","#"));  //replaces all vowels in str1 with "#"
		
		str6 = String.valueOf(5);	//gives String representation of integer passed
		System.out.println(str1.concat(str6));	//concatenating str1 and above string returned
		
		char[] charArray = str2.toCharArray();	//converting String to character array
		for(char ch:charArray)
		{
			System.out.println(ch);
		}
		
		System.out.println(String.valueOf(charArray));	//converting character array to String

		
//Note: In compareTo(), only first character in the argument String which differs from the original string, is compared and remaining characters aren't compared  		
		String s1 = "Hii";
		String s2 = "Hii";
		String s3 = "Hi";
		String s4 = "Hiia";
		String s5 = "Hifi";
		String s6 = "Hola"; 
		System.out.println(s1.compareTo(s2));	//returns 0 because s1=s2
		System.out.println(s1.compareTo(s3));	//returns 1 because s3 doesn't differ s1 at any index. But, s1.length-s3.length=1
		System.out.println(s1.compareTo(s4));	//returns -1 because s4 doesn't differ s1 at any index. But, s1.length-s4.length=-1
		System.out.println(s1.compareTo(s5));	//returns 3 because s5 differs s1 at index=2. So, ASCII code of s1[2]-s5[2] =105-102 =3
		System.out.println(s1.compareTo(s6));	//returns -6 because s6 differs s1 at index=1. So, ASCII code of s1[1]-s6[1] =105-111 =-6
		
/* Note: String is immutable as it's declared as final. When the existing String value is updated, the value in existing reference
 *  is not updated. Instead, the updated String value is pointing to a new reference variable in String constant pool*/		
		System.out.println("s1 value = " + s1 +" & s1 hashcode= " + s1.hashCode());  //Hii & 72552
		s1 = s1.concat(s2);		
		System.out.println("s1 concatenated with s2= " + s1 + " & new object reference/hashcode= " + s1.hashCode()); //HiiHii & -2133498112 
		s1 = s1.concat(s2);		
		System.out.println("s1 concatenated with s2 again= " + s1 + " & new object reference/hashcode= " + s1.hashCode());	//HiiHiiHii & -2116135832
/* Note: The address 72552 will always hold "Hii" and is immutable. Only updated s1 object will point to new reference 
 *  We can verify this by declaring a new String object with value as "Hii" and see whether it's pointing to the address 72552 */
		String s7 = "Hii"; 		
		System.out.println("s7 value = " + s7 +" & s7 hashcode= " + s7.hashCode());  //Hii & 72552
		
	}		
}
