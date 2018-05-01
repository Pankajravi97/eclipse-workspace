import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.*;
public class EX7 {

	public static void main(String[] args) {
	MyFocus mf=new MyFocus();
	mf.setSize(300,300);
	mf.setVisible(true);
	}

}

class MyFocus extends JFrame implements FocusListener{
	
	public void focusGained(FocusEvent arg0) {
		if(arg0.getSource()==jtf1)
		jtf1.setBackground(Color.RED);
		else
		jtf2.setBackground(Color.red);
	}
	public void focusLost(FocusEvent arg0) {
		if(arg0.getSource()==jtf1)
		jtf1.setBackground(Color.white);
		else
		jtf2.setBackground(Color.white);
	}

	JTextField jtf1=new JTextField();
	JTextField jtf2=new JTextField();
	
	MyFocus(){
		setLayout(new GridLayout(2,1));
		add(jtf1);
		add(jtf2);
		jtf1.addFocusListener(this);
		jtf2.addFocusListener(this);
	}
	
}
