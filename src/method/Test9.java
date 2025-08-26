package method;

/**
 * @Author: Maven
 * @Date: 2025/8/8 14:13
 * @description TODO: 使用重载
 */
public class Test9 {
    public static void main(String[] args) {

        //调用
        //compare(10,20);
        //compare((byte) 10,(byte) 10);
        int a = 10;
        int b = 20;
        compare(a,b);
    }

    //把相同方法名起成一样的名字

    public static void compare(byte b1 , byte b2) {
        System.out.println("byte");
        System.out.println(b1 == b2);
    }
    public static void compare(short s1 , short s2) {
        System.out.println("short");
        System.out.println(s1 == s2);
    }
    public static void compare(int i1 , int i2) {
        System.out.println("int");
        System.out.println(i1 == i2);
    }
    public static void compare(long n1 , long n2) {
        System.out.println("long");
        System.out.println(n1 == n2);
    }
}
