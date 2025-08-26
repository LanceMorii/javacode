package test;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/4 0:35
 * @description TODO: 力扣练习回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 例如，121 是回文，而 123 不是。
 */
public class test1 {
    public static void main(String[] args) {

        //定义数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字进行判断:");
        int x = sc.nextInt();
        int temp = x;//临时变量,用于记录最后比较
        int num = 0;//用于记录倒过来的结果
        while (x != 0) {
            //利用循环从右往左获取每一位数字
            int ge = x % 10;
            //修改一下x记录的值
            x = x / 10;
            //把当前获取到的数字拼接到最右边
            num = num * 10 + ge;
        }
        //打印最后的结果
        System.out.println(num);
        //比较
        System.out.println(num == temp);

//        //思路:把数字倒过来,再与原数字进行比较
//        //1.定义数字
//        int x = 12;
//        //2.获取个位
//        int ge = x % 10;
//        //3.获取十位
//        int shi = x / 10 % 10;
//
//        //拼接
//        int res = ge * 10+shi;
//        System.out.println( res);
    }
}
