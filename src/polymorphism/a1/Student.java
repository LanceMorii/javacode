package polymorphism.a1;

/**
 * @Author: Maven
 * @Date: 2025/8/29 2:30 （日期和时间）
 * @OOTD: 文件内容
 */
public class Student extends  Person{
    @Override
    public void show() {
        System.out.println("学生的信息为:" + getName() + getAge());
    }
}
