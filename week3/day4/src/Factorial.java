public class Factorial {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(factorial(n));
    }
    public static int factorial (int n){
        int i = 1;
        if (n > 1){
            i = factorial(n - 1);
        }
        i *= n;
        return i;
    }
}
