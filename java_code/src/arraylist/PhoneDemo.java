package arraylist;

import java.util.ArrayList;

/**
 * @author Maven
 * @date 2025/8/15 10:56
 * @description OOTD :文件的描述
 **/
public class PhoneDemo {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("小米", 1000);
        Phone p2 = new Phone("苹果", 8000);
        Phone p3 = new Phone("锤子", 2999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        ArrayList<Phone> phoneInfolist = getPhoneInfo(list);

        for (int i = 0; i < phoneInfolist.size(); i++) {
            Phone phone = phoneInfolist.get(i);
            System.out.println(phone.getName() + ":" + phone.getPrice());
        }

    }

    public static ArrayList<Phone> getPhoneInfo(ArrayList<Phone> list){
        ArrayList<Phone> resultlist = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            int price = p.getPrice();
            //如果当前手机价格低于3000，则添加到新的集合中
            if (price < 3000) {
                resultlist.add(p);
            }
        }
        return resultlist;
    }

}
