package interface_and_inheritance;

import java.util.Scanner;

public class Main 
{
	Scanner scan = new Scanner(System.in);
	public Main() 
	{
		String comm = null;
		String in;
		String act;
		String[] put = new String[7];
		String[] numb = new String[7];
		int i;int flag = 0;
		do
		{
			System.out.println("Simulasi kelompok kemampuan");
			System.out.println("0:Chef");
			System.out.println("1:Driver");
			System.out.println("2:Worker");
			System.out.println("3:Artist");
			System.out.println("4:Engineer");
			System.out.println("5:Teacher");
			System.out.println("Input [Info/Cook/Drive/Work/Paint] [0,1,2,3,4,5]:");
			comm = scan.nextLine();
			
			put = comm.split(" ");
			act = put[0];
			in = put[1];
			numb = in.split(",");
			
			switch(act)
			{
				case "Info":
					for (i = 0 ; i < numb.length; i++)
					{
						if (numb[i].equals("0"))
						{
							Base_Ch ch = new chef();
							ch.info();
						}
						else if (numb[i].equals("1"))
						{
							Base_Ch dr = new Driver();
							dr.info();
						}
						else if (numb[i].equals("2"))
						{
							Base_Ch wo = new Worker();
							wo.info();
						}
						else if (numb[i].equals("3"))
						{
							Base_Ch ar = new Artist();
							ar.info();
						}
						else if (numb[i].equals("4"))
						{
							Base_Ch en = new Engineer();
							en.info();
						}
						else if (numb[i].equals("5"))
						{
							Base_Ch te = new Teacher();
							te.info();
						}
					}
					break;
				case "Cook":
					for (i = 0 ; i < numb.length; i++)
					{
						if (numb[i].equals("0"))
						{
							Base_Ch ch = new chef();
							ch.Cook();
						}
						else if (numb[i].equals("1"))
						{				
							System.out.println("Karakter tidak bisa melakukan aksi");
						}
						else if (numb[i].equals("2"))
						{
							System.out.println("Karakter tidak bisa melakukan aksi");							
						}
						else if (numb[i].equals("3"))
						{
							Base_Ch ar = new Artist();
							ar.Cook();							
						}
						else if (numb[i].equals("4"))
						{
							Base_Ch en = new Engineer();
							en.Cook();
						}
						else if (numb[i].equals("5"))
						{
							System.out.println("Karakter tidak bisa melakukan aksi");
						}
					}
					break;
				case "Drive":
					for (i = 0 ; i < numb.length; i++)
					{
						if (numb[i].equals("0"))
						{						
							System.out.println("Karakter tidak bisa melakukan aksi");
						}
						else if (numb[i].equals("1"))
						{				
							Base_Ch dr = new Driver();
							dr.Drive();							
						}
						else if (numb[i].equals("2"))
						{
							System.out.println("Karakter tidak bisa melakukan aksi");							
						}
						else if (numb[i].equals("3"))
						{
							Base_Ch ar = new Artist();
							ar.Drive();							
						}
						else if (numb[i].equals("4"))
						{
							Base_Ch en = new Engineer();
							en.Drive();
						}
						else if (numb[i].equals("5"))
						{
							System.out.println("Karakter tidak bisa melakukan aksi");
						}
					}
					break;
				case "Work":
					for (i = 0 ; i < numb.length; i++)
					{
						if (numb[i].equals("0"))
						{						
							System.out.println("Karakter tidak bisa melakukan aksi");
						}	
						else if (numb[i].equals("1"))
						{				
							System.out.println("Karakter tidak bisa melakukan aksi");						
						}
						else if (numb[i].equals("2"))
						{
							Base_Ch wo = new Worker();
							wo.Work();							
						}
						else if (numb[i].equals("3"))
						{
							Base_Ch ar = new Artist();
							ar.Work();							
						}
						else if (numb[i].equals("4"))
						{
							System.out.println("Karakter tidak bisa melakukan aksi");
						}
						else if (numb[i].equals("5"))
						{
							System.out.println("Karakter tidak bisa melakukan aksi");
						}
					}
					break;
				case "Paint":
					for (i = 0 ; i < numb.length; i++)
					{
						if (numb[i].equals("0"))
						{						
							System.out.println("Karakter tidak bisa melakukan aksi");
						}
						else if (numb[i].equals("1"))
						{				
							System.out.println("Karakter tidak bisa melakukan aksi");						
						}
						else if (numb[i].equals("2"))
						{
							System.out.println("Karakter tidak bisa melakukan aksi");							
						}
						else if (numb[i].equals("3"))
						{
							Base_Ch ar = new Artist();
							ar.Paint();							
						}
						else if (numb[i].equals("4"))
						{
							System.out.println("Karakter tidak bisa melakukan aksi");
						}
						else if (numb[i].equals("5"))
						{
							System.out.println("Karakter tidak bisa melakukan aksi");
						}
					} 
					break;
			}
				
			System.out.println();
		}while(!act.equals("Info") && !act.equals("Cook") && !act.equals("Drive") && !act.equals("Work") && !act.equals("Paint") || flag == 0);
		
	}

	public static void main(String[] args) 
	{
		new Main();
	}

}
