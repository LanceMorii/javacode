package arraylist;

import java.util.ArrayList;

/**
 * @author Maven
 * @date 2025/8/15 10:28
 * @description OOTD :文件的描述
 **/
public class Test1 {
    public static void main(String[] args) {
        //创建ArrayList集合
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //遍历集合
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            } else {
                System.out.print(list.get(i) + " ,");
            }

        }
        System.out.println("]");
    }
}
