package interfacedemo.Demo;

/**
 * @Author: Maven
 * @Date：2025/09/12 01:31
 * @OOTD: 文件内容
 */
public class Test {
    public static void main(String[] args) {
        pingpangsport p = new pingpangsport("刘诗雯", 18);
        System.out.println(p.getName() + "," + p.getAge());
        p.study();
        p.speakEnglish();
    }
}
