import java.io.*;
import java.lang.*;

class slip6_q1
{
	public static void main(String args[])
	{
		int i = 0, j = 0;
		try
		{
			for(i = 0; i < 5; i++)
			{
				for(j = 0; j <= i; j++)
				{
					System.out.print((char)(65 + i));
				}
				System.out.println();
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}