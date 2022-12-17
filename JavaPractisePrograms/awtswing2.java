import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class XYZ extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JPanel p;
	JTextField t1,t2,t3;
	JButton b1,b2;
	int a = 0,b = 0,ans = 0;

	public XYZ()
	{
		try
		{
			p = new JPanel();

			l1 = new JLabel("Enter first number : ");
			l2 = new JLabel("Enter second number : ");
			l3 = new JLabel("Result : ");

			t1 = new JTextField(10);
			t2 = new JTextField(10);
			t3 = new JTextField(10);

			b1 = new JButton("Add");
			b1 = new JButton("Rest");

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

			JOptionPane.showMessageDialog(null,"The Addition is "+ans);
		}
		else
		{
			if(ob == b2)
			{
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");

				t1.requestFocus();

				JOptionPane.showMessageDialog(null,"All fields are empty");
			}
		}
	}
}
class awtswing2
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}