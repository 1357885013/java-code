package com.basic;

import java.math.BigDecimal;
import java.math.BigInteger;

/*
 * BigInteger:支持任意精度的整数
 * 
 * 
 * BigInteger(String val) 
          将 BigInteger 的十进制字符串表示形式转换为 BigInteger
          
          
    BigInteger add(BigInteger val) 
          返回其值为 (this + val) 的 BigInteger 
          
    BigInteger divide(BigInteger val) 
          返回其值为 (this / val) 的 BigInteger 
          
     BigInteger multiply(BigInteger val) 
          返回其值为 (this * val) 的 BigInteger 
          
      BigInteger subtract(BigInteger val) 
          返回其值为 (this - val) 的 BigInteger。 
 */
public class Demo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal dec1 = new BigDecimal("4099.99");
		System.out.println(dec1.subtract(new BigDecimal("969.01")));

	}

}
