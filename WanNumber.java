//һ�������ǡ�õ�����������֮�ͣ�������ͳ�Ϊ "���� "��
//����6=1+2+3.����ҳ�1000���ڵ�����������
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
