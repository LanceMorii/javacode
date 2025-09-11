package interfacedemo.Demo;

/**
 * @Author: Maven
 * @Date：2025/09/12 01:29
 * @OOTD: 文件内容
 */
public class pingpangcoach extends coach implements  English{
    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练正在说英语");
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练正在教如何打乒乓球");
    }

    public pingpangcoach(String name, int age) {
        super(name, age);
    }

    public pingpangcoach() {
    }
}
