package object;

/**
 * @Author: Maven
 * @Date: 2025/8/9 18:27
 * @description TODO: Phone测试类
 */
public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();
        //给手机赋值
        p.brand = "华为";
        p.price = 5999.99;
        //获取手机对象的值
        System.out.println("手机品牌:" + p.brand);
        System.out.println("手机价格:" + p.price);
        //调用手机中的方法
        p.call();
        p.playgame();
        Phone p1 = new Phone();
        p1.brand = "苹果";
        p1.price = 9999.99;
        System.out.println("手机品牌:" + p1.brand);
        System.out.println("手机价格:" + p1.price);
        p1.call();
        p1.playgame();
    }
}
