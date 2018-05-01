package networking;
import java.io.*;
import java.net.*;

public class FileServers {

	public static void main(String[] args) throws Exception{
		ServerSocket sc=new ServerSocket(12345);
		System.out.println("Wating for clint...");
		Socket so=sc.accept();
		InputStream in=so.getInputStream();
		OutputStream out=so.getOutputStream();
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		OutputStreamWriter osw=new OutputStreamWriter(out);
		PrintWriter pw=new PrintWriter(osw);
		java.io.FileReader fr=new java.io.FileReader("pankaj.txt");
		BufferedReader fbr=new BufferedReader(fr);
		String msg;
		while((msg=fbr.readLine())!=null) {
			pw.println(msg);
			pw.flush();
		}
		so.close();
		fbr.close();
	}

}
