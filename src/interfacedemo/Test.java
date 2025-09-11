package interfacedemo;

/**
 * @Author: Maven
 * @Date：2025/09/12 00:39
 * @OOTD: 文件内容
 */
public class Test {
    public static void main(String[] args) {
        //创建青蛙对象
        Frog f = new Frog("小青", 1);
        System.out.println(f.getName() + " " + f.getAge());

        f.eat();
        f.swim();

        //创建兔子对象
        Rabbit r = new Rabbit("小兔子", 2);
        System.out.println(r.getName() + " " + r.getAge());
        r.eat();

    }
}
