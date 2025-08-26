package method;

/**
 * @Author: Maven
 * @Date: 2025/8/8 15:39
 * @description TODO: 求数组的最大值(将最大值返回)
 */
public class Test11 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        int max = getMax(arr);
        System.out.println(max);

    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else {
                max = max;
            }
        }
        return max;
    }
}
