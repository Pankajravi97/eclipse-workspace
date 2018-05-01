package networking;
import java.net.*;
import java.io.*;
import java.util.*;


public class MmyServer {

	public static void main(String[] args)throws Exception {
		ServerSocket ss=new ServerSocket(12345);
		System.out.println("Wating for new clint to connect... ");
		Socket so=ss.accept();
		InputStream in=so.getInputStream();
		OutputStream out=so.getOutputStream();
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		OutputStreamWriter osw=new OutputStreamWriter(out);
		PrintWriter pw=new PrintWriter(osw);
		String msg=br.readLine();
		System.out.println("clint message"+msg);
		pw.println("My time is "+new Date().toString());
		pw.flush();
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			msg=br.readLine();
			System.out.println("Clint que 1"+msg);
			String ans=sc.nextLine();
			pw.println();
		}
	}

}
