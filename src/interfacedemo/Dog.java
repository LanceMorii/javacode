package interfacedemo;

/**
 * @Author: Maven
 * @Date：2025/09/12 00:39
 * @OOTD: 文件内容
 */
public class Dog extends Animal implements Swim{
    @Override
    public void eat() {
        System.out.println("狗在吃骨头");
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }
}
