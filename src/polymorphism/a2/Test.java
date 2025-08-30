package polymorphism.a2;

/**
 * @Author: Maven
 * @Date: 2025/8/30 14:13 （日期和时间）
 * @OOTD: 测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建对象
//        Person p1 = new Person("老王", 30);
//        Dog d = new Dog(5, "白色");
//        p1.keepPet(d, "骨头");
//
//        System.out.println("-----------------------------------");
//
//        Person p2 = new Person("老李", 25);
//        Cat c = new Cat(8, "灰色");
//        p2.keepPet(d, "鱼");

        Person p = new Person("老王", 30);
        Dog d = new Dog(5, "白色");
        Cat c = new Cat(8, "灰色");
        p.keepPet(d, "骨头");
        p.keepPet(c, "鱼");
    }
}
