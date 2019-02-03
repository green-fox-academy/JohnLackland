package pirates;

public class BattleApp {
    public static void main(String[] args) {
        Ship firstShip = new Ship();
        Ship secondShip = new Ship();
        firstShip.fillShip();
        secondShip.fillShip();

    firstShip.battle(secondShip);

    }
}
