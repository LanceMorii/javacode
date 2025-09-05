package abstractdemo;

/**
 * @Author: Maven
 * @Date: 2025/9/5 22:22 （日期和时间）
 * @OOTD: 文件内容
 */
public class Test {
    public static void main(String[] args) {
        //创建对象
        //Person p = new Person();

        Student s = new Student("张三", 18);
        System.out.println(s.getName() + "--" + s.getAge());

    }
}
