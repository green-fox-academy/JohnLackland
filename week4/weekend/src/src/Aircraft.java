public class Aircraft {
    private int currentAmmo;
    private int maxAmmo;
    private int baseDmg;


    public Aircraft(int maxAmmo, int baseDmg) {
        currentAmmo = 0;
        this.maxAmmo = maxAmmo;
        this.baseDmg = baseDmg;

    }

    public int fight() {
        return currentAmmo * baseDmg;
    }

    public int refill(int theAmmo) {
        int addableAmmo = maxAmmo - currentAmmo;
        if (currentAmmo <= maxAmmo && theAmmo >= addableAmmo) {
            currentAmmo += addableAmmo;
            theAmmo -= addableAmmo;
            return theAmmo;
        } else {
            currentAmmo += theAmmo;
            return 0;
        }
    }

    public String getType() {
        return "" + this.getClass().getSimpleName();
    }

    public String getStatus() {
        String status = getType() + ", Ammo: " + this.currentAmmo + ", Base Damage: " + this.baseDmg + ", All Damage: " + fight();
        return status;
    }
}
