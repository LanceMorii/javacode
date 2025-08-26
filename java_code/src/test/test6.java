package test;

import java.util.Random;

/**
 * @Author: Maven
 * @Date: 2025/8/5 17:31
 * @description TODO: 猜数字游戏
 */
public class test6 {
    public static void main(String[] args) {
        //导包
        //创建对象
        Random r = new Random();

        //生成随机数
        for (int i = 0; i < 100; i++) {
            int num = r.nextInt(100);//在小括号里面写的是随机数的范围,,注意：范围是左闭右开的

            System.out.println(num);

        }
    }
}
