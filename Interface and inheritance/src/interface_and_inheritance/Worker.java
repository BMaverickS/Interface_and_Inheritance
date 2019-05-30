package interface_and_inheritance;

public class Worker extends Base_Ch implements IWorker
{

	public Worker() 
	{
		name = "worker";
		desc = "Orang yang bekerja sesuai bidangnya";
	}

	@Override
	public void Work() 
	{
		System.out.println(name + " bekerja");
	}
	
	public void info()
	{
		System.out.println(name + ", " + desc);
	}

}
