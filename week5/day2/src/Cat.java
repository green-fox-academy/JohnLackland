public class Cat extends Animal {
    public Cat() {
        healCost = (int) (Math.random() * 7);
    }
    public Cat(String name){
        this.name = name;
    }
}
