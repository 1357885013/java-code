package test.reflect;

import java.io.Serializable;

/**
 *Ψһ����ͨ������ķ�ʽ̽Ѱ�����Ƿ����еĴ���.��������
 *���������е���Ϣ����ͨ������ķ�ʽ�õ�.
 *����:����������,����,ʵ�ֵĽ��,����,���Ե���������,�������͵ķ������θ�
 *
 * @author Administrator
 *
 */
public final class Student extends Person implements Cloneable,Serializable{
	private int age;
	private String name;
	private double ff;
	
	public Student() {
		super();
	}
	public void getPrint(String[] a){
for(int i=0;i<a.length;i++){
	System.out.println(i+"===="+a[i]);
}
		
	}
	
	public String getInfo() throws Exception{
		return "";
	}

}
