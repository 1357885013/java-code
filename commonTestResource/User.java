package commonTestResource;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    int age;
    String phone;
    String email;

    public User() {
    }

    public User(String name, int age) {
        name = name;
        age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
