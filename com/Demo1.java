package com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建日志追踪器
		Logger l = Logger.getLogger("Demo1");
		
		//使用配置信息
		PropertyConfigurator.configure("./com/log4j.properties");
		
		//打印日志信息
		l.debug("debug信息");
		l.info("一般信息");
		
		l.warn("警告信息");
		l.error("error信息");
		l.fatal("致命信息");
		
		
	}

}
