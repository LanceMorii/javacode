package method;

/**
 * @Author: Maven
 * @Date: 2025/8/7 11:16
 * @description TODO: 方法的定义格式和调用
 */
public class MethodDemo1 {
    public static void main(String[] args) {
        playGame();
        playGame();
    }

    //定义一个方法
    public static void playGame() {
        System.out.println("开始游戏");
        System.out.println("选人物");
        System.out.println("对线");
        System.out.println("打怪");
        System.out.println("打Boss");
        System.out.println("结束游戏");
    }

}
