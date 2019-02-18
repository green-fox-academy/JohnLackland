public class PalindromBuilder {
    public static void main(String[] args) {
        System.out.println(buildAPalindrome("123"));
    }

    public static String buildAPalindrome(String income){
        String thePlaindrom = income;
        for (int i = income.length() - 1; i >= 0 ; i--) {
            thePlaindrom += income.charAt(i);
        }
        return thePlaindrom;
    }
}
