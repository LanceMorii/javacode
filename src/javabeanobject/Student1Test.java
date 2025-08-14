package javabeanobject;

/**
 * @Author: Maven
 * @Date: 2025/8/11 13:30
 * @description TODO: 描述该文件的用途
 */
public class Student1Test {
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




        //再次添加一个学生对象,并在添加时判断学号的唯一性
        Student1 stu4 = new Student1(4, "赵六", 24);

        //唯一性判断
        //情况1:id存在 --- 不用添加
        //情况2:id不存在 --- 添加

        boolean flag = contains(arr, stu4.getId());
        if (flag) {
            //id存在 --- 不用添加
            System.out.println("学号已存在,请修改id后再添加");
        }
        else {
            //id不存在 --- 添加
            //存入数组
            //情况1:数组已经存满了 --- 只能创建一个新数组,添加数据,将原数组数据复制到新数组中数组长度+1
            //情况2:数组没有存满 --- 直接添加
            int count = getCount(arr);
            if (count == arr.length) {
                //数组已经存满了
                //创建一个新数组.长度 = 原数组长度 + 1
                //遍历原数组,将原数组数据复制到新数组中
                Student1[] newArr = creatNewArr(arr);
                //把新的元素添加到新数组中
                newArr[count] = stu4;
                printArr(newArr);
            }
            else {
                //数组没有存满
                arr[count] = stu4;
                printArr(arr);
            }
        }

        //遍历所有学生的信息

    }

    public static void printArr(Student1[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student1 stu = arr[i];
            if (stu != null) {
                System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getAge());
            }
        }
    }

    //定义一个方法判断数组中已经存在了几个元素
    public static int getCount(Student1[] arr) {
        //定义一个计数器用来统计
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    //创建一个新数组.长度 = 原数组长度 + 1
    //遍历原数组,将原数组数据复制到新数组中
    public static Student1[] creatNewArr(Student1[] arr) {
        Student1[] newArr = new Student1[arr.length + 1];
        //得到元素组中的每一个元素
        for (int i = 0; i < arr.length; i++) {
            //把元素复制到新数组中
            newArr[i] = arr[i];
        }
        //把新数组返回
        return newArr;
    }

    //添加方法,用于判断id的唯一性
    public static boolean contains(Student1[] arr, int id) {
        //遍历原来的数组
        for (int i = 0; i < arr.length; i++) {
            //依次获取到数组的学生对象
            Student1 stu = arr[i];
            if (stu != null) {
                //获取数组中学生对象的id
                int sid = stu.getId();
                //比较
                if (sid == id) {
                    return true;
                    //返回true,表示数组中已经存在该id
                }
            }

        }
        return false;
        //当循环结束后,如果还没有找到到id,则返回false
    }

    //要找到id在数组中的索引
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
}
