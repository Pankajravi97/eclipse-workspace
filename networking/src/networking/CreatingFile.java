package networking;
import java.io.*;
//import java.util.*;

public class CreatingFile {

	public static void main(String[] args)throws Exception {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//A
		InputStream in=System.in;
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		//read from keyboard 9-11
		FileWriter fw=new FileWriter("pankaj.txt");
		//line by line
		PrintWriter pw=new PrintWriter(fw);
		for(int i=0;i<5;i++)
			{
				System.out.println("enter messager...");
				String s=br.readLine();
				pw.println(s);
				pw.flush();//send data to destination(from cache)
			}
		pw.close();
	}

}
