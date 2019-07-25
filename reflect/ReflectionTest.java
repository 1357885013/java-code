package test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/**
 * �÷���ķ�ʽ,��ԭһ����.
 * �ص��ע,��������ε���һ������.
 * @author LeeRui
 * 
 */
public class ReflectionTest {
	public  static void main(String[] args) throws InstantiationException, IllegalAccessException{
		Class ss=null;
		try {
			ss=Class.forName(args[1]);
			Student st=(Student) ss.newInstance();
//			ss=Class.forName("java.lang.String");
			System.out.println("�õ�����"+ss.getPackage().getName());
			Modifier m=new Modifier();
			System.out.println("�õ�����ķ������θ�:"+m.toString(ss.getModifiers()));
			System.out.println("�õ������������ڵ�����"+ss.getName());
			System.out.println("�õ�����������������:"+ss.getSimpleName());
			System.out.println("�õ����������"+ss.getSuperclass().getName());
			Class inters[]=ss.getInterfaces();
			if(inters.length>0){
				System.out.print("�õ�����ʵ�ֵĽӿ�:");
				for(int i=0;i<inters.length;i++){
					System.out.print(inters[i].getSimpleName());
					if(i<inters.length-1){
						System.out.print(",");
					}
				}
			}
			
			System.out.println("�����е�������{");
			printFields(ss);
			printMethods(ss);
			System.out.println("}");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
/**
 * �ķ���������������е���������
 * @param s
 */
	public static void printFields(Class s){
		Field fs[]=s.getDeclaredFields();
		Modifier m=new Modifier();
			for(int i=0;i<fs.length;i++){
				System.out.print("\t"+m.toString(fs[i].getModifiers())+" ");
				System.out.print(fs[i].getType().getSimpleName()+" ");
				System.out.println(fs[i].getName()+"; ");
			}
	}
	
	/**
	 * �ķ�������������е����з���
	 * @param s
	 */
	public static void printMethods(Class s){
		Method ms[]=s.getDeclaredMethods();
		
		if(ms.length>0){
			for(int i=0;i<ms.length;i++){
				System.out.print("\t"+Modifier.toString(ms[i].getModifiers())+" ");
				System.out.print(ms[i].getReturnType().getSimpleName()+" ");
				System.out.print(ms[i].getName()+"(");
				
				//�����Ĳ���
				Class[] paras=ms[i].getParameterTypes();
				if(paras.length>0){
					for(int j=0;j<paras.length;j++){
						System.out.print(paras[j].getSimpleName()+" arg["+j+"]");
						if(j<paras.length-1){
							System.out.print(",");
						}
					}
				}
				System.out.print(")");
				//�쳣
				Class exceps[]=ms[i].getExceptionTypes();
				if(exceps.length>0){
					System.out.print(" throws ");
					for(int k=0;k<exceps.length;k++){
						System.out.print(exceps[k].getSimpleName());
						if(k<exceps.length-1){
							System.out.print(",");
						}
					}
				}
				
				System.out.println("{");
				//������
				System.out.println("\t"+"}");
			}
		}
	}

}
