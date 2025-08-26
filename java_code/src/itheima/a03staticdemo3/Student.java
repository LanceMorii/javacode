package itheima.a03staticdemo3;

/**
 * @author Maven
 * @date 2025/8/19 13:55
 * @description OOTD :文件的描述
 **/
public class Student {
    private String name;
    private int age;
    private String Gender;

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
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        Gender = gender;
    }

    public Student() {
    }
}
