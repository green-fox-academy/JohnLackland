package garden;

public class Tree extends Plant{

    public Tree(String color){
        super(color);
        this.waterNeed = 10;
        this.waterUsage = 0.5;
        this.type = "tree";

    }
    @Override
    public void water(double waterPerPlant){
        if(waterNeed > waterAmount){
            waterAmount += waterPerPlant * waterUsage;
        }
    }
}
