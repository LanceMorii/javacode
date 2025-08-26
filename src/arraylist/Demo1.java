package arraylist;

import java.util.ArrayList;

/**
 * @author Maven
 * @date 2025/8/14 21:56
 * @description OOTD :文件的描述
 **/
public class Demo1 {
    public static void main(String[] args) {
        //泛型: 集合中存储的数据是什么类型
        //ArrayList<String> list = new ArrayList<String>();
        //jdk7 以后
        ArrayList<String> list = new ArrayList<>();
        //在展示的时候,打印对象不是地址值,而是集合中存储数据内容
        System.out.println(list);
    }
}
