//求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。
//例如2+22+222+2222+22222(此时共有5个数相加)，几个数相加有键盘控制。
package com.test;

import java.util.Scanner;

public class NumAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int m = scan.nextInt();
		System.out.println("请输入相加的个数：");
		int n = scan.nextInt();
		int result = 0;
		for(int i=1;i<=n;i++){
			result = (int) (result + Math.pow(10, i)*m);
		}
		System.out.println("总和为：" + result);
	}

}
