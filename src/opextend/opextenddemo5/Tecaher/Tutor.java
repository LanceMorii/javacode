package opextend.opextenddemo5.Tecaher;

import opextend.opextenddemo5.Employee;

/**
 * @Author: Maven
 * @Date: 2025/8/29 2:11 （日期和时间）
 * @OOTD: 文件内容
 */
public class Tutor extends Employee {
    public Tutor(String id, String name) {
        super(id, name);
    }

    public Tutor() {
    }

    @Override
    public void work() {
        System.out.println("助教正在工作");
    }

}
