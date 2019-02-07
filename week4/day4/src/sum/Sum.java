package sum;

import java.util.ArrayList;
import java.util.List;

public class Sum {

    public int sum(List<Integer> integers){

        int sum = 0;
        for (Integer integer : integers) {
            sum += integer;
        }
        return sum;
    }
}
