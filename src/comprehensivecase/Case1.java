package comprehensivecase;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/8 23:33
 * @description TODO: 专题案例1
 * 卖飞机票,按照淡旺季、头等舱、经济舱的收费规则,输入机票原价,月份和头等舱、经济舱
 * 机票价格计算规则:旺季(5-10月) 头等舱9折、经济舱8.5折,淡季(11-4月) 头等舱7折、经济舱6.5折
 * <p>
 * //分析:
 * 1. 键盘输入机票原价、月份、头等舱、经济舱
 * 2. 判断旺季淡季
 * 3. 判断头等舱、经济舱
 * 4. 计算机票价格并输出
 */
public class Case1 {
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
            if (seat == 0) {
                //头等舱
                ticket = (int) (ticket * 0.9);
            } else if (seat == 1) {
                //经济舱
                ticket = (int) (ticket * 0.85);
            } else {
                //表示输入的舱位等级是一个非法数据
                System.out.println("输入的舱位等级有误");
            }
        } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
            //表示淡季
            if (seat == 0) {
                //头等舱
                ticket = (int) (ticket * 0.7);
            } else if (seat == 1) {
                //经济舱
                ticket = (int) (ticket * 0.65);
            } else {
                //表示输入的舱位等级是一个非法数据
                System.out.println("输入的舱位等级有误");
            }
        } else {
            //表示键盘录入的月份是一个非法数据
            System.out.println("输入的月份有误");
        }
        System.out.println("机票价格是:" + ticket);
    }


}
