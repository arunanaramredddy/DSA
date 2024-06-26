package com.work;

// Number of combinations=2^((l-1)/2)

import java.util.Scanner;

public class NPalindromicNumber {
	
	static int reverseBinary(int n ,int len) {
		int f=len-1,l=0;
		int rev=0;
		while(f>1) {
			if((n & (1<<f)) !=0) {
				rev=rev |(1<<1);
		}
		if((n & (1<<1)) !=0) {
			rev=rev |(1<<f);
		}
		f--;
		l++;
		}
		return rev;
	}
	static int Palindromic(int n) {
		int l=0,count=0;
		while(count<n) {
			l++;
			count=count+(int)Math.pow(2, (l-1)/2);
			
		}
		count=count-(int)Math.pow(2, (l-1)/2);
		int ele=n -count-1;
		int ans=(1<<(l-1))|(ele << (l/2));
		return ans=ans |reverseBinary(n,l);
	
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(Palindromic(n));

	}

}
