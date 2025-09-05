package abstractdemo.DEMO;

/**
 * @Author: Maven
 * @Date: 2025/9/5 22:39 （日期和时间）
 * @OOTD: 文件内容
 */
public class dog extends Animal{
    public dog(String name, int age) {
        super(name, age);
    }

    public dog() {
    }

    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
