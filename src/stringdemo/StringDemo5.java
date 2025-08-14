package stringdemo;

import java.util.Scanner;

/**
 * @author Maven
 * @date 2025/8/13 18:49
 * @description OOTD :键盘录入一个字符串遍历
 **/
public class StringDemo5 {
    public static void main(String[] args) {
        //键盘录入一个字符串遍历

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();

        //2.进行遍历

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println(ch);
        }

    }
}
