package StringDemo;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/12 12:52
 * @description TODO: 描述该文件的用途
 */
public class StringDemo3 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str1 = sc.next();//是new出来的
        //代码中定义一个字符串abc
        String str2 = "abc";//直接赋值的
        //用==比较,这两者一样吗?
        System.out.println(str1 == str2);//str1是new出来的,str2是直接赋值的,所以str1和str2不一样

        //只要相比较字符串的内容,必须用equals方法

    }
}
