import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class EX8 {

	public static void main(String[] args) {
		MyLayout ml=new MyLayout();
		ml.setSize(500,500);
		ml.setVisible(true);
	}
}
	class MyLayout extends JFrame{
		JButton jb=new JButton("button1");
		JButton jb1=new JButton("button2");
		JButton jb2=new JButton("button3");
		JButton jb3=new JButton("button4");
		JButton jb4=new JButton("button5");
	
		MyLayout(){
			//add(jb,BorderLayout.NORTH);
			//add(jb1,BorderLayout.SOUTH);
			//add(jb2,BorderLayout.EAST);
			//add(jb3,BorderLayout.WEST);
			//add(jb4);
			//setLayout(new FlowLayout());
			//add(jb);add(jb1);add(jb2);add(jb3);add(jb4);
			//setLayout(new GridLayout(3,2));
			//add(jb);add(jb1);add(jb2);add(jb3);add(jb4);
			setLayout(null);
			jb.setBounds(1,2,100,100);
			jb1.setBounds(111,111,100,100);
			jb2.setBounds(222,222,100,100);
			jb3.setBounds(333,333,100,100);
			jb4.setBounds(444,444,100,100);
			add(jb);add(jb1);add(jb2);add(jb3);add(jb4);
		}
}