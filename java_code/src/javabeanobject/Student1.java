package javabeanobject;

/**
 * @Author: Maven
 * @Date: 2025/8/11 13:30
 * @description TODO: 描述该文件的用途
 */
public class Student1 {
    private int id;
    private String name;
    private int age;

    public Student1() {
    }

    public Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
