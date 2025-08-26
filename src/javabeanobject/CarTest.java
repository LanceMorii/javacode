package javabeanobject;

import java.util.Scanner;

/**
 * @Author: Maven
 * @Date: 2025/8/10 19:22
 * @description TODO: 描述该文件的用途
 */
public class CarTest {
    public static void main(String[] args) {
        Car [] arr = new Car[3];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建汽车的对象
            Car c = new Car();
            System.out.println("请输入汽车品牌:");
            String brand = sc.next();
            c.setName(brand);
            //录入汽车价格
            System.out.println("请输入汽车价格:");
            int price = sc.nextInt();
            c.setPrice(price);
            //录入汽车颜色
            System.out.println("请输入汽车颜色:");
            String color = sc.next();
            c.setColor(color);

            //将录入的汽车对象，保存到数组中
            arr[i] = c;

        }
        for (int i = 0; i < arr.length; i++) {
            Car c = arr[i];
            System.out.println(c.getName() + " 汽车的价钱是:" + c.getPrice() + "它的颜色是: " + c.getColor());
        }
    }
}
