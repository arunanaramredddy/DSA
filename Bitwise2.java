package com.work;
// performing the off operation



public class Bitwise2 {

	public static void main(String[] args) {
		int n=36;
		int i=5;
		int offMask= ~(1<<i);
		System.out.println(n & offMask);
		
		
	}

}
