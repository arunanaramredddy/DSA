package com.work;

import java.util.Scanner;

public class SumOfDigits {
	
	static int SumOfDigits(int n) {
		if(n==0) {
			return 0;
		}
		return SumOfDigits(n/10)+n%10;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(SumOfDigits(n));
	}

}
