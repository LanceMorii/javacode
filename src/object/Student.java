package object;

/**
 * @Author: Maven
 * @Date: 2025/8/9 20:17
 * @description TODO: 描述该文件的用途
 */
public class Student {
    private String name;
    private int age;

    //如果没有写任何的构造方法,虚拟机会给我们加一个空参构造方法
    public Student() {
        System.out.println("我执行了吗");
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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
