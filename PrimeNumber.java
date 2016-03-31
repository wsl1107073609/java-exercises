package com.test;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 101; i <= 200; i += 2) {
			boolean flag = false;
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					//flag = false;
					break;
				} else {
					//flag = true;
				}
			}
			if (flag == true) {
				count = count + 1;
				System.out.println(i);
			}
		}
		System.out.println("101-200之间的素数共有： "+ count);
	}
}
