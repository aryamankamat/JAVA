import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;


class XYZ extends Frame implements ActionListener
{
	Panel p;
	Button b;

	public XYZ()
	{
		p = new Panel();
		b = new Button("Click Me");

		add(p);
		p.add(b);

		setSize(500,500);
		setVisible(true);

		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent a)
	{
		Object ob = a.getSource();
		if(ob==b)
		{
			System.out.println("ICCS");
		}
	}
}
class awtevent1
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}