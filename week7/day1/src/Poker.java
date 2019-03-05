

import javax.print.DocFlavor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Poker {
    public static void main(String[] args) {

    }

    public static java.lang.String returnHighestCard(String black, String white) {
        Map<String, Integer> values = Poker.createMap();
        String[] blackArray = black.split(" ");
        String[] whiteArray = white.split(" ");

        Integer blackMaxValue = Arrays.stream(blackArray)
                .map(n->n.charAt(0))
                .mapToInt(n-> values.get(n.toString()))
                .max()
                .getAsInt();

        Integer whiteMaxValue = Arrays.stream(whiteArray)
                .map(n->n.charAt(0))
                .mapToInt(n-> values.get(n.toString()))
                .max()
                .getAsInt();

        if (blackMaxValue > whiteMaxValue){
          List<String> key = values.entrySet().stream()
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());


          return "Black wins! Highest Card " + blackMaxValue + key.get(0);
        } else {
            List<String> key = values.entrySet().stream()
                    .filter(n -> n.getValue() == whiteMaxValue)
                    .map(Map.Entry::getKey)
                    .collect(Collectors.toList());

            return "White wins! Highest Card " + whiteMaxValue + key.get(0) ;
        }
    }

    public static Map<String, Integer> createMap() {
        Map<String, Integer> values = new HashMap<>();
        for (int i = 2; i < 11; i++) {
            values.put(Integer.toString(i), i);
        }
        values.put("J", 11);
        values.put("Q", 12);
        values.put("K", 13);
        values.put("A", 14);

        return values;
    }
}
