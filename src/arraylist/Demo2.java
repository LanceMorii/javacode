package arraylist;

import java.util.ArrayList;

/**
 * @author Maven
 * @date 2025/8/14 22:11
 * @description OOTD :ArrayList集合成员方法的使用
 **/
public class Demo2 {
    public static void main(String[] args) {
        //创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //添加元素
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //删除元素(根据索引或具体的数据值)
        boolean remove = list.remove("ddd");
        System.out.println(remove);
        System.out.println( list);

        //修改元素(修改索引上的值,原来的数据被覆盖)
        list.set(1,"ddd");
        System.out.println(list);

        //查询元素
        String s1 = list.get(1);
        System.out.println(s1);

        //获取集合的长度

        //遍历
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

    }
}
