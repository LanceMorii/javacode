package opextend.opextenddemo2;

/**
 * @Author: Maven
 * @Date: 2025/8/26 11:56 （日期和时间）
 * @OOTD: 文件内容
 */
public class TestDog {
    public static void main(String[] args) {
        HaShiQi haShiQi = new HaShiQi();
        haShiQi.lookHome();
        haShiQi.breakHome();
        haShiQi.eat();
        haShiQi.drink();
        System.out.println("------------------");

        ChineseDog chineseDog = new ChineseDog();
        chineseDog.lookHome();
        chineseDog.eat();
        chineseDog.drink();
        System.out.println("------------------");

    }
}
