package com.basic;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * BigInteger:֧�����⾫�ȵ�����
 * 
 * 
 * BigInteger(String val) 
          �� BigInteger ��ʮ�����ַ�����ʾ��ʽת��Ϊ BigInteger
          
          
    BigInteger add(BigInteger val) 
          ������ֵΪ (this + val) �� BigInteger 
          
    BigInteger divide(BigInteger val) 
          ������ֵΪ (this / val) �� BigInteger 
          
     BigInteger multiply(BigInteger val) 
          ������ֵΪ (this * val) �� BigInteger 
          
      BigInteger subtract(BigInteger val) 
          ������ֵΪ (this - val) �� BigInteger�� 
 */
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal dec1 = new BigDecimal("4099.99");
		System.out.println(dec1.subtract(new BigDecimal("969.01")));

	}

}
