import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

public class AnimalShelter {
    List<Animal> animals;
    List<String> adopters;
    int budget;

    public AnimalShelter() {
        animals = new ArrayList<>();
        adopters = new ArrayList<>();
        budget = 50;
    }

    public int rescue(Animal animal) {
        animals.add(animal);
        return animals.size();
    }

    public int heal() {
        for (Animal animal : animals) {
            if (!animal.isHealthy && budget > animal.healCost) {
                animal.heal();
                budget -= animal.healCost;
                return 1;
            }
        }
        return 0;
    }

    public void addAdopter(String name){
        adopters.add(name);
    }

    public void findNewOwner(){
        if(animals.size() > 0 && adopters.size() > 0){
            int theAnimalRemover = (int) (Math.random() * animals.size());

            while (!animals.get(theAnimalRemover).isHealthy){
                theAnimalRemover = (int) (Math.random() * animals.size());
            }
            animals.remove(theAnimalRemover);

            adopters.remove((int) (Math.random() * adopters.size()));
        }
    }

    public int earnDonation(int amount){
       return budget += amount;
    }

    @Override
    public String toString(){
        String status = "Budget: " + this.budget + "€, There are " + animals.size() + " animals(s) and " + adopters.size() + " potentional adopter(s)";
        for (Animal animal: animals) {
            status += "\n " + animal.toString();
        }
        return status;
    }
}
