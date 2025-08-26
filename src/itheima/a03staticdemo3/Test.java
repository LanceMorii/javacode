package itheima.a03staticdemo3;

import java.util.ArrayList;

/**
 * @author Maven
 * @date 2025/8/19 13:55
 * @description OOTD :测试类
 **/
public class Test {
    public static void main(String[] args) {
        //创建有一个集合用来存储学生信息
      ArrayList<Student> list = new ArrayList<>();

        //创建学生对象3个
        Student s1 = new Student("张三", 18, "男");
        Student s2 = new Student("李四", 19, "女");
        Student s3 = new Student("王五", 20, "男");

        //添加元素
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //调用工具类中的方法
        int maxAge = StudentUtil.getMaxAge(list);
        System.out.println(maxAge);
    }
}
