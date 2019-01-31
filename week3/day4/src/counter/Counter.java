package counter;

public class Counter {

    public void counterTest(int n){
        System.out.println(n);
        if(n > 0 ){
            counterTest (n-1);
        }


    }

}
