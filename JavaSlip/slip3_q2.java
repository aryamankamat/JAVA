import java.io.*;
import java.lang.*;

class Demo
{
	int l = 0, b = 0,ch = 0;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the lenght of rectangle = ");
			l = Integer.parseInt(br.readLine());
			System.out.println("Enter the breath of rectangle = ");
			b = Integer.parseInt(br.readLine());

			System.out.println("*****MENU*****");
			System.out.println("1.Display the area of rectangle.");
			System.out.println("2.Display the perimeter of rectangle.");
			System.out.print("Select your choice = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("Area of rectangle is = "+(l*b));
						break;
				case 2:
						System.out.println("Perimeter of rectangle is = "+(2*(l+b)));
						break;
				default:
						System.out.println("Invalid choice....");
						break;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class slip3_q2
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
	}
}