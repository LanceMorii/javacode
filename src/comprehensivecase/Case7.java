package comprehensivecase;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/9 01:31
 * @description TODO: 数字加密
 * 规则:先得到每位数,然后每位数+5,再对10求余,最后将所有数字翻转,得到一串新数
 */

public class Case7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();

        // 1. 计算数字的位数
        int temp = num;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // 2. 将每一位数字存入数组（正序存储：arr[0] = 最高位）
        int[] arr = new int[count];
        temp = num; // 重置temp
        for (int i = arr.length - 1; temp != 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        // 3. 加密：每位 +5 后取余
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 5) % 10;
        }

        // 4. 反转数组
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int tempSwap = arr[i];
            arr[i] = arr[j];
            arr[j] = tempSwap;
        }

        // 5. 拼接成最终数字
        int encryptedNumber = 0;
        for (int digit : arr) {
            encryptedNumber = encryptedNumber * 10 + digit;
        }

        System.out.println("加密结果: " + encryptedNumber);
    }
}