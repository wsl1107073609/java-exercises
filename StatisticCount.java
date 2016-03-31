//输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
package com.test;

import java.util.Scanner;

public class StatisticCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一行字符：");
		String input = scan.nextLine();//nextLine()可以接受空格符，直到回车为止
		//String input = scan.next(); //只接受字符串到第一个空格为止
		char[] s = input.toCharArray();//字符串数组
		
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
		System.out.println("数字的个数为：" + digital);
		System.out.println("英文字母的个数为：" + alphabet);
		System.out.println("空格的个数为：" + blank);
		System.out.println("其他字符的个数为：" + others);
	}

}
