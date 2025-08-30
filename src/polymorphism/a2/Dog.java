package polymorphism.a2;

/**
 * @Author: Maven
 * @Date: 2025/8/30 14:12 （日期和时间）
 * @OOTD: 文件内容
 */
public class Dog extends Animal {
    public Dog(int age, String color) {
        super(age, color);
    }

    public Dog() {
    }

    @Override
    public void eat(String something) {
        System.out.println(getAge() + "的" + getColor() + "颜色的狗两只前腿死死的抱住" + something + "猛吃");
    }

    public void lookHome() {
        System.out.println("狗在看家");
    }

}
