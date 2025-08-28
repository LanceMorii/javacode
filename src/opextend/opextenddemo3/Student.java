package opextend.opextenddemo3;

/**
 * @Author: Maven
 * @Date: 2025/8/29 01:31 （日期和时间）
 * @OOTD: 文件内容
 */
public class Student extends Person {
    public Student() {
        super();
        System.out.println("子类的无参构造");
    }

    public Student(String name, int age) {
        super(name, age);
    }

}
