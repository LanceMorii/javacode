package stringbuilder;

import java.util.Scanner;

/**
 * @author Maven
 * @date 2025/8/14 13:29
 * @description OOTD :拼接字符串
 **/
public class StringBuilder5 {
    public static void main(String[] args) {
        //定义数组
        int [] arr = {1, 2, 3, 4, 5};

        String str = arrToString(arr);

        System.out.println(str);

    }

    public static String arrToString(int [] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
