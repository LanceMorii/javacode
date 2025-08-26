package javabeanobject;

/**
 * @Author: Maven
 * @Date: 2025/8/11 12:59
 * @description TODO: 描述该文件的用途
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建一个数组
        Phone[] arr = new Phone[3];
        //创建对象
        Phone p1 = new Phone("小米", 2000, "黑色");
        Phone p2 = new Phone("华为", 3000, "蓝色");
        Phone p3 = new Phone("苹果", 5000, "白色");

        //把手机对象添加到素组中
        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        //获取三部手机的平均价格
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i 是索引 arr[i] 是元素
            Phone phone = arr[i];//这一步是获取元素
            sum = sum + phone.getPrice();
        }

        //求平均值
        //开发中数据能不写死就不写死
        int avg = sum / arr.length;

        double avg2 = (double) sum / arr.length;

        System.out.println("平均价格是：" + avg);
        System.out.println("平均价格是：" + avg2);

    }
}
