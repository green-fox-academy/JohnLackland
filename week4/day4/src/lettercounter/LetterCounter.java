package lettercounter;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class LetterCounter {
    public static void main(String[] args) {


    }
    public HashMap letterCounterr(String something){
        Map<Character,Integer> map = new HashMap<>();

        ArrayList<Character> inputToArray = new ArrayList<>();

        for (int i = 0; i < something.length(); i++) {
            inputToArray.add(something.charAt(i));
        }

        for (int i = 0; i < inputToArray.size(); i++) {
            char theLetter= inputToArray.get(i);
            int counter = 1;

            for (int j = 0; j < inputToArray.size(); j++) {

                if (theLetter == inputToArray.get(j)){
                    map.put(theLetter,counter);
                    counter++;
                }
            }
        }
        return (HashMap)map;
    }
}
