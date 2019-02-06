package animals;

public class Bird extends Animal {
    int weight;
    String color;

    public Bird(String name){
        super(name);
    }
    @Override
    public String breed(){
        return "egg";
    }
    public void eat(){

    }
}
