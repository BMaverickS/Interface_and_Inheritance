package interface_and_inheritance;

public class Artist extends Base_Ch implements IChef, IDriver, IWorker, IArtist
{

	public Artist() 
	{
		name = "Artist";
		desc = "Orang yang menciptakan karya seni";
	}

	@Override
	public void Paint() 
	{
		System.out.println(name + " melukis");
	}

	@Override
	public void Work() 
	{
		System.out.println(name + " bekerja");		
	}

	@Override
	public void Drive() 
	{		
		System.out.println(name + " meneyetir");
	}

	@Override
	public void Cook() 
	{		
		System.out.println(name + " memasak");
	}
	
	public void info()
	{
		System.out.println(name + ", " + desc);
	}

}
