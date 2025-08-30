package polymorphism.a2;

/**
 * @Author: Maven
 * @Date: 2025/8/30 14:23 （日期和时间）
 * @OOTD: 文件内容
 */
public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }

//    public void keepPet(Dog dog, String something) {
//        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + dog.getColor() + "颜色的" + dog.getAge() + "岁的狗");
//        dog.eat(something);
//    }
//
//    public void keepPet(Cat cat, String something) {
//        System.out.println("年龄为" + age + "岁的" + name + "养了一只" + cat.getColor() + "颜色的" + cat.getAge() + "岁的猫");
//        cat.eat(something);
//    }

    public void keepPet(Animal animal, String something) {
        if (animal instanceof Dog d) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + d.getColor() + "颜色的" + d.getAge() + "岁的狗");
            d.eat(something);
        }else if (animal instanceof Cat c) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + c.getColor() + "颜色的" + c.getAge() + "岁的猫");
            c.eat( something);
        }else {
            System.out.println("请输入正确的动物");
        }
    }

}
