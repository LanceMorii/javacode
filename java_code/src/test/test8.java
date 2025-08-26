package test;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/5 17:43
 * @description TODO: 猜数字游戏(扩展:抽奖规则)
 * 注意事项:生成随机数的代码是不能写在循环里面的,否则每一次都会产生一个随机数
 */
public class test8 {
    public static void main(String[] args) {
        int count = 0;
        Random random = new Random();
        int number = random.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入数字：");
            int cai = sc.nextInt();
            count ++;
            if (count == 3){
                System.out.println("你猜的次数已经超过三次，游戏结束");
                break;
            }
            if (cai > number){
                System.out.println("你猜大了");
            }else if (cai < number){
                System.out.println("你猜的数字太小了");
            }else {
                System.out.println("恭喜你猜对了");
                break;
         }
        }
    }
}
