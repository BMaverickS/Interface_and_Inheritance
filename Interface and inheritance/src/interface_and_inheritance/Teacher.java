package interface_and_inheritance;

public class Teacher extends Base_Ch
{

	public Teacher() 
	{
		name = "Teacher";
		desc = "Orang yang mengajar murid di sekolah";
	}
	
	public void info()
	{
		System.out.println(name + ", " + desc);
	}

}
