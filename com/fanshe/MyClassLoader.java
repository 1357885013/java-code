package com.fanshe;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class MyClassLoader extends ClassLoader {
	private String mPath;
	
	public MyClassLoader(String path) {
		// TODO Auto-generated constructor stub
		//传入要加载class文件的指定目录
		this.mPath = path;
	}
	
	@Override
	protected Class<?> findClass(String name)
			throws ClassNotFoundException {
		// TODO Auto-generated method stub
				String fileName = getFileName(name);
				//创建class文件的file对象
				File file = new File(mPath,fileName);
				
				try {
					//创建输入输出流对象,读取class文件
					FileInputStream is = new FileInputStream(file);
					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					int len;
					while((len = is.read()) != -1){
						bos.write(len);
					}
					
					byte [] data = bos.toByteArray();
					is.close();
					bos.close();
					//调用defineClass方法
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