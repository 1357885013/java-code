package com.string;
/*
 *  public char[] toCharArray() ����:�����ַ���ת��Ϊһ���µ��ַ�����
 *  
 *  
	public byte[] getBytes()����
				ʹ��ƽ̨��Ĭ���ַ������� String ����Ϊ byte ���У���������洢��һ���µ� byte ������
				

	��дtoString����
	
	
	public static String copyValueOf(char[]?data)�������ط���:�ַ�����ת�ַ���
	
	
	public static String valueOf(boolean?b)�������ط���

 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "����";
		char [] cs = s.toCharArray();
		
		for (int i = 0; i < cs.length; i++) {
			System.out.println(cs[i]);
		}
		
		
		
		
		byte [] by = s.getBytes();
		
		for (int i = 0; i < by.length; i++) {
			System.out.print(by[i]+" ");
		}
		
		
		char [] cs1 = {'��','��','��','��'};
		
		String str = String.copyValueOf(cs1);
		
		System.out.println(str);
		
		boolean b = false;
		
		String str1 = String.valueOf(b);
		
		System.out.println(str1);
		
		//����Ķ����ַ���
		/*
		 * 
		 */
		System.out.println(false);
		
		System.out.println(100);
		
		String s1 = String.valueOf(null);
		
		System.out.println(s1);
		
	}

}
