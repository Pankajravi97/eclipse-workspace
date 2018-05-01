package javasql;
import java.sql.*;

public class insert {
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

}
public class test1 {
	public static void main(String[] args) {
	
	MyFrame2 mf=new MyFrame2();
	mf.setSize(500,500);
	mf.setVisible(true);
	}
}