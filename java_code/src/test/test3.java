package test;

/**
 * @Author: Maven
 * @Date: 2025/8/4 12:27
 * @description TODO: 逢7过
 * 游戏规则:从任意一个数字开始报数，当你要报的数字是包含7或者是7的倍数时都要说过:过
 * 需求:使用程序在控制台打印出1-100之间的满足逢七必过规则的数据
 */
public class test3 {
    public static void main(String[] args) {
        //得到1-100之间的数据
        for (int i = 1; i <= 100; i++){

            if (i % 7 == 0 || i / 10 == 7 || i % 10 == 7){
                System.out.print("过 ");
            }else {
                System.out.print(i+"");
            }
        }
    }
}
