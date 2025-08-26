package opextend.opextenddemo2;

/**
 * @Author: Maven
 * @Date: 2025/8/26 11:55 （日期和时间）
 * @OOTD: 中华田园犬
 */
public class ChineseDog extends Dog{
    //重写父类中的eat方法

    @Override
    public void eat() {
        System.out.println("吃剩饭");
    }
}
