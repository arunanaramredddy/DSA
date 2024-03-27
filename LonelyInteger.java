package com.work;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class LonelyInteger {
	
	public static int lonelyInteger(int[] ar) {
		HashSet<Integer> s = new HashSet<Integer>();
		for(int i : ar) {
			if(s.contains(i)) {
				s.remove(i);
			}
			else {
				s.add(i);
			}
		}
		for(int i : s) {
			return i;
		}
		return -1;
		
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println(lonelyInteger(ar));
	

	}

}
