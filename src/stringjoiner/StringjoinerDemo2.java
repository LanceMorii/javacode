package stringjoiner;

import java.util.StringJoiner;

/**
 * @author Maven
 * @date 2025/8/14 13:39
 * @description OOTD :文件的描述
 **/
public class StringjoinerDemo2 {
    public static void main(String[] args) {
        //创建一个对象
        StringJoiner sj = new StringJoiner(" ","[","]" );

        //添加元素
        sj.add("aaa").add("bbb").add("ccc");
        //length方法
        int len = sj.length();
        System.out.println(len);
        //toString方法
        String str = sj.toString();
        System.out.println(str);
        //打印结果
        System.out.println(sj);

    }
}
