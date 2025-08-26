package StringDemo;

/**
 * @Author: Maven
 * @Date: 2025/8/12 12:52
 * @description TODO: 描述该文件的用途
 */
public class StringDemo1 {
    public static void main(String[] args) {
        //1.使用直接赋值获取一个
        String s1 = "hello";
        System.out.println(s1);

        //使用new的方法来获取一个字符串对象
        //空参构造
        String s2 = new String();
        System.out.println("@" + s2 + "@");

        //传递字符串
        String s3 = new String("hello");
        System.out.println("@" + s3 + "@");

        //传递字符数组
        char [] chs = {'h', 'e', 'l', 'l', 'o'};
        String s4 = new String(chs);
        System.out.println(s4);

        //传递字节数组
        //应用场景:网络中传输的数据是字节信息,对字节信息转换为字符串
        byte [] bytes = {97, 98, 99, 100};
        String s5 = new String(bytes);
        System.out.println(s5);


    }
}
