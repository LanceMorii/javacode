package StringDemo;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/12 18:14
 * @description TODO: 用户登录,已知正确的用户和密码,请用程序实现模拟用户登录,总共三次机会,登录后给出提示
 */
public class StringDemo4 {
    public static void main(String[] args) {
        //定义两个变量,记录正确的用户名和密码
        String rightUsername = "admin";
        String rightPassword = "123456";

        Scanner sc = new Scanner(System.in);

        //三次机会,for循环知道次数,while循环知道条件
        for (int i = 0; i < 3; i++) {
            //键盘录入
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();

            if (rightUsername.equals(username) && rightPassword.equals(password)) {
                System.out.println("登录成功");
                break;
            }else {
                if (i == 2) {
                    //三次登录失败,给出提示
                    System.out.println("账号" + rightUsername + "被锁定"+"请联系客服小姐姐处理");
                }else {
                    System.out.println("用户名或密码错误,请重新输入,您还剩下"+ (2-i)+"次机会");
                }
            }
        }


    }
}
