package pirates;

import java.util.ArrayList;
import java.util.List;

public class Ship {
    Pirates captain = new Pirates(true);

    List<Pirates> pirateList;
    int shipPoint;

    public void fillShip(){
        int howManyPirates = 20 + (int) (Math.random() * 100);
        pirateList.add(captain);

        for (int i = 0; i < howManyPirates; i++) {
            pirateList.add(new Pirates());
        }
        System.out.println("The ship has " + (pirateList.size() -1) + " pirates and the ship's Captain drunk " + captain.rumCounter + " rounds  of rum.");

    }
    public Ship(){

        pirateList = new ArrayList<>();
    }
    public void battle(Ship otherShip) {

        for (int i = 0; this.pirateList.size() > 0 && otherShip.pirateList.size() > 0; i++) {
            //Attacker is the ship who calls the method
            int attackerDeathCounter = 1 + (int) (Math.random() * this.pirateList.size());
            int defenderDeathCounter = 1 + (int) (Math.random() * otherShip.pirateList.size());

            this.shipPoint = this.pirateList.size() - this.captain.rumCounter;
            otherShip.shipPoint = otherShip.pirateList.size() - otherShip.captain.rumCounter;

            if (this.shipPoint > otherShip.shipPoint) {
                for (int j = 0; j < defenderDeathCounter; j++) {
                    otherShip.pirateList.remove(otherShip.pirateList.size()-1);
                }
                System.out.println("The " + (i + 1) + ". round winner is the attacker ship.The defender side lost " + defenderDeathCounter + " pirates.");
            }
            else {
                for (int j = 0; j < attackerDeathCounter; j++) {
                    this.pirateList.remove(this.pirateList.size()-1);
                }
                System.out.println("The " + (i + 1) + ". round winner is the defender ship.The attacker side lost " + attackerDeathCounter + " pirates.");
            }
        }
    }


}
