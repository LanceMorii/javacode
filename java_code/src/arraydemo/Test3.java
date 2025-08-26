package arraydemo;

/**
 * @Author: Maven
 * @Date: 2025/8/5 18:08
 * @description TODO: 求最值
 */
public class Test3{
    public static void main(String[] args) {
        //已知数组元素{33, 5 , 22 , 44 , 55}
        int[] arr = {33, 5, 22, 44, 55};//静态初始化数组
        int max = arr[0];//用来存放最大值,max的初始化值一定要是数组中的值
        //循环获取数组中的元素,拿每一个数据和max比较,如果当前数据比max大,则将当前数据赋给max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
