package animal;

public class Animal {
    int unger ;
    int thirst;

    public Animal (){
        unger = 50;
        thirst = 50;
    }
    public void eat (){
        unger -= 1;
    }
    public void drink (){
        thirst -= 1;
    }
    public void  play (){
        unger += 1;
        thirst += 1;
    }

    public void courentStatus (){
        System.out.println("My hunger is " + unger + "point(s), and my thirst pint(s): " + thirst);

    }
}
