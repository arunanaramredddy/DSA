package com.work;

import java.util.Scanner;

public class DecimalToBinary {
	static String decimalToBinary(int n) {
		String b="";
		while(n>=1) {
			int x=n%2;
			n=n/2;
			b=x+b;
		}
		return b;
	}
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	System.out.println(decimalToBinary(n));
}
}
