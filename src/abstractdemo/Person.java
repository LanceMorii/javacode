package abstractdemo;

/**
 * @Author: Maven
 * @Date: 2025/9/5 22:16 （日期和时间）
 * @OOTD: 文件内容
 */
public abstract class Person {
    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

    public abstract void  work() ;

    public void sleep(){
        System.out.println("睡觉");
    }

}
