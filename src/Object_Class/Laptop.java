package Object_Class;
import java.util.Objects;  

public class Laptop {

	private int ram;
	private int hardDisk;
	private String processor;
	
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHardDisk() {
		return hardDisk;
	}
	public void setHardDisk(int hardDisk) {
		this.hardDisk = hardDisk;
	}
	public String getProcessor() {
		return processor;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	
	public Laptop(int ram) 
	{
		this.ram = ram;
	}	
		
	public Laptop(int ram, int hardDisk)
	{
			this(ram);
			this.hardDisk = hardDisk;
	}
	
	public Laptop(int ram, int hardDisk, String processor) 
	{
		this(ram,hardDisk);
		this.processor = processor;
	}
	
@Override
public String toString()
{
	return "Ram= "+ram+"GB\nHard Disk= "+hardDisk+"TB\nProcessor= "+processor;
}

@Override
public boolean equals(Object obj)
{
	Laptop l2 = (Laptop)obj;
	if(this.ram==l2.ram && this.hardDisk==l2.hardDisk && this.processor==l2.processor)  
		//l1	 //l2
		return true;
	else
		return false;
}

@Override
public int hashCode()
{
	return Objects.hash(ram,hardDisk,processor);
	
}

}
