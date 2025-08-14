package object;

/**
 * @Author: Maven
 * @Date: 2025/8/9 18:54
 * @description TODO: 创建女朋友对象,调用方法,给属性赋值
 */
public class GirlFriendTest {
    public static void main(String[] args) {
        //创建女朋友对象
        GirlFriend gf1 = new GirlFriend();
        gf1.setName("小花花");
        gf1.setAge(-18);//非法数据,用初始值代替
        gf1.setSex("女");
        System.out.println(gf1.getName());
        System.out.println(gf1.getAge());
        System.out.println(gf1.getSex());

        gf1.eat();
        gf1.sleep();

        GirlFriend gf2 = new GirlFriend();
        gf2.setName("小蛋蛋");
        gf2.setAge(19);
        gf2.setSex("女");
        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getSex());

        gf2.eat();
        gf2.sleep();
    }
}
