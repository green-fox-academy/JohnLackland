import java.util.*;

public class SolarSystem{
    public static void main(String... args){
        ArrayList<String> planetList = new ArrayList<String>(Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune"));

        for (int i = 0; i < planetList.size(); i++) {
            System.out.println(planetList.get(i));
        }

        System.out.println(PutSaturn(planetList));
        // Expected output: "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"
    }
    public static ArrayList<String> PutSaturn (ArrayList<String> planetList){
        planetList.add(5, "Saturn");

        return planetList;



    }
}
