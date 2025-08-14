package stringdemo;

/**
 * @author Maven
 * @date 2025/8/13 20:34
 * @description OOTD :拼接字符串
 * 定义一个方法,.把int数组中的数据按照指定的格式拼接成一个字符串返回调用该方法的方法中,并打印
 **/
public class StringDemo7 {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        String s = arrToString(arr);
        System.out.println(s);

    }

    public static String arrToString(int[] arr) {
        //先进行校验
        if (arr == null) {
            return "数组为null";
        }

        if (arr.length == 0) {
            return "数组为空";
        }

        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            //i 表示索引 arr[i]元素
            //判断
            if (i == arr.length - 1) {
                result = result + arr[i];
            } else {
                result = result + arr[i] + ", ";
            }
        }
        //此时拼接右括号
        result = result + "]";
        return result;
    }

}
