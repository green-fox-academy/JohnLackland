public class AppendFunc {
    public static void main(String[] args)
    {

        String typo = "Churchill";
        System.out.println(AppendAFunc(typo));

    }
    public static String  AppendAFunc (String typo )
    {
     String addA = typo + "a";

     return addA;
    }

}
