package saphire;

public class Saphire {
    String color ;
    double width;
    double inkAmount;

    public Saphire(){
        inkAmount = 100;
    }

    public  Saphire(String color, double width){
        this();
        this.color = color;
        this.width = width;
    }

    public void use(){
        inkAmount -= 3.3;
    }

    public void spahireStatus(){
        System.out.println("The saphire is " + width + " and the color is " + color + " with a " + inkAmount + " in amount.");
    }
}
