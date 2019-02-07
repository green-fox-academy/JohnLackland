package Fibonachi;

public class Fibonacchi {

    public int xThFibonachiNumber(int n){
        
        int firstFibo = 0;
        int a = 1;

        for (int i = 0; i < n; i++) {
            int sumOfTwo = firstFibo + a;

            firstFibo = a;
            a = sumOfTwo;
        }
        return firstFibo;
    }
}
