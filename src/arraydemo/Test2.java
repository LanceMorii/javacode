package arraydemo;

/**
 * @Author: Maven
 * @Date: 2025/8/5 19:40
 * @description TODO: 统计数组的个数,看有几个能被3整除的数
 */
public class Test2 {
    public static void main(String[] args) {
        int count = 0;
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            //i表述数组里面的每一个索引
            //arr[i]表示数组中的每一个元素
            if (arr[i] % 3 == 0) {
//                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("个数是:" + count);
    }
}
