import java.util.*;

public class StudentCounter {
    public static void main(String... args) {
        List<Map<String, Object>> listOfMaps = new ArrayList<>();

        // Given this list of hash maps...

        Map<String, Object> row0 = new HashMap<>();
        row0.put("name", "Theodor");
        row0.put("age", 9);
        row0.put("candies", 2);
        listOfMaps.add(row0);

        Map<String, Object> row1 = new HashMap<>();
        row1.put("name", "Paul");
        row1.put("age", 10);
        row1.put("candies", 1);
        listOfMaps.add(row1);

        Map<String, Object> row2 = new HashMap<>();
        row2.put("name", "Mark");
        row2.put("age", 7);
        row2.put("candies", 3);
        listOfMaps.add(row2);

        Map<String, Object> row3 = new HashMap<>();
        row3.put("name", "Peter");
        row3.put("age", 12);
        row3.put("candies", 5);
        listOfMaps.add(row3);

        Map<String, Object> row4 = new HashMap<>();
        row4.put("name", "Olaf");
        row4.put("age", 12);
        row4.put("candies", 7);
        listOfMaps.add(row4);

        Map<String, Object> row5 = new HashMap<>();
        row5.put("name", "George");
        row5.put("age", 3);
        row5.put("candies", 2);
        listOfMaps.add(row5);

        for (int i = 0; i < listOfMaps.size(); i++) {

            if((int)(listOfMaps.get(i).get("candies")) > 4 ){
                System.out.println(listOfMaps.get(i).get("name"));
            }
        }
        int summ = 0;
        for (int i = 0; i < listOfMaps.size(); i++) {
            if ((int)(listOfMaps.get(i).get("candies")) < 5){
                summ += (int)(listOfMaps.get(i).get("age"));
            }
        }
        System.out.println(summ);



        // Display the following things:
        //  - The names of students who have more than 4 candies
        //  - The sum of the age of people who have less than 5 candies
    }
}