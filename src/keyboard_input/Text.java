package keyboard_input;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/10 19:09
 * @description TODO: 描述该文件的用途
 */
public class Text {
    public static void main(String[] args) {
        //键盘录入的第一套体系
        //nextInt();接收整数
        //nextDouble();接收小数
        //next();接收字符串
        //遇到空格,制表符,回车就停止接收


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int i = sc.nextInt();
        System.out.println(i);
        System.out.println("请输入一个字符串:");
        String str = sc.next();
        System.out.println(str);

        //第二套体系
        //nextLine();接收字符串
        System.out.println("请输入一个字符串:");
        String str1 = sc.nextLine();
        System.out.println(str1);

    }
}
