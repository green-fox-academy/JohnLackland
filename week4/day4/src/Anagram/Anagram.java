package Anagram;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    public static void main(String[] args) {
        Anagram a =new Anagram();
        System.out.println(a.isItAnagramm("ssass","assss"));
    }

    public boolean isItAnagramm(String a , String b){
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();

        if (a.toCharArray().length != b.toCharArray().length){
            return false;
        }
        Arrays.sort(first);
        Arrays.sort(second);


        for (int i = 0; i < a.length() ; i++) {
            System.out.println(first[i]+ "      " + second[i]);

            if ( first[i] != second[i]){
                return false;
            }

        }

        return true;
    }
}
