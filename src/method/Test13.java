package method;

/**
 * @Author: Maven
 * @Date: 2025/8/8 15:58
 * @description TODO: 复制数组
 */
public class Test13 {
    public static void main(String[] args) {
        //首先定义原始数组
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        //调用方法
        int[] copyArr = copy(arr, 2, 5);
        //遍历新数组
        for (int i = 0; i < copyArr.length; i++) {
            System.out.print(copyArr[i]+" ");
        }
    }

    public static int[] copy(int[] arr, int from, int to) {
        //动态初始化数组
        int[] newArr = new int[to - from];
        int index = 0;
        //把原始数据中的from到to的数据复制到新数组中
        for (int i = from; i < to; i++) {
            //数组赋值的格式
            newArr[index] = arr[i];
            index ++;
        }
        return newArr;
    }

}
