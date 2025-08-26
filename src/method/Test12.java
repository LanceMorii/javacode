package method;

/**
 * @Author: Maven
 * @Date: 2025/8/8 15:44
 * @description TODO: 判断是否存在
 */
public class Test12 {
    public static void main(String[] args) {
        //定义数组
        int[] arr = {10, 20, 30, 40, 50};
        boolean flag = contains(arr, 123);
        System.out.println(flag);
    }

    public static boolean contains(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

}
