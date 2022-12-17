import java.io.*;
import java.lang.*;
import java.awt.*;

class XYZ extends Frame
{
	Panel p;
	TextField tf;

	public XYZ()
	{
		p = new Panel();
		tf = new TextField(30);

		add(p);

		p.add(tf);

		setSize(500,500);
		setVisible(true);
	}
}
class awt3
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}