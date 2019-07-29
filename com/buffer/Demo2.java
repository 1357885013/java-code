package com.buffer;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s = s+i;
		}
		
		
		/*StringBuffer sb = new StringBuffer();
		
		for(int i = 0;i<100000;i++){
			sb.append(i);
		}*/
		
		
		
		System.out.println(System.currentTimeMillis());
		
	}

}
