package javabeanobject;

/**
 * @Author: Maven
 * @Date: 2025/8/11 13:10
 * @description TODO: 女朋友javabean
 */
public class GirlFriend2 {
    private String name;
    private int age;
    private String gender;
    private String hobby;

    public GirlFriend2() {
    }

    public GirlFriend2(String name, int age, String gender, String hobby) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
