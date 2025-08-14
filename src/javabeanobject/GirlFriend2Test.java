package javabeanobject;

import object.GirlFriend;

/**
 * @Author: Maven
 * @Date: 2025/8/11 13:10
 * @description TODO: 女朋友测试类
 */
public class GirlFriend2Test {
    public static void main(String[] args) {
        //定义数组存入女朋友对象
        GirlFriend2[] arr = new GirlFriend2[4];
        //创建对象
        GirlFriend2 gf1 = new GirlFriend2("小蛋蛋", 19, "萌妹子", "看电影");
        GirlFriend2 gf2 = new GirlFriend2("小花花", 18, "御姐", "玩游戏");
        GirlFriend2 gf3 = new GirlFriend2("小王王", 17, "萝莉", "看电视");
        GirlFriend2 gf4 = new GirlFriend2("小赵赵", 16, "憨妹子", "看书");

        //存放到数组中
        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //i表示索引
            GirlFriend2 gf = arr[i];
            //累加
            sum = sum + gf.getAge();
        }

        //平均值
        int avg = sum / arr.length;

        //统计年龄比平均值低的有几个,打印他们的信息
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            GirlFriend2 gf = arr[i];
            if (gf.getAge() < avg) {
                count++;
                System.out.println("年龄比平均值低的是:"+gf.getName()+"---"+gf.getAge());
            }

        }

        System.out.println(count);

    }
}
