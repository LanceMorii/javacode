package comprehensivecase;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/9 01:04
 * @description TODO: 评委打分,有6个评委打分，去掉一个最高分，一个最低分，求平均分(剩下4个评委的平均分)
 */
public class Case6 {
    public static void main(String[] args) {
        //使用getScores方法获取数组(评委打的分数)
        int[] scoreArr = getScores();
        //打印数组
        for (int i = 0; i < scoreArr.length; i++) {
            System.out.println("第" + (i + 1) + "个评委打分是：" + scoreArr[i]);
        }
        //获取数组的最大值(最高分)
        int max = getMax(scoreArr);
        //获取数组的最小值(最低分)
        int min = getMin(scoreArr);
        //获取数组的总和(总分)
        int sum = getSum(scoreArr);
        //获取数组的平均值(平均分)
        int avg = (sum - max - min) / (scoreArr.length - 2);
        //打印输出结果
        System.out.println("总分是:"+sum);
        System.out.println("平均分是:"+avg);
    }

    public static int getSum(int[] scoreArr) {
        int sum = 0;
        for (int i = 0; i < scoreArr.length; i++) {
            sum = sum + scoreArr[i];
        }
        return sum;
    }

    //求数组的最大值
    public static int getMax(int [] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }
        return max;
    }

    public static int getMin(int [] scores) {
        int min = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
        }
        return min;
    }

    public static int[] getScores () {
        //定义数组
        int[] scores = new int[6];
        //使用键盘录入6个评委的分数
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length;) {
            System.out.println("请输入评委的分数:");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                scores[i] = score;
                i ++;
            }else {
                System.out.println("输入的分数有误，请重新输入,当前的i是:"+ i);
            }
        }
        return scores;
    }
}
