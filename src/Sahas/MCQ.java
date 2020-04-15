package Sahas;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.*;
public class MCQ extends JFrame implements ActionListener,ItemListener{
static JFrame f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12,f13,f14,f15,f16,f17,f18,f19,f20;
static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80,b81,b82,b83,b84,b85,b86,b87,b88,b89,b90,b91,b92,b93,b94,b95,b96,b97,b98,b99,b100,b101,b102,b103,b104,b105,b106,b107,b108,b109,b110,b111,b112,b113,b114,b115,b116,b117,b118,b119,b120,b121,b122,b123,b124,b125,b126,b127,b128,b129,b130,b131,b132,b133,b134,b135,b136;
static JButton u1,u2,u3,u4,u5,u6,u7,u8,u9,u10,u11,u12,u13,u14,u15,u16,u17,u18,u19,u20;
static JButton x1,x2,x3,x4,x5,x6,x7,x8,x9,x10;
static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47,l48,l49,l50;
static JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lb16,lb17,lb18,lb19,lb20,lb21;
static JTextArea t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
static JPasswordField p1,p2,p3,p4;;
static JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
static JMenuBar jmb1,jmb2;
static JMenu jm1,jm2;
static JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5;
static JFileChooser fc1;
static File fi1,fil;;
static int qn=1,answ=0,an=1,rtno=0,pla=0,pq=9,stno,ac=1,ne=0,reqn=0,log=1,countr=0,sign=0,srno=0,srtno=1,clog=0,n=1,rmin=0,rmax=0,nw=0,ans=0,nc=0,x,y,lb=1,max=0,maxn=0,min=0,minn=0,rank=0,qa=0,ses=1,sesdb=0,nol=0,edi=0,sesr=0,res,nimg=0,sc=0,stna=0,stni=0,jop,cans,sean,edan;
static int dno,dno2,dr1,dr2,sr=0,seno=0,ik,ono,sesmax=0,statcheck=0,acheck=0;
static String a1,a2,a3,a4,a5,un,pw,sun,spw,path1="",stma,stmi,ip,name="null",name2,tname="";
static Connection con;
static GraphicsEnvironment ge;
static GraphicsDevice Screen;
static Rectangle rect;
static PreparedStatement sta;
static FileInputStream fist;
static ResultSet rs;
static InputStream ist;
static OutputStream out;
static FileOutputStream fos;
static BufferedImage buf1,buf2,buf3;
static byte b[];
static Blob blo;
static Image rimg,rimg2,rimg3;
static String[] JOPB = {"Retry","Cancel"};
static String namet[]=new String[10];
static int op;

public MCQ()
{
	
	//UIDay.uxd();
	
	ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
	Screen=ge.getDefaultScreenDevice();
	rect=Screen.getDefaultConfiguration().getBounds();
	x=(int)(rect.getMaxX());
	y=(int)(rect.getMaxY());
	f10=new JFrame();
	f10.setUndecorated(true);
	lb10=new JLabel("");
	lb10.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/load.png")));
	lb10.setSize(400,200);
	f10.setState(ICONIFIED);
	f10.setLocation((x/2)-200,(y/2)-100);
	l22=new JLabel("");
	l22.setHorizontalAlignment(SwingConstants.CENTER);
	l22.setHorizontalTextPosition(SwingConstants.CENTER);
	l22.setForeground(Color.WHITE);
	l22.setFont(new Font("Century Gothic", Font.BOLD, 12));
	l22.setLocation(61, 144);
	l22.setSize(277, 25);
	l22.setText("Initializing Variables...");
	Frames.load(f10);
	f1=new JFrame();
	f1.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f1.setResizable(false);
	f2=new JFrame();
	f2.setResizable(false);
	f2.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f3=new JFrame();
	f3.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f3.setResizable(false);
	f4=new JFrame();
	f4.setResizable(false);
	f4.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f5=new JFrame();
	f5.setResizable(false);
	f5.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f6=new JFrame();
	f6.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f6.setResizable(false);
	f7=new JFrame();
	f7.setResizable(false);
	f7.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f8=new JFrame();
	f8.setResizable(false);
	f8.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f9=new JFrame();
	f9.setResizable(false);
	f9.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f11=new JFrame();
	f11.setResizable(false);
	f11.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f12=new JFrame();
	f12.setResizable(false);
	f12.setIconImage(Toolkit.getDefaultToolkit().getImage(MCQ.class.getResource("/ICO/IconS.png")));
	f13=new JFrame();
	f10.setState(NORMAL);
	l22.setText("Loading Database...");
	Dbase.db();
	l22.setText("Setting Attibutes...");
	l1=new JLabel("Username");
	l1.setForeground(Color.WHITE);
	l1.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l2=new JLabel("The MCQ");
	l2.setVerticalTextPosition(SwingConstants.TOP);
	l2.setForeground(Color.WHITE);
	l2.setFont(new Font("Century Gothic", Font.BOLD, 20));
	l2.setVerticalAlignment(SwingConstants.TOP);
	l2.setAlignmentX(Component.CENTER_ALIGNMENT);
	l3=new JLabel("Name");
	l3.setForeground(Color.WHITE);
	l3.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l4=new JLabel("Question");
	l4.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l4.setForeground(Color.WHITE);
	l5=new JLabel("Username");
	l5.setForeground(Color.WHITE);
	l5.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l6=new JLabel("Password");
	l6.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l6.setForeground(Color.WHITE);
	l7=new JLabel("Password");
	l7.setForeground(Color.WHITE);
	l7.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l8=new JLabel("Tests Are Not Available");
	l8.setHorizontalTextPosition(SwingConstants.CENTER);
	l8.setHorizontalAlignment(SwingConstants.CENTER);
	l8.setForeground(Color.WHITE);
	l8.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l9=new JLabel("Username");
	l9.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l9.setForeground(Color.WHITE);
	l10=new JLabel("password");
	l10.setForeground(Color.WHITE);
	l10.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l11=new JLabel("<html>Confirm Password</html>");
	l11.setForeground(Color.WHITE);
	l11.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l12=new JLabel("N/A of N/A Are Correct");
	l12.setHorizontalTextPosition(SwingConstants.CENTER);
	l12.setHorizontalAlignment(SwingConstants.CENTER);
	l12.setBorder(null);
	l12.setVerticalTextPosition(SwingConstants.TOP);
	l12.setVerticalAlignment(SwingConstants.TOP);
	l12.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l12.setForeground(Color.WHITE);
	l13=new JLabel("<html>Welcome to M.C.Q Challenge.</html>");
	l13.setHorizontalAlignment(SwingConstants.CENTER);
	l13.setForeground(Color.WHITE);
	l13.setFont(new Font("Century Gothic", Font.BOLD, 24));
	l14=new JLabel("<html>You Can Select one of below two sections.</html>");
	l14.setVerticalAlignment(SwingConstants.TOP);
	l14.setForeground(Color.WHITE);
	l14.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l15=new JLabel("<html>Please Log in to Your Teacher's Account</html>");
	l15.setHorizontalAlignment(SwingConstants.CENTER);
	l15.setForeground(Color.WHITE);
	l15.setFont(new Font("Century Gothic", Font.BOLD, 22));
	l16=new JLabel("<html><center>Please Log in to Your Student Account or Create New Account</center></html>");
	l16.setHorizontalTextPosition(SwingConstants.LEADING);
	l16.setForeground(Color.WHITE);
	l16.setFont(new Font("Century Gothic", Font.BOLD, 22));
	l17=new JLabel("<html><center>Create New Account</center></html>");
	l17.setHorizontalAlignment(SwingConstants.CENTER);
	l17.setForeground(Color.WHITE);
	l17.setFont(new Font("Century Gothic", Font.BOLD, 22));
	l18=new JLabel("<html><center>Welcome</center></html>");
	l18.setHorizontalAlignment(SwingConstants.CENTER);
	l18.setFont(new Font("Century Gothic", Font.BOLD, 22));
	l18.setForeground(Color.WHITE);
	l19=new JLabel("<html><center>You Can Answer Questions or You Can See Your Marks.</center></html>");
	l19.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l19.setForeground(Color.WHITE);
	l20=new JLabel("<html><center>Your Status</html></center>");
	l20.setHorizontalAlignment(SwingConstants.CENTER);
	l20.setForeground(Color.WHITE);
	l20.setFont(new Font("Century Gothic", Font.BOLD, 22));
	l21=new JLabel("<html><center>Radian is an application for Answer new Questions, Making new Questions made by Sahas Punchihewa<br><br></html></center>");
	l21.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l21.setForeground(Color.WHITE);
	l23=new JLabel("Or");
	l23.setHorizontalTextPosition(SwingConstants.CENTER);
	l23.setHorizontalAlignment(SwingConstants.CENTER);
	l23.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l23.setForeground(Color.WHITE);
	l24=new JLabel("Student");
	l24.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l24.setHorizontalAlignment(SwingConstants.CENTER);
	l24.setForeground(Color.WHITE);
	l25=new JLabel("Teacher");
	l25.setHorizontalAlignment(SwingConstants.CENTER);
	l25.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l25.setForeground(Color.WHITE);
	l26=new JLabel("Or");
	l26.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l26.setForeground(Color.WHITE);
	l27=new JLabel("Select a Question Paper");
	l27.setHorizontalTextPosition(SwingConstants.CENTER);
	l27.setHorizontalAlignment(SwingConstants.CENTER);
	l27.setForeground(Color.WHITE);
	l27.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l28=new JLabel("Your Marks");
	l28.setHorizontalAlignment(SwingConstants.CENTER);
	l28.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l28.setForeground(Color.WHITE);
	l29=new JLabel();
	l29.setForeground(Color.WHITE);
	l29.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l30=new JLabel();
	l30.setHorizontalAlignment(SwingConstants.CENTER);
	l30.setHorizontalTextPosition(SwingConstants.CENTER);
	l30.setForeground(Color.WHITE);
	l30.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l30.setText("N/A");
	l32=new JLabel("<html>Radian<br>2.0.0.0<br>\u00A9 2020 Allright Reserved</html>");
	l32.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l32.setForeground(Color.WHITE);
	l33=new JLabel("Highest Marks is N/A");
	l33.setHorizontalTextPosition(SwingConstants.CENTER);
	l33.setHorizontalAlignment(SwingConstants.CENTER);
	l33.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l33.setForeground(Color.WHITE);
	l34=new JLabel("Lowest Marks is N/A");
	l34.setHorizontalTextPosition(SwingConstants.CENTER);
	l34.setHorizontalAlignment(SwingConstants.CENTER);
	l34.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l34.setForeground(Color.WHITE);
	l35=new JLabel("Your Rank is N/A");
	l35.setHorizontalTextPosition(SwingConstants.CENTER);
	l35.setHorizontalAlignment(SwingConstants.CENTER);
	l35.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l35.setForeground(Color.WHITE);
	l36=new JLabel();
	l37=new JLabel("Add an Image");
	l37.setForeground(Color.WHITE);
	l37.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l38=new JLabel("New Test");
	l38.setHorizontalAlignment(SwingConstants.CENTER);
	l38.setForeground(Color.WHITE);
	l38.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l39=new JLabel("Edit Recent Tests");
	l39.setHorizontalAlignment(SwingConstants.CENTER);
	l39.setForeground(Color.WHITE);
	l39.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l40=new JLabel("Welcome");
	l40.setHorizontalAlignment(SwingConstants.CENTER);
	l40.setFont(new Font("Century Gothic", Font.BOLD, 20));
	l40.setForeground(Color.WHITE);
	l41=new JLabel("Plese Create New Test or Edit Existing Test");
	l41.setHorizontalAlignment(SwingConstants.LEFT);
	l41.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l41.setForeground(Color.WHITE);
	l42=new JLabel("Or");
	l42.setFont(new Font("Century Gothic", Font.BOLD, 18));
	l42.setForeground(Color.WHITE);
	l43=new JLabel();
	l44=new JLabel();
	lb1=new JLabel();
	lb1.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/BG.png")));
	lb2=new JLabel();
	lb2.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/BG.png")));
	lb3=new JLabel("");
	lb3.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/BG.png")));
	lb4=new JLabel("");
	lb4.setLocation(10, 0);
	lb4.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/BG.png")));
	lb5=new JLabel("");
	lb5.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/BG.png")));
	lb6=new JLabel("");
	lb6.setHorizontalAlignment(SwingConstants.CENTER);
	lb6.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/BG.png")));
	lb7=new JLabel("");
	lb7.setVerticalAlignment(SwingConstants.TOP);
	lb7.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/BG.png")));
	lb8=new JLabel("");
	lb8.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/BG.png")));
	lb9=new JLabel("");
	lb9.setHorizontalTextPosition(SwingConstants.CENTER);
	lb9.setHorizontalAlignment(SwingConstants.LEFT);
	lb9.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/About.png")));
	lb10=new JLabel();
	lb10.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance.png")));
	lb11=new JLabel();
	lb11.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance.png")));
	lb12=new JLabel();
	lb12.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance.png")));
	lb13=new JLabel();
	lb13.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance.png")));
	lb14=new JLabel();
	lb14.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance.png")));
	lb15=new JLabel();
	lb15.setIcon(new ImageIcon(MCQ.class.getResource("/ICO/IconL.png")));
	lb16=new JLabel();
	lb16.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/Login.png")));
	lb17=new JLabel();
	lb17.setVerticalAlignment(SwingConstants.TOP);
	lb17.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/BG.png")));
	lb18=new JLabel();
	lb18.setLocation(0, 0);
	lb19=new JLabel();
	lb19.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/Login.png")));
	t1=new JTextArea();
	t2=new JTextArea();
	t2.setWrapStyleWord(true);
	t2.setLineWrap(true);
	t2.setFont(new Font("Monospaced", Font.PLAIN, 15));
	t2.setColumns(1);
	t3=new JTextArea();
	t3.setFont(new Font("Monospaced", Font.PLAIN, 15));
	t4=new JTextArea();
	t4.setFont(new Font("Monospaced", Font.PLAIN, 15));
	t5=new JTextArea();
	t5.setFont(new Font("Monospaced", Font.PLAIN, 15));
	t6=new JTextArea();
	t6.setFont(new Font("Monospaced", Font.PLAIN, 15));
	t7=new JTextArea();
	t7.setFont(new Font("Monospaced", Font.PLAIN, 15));
	t8=new JTextArea();
	t9=new JTextArea();
	t9.setFont(new Font("Monospaced", Font.PLAIN, 15));
	t10=new JTextArea();
	p1=new JPasswordField();
	p1.setFont(new Font("Tahoma", Font.PLAIN, 15));
	p1.setBorder(null);
	p1.setEchoChar('*');
	p2=new JPasswordField();
	p2.setBorder(null);
	p2.setEchoChar('*');
	p3=new JPasswordField();
	p3.setBorder(null);
	p3.setEchoChar('*');
	p4=new JPasswordField();
	p4.setBorder(null);
	p4.setEchoChar('*');
	l22.setText("Initializing Buttons...");
	b1=new JButton("");
	b1.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Sub.png")));
	b1.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Sub2.png")));
	b1.setBorder(null);
	b1.setContentAreaFilled(false);
	b2=new JButton("");
	b2.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/StuSelect2.png")));
	b2.setBorder(null);
	b2.setContentAreaFilled(false);
	b2.setIcon(new ImageIcon(MCQ.class.getResource("/Button/StuSelect.png")));
	b3=new JButton("");
	b3.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/TSelect2.png")));
	b3.setIcon(new ImageIcon(MCQ.class.getResource("/Button/TSelect.png")));
	b3.setContentAreaFilled(false);
	b3.setBorder(null);
	b4=new JButton("");
	b4.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Sign In12.png")));
	b4.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Sign In1.png")));
	b4.setContentAreaFilled(false);
	b4.setBorder(null);
	b4.setFont(new Font("Century Gothic", Font.BOLD, 18));
	b4.setForeground(Color.BLACK);
	b5=new JButton("");
	b5.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Cancel1.png")));
	b5.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Cancel 12.png")));
	b5.setContentAreaFilled(false);
	b5.setBorder(null);
	b5.setFont(new Font("Century Gothic", Font.BOLD, 18));
	b5.setForeground(Color.BLACK);
	b6=new JButton("");
	b6.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Add2.png")));
	b6.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Add.png")));
	b6.setContentAreaFilled(false);
	b6.setBorder(null);
	b7=new JButton("");
	b7.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Edit2.png")));
	b7.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Edit.png")));
	b7.setContentAreaFilled(false);
	b7.setBorder(null);
	b8=new JButton("<");
	b8.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b8.setHorizontalTextPosition(SwingConstants.CENTER);
	b8.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b8.setForeground(Color.WHITE);
	b8.setFont(new Font("Century Gothic", Font.BOLD, 60));
	b8.setContentAreaFilled(false);
	b8.setBorder(null);
	b8.setEnabled(false);
	b8.setVisible(false);
	b9=new JButton("");
	b9.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	b9.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	b9.setContentAreaFilled(false);
	b9.setBorder(null);
	b9.setEnabled(false);
	b9.setVisible(false);
	b10=new JButton("");
	b10.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Clear2.png")));
	b10.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Clear.png")));
	b10.setContentAreaFilled(false);
	b10.setBorder(null);
	b11=new JButton("");
	b11.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Next2.png")));
	b11.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Next.png")));
	b11.setBorder(null);
	b11.setContentAreaFilled(false);
	b12=new JButton("");
	b12.setForeground(Color.WHITE);
	b12.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b12.setHorizontalTextPosition(SwingConstants.CENTER);
	b12.setOpaque(false);
	b12.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Pre2.png")));
	b12.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Pre.png")));
	b12.setBorder(null);
	b12.setContentAreaFilled(false);
	b13=new JButton("");
	b13.setHorizontalTextPosition(SwingConstants.CENTER);
	b13.setContentAreaFilled(false);
	b13.setBorder(null);
	b13.setForeground(Color.BLACK);
	b13.setFont(new Font("Century Gothic", Font.BOLD, 18));
	b13.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Sign In2.png")));
	b13.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Sign In.png")));
	b14=new JButton("");
	b14.setContentAreaFilled(false);
	b14.setBorder(null);
	b14.setVerticalTextPosition(SwingConstants.TOP);
	b14.setForeground(Color.BLACK);
	b14.setFont(new Font("Century Gothic", Font.BOLD, 18));
	b14.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Cancel 12.png")));
	b14.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Cancel1.png")));
	b15=new JButton("");
	b15.setContentAreaFilled(false);
	b15.setBorder(null);
	b15.setVerticalTextPosition(SwingConstants.TOP);
	b15.setForeground(Color.BLACK);
	b15.setFont(new Font("Century Gothic", Font.BOLD, 18));
	b15.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Sign Up2.png")));
	b15.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Sign Up.png")));
	b16=new JButton("");
	b16.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Create2.png")));
	b16.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Create.png")));
	b16.setContentAreaFilled(false);
	b16.setBorder(null);
	b16.setVerticalTextPosition(SwingConstants.TOP);
	b16.setFont(new Font("Century Gothic", Font.BOLD, 18));
	b16.setForeground(Color.BLACK);
	b17=new JButton("");
	b17.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Cancel1.png")));
	b17.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Cancel 12.png")));
	b17.setContentAreaFilled(false);
	b17.setBorder(null);
	b17.setVerticalTextPosition(SwingConstants.TOP);
	b17.setFont(new Font("Century Gothic", Font.BOLD, 18));
	b17.setForeground(Color.BLACK);
	b18=new JButton(">");
	b18.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b18.setHorizontalTextPosition(SwingConstants.CENTER);
	b18.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b18.setForeground(Color.WHITE);
	b18.setFont(new Font("Century Gothic", Font.BOLD, 60));
	b18.setContentAreaFilled(false);
	b18.setBorder(null);
	b19=new JButton("");
	b19.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/StatSelect2.png")));
	b19.setIcon(new ImageIcon(MCQ.class.getResource("/Button/StatSelect.png")));
	b19.setContentAreaFilled(false);
	b19.setBorder(null);
	b20=new JButton("");
	b20.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/About2.png")));
	b20.setBorder(null);
	b20.setContentAreaFilled(false);
	b20.setIcon(new ImageIcon(MCQ.class.getResource("/Button/About.png")));
	b21=new JButton("");
	b21.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/NewT2.png")));
	b21.setIcon(new ImageIcon(MCQ.class.getResource("/Button/NewT.png")));
	b21.setContentAreaFilled(false);
	b21.setBorder(null);
	b23=new JButton("");
	b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Image2.png")));
	b23.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Image.png")));
	b23.setBorder(null);
	b23.setContentAreaFilled(false);
	b24=new JButton("");
	b24.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance.png")));
	b24.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance2.png")));
	b24.setContentAreaFilled(false);
	b24.setBorder(null);
	b25=new JButton("Ok");
	b26=new JButton("Cancel");
	b27=new JButton("1");
	b27.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b28=new JButton("2");
	b28.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b29=new JButton("3");
	b29.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b30=new JButton("4");
	b30.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b31=new JButton("5");
	b31.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b32=new JButton("6");
	b32.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b33=new JButton("7");
	b33.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b34=new JButton("8");
	b34.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b35=new JButton("9");
	b35.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b36=new JButton("10");
	b36.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b37=new JButton("11");
	b37.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b38=new JButton("12");
	b38.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b39=new JButton("13");
	b39.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b40=new JButton("14");
	b40.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b41=new JButton("15");
	b41.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b42=new JButton("16");
	b42.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b43=new JButton("17");
	b43.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b44=new JButton("18");
	b44.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b45=new JButton("19");
	b45.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b46=new JButton("20");
	b46.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b47=new JButton("21");
	b47.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b48=new JButton("22");
	b48.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b49=new JButton("23");
	b49.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b50=new JButton("24");
	b50.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b51=new JButton("25");
	b51.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b52=new JButton("26");
	b52.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b53=new JButton("27");
	b53.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b54=new JButton("28");
	b54.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b55=new JButton("29");
	b55.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b56=new JButton("30");
	b56.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b57=new JButton("31");
	b57.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b58=new JButton("32");
	b58.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b59=new JButton("33");
	b59.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b60=new JButton("34");
	b60.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b61=new JButton("35");
	b61.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b62=new JButton("36");
	b62.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b63=new JButton("37");
	b63.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b64=new JButton("38");
	b64.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b65=new JButton("39");
	b65.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b66=new JButton("40");
	b66.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b67=new JButton("41");
	b67.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b68=new JButton("42");
	b68.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b69=new JButton("43");
	b69.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b70=new JButton("44");
	b70.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b71=new JButton("45");
	b71.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b72=new JButton("46");
	b72.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b73=new JButton("47");
	b73.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b74=new JButton("48");
	b74.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b75=new JButton("49");
	b75.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b76=new JButton("50");
	b76.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b77=new JButton("1");
	b77.setHorizontalTextPosition(SwingConstants.CENTER);
	b77.setHorizontalAlignment(SwingConstants.LEFT);
	b77.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b77.setForeground(Color.WHITE);
	b77.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b77.setContentAreaFilled(false);
	b77.setBorder(null);
	b77.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b78=new JButton("2");
	b78.setHorizontalTextPosition(SwingConstants.CENTER);
	b78.setHorizontalAlignment(SwingConstants.LEFT);
	b78.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b78.setForeground(Color.WHITE);
	b78.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b78.setContentAreaFilled(false);
	b78.setBorder(null);
	b78.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b79=new JButton("3");
	b79.setHorizontalTextPosition(SwingConstants.CENTER);
	b79.setHorizontalAlignment(SwingConstants.LEFT);
	b79.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b79.setForeground(Color.WHITE);
	b79.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b79.setContentAreaFilled(false);
	b79.setBorder(null);
	b79.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b80=new JButton("4");
	b80.setHorizontalTextPosition(SwingConstants.CENTER);
	b80.setHorizontalAlignment(SwingConstants.LEFT);
	b80.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b80.setForeground(Color.WHITE);
	b80.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b80.setContentAreaFilled(false);
	b80.setBorder(null);
	b80.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b81=new JButton("5");
	b81.setHorizontalTextPosition(SwingConstants.CENTER);
	b81.setHorizontalAlignment(SwingConstants.LEFT);
	b81.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b81.setForeground(Color.WHITE);
	b81.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b81.setContentAreaFilled(false);
	b81.setBorder(null);
	b81.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b82=new JButton("6");
	b82.setHorizontalTextPosition(SwingConstants.CENTER);
	b82.setHorizontalAlignment(SwingConstants.LEFT);
	b82.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b82.setForeground(Color.WHITE);
	b82.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b82.setContentAreaFilled(false);
	b82.setBorder(null);
	b82.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b83=new JButton("7");
	b83.setHorizontalTextPosition(SwingConstants.CENTER);
	b83.setHorizontalAlignment(SwingConstants.LEFT);
	b83.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b83.setForeground(Color.WHITE);
	b83.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b83.setContentAreaFilled(false);
	b83.setBorder(null);
	b83.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b84=new JButton("8");
	b84.setHorizontalTextPosition(SwingConstants.CENTER);
	b84.setHorizontalAlignment(SwingConstants.LEFT);
	b84.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b84.setForeground(Color.WHITE);
	b84.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b84.setContentAreaFilled(false);
	b84.setBorder(null);
	b84.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b85=new JButton("9");
	b85.setHorizontalTextPosition(SwingConstants.CENTER);
	b85.setHorizontalAlignment(SwingConstants.LEFT);
	b85.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b85.setForeground(Color.WHITE);
	b85.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b85.setContentAreaFilled(false);
	b85.setBorder(null);
	b85.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b86=new JButton("10");
	b86.setHorizontalTextPosition(SwingConstants.CENTER);
	b86.setHorizontalAlignment(SwingConstants.LEFT);
	b86.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b86.setForeground(Color.WHITE);
	b86.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b86.setContentAreaFilled(false);
	b86.setBorder(null);
	b86.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b87=new JButton("11");
	b87.setHorizontalTextPosition(SwingConstants.CENTER);
	b87.setHorizontalAlignment(SwingConstants.LEFT);
	b87.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b87.setForeground(Color.WHITE);
	b87.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b87.setContentAreaFilled(false);
	b87.setBorder(null);
	b87.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b88=new JButton("12");
	b88.setHorizontalTextPosition(SwingConstants.CENTER);
	b88.setHorizontalAlignment(SwingConstants.LEFT);
	b88.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b88.setForeground(Color.WHITE);
	b88.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b88.setContentAreaFilled(false);
	b88.setBorder(null);
	b88.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b89=new JButton("13");
	b89.setHorizontalTextPosition(SwingConstants.CENTER);
	b89.setHorizontalAlignment(SwingConstants.LEFT);
	b89.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b89.setForeground(Color.WHITE);
	b89.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b89.setContentAreaFilled(false);
	b89.setBorder(null);
	b89.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b90=new JButton("14");
	b90.setHorizontalTextPosition(SwingConstants.CENTER);
	b90.setHorizontalAlignment(SwingConstants.LEFT);
	b90.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b90.setForeground(Color.WHITE);
	b90.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b90.setContentAreaFilled(false);
	b90.setBorder(null);
	b90.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b91=new JButton("15");
	b91.setHorizontalTextPosition(SwingConstants.CENTER);
	b91.setHorizontalAlignment(SwingConstants.LEFT);
	b91.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b91.setForeground(Color.WHITE);
	b91.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b91.setContentAreaFilled(false);
	b91.setBorder(null);
	b91.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b92=new JButton("16");
	b92.setHorizontalTextPosition(SwingConstants.CENTER);
	b92.setHorizontalAlignment(SwingConstants.LEFT);
	b92.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b92.setForeground(Color.WHITE);
	b92.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b92.setContentAreaFilled(false);
	b92.setBorder(null);
	b92.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b93=new JButton("17");
	b93.setHorizontalTextPosition(SwingConstants.CENTER);
	b93.setHorizontalAlignment(SwingConstants.LEFT);
	b93.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b93.setForeground(Color.WHITE);
	b93.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b93.setContentAreaFilled(false);
	b93.setBorder(null);
	b93.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b94=new JButton("18");
	b94.setHorizontalTextPosition(SwingConstants.CENTER);
	b94.setHorizontalAlignment(SwingConstants.LEFT);
	b94.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b94.setForeground(Color.WHITE);
	b94.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b94.setContentAreaFilled(false);
	b94.setBorder(null);
	b94.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b95=new JButton("19");
	b95.setHorizontalTextPosition(SwingConstants.CENTER);
	b95.setHorizontalAlignment(SwingConstants.LEFT);
	b95.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b95.setForeground(Color.WHITE);
	b95.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b95.setContentAreaFilled(false);
	b95.setBorder(null);
	b95.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b96=new JButton("20");
	b96.setHorizontalTextPosition(SwingConstants.CENTER);
	b96.setHorizontalAlignment(SwingConstants.LEFT);
	b96.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b96.setForeground(Color.WHITE);
	b96.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b96.setContentAreaFilled(false);
	b96.setBorder(null);
	b96.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b97=new JButton("21");
	b97.setHorizontalTextPosition(SwingConstants.CENTER);
	b97.setHorizontalAlignment(SwingConstants.LEFT);
	b97.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b97.setForeground(Color.WHITE);
	b97.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b97.setContentAreaFilled(false);
	b97.setBorder(null);
	b97.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b98=new JButton("22");
	b98.setHorizontalTextPosition(SwingConstants.CENTER);
	b98.setHorizontalAlignment(SwingConstants.LEFT);
	b98.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b98.setForeground(Color.WHITE);
	b98.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b98.setContentAreaFilled(false);
	b98.setBorder(null);
	b98.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b99=new JButton("23");
	b99.setHorizontalTextPosition(SwingConstants.CENTER);
	b99.setHorizontalAlignment(SwingConstants.LEFT);
	b99.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b99.setForeground(Color.WHITE);
	b99.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b99.setContentAreaFilled(false);
	b99.setBorder(null);
	b99.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b100=new JButton("24");
	b100.setHorizontalTextPosition(SwingConstants.CENTER);
	b100.setHorizontalAlignment(SwingConstants.LEFT);
	b100.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b100.setForeground(Color.WHITE);
	b100.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b100.setContentAreaFilled(false);
	b100.setBorder(null);
	b100.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b101=new JButton("25");
	b101.setHorizontalTextPosition(SwingConstants.CENTER);
	b101.setHorizontalAlignment(SwingConstants.LEFT);
	b101.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b101.setForeground(Color.WHITE);
	b101.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b101.setContentAreaFilled(false);
	b101.setBorder(null);
	b101.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b102=new JButton("26");
	b102.setHorizontalTextPosition(SwingConstants.CENTER);
	b102.setHorizontalAlignment(SwingConstants.LEFT);
	b102.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b102.setForeground(Color.WHITE);
	b102.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b102.setContentAreaFilled(false);
	b102.setBorder(null);
	b102.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b103=new JButton("27");
	b103.setHorizontalTextPosition(SwingConstants.CENTER);
	b103.setHorizontalAlignment(SwingConstants.LEFT);
	b103.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b103.setForeground(Color.WHITE);
	b103.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b103.setContentAreaFilled(false);
	b103.setBorder(null);
	b103.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b104=new JButton("28");
	b104.setHorizontalTextPosition(SwingConstants.CENTER);
	b104.setHorizontalAlignment(SwingConstants.LEFT);
	b104.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b104.setForeground(Color.WHITE);
	b104.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b104.setContentAreaFilled(false);
	b104.setBorder(null);
	b104.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b105=new JButton("29");
	b105.setHorizontalTextPosition(SwingConstants.CENTER);
	b105.setHorizontalAlignment(SwingConstants.LEFT);
	b105.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b105.setForeground(Color.WHITE);
	b105.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b105.setContentAreaFilled(false);
	b105.setBorder(null);
	b105.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b106=new JButton("30");
	b106.setHorizontalTextPosition(SwingConstants.CENTER);
	b106.setHorizontalAlignment(SwingConstants.LEFT);
	b106.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b106.setForeground(Color.WHITE);
	b106.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b106.setContentAreaFilled(false);
	b106.setBorder(null);
	b106.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b107=new JButton("31");
	b107.setHorizontalTextPosition(SwingConstants.CENTER);
	b107.setHorizontalAlignment(SwingConstants.LEFT);
	b107.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b107.setForeground(Color.WHITE);
	b107.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b107.setContentAreaFilled(false);
	b107.setBorder(null);
	b107.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b108=new JButton("32");
	b108.setHorizontalTextPosition(SwingConstants.CENTER);
	b108.setHorizontalAlignment(SwingConstants.LEFT);
	b108.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b108.setForeground(Color.WHITE);
	b108.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b108.setContentAreaFilled(false);
	b108.setBorder(null);
	b108.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b109=new JButton("33");
	b109.setHorizontalTextPosition(SwingConstants.CENTER);
	b109.setHorizontalAlignment(SwingConstants.LEFT);
	b109.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b109.setForeground(Color.WHITE);
	b109.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b109.setContentAreaFilled(false);
	b109.setBorder(null);
	b109.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b110=new JButton("34");
	b110.setHorizontalTextPosition(SwingConstants.CENTER);
	b110.setHorizontalAlignment(SwingConstants.LEFT);
	b110.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b110.setForeground(Color.WHITE);
	b110.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b110.setContentAreaFilled(false);
	b110.setBorder(null);
	b110.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b111=new JButton("35");
	b111.setHorizontalTextPosition(SwingConstants.CENTER);
	b111.setHorizontalAlignment(SwingConstants.LEFT);
	b111.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b111.setForeground(Color.WHITE);
	b111.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b111.setContentAreaFilled(false);
	b111.setBorder(null);
	b111.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b112=new JButton("36");
	b112.setHorizontalTextPosition(SwingConstants.CENTER);
	b112.setHorizontalAlignment(SwingConstants.LEFT);
	b112.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b112.setForeground(Color.WHITE);
	b112.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b112.setContentAreaFilled(false);
	b112.setBorder(null);
	b112.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b113=new JButton("37");
	b113.setHorizontalTextPosition(SwingConstants.CENTER);
	b113.setHorizontalAlignment(SwingConstants.LEFT);
	b113.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b113.setForeground(Color.WHITE);
	b113.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b113.setContentAreaFilled(false);
	b113.setBorder(null);
	b113.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b114=new JButton("38");
	b114.setHorizontalTextPosition(SwingConstants.CENTER);
	b114.setHorizontalAlignment(SwingConstants.LEFT);
	b114.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b114.setForeground(Color.WHITE);
	b114.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b114.setContentAreaFilled(false);
	b114.setBorder(null);
	b114.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b115=new JButton("39");
	b115.setHorizontalTextPosition(SwingConstants.CENTER);
	b115.setHorizontalAlignment(SwingConstants.LEFT);
	b115.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b115.setForeground(Color.WHITE);
	b115.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b115.setContentAreaFilled(false);
	b115.setBorder(null);
	b115.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b116=new JButton("40");
	b116.setHorizontalTextPosition(SwingConstants.CENTER);
	b116.setHorizontalAlignment(SwingConstants.LEFT);
	b116.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b116.setForeground(Color.WHITE);
	b116.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b116.setContentAreaFilled(false);
	b116.setBorder(null);
	b116.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b117=new JButton("41");
	b117.setHorizontalTextPosition(SwingConstants.CENTER);
	b117.setHorizontalAlignment(SwingConstants.LEFT);
	b117.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b117.setForeground(Color.WHITE);
	b117.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b117.setContentAreaFilled(false);
	b117.setBorder(null);
	b117.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b118=new JButton("42");
	b118.setHorizontalTextPosition(SwingConstants.CENTER);
	b118.setHorizontalAlignment(SwingConstants.LEFT);
	b118.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b118.setForeground(Color.WHITE);
	b118.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b118.setContentAreaFilled(false);
	b118.setBorder(null);
	b118.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b119=new JButton("43");
	b119.setHorizontalTextPosition(SwingConstants.CENTER);
	b119.setHorizontalAlignment(SwingConstants.LEFT);
	b119.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b119.setForeground(Color.WHITE);
	b119.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b119.setContentAreaFilled(false);
	b119.setBorder(null);
	b119.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b120=new JButton("44");
	b120.setHorizontalTextPosition(SwingConstants.CENTER);
	b120.setHorizontalAlignment(SwingConstants.LEFT);
	b120.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b120.setForeground(Color.WHITE);
	b120.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b120.setContentAreaFilled(false);
	b120.setBorder(null);
	b120.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b121=new JButton("45");
	b121.setHorizontalTextPosition(SwingConstants.CENTER);
	b121.setHorizontalAlignment(SwingConstants.LEFT);
	b121.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b121.setForeground(Color.WHITE);
	b121.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b121.setContentAreaFilled(false);
	b121.setBorder(null);
	b121.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b122=new JButton("46");
	b122.setHorizontalTextPosition(SwingConstants.CENTER);
	b122.setHorizontalAlignment(SwingConstants.LEFT);
	b122.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b122.setForeground(Color.WHITE);
	b122.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b122.setContentAreaFilled(false);
	b122.setBorder(null);
	b122.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b123=new JButton("47");
	b123.setHorizontalTextPosition(SwingConstants.CENTER);
	b123.setHorizontalAlignment(SwingConstants.LEFT);
	b123.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b123.setForeground(Color.WHITE);
	b123.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b123.setContentAreaFilled(false);
	b123.setBorder(null);
	b123.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b124=new JButton("48");
	b124.setHorizontalTextPosition(SwingConstants.CENTER);
	b124.setHorizontalAlignment(SwingConstants.LEFT);
	b124.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b124.setForeground(Color.WHITE);
	b124.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b124.setContentAreaFilled(false);
	b124.setBorder(null);
	b124.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b125=new JButton("49");
	b125.setHorizontalTextPosition(SwingConstants.CENTER);
	b125.setHorizontalAlignment(SwingConstants.LEFT);
	b125.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b125.setForeground(Color.WHITE);
	b125.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b125.setContentAreaFilled(false);
	b125.setBorder(null);
	b125.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b126=new JButton("50");
	b126.setHorizontalTextPosition(SwingConstants.CENTER);
	b126.setHorizontalAlignment(SwingConstants.LEFT);
	b126.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b126.setForeground(Color.WHITE);
	b126.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b126.setContentAreaFilled(false);
	b126.setBorder(null);
	b126.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b127=new JButton("51");
	b127.setHorizontalTextPosition(SwingConstants.CENTER);
	b127.setHorizontalAlignment(SwingConstants.LEFT);
	b127.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b127.setForeground(Color.WHITE);
	b127.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b127.setContentAreaFilled(false);
	b127.setBorder(null);
	b127.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b128=new JButton("52");
	b128.setHorizontalTextPosition(SwingConstants.CENTER);
	b128.setHorizontalAlignment(SwingConstants.LEFT);
	b128.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b128.setForeground(Color.WHITE);
	b128.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b128.setContentAreaFilled(false);
	b128.setBorder(null);
	b128.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b129=new JButton("53");
	b129.setHorizontalTextPosition(SwingConstants.CENTER);
	b129.setHorizontalAlignment(SwingConstants.LEFT);
	b129.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b129.setForeground(Color.WHITE);
	b129.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b129.setContentAreaFilled(false);
	b129.setBorder(null);
	b129.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b130=new JButton("54");
	b130.setHorizontalTextPosition(SwingConstants.CENTER);
	b130.setHorizontalAlignment(SwingConstants.LEFT);
	b130.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b130.setForeground(Color.WHITE);
	b130.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b130.setContentAreaFilled(false);
	b130.setBorder(null);
	b130.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b131=new JButton("55");
	b131.setHorizontalTextPosition(SwingConstants.CENTER);
	b131.setHorizontalAlignment(SwingConstants.LEFT);
	b131.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b131.setForeground(Color.WHITE);
	b131.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b131.setContentAreaFilled(false);
	b131.setBorder(null);
	b131.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b132=new JButton("56");
	b132.setHorizontalTextPosition(SwingConstants.CENTER);
	b132.setHorizontalAlignment(SwingConstants.LEFT);
	b132.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b132.setForeground(Color.WHITE);
	b132.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b132.setContentAreaFilled(false);
	b132.setBorder(null);
	b132.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b133=new JButton("57");
	b133.setHorizontalTextPosition(SwingConstants.CENTER);
	b133.setHorizontalAlignment(SwingConstants.LEFT);
	b133.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b133.setForeground(Color.WHITE);
	b133.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b133.setContentAreaFilled(false);
	b133.setBorder(null);
	b133.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b134=new JButton("58");
	b134.setHorizontalTextPosition(SwingConstants.CENTER);
	b134.setHorizontalAlignment(SwingConstants.LEFT);
	b134.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b134.setForeground(Color.WHITE);
	b134.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b134.setContentAreaFilled(false);
	b134.setBorder(null);
	b134.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b135=new JButton("59");
	b135.setHorizontalTextPosition(SwingConstants.CENTER);
	b135.setHorizontalAlignment(SwingConstants.LEFT);
	b135.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b135.setForeground(Color.WHITE);
	b135.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b135.setContentAreaFilled(false);
	b135.setBorder(null);
	b135.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	b136=new JButton("60");
	b136.setHorizontalTextPosition(SwingConstants.CENTER);
	b136.setHorizontalAlignment(SwingConstants.LEFT);
	b136.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b136.setForeground(Color.WHITE);
	b136.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b136.setContentAreaFilled(false);
	b136.setBorder(null);
	b136.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon2.png")));
	u1=new JButton();
	u1.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u1.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u1.setHorizontalTextPosition(SwingConstants.CENTER);
	u1.setForeground(Color.WHITE);
	u1.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u1.setContentAreaFilled(false);
	u1.setBorderPainted(false);
	u1.setBorder(null);
	u2=new JButton();
	u2.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u2.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u2.setHorizontalTextPosition(SwingConstants.CENTER);
	u2.setForeground(Color.WHITE);
	u2.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u2.setContentAreaFilled(false);
	u2.setBorderPainted(false);
	u2.setBorder(null);
	u3=new JButton();
	u3.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u3.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u3.setHorizontalTextPosition(SwingConstants.CENTER);
	u3.setForeground(Color.WHITE);
	u3.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u3.setContentAreaFilled(false);
	u3.setBorderPainted(false);
	u3.setBorder(null);
	u4=new JButton();
	u4.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u4.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u4.setHorizontalTextPosition(SwingConstants.CENTER);
	u4.setForeground(Color.WHITE);
	u4.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u4.setContentAreaFilled(false);
	u4.setBorderPainted(false);
	u4.setBorder(null);
	u5=new JButton();
	u5.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u5.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u5.setHorizontalTextPosition(SwingConstants.CENTER);
	u5.setForeground(Color.WHITE);
	u5.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u5.setContentAreaFilled(false);
	u5.setBorderPainted(false);
	u5.setBorder(null);
	u6=new JButton();
	u6.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u6.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u6.setHorizontalTextPosition(SwingConstants.CENTER);
	u6.setForeground(Color.WHITE);
	u6.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u6.setContentAreaFilled(false);
	u6.setBorderPainted(false);
	u6.setBorder(null);
	u7=new JButton();
	u7.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u7.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u7.setHorizontalTextPosition(SwingConstants.CENTER);
	u7.setForeground(Color.WHITE);
	u7.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u7.setContentAreaFilled(false);
	u7.setBorderPainted(false);
	u7.setBorder(null);
	u8=new JButton();
	u8.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u8.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u8.setHorizontalTextPosition(SwingConstants.CENTER);
	u8.setForeground(Color.WHITE);
	u8.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u8.setContentAreaFilled(false);
	u8.setBorderPainted(false);
	u8.setBorder(null);
	u9=new JButton();
	u9.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u9.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u9.setHorizontalTextPosition(SwingConstants.CENTER);
	u9.setForeground(Color.WHITE);
	u9.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u9.setContentAreaFilled(false);
	u9.setBorderPainted(false);
	u9.setBorder(null);
	u10=new JButton();
	u10.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u10.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u10.setHorizontalTextPosition(SwingConstants.CENTER);
	u10.setForeground(Color.WHITE);
	u10.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u10.setContentAreaFilled(false);
	u10.setBorderPainted(false);
	u10.setBorder(null);
	u11=new JButton();
	u11.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u11.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u11.setHorizontalTextPosition(SwingConstants.CENTER);
	u11.setForeground(Color.WHITE);
	u11.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u11.setContentAreaFilled(false);
	u11.setBorderPainted(false);
	u11.setBorder(null);
	u12=new JButton();
	u12.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u12.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u12.setHorizontalTextPosition(SwingConstants.CENTER);
	u12.setForeground(Color.WHITE);
	u12.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u12.setContentAreaFilled(false);
	u12.setBorderPainted(false);
	u12.setBorder(null);
	u13=new JButton();
	u13.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u13.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u13.setHorizontalTextPosition(SwingConstants.CENTER);
	u13.setForeground(Color.WHITE);
	u13.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u13.setContentAreaFilled(false);
	u13.setBorderPainted(false);
	u13.setBorder(null);
	u14=new JButton();
	u14.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u14.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u14.setHorizontalTextPosition(SwingConstants.CENTER);
	u14.setForeground(Color.WHITE);
	u14.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u14.setContentAreaFilled(false);
	u14.setBorderPainted(false);
	u14.setBorder(null);
	u15=new JButton();
	u15.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u15.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u15.setHorizontalTextPosition(SwingConstants.CENTER);
	u15.setForeground(Color.WHITE);
	u15.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u15.setContentAreaFilled(false);
	u15.setBorderPainted(false);
	u15.setBorder(null);
	u16=new JButton();
	u16.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u16.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u16.setHorizontalTextPosition(SwingConstants.CENTER);
	u16.setForeground(Color.WHITE);
	u16.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u16.setContentAreaFilled(false);
	u16.setBorderPainted(false);
	u16.setBorder(null);
	u17=new JButton();
	u17.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u17.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u17.setHorizontalTextPosition(SwingConstants.CENTER);
	u17.setForeground(Color.WHITE);
	u17.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u17.setContentAreaFilled(false);
	u17.setBorderPainted(false);
	u17.setBorder(null);
	u18=new JButton();
	u18.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u18.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u18.setHorizontalTextPosition(SwingConstants.CENTER);
	u18.setForeground(Color.WHITE);
	u18.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u18.setContentAreaFilled(false);
	u18.setBorderPainted(false);
	u18.setBorder(null);
	u19=new JButton();
	u19.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u19.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u19.setHorizontalTextPosition(SwingConstants.CENTER);
	u19.setForeground(Color.WHITE);
	u19.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u19.setContentAreaFilled(false);
	u19.setBorderPainted(false);
	u19.setBorder(null);
	u20=new JButton();
	u20.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll.png")));
	u20.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Roll2.png")));
	u20.setHorizontalTextPosition(SwingConstants.CENTER);
	u20.setForeground(Color.WHITE);
	u20.setFont(new Font("Century Gothic", Font.BOLD, 18));
	u20.setContentAreaFilled(false);
	u20.setBorderPainted(false);
	u20.setBorder(null);
	x1=new JButton();
	x1.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	x1.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	x1.setContentAreaFilled(false);
	x1.setBorder(null);
	x2=new JButton();
	x2.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	x2.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	x2.setContentAreaFilled(false);
	x2.setBorder(null);
	x3=new JButton();
	x3.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	x3.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	x3.setContentAreaFilled(false);
	x3.setBorder(null);
	x4=new JButton();
	x4.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	x4.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	x4.setContentAreaFilled(false);
	x4.setBorder(null);
	x5=new JButton();
	x5.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	x5.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	x5.setContentAreaFilled(false);
	x5.setBorder(null);
	x6=new JButton();
	x6.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	x6.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	x6.setContentAreaFilled(false);
	x6.setBorder(null);
	x7=new JButton();
	x7.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	x7.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	x7.setContentAreaFilled(false);
	x7.setBorder(null);
	x8=new JButton();
	x8.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	x8.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	x8.setContentAreaFilled(false);
	x8.setBorder(null);
	x9=new JButton();
	x9.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	x9.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	x9.setContentAreaFilled(false);
	x9.setBorder(null);
	x10=new JButton();
	x10.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose2.png")));
	x10.setIcon(new ImageIcon(MCQ.class.getResource("/Button/IMGClose.png")));
	x10.setContentAreaFilled(false);
	x10.setBorder(null);
	b27.setForeground(Color.WHITE);
	b27.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b27.setBorder(null);
	b27.setContentAreaFilled(false);
	b27.setHorizontalTextPosition(SwingConstants.CENTER);
	b27.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b28.setForeground(Color.WHITE);
	b28.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b28.setBorder(null);
	b28.setContentAreaFilled(false);
	b28.setHorizontalTextPosition(SwingConstants.CENTER);
	b28.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b29.setForeground(Color.WHITE);
	b29.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b29.setBorder(null);
	b29.setContentAreaFilled(false);
	b29.setHorizontalTextPosition(SwingConstants.CENTER);
	b29.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b30.setForeground(Color.WHITE);
	b30.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b30.setBorder(null);
	b30.setContentAreaFilled(false);
	b30.setHorizontalTextPosition(SwingConstants.CENTER);
	b30.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b31.setForeground(Color.WHITE);
	b31.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b31.setBorder(null);
	b31.setContentAreaFilled(false);
	b31.setHorizontalTextPosition(SwingConstants.CENTER);
	b31.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b32.setForeground(Color.WHITE);
	b32.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b32.setBorder(null);
	b32.setContentAreaFilled(false);
	b32.setHorizontalTextPosition(SwingConstants.CENTER);
	b32.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b33.setForeground(Color.WHITE);
	b33.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b33.setBorder(null);
	b33.setContentAreaFilled(false);
	b33.setHorizontalTextPosition(SwingConstants.CENTER);
	b33.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b34.setForeground(Color.WHITE);
	b34.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b34.setBorder(null);
	b34.setContentAreaFilled(false);
	b34.setHorizontalTextPosition(SwingConstants.CENTER);
	b34.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b35.setForeground(Color.WHITE);
	b35.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b35.setBorder(null);
	b35.setContentAreaFilled(false);
	b35.setHorizontalTextPosition(SwingConstants.CENTER);
	b35.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b36.setForeground(Color.WHITE);
	b36.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b36.setBorder(null);
	b36.setContentAreaFilled(false);
	b36.setHorizontalTextPosition(SwingConstants.CENTER);
	b36.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b37.setForeground(Color.WHITE);
	b37.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b37.setBorder(null);
	b37.setContentAreaFilled(false);
	b37.setHorizontalTextPosition(SwingConstants.CENTER);
	b37.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b38.setForeground(Color.WHITE);
	b38.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b38.setBorder(null);
	b38.setContentAreaFilled(false);
	b38.setHorizontalTextPosition(SwingConstants.CENTER);
	b38.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b39.setForeground(Color.WHITE);
	b39.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b39.setBorder(null);
	b39.setContentAreaFilled(false);
	b39.setHorizontalTextPosition(SwingConstants.CENTER);
	b39.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b40.setForeground(Color.WHITE);
	b40.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b40.setBorder(null);
	b40.setContentAreaFilled(false);
	b40.setHorizontalTextPosition(SwingConstants.CENTER);
	b40.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b41.setForeground(Color.WHITE);
	b41.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b41.setBorder(null);
	b41.setContentAreaFilled(false);
	b41.setHorizontalTextPosition(SwingConstants.CENTER);
	b41.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b42.setForeground(Color.WHITE);
	b42.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b42.setBorder(null);
	b42.setContentAreaFilled(false);
	b42.setHorizontalTextPosition(SwingConstants.CENTER);
	b42.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b43.setForeground(Color.WHITE);
	b43.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b43.setBorder(null);
	b43.setContentAreaFilled(false);
	b43.setHorizontalTextPosition(SwingConstants.CENTER);
	b43.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b44.setForeground(Color.WHITE);
	b44.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b44.setBorder(null);
	b44.setContentAreaFilled(false);
	b44.setHorizontalTextPosition(SwingConstants.CENTER);
	b44.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b45.setForeground(Color.WHITE);
	b45.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b45.setBorder(null);
	b45.setContentAreaFilled(false);
	b45.setHorizontalTextPosition(SwingConstants.CENTER);
	b45.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b46.setForeground(Color.WHITE);
	b46.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b46.setBorder(null);
	b46.setContentAreaFilled(false);
	b46.setHorizontalTextPosition(SwingConstants.CENTER);
	b46.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b47.setForeground(Color.WHITE);
	b47.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b47.setBorder(null);
	b47.setContentAreaFilled(false);
	b47.setHorizontalTextPosition(SwingConstants.CENTER);
	b47.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b48.setForeground(Color.WHITE);
	b48.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b48.setBorder(null);
	b48.setContentAreaFilled(false);
	b48.setHorizontalTextPosition(SwingConstants.CENTER);
	b48.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b49.setForeground(Color.WHITE);
	b49.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b49.setBorder(null);
	b49.setContentAreaFilled(false);
	b49.setHorizontalTextPosition(SwingConstants.CENTER);
	b49.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b50.setForeground(Color.WHITE);
	b50.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b50.setBorder(null);
	b50.setContentAreaFilled(false);
	b50.setHorizontalTextPosition(SwingConstants.CENTER);
	b50.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b51.setForeground(Color.WHITE);
	b51.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b51.setBorder(null);
	b51.setContentAreaFilled(false);
	b51.setHorizontalTextPosition(SwingConstants.CENTER);
	b51.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b52.setForeground(Color.WHITE);
	b52.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b52.setBorder(null);
	b52.setContentAreaFilled(false);
	b52.setHorizontalTextPosition(SwingConstants.CENTER);
	b52.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b53.setForeground(Color.WHITE);
	b53.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b53.setBorder(null);
	b53.setContentAreaFilled(false);
	b53.setHorizontalTextPosition(SwingConstants.CENTER);
	b53.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b54.setForeground(Color.WHITE);
	b54.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b54.setBorder(null);
	b54.setContentAreaFilled(false);
	b54.setHorizontalTextPosition(SwingConstants.CENTER);
	b54.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b55.setForeground(Color.WHITE);
	b55.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b55.setBorder(null);
	b55.setContentAreaFilled(false);
	b55.setHorizontalTextPosition(SwingConstants.CENTER);
	b55.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b56.setForeground(Color.WHITE);
	b56.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b56.setBorder(null);
	b56.setContentAreaFilled(false);
	b56.setHorizontalTextPosition(SwingConstants.CENTER);
	b56.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b57.setForeground(Color.WHITE);
	b57.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b57.setBorder(null);
	b57.setContentAreaFilled(false);
	b57.setHorizontalTextPosition(SwingConstants.CENTER);
	b57.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b58.setForeground(Color.WHITE);
	b58.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b58.setBorder(null);
	b58.setContentAreaFilled(false);
	b58.setHorizontalTextPosition(SwingConstants.CENTER);
	b58.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b59.setForeground(Color.WHITE);
	b59.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b59.setBorder(null);
	b59.setContentAreaFilled(false);
	b59.setHorizontalTextPosition(SwingConstants.CENTER);
	b59.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b60.setForeground(Color.WHITE);
	b60.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b60.setBorder(null);
	b60.setContentAreaFilled(false);
	b60.setHorizontalTextPosition(SwingConstants.CENTER);
	b60.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b61.setForeground(Color.WHITE);
	b61.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b61.setBorder(null);
	b61.setContentAreaFilled(false);
	b61.setHorizontalTextPosition(SwingConstants.CENTER);
	b61.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b62.setForeground(Color.WHITE);
	b62.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b62.setBorder(null);
	b62.setContentAreaFilled(false);
	b62.setHorizontalTextPosition(SwingConstants.CENTER);
	b62.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b63.setForeground(Color.WHITE);
	b63.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b63.setBorder(null);
	b63.setContentAreaFilled(false);
	b63.setHorizontalTextPosition(SwingConstants.CENTER);
	b63.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b64.setForeground(Color.WHITE);
	b64.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b64.setBorder(null);
	b64.setContentAreaFilled(false);
	b64.setHorizontalTextPosition(SwingConstants.CENTER);
	b64.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b65.setForeground(Color.WHITE);
	b65.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b65.setBorder(null);
	b65.setContentAreaFilled(false);
	b65.setHorizontalTextPosition(SwingConstants.CENTER);
	b65.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b66.setForeground(Color.WHITE);
	b66.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b66.setBorder(null);
	b66.setContentAreaFilled(false);
	b66.setHorizontalTextPosition(SwingConstants.CENTER);
	b66.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b67.setForeground(Color.WHITE);
	b67.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b67.setBorder(null);
	b67.setContentAreaFilled(false);
	b67.setHorizontalTextPosition(SwingConstants.CENTER);
	b67.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b68.setForeground(Color.WHITE);
	b68.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b68.setBorder(null);
	b68.setContentAreaFilled(false);
	b68.setHorizontalTextPosition(SwingConstants.CENTER);
	b68.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b69.setForeground(Color.WHITE);
	b69.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b69.setBorder(null);
	b69.setContentAreaFilled(false);
	b69.setHorizontalTextPosition(SwingConstants.CENTER);
	b69.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b70.setForeground(Color.WHITE);
	b70.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b70.setBorder(null);
	b70.setContentAreaFilled(false);
	b70.setHorizontalTextPosition(SwingConstants.CENTER);
	b70.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b71.setForeground(Color.WHITE);
	b71.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b71.setBorder(null);
	b71.setContentAreaFilled(false);
	b71.setHorizontalTextPosition(SwingConstants.CENTER);
	b71.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b72.setForeground(Color.WHITE);
	b72.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b72.setBorder(null);
	b72.setContentAreaFilled(false);
	b72.setHorizontalTextPosition(SwingConstants.CENTER);
	b72.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b73.setForeground(Color.WHITE);
	b73.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b73.setBorder(null);
	b73.setContentAreaFilled(false);
	b73.setHorizontalTextPosition(SwingConstants.CENTER);
	b73.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b74.setForeground(Color.WHITE);
	b74.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b74.setBorder(null);
	b74.setContentAreaFilled(false);
	b74.setHorizontalTextPosition(SwingConstants.CENTER);
	b74.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b75.setForeground(Color.WHITE);
	b75.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b75.setBorder(null);
	b75.setContentAreaFilled(false);
	b75.setHorizontalTextPosition(SwingConstants.CENTER);
	b75.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	b76.setForeground(Color.WHITE);
	b76.setFont(new Font("Century Gothic", Font.BOLD, 20));
	b76.setBorder(null);
	b76.setContentAreaFilled(false);
	b76.setHorizontalTextPosition(SwingConstants.CENTER);
	b76.setIcon(new ImageIcon(MCQ.class.getResource("/Button/QIcon.png")));
	c1=new JCheckBox("I");
	c1.setForeground(Color.WHITE);
	c1.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c1.setContentAreaFilled(false);
	c2=new JCheckBox("II");
	c2.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c2.setForeground(Color.WHITE);
	c2.setContentAreaFilled(false);
	c3=new JCheckBox("III");
	c3.setForeground(Color.WHITE);
	c3.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c3.setContentAreaFilled(false);
	c4=new JCheckBox("IV");
	c4.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c4.setForeground(Color.WHITE);
	c4.setContentAreaFilled(false);
	c5=new JCheckBox("V");
	c5.setForeground(Color.WHITE);
	c5.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c5.setContentAreaFilled(false);
	c6=new JCheckBox("I)");
	c6.setForeground(Color.WHITE);
	c6.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c6.setContentAreaFilled(false);
	c6.setVerticalAlignment(SwingConstants.TOP);
	c7=new JCheckBox("II)");
	c7.setForeground(Color.WHITE);
	c7.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c7.setContentAreaFilled(false);
	c7.setVerticalAlignment(SwingConstants.TOP);
	c8=new JCheckBox("III)");
	c8.setForeground(Color.WHITE);
	c8.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c8.setContentAreaFilled(false);
	c8.setVerticalAlignment(SwingConstants.TOP);
	c9=new JCheckBox("IV)");
	c9.setForeground(Color.WHITE);
	c9.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c9.setContentAreaFilled(false);
	c9.setVerticalAlignment(SwingConstants.TOP);
	c10=new JCheckBox("V)");
	c10.setForeground(Color.WHITE);
	c10.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c10.setContentAreaFilled(false);
	c10.setVerticalAlignment(SwingConstants.TOP);
	c11=new JCheckBox("Show/Hide");
	c11.setForeground(Color.WHITE);
	c11.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c11.setContentAreaFilled(false);
	c12=new JCheckBox("Show/Hide");
	c12.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c12.setForeground(Color.WHITE);
	c12.setContentAreaFilled(false);
	c13=new JCheckBox("Show/Hide");
	c13.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c13.setForeground(Color.WHITE);
	c13.setContentAreaFilled(false);
	c14=new JCheckBox("Show/Hide");
	c14.setFont(new Font("Century Gothic", Font.BOLD, 18));
	c14.setForeground(Color.WHITE);
	c14.setContentAreaFilled(false);
	l22.setText("setting bounds...");
	jmb1=new JMenuBar();
	jmb1.setBorderPainted(false);
	jmb1.setBorder(null);
	jmb1.setOpaque(false);
	jmb2=new JMenuBar();
	jmb2.setBorderPainted(false);
	jmb2.setBorder(null);
	jmb2.setOpaque(false);
	jm1=new JMenu("");
	jm1.setDoubleBuffered(true);
	jm1.setHorizontalTextPosition(SwingConstants.CENTER);
	jm1.setHorizontalAlignment(SwingConstants.CENTER);
	jm1.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Menu.png")));
	jm1.setContentAreaFilled(false);
	jm1.setBorder(null);
	jm2=new JMenu("");
	jm2.setHorizontalAlignment(SwingConstants.CENTER);
	jm2.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Menu.png")));
	jm2.setContentAreaFilled(false);
	jm2.setBorder(null);
	jmi3=new JMenuItem("Your Status");
	jmi3.setBorder(null);
	jmi3.setContentAreaFilled(false);
	jmi3.setIcon(new ImageIcon(MCQ.class.getResource("/ICO/StatSelectS.png")));
	jmi5=new JMenuItem("About");
	jmi5.setIcon(new ImageIcon(MCQ.class.getResource("/ICO/AboutS.png")));
	jmi5.setContentAreaFilled(false);
	jmb1.add(jm1);
	jmb2.add(jm2);
	jm1.add(jmi3);
	jmi2=new JMenuItem("About");
	jmi2.setBorder(null);
	jmi2.setContentAreaFilled(false);
	jmi2.setIcon(new ImageIcon(MCQ.class.getResource("/ICO/AboutS.png")));
	jm1.add(jmi2);
	jmi2.addActionListener(null);
	jmi1=new JMenuItem("Log out");
	jmi1.setBorder(null);
	jmi1.setContentAreaFilled(false);
	jmi1.setIcon(new ImageIcon(MCQ.class.getResource("/ICO/Logout.png")));
	jm1.add(jmi1);
	jmi1.addActionListener(null);
	jm2.add(jmi5);
	jmi4=new JMenuItem("Log out");
	jmi4.setIcon(new ImageIcon(MCQ.class.getResource("/ICO/Logout.png")));
	jmi4.setContentAreaFilled(false);
	jm2.add(jmi4);
	fc1=new JFileChooser();
	fi1=new File("");
	jmb1.setBounds(0,0,47,35);
	jmb2.setBounds(0,0,47,35);
	l1.setBounds(379,372,100,25);
	l2.setBounds(35,53,540,140);
	l3.setBounds(74,200,72,30);
	l4.setBounds(44,26,120,25);
	l5.setBounds(379,384,100,25);
	l6.setBounds(379,437,100,25);
	l7.setBounds(379,452,100,25);
	l8.setBounds(75,177,400,40);
	l9.setBounds(374,179,115,25);
	l10.setBounds(374,255,115,25);
	l11.setBounds(374,407,115,44);
	l12.setBounds(392,264,400,30);
	l13.setBounds(352,31,479,43);
	l14.setBounds(400,105,383,30);
	l15.setBounds(379,40,425,52);
	l16.setBounds(259,43,666,55);
	l17.setBounds(374,51,435,77);
	l18.setBounds(334,23,515,30);
	l19.setBounds(348,76,488,30);
	l20.setBounds(375,68,433,30);
	l21.setBounds(30,175,333,161);
	l23.setBounds(571,363,30,30);
	l24.setBounds(223,600,78,30);
	l25.setBounds(827,600,78,30);
	l26.setBounds(560,363,30,30);
	l27.setBounds(152,129,231,36);
	l28.setBounds(784,129,164,37);
	l29.setBounds(212,21,30,30);
	l30.setBounds(265,166,654,30);
	l32.setBounds(204,25,162,126);
	l33.setBounds(392,460,400,30);
	l34.setBounds(392,558,400,30);
	l35.setBounds(392,362,400,30);
	l37.setBounds(44,273,152,25);
	l38.setBounds(203,139,152,25);
	l39.setBounds(892,139,152,25);
	l40.setBounds(516,32,152,25);
	l41.setBounds(407,83,370,25);
	l42.setBounds(638,376,30,30);
	l43.setBounds(612,46,140,140);
	l44.setBounds(44,85,175,175);
	lb1.setSize(1200,700);
	lb2.setSize(1200,700);
	lb3.setSize(1200,700);
	lb4.setSize(1200,700);
	lb5.setSize(1200,700);
	lb6.setSize(1200,700);
	lb7.setSize(1200,700);
	lb8.setSize(1200,700);
	lb9.setSize(400,400);
	lb17.setSize(1200,700);
	lb18.setSize(1200,700);
	lb10.setBounds(41,246,335,50);
	lb11.setBounds(417,246,335,50);
	lb12.setBounds(41,349,335,50);
	lb13.setBounds(417,349,335,50);
	lb14.setBounds(220,452,354,50);
	lb15.setBounds(27,25,150,150);
	lb16.setBounds(492,141,200,200);
	lb19.setBounds(492,132,200,200);
	t1.setBounds(149,200,433,30);
	t2.setBounds(252,26,433,272);
	t3.setBounds(119,324,569,25);
	t4.setBounds(119,375,569,25);
	t5.setBounds(119,426,569,25);
	t6.setBounds(119,477,569,25);
	t7.setBounds(119,528,569,25);
	t8.setBounds(504,384,300,25);
	t9.setBounds(504,372,300,25);
	t10.setBounds(500,179,299,25);
	p1.setBounds(504,437,300,25);
	p2.setBounds(504,452,300,25);
	p3.setBounds(500,255,299,25);
	p4.setBounds(500,407,299,25);
	c1.setBounds(44,324,50,25);
	c2.setBounds(44,375,50,25);
	c3.setBounds(44,426,50,25);
	c4.setBounds(44,477,50,25);
	c5.setBounds(44,528,50,25);
	c6.setBounds(41,246,335,50);
	c7.setBounds(417,246,335,50);
	c8.setBounds(41,349,335,50);
	c9.setBounds(417,349,335,50);
	c10.setBounds(220,452,354,50);
	c11.setBounds(534,502,119,25);
	c12.setBounds(532,520,119,25);
	c13.setBounds(530,331,123,25);
	c14.setBounds(530,483,123,25);
	b1.setBounds(295,555,200,50);
	b2.setBounds(74,166,508,400);
	b3.setBounds(600,166,508,400);
	b4.setBounds(379,567,150,50);
	b5.setBounds(654,567,150,50);
	b6.setBounds(44,579,150,50);
	b7.setBounds(268,579,200,50);
	b8.setBounds(208,148,50,50);
	b9.setBounds(199,85,20,20);
	b10.setBounds(538,579,150,50);
	b11.setBounds(602,555,150,50);
	b12.setBounds(41,555,150,50);
	b13.setBounds(492,588,200,50);
	b14.setBounds(792,588,150,50);
	b15.setBounds(242,588,150,50);
	b16.setBounds(374,559,150,50);
	b17.setBounds(649,559,150,50);
	b18.setBounds(924,148,50,50);
	b19.setBounds(600,177,508,436);
	b20.setBounds(1074,600,100,50);
	b21.setBounds(74,259,508,360);
	b23.setBounds(44,85,175,175);
	b24.setBounds(612,46,140,140);
	b27.setBounds(815,24,50,50);
	b28.setBounds(875,24,50,50);
	b29.setBounds(935,24,50,50);
	b30.setBounds(995,24,50,50);
	b31.setBounds(1055,24,50,50);
	b32.setBounds(1115,24,50,50);
	b33.setBounds(815,93,50,50);
	b34.setBounds(875,93,50,50);
	b35.setBounds(935,93,50,50);
	b36.setBounds(995,93,50,50);
	b37.setBounds(1055,93,50,50);
	b38.setBounds(1115,93,50,50);
	b39.setBounds(815,163,50,50);
	b40.setBounds(875,163,50,50);
	b41.setBounds(935,163,50,50);
	b42.setBounds(995,163,50,50);
	b43.setBounds(1055,163,50,50);
	b44.setBounds(1115,163,50,50);
	b45.setBounds(815,234,50,50);
	b46.setBounds(875,234,50,50);
	b47.setBounds(935,234,50,50);
	b48.setBounds(995,234,50,50);
	b49.setBounds(1055,234,50,50);
	b50.setBounds(1115,234,50,50);
	b51.setBounds(815,305,50,50);
	b52.setBounds(875,305,50,50);
	b53.setBounds(935,305,50,50);
	b54.setBounds(995,305,50,50);
	b55.setBounds(1055,305,50,50);
	b56.setBounds(1115,305,50,50);
	b57.setBounds(815,376,50,50);
	b58.setBounds(875,376,50,50);
	b59.setBounds(935,376,50,50);
	b60.setBounds(995,376,50,50);
	b61.setBounds(1055,376,50,50);
	b62.setBounds(1115,376,50,50);
	b63.setBounds(815,447,50,50);
	b64.setBounds(875,447,50,50);
	b65.setBounds(935,447,50,50);
	b66.setBounds(995,447,50,50);
	b67.setBounds(1055,447,50,50);
	b68.setBounds(1115,447,50,50);
	b69.setBounds(815,518,50,50);
	b70.setBounds(875,518,50,50);
	b71.setBounds(935,518,50,50);
	b72.setBounds(995,518,50,50);
	b73.setBounds(1055,518,50,50);
	b74.setBounds(1115,518,50,50);
	b75.setBounds(935,589,50,50);
	b76.setBounds(995,589,50,50);
	b77.setBounds(736,55,50,50);
	b78.setBounds(796,55,50,50);
	b79.setBounds(856,55,50,50);
	b80.setBounds(916,55,50,50);
	b81.setBounds(976,55,50,50);
	b82.setBounds(1036,55,50,50);
	b83.setBounds(1096,55,50,50);
	b84.setBounds(736,120,50,50);
	b85.setBounds(796,120,50,50);
	b86.setBounds(856,120,50,50);
	b87.setBounds(916,120,50,50);
	b88.setBounds(976,120,50,50);
	b89.setBounds(1036,120,50,50);
	b90.setBounds(1096,120,50,50);
	b91.setBounds(736,181,50,50);
	b92.setBounds(796,181,50,50);
	b93.setBounds(856,181,50,50);
	b94.setBounds(916,181,50,50);
	b95.setBounds(976,181,50,50);
	b96.setBounds(1036,181,50,50);
	b97.setBounds(1096,181,50,50);
	b98.setBounds(736,246,50,50);
	b99.setBounds(796,246,50,50);
	b100.setBounds(856,246,50,50);
	b101.setBounds(916,246,50,50);
	b102.setBounds(976,246,50,50);
	b103.setBounds(1036,246,50,50);
	b104.setBounds(1096,246,50,50);
	b105.setBounds(736,307,50,50);
	b106.setBounds(796,307,50,50);
	b107.setBounds(856,307,50,50);
	b108.setBounds(916,307,50,50);
	b109.setBounds(976,307,50,50);
	b110.setBounds(1036,307,50,50);
	b111.setBounds(1096,307,50,50);
	b112.setBounds(736,371,50,50);
	b113.setBounds(796,368,50,50);
	b114.setBounds(856,368,50,50);
	b115.setBounds(916,368,50,50);
	b116.setBounds(976,368,50,50);
	b117.setBounds(1036,371,50,50);
	b118.setBounds(1096,371,50,50);
	b119.setBounds(736,432,50,50);
	b120.setBounds(796,432,50,50);
	b121.setBounds(856,432,50,50);
	b122.setBounds(916,432,50,50);
	b123.setBounds(976,432,50,50);
	b124.setBounds(1036,432,50,50);
	b125.setBounds(1096,432,50,50);
	b126.setBounds(736,493,50,50);
	b127.setBounds(796,493,50,50);
	b128.setBounds(856,493,50,50);
	b129.setBounds(916,493,50,50);
	b130.setBounds(976,493,50,50);
	b131.setBounds(1036,493,50,50);
	b132.setBounds(1096,493,50,50);
	b133.setBounds(828,554,50,50);
	b134.setBounds(888,554,50,50);
	b135.setBounds(948,554,50,50);
	b136.setBounds(1008,554,50,50);
	u1.setBounds(755,183,400,40);
	u2.setBounds(755,227,400,40);
	u3.setBounds(755,271,400,40);
	u4.setBounds(755,315,400,40);
	u5.setBounds(755,359,400,40);
	u6.setBounds(755,403,400,40);
	u7.setBounds(755,447,400,40);
	u8.setBounds(755,491,400,40);
	u9.setBounds(755,535,400,40);
	u10.setBounds(755,579,400,40);
	u11.setBounds(75,177,400,40);
	u12.setBounds(75,221,400,40);
	u13.setBounds(75,265,400,40);
	u14.setBounds(75,309,400,40);
	u15.setBounds(75,353,400,40);
	u16.setBounds(75,397,400,40);
	u17.setBounds(75,441,400,40);
	u18.setBounds(75,485,400,40);
	u19.setBounds(75,529,400,40);
	u20.setBounds(75,573,400,40);
	x1.setBounds(1135,183,20,20);
	x2.setBounds(1135,227,20,20);
	x3.setBounds(1135,271,20,20);
	x4.setBounds(1135,315,20,20);
	x5.setBounds(1135,359,20,20);
	x6.setBounds(1135,403,20,20);
	x7.setBounds(1135,447,20,20);
	x8.setBounds(1135,491,20,20);
	x9.setBounds(1135,535,20,20);
	x10.setBounds(1135,579,20,20);
	
	//l31,b22,t1,t11,t12 is available
	
	//Frames.vimage(f12);
	//Frames.ntest(f11);
	//Frames.about(f9);
	//Frames.ressheet(f8);
	//Frames.readres(f7);
	//Frames.cslog(f6);
	//Frames.slog(f5);
	//Frames.tlog(f4);
	//Frames.fread(f1);
	//Frames.fwrite(f2);
	l22.setText("Adding Actions...");
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);
	b8.addActionListener(this);
	b9.addActionListener(this);
	b10.addActionListener(this);
	b11.addActionListener(this);
	b12.addActionListener(this);
	b13.addActionListener(this);
	b14.addActionListener(this);
	b15.addActionListener(this);
	b16.addActionListener(this);
	b17.addActionListener(this);
	b18.addActionListener(this);
	b19.addActionListener(this);
	b20.addActionListener(this);
	b21.addActionListener(this);
	b23.addActionListener(this);
	b24.addActionListener(this);
	b27.addActionListener(this);
	b28.addActionListener(this);
	b29.addActionListener(this);
	b30.addActionListener(this);
	b31.addActionListener(this);
	b32.addActionListener(this);
	b33.addActionListener(this);
	b34.addActionListener(this);
	b35.addActionListener(this);
	b36.addActionListener(this);
	b37.addActionListener(this);
	b38.addActionListener(this);
	b39.addActionListener(this);
	b40.addActionListener(this);
	b41.addActionListener(this);
	b42.addActionListener(this);
	b43.addActionListener(this);
	b44.addActionListener(this);
	b45.addActionListener(this);
	b46.addActionListener(this);
	b47.addActionListener(this);
	b48.addActionListener(this);
	b49.addActionListener(this);
	b50.addActionListener(this);
	b51.addActionListener(this);
	b52.addActionListener(this);
	b53.addActionListener(this);
	b54.addActionListener(this);
	b55.addActionListener(this);
	b56.addActionListener(this);
	b57.addActionListener(this);
	b58.addActionListener(this);
	b59.addActionListener(this);
	b60.addActionListener(this);
	b61.addActionListener(this);
	b62.addActionListener(this);
	b63.addActionListener(this);
	b64.addActionListener(this);
	b65.addActionListener(this);
	b66.addActionListener(this);
	b67.addActionListener(this);
	b68.addActionListener(this);
	b69.addActionListener(this);
	b70.addActionListener(this);
	b71.addActionListener(this);
	b72.addActionListener(this);
	b73.addActionListener(this);
	b74.addActionListener(this);
	b75.addActionListener(this);
	b76.addActionListener(this);
	b77.addActionListener(this);
	b78.addActionListener(this);
	b79.addActionListener(this);
	b80.addActionListener(this);
	b81.addActionListener(this);
	b82.addActionListener(this);
	b83.addActionListener(this);
	b84.addActionListener(this);
	b85.addActionListener(this);
	b86.addActionListener(this);
	b87.addActionListener(this);
	b88.addActionListener(this);
	b89.addActionListener(this);
	b90.addActionListener(this);
	b91.addActionListener(this);
	b92.addActionListener(this);
	b93.addActionListener(this);
	b94.addActionListener(this);
	b95.addActionListener(this);
	b96.addActionListener(this);
	b97.addActionListener(this);
	b98.addActionListener(this);
	b99.addActionListener(this);
	b100.addActionListener(this);
	b101.addActionListener(this);
	b102.addActionListener(this);
	b103.addActionListener(this);
	b104.addActionListener(this);
	b105.addActionListener(this);
	b106.addActionListener(this);
	b107.addActionListener(this);
	b108.addActionListener(this);
	b109.addActionListener(this);
	b110.addActionListener(this);
	b111.addActionListener(this);
	b112.addActionListener(this);
	b113.addActionListener(this);
	b114.addActionListener(this);
	b115.addActionListener(this);
	b116.addActionListener(this);
	b117.addActionListener(this);
	b118.addActionListener(this);
	b119.addActionListener(this);
	b120.addActionListener(this);
	b121.addActionListener(this);
	b122.addActionListener(this);
	b123.addActionListener(this);
	b124.addActionListener(this);
	b125.addActionListener(this);
	b126.addActionListener(this);
	b127.addActionListener(this);
	b128.addActionListener(this);
	b129.addActionListener(this);
	b130.addActionListener(this);
	b131.addActionListener(this);
	b132.addActionListener(this);
	b133.addActionListener(this);
	b134.addActionListener(this);
	b135.addActionListener(this);
	b136.addActionListener(this);
	u1.addActionListener(this);
	u2.addActionListener(this);
	u3.addActionListener(this);
	u4.addActionListener(this);
	u5.addActionListener(this);
	u6.addActionListener(this);
	u7.addActionListener(this);
	u9.addActionListener(this);
	u10.addActionListener(this);
	u11.addActionListener(this);
	u12.addActionListener(this);
	u13.addActionListener(this);
	u14.addActionListener(this);
	u15.addActionListener(this);
	u16.addActionListener(this);
	u17.addActionListener(this);
	u19.addActionListener(this);
	u20.addActionListener(this);
	x1.addActionListener(this);
	x2.addActionListener(this);
	x3.addActionListener(this);
	x4.addActionListener(this);
	x5.addActionListener(this);
	x6.addActionListener(this);
	x7.addActionListener(this);
	x9.addActionListener(this);
	x10.addActionListener(this);
	c1.addItemListener(this);
	c2.addItemListener(this);
	c3.addItemListener(this);
	c4.addItemListener(this);
	c5.addItemListener(this);
	c6.addItemListener(this);
	c7.addItemListener(this);
	c8.addItemListener(this);
	c9.addItemListener(this);
	c10.addItemListener(this);
	c11.addItemListener(this);
	c12.addItemListener(this);
	c13.addItemListener(this);
	c14.addItemListener(this);
	jmi1.addActionListener(this);
	jmi2.addActionListener(this);
	jmi3.addActionListener(this);
	jmi4.addActionListener(this);
	jmi5.addActionListener(this);
	f10.dispose();
	fselect(f3);
}


