package networking;
import java.net.*;
import java.io.*;
import java.util.*;

public class MyClint {

	public static void main(String[] args) throws Exception{
		Socket so=new Socket("198.168.43.85",12345);
		InputStream in=so.getInputStream();//a
		OutputStream out=so.getOutputStream();
		InputStreamReader isr=new InputStreamReader(in);//b
		BufferedReader br=new BufferedReader(isr);//c
		OutputStreamWriter osw=new OutputStreamWriter(out);
		PrintWriter pw=new PrintWriter(osw);
		pw.println("Hello|");
		pw.flush();
		String msg=br.readLine();
		System.out.println(msg);
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.println("enter your name");
			String q=sc.nextLine();
			pw.println(q);
			pw.flush();
			msg=br.readLine();
			System.out.println("the Server ans is"+msg);
			
			
		}
		
	}

}
