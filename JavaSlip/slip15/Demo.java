package slip15;

import java.io.*;
import java.lang.*;

public class Demo
{
	int a = 0,b = 0,c = 0;
	public void accept()
	{
		try
		{
			BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter first number = ");
			a = Integer.parseInt(br.readLine());
			System.out.print("Enter second number = ");
			b = Integer.parseInt(br.readLine());
			System.out.print("Enter third number = ");
			c = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void check()
	{
		if((a>b)&&(a>c))
		{
			System.out.println("The maximum number is = "+a);
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("The maximum number is = "+b);
		}
		else if((a==b)&&(b==c))
		{
			System.out.println("All are same.");
		}
		else
		{
			System.out.println("The maximum number is = "+c);
		}
	}
}