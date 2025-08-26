package javabeanobject;

import java.util.Random;

/**
 * @Author: Maven
 * @Date: 2025/8/10 17:28
 * @description TODO: 描述该文件的用途
 */
public class Game {
    private String name;
    private int blood;

    public Game(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Game game) {
        //计算造成的伤害
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;

        //修改一下原有血量
        int newBlood = game.getBlood() - hurt;

        //剩余血量如果为负数,就修改为0
        newBlood = Math.max(newBlood, 0);

        //修改一下被攻击人的血量
        game.setBlood(newBlood);

        //this表示方法的调用者
        System.out.println(this.getName() + "攻击了" + game.getName() + "一下" + "造成了" + hurt + "点伤害," + game.getName() + "还剩下" + newBlood +
                "点血");
    }

}
