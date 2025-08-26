package method;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/7 11:26
 * @description TODO: 人肉就算器
 */
public class Test1 {
    public static void main(String[] args) {
        //利用方法最简单的格式完成
        getSum();
    }

    public static void getSum() {
        int a = 0;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入数字1：");
        a = sc1.nextInt();
        int b = 0;
        Scanner sc2 = new Scanner(System.in);
        System.out.println("请输入数字2：");
        b = sc2.nextInt();

        int result = a + b;
        System.out.println("和是:"+result);
    }
}
