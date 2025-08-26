package test;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/4 12:46
 * @description TODO: 求质数
 * 如果一个数只能被1和本身整除，那么这个数就是一个质数。,否则就是一个合数。
 */
public class test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int num = sc.nextInt();
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                System.out.println(num+"不是质数");
                break;
            }

        }
    }
}
