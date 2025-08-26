package var;

public class Valuetest01 {
	//主入口
    public static void main(String[] args){
        //一开始车上没有乘客
        int count = 0;
        //第一站:上去一位乘客
        count = count + 1;
//        System.out.println(count);
        //第二站:上去两位乘客,下去一位
        count = count + 2 - 1;
        //第三站:上去两位乘客,下去一位
        count = count + 2 - 1;
        //第四站:下来一位
        count = count - 1;
        //第五站:上去一位
        count = count + 1;
        //到了终点站,车上有几个乘客
        System.out.println(count);
    }
}