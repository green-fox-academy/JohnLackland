package farm;

public class Animal {
    int unger ;
    int thirst;

    public Animal (){
        unger = 50;
        thirst = 50;
    }
    public  Animal (int hunger, int thirst){
        this.thirst = thirst;
        unger= hunger;
    }


    public void eat (){
        unger -= 1;
    }
    public void drink (){
        thirst -= 1;
    }
    public void  play (){
        unger ++;
        thirst ++;
    }

    public String courentStatus (){
        return "My hunger is " + unger + "point(s), and my thirst pint(s): " + thirst;

    }
}
