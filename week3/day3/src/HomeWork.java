import java.util.HashMap;
import java.util.Map;

public class HomeWork {
    public static void main(String[] args) {

        Map<String, Object> tree0= new HashMap<>();
            tree0.put("type", "Ash");
            tree0.put("age", 20);
            tree0.put("leaf color", "Brown");
            tree0.put("sex", "Female");

        Map<String, Object> tree1= new HashMap<>();
            tree1.put("type", "Cedar");
            tree1.put("age", 2);
            tree1.put("leaf color", "Yellow");
            tree1.put("sex", "male");

        Map<String, Object> tree2= new HashMap<>();
            tree2.put("type", "hawton");
            tree2.put("age", 44);
            tree2.put("leaf color", "red");
            tree2.put("sex", "Female");

        Map<String, Object> tree3= new HashMap<>();
            tree3.put("type", "maple");
            tree3.put("age", 33);
            tree3.put("leaf color", "green");
            tree3.put("sex", "male");

        Map<String, Object> tree4= new HashMap<>();
            tree4.put("type", "oak");
            tree4.put("age", 99);
            tree4.put("leaf color", "lightgreen");
            tree4.put("sex", "Female");

            Tree fa;
            fa = new Tree();

            fa.sex = "Female";
            fa.age = 88;
            fa.type = "maple";
            fa.leafColor = "Brown";

            fa.typeAndColor();
            fa.age();


    }
}
