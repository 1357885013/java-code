package myCode;

import java.sql.*;

public class MyMysql {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/word", "root", "root");
            String[] words = new String[]{"hello", "fuck"};
            String sql = "select * from english_words where word in (?)";
            sql=String.format(sql.replace("?","%s"), format(words) );
            System.out.println(sql);
            Statement state = c.createStatement();
            long timeBegin=System.nanoTime();
            ResultSet r = state.executeQuery(sql);
            System.out.println("((System.nanoTime()-timeBegin)/1000000) = " + ((System.nanoTime() - timeBegin) / 1000000F));
            while (r.next()) {
                System.out.println(r.getString(2) + "    " + r.getString(3));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("e.getSQLState() = " + e.getSQLState());
            System.out.println("e.getMessage() = " + e.getMessage());
        }
    }
    public static String format(String[] s){
        StringBuilder result =new StringBuilder();
        for(String t:s){
            result.append("'"+t+"',");
        }
        return result.substring(0,result.length()-1);
    }
}
