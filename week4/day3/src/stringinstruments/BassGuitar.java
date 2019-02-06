package stringinstruments;

public class BassGuitar extends StringedInstrument{

    public BassGuitar(){
        numberOfStrings = 4;
    }
    public BassGuitar(int a){
        numberOfStrings = a;
    }
    @Override
    public void sound(){
        System.out.println("Bass Guitar, a " + numberOfStrings +" -stringed instrument that goes Duum-duum-duum");
    }
}
