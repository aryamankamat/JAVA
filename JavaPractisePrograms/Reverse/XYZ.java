package Reverse;

import java.io.*;
import java.lang.*;

public class XYZ
{
	int num = 0, rem = 0,rev = 0;
	public void accept()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter a number = ");
			num = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void display()
	{
		while(num != 0)
		{
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		System.out.println("The reverse of a number is = "+rev);
	}
}