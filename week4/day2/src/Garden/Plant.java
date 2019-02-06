package Garden;

import java.util.ArrayList;

public class Plant extends Garden{
    double waterAmount;
    int howMany;
    ArrayList<Plant> thePlants;
    String color;

    public  Plant(){
        thePlants = new ArrayList<>();
        howMany = (int)(Math.random() * 19) *2;
        waterAmount = 0;
        this.color =
    }

    public boolean whichColor(){
        if ((int)(Math.random()*2) == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void  plantFlowers(){
        for (int i = 0; i < howMany; i++) {
            thePlants.add(new Flower());
        }
    }
    public void plantTrees(){
        for (int i = 0; i < howMany; i++) {
            thePlants.add(new Tree());

        }
    }

}
