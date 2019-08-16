package com.fanshe;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoader extends ClassLoader {
	private String mPath;
	
	public MyClassLoader(String path) {
		// TODO Auto-generated constructor stub
		//����Ҫ����class�ļ���ָ��Ŀ¼
		this.mPath = path;
	}
	
	@Override
	protected Class<?> findClass(String name)
			throws ClassNotFoundException {
		// TODO Auto-generated method stub
				String fileName = getFileName(name);
				//����class�ļ���file����
				File file = new File(mPath,fileName);
				
				try {
					//�����������������,��ȡclass�ļ�
					FileInputStream is = new FileInputStream(file);
					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					int len;
					while((len = is.read()) != -1){
						bos.write(len);
					}
					
					byte [] data = bos.toByteArray();
					is.close();
					bos.close();
					//����defineClass����
					return defineClass(name,data,0,data.length);
					
				} catch ( IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				return super.findClass(name);
	}
	
	private String getFileName(String name){
		int index = name.lastIndexOf(".");
		if(index == -1){
			return name+".class";
		}else{
			return name.substring(index+1)+".class";
		}
	}
	
}