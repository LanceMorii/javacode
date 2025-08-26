package StringDemo;

/**
 * @Author: Maven
 * @Date: 2025/8/12 12:52
 * @description TODO: 描述该文件的用途
 */
public class StringDemo2 {
    public static void main(String[] args) {
        //创建两个字符串对象
        String s1 = "hello";
        String s2 = new String("hello");

        //==比较
        //基本数据类型,比的是数据值
        //引用数据类型,比的是地址值
        System.out.println(s1 == s2);

        //比较字符串对象中的内容是否相等
        boolean result1 = s1.equals(s2);
        System.out.println( result1);

        //比较字符串对象中的内容是否相等,忽略大小写
        boolean result2 = s1.equals(s2);
        System.out.println( result2);


    }
}
