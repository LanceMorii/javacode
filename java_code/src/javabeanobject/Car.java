package javabeanobject;

/**
 * @Author: Maven
 * @Date: 2025/8/10 19:22
 * @description TODO: 描述该文件的用途
 */
public class Car {
    private String name;
    private int price;
    private String color;

    public Car() {
    }

    public Car(String name, int price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
    }

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
