package stringjoiner;

import java.util.StringJoiner;

/**
 * @author Maven
 * @date 2025/8/14 13:39
 * @description OOTD :文件的描述
 **/
public class StringjoinerDemo1 {
    public static void main(String[] args) {
        //创建一个对象
        StringJoiner sj = new StringJoiner("---");

        //添加元素
        sj.add("aaa").add("bbb").add("ccc");

        //打印结果
        System.out.println(sj);

    }
}
