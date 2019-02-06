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
       }
   }
    public void getTheList(){
        for (Plant plant:
                theListOfPlants) {

            if (plant.waterAmount < plant.waterNeed)
                System.out.println("The " + plant.color + " " + plant.type + " needs water,because it has " + plant.waterAmount + " water");
            else {
                System.out.println("The " + plant.color + " " + plant.type + " doesn't need water, because it has " + plant.waterAmount + " water");

            }
        }
    }



}

    

