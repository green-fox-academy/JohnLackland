package saphire2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class SaphireSet {


    List<Saphire> sharpies;

    public SaphireSet(){
        sharpies = new ArrayList<>();
    }
    public int countUsable(Saphire anotherSharpie){
            int usable = 0;
        for (Saphire barmi:
             sharpies) {

            if (anotherSharpie.inkAmount > 0){
                usable++;
            }
        }
        return usable;
    }
    public void remove(Saphire removed){

        for (int i = 0; i < sharpies.size(); i++) {
            if (sharpies.get(i).inkAmount == 0){
                sharpies.remove(i);
            }
        }
    }


}
