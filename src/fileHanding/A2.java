//writing to a file
package fileHanding;

import java.io.FileWriter;
import java.io.IOException;

public class A2 {
public static void main(String[] args) {
	
	try
	{
			FileWriter obj = new FileWriter("/Users/WECE42/Abc.txt");
			obj.write("This is my first file handling program");
			obj.close();
			System.out.println("Data written successfully");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
}
