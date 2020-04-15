package Sahas;
import java.awt.Image;
import java.io.*;
import java.sql.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Teach extends MCQ{
	
	public static void aadd()
	{
		if(answ==1)
		{
		try
		{
			con.createStatement().execute("insert into answers(No,ans)values('"+((ses*100000)+an)+"',1)");
			c1.setSelected(false);
			l44.setIcon(null);
			b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Image2.png")));
			b23.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Image.png")));
			b9.setEnabled(false);
			b9.setVisible(false);
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			answ=0;
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		}
		else if(answ==2)
		{
		try
		{
			con.createStatement().execute("insert into answers(No,ans)values('"+((ses*100000)+an)+"',2)");
			c2.setSelected(false);
			l44.setIcon(null);
			b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Image2.png")));
			b23.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Image.png")));
			b9.setEnabled(false);
			b9.setVisible(false);
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			answ=0;
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		}
		else if(answ==3)
		{
		try
		{
			con.createStatement().execute("insert into answers(No,ans)values('"+((ses*100000)+an)+"',3)");
			c3.setSelected(false);
			l44.setIcon(null);
			b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Image2.png")));
			b23.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Image.png")));
			b9.setEnabled(false);
			b9.setVisible(false);
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			answ=0;
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		}
		else if(answ==4)
		{
		try
		{
			con.createStatement().execute("insert into answers(No,ans)values('"+((ses*100000)+an)+"',4)");
			c4.setSelected(false);
			l44.setIcon(null);
			b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Image2.png")));
			b23.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Image.png")));
			b9.setEnabled(false);
			b9.setVisible(false);
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			answ=0;
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		}
		else if(answ==5)
		{
		try
		{
			con.createStatement().execute("insert into answers(No,ans)values('"+((ses*100000)+an)+"',5)");
			c5.setSelected(false);
			l44.setIcon(null);
			b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Image2.png")));
			b23.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Image.png")));
			b9.setEnabled(false);
			b9.setVisible(false);
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			answ=0;
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
}
public static void qadd()
{
	if((answ==1)||(answ==2)||(answ==3)||(answ==4)||(answ==5))
	{
		if(path1.equals(""))
		{
			try
			{
				System.out.println(((ses*100000)+an));
				con.createStatement().execute("insert into questions(No,Name,Sess,MCQ,One,Two,Three,Four,Five,RNo,RsNo)values('"+((ses*100000)+an)+"','"+name2+"','"+ses+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+((ses*10000)+an)+"','"+((ses*10000)+an)+"')");
				l29.setText((an+1)+". ");
			}
			catch(SQLException ex)
			{
				an++;
				qadd();
			}
		}
		else
		{
			if((answ>0)&&(answ<6))
			{
				
				try
				{
					 sta=con.prepareStatement("insert into questions(No,Name,Sess,MCQ,IMG,One,Two,Three,Four,Five,RNo,RsNo) values('"+((ses*100000)+an)+"','"+name2+"','"+ses+"','"+t2.getText()+"',?,'"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"','"+((ses*10000)+an)+"','"+((ses*10000)+an)+"')");
					 fist=new FileInputStream(new File(path1));
					 sta.setBinaryStream(1,fist);
					 sta.execute();
					 path1="";
					 l29.setText((an+1)+". ");
				}
				catch(SQLException ex)
				{
					an++;
					qadd();
				}
				catch(FileNotFoundException ex1)
				{
					JOptionPane.showMessageDialog(null,ex1.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
				}
			
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Please Mark Correct Answer","ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	else
	{
		JOptionPane.showMessageDialog(null,"Please Select Correct Answer","Warning",JOptionPane.WARNING_MESSAGE);
	}
}
	public static void qnew()
	{
		try
		{
			ResultSet r=con.createStatement().executeQuery("SELECT MAX(Sess) FROM questions");
			if(r.next())
			{
				sesdb=r.getInt(1);
				ses=sesdb+1;
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void sequ()
	{
		try
		{
			ResultSet r=con.createStatement().executeQuery("SELECT * FROM questions where No='"+((ses*100000)+seno)+"'");
			if(r.next())
			{
				t2.setText(r.getString("MCQ"));
				t3.setText(r.getString("One"));
				t4.setText(r.getString("Two"));
				t5.setText(r.getString("Three"));
				t6.setText(r.getString("Four"));
				t7.setText(r.getString("Five"));
				l29.setText((seno+1)+". ");
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		try
		{
			ResultSet r=con.createStatement().executeQuery("SELECT * FROM answers where No='"+((ses*100000)+seno)+"'");
			if(r.next())
			{
				sean=r.getInt("ans");
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		if(sean==1)
		{
			c1.setSelected(true);
		}
		else if(sean==2)
		{
			c2.setSelected(true);
		}
		else if(sean==3)
		{
			c3.setSelected(true);
		}
		else if(sean==4)
		{
			c4.setSelected(true);
		}
		else if(sean==5)
		{
			c5.setSelected(true);
		}
		try
		{
	    	fil=new File("C:\\Users\\Public\\Pictures\\mcqimg.jpg");
	    	fos=new FileOutputStream(fil);
	    	ResultSet r=con.createStatement().executeQuery("SELECT * FROM questions where No='"+((ses*100000)+seno)+"'");
	    	if(r.next())
	    	{
	    		blo=r.getBlob("IMG");
	    		b=blo.getBytes(1,(int)blo.length());
	    		fos.write(b);
	    	}
	    	try
	    	{
	    		nimg=0;
	    		buf1=ImageIO.read(new File("C:\\Users\\Public\\Pictures\\mcqimg.jpg"));
	    		rimg=buf1.getScaledInstance(175,175,Image.SCALE_SMOOTH);
	    		l44.setIcon(new ImageIcon(rimg));
	    		b23.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance2.png")));
	    		b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance.png")));
	    		b9.setEnabled(true);
	    		b9.setVisible(true);
	    	}
	    	catch(NullPointerException e1)
	    	{
	    		JOptionPane.showMessageDialog(null,"This Question is Not Available Please Complete Inserting Questions");
	    	}
	    }
		catch(SQLException e)
		{
		   JOptionPane.showMessageDialog(null,e.getMessage());
		}
		catch(IOException ex)
		{
			JOptionPane.showMessageDialog(null,"IO");
		}
		catch(NullPointerException ex1)
		{
			l44.setIcon(null);
			b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Image2.png")));
			b23.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Image.png")));
			b9.setEnabled(false);
			b9.setVisible(false);
		}
	}
	public static void cbfalse()
	{
		c6.setSelected(false);
		c7.setSelected(false);
		c8.setSelected(false);
		c9.setSelected(false);
		c10.setSelected(false);
	}
	public static void recentt()
	{
		u1.setVisible(false);
		u2.setVisible(false);
		u3.setVisible(false);
		u4.setVisible(false);
		u5.setVisible(false);
		u6.setVisible(false);
		u7.setVisible(false);
		u8.setVisible(false);
		u9.setVisible(false);
		u10.setVisible(false);
		x1.setVisible(false);
		x2.setVisible(false);
		x3.setVisible(false);
		x4.setVisible(false);
		x5.setVisible(false);
		x6.setVisible(false);
		x7.setVisible(false);
		x8.setVisible(false);
		x9.setVisible(false);
		x10.setVisible(false);
		for(int j=0;j<10;j++)
		{
			namet[j]="null";
		}
		for(int i=0;i<10;i++)
		{
			try
			{
				ResultSet r=con.createStatement().executeQuery("SELECT * FROM questions where Sess='"+(i+1)+"'");
				if(r.next())
				{
					namet[i]=r.getString("Name");
					
				}
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
		}
		for(int l=0;l<10;l++)
		{
			if(namet[l].equals("null"))
			{
				
			}
			else
			{
				if(l==0)
				{
					u1.setText(namet[l]);
					u1.setVisible(true);
					x1.setVisible(true);
				}
				else if(l==1)
				{
					u2.setText(namet[l]);
					u2.setVisible(true);
					x2.setVisible(true);
				}
				else if(l==2)
				{
					u3.setText(namet[l]);
					u3.setVisible(true);
					x3.setVisible(true);
				}
				else if(l==3)
				{
					u4.setText(namet[l]);
					u4.setVisible(true);
					x4.setVisible(true);
				}
				else if(l==4)
				{
					u5.setText(namet[l]);
					u5.setVisible(true);
					x5.setVisible(true);
				}
				else if(l==5)
				{
					u6.setText(namet[l]);
					u6.setVisible(true);
					x6.setVisible(true);
				}
				else if(l==6)
				{
					u7.setText(namet[l]);
					u7.setVisible(true);
					x7.setVisible(true);
				}
				else if(l==7)
				{
					u8.setText(namet[l]);
					u8.setVisible(true);
					x8.setVisible(true);
				}
				else if(l==8)
				{
					u9.setText(namet[l]);
					u9.setVisible(true);
					x9.setVisible(true);
				}
				else if(l==9)
				{
					u10.setText(namet[l]);
					u10.setVisible(true);
					x10.setVisible(true);
				}
			}
		}
	}
	public static void loadses()
	{
		Teach.maxqn();
		try
		{
			ResultSet r=con.createStatement().executeQuery("SELECT * FROM questions where No='"+((ses*100000)+1)+"'");
			if(r.next())
			{
				edi=1;
				seno=maxqno;
				Teach.sequ();
				Frames.fwrite(f2);
				nol=2;
				edi=0;
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}	
	}
	public static void uplist()
	{
		try
		{
			con.createStatement().execute("DELETE FROM questions where Sess='"+ono+"'");
			
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		try
		{
			con.createStatement().execute("DELETE FROM answers where No<'"+((ono+1)*100000)+"' AND No>'"+(ono*100000)+"'");
			
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		for(int i=ono;i<10;i++)
		{
			try
			{
				con.createStatement().execute("update questions SET Sess='"+(i)+"'where Sess='"+(i+1)+"'");
				
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
			for(int j=1;j<=60;j++)
			{
				try
				{
					con.createStatement().execute("update questions SET No='"+((i*100000)+j)+"',RNo='"+((i*10000)+j)+"',RsNo='"+((i*10000)+j)+"'where No='"+(((i+1)*100000)+j)+"'");
				}
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
				}
				try
				{
					con.createStatement().execute("update answers SET No='"+((i*100000)+j)+"'where No='"+(((i+1)*100000)+j)+"'");
				}
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
			
		}
	}
	public static void maxqn()
	{
		try
		{
			ResultSet r=con.createStatement().executeQuery("SELECT MAX(No) FROM questions WHERE No>'"+(100000*ses)+"' AND No<'"+((ses+1)*100000)+"'");
			if(r.next())
			{
				maxqno=r.getInt(1);
				maxqno=maxqno-(ses*100000);
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
	public static void textclear()
	{
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		t6.setText("");
		t7.setText("");
		c1.setSelected(false);
		c2.setSelected(false);
		c3.setSelected(false);
		c4.setSelected(false);
		c5.setSelected(false);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
