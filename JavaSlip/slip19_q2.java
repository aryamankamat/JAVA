import java.io.*;
import java.lang.*;
import java.awt.*;
import java.awt.event.*;

class XYZ extends Frame
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Panel p;
	int empno = 0, empsal = 0;
	String empname;

	public XYZ()
	{
		p = new Panel();

		l1 = new Label("Employe ID : ");
		l2 = new Label("Employee Name : ");
		l3 = new Label("Employee Salary : ");

		t1 = new TextField(10);
		t2 = new TextField(10);
		t3 = new TextField(10);

		add(p);

		p.add(l1);
		p.add(t1);

		p.add(l2);
		p.add(t2);

		p.add(l3);
		p.add(t3);

		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter Employee Number = ");
			empno = Integer.parseInt(br.readLine());
			t1.setText(" "+empno);
			System.out.println("Enter Name Number = ");
			empname = br.readLine();
			t2.setText(" "+empname);
			System.out.println("Enter Employee Salary = ");
			empsal = Integer.parseInt(br.readLine());
			t3.setText(" "+empsal);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

		setSize(500,500);
		setVisible(true);
	}
}
class slip19_q2
{
	public static void main(String args[])
	{
		XYZ x = new XYZ();
	}
}