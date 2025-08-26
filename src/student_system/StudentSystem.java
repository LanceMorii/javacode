package student_system;

import com.sun.source.tree.UsesTree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Maven
 * @date 2025/8/16 18:22
 * @description OOTD :文件的描述
 **/
public class StudentSystem {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        loop: while (true) {
            System.out.println("----------------------欢迎来到黑马学生管理系统----------------------");
            System.out.println("1. 添加学生");
            System.out.println("2. 删除学生");
            System.out.println("3. 修改学生");
            System.out.println("4. 查询学生");
            System.out.println("5. 退出学生");
            System.out.println("----------------------------------------------------------------");
            // 键盘录入
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            // 判断用户键盘录入的内容
            switch (choose) {
                case "1" -> addStudent(list);
                case "2" -> deleteStudent(list);
                case "3" -> updateStudent(list);
                case "4" -> queryStudent(list);
                case "5" -> {
                    System.out.println("退出成功");
                    break loop;
                }
                default -> System.out.println("输入有误，请重新输入");
            }
        }
    }

    // 添加学生的业务逻辑
    public static void addStudent(ArrayList<Student> list) {
        Student s = new Student();
        System.out.println("添加学生");
        /// 键盘录入
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生的id");
            String id = sc.next();
            s.setId(id);
            boolean flag = contains(list, id);
            if (flag) {
                // 表示id已经存在
                System.out.println("id已存在，请重新输入");
            } else {
                // 表示id不存在,可以使用
                s.setId(id);
                break;
            }
        }

        System.out.println("请输入学生的姓名");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生的年龄");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生的地址");
        String address = sc.next();
        s.setAddress(address);

        // 把学生对象添加到集合中
        list.add(s);

        // 提示一下用户
        System.out.println("学生信息添加成功！");

    }

    // 删除学生的业务逻辑
    public static void deleteStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除学生的id");
        String id = sc.next();
        int index = getIndex(list, id);
        // 对index进行判断
        // 如果index == -1,说明没有找到,回到菜单
        // 如果大于0,表示存在,直接删除
        if (index >= 0) {
            list.remove(index);
            System.out.println("id为" + id + "的删除成功");
        } else {
            System.out.println("id为" + id + "的学生不存在,删除失败");
        }
    }

    // 修改学生的业务逻辑
    public static void updateStudent(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id = sc.next();
        int index = getIndex(list, id);
        if (index == -1) {
            System.out.println("id为" + id + "的学生不存在,修改失败");
            return;
        }

        // 当代码执行到这里,表示id是存在的
        Student stu = list.get(index);

        // 输入其他信息并更改
        System.out.println("请输入新的姓名");
        String newName = sc.next();
        stu.setName(newName);

        System.out.println("请输入新的年龄");
        int newAge = sc.nextInt();
        stu.setAge(newAge);

        System.out.println("请输入新的地址");
        String newAddress = sc.next();
        stu.setAddress(newAddress);

        System.out.println("学生信息修改成功");
    }

    // 查询学生的业务逻辑
    public static void queryStudent(ArrayList<Student> list) {
        System.out.println("查询学生");
        // 查询当前集合中是否为空
        if (list.size() == 0) {
            System.out.println("当前没有学生信息,请添加后再进行查询");
            return;
        }

        // 当代码执行到这里时,代表集合中有数据
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }

    }

    // 判断id在集合中是否存在
    public static boolean contains(ArrayList<Student> list, String id) {
        // 循环遍历集合,得到每一个Student对象
        // 拿到学生对象后获取id
        /*
         * for (int i = 0; i < list.size(); i++) {
         * Student stu = list.get(i);
         * String sid = stu.getId();
         * if (sid.equals(id)) {
         * //存在返回true
         * return true;
         * }
         * }
         * return false;
         */
        return getIndex(list, id) >= 0;
    }

    // 通过id获取索引
    public static int getIndex(ArrayList<Student> list, String id) {
        // 循环遍历集合,得到每一个Student对象
        // 拿到学生对象后获取id
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String sid = stu.getId();
            if (sid.equals(id)) {
                // 存在返回索引
                return i;
            }
        }
        // 循环结束后如果还没有找到,表示不存在
        return -1;
    }

}
