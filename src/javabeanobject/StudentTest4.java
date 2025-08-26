package javabeanobject;

/**
 * @Author: Maven
 * @Date: 2025/8/11 17:10
 * @description TODO: 描述该文件的用途
 */
public class StudentTest4 {
    public static void main(String[] args) {
        //创建数组用来存储Student对象
        Student1[] arr = new Student1[3];
        //创建Student对象
        Student1 stu1 = new Student1(1, "张三", 21);
        Student1 stu2 = new Student1(2, "李四", 22);
        Student1 stu3 = new Student1(3, "王五", 23);
        //添加到数组中
        arr[0] = stu1;
        arr[1] = stu2;
        arr[2] = stu3;

        int index = getIndex(arr , 2);

        if (index >= 0) {
            //存在,年龄加1
            int newAge = arr[index].getAge() + 1;
            //把加1后的年龄设置给对象
            arr[index].setAge(newAge);
            //遍历数组
            printArr(arr);
        }else {
            //不存在,直接提示
            System.out.println("当前id不存在不存在");
        }


    }

    public static int getIndex (Student1 [] arr, int id) {
        for (int i = 0; i < arr.length; i++) {
            //依次得到每一个学生对象
            Student1 stu = arr[i];
            //对stu进行一个非空判断
            if (stu != null) {
                int sid = stu.getId();
                if (sid == id) {
                    return  i;
                }
            }
        }
        //当循环结束后,表示不存在
        return -1;
    }

    public static void printArr(Student1[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student1 stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
            }
        }
    }
}
