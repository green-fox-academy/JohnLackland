package counter;

public class Counter {
    int someNumber ;
    int resteHelp ;

    public Counter(){
        someNumber = 0;
        resteHelp = 0;
    }

    public  Counter(int c){
        someNumber = c;
    }

    public  void add(){
        someNumber ++;
        resteHelp ++;
    }
    public  void add(int c){
        someNumber += c;
        resteHelp += c;

    }

    public  void reset(){
        someNumber -= resteHelp;



    }
    public  int get(){
        return someNumber;
    }


}
