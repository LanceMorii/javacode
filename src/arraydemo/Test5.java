package arraydemo;

import java.util.Arrays;

/**
 * @Author: Maven
 * @Date: 2025/8/7 00:58
 * @description TODO: 交换数组中的数据
 */
public class Test5 {
    public static void main(String[] args) {
        /*
         * 需求:定义两个变量,交换两个变量的值
         * */
        int[]  arr = {1,2,3,4,5};
        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        System.out.println(arr[0]);
        System.out.println(arr[4]);
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
