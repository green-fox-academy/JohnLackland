import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Parti {
    public static void main(String[] args) {
        Scanner sc01 = new Scanner(System.in);

        Scanner sc02 = new Scanner(System.in);

        int Girls = sc01.nextInt();
        int Boys = sc02.nextInt();

        if (Girls <= 0)
            System.out.println("Sausage party");
        else if (Girls + Boys >= 20 && Boys % Girls == 0)
            System.out.println("The party is excellent!");
        else if (Girls + Boys <= 20)
            System.out.println("Average party...");
        else if (Girls + Boys >= 20 || Boys % Girls != 0)
            System.out.println("Quite cool party!");












    }









}
