import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX2{
	public static void main(String[] args) {
	MyClass my=new MyClass();
	my.setBounds(50,50,500,500);
	my.setVisible(true);
	my.setTitle("My GUI Screen");
	my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}

class MyClass extends JFrame implements ActionListener{
	class Myclass2 implements ActionListener{
		public void actionPerformed(ActionEvent ae) {
			System.exit(0);
		}
	}
	public void actionPerformed(ActionEvent ae) {
		JOptionPane.showMessageDialog(this, "Hello");
    }
	JButton jb=new JButton("wish");
	JButton jb2=new JButton("Exit");
	MyClass(){
		setLayout(new FlowLayout());
		add(jb); add(jb2);
		jb.addActionListener(this);
		jb2.addActionListener(new Myclass2());
	}
}