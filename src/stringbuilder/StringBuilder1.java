package stringbuilder;

/**
 * @author Maven
 * @date 2025/8/14 13:13
 * @description OOTD :文件的描述
 **/
public class StringBuilder1 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder("abc");

        //添加元素
//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);

        //反转
        sb.reverse();

        //获取长度
        int length = sb.length();
        System.out.println(length);

        //打印   打印的是属性值,不是地址值
        System.out.println(sb);

    }
}
