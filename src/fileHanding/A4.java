package fileHanding;

import java.io.File;

public class A4 {
public static void main(String[] args) {
	
	File obj = new File("/Users/WECE42/Abc.txt");
	{
		if(obj.exists())
		{
			System.out.println("Absolute Path="+obj.getAbsolutePath());
			System.out.println("File name="+obj.getName());
			System.out.println("Readable="+obj.canRead());
			System.out.println("Writable="+obj.canWrite());
			System.out.println("File size="+obj.length());
		}
		else
			System.out.println("File does not exist");
	}
}
}
