package abstractdemo.DEMO;

/**
 * @Author: Maven
 * @Date: 2025/9/5 22:41 （日期和时间）
 * @OOTD: 测试类
 */
public class Test {
    public static void main(String[] args) {
        frog f = new frog("小青", 1);
        System.out.println(f.getName() + " " + f.getAge());
        f.drink();
        f.eat();
    }
}
