//�����������������Լ������С������
package com.test;

import java.util.Scanner;

public class LcmAndGcd {
	//�����Լ��
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
		System.out.println("�������һ������:");
		int m = scan.nextInt();
		System.out.println("������ڶ�������:");
		int n = scan.nextInt();
		
		System.out.println("�����������Լ��Ϊ��" + GCD(m,n));
		System.out.println("����������С������Ϊ��" + m*n/GCD(m,n));
		
	}

}
