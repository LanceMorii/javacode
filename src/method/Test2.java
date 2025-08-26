package method;

/**
 * @Author: Maven
 * @Date: 2025/8/7 11:40
 * @description TODO: 求长方形的周长,结果在方法中打印
 */
public class Test2 {
    public static void main(String[] args) {
        getLong(5.2 , 3.4);
    }

    public static void getLong(double len, double width) {
        double long1 = (len + width) * 2;
        System.out.println(long1);
    }

}
