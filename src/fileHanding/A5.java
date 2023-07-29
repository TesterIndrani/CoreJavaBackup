//deleting a file
package fileHanding;

import java.io.File;

public class A5 {
public static void main(String[] args) {
	
	File obj = new File("/Users/WECE42/Abc.txt");
	if(obj.delete())		//returns boolean
		System.out.println("File "+obj.getName()+" deleted");
	else
		System.out.println("File is not deleted");
}
}
