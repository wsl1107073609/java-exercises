package com.test;

public class Fibonacci {

	//�ݹ麯��
	public static int F(int m){
		if(m<=2){
			return 1;
		}
		else{
			return F(m-1)+F(m-2);
		}
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * method1:
		System.out.println("��һ���µ����Ӷ���Ϊ��"+1);
		System.out.println("�ڶ����µ����Ӷ���Ϊ�� "+1);
		int f,f1=1,f2=1,M=12;
		for(int i=3;i<=M;i++){
			f=f2;
			f2=f1+f2;
			f1=f;		
			System.out.println("��"+i+"���µ����Ӷ���Ϊ�� "+f2);
		}
		*/
		
		/*
		 * method2:recursive call
		 * */
		int M=12;
		for(int i=1;i<=M;i++){
			System.out.println("��"+i+"���µ����Ӷ���Ϊ�� "+F(i));			
		}		
	}

}
