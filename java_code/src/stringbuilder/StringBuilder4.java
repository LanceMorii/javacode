package stringbuilder;

import java.util.Scanner;

/**
 * @author Maven
 * @date 2025/8/14 13:29
 * @description OOTD :对称字符串
 **/
public class StringBuilder4 {
    public static void main(String[] args) {
        //键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串:");
        String str = sc.next();

        //翻转键盘录入的字符串
        String result = new StringBuilder(str).append(str).reverse().toString();

        //比较
        if (str.equals(result)){
            System.out.println("当前字符串是对称字符串");
        }else {
            System.out.println("当前字符串是不对称字符串");
        }

    }
}
