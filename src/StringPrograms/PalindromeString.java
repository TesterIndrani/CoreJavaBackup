package StringPrograms;
//Reversing String without using StringBuffer and StringBuilder

public class PalindromeString
{
		public static void main(String[] args)
{
		String str1 = "Core Java";
		System.out.println("Original String="+str1);
		String str2="";

		for(int i=str1.length()-1; i>=0; i--)
		{
			str2 = str2+str1.charAt(i);
		}
		System.out.println("Reverse String="+str2);
		

		if(str1.equalsIgnoreCase(str2))
			System.out.println("Palindrome String");
		else
			System.out.println("Not Palindrome String");


}
}