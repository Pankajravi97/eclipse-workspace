package teat.java;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Calculator {

	public static void main(String[] args) {
		String input =new Scanner(System.in).nextLine();
		String[] input1 =input.split("\\-");
		int result = 0;
		for(int i =0;i<input1.length;i++) {
			
			String[] input2 =input1[i].split("+");
			if(input2.length>=2) {
			for(int j=0;j<input2.length;j++) {
				String[] input3= input2[j].split("\\*");
				if(input3.length>=2) {
				for(int k=0;k<input3.length;k++) {
					String[] input4 =input3[k].split(Pattern.quote("/"));
					if(input4.length>=2) {
						result=Integer.parseInt(input4[0])/Integer.parseInt(input4[1]);
					}
				}
				result =result*Integer.parseInt(input3[j]);
				}
			}
			result =result+Integer.parseInt(input2[0]);
			}
		}
		result =result-Integer.parseInt(input1[0]);
		System.out.println(result);
	}

}