package polymorphism.a1;

/**
 * @Author: Maven
 * @Date: 2025/8/29 2:33 （日期和时间）
 * @OOTD: 文件内容
 */
public class Test {
    public static void main(String[] args) {
        //创建三个对象
        Student s = new Student();
        s.setName("张三");
        s.setAge(18);

        Teacher t = new Teacher();
        t.setName("王五");
        t.setAge(20);


        Admin a = new Admin();
        a.setName("李四");
        a.setAge(21);

        register(s);
        register(t);
        register(a);

    }

    //这个方法既可以接收学生对象, 也可以接收老师对象,还可以接收管理员对象
    public static void register(Person p) {
        p.show();
    }

}
