package Garden;

public class Flower extends Plant{
    boolean isItblue;
    String color;

    public Flower(){
        super();
        color = whichColor() ? "orange" : "purple";
    }

}
