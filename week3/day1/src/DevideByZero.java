import java.util.*;
public class DevideByZero {
    public static void main(String[] args) {
        // Create a function that takes a number
        // divides ten with it,
        // and prints the result.
        // It should print "fail" if the parameter is 0

        System.out.println(littleCalculator());
    }
    public  static int littleCalculator(){
        Scanner sc = new Scanner(System.in);
        int nicde = 10;

        try {
            nicde = 10 / sc.nextInt();

       }catch (Exception ex){
           System.out.println("fail");
       }
        return  nicde;
    }
}
