package test.reflect;

import java.lang.reflect.Method;
/**
 * 
 * @author Administrator
 *
 */
public class MethodTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			Class c=Class.forName(args[0]);
			
			Class[] cc=new Class[1];
			String[] s=new String[1];
			cc[0]=String[].class;
			Method m=c.getMethod("getPrint", cc);
			
			Object[] o=new Object[1];
			String[] argument=new String[2];
			argument[0]="hha";
			argument[1]="heihei";
			o[0]=argument;
			m.invoke(c.newInstance(), o);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