public static void fread(JFrame f1)
{
	f1.setVisible(true);
	f1.setSize(1200,700);
	f1.setLocation((x/2)-600,(y/2)-350);
	f1.setTitle("Answer Questions");
	f1.getContentPane().setLayout(null);
	f1.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f1.getContentPane().add(jmb1);
	f1.getContentPane().add(l2);
	f1.getContentPane().add(c6);
	f1.getContentPane().add(c7);
	f1.getContentPane().add(c8);
	f1.getContentPane().add(c9);
	f1.getContentPane().add(b1);
	f1.getContentPane().add(c10);
	f1.getContentPane().add(b11);
	f1.getContentPane().add(b12);
	f1.getContentPane().add(b24);
	f1.getContentPane().add(lb10);
	f1.getContentPane().add(lb11);
	f1.getContentPane().add(lb12);
	f1.getContentPane().add(lb13);
	f1.getContentPane().add(lb14);
	f1.getContentPane().add(l43);
	f1.getContentPane().add(b27);
	f1.getContentPane().add(b28);
	f1.getContentPane().add(b29);
	f1.getContentPane().add(b30);
	f1.getContentPane().add(b31);
	f1.getContentPane().add(b32);
	f1.getContentPane().add(b33);
	f1.getContentPane().add(b34);
	f1.getContentPane().add(b35);
	f1.getContentPane().add(b36);
	f1.getContentPane().add(b37);
	f1.getContentPane().add(b38);
	f1.getContentPane().add(b39);
	f1.getContentPane().add(b40);
	f1.getContentPane().add(b41);
	f1.getContentPane().add(b42);
	f1.getContentPane().add(b43);
	f1.getContentPane().add(b44);
	f1.getContentPane().add(b45);
	f1.getContentPane().add(b46);
	f1.getContentPane().add(b47);
	f1.getContentPane().add(b48);
	f1.getContentPane().add(b49);
	f1.getContentPane().add(b50);
	f1.getContentPane().add(b51);
	f1.getContentPane().add(b52);
	f1.getContentPane().add(b53);
	f1.getContentPane().add(b54);
	f1.getContentPane().add(b55);
	f1.getContentPane().add(b56);
	f1.getContentPane().add(b57);
	f1.getContentPane().add(b58);
	f1.getContentPane().add(b59);
	f1.getContentPane().add(b60);
	f1.getContentPane().add(b61);
	f1.getContentPane().add(b62);
	f1.getContentPane().add(b63);
	f1.getContentPane().add(b64);
	f1.getContentPane().add(b65);
	f1.getContentPane().add(b66);
	f1.getContentPane().add(b67);
	f1.getContentPane().add(b68);
	f1.getContentPane().add(b69);
	f1.getContentPane().add(b70);
	f1.getContentPane().add(b71);
	f1.getContentPane().add(b72);
	f1.getContentPane().add(b73);
	f1.getContentPane().add(b74);
	f1.getContentPane().add(b75);
	f1.getContentPane().add(b76);
	f1.getContentPane().add(lb1);
}
public static void fwrite(JFrame f2)
{
	f2.setVisible(true);
	f2.setSize(1200,700);
	f2.setLocation((x/2)-600,(y/2)-350);
	f2.setTitle("Add New Questions");
	f2.getContentPane().setLayout(null);
	f2.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f2.getContentPane().add(b9);
	f2.getContentPane().add(l4);
	f2.getContentPane().add(l29);
	f2.getContentPane().add(t2);
	f2.getContentPane().add(t3);
	f2.getContentPane().add(t4);
	f2.getContentPane().add(t5);
	f2.getContentPane().add(t6);
	f2.getContentPane().add(t7);
	f2.getContentPane().add(b6);
	f2.getContentPane().add(b7);
	f2.getContentPane().add(b10);
	f2.getContentPane().add(c1);
	f2.getContentPane().add(c2);
	f2.getContentPane().add(c3);
	f2.getContentPane().add(c4);
	f2.getContentPane().add(c5);
	f2.getContentPane().add(b23);
	f2.getContentPane().add(l44);
	f2.getContentPane().add(l37);
	f2.getContentPane().add(b77);
	f2.getContentPane().add(b78);
	f2.getContentPane().add(b79);
	f2.getContentPane().add(b80);
	f2.getContentPane().add(b81);
	f2.getContentPane().add(b82);
	f2.getContentPane().add(b83);
	f2.getContentPane().add(b84);
	f2.getContentPane().add(b85);
	f2.getContentPane().add(b86);
	f2.getContentPane().add(b87);
	f2.getContentPane().add(b88);
	f2.getContentPane().add(b89);
	f2.getContentPane().add(b90);
	f2.getContentPane().add(b91);
	f2.getContentPane().add(b92);
	f2.getContentPane().add(b93);
	f2.getContentPane().add(b94);
	f2.getContentPane().add(b95);
	f2.getContentPane().add(b96);
	f2.getContentPane().add(b97);
	f2.getContentPane().add(b98);
	f2.getContentPane().add(b99);
	f2.getContentPane().add(b100);
	f2.getContentPane().add(b101);
	f2.getContentPane().add(b102);
	f2.getContentPane().add(b103);
	f2.getContentPane().add(b104);
	f2.getContentPane().add(b105);
	f2.getContentPane().add(b106);
	f2.getContentPane().add(b107);
	f2.getContentPane().add(b108);
	f2.getContentPane().add(b109);
	f2.getContentPane().add(b110);
	f2.getContentPane().add(b111);
	f2.getContentPane().add(b112);
	f2.getContentPane().add(b113);
	f2.getContentPane().add(b114);
	f2.getContentPane().add(b115);
	f2.getContentPane().add(b116);
	f2.getContentPane().add(b117);
	f2.getContentPane().add(b118);
	f2.getContentPane().add(b119);
	f2.getContentPane().add(b120);
	f2.getContentPane().add(b121);
	f2.getContentPane().add(b122);
	f2.getContentPane().add(b123);
	f2.getContentPane().add(b124);
	f2.getContentPane().add(b125);
	f2.getContentPane().add(b126);
	f2.getContentPane().add(b127);
	f2.getContentPane().add(b128);
	f2.getContentPane().add(b129);
	f2.getContentPane().add(b130);
	f2.getContentPane().add(b131);
	f2.getContentPane().add(b132);
	f2.getContentPane().add(b133);
	f2.getContentPane().add(b134);
	f2.getContentPane().add(b135);
	f2.getContentPane().add(b136);
	f2.getContentPane().add(lb2);
}
public static void fselect(JFrame f3)
{
	f3.setVisible(true);
	f3.setTitle("Radian M.C.Q");
	f3.setSize(1200,700);
	f3.setLocation((x/2)-600,(y/2)-350);
	f3.getContentPane().setLayout(null);
	f3.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f3.getContentPane().add(b2);
	f3.getContentPane().add(b3);
	f3.getContentPane().add(l13);
	f3.getContentPane().add(l14);
	f3.getContentPane().add(b20);
	f3.getContentPane().add(l23);
	f3.getContentPane().add(l24);
	f3.getContentPane().add(l25);
	f3.getContentPane().add(lb5);
	
}
public static void tlog(JFrame f4)
{
	f4.setVisible(true);
	f4.setTitle("Teacher's Login");
	f4.setSize(1200,700);
	f4.setLocation((x/2)-600,(y/2)-350);
	f4.getContentPane().setLayout(null);
	f4.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f4.getContentPane().add(b4);
	f4.getContentPane().add(b5);
	f4.getContentPane().add(l1);
	f4.getContentPane().add(l6);
	f4.getContentPane().add(t9);
	f4.getContentPane().add(p1);
	f4.getContentPane().add(c11);
	f4.getContentPane().add(l15);
	f4.getContentPane().add(lb19);
	f4.getContentPane().add(lb4);
}
public static void slog(JFrame f5)
{
	f5.setVisible(true);
	f5.setTitle("Student's Login");
	f5.setSize(1200,700);
	f5.setLocation((x/2)-600,(y/2)-350);
	f5.getContentPane().setLayout(null);
	f5.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f5.getContentPane().add(b13);
	f5.getContentPane().add(b14);
	f5.getContentPane().add(b15);
	f5.getContentPane().add(l5);
	f5.getContentPane().add(l7);
	f5.getContentPane().add(t8);
	f5.getContentPane().add(p2);
	f5.getContentPane().add(c12);
	f5.getContentPane().add(l16);
	f5.getContentPane().add(lb16);
	f5.getContentPane().add(lb3);
}
public static void cslog(JFrame f6)
{
	f6.setVisible(true);
	f6.setTitle("Create New Student Account");
	f6.setSize(1200,700);
	f6.setLocation((x/2)-600,(y/2)-350);
	f6.getContentPane().setLayout(null);
	f6.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f6.getContentPane().add(l9);
	f6.getContentPane().add(l10);
	f6.getContentPane().add(l11);
	f6.getContentPane().add(t10);
	f6.getContentPane().add(p3);
	f6.getContentPane().add(p4);
	f6.getContentPane().add(b16);
	f6.getContentPane().add(b17);
	f6.getContentPane().add(c13);
	f6.getContentPane().add(c14);
	f6.getContentPane().add(l17);
	f6.getContentPane().add(lb6);
}
public static void readres(JFrame f7)
{
	f7.setVisible(true);
	f7.setSize(1200,700);
	f7.setLocation((x/2)-600,(y/2)-350);
	f7.setTitle("Radian M.C.Q");
	f7.getContentPane().setLayout(null);
	f7.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f7.getContentPane().add(jmb2);
	f7.getContentPane().add(b19);
	f7.getContentPane().add(u11);
	f7.getContentPane().add(u12);
	f7.getContentPane().add(u13);
	f7.getContentPane().add(u14);
	f7.getContentPane().add(u15);
	f7.getContentPane().add(u16);
	f7.getContentPane().add(u17);
	f7.getContentPane().add(u18);
	f7.getContentPane().add(u19);
	f7.getContentPane().add(u20);
	f7.getContentPane().add(l18);
	f7.getContentPane().add(l19);
	f7.getContentPane().add(l26);
	f7.getContentPane().add(l27);
	f7.getContentPane().add(l28);
	f7.getContentPane().add(l8);
	f7.getContentPane().add(lb7);
}
public static void ressheet(JFrame f8)
{
	f8.setVisible(true);
	f8.setSize(1200,700);
	f8.setLocation((x/2)-600,(y/2)-350);
	f8.setTitle("Your Status");
	f8.getContentPane().setLayout(null);
	f8.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f8.getContentPane().add(l12);
	f8.getContentPane().add(l20);
	f8.getContentPane().add(l30);
	f8.getContentPane().add(l33);
	f8.getContentPane().add(l34);
	f8.getContentPane().add(l35);
	f8.getContentPane().add(b8);
	f8.getContentPane().add(b18);
	f8.getContentPane().add(lb8);
}
public static void about(JFrame f9)
{
	f9.setVisible(true);
	f9.setSize(400,400);
	f9.setLocation((x/2)-200,(y/2)-200);
	f9.setTitle("About");
	f9.getContentPane().setLayout(null);
	f9.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f9.getContentPane().add(l21);
	f9.getContentPane().add(lb15);
	f9.getContentPane().add(l32);
	f9.getContentPane().add(lb9);
}
public static void load(JFrame f10)
{
	f10.setVisible(true);
	f10.setSize(400,200);
	f10.getContentPane().setLayout(null);
	f10.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f10.getContentPane().add(l22);
	f10.getContentPane().add(lb10);
}
public static void ntest(JFrame f11)
{
	f11.setVisible(true);
	f11.setTitle("Radian M.C.Q");
	f11.setSize(1200,700);
	f11.setLocation((x/2)-600,(y/2)-350);
	f11.getContentPane().setLayout(null);
	f11.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f11.getContentPane().add(l3);
	f11.getContentPane().add(t1);
	f11.getContentPane().add(b21);
	f11.getContentPane().add(l38);
	f11.getContentPane().add(l39);
	f11.getContentPane().add(l40);
	f11.getContentPane().add(l41);
	f11.getContentPane().add(l42);
	f11.getContentPane().add(x1);
	f11.getContentPane().add(x2);
	f11.getContentPane().add(x3);
	f11.getContentPane().add(x4);
	f11.getContentPane().add(x5);
	f11.getContentPane().add(x6);
	f11.getContentPane().add(x7);
	f11.getContentPane().add(x8);
	f11.getContentPane().add(x9);
	f11.getContentPane().add(x10);
	f11.getContentPane().add(u1);
	f11.getContentPane().add(u2);
	f11.getContentPane().add(u3);
	f11.getContentPane().add(u4);
	f11.getContentPane().add(u5);
	f11.getContentPane().add(u6);
	f11.getContentPane().add(u7);
	f11.getContentPane().add(u8);
	f11.getContentPane().add(u9);
	f11.getContentPane().add(u10);
	f11.getContentPane().add(lb17);
}
public static void vimage(JFrame f12)
{
	f12.setVisible(true);
	f12.setTitle("M.C.Q Image");
	f12.setSize(700,700);
	f12.setLocation((x/2)-350,(y/2)-350);
	f12.getContentPane().setLayout(null);
	f12.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	f12.getContentPane().add(lb18);
}

