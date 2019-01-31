package bunnys;

public class Bunnys {
    public static void main(String[] args) {
        int bunny = 30;
        System.out.println(earCounter(bunny));
    }
    public static int earCounter(int bunny){
        int b = 0;
        if (bunny >= 2){
           b = earCounter(bunny -1);
        }
        b += 2;
     return b;
    }
}
