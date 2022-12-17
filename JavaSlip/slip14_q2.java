import java.io.*;
import java.lang.*;

class Demo
{
	int n = 0,ch = 0;
	int rem = 0,rev = 0,sum = 0,num = 0;

	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter a number = ");
			n = Integer.parseInt(br.readLine());

			System.out.println("*****MENU*****");
			System.out.println("1.Display the reverse of that number");
			System.out.println("2.Check whether the number is palindrome or not");
			System.out.println("3.Check whether the number is Armstrong or not");
			System.out.println("Select your choice = ");
			ch = Integer.parseInt(br.readLine());

			switch(ch)
			{
				case 1:
						System.out.println("Reverse of a number is displayed below...");
						while(n != 0)
						{
							rem = n % 10;
							rev = (rev*10)+rem;
							n = n / 10;
						}
						System.out.println("The reverse is = "+rev);
						break;

				case 3:
						num = n;
						while(n != 0)
						{
							rem = n % 10;
							sum = sum + (rem*rem*rem);
							n = n / 10;
						}
						if(num == sum)
						{
							System.out.println("The number is a Armstrong number.");
						}
						else
						{
							System.out.println("The number is not a Armstrong number.");
						}
						break;

				case 2:
						num = n;
						while(n != 0)
						{
							rem = n % 10;
							rev = (rev*10)+rem;
							n = n / 10;
						}
						if(num == rev)
						{
							System.out.println("The number is a palindrome number.");
						}
						else
						{
							System.out.println("The number is not a palindrome number.");
						}
						break;

				default:
						System.out.println("Invalid Choice.");

			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class slip14_q2
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}