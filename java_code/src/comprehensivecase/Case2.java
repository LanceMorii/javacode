package comprehensivecase;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/8 23:48
 * @description TODO: 专题案例1(优化版:构建一个方法getPrice)
 */
public class Case2 {
    public static void main(String[] args) {
        //键盘录入机票原价、月份、头等舱、经济舱
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票原价:");
        int ticket = sc.nextInt();
        System.out.println("请输入当前月份:");
        int month = sc.nextInt();
        System.out.println("请输入当前舱位等级 0 头等舱 1 经济舱:");
        int seat = sc.nextInt();
        //判断旺季淡季
        if (month >= 5 && month <= 10) {
            //表示旺季
            //判断头等舱、经济舱
            ticket = getPrice(seat, ticket, 0.9, 0.85);
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //表示淡季
            ticket = getPrice(seat, ticket, 0.7, 0.65);
        } else {
            //表示键盘录入的月份是一个非法数据
            System.out.println("输入的月份有误");
        }
        System.out.println("机票价格是:" + ticket);
    }

    public static int getPrice(int seat, int ticket, double x, double x1) {
        if (seat == 0) {
            //头等舱
            ticket = (int) (ticket * x);
        } else if (seat == 1) {
            //经济舱
            ticket = (int) (ticket * x1);
        } else {
            //表示输入的舱位等级是一个非法数据
            System.out.println("输入的舱位等级有误");
        }
        return ticket;
    }
}
