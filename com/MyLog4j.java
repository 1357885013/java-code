package com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class MyLog4j {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //创建日志追踪器
        Logger logger = Logger.getLogger("MyLog4j");

        //使用配置信息
        PropertyConfigurator.configure("com/log4j.properties");

        //打印日志信息
        logger.debug("debug信息");
        logger.info("一般信息");

        logger.warn("警告信息");
        logger.error("error信息");
        logger.fatal("致命信息");
    }

}
