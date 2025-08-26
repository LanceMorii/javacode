package itheima.a02staticdemo2;

/**
 * @author Maven
 * @date 2025/8/19 13:51
 * @description OOTD :ArrayUtil工具类的测试方法
 **/
public class TestDemo {
    public static void main(String[] args) {
        //测试工具类中的两个方法

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println( ArrayUtil.printArray(arr1));

        double[] arr2 = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.println(ArrayUtil.getAverage(arr2));
    }
}
