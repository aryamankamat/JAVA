import java.io.*;
import java.lang.*;
import java.awt.*;

class XYZ extends Frame
{
	Panel p;
	Label l;
	public XYZ()
	{
		p = new Panel();
		l = new Label("Indira College of Commerece and Science.");

		add(p);

		p.add(l);

		setSize(500,500);
		setVisible(true);

	}
}
class awt2
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}