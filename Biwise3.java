// toggle that is it can change the bit
// we can perform xor on this 

package com.work;

public class Biwise3 {

	public static void main(String[] args) {
		int n=36;
		int i=5;
		int tmask= 1 << i;
		System.out.println(n ^ tmask);

	}

}
