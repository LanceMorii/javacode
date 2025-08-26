package arraydemo;

import java.util.Random;

/**
 * @Author: Maven
 * @Date: 2025/8/7 00:48
 * @description TODO: 遍历数组并求和,生成10个1-100的随机数,并求和
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("所有数据的和为:"+sum);

        //求所有数据的平均值
        int avg = sum / arr.length;
        System.out.println("所有数据的平均值为:"+avg);


        //统计有多少个数据比平均值小
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("比平均值小的个数是:"+count);

        //遍历数组并打印
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}
