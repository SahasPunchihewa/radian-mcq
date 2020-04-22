package Sahas;
import java.awt.*;

import javax.swing.*;

import java.io.*;
import java.sql.*;

import javax.imageio.*;

public class Stu extends MCQ{
	
public static void next()
{
	if((qn+1)<=50)
	{
		try
		{
			ResultSet r=con.createStatement().executeQuery("SELECT * FROM questions where RsNo='"+(qn+1)+"'");
			if(r.next())
			{
				ne=1;
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
	}
}
public static void sescheck()
{
	sc=0;
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM questions where Sess='"+sesr+"'");
		if(r.next())
		{
			sc=1;
		}
		else
		{
			sc=0;
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void ran()
{
	try
	{
		con.createStatement().execute("UPDATE questions SET RNo=0 where Sess='"+sesr+"'");
		
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
	try
	{
		con.createStatement().execute("UPDATE questions SET RNo=(SELECT RAND()*(200-1)+1) where Sess='"+sesr+"'");
		
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR Rand",JOptionPane.ERROR_MESSAGE);
	}
	
}
public static void rclear()
{
	try
	{
		con.createStatement().execute("UPDATE questions SET RsNo=No");
		
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
	try
	{
		con.createStatement().execute("UPDATE questions SET RNo=0");
		
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void minmax()
{
	rmin=0;
	rmax=0;
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT MIN(RNo) FROM questions WHERE Sess='"+sesr+"'");
		if(r.next())
		{
			rmin=r.getInt(1);
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR max",JOptionPane.ERROR_MESSAGE);
	}
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT MAX(RNo) FROM questions WHERE Sess='"+sesr+"'");
		if(r.next())
		{
			rmax=r.getInt(1);
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT Count(RNo) FROM questions WHERE Sess='"+sesr+"'");
		if(r.next())
		{
			countr=r.getInt(1);	
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void dcheck()
{
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT MIN(No) FROM questions WHERE Sess='"+sesr+"'");
		if(r.next())
		{
			dno=r.getInt(1);
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR max",JOptionPane.ERROR_MESSAGE);
	}
	for(int i=1;i<=countr;i++)
	{
		try
		{
			ResultSet r=con.createStatement().executeQuery("SELECT RNo FROM questions WHERE No='"+dno+"' AND Sess='"+sesr+"'");
			if(r.next())
			{
				dr1=r.getInt(1);
				dno2=dno+1;
				for(int j=1;j<countr;j++)
				{
					try
					{
						ResultSet r1=con.createStatement().executeQuery("SELECT RNo FROM questions WHERE No='"+dno2+"' AND Sess='"+sesr+"'");
						if(r1.next())
						{
							dr2=r1.getInt(1);
							if(dr1==dr2)
							{
								try
								{
									con.createStatement().execute("UPDATE questions SET RNo='"+(dr2+1)+"' where No='"+dno2+"'");
									
								}
								catch(SQLException ex)
								{
									JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
								}
							}
							dno2++;
						}
					}
					catch(SQLException ex)
					{
						JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR max",JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR max",JOptionPane.ERROR_MESSAGE);
		}
		dno++;
	}
}
public static void sloop()
{
	for(srtno=1; srtno<=countr; srtno++)
	{
		if(sr==0)
		{
			sortr();
		}
		else
		{
			sr=0;
			rclear();
			ran();
			minmax();
			for(int k=0;k<5;k++)
			{
				Stu.dcheck();
			}
			srno=rmin;
			Stu.sloop();
			break;
		}
	}
}
public static void sortr()
{
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT No FROM questions where RNo='"+srno+"' AND Sess='"+sesr+"'");
		if(r.next())
		{
			try
			{
				con.createStatement().execute("UPDATE questions SET RsNo='"+srtno+"' where RNo='"+srno+"' AND Sess='"+sesr+"'");
				srno++;
			}
			catch(SQLException ex)
			{
				sr=1;
				System.out.println(ex.getMessage());
			}
		}
		else
		{
			srno++;
			sortr();
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void statcheck()
{
	sc=0;
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM questions where RsNo='"+qn+"'");
		if(r.next())
		{
			sc=1;
		}
	}
	catch(SQLException ex)
	{
	JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void readdb()
{
	sc=0;
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM questions where RsNo='"+qn+"'");
		if(r.next())
		{
			l2.setText("<html>"+"Q"+qn+")  "+r.getString("MCQ")+"</html>");
			a1=r.getString("One");
			a2=r.getString("Two");
			a3=r.getString("Three");
			a4=r.getString("Four");
			a5=r.getString("Five");
			reqn=r.getInt("No");
			c6.setText("I)  "+a1);
			c7.setText("II)  "+a2);
			c8.setText("III)  "+a3);
			c9.setText("IV)  "+a4);
			c10.setText("V)  "+a5);
			sc=1;
		}
	}
	catch(SQLException ex)
	{
	JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
	if(sc==1)
	{
		try
		{
			ResultSet r=con.createStatement().executeQuery("SELECT * FROM answers where No='"+reqn+"'");
			if(r.next())
			{
				cans=r.getInt("ans");
			}
		}
		catch(SQLException ex)
		{
			JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
		}
		try
		{
	   	fil=new File("C:\\Users\\Public\\Pictures\\mcqimg.jpg");
	   	fos=new FileOutputStream(fil);
	   	ResultSet r=con.createStatement().executeQuery("SELECT * FROM questions where No='"+reqn+"'");
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
	   		rimg=buf1.getScaledInstance(140,140,Image.SCALE_SMOOTH);
	   		l43.setIcon(new ImageIcon(rimg));
	   		b24.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance.png")));
	   	}
	   	catch(NullPointerException e1)
	   	{
	   		JOptionPane.showMessageDialog(null,"Error");
	   	}
	   	l2.setBounds(35,46,540,140);
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
			nimg=1;
			l43.setIcon(null);
			b24.setRolloverIcon(null);
			l2.setBounds(35,46,712,140);
		}
	}
}
public static void nextsub()
{
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM answers where No='"+((sesr*100000)+qn)+"'");
		if(r.next())
		{
			if(pla==1)
			{
				if(1==cans)
				{	
					pq=1;
					
				}
				else
				{
					pq=0;
				}
				try
				{
					con.createStatement().execute("insert into player(No,USName,Session,Answer,Correct)values('"+((((sesr*100)+qn)*1000000)+clog)+"','"+sun+"','"+sesr+"','"+pla+"','"+pq+"')");
				}
				catch(SQLException ex)
				{
					try
					{
						con.createStatement().execute("UPDATE player SET Answer='"+pla+"',Correct='"+pq+"' WHERE No='"+((((sesr*100)+qn)*1000000)+clog)+"'");
					}
					catch(SQLException ex2)
					{
						JOptionPane.showMessageDialog(null,ex2.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
			}
			else if(pla==2)
			{
				if(2==cans)
				{
					pq=1;
				}
				else
				{
					pq=0;
				}	
				try
				{
					con.createStatement().execute("insert into player(No,USName,Session,Answer,Correct)values('"+((((sesr*100)+qn)*1000000)+clog)+"','"+sun+"','"+sesr+"','"+pla+"','"+pq+"')");
				}
				catch(SQLException ex)
				{
					try
					{
						con.createStatement().execute("UPDATE player SET Answer='"+pla+"',Correct='"+pq+"' WHERE No='"+((((sesr*100)+qn)*1000000)+clog)+"'");
					}
					catch(SQLException ex2)
					{
						JOptionPane.showMessageDialog(null,ex2.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
			}
			else if(pla==3)
			{
				if(3==cans)
				{
					pq=1;
				}
				else
				{
					pq=0;
				}
				try
				{
					con.createStatement().execute("insert into player(No,USName,Session,Answer,Correct)values('"+((((sesr*100)+qn)*1000000)+clog)+"','"+sun+"','"+sesr+"','"+pla+"','"+pq+"')");
				}
				catch(SQLException ex)
				{
					try
					{
						con.createStatement().execute("UPDATE player SET Answer='"+pla+"',Correct='"+pq+"' WHERE No='"+((((sesr*100)+qn)*1000000)+clog)+"'");
					}
					catch(SQLException ex2)
					{
						JOptionPane.showMessageDialog(null,ex2.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
			}
			else if(pla==4)
			{
				if(4==cans)
				{
					pq=1;
				}
				else
				{
					pq=0;
				}
				try
				{
					con.createStatement().execute("insert into player(No,USName,Session,Answer,Correct)values('"+((((sesr*100)+qn)*1000000)+clog)+"','"+sun+"','"+sesr+"','"+pla+"','"+pq+"')");
				}
				catch(SQLException ex)
				{
					try
					{
						con.createStatement().execute("UPDATE player SET Answer='"+pla+"',Correct='"+pq+"' WHERE No='"+((((sesr*100)+qn)*1000000)+clog)+"'");
					}
					catch(SQLException ex2)
					{
						JOptionPane.showMessageDialog(null,ex2.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
			}
			else if(pla==5)
			{
				if(5==cans)
				{
					pq=1;
				}
				else
				{
					pq=0;
				}
				try
				{
					con.createStatement().execute("insert into player(No,USName,Session,Answer,Correct)values('"+((((sesr*100)+qn)*1000000)+clog)+"','"+sun+"','"+sesr+"','"+pla+"','"+pq+"')");
				}
				catch(SQLException ex)
				{
					try
					{
						con.createStatement().execute("UPDATE player SET Answer='"+pla+"',Correct='"+pq+"' WHERE No='"+((((sesr*100)+qn)*1000000)+clog)+"'");
					}
					catch(SQLException ex2)
					{
						JOptionPane.showMessageDialog(null,ex2.getMessage(),"Warning",JOptionPane.WARNING_MESSAGE);
					}
				}
			}
			qn=qn+1;
			Stu.readdb();
			Stu.checkadder();
			ne=0;
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void checkadder()
{
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM player where No='"+((((sesr*100)+qn)*1000000)+clog)+"'");
		if(r.next())
		{
			cans2=r.getInt("Answer");
			if(cans2==1)
			{
				c6.setSelected(true);
			}
			else if(cans2==2)
			{
				c7.setSelected(true);
			}
			else if(cans2==3)
			{
				c8.setSelected(true);
			}
			else if(cans2==4)
			{
				c9.setSelected(true);
			}
			else if(cans2==5)
			{
				c10.setSelected(true);
			}
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void leader()
{
	stna=0;
	stni=0;
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT MAX(Corr) FROM `stat` WHERE (Corr)<'"+((sesr+1)*100000)+"' AND (Corr)>'"+((sesr)*100000)+"'");
		if(r.next())
		{
			max=((r.getInt(1))-(sesr*100000));
			maxn=r.getInt(1);
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT MIN(Corr) FROM `stat` WHERE (Corr)<'"+((sesr+1)*100000)+"' AND (Corr)>'"+((sesr)*100000)+"'");
		if(r.next())
		{
			min=((r.getInt(1))-(sesr*100000));
			minn=r.getInt(1);
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
	try
	{	
		ResultSet r=con.createStatement().executeQuery("SELECT No,Corr, FIND_IN_SET( Corr, ( SELECT GROUP_CONCAT( Corr ORDER BY Corr DESC ) FROM stat WHERE Sess='"+sesr+"')) AS rank FROM stat WHERE No='"+((sesr*100000)+clog)+"'");
		if(r.next())
		{
			rank=r.getInt("rank");
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM `stat` WHERE Corr='"+maxn+"'");
		if(r.next())
		{
			stna=((r.getInt("No"))-(sesr*100000));
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM `stat` WHERE Corr='"+minn+"'");
		if(r.next())
		{
			stni=((r.getInt("No"))-(sesr*100000));
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM `accounts` WHERE No='"+stna+"'");
		if(r.next())
		{
			stma=r.getString("UName");
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM `accounts` WHERE No='"+stni+"'");
		if(r.next())
		{
			stmi=r.getString("UName");
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void chal()
{
	try
	{
		con.createStatement().execute("insert into stat(No,Corr,Sess)values('"+((sesr*100000)+clog)+"','"+((sesr*100000)+nc)+"','"+sesr+"')");
	}
	catch(SQLException ex)
	{
	try
		{
			con.createStatement().execute("update stat SET Corr='"+((sesr*100000)+nc)+"'where No='"+((sesr*100000)+clog)+"'");
		}
		catch(SQLException ex1)
		{
			JOptionPane.showMessageDialog(null,ex1.getMessage(),"dgsdfgsdf",JOptionPane.ERROR_MESSAGE);
		}
	}
}
public static void nextcheck()
{
	statcheck=0;
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM player where No='"+(((((sesr+1)*100)+n)*1000000)+clog)+"'");
		if(r.next())
		{
			statcheck=1;
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void res()
{
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM player where No='"+((((sesr*100)+n)*1000000)+clog)+"'");
		if(r.next())
		{
			
			ans=r.getInt("Correct");
			if(ans==1)
			{
				nc++;
			}
			else if(ans==0)
			{
				nw++;
			}
			n++;
			res();
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void srecent()
{
	u11.setVisible(false);
	u12.setVisible(false);
	u13.setVisible(false);
	u14.setVisible(false);
	u15.setVisible(false);
	u16.setVisible(false);
	u17.setVisible(false);
	u18.setVisible(false);
	u19.setVisible(false);
	u20.setVisible(false);
	l8.setVisible(true);
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
				u11.setText(namet[l]);
				u11.setVisible(true);
				l8.setVisible(false);
			}
			else if(l==1)
			{
				u12.setText(namet[l]);
				u12.setVisible(true);
			}
			else if(l==2)
			{
				u13.setText(namet[l]);
				u13.setVisible(true);
			}
			else if(l==3)
			{
				u14.setText(namet[l]);
				u14.setVisible(true);
			}
			else if(l==4)
			{
				u15.setText(namet[l]);
				u15.setVisible(true);
			}
			else if(l==5)
			{
				u16.setText(namet[l]);
				u16.setVisible(true);
			}
			else if(l==6)
			{
				u17.setText(namet[l]);
				u17.setVisible(true);
			}
			else if(l==7)
			{
				u18.setText(namet[l]);
				u18.setVisible(true);
			}
			else if(l==8)
			{
				u19.setText(namet[l]);
				u19.setVisible(true);
			}
			else if(l==9)
			{
				u20.setText(namet[l]);
				u20.setVisible(true);
			}
		}
	}
}
public static void tnameload()
{
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT DISTINCT Name FROM questions WHERE Sess='"+sesr+"'");
		if(r.next())
		{
			tname=r.getString("Name");
			
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void stload()
{	
	l12.setText("N/A");
	l35.setText("N/A");
	l33.setText("N/A");
	l34.setText("N/A");
	nc=0;
	nw=0;
	Stu.res();
	Stu.chal();
	Stu.leader();
	n=1;
	Stu.nextcheck();
	Stu.tnameload();
	if(statcheck==0)
	{
		b18.setEnabled(false);
		b18.setVisible(false);
	}
	l30.setText(tname);
	l12.setText(nc+"  of  "+(nc+nw)+"  Are Correct");
	l35.setText("Your Rank is  "+rank);
	l33.setText("Highest Marks is  "+max+" by "+stma);
	l34.setText("Lowest Marks is  "+min+" by "+stmi);
	
}
public static void streset()
{
	l2.setText("N/A");
	c6.setText("N/A");
	c7.setText("N/A");
	c8.setText("N/A");
	c9.setText("N/A");
	c10.setText("N/A");
	l43.setIcon(null);
	b24.setRolloverIcon(null);
	qn=1;
}
public static void smax()
{
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT MAX(Sess) FROM questions");
		if(r.next())
		{
			sesmax=r.getInt(1);
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
	}
}
public static void tcheck()
{
	acheck=0;
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT * FROM player WHERE USName='"+sun+"' AND Session='"+sesr+"'");
		if(r.next())
		{
			acheck=1;
		}
	}
	catch(SQLException ex)
	{
		JOptionPane.showMessageDialog(null,"You Have Alredy Answerd This Question","Warning",JOptionPane.WARNING_MESSAGE);
	}
}
public static void ubuttons()
{
	b11.setEnabled(true);
	b12.setEnabled(true);
	b11.setVisible(true);
	b12.setVisible(true);
	Stu.nextmax();
	Stu.tcheck();
	if(acheck==0)
	{
		Stu.rclear();
		Stu.ran();
		Stu.minmax();
		for(int k=0;k<5;k++)
		{
			Stu.dcheck();
		}
		srno=rmin;
		Stu.sloop();
		Stu.readdb();
		b12.setEnabled(false);
		b12.setVisible(false);
		Stu.next();
		if(ne==0)
		{
			b11.setEnabled(false);
			b11.setVisible(false);
		}
		Frames.fread(f1);
	}
	else
	{
		JOptionPane.showMessageDialog(null,"You Have Alredy Answerd This Test! Try Annother","Warning",JOptionPane.WARNING_MESSAGE);
	}
}
public static void nextmax()
{
	try
	{
		ResultSet r=con.createStatement().executeQuery("SELECT MAX(RsNo) FROM questions where Sess='"+sesr+"'");
		if(r.next())
		{
			nmax=r.getInt(1);
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
