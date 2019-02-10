public class Main {
    public static void main(String[] args) {
        Carrier ship1 = new Carrier();
        Carrier ship2 = new Carrier();
        for (int i = 0; i < 4; i++) {
            ship1.add();
            ship2.add();
        }

        while (true) {
            if (ship1.ammo == 0 && ship2.ammo == 0) {
                System.out.println("The ships are out of ammo. They are retreating");
                break;
            } else if (ship1.health > 0 && ship2.health > 0) {
                ship1.fill();
                ship2.fill();
                ship1.fight(ship2);

            } else {
                ship1.getStatus();
                ship2.getStatus();
                break;
            }
        }
    }
}
