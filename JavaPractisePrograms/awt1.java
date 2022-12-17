import java.io.*;
import java.lang.*;
import java.awt.*;

class XYZ extends Frame
{
	Panel p;
	Button b1 , b2;

	public XYZ()
	{
		try
		{
			p = new Panel();
					b1 = new Button("Indira");
					b2 = new Button("College");

					add(p);

					p.add(b1);
					p.add(b2);

			setSize(500,500);
			setVisible(true);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class awt1
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}