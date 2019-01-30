package animal;

public class AnimalTask {
    public static void main(String[] args) {
        Animal firstAnimal = new Animal();
        firstAnimal.eat();
        firstAnimal.courentStatus();

        Animal seconAnimal = new Animal();
        seconAnimal.play();
        System.out.println(seconAnimal.courentStatus());
    }
}
