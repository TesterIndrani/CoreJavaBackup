//reading from a file
package fileHanding;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class A3 {
public static void main(String[] args) {
	
	try
	{
		File obj = new File("/Users/WECE42/Abc.txt");
		Scanner sc = new Scanner(obj);
		while(sc.hasNextLine())
		{
			String data = sc.nextLine();
			System.out.println(data);
		}
		sc.close();
	}
	catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
}
}
