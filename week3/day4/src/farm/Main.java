package farm;
import  java.util.*;

public class Main {
    public static void main(String[] args) {
        Animal allat = new Animal();
        Farm farm = new Farm();
        farm.breed();

        farm.add(10,10);

        farm.allatok.add(allat);
        
        farm.kill();



    }
}
