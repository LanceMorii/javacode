package opextend.opextenddemo4;

/**
 * @Author: Maven
 * @Date: 2025/8/29 01:58 （日期和时间）
 * @OOTD: 文件内容
 */
public class Cook extends Employee{
    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    public Cook() {
    }

    @Override
    public void work() {
        System.out.println("厨师正在炒菜");
    }

}
