public class Dog extends Animal {
    public Dog() {
        healCost = 1 + (int) (Math.random() * 8);
    }
    public Dog(String name){
        this.name = name;
    }
}
