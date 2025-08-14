package keyboard_input;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/7/30 16:30
 * @description TODO: 键盘输入
 */
public class ScannerDemo1 {
    public static void main(String[] args) {
        //导包,找到Scanner类
        //创建对象,表示现在准备使用这个类
        Scanner sc = new Scanner(System.in);

        //加一个提示
        System.out.println("请输入一个整数:");

        //接收数据
        //变量i记录了键盘录入的数据
        int i = sc.nextInt();

        //输出数据
        System.out.println(i);
    }
}
