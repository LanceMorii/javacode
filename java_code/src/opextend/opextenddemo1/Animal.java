package opextend.opextenddemo1;

public class Animal {
    //权限修饰符如果是private时,子类就无法访问
    //private只能在本类中访问
    //注意事项:子类只能访问父类中非私有的成员
    public void eat() {
        System.out.println("吃东西");
    }

    public void drink() {
        System.out.println("喝东西");
    }

}