public void itemStateChanged(ItemEvent b)
{
	if(b.getItemSelectable()==c1)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
		c2.setSelected(false);
		c3.setSelected(false);
		c4.setSelected(false);
		c5.setSelected(false);
		answ=1;
		}
	}
	else if(b.getItemSelectable()==c2)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
		c1.setSelected(false);
		c3.setSelected(false);
		c4.setSelected(false);
		c5.setSelected(false);
		answ=2;
		}
	}
	else if(b.getItemSelectable()==c3)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
		c2.setSelected(false);
		c1.setSelected(false);
		c4.setSelected(false);
		c5.setSelected(false);
		answ=3;
		}
	}
	else if(b.getItemSelectable()==c4)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
		c2.setSelected(false);
		c3.setSelected(false);
		c1.setSelected(false);
		c5.setSelected(false);
		answ=4;
		}
	}
	else if(b.getItemSelectable()==c5)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
		c2.setSelected(false);
		c3.setSelected(false);
		c4.setSelected(false);
		c1.setSelected(false);
		answ=5;
		}
	}
	else if(b.getItemSelectable()==c6)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
			c7.setSelected(false);
			c8.setSelected(false);
			c9.setSelected(false);
			c10.setSelected(false);
			pla=1;
		}
	}
	else if(b.getItemSelectable()==c7)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
			c6.setSelected(false);
			c8.setSelected(false);
			c9.setSelected(false);
			c10.setSelected(false);
			pla=2;
		}
	}
	else if(b.getItemSelectable()==c8)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
			c7.setSelected(false);
			c6.setSelected(false);
			c9.setSelected(false);
			c10.setSelected(false);
			pla=3;
		}
	}
	else if(b.getItemSelectable()==c9)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
			c7.setSelected(false);
			c8.setSelected(false);
			c6.setSelected(false);
			c10.setSelected(false);
			pla=4;
		}
	}
	else if(b.getItemSelectable()==c10)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
			c7.setSelected(false);
			c8.setSelected(false);
			c9.setSelected(false);
			c6.setSelected(false);
			pla=5;
		}
	}
	else if(b.getItemSelectable()==c11)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
			p1.setEchoChar((char) 0);
		}
		else if(b.getStateChange()==ItemEvent.DESELECTED)
		{
			p1.setEchoChar('*');
		}
	}
	else if(b.getItemSelectable()==c12)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
			p2.setEchoChar((char) 0);
		}
		else if(b.getStateChange()==ItemEvent.DESELECTED)
		{
			p2.setEchoChar('*');
		}
	}
	else if(b.getItemSelectable()==c13)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
			p3.setEchoChar((char) 0);
		}
		else if(b.getStateChange()==ItemEvent.DESELECTED)
		{
			p3.setEchoChar('*');
		}
	}
	else if(b.getItemSelectable()==c14)
	{
		if(b.getStateChange()==ItemEvent.SELECTED)
		{
			p4.setEchoChar((char) 0);
		}
		else if(b.getStateChange()==ItemEvent.DESELECTED)
		{
			p4.setEchoChar('*');
		}
	}
	
}
public void actionPerformed(ActionEvent a) 
{
	if(a.getSource()==b1)
	{
		if((pla>0)||(pla<6))
		{
			if(qa==0)
			{
				if(qn<50)
				{
					Stu.next();
					if(ne==1)
					{
						Stu.nextsub();
					}
					else if(ne==0)
					{
						qa++;
						Stu.nextsub();
					}
				}
			}
			c6.setSelected(false);
			c7.setSelected(false);
			c8.setSelected(false);
			c9.setSelected(false);
			c10.setSelected(false);
			pla=0;
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Please Select An Answer For Submit !","Warning",JOptionPane.WARNING_MESSAGE);
		}
		
	}
	else if(a.getSource()==b2)
	{
		Frames.slog(f5);
	}
	else if(a.getSource()==b3)
	{
		Frames.tlog(f4);
	}
	else if(a.getSource()==b4)
	{
		un=t9.getText();
		pw=p1.getText();
		if((un.equals("1"))&&(pw.equals("1")))
		{
			p1.setText("");
			t9.setText("");
			f4.dispose();
			Teach.recentt();
			Frames.ntest(f11);
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Incorrect User Name or Passwoed","ERROR",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	else if(a.getSource()==b5)
	{
		p1.setText("");
		t9.setText("");
		f4.dispose();
	}
	else if(a.getSource()==b6)
	{
		if(an==60)
		{
			JOptionPane.showMessageDialog(this,"You Can Only Enter 60 Questions For One Paper","Questions Exceeded",JOptionPane.WARNING_MESSAGE);
		}
		else
		{
			if(nol==1)
			{
				Teach.qadd();
				Teach.aadd();
			}
			else if(nol==2)
			{
				Teach.qadd();
				Teach.aadd();
			}
		}
	}
	else if(a.getSource()==b7)
	{
		if(c1.isSelected()==true)
		{
			edan=1;
		}
		else if(c2.isSelected()==true)
		{
			edan=2;
		}
		else if(c3.isSelected()==true)
		{
			edan=3;
		}
		else if(c4.isSelected()==true)
		{
			edan=4;
		}
		else if(c5.isSelected()==true)
		{
			edan=5;
		}
		if((edan<1)||(edan>5))
		{
			JOptionPane.showMessageDialog(this,"Please Select Correct Answer!","ERROR",JOptionPane.WARNING_MESSAGE);
		}
		else
		{
			try
			{
				con.createStatement().execute("DELETE FROM questions where No='"+((ses*10000)+t1.getText())+"'");
			}
			catch(SQLException ex)
			{
				JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
			}
			if(path1=="")
			{
				try
				{
					con.createStatement().execute("insert into questions(No,Name,Sess,MCQ,One,Two,Three,Four,Five) values('"+((ses*10000)+t1.getText())+"','"+ses+"','"+t2.getText()+"','"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"')");
			
				}
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
			else
			{
				try
				{
					 sta=con.prepareStatement("insert into questions(No,Sess,MCQ,IMG,One,Two,Three,Four,Five) values('"+((ses*10000)+t1.getText())+"','"+ses+"','"+t2.getText()+"',?,'"+t3.getText()+"','"+t4.getText()+"','"+t5.getText()+"','"+t6.getText()+"','"+t7.getText()+"')");
					 fist=new FileInputStream(new File(path1));
					 sta.setBinaryStream(1,fist);
					 sta.execute();
					 path1="";
					
				}
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(null,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
				}
				catch(FileNotFoundException ex1)
				{
					JOptionPane.showMessageDialog(null,ex1.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
				}
			}
			 try
				{
					con.createStatement().execute("update answers SET ans='"+edan+"'where No='"+((ses*10000)+t1.getText())+"'");
					JOptionPane.showMessageDialog(this,"Successfully Updated");
					l44.setIcon(null);
					b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Image2.png")));
					b23.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Image.png")));
					b9.setEnabled(false);
					b9.setVisible(false);
					t1.setText("");
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
				catch(SQLException ex)
				{
					JOptionPane.showMessageDialog(this,ex.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
				}
		}
	}
	else if(a.getSource()==b8)
	{
		if(sesr>1)
		{
			if(sesr==sesmax)
			{
				b18.setEnabled(true);
				b18.setVisible(true);
			}
			sesr=sesr-1;
			if(sesr==1)
			{
				b8.setEnabled(false);
				b8.setVisible(false);
			}
			Stu.readdb();
			if(sc==0)
			{
				JOptionPane.showMessageDialog(null,"Please Complete a Test","Warrning",JOptionPane.WARNING_MESSAGE);
			}
			else if(sc==1)
			{
				Stu.stload();
			}
			Stu.streset();
		}
	}
	else if(a.getSource()==b9)
	{
		l44.setIcon(null);
		b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Image2.png")));
		b23.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Image.png")));
		path1="";
		b9.setEnabled(false);
		b9.setVisible(false);
	}
	else if(a.getSource()==b10)
	{
		t1.setText("");
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
		l44.setIcon(null);
		b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/Button/Image2.png")));
		b23.setIcon(new ImageIcon(MCQ.class.getResource("/Button/Image.png")));
		b9.setEnabled(false);
		b9.setVisible(false);
		path1="";
	}
	else if(a.getSource()==b11)
	{
		Stu.next();
		if(ne==1)
		{
		qn=qn+1;
		Stu.readdb();
		ne=0;
		}
		c6.setSelected(false);
		c7.setSelected(false);
		c8.setSelected(false);
		c9.setSelected(false);
		c10.setSelected(false);
	}
	else if(a.getSource()==b12)
	{
		if(qn>1)
		{
		qn=qn-1;
		Stu.readdb();
		}
		c6.setSelected(false);
		c7.setSelected(false);
		c8.setSelected(false);
		c9.setSelected(false);
		c10.setSelected(false);
	}
	else if(a.getSource()==b13)
	{
		clog=0;
		if(t8.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this,"Plese Enter Your Username","Warning",JOptionPane.WARNING_MESSAGE);
		}
		else if(p2.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this,"Plese Enter Your Password","Warning",JOptionPane.WARNING_MESSAGE);
		}
		else
		{
			Account.ssign();
			if(sign==0)
			{
				JOptionPane.showMessageDialog(this,"Incorrect Username Password Combination","Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		clog=log;
		log=1;
	}
	else if(a.getSource()==b14)
	{
		t8.setText("");
		p2.setText("");
		f5.dispose();
	}
	else if(a.getSource()==b15)
	{
		Frames.cslog(f6);
	}
	else if(a.getSource()==b16)
	{
		if(t10.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this,"Please Enter Your Username","Warning",JOptionPane.WARNING_MESSAGE);
		}
		else if(p3.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this,"Plese Enter Your Password","Warning",JOptionPane.WARNING_MESSAGE);
		}
		else if(p4.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this,"Plese Confirm Your Password","Warning",JOptionPane.WARNING_MESSAGE);
		}
		else if(p3.getText().equals(p4.getText()))
		{
			Account.cacc();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Password Mismatch","Warning",JOptionPane.WARNING_MESSAGE);
		}
	}
	else if(a.getSource()==b17)
	{
		f6.dispose();
	}
	else if(a.getSource()==b18)
	{
		if(sesr<sesmax)
		{
			sesr=sesr+1;
			if(sesr==sesmax)
			{
				b18.setEnabled(false);
				b18.setVisible(false);
			}
			Stu.readdb();
			if(sc==0)
			{
				JOptionPane.showMessageDialog(null,"Please Complete a Test","Warrning",JOptionPane.WARNING_MESSAGE);
			}
			else if(sc==1)
			{
				n++;
				Stu.stload();
				b8.setVisible(true);
				b8.setEnabled(true);
			}
			Stu.streset();
		}
	}
	else if(a.getSource()==b19)
	{
		qn=1;
		n=1;
		sesr=1;
		Stu.readdb();
		if(sc==0)
		{
			JOptionPane.showMessageDialog(null,"Please Complete a Test","Warrning",JOptionPane.WARNING_MESSAGE);
		}
		else if(sc==1)
		{
			Stu.stload();
			ressheet(f8);
		}
		Stu.streset();
		Stu.smax();
	}
	else if(a.getSource()==b20)
	{
		Frames.about(f9);
	}
	else if(a.getSource()==b21)
	{
		if(t1.getText().equals(""))
		{
			JOptionPane.showMessageDialog(this,"Please Enter Name For The Test","Warning",JOptionPane.WARNING_MESSAGE);
		}
		else
		{
			name=t1.getText();
			name2=t1.getText();
			t2.setText("");
			t3.setText("");
			t4.setText("");
			t5.setText("");
			t6.setText("");
			t7.setText("");
			an=1;
			l29.setText("");
			l29.setText("1. ");
			Frames.fwrite(f2);
			Teach.qnew();
			for(ik=0;ik<10;ik++)
			{
				if(namet[ik].equals("null"))
				{
					break;
				}
			}
			if(ik==0)
			{
				u1.setText(name);
				u1.setVisible(true);
				x1.setVisible(true);
			}
			else if(ik==1)
			{
				u2.setText(name);
				u2.setVisible(true);
				x2.setVisible(true);
			}
			else if(ik==2)
			{
				u3.setText(name);
				u3.setVisible(true);
				x3.setVisible(true);
			}
			else if(ik==3)
			{
				u4.setText(name);
				u4.setVisible(true);
				x4.setVisible(true);
			}
			else if(ik==4)
			{
				u5.setText(name);
				u5.setVisible(true);
				x5.setVisible(true);
			}
			else if(ik==5)
			{
				u6.setText(name);
				u6.setVisible(true);
				x6.setVisible(true);
			}
			else if(ik==6)
			{
				u7.setText(name);
				u7.setVisible(true);
				x7.setVisible(true);
			}
			else if(ik==7)
			{
				u8.setText(name);
				u8.setVisible(true);
				x8.setVisible(true);
			}
			else if(ik==8)
			{
				u9.setText(name);
				u9.setVisible(true);
				x9.setVisible(true);
			}
			else if(ik==9)
			{
				u10.setText(name);
				u10.setVisible(true);
				x10.setVisible(true);
			}
			nol=1;
			t1.setText("");
		}
	}
	else if(a.getSource()==b23)
	{
		path1="";
		fc1.setCurrentDirectory(new File(System.getProperty("user.home")));
		res=fc1.showOpenDialog(fc1);
		if (res== JFileChooser.APPROVE_OPTION) {
		    fi1=fc1.getSelectedFile();
		    path1=fi1.getAbsolutePath();
		    System.out.println(path1);
		    try 
		    {
				buf3=ImageIO.read(new File(path1));
			}
		    catch (IOException e) 
		    {
				e.printStackTrace();
			}
    		rimg3=buf3.getScaledInstance(175,175,Image.SCALE_SMOOTH);
    		l44.setIcon(new ImageIcon(rimg3));
    		b23.setIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance2.png")));
    		b23.setRolloverIcon(new ImageIcon(MCQ.class.getResource("/IMG/Trance.png")));
    		b23.repaint();
    		b9.setEnabled(true);
    		b9.setVisible(true);
		}
	}
	else if(a.getSource()==b24)
	{
		if(nimg==0)
		{
			rimg2=buf1.getScaledInstance(700,700,Image.SCALE_SMOOTH);
			lb18.setIcon(new ImageIcon(rimg2));
			Frames.vimage(f12);
		}
	}
	else if(a.getSource()==b27)
	{
		qn=1;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b28)
	{
		qn=2;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b29)
	{
		qn=3;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b30)
	{
		qn=4;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b31)
	{
		qn=5;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b32)
	{
		qn=6;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b33)
	{
		qn=7;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b34)
	{
		qn=8;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b35)
	{
		qn=9;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b36)
	{
		qn=10;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b37)
	{
		qn=11;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b38)
	{
		qn=12;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b39)
	{
		qn=13;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b40)
	{
		qn=14;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b41)
	{
		qn=15;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b42)
	{
		qn=16;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b43)
	{
		qn=17;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b44)
	{
		qn=18;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b45)
	{
		qn=19;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b46)
	{
		qn=20;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b47)
	{
		qn=21;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b48)
	{
		qn=22;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b49)
	{
		qn=23;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b50)
	{
		qn=24;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b51)
	{
		qn=25;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b52)
	{
		qn=26;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b53)
	{
		qn=27;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b54)
	{
		qn=28;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b55)
	{
		qn=29;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b56)
	{
		qn=30;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b57)
	{
		qn=31;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b58)
	{
		qn=32;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b59)
	{
		qn=33;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b60)
	{
		qn=34;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b61)
	{
		qn=35;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b62)
	{
		qn=36;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b63)
	{
		qn=37;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b64)
	{
		qn=38;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b65)
	{
		qn=39;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b66)
	{
		qn=40;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b67)
	{
		qn=41;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b68)
	{
		qn=42;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b69)
	{
		qn=43;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b70)
	{
		qn=44;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b71)
	{
		qn=45;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b72)
	{
		qn=46;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b73)
	{
		qn=47;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b74)
	{
		qn=48;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b75)
	{
		qn=49;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b76)
	{
		qn=50;
		Stu.readdb();
		if(sc==1)
		{
			Teach.cbfalse();
		}
		else
		{
			JOptionPane.showMessageDialog(this,"Not Available !","N/A",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	else if(a.getSource()==b77)
	{
		seno=1;
		Teach.sequ();
	}
	else if(a.getSource()==b78)
	{
		seno=2;
		Teach.sequ();
	}
	else if(a.getSource()==b79)
	{
		seno=3;
		Teach.sequ();
	}
	else if(a.getSource()==b80)
	{
		seno=4;
		Teach.sequ();
	}
	else if(a.getSource()==b81)
	{
		seno=5;
		Teach.sequ();
	}
	else if(a.getSource()==b82)
	{
		seno=6;
		Teach.sequ();
	}
	else if(a.getSource()==b83)
	{
		seno=7;
		Teach.sequ();
	}
	else if(a.getSource()==b84)
	{
		seno=8;
		Teach.sequ();
	}
	else if(a.getSource()==b85)
	{
		seno=9;
		Teach.sequ();
	}
	else if(a.getSource()==b86)
	{
		seno=10;
		Teach.sequ();
	}
	else if(a.getSource()==b87)
	{
		seno=11;
		Teach.sequ();
	}
	else if(a.getSource()==b88)
	{
		seno=12;
		Teach.sequ();
	}
	else if(a.getSource()==b89)
	{
		seno=13;
		Teach.sequ();
	}
	else if(a.getSource()==b90)
	{
		seno=14;
		Teach.sequ();
	}
	else if(a.getSource()==b91)
	{
		seno=15;
		Teach.sequ();
	}
	else if(a.getSource()==b92)
	{
		seno=16;
		Teach.sequ();
	}
	else if(a.getSource()==b93)
	{
		seno=17;
		Teach.sequ();
	}
	else if(a.getSource()==b94)
	{
		seno=18;
		Teach.sequ();
	}
	else if(a.getSource()==b95)
	{
		seno=19;
		Teach.sequ();
	}
	else if(a.getSource()==b96)
	{
		seno=20;
		Teach.sequ();
	}
	else if(a.getSource()==b97)
	{
		seno=21;
		Teach.sequ();
	}
	else if(a.getSource()==b98)
	{
		seno=22;
		Teach.sequ();
	}
	else if(a.getSource()==b99)
	{
		seno=23;
		Teach.sequ();
	}
	else if(a.getSource()==b100)
	{
		seno=24;
		Teach.sequ();
	}
	else if(a.getSource()==b101)
	{
		seno=25;
		Teach.sequ();
	}
	else if(a.getSource()==b102)
	{
		seno=26;
		Teach.sequ();
	}
	else if(a.getSource()==b103)
	{
		seno=27;
		Teach.sequ();
	}
	else if(a.getSource()==b104)
	{
		seno=28;
		Teach.sequ();
	}
	else if(a.getSource()==b105)
	{
		seno=29;
		Teach.sequ();
	}
	else if(a.getSource()==b106)
	{
		seno=30;
		Teach.sequ();
	}
	else if(a.getSource()==b107)
	{
		seno=31;
		Teach.sequ();
	}
	else if(a.getSource()==b108)
	{
		seno=32;
		Teach.sequ();
	}
	else if(a.getSource()==b109)
	{
		seno=33;
		Teach.sequ();
	}
	else if(a.getSource()==b110)
	{
		seno=34;
		Teach.sequ();
	}
	else if(a.getSource()==b111)
	{
		seno=35;
		Teach.sequ();
	}
	else if(a.getSource()==b112)
	{
		seno=36;
		Teach.sequ();
	}
	else if(a.getSource()==b113)
	{
		seno=37;
		Teach.sequ();
	}
	else if(a.getSource()==b114)
	{
		seno=38;
		Teach.sequ();
	}
	else if(a.getSource()==b115)
	{
		seno=39;
		Teach.sequ();
	}
	else if(a.getSource()==b116)
	{
		seno=40;
		Teach.sequ();
	}
	else if(a.getSource()==b117)
	{
		seno=41;
		Teach.sequ();
	}
	else if(a.getSource()==b118)
	{
		seno=42;
		Teach.sequ();
	}
	else if(a.getSource()==b119)
	{
		seno=43;
		Teach.sequ();
	}
	else if(a.getSource()==b120)
	{
		seno=44;
		Teach.sequ();
	}
	else if(a.getSource()==b121)
	{
		seno=45;
		Teach.sequ();
	}
	else if(a.getSource()==b122)
	{
		seno=46;
		Teach.sequ();
	}
	else if(a.getSource()==b123)
	{
		seno=47;
		Teach.sequ();
	}
	else if(a.getSource()==b124)
	{
		seno=48;
		Teach.sequ();
	}
	else if(a.getSource()==b125)
	{
		seno=49;
		Teach.sequ();
	}
	else if(a.getSource()==b126)
	{
		seno=50;
		Teach.sequ();
	}
	else if(a.getSource()==b127)
	{
		seno=51;
		Teach.sequ();
	}
	else if(a.getSource()==b128)
	{
		seno=52;
		Teach.sequ();
	}
	else if(a.getSource()==b129)
	{
		seno=53;
		Teach.sequ();
	}
	else if(a.getSource()==b130)
	{
		seno=54;
		Teach.sequ();
	}
	else if(a.getSource()==b131)
	{
		seno=55;
		Teach.sequ();
	}
	else if(a.getSource()==b132)
	{
		seno=56;
		Teach.sequ();
	}
	else if(a.getSource()==b133)
	{
		seno=57;
		Teach.sequ();
	}
	else if(a.getSource()==b134)
	{
		seno=58;
		Teach.sequ();
	}
	else if(a.getSource()==b135)
	{
		seno=59;
		Teach.sequ();
	}
	else if(a.getSource()==b136)
	{
		seno=60;
		Teach.sequ();
	}
	else if(a.getSource()==u1)
	{
		name2=u1.getText();
		ses=1;
		Teach.loadses();
	}
	else if(a.getSource()==u2)
	{
		name2=u2.getText();
		ses=2;
		Teach.loadses();
	}
	else if(a.getSource()==u3)
	{
		name2=u3.getText();
		ses=3;
		Teach.loadses();
	}
	else if(a.getSource()==u4)
	{
		name2=u4.getText();
		ses=4;
		Teach.loadses();
	}
	else if(a.getSource()==u5)
	{
		name2=u5.getText();
		ses=5;
		Teach.loadses();
	}
	else if(a.getSource()==u6)
	{
		name2=u6.getText();
		ses=6;
		Teach.loadses();
	}
	else if(a.getSource()==u7)
	{
		name2=u7.getText();
		ses=7;
		Teach.loadses();
	}
	else if(a.getSource()==u8)
	{
		name2=u8.getText();
		ses=8;
		Teach.loadses();
	}
	else if(a.getSource()==u9)
	{
		name2=u9.getText();
		ses=9;
		Teach.loadses();
	}
	else if(a.getSource()==u10)
	{
		name2=u10.getText();
		ses=10;
		Teach.loadses();
	}
	else if(a.getSource()==u11)
	{
		sesr=1;
		Stu.ubuttons();
	}
	else if(a.getSource()==u12)
	{
		sesr=2;
		Stu.ubuttons();
	}
	else if(a.getSource()==u13)
	{
		sesr=3;
		Stu.ubuttons();
	}
	else if(a.getSource()==u14)
	{
		sesr=4;
		Stu.ubuttons();
	}
	else if(a.getSource()==u15)
	{
		sesr=5;
		Stu.ubuttons();
	}
	else if(a.getSource()==u16)
	{
		sesr=6;
		Stu.ubuttons();
	}
	else if(a.getSource()==u17)
	{
		sesr=7;
		Stu.ubuttons();
	}
	else if(a.getSource()==u18)
	{
		sesr=8;
		Stu.ubuttons();
	}
	else if(a.getSource()==u19)
	{
		sesr=9;
		Stu.ubuttons();
	}
	else if(a.getSource()==u20)
	{
		sesr=10;
		Stu.ubuttons();
	}
	else if(a.getSource()==x1)
	{
		op=JOptionPane.showOptionDialog(null, "Delete "+u1.getText()+" ?", "Cancel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,null);

		if(op==JOptionPane.OK_OPTION)
		{
			ono=1;
			Teach.uplist();
			Teach.recentt();
		}
	}
	else if(a.getSource()==x2)
	{
		op=JOptionPane.showOptionDialog(null, "Delete "+u2.getText()+" ?", "Cancel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,null);

		if(op==JOptionPane.OK_OPTION)
		{
			ono=2;
			Teach.uplist();
			Teach.recentt();
		}
	}
	else if(a.getSource()==x3)
	{
		op=JOptionPane.showOptionDialog(null, "Delete "+u3.getText()+" ?", "Cancel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,null);

		if(op==JOptionPane.OK_OPTION)
		{
			ono=3;
			Teach.uplist();
			Teach.recentt();
		}
	}
	else if(a.getSource()==x4)
	{
		op=JOptionPane.showOptionDialog(null, "Delete "+u4.getText()+" ?", "Cancel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,null);

		if(op==JOptionPane.OK_OPTION)
		{
			ono=4;
			Teach.uplist();
			Teach.recentt();
		}
	}
	else if(a.getSource()==x5)
	{
		op=JOptionPane.showOptionDialog(null, "Delete "+u5.getText()+" ?", "Cancel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,null);

		if(op==JOptionPane.OK_OPTION)
		{
			ono=5;
			Teach.uplist();
			Teach.recentt();
		}
	}
	else if(a.getSource()==x6)
	{
		op=JOptionPane.showOptionDialog(null, "Delete "+u6.getText()+" ?", "Cancel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,null);

		if(op==JOptionPane.OK_OPTION)
		{
			ono=6;
			Teach.uplist();
			Teach.recentt();
		}
	}
	else if(a.getSource()==x7)
	{
		op=JOptionPane.showOptionDialog(null, "Delete "+u7.getText()+" ?", "Cancel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,null);

		if(op==JOptionPane.OK_OPTION)
		{
			ono=7;
			Teach.uplist();
			Teach.recentt();
		}
	}
	else if(a.getSource()==x8)
	{
		op=JOptionPane.showOptionDialog(null, "Delete "+u8.getText()+" ?", "Cancel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,null);

		if(op==JOptionPane.OK_OPTION)
		{
			ono=8;
			Teach.uplist();
			Teach.recentt();
		}
	}
	else if(a.getSource()==x9)
	{
		op=JOptionPane.showOptionDialog(null, "Delete "+u9.getText()+" ?", "Cancel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,null);

		if(op==JOptionPane.OK_OPTION)
		{
			ono=9;
			Teach.uplist();
			Teach.recentt();
		}
	}
	else if(a.getSource()==x10)
	{
		op=JOptionPane.showOptionDialog(null, "Delete "+u10.getText()+" ?", "Cancel", JOptionPane.OK_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, null,null);

		if(op==JOptionPane.OK_OPTION)
		{
			ono=10;
			Teach.uplist();
			Teach.recentt();
		}
	}
	else if(a.getSource()==jmi1)
	{
		Stu.rclear();
		f1.dispose();
		f7.dispose();
		f8.dispose();
		t8.setText("");
		p2.setText("");
		l2.setText("N/A");
		c6.setText("N/A");
		c7.setText("N/A");
		c8.setText("N/A");
		c9.setText("N/A");
		c10.setText("N/A");
		l43.setIcon(null);
		b24.setRolloverIcon(null);
		qn=1;
		Frames.slog(f5);
	}
	else if(a.getSource()==jmi2)
	{
		Frames.about(f9);
	}
	else if(a.getSource()==jmi3)
	{
		Stu.stload();
		Frames.ressheet(f8);
	}
	else if(a.getSource()==jmi4)
	{
		f1.dispose();
		f7.dispose();
		f8.dispose();
		t8.setText("");
		p2.setText("");
		l2.setText("N/A");
		c6.setText("N/A");
		c7.setText("N/A");
		c8.setText("N/A");
		c9.setText("N/A");
		c10.setText("N/A");
		l43.setIcon(null);
		b24.setRolloverIcon(null);
		qn=1;
		Frames.slog(f5);
	}
	else if(a.getSource()==jmi5)
	{
		Frames.about(f9);
	}
}

public static void main(String[] args) 
{
	new MCQ();
}
}
