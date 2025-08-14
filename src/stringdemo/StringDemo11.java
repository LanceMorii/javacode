package stringdemo;

/**
 * @author Maven
 * @date 2025/8/14 12:41
 * @description OOTD :敏感词替换  使用replace方法   作用是:替换
 **/
public class StringDemo11 {
    public static void main(String[] args) {
        //先获取到说的话
        String flag = "我操你妈妈";

        //定义一个数组,里面放敏感词
        String [] arr = {"操", "妈妈"};

        //循环遍历数组,获取到每一个敏感词,一次进行替换
        for (int i = 0; i < arr.length; i++) {
            flag = flag.replace(arr[i], "***");
        }

        //打印结果
        System.out.println( flag);
    }
}
