package operators;

/**
 * @Author: Maven
 * @Date: 2025/7/30 17:06
 * @description TODO: 运算符
 */
public class OperatorsDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(1+1);

        //-
        System.out.println(1-1);

        //*
        System.out.println(1*1);

        //如果在计算时有小数参与,结果有可能是不精确的
        System.out.println(1.1+1.0);
        System.out.println(1.1-1.0);
        System.out.println(1.1*1.0);
    }
}
