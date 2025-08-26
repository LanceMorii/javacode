package itheima.a03staticdemo3;

import java.util.ArrayList;

/**
 * @author Maven
 * @date 2025/8/19 13:57
 * @description OOTD :工具类
 **/
public class StudentUtil {
    private StudentUtil(){

    }

    // 静态方法
    public static int getMaxAge(ArrayList<Student> list) {
        //定义一个参照物
        int max = list.get(0).getAge();
        for (int i = 1; i < list.size(); i++) {
            //list.get(i)表示获取集合中索引为i的元素,还需要.getAge获取年龄
            if (max < list.get(i).getAge()) {
                max = list.get(i).getAge();
            }
        }
        return max;
    }
}
