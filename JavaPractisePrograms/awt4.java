import java.io.*;
import java.lang.*;
import java.awt.*;

class XYZ extends Frame
{
	Panel p;
	TextArea ta;

	public XYZ()
	{
		p = new Panel();
		ta = new TextArea(10,10);

		add(p);

		p.add(ta);

		setSize(500,500);
		setVisible(true);
	}
}
class awt4
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}