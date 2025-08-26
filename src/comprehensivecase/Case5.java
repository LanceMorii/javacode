package comprehensivecase;

/**
 * @Author: Maven
 * @Date: 2025/8/9 00:59
 * @description TODO: 数组元素的复制,把一个数组的元素复制到另一个数组中
 */
public class Case5 {
    public static void main(String[] args) {
        //定义一个老数组
        int[] arr = {1, 2, 3, 4, 5};
        //定义一个新数组
        int[] arr1 = new int[arr.length];
        //遍历老数组，把老数组的元素复制给新数组
        for (int i = 0; i < arr.length; i++) {
            //i表示老数组中的索引，arr[i]表示老数组中的元素
            arr1[i] = arr[i];
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }
}
