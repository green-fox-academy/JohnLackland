import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Parti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int Girls = sc.nextInt();
        int Boys = sc.nextInt();

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
