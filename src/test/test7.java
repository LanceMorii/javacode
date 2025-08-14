package test;

import java.util.Random;

/**
 * @Author: Maven
 * @Date: 2025/8/5 17:38
 * @description TODO: 描述该文件的用途
 */
public class test7 {
    public static void main(String[] args) {
        Random r =new Random();
        int number = r.nextInt(100)+1;
        System.out.println( number );


       //用来生成任意数到任意数的随机数
        Random r1 =new Random();
        int num = r.nextInt(9)+7;
        System.out.println( num );
    }
}
