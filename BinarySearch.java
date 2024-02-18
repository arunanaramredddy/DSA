package Programs;

import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] ar,int key) {
		int low=0,high=ar.length-1,mid=0;
		while(low<=high) {
			mid=(low+high)/2;
			if(key==ar[mid]) {
				return mid;
			}
			else if(key<ar[mid]) {
				high=mid-1;
				//low=low;
			}
			else {
				low=mid+1;
				//high=high;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=scan.nextInt();
		}
		int key=scan.nextInt();
		System.out.println(binarySearch(ar,key));

	}

}
