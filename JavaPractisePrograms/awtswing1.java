import java.io.*;
import java.lang.*;
import java.awt.*;
import javax.swing.*;

class XYZ extends JFrame
{
	JPanel p;
	JButton b;

	public XYZ()
	{
		p = new JPanel();
		b = new JButton("Click me");

		add(p);
		p.add(b);

		setSize(500,500);
		setVisible(true);
	}

}
class awtswing1
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}