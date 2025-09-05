package abstractdemo;

/**
 * @Author: Maven
 * @Date: 2025/9/5 22:28 （日期和时间）
 * @OOTD: 文件内容
 */
public class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    public Student() {
    }

    @Override
    public void work() {
        System.out.println("学生工作是学习");
    }
}
