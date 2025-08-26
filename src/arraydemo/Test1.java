package arraydemo;

/**
 * @Author: Maven
 * @Date: 2025/8/5 19:37
 * @description TODO: 遍历数组求和,数组是{1,2,3,4,5}
 */
public class Test1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        //当循环结束时.sum就是数组的累加和
        System.out.println(sum);
    }
}
