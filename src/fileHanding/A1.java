package fileHanding;

import java.io.File;
import java.io.IOException;

public class A1 {
public static void main(String[] args) {
	
	File obj = new File("/Users/WECE42/Abc.txt");
	try
	{
		if(obj.createNewFile())
		System.out.println("File created "+obj.getName());
		else
		System.out.println("File already exists");
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}

}
