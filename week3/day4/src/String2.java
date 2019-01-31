import java.lang.reflect.Array;
import java.util.ArrayList;

public class String2 {
    public static void main(String[] args) {
        String something ="ixihfsodfhuxiuxiuxyxiyxouxyxuxvoxuxouxvxuxvouxvxouxvoxuyvxh";
        int lenght = something.length();

        System.out.println(removeTheX(something,lenght));


    }
    public static String removeTheX (String something, int lenght){

        if(lenght >= 1){
           something = removeTheX(something,lenght -1);
            something = something.replaceFirst("x","");
        }
        return something;
    }
}
