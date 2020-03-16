package Sahas;
import java.sql.*;
import javax.swing.*;

public class Dbase extends MCQ{

public static void db()
{
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost/mcqdesktop2?useSSL=false","root","");
		System.out.println("Connecting To The Local DataBase ...");
	}
	catch(SQLException e1)
	{
		landb();
	}
	catch(ClassNotFoundException ex)
	{
		JOptionPane.showMessageDialog(null,"System Error.1"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
	}
}
public static void landb()
{
	ip=JOptionPane.showInputDialog(null,"Enter Your Host Ip Address","IP Input",JOptionPane.INFORMATION_MESSAGE);
	if(ip==null)
	{
		System.exit(0);
	}
	try
	{
		con=DriverManager.getConnection("jdbc:mysql://"+ip+"/mcqdesktop2?useSSL=false","remote","remote");
	}
	catch(SQLException e)
	{
		jop=5;
		jop=JOptionPane.showOptionDialog(null,"Could Not Found Any Local or LAN Database Retry ?","Choose Your Option",JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null,JOPB,JOPB[0]);
		if(jop==0)
		{
			landb();
        }
		else if(jop==1)
		{
			System.exit(0);
		}
		else if(jop==-1)
		{
			System.exit(0);
		}
	}
}
public static void main(String[] args) 
{
// TODO Auto-generated method stub
}
}
