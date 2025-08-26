package itheima.a01staticdemo1;

/**
 * @author Maven
 * @date 2025/8/19 05:21
 * @description OOTD :文件的描述
 **/
public class Student {
    //属性:姓名,年龄,性别
    private String name;
    private int age;
    private static String gender;
    public static String teacherName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        Student.gender = gender;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    //行为
    public void study() {
        System.out.println(name + "正在学习");
    }

    public void show() {
        System.out.println(name + "," + age + ",性别：" + gender +","+ teacherName );
    }

}
