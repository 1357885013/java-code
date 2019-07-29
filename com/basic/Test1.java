package com.basic;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		System.out.println(i1 == i2);//false

		Integer i3 = new Integer(128);
		Integer i4 = new Integer(128);
		System.out.println(i3 == i4);//false

		Integer i5 = 128;
		Integer i6 = 128;
		System.out.println(i5 == i6);//false

		Integer i7 = 127;
		Integer i8 = 127;
		System.out.println(i7 == i8);//true
	}

}
