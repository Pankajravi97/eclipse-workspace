package teat.java;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		int sc=new Scanner(System.in).nextInt();
//		int a=sc.nextInt();
		int arr[]=new int[sc/2];
		int count=1;
		for (int i=0;i<arr.length;i++) {
			arr[i]=count*2;
			count++;
			//System.out.println(arr[i]); initialization for loop
			
		}
		//inhance for loop
		//for (int d:arr) {
			//System.out.print(d+" ");
		//}
		//for loop for print
		for (int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}

	}

}
