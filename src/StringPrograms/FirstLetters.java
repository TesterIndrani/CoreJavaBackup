package StringPrograms;

import java.util.Scanner;

public class FirstLetters {

	public static void main(String[] args) {

		String str1 = " ";
		String str2 = "Core Java Programming";
		str1 = str1.concat(str2);
		
		System.out.println("Updated String is= "+str1);

		for(int i=0; i<str1.length(); i++)
		{
			char ch= str1.charAt(i);
			if(ch==' ')
				System.out.print(str1.charAt(i+1)+" ");
			
		}

	}

}
