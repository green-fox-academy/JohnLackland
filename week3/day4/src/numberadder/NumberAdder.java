package numberadder;

public class NumberAdder {

    public void numberAdder(int n){
        if ( n != 0){
            numberAdder(n -1);
            System.out.println(n);
        }

    }
}
