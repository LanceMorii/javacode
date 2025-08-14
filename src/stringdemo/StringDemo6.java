package stringdemo;

import java.util.Scanner;

/**
 * @author Maven
 * @date 2025/8/13 19:29
 * @description OOTD :键盘录入一个字符串,统计整个字符串中大写字母字符串,小写字母字符串,数字字符出现的次数
 **/
public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        //统计 -- 计数器思想
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;
        for (int i = 0; i < str.length(); i++) {
            //i表示字符串的索引
            char c = str.charAt(i);
            //  对c进行判断
            if (c >= 'A' && c <= 'Z') {
                //char类型的数据在参与计算中会自动转换成int类型
                bigCount++;
            } else if (c >= 'a' && c <= 'z') {
                smallCount++;
            } else if (c >= '0' && c <= '9') {
                numberCount++;
            }
        }
        System.out.println("大写字母出现的次数为：" + bigCount);
        System.out.println("小写字母出现的次数为：" + smallCount);
        System.out.println("数字出现的次数为：" + numberCount);
    }
}
