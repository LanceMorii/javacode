package operators;


import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/7/30 17:06
 * @description TODO: 练习:键盘录入一个三位数,将其拆分为个位十位百位后,打印出来
 */
public class Operatorstest1 {
    public static void main(String[] args) {
        //1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数:");

        int number = sc.nextInt();
        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100;
        System.out.println("个位:" + ge);
        System.out.println("十位:" + shi);
        System.out.println("百位:" + bai);
    }
}
