//利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
package com.test;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入学生成绩：");
		
		/*
		 * 条件运算符
		 * */
		char grade;
		int x = scan.nextInt();
		grade = x >= 90? 'A': x >= 60? 'B':'C';
		System.out.println("等级为："+grade);
		
		
		
		/*
		 * if else 判断语句
		Double grade = Double.parseDouble(scan.next());//把字符串转换成浮点型
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
