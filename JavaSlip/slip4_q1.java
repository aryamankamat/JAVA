/* Write a java program to accept any number from user and print the
multiplication table of that number on the cmd prompt.  */
import java.io.*;
import java.lang.*;

class slip4_q1
{
	public static void main(String args[])
	{
		int n = 0, i = 0;

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the number = ");
			n = Integer.parseInt(br.readLine());

			for(i = 1;i<=10;i++)
			{
				System.out.println(n+" X "+i+" = "+(n*i));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}