//һ���100�׸߶��������£�ÿ����غ�����ԭ�߶ȵ�һ��;
//�����£������� ��10�����ʱ�������������ף���10�η�����ߣ�
package com.test;

public class GetHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double H[] = new double[10];//�����洢ÿ�����֮ǰ�ĸ߶�
		double R[] = new double[10];//�����洢ÿ�����֮�󷵻صĸ߶�
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
				System.out.println("��10�����ʱ�������ľ��룺" + sum);
				System.out.println("��10�η����ĸ߶�Ϊ��" + R[i]);
			}
		}
		/*
		 * ���ÿ�ε���ظ߶Ⱥͷ����߶�
		for(int j=0;j<10;j++){
			System.out.println(H[j] + "  " + R[j]);
		}
		*/
	}

}
