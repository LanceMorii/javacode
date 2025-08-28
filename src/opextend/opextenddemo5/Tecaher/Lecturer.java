package opextend.opextenddemo5.Tecaher;

import opextend.opextenddemo5.Employee;

/**
 * @Author: Maven
 * @Date: 2025/8/29 2:09 （日期和时间）
 * @OOTD: 文件内容
 */
public class Lecturer extends Employee {
    public Lecturer(String id, String name) {
        super(id, name);
    }

    public Lecturer() {
    }

    @Override
    public void work() {
        System.out.println("讲师正在工作");
    }

}
