import java.io.*;
import java.lang.*;

class slip2_q2
{
	public static void main(String args[])
	{
		int s = 0, area = 0, peri = 0,ch = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter side of a square = ");
			s = Integer.parseInt(br.readLine());
			System.out.println("***MENU***");
			System.out.println("1.Display area of the square.");
			System.out.println("2.Display perimeter of the square.");
			System.out.print("Select your choice : ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						area = s * s;
						System.out.println("Area of square is = "+area);
						break;
				case 2:
						peri = 4 * s;
						System.out.println("Perimeter of square is = "+peri);
						break;
				default:
						System.out.println("Invalid choice...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}