package exercise10;

public class Fox {
    String name;
    String color;
    int age;

    public Fox(String color, String name, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
