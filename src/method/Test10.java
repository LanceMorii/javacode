package method;

/**
 * @Author: Maven
 * @Date: 2025/8/8 15:32
 * @description TODO: 数组的遍历(知识点:方法\重载),要求在同一行
 */
public class Test10 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};

        //调用方法遍历数组
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }

}
