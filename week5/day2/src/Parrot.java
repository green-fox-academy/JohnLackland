public class Parrot extends Animal {
    public Parrot() {
        healCost = 4 + (int) (Math.random() * 7);
    }
    public Parrot(String name){
        this.name = name;
    }
}
