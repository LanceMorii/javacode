package interfacedemo.Demo;

/**
 * @Author: Maven
 * @Date：2025/09/12 01:27
 * @OOTD: 文件内容
 */
public class pingpangsport extends athlete implements English{
    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    public pingpangsport(String name, int age) {
        super(name, age);
    }

    public pingpangsport() {
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学习如何打乒乓球");
    }
}
