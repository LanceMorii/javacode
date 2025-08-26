package test;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/4 12:36
 * @description TODO: 求平方根
 * 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 */
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int num = sc.nextInt();
        for (int  i= 1; i <= num; i++){
            if (i * i == num){
                System.out.println( i+"就是"+num+"的平方根");
            }else if (i * i > num){
                System.out.println((i-1)+"就是"+num+"的平方根");
                break;
            }
        }
    }
}
