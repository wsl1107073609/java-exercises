//一个数如果恰好等于它的因子之和，这个数就称为 "完数 "。
//例如6=1+2+3.编程找出1000以内的所有完数。
package com.test;

public class WanNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int m=1;m<=1000;m++){
			int sum = 0;
			for(int n=1;n<=m/2;n++){
				if(m%n == 0){
					sum = sum + n;
				}
			}

			/*
			String s = Integer.toString(m);
			char[] ch = s.toCharArray();
			int sum = 0;
			for(int n=0;n<ch.length;n++){
				sum = sum + ch[n];
			}
			*/
			
			if(sum == m){
				System.out.println(m);
			}
			
		}
	}

}
