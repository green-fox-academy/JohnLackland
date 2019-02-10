import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<Aircraft> aircraftList;
    int ammo;
    int health;

    public Carrier() {
        this.ammo = 200 + (int) (Math.random() * 400);
        this.health = (int) (Math.random() * 8000);
        aircraftList = new ArrayList<>();
    }

    public void add() {
        int randomAircraft = (int) (Math.random() * 2);
        if (randomAircraft == 0) {
            aircraftList.add(new F16());
        } else {
            aircraftList.add(new F35());
        }

    }

    public void fill() {
        try {
            for (Aircraft aircraft : aircraftList) {
                if (ammo == 0) {
                    throw new Exception();
                }
                this.ammo = aircraft.refill(ammo);
            }
        } catch (Exception e) {
            System.out.println("The ship has no ammo left!!!");
        }


    }

    public void fight(Carrier carrier) {

        for (Aircraft aircraft : this.aircraftList) {
            carrier.health -= aircraft.fight();
        }
        for (Aircraft aircraft : carrier.aircraftList) {
            this.health -= aircraft.fight();
        }
    }

    public int totalDMG() {
        int totalDmg = 0;
        for (Aircraft aircraft : aircraftList) {
            totalDmg += aircraft.fight();
        }
        return totalDmg;
    }

    public void getStatus() {
        if (health > 0) {
            System.out.println("HP: " + health + ", Aircraft: " + aircraftList.size() + ", Ammo Storage: " + ammo + ", Total damage:" + totalDMG());
            for (Aircraft aircraft : aircraftList) {
                System.out.println(aircraft.getStatus());
            }
        } else {
            System.out.println("It' s dead Jim :(");
        }
    }
}