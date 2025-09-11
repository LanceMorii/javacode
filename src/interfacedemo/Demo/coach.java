package interfacedemo.Demo;

/**
 * @Author: Maven
 * @Date：2025/09/12 01:26
 * @OOTD: 教练抽象类
 */
public abstract class coach extends Person{

    public abstract void teach();

    public coach(String name, int age) {
        super(name, age);
    }

    public coach() {
    }
}
