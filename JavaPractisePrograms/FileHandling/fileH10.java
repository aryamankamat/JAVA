import java.io.*;
import java.lang.*;

class XYZ
{
	FileInputStream fin  = null;
	FileOutputStream fout = null;
	String filename1,filename2;
	int i = 0;

	public XYZ()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter a first file name = ");
			filename1 = br.readLine();
			System.out.print("Enter a Second file name = ");
			filename2 = br.readLine();

			fin = new FileInputStream(filename1);
			fout = new FileOutputStream(filename2);

			if(fin == null || fout == null)
			{
				System.out.println("The file does not exist.");
			}
			else
			{
				while((i = fin.read()) != -1)
				{
					if(Character.isUpperCase((char)i))
					{
						fout.write(Character.toLowerCase((char)i));
					}
					else if(Character.isLowerCase((char)i))
					{
						fout.write(Character.toUpperCase((char)i));
					}
					else if(Character.isDigit((char)i))
					{
						fout.write('*');
					}

					i++;
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
class fileH10
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}