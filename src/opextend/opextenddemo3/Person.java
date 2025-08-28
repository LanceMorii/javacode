package opextend.opextenddemo3;

/**
 * @Author: Maven
 * @Date: 2025/8/29 01:29 （日期和时间）
 * @OOTD: 文件内容
 */
public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类的无参构造方法");
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
