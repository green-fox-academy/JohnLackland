import java.util.Scanner;

public class kilometerToMile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInputInKilometer = sc.nextInt();

        System.out.println( userInputInKilometer + " km is equal to " + userInputInKilometer * 0.621371192 + "miles." );
    }
}
