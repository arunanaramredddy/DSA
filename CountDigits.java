package com.work;

public class CountDigits {
	static int countDigits(int n) {
		if(n==0) {
			return 0;
		}
		return countDigits(n/10)+1;
	}

	public static void main(String[] args) {
		int n=2353;
		System.out.println(countDigits(n));
	

	}

}
