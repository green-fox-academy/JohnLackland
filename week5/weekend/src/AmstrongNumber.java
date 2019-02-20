public class AmstrongNumber {
    public static void main(String[] args) {
        System.out.println(isItAnAmstrongNumber(16349));
    }

    public static String isItAnAmstrongNumber(int number){
        int theNumber = number;
        int howManyDigits = -1;
        int powerOfDigits = 0;

        while (!(theNumber == 0)){
            theNumber /= 10;
            howManyDigits++;
        }
        theNumber = number;
        while (!(theNumber == 0)) {
            int actualDigit = theNumber % 10;
            int thePower = actualDigit;
            for (int i = 0; i <  howManyDigits ; i++) {
                actualDigit *= thePower;
            }
            powerOfDigits += actualDigit;
            theNumber /= 10;
        }
        if (number == powerOfDigits){
            return number + " is an Amstrong number!";
        } else {
            return number + " is not an amstrong number!";
        }
    }
}
