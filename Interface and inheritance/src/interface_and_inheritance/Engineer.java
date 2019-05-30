package interface_and_inheritance;

public class Engineer extends Base_Ch implements IDriver, IChef
{

	public Engineer() 
	{
		name = "Engineer";
		desc = "Orang yang mengimplementasikan ilmu pengetahuan";
	}

	@Override
	public void Cook() 
	{
		System.out.println(name + " memasak");
	}

	@Override
	public void Drive() 
	{
		System.out.println(name + " menyetir");
	}
	
	public void info()
	{
		System.out.println(name + ", " + desc);
	}

}
