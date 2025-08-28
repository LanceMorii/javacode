package opextend.opextenddemo4;

/**
 * @Author: Maven
 * @Date: 2025/8/29 02:00 （日期和时间）
 * @OOTD: 文件内容
 */
public class Test {
    public static void main(String[] args) {
        //创建对象
        Manager m = new Manager("heima001", "小王", 5000, 5000);
        System.out.println(m.getId() + m.getName() + m.getSalary() + m.getBonus());
        m.work();
        m.eat();


        //创建厨师对象
        Cook c = new Cook();
        c.setId("heima002");
        c.setName("小张");
        c.setSalary(5000);
        System.out.println(c.getId() + c.getName() + c.getSalary());
        c.work();
        c.eat();
    }
}
