//��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�
//����2+22+222+2222+22222(��ʱ����5�������)������������м��̿��ơ�
package com.test;

import java.util.Scanner;

public class NumAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ������");
		int m = scan.nextInt();
		System.out.println("��������ӵĸ�����");
		int n = scan.nextInt();
		int result = 0;
		for(int i=1;i<=n;i++){
			result = (int) (result + Math.pow(10, i)*m);
		}
		System.out.println("�ܺ�Ϊ��" + result);
	}

}
