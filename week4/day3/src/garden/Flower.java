package garden;

public class Flower extends Plant{

    public Flower(String color){
        super(color);
        this.waterNeed =5;
        this.waterUsage = 0.75;
    }
    @Override
    public void water(double waterPerPlant){
        if(waterNeed > waterAmount){
            this.waterAmount += waterPerPlant * waterUsage;
        }
    }
    @Override
    public void getStatus(){

        if (waterNeed < waterAmount){
            System.out.println("The " + color + " flower needs water,because it has " + waterAmount + " water");
        }
        else {
            System.out.println("The " + color + " flower doesn't need water, because it has " + waterAmount + " water");
        }
    }



}
