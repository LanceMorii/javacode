package object;

/**
 * @Author: Maven
 * @Date: 2025/8/9 18:52
 * @description TODO: 编写一个女朋友类
 */
public class GirlFriend1 {
    private int age;//0

    public void method() {
        int age = 10;
        System.out.println(this.age);////要使用成员变量就得使用this
        System.out.println(age);//遵循就近原则,优先使用局部变量10
    }

}
