package arrayListPrograms;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator {

@Override
public int compare(Object o1, Object o2)
{
	Emp i1 = (Emp)o1;
	Emp i2 = (Emp)o2;
	if(i1.salary==i2.salary)
		return 0;
	else if(i1.salary>i2.salary)
		return 1;
	else
		return -1;
}
}
