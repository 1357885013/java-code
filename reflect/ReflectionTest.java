package test.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
/**
 * 用反射的方式,还原一个类.
 * 重点关注,反射中如何调用一个方法.
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
			System.out.println("得到包名"+ss.getPackage().getName());
			Modifier m=new Modifier();
			System.out.println("得到该类的访问修饰付:"+m.toString(ss.getModifiers()));
			System.out.println("得到包括包名在内的类名"+ss.getName());
			System.out.println("得到不包括报名的类名:"+ss.getSimpleName());
			System.out.println("得到父类的名字"+ss.getSuperclass().getName());
			Class inters[]=ss.getInterfaces();
			if(inters.length>0){
				System.out.print("得到该类实现的接口:");
				for(int i=0;i<inters.length;i++){
					System.out.print(inters[i].getSimpleName());
					if(i<inters.length-1){
						System.out.print(",");
					}
				}
			}
			
			System.out.println("方法中的属性有{");
			printFields(ss);
			printMethods(ss);
			System.out.println("}");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
/**
 * 改方法用来输出改类中的所有属性
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
	 * 改方法用来输出类中的所有方法
	 * @param s
	 */
	public static void printMethods(Class s){
		Method ms[]=s.getDeclaredMethods();
		
		if(ms.length>0){
			for(int i=0;i<ms.length;i++){
				System.out.print("\t"+Modifier.toString(ms[i].getModifiers())+" ");
				System.out.print(ms[i].getReturnType().getSimpleName()+" ");
				System.out.print(ms[i].getName()+"(");
				
				//方法的参数
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
				//异常
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
				//方法体
				System.out.println("\t"+"}");
			}
		}
	}

}
