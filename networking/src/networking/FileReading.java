package networking;
import java.io.*;
public class FileReading {

	public static void main(String[] args)throws Exception {
		String s;
		java.io.FileReader fr=new java.io.FileReader("pankaj.txt");
		BufferedReader br=new BufferedReader(fr);
		while((s=br.readLine())!=null) {
			System.out.println(s);
		}
		br.close();
	}

}
