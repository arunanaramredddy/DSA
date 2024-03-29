// finding the rightmost set

package com.work;

import java.util.Scanner;

public class Bitwise5 {
	
	static int posOfRMS(int n) {
		int m=1;
		int  pos=0;
		if(n==0) {
			return -1;
		}
		
		while((n & m)==0) {
			m = m <<1;
			pos++;
		}
		return pos+1;
	}
	
	// efficient way is int n, create mask ie.m=(n&(n-1))
	// perform xor between n and m
	// the updated value of n having only one bit which will be the 
	// right most set bit
	// log2N=log2N/log102;
	
	static int posOfRMS1(int n) {
		return (int) (Math.log10( n ^(n&(n-1)))/Math.log10(2))+1;
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//System.out.println(posOfRMS(n));
		System.out.println(posOfRMS1(n));
		
	}

}
