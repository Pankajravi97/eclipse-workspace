package teat.java;

import java.io.IOException;
import java.util.Scanner;

public class cal {

	public static void main(String[] args) throws IOException {
		System.out.println("welcome to calculator\na. add\nb. sub\nc. mul\nd. sub");
		Scanner s=new Scanner(System.in);
		char choice=(char) System.in.read();
		if(choice>='a'&&choice<='d')
		{
		System.out.println("Enter fist number:-");
		int n=s.nextInt();
		System.out.println("Enter second number:-");
		int m=s.nextInt();
		switch (choice) {
		case 'a':System.out.println("sum ="+(n+m));
			break;
		case 'b':System.out.println("sum ="+(n-m));
			break;
		case 'c':System.out.println("sum ="+(n+m));
			break;
		case 'd':System.out.println("sum ="+(n+m));
			break;
		default:System.out.println("invalid");
		}	
		}else System.out.println("invalid");
	}
   }