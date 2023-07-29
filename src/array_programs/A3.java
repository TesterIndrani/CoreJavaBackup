package array_programs;

//String array

public class A3 {
	public static void main(String[] args) {
		String str[] = {"abcd","efgh","ijkl","mnop"};
		System.out.println("The String data are:");
		for(String ele:str) //0th->abcd, 1st->efgh, 2nd->ijkl, 3rd->mnop. Also, ele is not counter variable, instead it is datatype of the variable 
		{
			System.out.println(ele); 
		}
	}

}
