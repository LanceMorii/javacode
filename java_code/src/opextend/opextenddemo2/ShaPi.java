package opextend.opextenddemo2;

/**
 * @Author: Maven
 * @Date: 2025/8/26 11:53 （日期和时间）
 * @OOTD: 沙皮狗子类
 */
public class ShaPi extends  Dog{
    @Override
    public void eat() {
        super.eat();//吃狗粮
        System.out.println("吃骨头");
    }
}
