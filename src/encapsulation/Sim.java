package encapsulation;

public class Sim {
	private String serviceProvider;
	private long simNo;
	private double balance;
	private String color;
	
	public Sim(){}
	
	public Sim(String serviceProvider,long simNo,double balance,String color)
	{
		this.serviceProvider=serviceProvider;
		this.simNo=simNo;
		this.balance=balance;
		this.color=color;
	}
	public String getServiceProvider()
	{
		return serviceProvider;
	}
	public void setServiceProvider(String serviceProvider)
	{
		this.serviceProvider=serviceProvider;
	}
	public long getSimNo()
	{
		return simNo;
	}
	public void setSimNo(long simNo)
	{
		this.simNo=simNo;
	}
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void display()
	{
		System.out.println("Service Provider="+serviceProvider);
		System.out.println("Sim No="+simNo);
		System.out.println("Balance="+balance);
		System.out.println("Colour="+color);
	}
}
