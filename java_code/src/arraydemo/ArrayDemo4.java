package arraydemo;

/**
 * @Author: Maven
 * @Date: 2025/8/5 19:29
 * @description TODO: 数组的动态初始化
 */
public class ArrayDemo4 {
    public static void main(String[] args) {
        //数组的动态初始化
        //例子:定义一个数组,用来存放班级50个同学的姓名,等学生报道后再添加
        String[] arr = new String[50];
        //添加学生
        arr[0] = "张三";
        arr[1] = "李四";
        //读取
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//打印默认初始化的值null

        //数组初始化的规律
        //int:默认是0
        //String:默认是null
        //char:默认是'\u0000' 打印出来其实就是一个空格
        //boolean:默认是false
        //引用数据类型:默认是null

        int[] arr1 = new int[50];
        arr1[0] = 1;
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);

    }
}
