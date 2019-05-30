package interface_and_inheritance;

public class Driver extends Base_Ch implements IDriver
{

	public Driver() 
	{
		name = "Driver";
		desc = "Orang yang menyetir kendaraan";
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
