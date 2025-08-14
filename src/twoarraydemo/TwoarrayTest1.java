package twoarraydemo;

/**
 * @Author: Maven
 * @Date: 2025/8/9 10:14
 * @description TODO: 某商场四个季度的营业额，请使用二维数组保存，并求出全年营业额
 * 第一季度:22,66,44
 * 第二季度:77,33,88
 * 第三季度:99,66,55
 * 第四季度:66,77,99
 */
public class TwoarrayTest1 {
    public static void main(String[] args) {
        //创建二维数组(知道有哪些数据,所以用静态初始化)
        int[][] arr = {
                {22, 66, 44},
                {77, 33, 88},
                {99, 66, 55},
                {66, 77, 99}
        };

        //全年的营业额
        int yearSum = 0;

        //遍历二维数组,得到每一个一维数组并求和
        for (int i = 0; i < arr.length; i++) {
            int [] quarterArr = arr[i];
            int sum = getSum(quarterArr);
            System.out.println("第" + (i + 1) + "季度的营业额为:" + sum);
            yearSum = yearSum + sum;
        }
        System.out.println("全年营业额为:" + yearSum);
    }

    //定义一个方法计算每一个季度的营业额
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

}
