package stringdemo;

/**
 * @author Maven
 * @date 2025/8/13 20:44
 * @description OOTD :字符串翻转,定义一个方法,实现字符串翻转,并打印
 **/
public class StringDemo8 {
    public static void main(String[] args) {
        String result = reverse("abc");
        System.out.println( result);
    }

    public static String reverse (String  str) {
        //abc
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            //i依次表示字符串中的每一个索引
            char c = str.charAt( i);
            result = result + c;
        }
        return   result;
    }

}
