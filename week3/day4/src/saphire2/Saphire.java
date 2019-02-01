package saphire2;

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


}
