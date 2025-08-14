package method;

/**
 * @Author: Maven
 * @Date: 2025/8/7 11:43
 * @description TODO: 求圆的面积
 */
public class Test3 {
    public static void main(String[] args) {
        getArea(5);
    }

    public static void getArea(double r) {
        double pi = Math.PI;//调用Math类中的PI属性
        double result = pi * r * r;
        System.out.println("圆的面积是：" + result);
    }

}
