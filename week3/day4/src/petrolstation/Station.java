package petrolstation;

public class Station {
    int gassAmount;

    public Station (){
        gassAmount = 10000;
    }
    public void reFill(Car car){
        for (int i = 0; i < car.gassCapacity; i++) {
            if (car.gassCapacity > car.gassAmount){
                gassAmount -= 1;
                car.gassAmount++;
            }
        }
    }
}
