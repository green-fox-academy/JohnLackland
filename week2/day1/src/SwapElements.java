public class SwapElements {
    public static void main(String[] args) {
        String[] abc = {"first", "second", "third"};

        String helpinString = abc[2];
        abc[2] = abc[0];
        abc[0] = helpinString;

        System.out.println(abc[0]);

    }
}
