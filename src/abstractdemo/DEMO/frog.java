package abstractdemo.DEMO;

/**
 * @Author: Maven
 * @Date: 2025/9/5 22:39 （日期和时间）
 * @OOTD: 文件内容
 */
public class frog extends Animal{
    public frog(String name, int age) {
        super(name, age);
    }

    public frog() {
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }
}
