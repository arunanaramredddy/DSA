// check on or off operation

package com.work;

public class Bitwise4 {

	public static void main(String[] args) {
		int n=36;
		int i=5;
		 
		int cmask= 1 << i;
		
		if((n & cmask)==0) {
			System.out.println("OFF");
		}
		else {
			System.out.println("ON");
		}
		
	}

}
