package com.yh;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/*
 * JDBC:java database connectivity  java数据库连接技术
 * 		SUN公司提供的一套接口  就是规范
 *
 * JDBC是一套接口规范
 * 驱动jar包是接口的实现类（数据库厂商提供）
 *
 * 需求：
 * 		将数据库中的数据展示在控制台
 *
 */
public class Demo1 {

    public static void main(String[] args) throws Exception {
        //注册驱动
        //不能用DriverManager.registerDriver(new com.mysql.jdbc.Driver());  //由于参数里创建新对象的时候Driver类里有静态代码在类加载是自动执行进行注册驱动，所以这一句会注册两个驱动，多以不用这句
        Class.forName("com.mysql.jdbc.Driver"); //这一句是要加载这个类，返回值不知道咋用。
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
            System.out.println(result.getString(2) + "\t" + result.getString(3)); //string可以用getInt取，只要内容是数字
        }

        statement.close();
        result.close();
        connection.close();
    }

}
