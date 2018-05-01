package teat.java;

import java.util.Scanner;

public class Palin {

	public static void main(String[] args) {
	StringBuilder s=	new StringBuilder().append(new Scanner(System.in).nextLine());
	if(Integer.parseInt(s.toString())==Integer.parseInt(s.reverse().toString())) System.out.println("Palindrome");	
	else System.out.println("Not Palindrome");
	}

}
