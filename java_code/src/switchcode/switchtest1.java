package switchcode;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/4 0:27
 * @description TODO: switch练习
 */
public class switchtest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数:");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("爬山");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("拳击");
                break;
            case 5:
                System.out.println("游泳");
                break;
            case 6:
                System.out.println("看电影");
                break;
            default:
                System.out.println("没有这个星期");
        }
    }
}
