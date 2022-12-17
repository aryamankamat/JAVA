import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class XYZ extends Frame implements ActionListener
{
	Panel p;
	Button b1,b2;

	public XYZ()
	{
		p = new Panel();
		b1 = new Button("Indira");
		b2 = new Button("College");

		add(p);
		p.add(b1);
		p.add(b2);

		setSize(500,500);
		setVisible(true);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent a)
	{
		Object ob = a.getSource();
		if(ob==b1)
		{
			System.out.println("Indira");
		}
		if(ob == b2)
		{
			System.out.println("College");
		}
	}
}
class awtevent2
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}