package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Maven
 * @date 2025/8/15 10:47
 * @description OOTD :文件的描述
 **/
public class Test5 {
    public static void main(String[] args) {
        // 创建一个集合，存储Student元素
        ArrayList<Student> list =new ArrayList<>();

        //键盘录入
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Student s = new Student();
            System.out.println("请输入学生的姓名");
            String name = sc.next();
            s.setName(name);
            System.out.println("请输入学生的年龄");
            int age = sc.nextInt();
            s.setAge(age);
            list.add(s);
        }

        //遍历
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + "---" + s.getAge());
        }

    }
}
