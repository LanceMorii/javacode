package polymorphism.a2;

/**
 * @Author: Maven
 * @Date: 2025/8/30 14:12 （日期和时间）
 * @OOTD: 文件内容
 */
public class Cat extends Animal {
    public Cat(int age, String color) {
        super(age, color);
    }

    public Cat() {
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "的" + getColor() + "颜色的猫眯着眼睛侧着头吃" + something);
    }

    public void catchMouse() {
        System.out.println("猫在抓老鼠");
    }

}
