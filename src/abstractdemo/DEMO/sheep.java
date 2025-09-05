package abstractdemo.DEMO;

import java.sql.SQLOutput;

/**
 * @Author: Maven
 * @Date: 2025/9/5 22:39 （日期和时间）
 * @OOTD: 文件内容
 */
public class sheep extends  Animal{
    public sheep(String name, int age) {
        super(name, age);
    }

    public sheep() {
    }

    @Override
    public void eat() {
        System.out.println("山羊在吃草");
    }
}
