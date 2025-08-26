package arraydemo;

/**
 * @Author: Maven
 * @Date: 2025/8/5 18:08
 * @description TODO: 利用索引获取数组中的元素
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int number = arr[0];
        System.out.println(number);
        System.out.println(arr[1]);


        arr[0] = 100;
        System.out.println(arr[0]);
    }
}
