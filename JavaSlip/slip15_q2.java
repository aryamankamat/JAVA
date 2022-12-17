import java.io.*;
import java.lang.*;

class XYZ
{
	FileInputStream fin = null;
	int i = 0;
	String filename;

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
				System.out.println("File does not Exist.");
			}
			else
			{
				System.out.println("The content of file is displayed below...\n");
				while((i = fin.read()) != -1)
				{
					System.out.print((char)i);

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
class slip15_q2
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}