import java.io.*;
import java.lang.*;
import java.awt.*;


class XYZ extends Frame
{
	Panel p;
	Label l;
	Checkbox c1,c2;

	public XYZ()
	{
		p = new Panel();
		l = new Label("Select your Language : ");
		c1 = new Checkbox("Cpp");
		c2 = new Checkbox("Java");

		add(p);

		p.add(l);

		p.add(c1);
		p.add(c2);

		setSize(500,500);
		setVisible(true);
	}
}
class awt5
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}