import java.io.*;
import java.lang.*;

class XYZ
{
	FileInputStream fin = null;
	String filename;
	int i = 0;

	public XYZ()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter a file name = ");
			filename = br.readLine();

			fin = new FileInputStream(filename);

			if(fin == null)
			{
				System.out.println("The file does not exist.");
			}
			else
			{
				System.out.println("File content is displayed below...\n");
				while((i = fin.read()) != -1)
				{
					if(Character.isUpperCase((char)i))
					{
						//System.out.print((char)i);
						System.out.print(Character.toLowerCase((char)i));
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

class fileH5
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}