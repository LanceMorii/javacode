package opextend.opextenddemo1;

/**
 * @Author: Maven
 * @Date: 2025/8/23 22:44 （日期和时间）
 * @OOTD: 文件内容
 */
public class Test {
    public static void main(String[] args) {
        //创建对象并调用方法

        //创建布偶猫对象
        Ragdoll rd = new Ragdoll();
        rd.eat();
        rd.drink();
        rd.catchMouse();

        System.out.println("--------------------------------");

        //创建哈士奇对象
        Husky hs = new Husky();
        hs.eat();
        hs.drink();
        hs.lookHome();
        hs.breakHome();


    }
}
