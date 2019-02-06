package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {
   ArrayList<Plant> theListOfPlants;

   public Garden(){
       theListOfPlants = new ArrayList<>();
       theListOfPlants.add(new Tree("yellow"));
       theListOfPlants.add(new Tree("orange"));
       theListOfPlants.add(new Flower("blue"));
       theListOfPlants.add(new Flower("purple"));
   }

   public void waterPlants(int amountOfWater){
        double  waterPerPlant = amountOfWater / theListOfPlants.size();

        for (Plant noveny : theListOfPlants) {
           noveny.water(waterPerPlant);
           noveny.getStatus();
       }
   }




}

    

