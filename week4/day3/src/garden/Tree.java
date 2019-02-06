package garden;

public class Tree extends Plant{

    public Tree(String color){
        super(color);
        this.waterNeed = 10;
        this.waterUsage = 0.5;

    }
    @Override
    public void water(double waterPerPlant){
        if(waterNeed > waterAmount){
            waterAmount += waterPerPlant * waterUsage;
        }
    }
    @Override
    public void getStatus(){

        if (waterNeed < waterAmount){
            System.out.println("The " + color + " tree needs water,because it has " + waterAmount + " water");
        }
        else {
            System.out.println("The " + color + " tree doesn't need water, because it has " + waterAmount + " water");
        }
    }

}

