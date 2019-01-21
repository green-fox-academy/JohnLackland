public class Factorial {
    public static void main(String[] args)
    {
        int a = 7;
        System.out.println(Factorials(a));
    }
    public static int Factorials ( int a )
    {
        int fac = a;

        for (int i = a -1; i > 0 ; i--) {
             fac *= i;

        }
        return fac;
    }
}
