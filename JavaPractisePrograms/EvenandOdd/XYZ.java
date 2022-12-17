package EvenandOdd;

import java.io.*;
import java.lang.*;


public class XYZ
{
	int a = 0;
	public void accept()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter a value for a = ");
			a = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void display()
	{
		if(a % 2 == 0)
		{
			System.out.println(a+" is a even number.");
		}
		else
		{
			System.out.println(a+" is a odd number.");
		}
	}
}