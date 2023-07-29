package interview;

public class PioneerInfotech 
{

	public static void main(String[] args) 
	{
		boolean cond=true;
		
		for(int i=1;i<=100;i++)
		{
		   for(int j=1;j<i;j++)
		   {
				if(i%j == 0)
				{cond=false;
				}
				else
				{cond=true;
			    }
		   
		   }
			if(cond=true)	
			System.out.println(i + " is a prime number");
	    }
	}
}
	


