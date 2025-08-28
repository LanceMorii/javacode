package polymorphism.a1;

/**
 * @Author: Maven
 * @Date: 2025/8/29 2:29 （日期和时间）
 * @OOTD: 文件内容
 */
public class Person {
    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public void show() {
        System.out.println(name + ":" + age);
    }

}
