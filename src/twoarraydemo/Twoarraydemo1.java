package twoarraydemo;

/**
 * @Author: Maven
 * @Date: 2025/8/9 10:14
 * @description TODO: 二维数组的静态初始化
 */
public class Twoarraydemo1 {
    public static void main(String[] args) {
        //二维数组静态初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6, 7, 8}};
        //代码规范,建议每一个一维数组单独写一行,每个一维数组之间都需要用逗号隔开,最后一个一位数组不需要
        int[][] arr3 = new int[][]{
                {1, 2, 3},
                {4, 5, 6, 7, 8}
        };

        //获取元素
        //System.out.println(arr3[0]);//这样写获取到的是地址
        //arr3[0]表示一维数组的第一个元素
        //arr3[0][0]表示二维数组的第一个一维数组的第一个元素
        System.out.println(arr3[1][4]);
        //System.out.println(arr3[2][4]);//报错:ArrayIndexOutOfBoundsException超出数组的长度

        //二维数组的遍历
        for (int i = 0; i < arr3.length; i++) {
            //遍历数组,得到里面的每一个一维数组
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
}
