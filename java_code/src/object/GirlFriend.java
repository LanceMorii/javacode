package object;

/**
 * @Author: Maven
 * @Date: 2025/8/9 18:52
 * @description TODO: 编写一个女朋友类
 */
public class GirlFriend {
    private String name;
    private int age;
    private String sex;

    //针对每一个私有化的成员变量,都要提供get和set方法
    //set方法:给成员变量赋值
    //get方法:获取成员变量的值

    //name
    //作用:给成员变量赋值
    public void setName(String name) {
        //局部变量表示测试类中调用方法传递过来的数据
        //等号的左边就表示成员位置的name
        this.name = name;
    }

    //作用:对外提供name属性的值
    public String getName() {
        return name;
    }

    //age
    //setAge
    public void setAge(int age) {
        if (age >= 18 && age <= 35) {
            this.age = age;
        } else {
            System.out.println("非法数据");
        }
    }

    //getAge
    public int getAge() {
        return age;
    }

    //Sex
    //setSex
    public void setSex(String sex) {
        this.sex = sex;
    }

    //getSex
    public String getSex() {
        return sex;
    }

    //行为
    public void sleep() {
        System.out.println(name + "正在睡觉");
    }

    public void eat() {
        System.out.println(name + "正在吃饭");
    }

}
