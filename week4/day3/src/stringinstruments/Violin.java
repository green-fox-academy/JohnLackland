package stringinstruments;

public class Violin extends StringedInstrument{

    public Violin(){
        numberOfStrings = 4;
    }
    public Violin(int a){
        numberOfStrings = a;
    }
    @Override
    public void sound(){
        System.out.println("Violin, a " + numberOfStrings +" -stringed instrument that goes Screech");
    }
}
