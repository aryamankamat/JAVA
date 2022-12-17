import java.io.*;
import java.lang.*;

class fileH11
{
	public static void main(String args[])
	{
		File f;
		int i = 0;
		int ans = 0;

		for(i = 0;i < args.length;i++)
		{
			f = new File(args[i]);

			if(f.isFile())
			{
				if(args[i].endsWith(".html"))
				{
					f.delete();
				}
				else
				{
					System.out.println("File Name is "+ f.getName() + " and It's size is = " + f.length() + " bytes.");
				}
			}
		}
	}
}