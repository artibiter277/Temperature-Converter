/*
Temperature Converter
---------------------
umm best of luck understanding this code im noob.
I just started coding so ya best of luck.
*/
import java.util.Scanner;
public class TemperatureConverter 
{
	public static void main(String [] args)
	{
		Scanner In = new Scanner(System.in);
		System.out.println("You wnat to convert N to N ");
		System.out.println("(1)Celsius\n(2)Fahrenheit\n(3)Kelvin\n");
		int Main = In.nextInt();
		
		if (Main == 1)
		{
			System.out.println("(1)Fahrenheit\n(2)Kelvin\n");
			int MC = In.nextInt();
			if(MC == 1)
			{
				System.out.println("Enter degress");
				double MCF = In.nextDouble();
				System.out.println(MCF * 1.8 + 32);
			}else if(MC == 2)
			{
				System.out.println("Enter degrees");
				double MCK = In.nextDouble();
				System.out.println(MCK + 273.15);
			}
			
		}else if(Main == 2)
		{
			System.out.println("(1)Celsius\n(2)Kelvin\n");
			int MF = In.nextInt();
			if(MF == 1)
			{
				System.out.println("Enter degrees");
				double MFC = In.nextDouble();
				System.out.println((MFC -32) * 0.55555555555);
				
			}else if(MF == 2)
			{
				System.out.println("Enter degrees");
				double MFK = In.nextDouble();
				System.out.println((MFK -32) * 0.55555555555 + 273.15);
			}
			
		}else if(Main == 3)
		{
			System.out.println("(1)Celsius\n(2)Fahrenheit\n");
			int MK = In.nextInt();
			if(MK == 1)
			{
				System.out.println("Enter degrees");
				double MKC = In.nextDouble();
				System.out.println(MKC - 273.15);
			}else if(MK == 2)
			{
				System.out.println("Enter degrees");
				double MKF = In.nextDouble();
				System.out.println((MKF - 273.15) * 1.8 + 32);
			}
		}else 
		{
			System.out.println("Invalid.");
		}
	}
}