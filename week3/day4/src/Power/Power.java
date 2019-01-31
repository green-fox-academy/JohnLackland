package Power;

public class Power {
    public static void main(String[] args) {
        int base = 3;
        int power = 3;

        System.out.println(powerrrrr(base,power));
    }
    public  static  int  powerrrrr (int base, int power){
        int b = base;
        if (power != 2){
              b =   powerrrrr(base, power -1);
            }
            b *= base;
            return b;
    }
}
