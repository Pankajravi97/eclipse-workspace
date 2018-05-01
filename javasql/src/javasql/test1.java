package javasql;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;
import java.sql.*;

class Test1 {
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection cn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE"
				,"hr","hr");
		System.out.println("Connected");
		
		Statement st=cn.createStatement();
		ResultSet rs=st.executeQuery("Select * from info");
		  
		while(rs.next()==true) {
			int rno=rs.getInt(1);
			String n=rs.getString(2);
			int m=rs.getInt("marks");
			System.out.println(rno +","+n+","+m);		
		}
				
		cn.close();
	}

class Test {
	public static void main(String[] args) {
	
	MyFrame2 mf=new MyFrame2();
	mf.setSize(500,500);
	mf.setVisible(true);
	}
}
class MyFrame2 extends JFrame{
	JLabel lbl3=new JLabel("roll no-");
	JTextField jtf3=new JTextField(10);
	JLabel lbl1=new JLabel("Enter Name-");
	JTextField jtf=new JTextField(10);
	JLabel lbl2=new JLabel("Number-");
	JTextField jtf1=new JTextField(10);
	//JTextArea jta=new JTextArea(3,10);
	
	ButtonGroup bg=new ButtonGroup();

	JButton jb3=new JButton("Save");
	JToggleButton jt=new JToggleButton("Exit");
	
	MyFrame2(){
		setLayout(new GridLayout(7,2,30,30));
		add(lbl1); add(jtf); 
		add(lbl3); add(lbl3);add(jtf1);add(lbl2);add(jtf3);
		add(jb3);add(jt);
		getContentPane().setBackground(Color.GREEN);
	}
}

}