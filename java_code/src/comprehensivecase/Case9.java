package comprehensivecase;

import java.util.Random;

/**
 * @Author: Maven
 * @Date: 2025/8/9 09:52
 * @description TODO: 抢红包,{2,588,888,1000,10000}五个奖金,奖项出现的顺序要随机且不重复
 */

public class Case9 {
    public static void main(String[] args) {
        int[] arr = {2, 588, 888, 1000, 10000};
        int[] newArr = new int[arr.length];

        Random r = new Random();
        int count = 0; // 记录已抽出的奖项数量

        while (count < arr.length) {
            int randomIndex = r.nextInt(arr.length);
            int prize = arr[randomIndex];

            // 只有当奖项不存在时才添加到结果数组
            if (!contains(newArr, prize)) {
                newArr[count] = prize;
                count++;
            }
        }

        // 输出结果
        for (int prize : newArr) {
            System.out.print(prize + " ");
        }
    }

    // 判断奖项是否已存在
    public static boolean contains(int[] arr, int prize) {
        for (int num : arr) {
            if (num == prize) {
                return true;
            }
        }
        return false;
    }
}