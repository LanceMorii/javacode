package stringdemo;

/**
 * @author Maven
 * @date 2025/8/14 12:29
 * @description OOTD :文件的描述
 **/
public class StringDemo10 {
    public static void main(String[] args) {
        //定义一个字符串记录身份证号码
        String idCard = "110101199001011234";

        //截取身份证的出生年月日
        String birth = idCard.substring(6, 10);
        String month = idCard.substring(10, 12);
        String day = idCard.substring(12, 14);

        System.out.println("人物信息为:");
        System.out.println("出生年月日：" + birth + "年" + month + "月" + day + "日");

        //获取性别
        char gender = idCard.charAt(16);//字符转换成数字
        //利用ASCII码表转换
        //'0' ---> 48
        //'1' ---> 49

        int num = gender - 48;
        if (num % 2 == 0) {
            System.out.println("性别为：女");
        }else {
            System.out.println("性别为：男");
        }

    }
}
