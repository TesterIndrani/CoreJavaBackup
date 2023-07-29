package Object_Class;

import java.util.Objects;  //imported to use hash() method

public class Book {
 String bName;
 int id;
 
public Book(String bName, int id) {
	this.bName = bName;
	this.id = id;
} 

@Override
public String toString()
{
	return "Book Name= "+bName+"\nBook Id= "+id;
}

@Override
public boolean equals(Object obj) //b2 is upcasted to Object type
{
	Book b2 = (Book)obj; 	//Downcasting 
	if(this.bName==b2.bName && this.id==b2.id)  
		//b1	 //b2
		return true;
	else
		return false;
}

@Override
public int hashCode()	//Overriding hashCode() of Object class
{
	return Objects.hash(bName,id);	
	//hash() is a static method of Objects class. So, we can call using classname. It returns integer value based on its parameters
}

}
