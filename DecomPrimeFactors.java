//��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��
//�����������n���зֽ���������Ӧ���ҵ�һ����С������k��Ȼ������������ɣ�
//(1)����������ǡ����n����˵���ֽ��������Ĺ����Ѿ���������ӡ�����ɡ�
//(2)���n <> k����n�ܱ�k��������Ӧ��ӡ��k��ֵ������n����k����,��Ϊ�µ���������n,�ظ�ִ�е�һ����
//(3)���n���ܱ�k����������k+1��Ϊk��ֵ,�ظ�ִ�е�һ����

package com.test;

import java.util.Scanner;

public class DecomPrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);//�ӿ���̨��������
		System.out.println("������һ����������");
		//int n = scan.nextInt();
		int n = Integer.parseInt(scan.next());//���ַ�������ת��Ϊ������
		//�����ĳ�ʼֵ
		int k = 2;		
		//n�ķֽ�
		System.out.print(n + "=" );
		while(k <= n) {
			if(k == n) {
				System.out.println(n);
				break;
			}
			else if( n % k == 0) {
				System.out.print(k + "*");
				n = n / k; 
			}
			else {
				k++;
			}
	}
		
	}

}
