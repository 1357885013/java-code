package com;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class MyLog4j {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //������־׷����
        Logger logger = Logger.getLogger("MyLog4j");

        //ʹ��������Ϣ
        PropertyConfigurator.configure("com/log4j.properties");

        //��ӡ��־��Ϣ
        logger.debug("debug��Ϣ");
        logger.info("һ����Ϣ");

        logger.warn("������Ϣ");
        logger.error("error��Ϣ");
        logger.fatal("������Ϣ");
    }

}
