package test;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/4 0:49
 * @description TODO: 力扣求商和余数练习
 * 需求：给定两个整数，被除数和除数（都是正数，且不超过int的范围）
 * 将两数相除，要求不使用乘法、除法和%运算符，得到商和余数。
 * <p>
 * 分析:被除数 / 除数 = 商 ... 余数
 */
public class test2 {
    public static void main(String[] args) {
//定义变量用来记录被除数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数:");
        int devidend = sc.nextInt();
        //定义变量用来记录除数
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入除数:");
        int divisor = sc1.nextInt();
        //定义一个变量用来统计相减多少次
        int cont = 0;
        //循环while
        while (devidend >= divisor) {
            devidend = devidend - divisor;
            cont++;
        }
        System.out.println("商为:" + cont);
        System.out.println("余数为:" + devidend);
    }
}
