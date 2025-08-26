package javabeanobject;

/**
 * @Author: Maven
 * @Date: 2025/8/10 17:53
 * @description TODO: 描述该文件的用途
 */
public class Goods {
   private String id;
   private String name;
   private String price;
   private int count;

    public Goods() {
    }

    public Goods(String id, String name, String price, int count) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
