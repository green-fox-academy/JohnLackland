package summofdigits;

public class SummOfDigits {

    public int valami (int n){
        int b = 0;

        if(n / 10 != 0){
          b = valami(n/10);
        }
        b +=  n % 10;
        return b;
    }
}
