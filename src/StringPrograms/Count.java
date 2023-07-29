package StringPrograms;

import java.util.Scanner;

public class Count
{
		public static void main(String[] args)
{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String str = sc.nextLine();
		int wCount=0, lCount=0;

		for(int i=0; i<str.length(); i++)
		{
			char ch= str.charAt(i);
			if(ch==' ')
				wCount++;
			else
				lCount++;
		}
		wCount++;	//Number of words in a sentence= Number of spaces + 1
		System.out.println("Number of words="+wCount);
		System.out.println("Number of letters="+lCount);
}
}