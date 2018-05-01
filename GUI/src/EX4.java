import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EX4 {

	public static void main(String[] args) {
	MyMouse mm=new MyMouse();
	mm.setSize(300,300);
	mm.setVisible(true);
	}

}
 class MyMouse extends JFrame implements MouseListener{
	int x,y; 
	public void mouseClicked(MouseEvent arg0) {
		
	}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) {
		x=arg0.getX();
		y=arg0.getY();
	}
	public void mouseReleased(MouseEvent arg0) {
		Graphics g=getGraphics();
		g.drawLine(x, y, arg0.getX(), arg0.getY());
	}
	 //manual
	 //public void mouseEnterd(MouseEvent me) {}
	 //public void mouseExited(MouseEvent me) {}
	 //public void mouseRelesed(MouseEvent me) {}
	 //public void mouseClicked(MouseEvent me) {}

	
	MyMouse(){
		addMouseListener(this);
	}
 }