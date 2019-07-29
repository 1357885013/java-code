package com.basic;

import java.util.Random;

/*
 * Random:伪随机数生成器
 * 
 * 	Random() 
          	创建一个新的随机数生成器。 
	Random(long seed) 
          	使用单个 long 种子创建一个新的随机数生成器 
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
