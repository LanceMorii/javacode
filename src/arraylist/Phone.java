package arraylist;

/**
 * @author Maven
 * @date 2025/8/15 10:55
 * @description OOTD :文件的描述
 **/
public class Phone {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Phone() {
    }
}
