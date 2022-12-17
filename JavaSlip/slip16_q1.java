import java.io.*;
import java.lang.*;

class XYZ
{
	FileInputStream fin  = null;
	String filename;
	int i = 0;
	int ch = 0;

	public XYZ()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter a file name = ");
			filename = br.readLine();

			fin = new FileInputStream(filename);

			if(fin == null)
			{
				System.out.println("The file does not exist.");
			}
			else
			{

				System.out.println("*****MENU*****");
				System.out.println("1.Display all upper case letters ");
				System.out.println("2.Display all lower case letters ");
				System.out.println("Enter your choice : ");
				ch = Integer.parseInt(br.readLine());

				switch(ch)
				{

					case 1:
							System.out.println("The Content in uppercase is displayed below....");
							while((i = fin.read()) != -1)
							{
								if(Character.isUpperCase((char)i))
								{
									System.out.print((char)i);
								}

								i++;
							}
							break;

					case 2:
							System.out.println("The Content in lowercase is displayed below....");
							while((i = fin.read()) != -1)
							{
								if(Character.isLowerCase((char)i))
								{
									System.out.print((char)i);
								}

								i++;
							}
							break;

					default:
							System.out.println("Invalid choice....");
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
class slip16_q1
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}