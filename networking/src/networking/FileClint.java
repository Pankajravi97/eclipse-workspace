package networking;
import java.io.*;
import java.net.*;

public class FileClint {

	public static void main(String[] args)throws Exception {
		Socket so=new Socket("192.168.43.22",12345);
		InputStream in=so.getInputStream();
		OutputStream out=so.getOutputStream();
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		OutputStreamWriter osw=new OutputStreamWriter(out);
		PrintWriter pw=new PrintWriter(osw);
		FileWriter fw=new FileWriter("pankajout.txt");
		PrintWriter fpw=new PrintWriter(fw);
		String msg;
		while((msg=br.readLine())!=null) {
			fpw.println(msg);
			fpw.flush();
		}
		fpw.close();
		so.close();
		
	}

}
