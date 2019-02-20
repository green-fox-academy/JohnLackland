import java.util.ArrayList;
import java.util.List;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(returnWinningSeat(41));
    }

    public static List<Integer> fillUpTheList(int howManyPeople) {
        List<Integer> peopleList = new ArrayList<>();
        for (int i = 1; i <= howManyPeople; i++) {
            peopleList.add(i);
        }
        return peopleList;
    }

    public static Integer returnWinningSeat(int howManyPeople) {
        List<Integer> peopleList = new ArrayList<>(fillUpTheList(howManyPeople));
        int isItEven = 0;
        int otherHelper = 0;
        if (peopleList.size() % 2 == 0) {
            isItEven = 1;
            otherHelper = 1;
        }
        for (int i = 0; i < peopleList.size()-1; i++) {
            peopleList.remove(i+1);

        }
        for (int i = 0;!(peopleList.size() == 1); i++) {
            if (i % 2 == 1 && peopleList.size() % 2 == 1 && otherHelper % 2 == 1){
                isItEven = 0;
            } else if (i % 2 == 1 && peopleList.size() % 2 == 1 ){
                isItEven = 1;
            } else if (peopleList.size() % 2 == 0 && otherHelper != isItEven && peopleList.size() > 2){
                isItEven = otherHelper;
            }
            if (i % 2 == 0 && peopleList.size() % 2 == 1 && isItEven % 2 == 1){
                otherHelper = 0;
            } else if (i % 2 == 0 && peopleList.size() % 2 == 1 ){
                otherHelper = 1;
            } else if (peopleList.size() % 2 == 0 && otherHelper != isItEven && peopleList.size() > 2){
                otherHelper = isItEven;
            }
            if (i % 2 == 1 && otherHelper == 1 || i % 2 == 0 && isItEven == 1){
                for (int j = 0; j < peopleList.size()-1; j++) {
                    if (j == 0 && i % 2 == 0) {
                        peopleList.remove(isItEven);
                    } else if (j == 0 && i % 2 == 1) {
                        peopleList.remove(otherHelper);
                    }else {
                        peopleList.remove(j +1);
                    }
                }
            }else {
                for (int j = 0; j < peopleList.size(); j++) {
                    if (j == 0 && i % 2 == 0) {
                        peopleList.remove(isItEven);
                    } else if (j == 0 && i % 2 == 1) {
                        peopleList.remove(otherHelper);
                    }else {
                        peopleList.remove(j);
                    }
                }
            }
        }
        return peopleList.get(0);
    }
}
