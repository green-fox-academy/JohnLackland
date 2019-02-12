public class Main {
    public static void main(String[] args) {
        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.rescue(new Cat());
        animalShelter.rescue(new Dog("Furkesz"));
        animalShelter.rescue(new Parrot());
        System.out.println(animalShelter.toString());
        System.out.println();
        animalShelter.heal();
        System.out.println(animalShelter.toString());
        System.out.println();
        animalShelter.addAdopter("Kond");
        System.out.println(animalShelter.toString());
        System.out.println();
        animalShelter.findNewOwner();
        animalShelter.earnDonation(30);
        System.out.println(animalShelter.toString());
    }
}
