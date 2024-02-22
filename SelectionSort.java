package Programs;

import java.util.Scanner;
public class SelectionSort {
	public  static void selectionSort(int[] ar) {
		for(int i=0;i<ar.length-1;i++) {
			int minPos=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[minPos]>ar[j]) {
					minPos=j;
				}
			}
			int temp=ar[minPos];
			ar[minPos]=ar[i];
			ar[i]=temp;
		}
		
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int[] ar=new int[n];
	
	for(int i=0;i<ar.length;i++) {
		ar[i]=sc.nextInt();
	}
	selectionSort(ar);
	for(int i=0;i<ar.length;i++) {
		System.out.print(ar[i]+ " ");
	}
	
}
}
