package keyboard_input;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/7/30 16:38
 * @description TODO: 练习:
 */
public class Scannertest1 {
    public static void main(String[] args) {
        //1.创建一个键盘录入对象
        Scanner sc = new Scanner(System.in);

        //请输入两个整数
        System.out.println("请输入两个整数:");

        //接收数据
        int i = sc.nextInt();
        int j = sc.nextInt();

        //两个数之和为sum
        int sum = i + j;

        //计算两个整数的和
        System.out.println("两个整数的和为:"+sum);
    }
}
