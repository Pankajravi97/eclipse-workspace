package teat.java;
import java.util.*;
public class Array2 {

	public static void main(String[] args) {
		System.out.println("Enter Length of Array:-");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int a[]=new int[s];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter number:-");
			 a[i]=sc.nextInt();
		}
		int max=0;
		for(int j=0;j<a.length;j++) {
			if(a[j]>max)
				max=a[j];
			
		}
		System.out.println(max +" is max number");
	}

}