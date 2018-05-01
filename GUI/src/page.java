import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.*;

public class page {
	public static void main(String[] args) {
	
	MyFrame2 mf=new MyFrame2();
	mf.setSize(700,1000);
	mf.setVisible(true);
	}
}
class MyFrame2 extends JFrame{
	JLabel lbl1=new JLabel("Enter Name");
	JTextField jtf=new JTextField(10);
	//JLabel lbl2=new JLabel("Comments");
	JTextArea jta=new JTextArea(3,10);
	JScrollPane jsp=new JScrollPane(jta);
	JLabel lbl3=new JLabel("Select City");
	
	String [] cities= {"Bhopal","Indore","Pune"};
	JComboBox jcb=new JComboBox(cities);
	
	JLabel lbl4=new JLabel("Select Center");
	
	String[] center= {"uit","truba","dav","sati"};
	JList j1=new JList(center);
	JScrollPane jsp2=new JScrollPane(j1);
	JCheckBox jcp=new JCheckBox("Like Cricket");
	JCheckBox jcp2=new JCheckBox("Like Football");
	
	ButtonGroup bg=new ButtonGroup();
	JRadioButton jrb=new JRadioButton("Male");
	JRadioButton jrb2=new JRadioButton("Female");
	JButton jb3=new JButton("save");
	JToggleButton jt=new JToggleButton("Save or Print");
	
	MyFrame2(){
		setLayout(new GridLayout(7,2,30,30));
		add(lbl1); add(jtf); //add(lbl2);
		add(jsp); add(lbl3);add(jcb);
		add(lbl4); add(jsp2); add(jcp); add(jcp2);
		bg.add(jrb);bg.add(jrb2);add(jrb);add(jrb2);
		add(jb3);add(jt);
		getContentPane().setBackground(Color.GREEN);
	}
}
