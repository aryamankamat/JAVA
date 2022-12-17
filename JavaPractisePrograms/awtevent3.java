import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class XYZ extends Frame implements ActionListener
{
	Panel p;
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b1,b2;
	int a = 0,b = 0,ans = 0;

	public XYZ()
	{
		try
		{
			p = new Panel();

			l1 = new Label("Enter First Number : ");
			l2 = new Label("Enter Second Number : ");
			l3 = new Label("Result : ");

			t1 = new TextField(10);
			t2 = new TextField(10);
			t3 = new TextField(10);

			b1 = new Button("Add");
			b2 = new Button("Reset");

			add(p);

			p.add(l1);
			p.add(t1);
			p.add(l2);
			p.add(t2);
			p.add(l3);
			p.add(t3);

			p.add(b1);
			p.add(b2);

			setSize(500,500);
			setVisible(true);

			b1.addActionListener(this);
			b2.addActionListener(this);
		}
		catch(Exception e)
		{
				System.out.println(e);
		}
	}

	public void actionPerformed(ActionEvent ae)
	{
		Object ob = ae.getSource();

		if(ob == b1)
		{
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());

			ans = a + b;

			t3.setText(" "+ans);
		}
		else
		{
			if(ob == b2)
			{
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");

				t1.requestFocus();
			}
		}

	}
}
class awtevent3
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}