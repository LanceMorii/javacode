package interfacedemo;

/**
 * @Author: Maven
 * @Date：2025/09/12 00:38
 * @OOTD: 文件内容
 */
public class Frog extends Animal implements Swim{


    @Override
    public void eat() {
        System.out.println("青蛙在吃饭");
    }

    public Frog(String name, int age) {
        super(name, age);
    }

    public Frog() {
    }

    @Override
    public void swim() {
        System.out.println("青蛙在游泳");
    }
}
