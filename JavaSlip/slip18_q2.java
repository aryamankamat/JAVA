import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class XYZ extends Frame implements ActionListener
{
	Label l1,l2;
	Panel p;
	TextField t1,t2;
	Button b1,b2;
	String str1,str2;

	public XYZ()
	{
		p = new Panel();

		l1 = new Label("Enter username : ");
		l2 = new Label("Enter Password : ");

		t1 = new TextField(10);
		t2 = new TextField(10);

		b1 = new Button("Login");
		b2 = new Button("Reset");

		add(p);

		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(b1);
		p.add(b2);

		setSize(500,500);
		setVisible(true);

		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob = ae.getSource();

		if(ob == b1)
		{
			str1 = t1.getText();
			str2 = t2.getText();

			if(str1.equals(str2))
			{
				System.out.println("Welcome " + str1);
			}
			else
			{
				System.out.println("Login Failed");
			}
		}
		else
		{
			if(ob == b2)
			{
				t1.setText(" ");
				t2.setText(" ");
				t1.requestFocus();
			}
		}
	}
}
class slip18_q2
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}