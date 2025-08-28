package opextend.opextenddemo5.AdminStaff;

import opextend.opextenddemo5.Employee;

/**
 * @Author: Maven
 * @Date: 2025/8/29 2:14 （日期和时间）
 * @OOTD: 文件内容
 */
public class Buyer extends Employee {
    public Buyer(String id, String name) {
        super(id, name);
    }

    public Buyer() {
    }

    @Override
    public void work() {
        System.out.println("采购专员正在工作");
    }

}
