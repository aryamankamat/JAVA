import java.io.*;
import java.lang.*;

interface Vehical
{
	public void getWheel();
}
class Demo implements Vehical
{
	public void getWheel()
	{
		System.out.println("Two wheeler has 2 Wheels");
		System.out.println("Auto has 3 Wheels");
		System.out.println("Car has 3 Wheels");
	}
}
class slip10_q2
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		d1.getWheel();
	}
}