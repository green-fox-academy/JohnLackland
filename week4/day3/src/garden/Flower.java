package garden;

public class Flower extends Plant{

    public Flower(String color){
        super(color);
        this.waterNeed =5;
        this.waterUsage = 0.75;
        this.type = "flower";
    }
    @Override
    public void water(double waterPerPlant){
        if(waterNeed > waterAmount){
            this.waterAmount += waterPerPlant * waterUsage;
        }
    }


}
