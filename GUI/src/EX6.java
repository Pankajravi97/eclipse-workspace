import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX6 {
	public static void main(String []args) {
		MagicEditor me=new MagicEditor();
		me.setSize(300,300);
		me.setVisible(true);
	}
}

class MagicEditor extends JFrame implements KeyListener{
	public void keyPressed(KeyEvent arg0) {}
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {
			char c=msg.charAt(pos);
			pos++;
			if(msg.length()==pos) 
			pos=0;
			arg0.setKeyChar(c);
		}
	
	JTextArea ja=new JTextArea();
	String msg="PANKAJ RAVI ";
	int pos=0;
	Font f=new Font("Arial",Font.BOLD,30);
	MagicEditor(){
		add(ja);
	ja.addKeyListener(this);
	
	ja.setFont(f);
	}
	
	
	
}
