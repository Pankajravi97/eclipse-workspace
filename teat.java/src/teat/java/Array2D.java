package teat.java;
import java.util.*;
public class Array2D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of array");
		int a=sc.nextInt();
		System.out.println("enter size of array");
		int b=sc.nextInt();
		int arr[][]=new int[a][b]; 
		for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			arr[i][j]=sc.nextInt();
		    
		}
		
		}
		
		for(int k =0; k<arr.length;k++) {
			for(int p=0;p<arr[k].length;p++) {
				System.out.print(arr[k][p]+" ");
			}
			System.out.println();
		}
		}

	}
