package com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������־׷����
		Logger l = Logger.getLogger("Demo1");
		
		//ʹ��������Ϣ
		PropertyConfigurator.configure("./com/log4j.properties");
		
		//��ӡ��־��Ϣ
		l.debug("debug��Ϣ");
		l.info("һ����Ϣ");
		
		l.warn("������Ϣ");
		l.error("error��Ϣ");
		l.fatal("������Ϣ");
		
		
	}

}
