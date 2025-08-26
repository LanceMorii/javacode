package method;

/**
 * @Author: Maven
 * @Date: 2025/8/7 11:34
 * @description TODO: 带返回值方法的定义
 */
public class MethodDemo4 {
    public static void main(String[] args) {
//

        //先计算第一季度
        int sum = getSum(10, 20, 30);
        //再计算第二季度
        int sum2 = getSum(40, 50, 60);
        //再计算第三季度
        int sum3 = getSum(70, 80, 90);
        //再计算第四季度
        int sum4 = getSum(100, 110, 120);
        //全年营业额
        int sumAll = sum + sum2 + sum3 + sum4;
        System.out.println("全年营业额为：" + sumAll+"万元");
    }

    public static int getSum(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        return result;//返回给方法的调用处
    }

}

