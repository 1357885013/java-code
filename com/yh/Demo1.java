package com.yh;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/*
 * JDBC:java database connectivity  java���ݿ����Ӽ���
 * 		SUN��˾�ṩ��һ�׽ӿ�  ���ǹ淶
 *
 * JDBC��һ�׽ӿڹ淶
 * ����jar���ǽӿڵ�ʵ���ࣨ���ݿ⳧���ṩ��
 *
 * ����
 * 		�����ݿ��е�����չʾ�ڿ���̨
 *
 */
public class Demo1 {

    public static void main(String[] args) throws Exception {
        //ע������
        //������DriverManager.registerDriver(new com.mysql.jdbc.Driver());  //���ڲ����ﴴ���¶����ʱ��Driver�����о�̬��������������Զ�ִ�н���ע��������������һ���ע���������������Բ������
        Class.forName("com.mysql.jdbc.Driver"); //��һ����Ҫ��������࣬����ֵ��֪��զ�á�
//method 1
//        Connection connection = DriverManager.getConnection("JDBC:Mysql://localhost:3306/ljj","root","root");
//method 2
//        Connection connection = DriverManager.getConnection("JDBC:Mysql://localhost:3306/ljj?user=root&password=root");
//method 3
        Properties pro = new Properties();
//method 3.1
//        pro.setProperty("user","root");
//        pro.setProperty("password","root");
//method 3.2
        pro.load(new FileInputStream("./com/yh/db.properties"));

        Connection connection = DriverManager.getConnection("JDBC:Mysql://localhost:3306/word", pro);

        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("select * from english_words where word = 'aaaaa' limit 4;");

        while (result.next()) {
            System.out.println(result.getString(2) + "\t" + result.getString(3)); //string������getIntȡ��ֻҪ����������
        }

        statement.close();
        result.close();
        connection.close();
    }

}
