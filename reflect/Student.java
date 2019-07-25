package test.reflect;

import java.io.Serializable;

/**
 *唯一不能通过反射的方式探寻到得是方法中的代码.即方法体
 *其他的所有的信息都能通过反射的方式得到.
 *比如:这个类得特性,父类,实现的借口,属性,属性的数据类型,数据类型的访问修饰付
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
