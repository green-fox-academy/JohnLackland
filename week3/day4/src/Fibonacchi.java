public class Fibonacchi {
    public static void main(String[] args) {
    int size = 5;
        System.out.println(fibonachi(size));
    }
    public  static int fibonachi(int size){

        if( size == 0 ){
            return 0;
        }
        if( size == 1){
            return 1;
        }

         size = fibonachi(size-1) + fibonachi(size -2);

        return size;
    }
}
