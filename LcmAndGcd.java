//输入两个数，求最大公约数和最小公倍数
package com.test;

import java.util.Scanner;

public class LcmAndGcd {
	//求最大公约数
	public static int GCD(int x,int y){
		try{
			int m = x;
			int n = y;
			int p = m%n;
			while(p != 0){
				x = y;
				y = p;
				p = x%y;
			}			
		}catch(Exception e){
			e.printStackTrace();
		}
		return y;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个数据:");
		int m = scan.nextInt();
		System.out.println("请输入第二个数据:");
		int n = scan.nextInt();
		
		System.out.println("两个数的最大公约数为：" + GCD(m,n));
		System.out.println("两个数的最小公倍数为：" + m*n/GCD(m,n));
		
	}

}
