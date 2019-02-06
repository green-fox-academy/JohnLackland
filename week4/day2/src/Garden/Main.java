package Garden;

public class Main {
    public static void main(String[] args) {
        Plant barmi = new Plant();
        barmi.plantFlowers();
        barmi.plantTrees();
        for (int i = 0; i < barmi.thePlants.size(); i++) {
            System.out.println(barmi.thePlants.get(i).color);
        }
    }
}
