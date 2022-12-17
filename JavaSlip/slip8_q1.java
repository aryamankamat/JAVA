import java.io.*;
import java.lang.*;

class Base
{
	int bid = 0;
}
class Derived extends Base
{
	int price = 0;
	String bname = null;

	public void accept()
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.print("Enter the Book Id = ");
			bid = Integer.parseInt(br.readLine());
			System.out.print("Enter the Book Name = ");
			bname = br.readLine();
			System.out.print("Enter the Book Price = ");
			price = Integer.parseInt(br.readLine());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void display()
	{
		System.out.println();
		System.out.println("*****BOOK SUMMURY*****");
		System.out.println("BOOKID  BOOKNAME  PRICE");
		System.out.println(bid+"    "+bname+"    "+price);
	}
}
class slip8_q1
{
	public static void main(String args[])
	{
		Derived d1 = new Derived();
		d1.accept();
		d1.display();
	}
}