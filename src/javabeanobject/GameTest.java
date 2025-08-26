package javabeanobject;

/**
 * @Author: Maven
 * @Date: 2025/8/10 17:40
 * @description TODO: 描述该文件的用途
 */
public class GameTest {
    public static void main(String[] args) {
        Game r1 = new Game("小怪兽", 100);
        Game r2 = new Game("迪迦", 100);

        //开始格斗,回合制
        while (true) {
            //r1攻击r2
            r1.attack(r2);
            //判断r2是否死亡
            if (r2.getBlood() == 0) {
                System.out.println(r1.getName() + "KO了" + r2.getName());
                break;
            }

            //r2攻击r1
            r2.attack(r1);
            //判断r1是否死亡
            if (r1.getBlood() == 0) {
                System.out.println(r2.getName() + "KO了" + r1.getName());
                break;
            }

        }

    }
}
