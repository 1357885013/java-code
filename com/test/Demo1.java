package com.test;
/*
 * ͳ��һ���ַ����д�Сд�ĸ���
 * 
 * 1. ������������
 * 2. �����ַ���
 * 		�ж���ĸ�Ǵ�д  a++;
 * 		�����Сд  b++;
 * 
 * 3. ���ab
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Ming Tian Fang Jia";
		
		int a = 0;
		int b = 0;
		
		for(int i = 0;i<str.length();i++){
			char c = str.charAt(i);
			
			if(c >= 'a' && c <= 'z'){
				a++;
			}else if(c >= 'A' && c <= 'Z'){
				b++;
			}
		}
		
		
		System.out.println("Сд��"+a+"  ��д��"+b);
	}

}
