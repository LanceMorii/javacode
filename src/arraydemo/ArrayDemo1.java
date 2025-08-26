package arraydemo;

/**
 * @Author: Maven
 * @Date: 2025/8/5 18:08
 * @description TODO: 描述该文件的用途
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        //静态初始化
        //完整格式: 数据类型[] 数组名 = new 数据类型 {元素1,元素2,元素3,元素4,元素5};
        //简化格式: 数据类型[] 数组名 = {元素1,元素2,元素3,元素4,元素5};
        int[] arr1 = {11, 12, 13, 14};
        int[] arr2 = new int[]{11, 12, 13, 14};

        String[] arr3 = new String[]{"张三", "李四", "王五"};
        String[] arr4 = {"张三", "李四", "王五"};

        double[] arr5 = new double[]{11.1, 12.2, 13.3, 14.4};
        double[] arr6 = {11.1, 12.2, 13.3, 14.4};

        //System.out.println(arr6);
    }
}
