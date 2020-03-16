package Sahas;
import java.sql.*;
import javax.swing.*;

public class Account extends MCQ{
	
	public static void cacc()
	{
		try
		{
			con.createStatement().execute("insert into accounts(No,UName,Pass)values('"+ac+"','"+t10.getText()+"','"+p3.getText()+"')");
			c13.setSelected(false);
			c14.setSelected(false);
			t10.setText("");
			p3.setText("");
			p4.setText("");
			ac++;
			f6.dispose();
			Frames.slog(f5);
		}
		catch(SQLException ex)
		{
			ac++;
			cacc();
		}
	}
	public static void ssign()
	{
		try
		{
			ResultSet r=con.createStatement().executeQuery("SELECT * FROM accounts where No='"+(log)+"'");
			if(r.next())
			{
				sign=1;
				sun=r.getString("UName");
				spw=r.getString("Pass");
				if((sun.equals(t8.getText()))&&(spw.equals(p2.getText())))
				{
					l18.setText("Welcome "+sun);
					f7.setTitle("Welcome "+sun);
					f5.dispose();
					Stu.srecent();
					Frames.readres(f7);
				}
				else
				{
					log++;
					sign=0;
					ssign();
				}
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	}
}
