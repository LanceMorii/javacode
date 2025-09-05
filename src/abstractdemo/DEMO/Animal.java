package abstractdemo.DEMO;

/**
 * @Author: Maven
 * @Date: 2025/9/5 22:37 （日期和时间）
 * @OOTD: 文件内容
 */
public abstract class Animal {
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

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal() {
    }

    public void drink() {
        System.out.println("动物在喝水");
    }

    public abstract void eat();
}
