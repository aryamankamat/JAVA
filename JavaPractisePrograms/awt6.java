import java.io.*;
import java.lang.*;
import java.awt.*;


class XYZ extends Frame
{
	Panel p;
	Label l;
	Checkbox c1,c2;
	CheckboxGroup cg;

	public XYZ()
	{
		p = new Panel();
		l = new Label("Select your Gender : ");

		cg = new CheckboxGroup();
		c1 = new Checkbox("Male",cg,true);
		c2 = new Checkbox("Female",cg,false);

		add(p);

		p.add(l);

		p.add(c1);
		p.add(c2);

		setSize(500,500);
		setVisible(true);
	}
}
class awt6
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}