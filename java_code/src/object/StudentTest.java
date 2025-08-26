package object;

/**
 * @Author: Maven
 * @Date: 2025/8/9 20:17
 * @description TODO: 描述该文件的用途
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建对象
        //括号内什么都没写就是:空参构造
        //Student s = new Student();

        Student s = new Student("张三" , 18);
        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
