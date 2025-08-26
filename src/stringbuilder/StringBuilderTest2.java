package stringbuilder;

import java.util.Scanner;

/**
 * @author Maven
 * @date 2025/8/14 17:54
 * @description OOTD :键盘录入一个字符串
 * 要求1:长度小于等于9
 * 要求2:只能是数字,将内容变成罗马数字
 * 下面是阿拉伯数字与罗马数字的对应关系
 * 1.I 2.II 3.III 4.IV 5.V 6.VI 7.VII 8.VIII 9.IX
 * 注意点:罗马数字里没有0
 * 如果键盘录入的数字包含0,可以变成""(长度为0的字符串)
 **/
public class StringBuilderTest2 {
    public static void main(String[] args) {
        /*思路:
         *1.键盘录入一个字符串
         *2.校验字符串,可以单独写一个方法
         */
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("请输入一个字符串:");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("输入的字符串不合法,请重新输入");
                continue;
            }
        }

        //将内容变成罗马数字
        //下面是阿拉伯数字与罗马数字的对应关系
        // * 1.I 2.II 3.III 4.IV 5.V 6.VI 7.VII 8.VIII 9.IX
        //查表法:数字和数据产生一个对应关系
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int number = c - 48;
            String s = changeLuoMa(number);
            System.out.print(s);
            sb.append(s);
        }

    }

    public static boolean checkStr(String str) {
        //要求1:长度小于等于9
        if (str.length() > 9) {
            return false;
        }
        //要求2:只能是数字
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        //只有当字符串里的所有字符全部判断完毕,才能认为是一个合法的字符串
        return true;
    }

    public static String changeLuoMa(int number) {
        //创建一个数组,保存对应的关系
        String[] arr = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return arr[number];
    }

}
