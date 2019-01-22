public class reverse {
    public static void main(String... args){
        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        // Create a method that can reverse a String, which is passed as the parameter
        // Use it on this reversed string to check it!
        // Try to solve this using charAt() first, and optionally anything else after.

        System.out.println(valami(reversed));
    }
    public static String valami (String reversed){
        String killMe = "";

        for (int i = reversed.length()-1; 0 <= i; i--) {
            killMe += reversed.charAt(i);
        }
        return killMe;
    }
}