package interfacedemo;

/**
 * @Author: Maven
 * @Date：2025/09/12 00:38
 * @OOTD: 文件内容
 */
public class Rabbit extends Animal{
    @Override
    public void eat() {
        System.out.println("兔子在吃草");
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }

    public Rabbit() {
    }
}
