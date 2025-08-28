package opextend.opextenddemo5;

import opextend.opextenddemo5.AdminStaff.Buyer;
import opextend.opextenddemo5.AdminStaff.Maintainer;
import opextend.opextenddemo5.Tecaher.Lecturer;
import opextend.opextenddemo5.Tecaher.Tutor;

/**
 * @Author: Maven
 * @Date: 2025/8/29 2:14 （日期和时间）
 * @OOTD: 测试类
 */
public class Test {
    public static void main(String[] args) {
        //创建讲师对象
        Lecturer l = new Lecturer("1001", "张三");
        System.out.println(l.getId() + "--" + l.getName() +  "--");
        l.work();

        //创建助教对象
        Tutor t = new Tutor("1002", "王五");
        System.out.println(t.getId() + "--" + t.getName() +  "--");
        t.work();


        //创建维护专员对象
        Maintainer m = new Maintainer("1003", "赵六");
        System.out.println(m.getId() + "--" + m.getName() +  "--");
        m.work();

        //创建采购专员对象
        Buyer b = new Buyer("1004", "孙七");
        System.out.println(b.getId() + "--" + b.getName() +  "--");
        b.work();


    }
}
