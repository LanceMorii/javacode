package itheima.a02staticdemo2;

/**
 * @author Maven
 * @date 2025/8/19 13:47
 * @description OOTD :数组的工具类
 **/
public class ArrayUtil {
    //私有化构造方法
    //目的：防止创建对象
    private ArrayUtil() {
    }


    //静态方法
    public static String printArray(int[] arr) {
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


    //返回平均值
    public static double getAverage(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;
    }

}
