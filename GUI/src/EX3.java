import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX3{
	public static void main(String[] args) {
	MyFrame my=new MyFrame();
	my.setBounds(50,50,500,500);
	my.setVisible(true);
	my.setTitle("My GUI Screen");
	my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
}

class MyFrame extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==jb)
		JOptionPane.showMessageDialog(null, "Hello");
		else
			System.exit(0);
    }
	JButton jb=new JButton("wish   bhmjjmhjh ");
	JButton jb2=new JButton("Exit");
	MyFrame(){
		setLayout(new FlowLayout());
		add(jb); add(jb2);
		jb.addActionListener(this);
		jb2.addActionListener(this);
	}
}