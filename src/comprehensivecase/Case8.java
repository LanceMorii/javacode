package comprehensivecase;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/9 09:41
 * @description TODO: 数字解密,将Case7的数字进行解密
 */
public class Case8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要解密的整数:");
        int encryptedNum = sc.nextInt();

        // 1. 计算数字的位数
        int temp = encryptedNum;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // 2. 将每一位数字存入数组（正序存储：arr[0] = 最高位）
        int[] arr = new int[count];
        temp = encryptedNum;
        for (int i = arr.length - 1; temp != 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        // 3. 先翻转数组（恢复加密时的翻转）
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int tempSwap = arr[i];
            arr[i] = arr[j];
            arr[j] = tempSwap;
        }

        // 4. 解密：每位 -5，若为负数则 +10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] - 5 + 10) % 10;
        }

        // 5. 拼接成最终数字
        int decryptedNumber = 0;
        for (int digit : arr) {
            decryptedNumber = decryptedNumber * 10 + digit;
        }

        System.out.println("解密结果: " + decryptedNumber);
    }
}
