package com.test;
/*
 * ���ַ�������ĸ��Ϊ��д��������ĸ��ΪСд
 * miNg tiAn fanG jIa
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "miNg tiAn fanG jIa";
		
		String result = "";
		
		String [] arr = s.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			//��ȡ���ʵ��ײ���β��
			String header = arr[i].substring(0,1);
			
			//ֱ�ӱ��д
			String headerDa = header.toUpperCase();
			
			//��ȡβ��
			String body = arr[i].substring(1);
			
			String bodyXiao = body.toLowerCase();
			
			//����µ���
			String newWord = headerDa+bodyXiao;
			
			result = result + newWord+" ";
			
		}
		
		System.out.println(result);
	}

}
