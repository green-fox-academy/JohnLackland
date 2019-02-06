package Garden;

public class Tree extends Plant{
    String color;

    public Tree(){
        super();
        color = whichColor() ? "orange" : "purple";
    }
    public String setColor(){
        return this.color;
    }

}
