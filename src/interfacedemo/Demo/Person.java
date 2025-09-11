package interfacedemo.Demo;

/**
 * @Author: Maven
 * @Date：2025/09/12 01:19
 * @OOTD: 综合案例
 */
//我不想让外界直接创建人的对象,因为直接创建父类人的对象是没有意义的,所以直接设置为抽象
public abstract class Person {
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
}
