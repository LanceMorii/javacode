package opextend.opextenddemo5;

/**
 * @Author: Maven
 * @Date: 2025/8/29 2:07 （日期和时间）
 * @OOTD: 父类
 */
public class Employee {
    private String id;
    private String name;

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

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }


    public Employee() {
    }

    public void work() {
        System.out.println("正在工作");
    }

}
