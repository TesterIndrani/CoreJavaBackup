//Sorting multiple attributes of ArrayList using Comparator
package arrayListPrograms;

public class Emp implements Comparable {
	
int eid;
String name;
double salary;

public Emp(int eid, String name, double salary) {
	this.eid = eid;
	this.name = name;
	this.salary = salary;
}

@Override

public String toString()
{
	return "Emp id="+eid+"\n"+"Emp name="+name+"\n"+"Emp salary="+salary;
}

@Override
public int compareTo(Object o)
{
	//Emp temp = (Emp)o;
	if(this.eid==((Emp)o).eid)
		return 0;
	else if(this.eid>((Emp)o).eid)
		return 1;
	else
		return -1;
}

}
