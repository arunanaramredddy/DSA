package com.work;

// 36= 00100100
//onMask=00001000
// performing the or(|) between them
// this is switch on the ith bit

public class Bitwise1 {

	public static void main(String[] args) {
	  int n=36;
	  int i=3;
	  int onMask=1 << i;
	  System.out.println(n | onMask);

	}

}
