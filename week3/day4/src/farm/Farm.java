package farm;
import java.util.*;

public class Farm {


        List<Animal> allatok;
        int slot;
    public Farm(){
        this.allatok = new ArrayList<>();
        slot = 5;
    }
    public void breed(){
        if(slot > 0){
            allatok.add(new Animal());
            slot--;
        }
    }
    public void kill(){
        int leastHungry = 100;
        int killThis = 0;
        for (int i = 0; i < allatok.size(); i++) {

            if(allatok.get(i).unger < leastHungry){
               leastHungry = allatok.get(i).unger;
                killThis = i;
            }
        }
        allatok.remove(killThis);
        slot++;
    }
    public void add( int hunger,int thirst){
        allatok.add(new Animal(hunger,thirst));
    }

}
