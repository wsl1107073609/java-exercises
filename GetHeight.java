//一球从100米高度自由落下，每次落地后反跳回原高度的一半;
//再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
package com.test;

public class GetHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double H[] = new double[10];//用来存储每次落地之前的高度
		double R[] = new double[10];//用来存储每次落地之后返回的高度
		H[0] = 100;
		R[0] = 50;
		double sum = 0;
		for(int i=1;i<10;i++){
			H[i] = H[i-1]/2;
			R[i] = H[i]/2;
			if(i<9){
				sum = sum + H[i-1] +R[i-1];
			}else{
				sum = sum + H[i-1];
				System.out.println("第10次落地时共经过的距离：" + sum);
				System.out.println("第10次反弹的高度为：" + R[i]);
			}
		}
		/*
		 * 输出每次的落地高度和反弹高度
		for(int j=0;j<10;j++){
			System.out.println(H[j] + "  " + R[j]);
		}
		*/
		
		
	}

}
