package com.basic;

import java.util.Random;

/*
 * Random:α�����������
 * 
 * 	Random() 
          	����һ���µ�������������� 
	Random(long seed) 
          	ʹ�õ��� long ���Ӵ���һ���µ������������ 
 * 	
 */
public class Demo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(4L);
		for(int i = 0;i<1000;i++){
			System.out.println(r.nextDouble());
//			System.out.println(r.nextInt(10));
			System.out.println(r.nextFloat());
			System.out.println(r.nextLong());
		}
	}

}
