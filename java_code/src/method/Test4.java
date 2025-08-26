package method;

/**
 * @Author: Maven
 * @Date: 2025/8/8 13:35
 * @description TODO: 定义一个方法,用来比较两个长方形的面积
 */
public class Test4 {
    public static void main(String[] args) {
        //要干嘛(比大小)
        //干这件事情需要什么(两个长,两个宽)

        //调用方法获取面积
       double area = getArea(5.3,5.7);
       double areab = getArea(5.5,5.6);


        if (area > areab) {
            System.out.println("第一个面积大");
        } else if (area < areab) {
            System.out.println("第二个面积大");
        } else {
            System.out.println("两个面积一样大");
        }

    }


    public static double getArea(double len, double width) {
        double area = len * width;
        return  area;
    }

/*    public static void compare(double len1, double width1, double len2, double width2) {
        double area1 = len1 * width1;
        double area2 = len2 * width2;

        if (area1 > area2) {
            System.out.println("第一个面积大");
        } else if (area1 < area2) {
            System.out.println("长方形2面积大");
        } else {
            System.out.println("两个面积一样大");
        }
        */
}

