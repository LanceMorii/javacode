package opextend.opextenddemo4;

/**
 * @Author: Maven
 * @Date: 2025/8/29 01:51 （日期和时间）
 * @OOTD: 文件内容
 */
public class Manager extends Employee{

    private double bonus;

    public Manager(String id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public Manager() {
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void work() {
        System.out.println("管理其他人");
    }

}
