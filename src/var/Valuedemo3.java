package var;

public class Valuedemo3 {
	//叫做main方法
    public static void main(String[] args){
        int a = 10;
        System.out.println(a);
        System.out.println(a);
        System.out.println(a);

        //变量参与计算
        int b = 30;
        int c = 20;
        System.out.println(b+c);
		
		//修改变量记录的值
        a = 50;
		System.out.println(a);

        //注意事项
        //在一条语句中,可以定义多个变量
        int d = 100,e = 200,f = 300;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //变量在使用之前必须要赋值
        int g;
        g = 500;
        System.out.println(g);
    }
}