package interfacedemo.Demo;

/**
 * @Author: Maven
 * @Date：2025/09/12 01:23
 * @OOTD: 运动员抽象类
 */
public abstract class athlete extends Person{

    public abstract void study();

    public athlete(String name, int age) {
        super(name, age);
    }

    public athlete() {
    }
}
