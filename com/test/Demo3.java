package com.test;
/*
 * ����һ���ַ����ҵ��Ӵ����ַ����г��ֵ�	
 * ������String s = "abc123456abcxxxabc"�е�"abc"
 *
 */
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc123456abcxxxabc";
		//�����������
		int count = 0;
		
		//������ֵ���������
		int index;
		
		//������ҵ���ʼ������
		int i = 0;
		while((index = s.indexOf("abc",i)) != -1){
			//�ҵ���
			count++;
			//���¶�λҪ���ҵ���ʼ����
			i = index + 3;
		}
		
		System.out.println(count);
	}

}
