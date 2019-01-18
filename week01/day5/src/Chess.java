public class Chess {
    public static void main(String[] args) {


        for (int a = 0; a < 8; a++){

            for (int j = 0; j < 8; j++){

                if(a % 2 == 0 && j % 2 == 0|| a % 2 == 1 && j % 2 == 1)
                    System.out.print("%");

                else if (a % 2 == 0  &&  j % 2 == 1 ||a % 2 == 1 && j % 2 == 0 )
                    System.out.print(" ");










            }
            System.out.println();
        }
    }
}
