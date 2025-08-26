package stringdemo;

/**
 * @author Maven
 * @date 2025/8/13 21:16
 * @description OOTD :手机号屏蔽,新方法substring 截取
 * 注意:包头不包尾,包左不包右
 * 只有返回值是截取后的结果
 **/
public class StringDemo9 {
    public static void main(String[] args) {
        //获取一个手机号码
        String phonenumber = "13812345678";

        //截取手机号码前三位
        String start = phonenumber.substring(0, 3);
        System.out.println(phonenumber);

        //截取手机号码后4位
        String end = phonenumber.substring(7);

        //拼接
        String result = start + "****" + end;
        System.out.println(result);
    }
}
