package stringbuilder;

import java.util.Scanner;

/**
 * @author Maven
 * @date 2025/8/14 13:13
 * @description OOTD :文件的描述
 **/
public class StringBuilder3 {
    public static void main(String[] args) {
        //链式编程
        //当我们调用一个方法的时候,不需要变量接受他的结果,可以连续调用其他方法

        int len = getString().substring(1).replace("A", "B").length();
        System.out.println(len);

    }

    public static String getString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        return str;
    }

}
