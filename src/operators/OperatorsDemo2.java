package operators;

/**
 * @Author: Maven
 * @Date: 2025/7/30 17:06
 * @description TODO: 运算符
 */
public class OperatorsDemo2 {
    public static void main(String[] args) {
       //除法
        System.out.println(10/2);//5
        System.out.println(10/3);//3
        System.out.println(10.0/3);//3.3333333333333335

        //取模/取余,实际上也是除法运算,只不过得到的是余数而已
        System.out.println(10%2);//0
        System.out.println(10%3);//1

        //1.应用场景,用来判断a是否是可以被b整除
        //1. a%b==0
        //2.用来判断1一个数是否为偶数
        //2. a%2==0
        //3.斗地主发牌
    }
}
