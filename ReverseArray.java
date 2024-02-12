package Programs;

import java.util.Scanner;

public class ReverseArray {
	static void reverse(int[] ar) {
		int i=0,j=ar.length-1;
		while(i<j) {
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
			i++;
			j--;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		reverse(ar);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i] + " ");
		}

		
		
	}

}
