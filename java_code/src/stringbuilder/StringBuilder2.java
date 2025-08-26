package stringbuilder;

/**
 * @author Maven
 * @date 2025/8/14 13:13
 * @description OOTD :文件的描述
 **/
public class StringBuilder2 {
    public static void main(String[] args) {
        //创建对象
        StringBuilder sb = new StringBuilder();

        //添加元素
        sb.append("aaa").append("bbb").append("ccc").append("ddd");


        System.out.println( sb);

        //再把StringBuilder变回 String
        String str = sb.toString();
        System.out.println(str);

    }
}
