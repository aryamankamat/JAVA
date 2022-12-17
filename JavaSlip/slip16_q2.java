import java.io.*;
import java.lang.*;

class Demo
{
	int i = 0; String n;


	public Demo()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter a number = ");
			n = br.readLine();

			char ch[] = new char[10]; //character array

			n.getChars(0,5,ch,0);  //starting index,ending index,array name,position inside an array.

			for(i = 0; i < 10;i++)
			{
				//ch = n[i];

				switch(ch[i])
				{
					// For digit 0
					    case '0':
					        		System.out.print("Zero ");
					        		break;

					    // For digit 1
					    case '1':
					       			System.out.print("One ");
					        		break;

					    // For digit 2
					    case '2':
					       			System.out.print("Two ");
					        		break;

					    // For digit 3
					    case '3':
					       			System.out.print("Three ");
					        		break;

					    // For digit 4
					    case '4':
					       			System.out.print("Four ");
					        		break;

					    // For digit 5
					    case '5':
					        		System.out.print("Five ");
					        		break;

					    // For digit 6
					    case '6':
					       		 	System.out.print("Six ");
					        		break;

					    // For digit 7
					    case '7':
					        		System.out.print("seven ");
					        		break;

					    // For digit 8
					    case '8':
					        		System.out.print("eight ");
					        		break;

					    // For digit 9
					    case '9':
					        		System.out.print("Nine ");
       								break;
				}
			}

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class slip16_q2
{
	public static void main(String args[])
	{
		Demo d = new Demo();
	}
}