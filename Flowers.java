//打印出所有的 "水仙花数 "，所谓 "水仙花数 "是指一个三位数，其各位数字立方和等于该数本身。
//例如：153是一个 "水仙花数 "，因为153=1的三次方+5的三次方+3的三次方。
package com.test;

public class Flowers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b1,b2,b3;
		for(int b=100;b<=999;b++){
			b1=b/100;//求商
			b2=b%100/10;
			b3=b%10;//求余
			if(b1*b1*b1+b2*b2*b2+b3*b3*b3 == b){
				System.out.println(b);
			}			
		}
	}

}
