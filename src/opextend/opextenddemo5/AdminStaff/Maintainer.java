package opextend.opextenddemo5.AdminStaff;

import opextend.opextenddemo5.Employee;

/**
 * @Author: Maven
 * @Date: 2025/8/29 2:13 （日期和时间）
 * @OOTD: 文件内容
 */
public class Maintainer extends Employee {
    public Maintainer(String id, String name) {
        super(id, name);
    }

    public Maintainer() {
    }

    @Override
    public void work() {
        System.out.println("维护专业正在工作");
    }

}
