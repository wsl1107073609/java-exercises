//����һ���ַ����ֱ�ͳ�Ƴ�����Ӣ����ĸ���ո����ֺ������ַ��ĸ�����
package com.test;

import java.util.Scanner;

public class StatisticCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String input = scan.nextLine();//nextLine()���Խ��ܿո����ֱ���س�Ϊֹ
		//String input = scan.next(); //ֻ�����ַ�������һ���ո�Ϊֹ
		char[] s = input.toCharArray();//�ַ�������
		
		int digital = 0;
		int alphabet = 0;
		int blank = 0;
		int others = 0;
		
		for(int i=0;i<input.length();i++){
			if(s[i] >= '0' && s[i] <= '9' ){
				digital++;
			}
			else if(s[i] >= 'a' && s[i] <= 'z' || s[i] > 'A' && s[i] <= 'Z'){
				alphabet++;
			}
			else if(s[i] == ' '){
				blank++;
			}
			else{
				others++;
			}
		}
		System.out.println("���ֵĸ���Ϊ��" + digital);
		System.out.println("Ӣ����ĸ�ĸ���Ϊ��" + alphabet);
		System.out.println("�ո�ĸ���Ϊ��" + blank);
		System.out.println("�����ַ��ĸ���Ϊ��" + others);
	}

}
