package comprehensivecase;

import java.util.Random;

/**
 * @Author: Maven
 * @Date: 2025/8/9 00:39
 * @description TODO: 开发验证码(定义方法实现随机产生一个5位的随机数)
 * 验证码格式:
 * 长度5位
 * 前4位是大写字母或者小写字母
 * 最后一位是数字
 */
public class Case4 {
    public static void main(String[] args) {
        //技巧:在以后如果在一堆没有规律的数据中随机抽取时,可以先把数据存储到一个数组中,然后使用随机数索引的方式抽取数据
        /*
         * 分析:
         * 1.大写字母和小写字母都放到一个数组中
         * 2.随机抽取4次
         * 3.随机抽取一个数字
         * */
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //Ascii码表:A:65  Z:90  a:97  z:122
            if (i <= 25) {
                //大写字母
                chs[i] = (char) ('a' + i);
            } else {
                //小写字母
                chs[i] = (char) ('A' + i - 26);
            }
        }

        String result = "";

        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int RandomIndex = r.nextInt(chs.length);
            //利用随机索引的方式抽取数据
            //System.out.print(chs[RandomIndex]);
            result = result + chs[RandomIndex];
        }

        int number = r.nextInt(10);
        result = result + number;

        //打印最终结果
        System.out.println(result);

    }
}
