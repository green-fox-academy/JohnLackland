package animals;

public abstract class Animal {
    String name;
    int age;
    int legs;
    String type;
    String gender;

    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    abstract  public String  breed();
}
