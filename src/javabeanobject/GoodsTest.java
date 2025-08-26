package javabeanobject;

/**
 * @Author: Maven
 * @Date: 2025/8/10 17:56
 * @description TODO: 描述该文件的用途
 */
public class GoodsTest {
    public static void main(String[] args) {
        //创建一个数组
        Goods[] arr = new Goods[3];

        //创建三个商品对象
        Goods g1 = new Goods("001", "电脑", "8888", 100);
        Goods g2 = new Goods("002", "vivo手机", "1233", 200);
        Goods g3 = new Goods("002", "IPhone手机", "9999", 150);

        //把商品添加到数组中
        arr[0] = g1;
        arr[1] = g2;
        arr[2] = g3;

        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Goods goods = arr[i];
            System.out.println(goods.getId() + " " + goods.getName() + " " + goods.getPrice() + " " + goods.getCount());
        }
    }
}
