//��ӡ�����е� "ˮ�ɻ��� "����ν "ˮ�ɻ��� "��ָһ����λ�������λ���������͵��ڸ�������
//���磺153��һ�� "ˮ�ɻ��� "����Ϊ153=1�����η�+5�����η�+3�����η���
package com.test;

public class Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1,b2,b3;
		for(int b=100;b<=999;b++){
			b1=b/100;//����
			b2=b%100/10;
			b3=b%10;//����
			if(b1*b1*b1+b2*b2*b2+b3*b3*b3 == b){
				System.out.println(b);
			}			
		}
	}

}
