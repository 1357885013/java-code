package com.buffer;
/*
 * StringBuffer:�̰߳�ȫ�Ŀɱ��ַ�����,һ�������� String ���ַ���������
 * 
 * 
 * ���췽��
 * 	StringBuffer() 
          ����һ�����в����ַ����ַ��������������ʼ����Ϊ 16 ���ַ�  �Զ�����
          
    StringBuffer(String str) :String---StringBuffer
          ����һ���ַ��������������������ݳ�ʼ��Ϊָ�����ַ������ݡ�
 * 
 */
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����ַ���������
		StringBuffer buffer = new StringBuffer();
		
				System.out.println(buffer);
		
		buffer.append(true);
		
		System.out.println(buffer);
		
		
		/*
		 * ����������תΪ�ַ�����׷�ӵ�
		 * 
		 */
//		buffer.append('a');
//		buffer.append(1.3);
//		buffer.append("���");
//		buffer.append(100);
//		Student s = new Student();
//		s.name = "jack";
//		s.age = 20;
//		buffer.append(s);
		
		buffer.append('a')
		.append(1.3)
		.append(100)
		.append(10000);
		
		System.out.println(buffer);
		
		
		StringBuffer sb = new StringBuffer("abc");
		
		System.out.println(sb);
		
		
		sb.insert(1, 123);
		
		System.out.println(sb);
		
		sb.append(true).deleteCharAt(2);
		
		System.out.println(sb);
	}

}
