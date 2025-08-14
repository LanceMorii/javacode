package comprehensivecase;

/**
 * @Author: Maven
 * @Date: 2025/8/9 00:25
 * @description TODO: 找质数,判断101~200之间有多少个素数,并打印所有素数
 */
public class Case3 {
    public static void main(String[] args) {
        int count = 0;
        //外循环,遍历100~200的数字,可以得到100~200的数字
        for (int i = 101; i <= 200; i++) {
            //判断i是否是质数
            boolean flag = true;

            //内循环,判断当前数字i是否是质数
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("当前数字" + i + "是质数");
                count++;
            }
        }
        System.out.println("100~200之间共有" + count + "个质数");
    }
}
