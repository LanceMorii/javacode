package twoarraydemo;

/**
 * @Author: Maven
 * @Date: 2025/8/9 10:14
 * @description TODO: 二维数组的动态初始化
 */
public class Twoarraydemo2 {
    public static void main(String[] args) {
        //二维数组的动态初始化
        //创建一个二维数组,长度为3,每个一维数组的长度为5
        int[][] arr = new int[3][5];
        arr [0][0] = 10;

        //遍历二维数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
