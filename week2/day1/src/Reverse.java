public class Reverse {
    public static void main(String[] args) {
        int[] aj = {4,5,6,7,8,9};

        int helpingInt;
        int arayCounter = aj.length-1;

        for ( int i = 0; i < aj.length; i++) {

            if(i < aj.length/2) {
                helpingInt = aj[i];
                aj[i] = aj[arayCounter - i];
                aj[arayCounter - i] = helpingInt;
            }
            System.out.print(aj[i] + " ");






        }
    }
}
