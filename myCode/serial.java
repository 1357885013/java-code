package myCode;

import commonTestResource.User;

import java.io.*;

public class serial {
    public static void main(String[] args) {

        try {
            // ���������
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("D://testSerializable")));
            objectOutputStream.writeObject(new User("zhangsan", 100));
            objectOutputStream.close();

            // ����������
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("D://testSerializable")));
            User user = (User) objectInputStream.readObject();
            System.out.println(user);
            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
