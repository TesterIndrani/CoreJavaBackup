package relationship;

public class Car {

private String color;

//getter
public String getColor()
{
	return color;
}

//setter
public void setColor(String color)
{
	this.color=color;
}

//HAS-A relationship with Early Instantiation
private Engine e = new Engine(1000.0);//car object gets created, car constructor loads non-static members,e=new->new object of engine type

public Engine getEngine()//engine constructor will load all the non-static members of engine type in to that engine object
{
	return e;
}
//no arg constructor
Car(){}
//parametrized constructor
Car(String color)
{
	this.color=color;
}

}
