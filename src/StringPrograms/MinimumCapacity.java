package StringPrograms;
//capacity function returns the maximum no of characters a String can store in StringBuffer or StringBuilder

public class MinimumCapacity {

	public static void main(String[] args) {

	//demonstrates minimum capacity in case of empty StringBuffer and append() method
	StringBuffer s1 = new StringBuffer(); //constructs empty String Buffer and default capacity of 16
	System.out.println("s1= "+s1+", Initial capacity of s1= "+s1.capacity()); //16
	s1.append("Core Java");	//appends String argument passed
	System.out.println("s1= "+s1+", Current capacity of s1= "+s1.capacity()); 
	//16...since s1 argument length<capacity(16)
	s1.append(" is favourite language");
	System.out.println("s1= "+s1+", Current capacity of s1= "+s1.capacity()); 
	//34...since s1 argument length>capacity(16)...so new capacity=((old capacity*2)+2) i.e. (16*2)+2=34
	s1.append(" since now");
	System.out.println("s1= "+s1+", Current capacity of s1= "+s1.capacity()); 
	//70...since s1 argument length>capacity(34)...so new capacity=((old capacity*2)+2) i.e. (34*2)+2=70

	
	//demonstrates minimum capacity in case of constructor with argument
	StringBuffer s2 = new StringBuffer("Core Java"); //constructs String Buffer with initial capacity as 16+9=25
	System.out.println("s2= "+s2+", Current capacity of s2= "+s2.capacity()); //25
	
	
	//demonstrates minimum capacity in case of ensureCapacity() method
	StringBuffer s3 = new StringBuffer("Hi");
	System.out.println("s3= "+s3+", Current capacity of s3= "+s3.capacity()); //16+2=18
	s3.ensureCapacity(40);   //40>(18*2)+2 i.e. 38...so the larger value is assigned as capacity
	System.out.println("s3= "+s3+", Current capacity of s3= "+s3.capacity()); //40
	s3.ensureCapacity(45);   //45<(40*2)+2 i.e. 82...so the larger value is assigned as capacity
	System.out.println("s3= "+s3+", Current capacity of s3= "+s3.capacity()); //82

	}

}
