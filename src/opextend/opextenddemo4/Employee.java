package opextend.opextenddemo4;

/**
 * @Author: Maven
 * @Date: 2025/8/29 01:47 （日期和时间）
 * @OOTD: 文件内容
 */
public class Employee {
    //标准javabean的特征
    //1.见名知义
    //2.属性私有
    //3.提供getter和setter方法

    private String id;
    private String name;
    private double salary;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    //工作
    public void work() {
        System.out.println("员工"+name+"正在工作");
    }


    //吃饭
    public void eat() {
        System.out.println("正在吃米饭");
    }


}
