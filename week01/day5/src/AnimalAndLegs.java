import  java.util.Scanner;
public class AnimalAndLegs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int chicken = sc.nextInt();

        int pigs = sc.nextInt();

        System.out.println("All the animals have " +  (chicken * 2 + pigs * 4));


    }
}
