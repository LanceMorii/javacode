package stringbuilder;

/**
 * @author Maven
 * @date 2025/8/14 17:54
 * @description OOTD :文件的描述
 **/
public class StringBuilderTest1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("abc");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
    }
}
