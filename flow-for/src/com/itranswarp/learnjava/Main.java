package com.itranswarp.learnjava;

/**
 * for练习
 */
public class Main {

	public static void main(String[] args) {
		double pi = 0;
		int t=0;
		for (int i = 1; i < 100000; i += 2) {
			// TODO:
			int temp = t%2 == 0 ? 1 : -1;
			pi += (4.0 / i) * temp;
			t++;
		}
		
		System.out.println(pi);
		
	}

}
