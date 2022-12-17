import java.io.*;
import java.lang.*;

class ABC
{
	int bid;

	public ABC()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the book ID = ");
			bid = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void display()
	{
		System.out.println("Book ID is = "+ bid);
	}
}
class XYZ extends ABC
{
	String bname,bauthor;
	public XYZ()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the Book Name = ");
			bname = br.readLine();
			System.out.println("Enter the Book Author = ");
			bauthor = br.readLine();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void display()
	{
		super.display(); //Reference Variable which refers to the immediate parent class method
		System.out.println("Book Name is = "+ bname);
		System.out.println("Book Author is = "+ bauthor);
	}
}
class Inheritance1
{
	public static void main(String args[])
	{
		XYZ x1 = new XYZ();
		x1.display();
	}
}