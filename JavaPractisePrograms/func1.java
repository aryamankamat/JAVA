import java.io.*;
import java.lang.*;

class func1
{
	public static void rectangle(int l , int b)
	{
		System.out.println("The area of rectangle is = "+(l*b));
		System.out.println("The perimeter of rectangle is = "+ 2*(l+b));
	}

	public static void main(String args[])
	{
		int l = 0, b = 0;

		try
		{
			BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter the length of rectangle = ");
			l = Integer.parseInt(br.readLine());
			System.out.println("Enter the breath of rectangle = ");
			b = Integer.parseInt(br.readLine());

			rectangle(l,b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}