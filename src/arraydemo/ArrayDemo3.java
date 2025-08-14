package arraydemo;

/**
 * @Author: Maven
 * @Date: 2025/8/5 19:29
 * @description TODO: 数组的遍历
 */
public class ArrayDemo3 {
    public static void main(String[] args) {
        //1.定义一个数组
        int[] arr = {1, 2, 3, 4, 5};
        //2.获取数组里的所有元素
        /*System.out.println( arr[0]);
        System.out.println( arr[1]);
        System.out.println( arr[2]);
        System.out.println( arr[3]);
        System.out.println( arr[4]);*/

        //利用循环改进代码
        //开始条件:0
        //结束条件:4
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        //在java中,关于数组的长度属性:length
        //调用方式:数组名.length
        //System.out.println( arr.length);

    }
}
