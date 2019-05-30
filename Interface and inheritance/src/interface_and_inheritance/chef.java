package interface_and_inheritance;

public class chef extends Base_Ch implements IChef
{

	public chef() 
	{
		name = "chef";
		desc = "Orang yang memasak di restoran untuk pelanggan";
	}

	@Override
	public void Cook() 
	{
		System.out.println(name + " memasak");
	}

	public void info() 
	{
		System.out.println(name + " " + desc);
	}
	
	

}
