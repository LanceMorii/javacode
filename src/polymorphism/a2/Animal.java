package polymorphism.a2;

/**
 * @Author: Maven
 * @Date: 2025/8/30 14:12 （日期和时间）
 * @OOTD: 文件内容
 */
public class Animal {
    private int age;
    private String color;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Animal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public Animal() {
    }

    public void eat(String something) {
        System.out.println("动物在吃" + something);
    }

}
