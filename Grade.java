//���������������Ƕ������ɴ��⣺ѧϰ�ɼ�> =90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
package com.test;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���");
		
		/*
		 * ���������
		 * */
		char grade;
		int x = scan.nextInt();
		grade = x >= 90? 'A': x >= 60? 'B':'C';
		System.out.println("�ȼ�Ϊ��"+grade);
		
		
		
		/*
		 * if else �ж����
		Double grade = Double.parseDouble(scan.next());//���ַ���ת���ɸ�����
		if(grade >= 90){
			System.out.println("A");
		}
		else if(grade >= 60 && grade <= 89){
			System.out.println("B");
		}
		else{
			System.out.println("C");
		}
		*/
		
		
	}

}
