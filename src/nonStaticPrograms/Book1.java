package nonStaticPrograms;

public class Book1 {
	//non static variables
	String title;
	int noOfPages;
	String author;
	double price;	
	
	{
		System.out.println("Non-static initializers");
	}
	
	public Book1()//no argument constructor
	{
		System.out.println("No argument constructor");
	}
	
	//parameterized constructor
	public Book1(String title)
	{
		this.title = title;
	}
	
	public Book1(String title,int noOfPages)
	{
		this(title);
		this.noOfPages = noOfPages;
	}

	public Book1(String title,int noOfPages,String author)
	{
		this(title,noOfPages);
		this.author = author;
	}
	
	public Book1(String title,int noOfPages,String author,double price)
	{
		this(title,noOfPages,author);
		this.price = price;
	}

	
	//non static method
	public void display()
	{
		System.out.println(title);
		System.out.println(noOfPages);
		System.out.println(author);
		System.out.println(price);

	}
}
