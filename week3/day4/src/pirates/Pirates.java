package pirates;

public class Pirates {
    int rumCounter;
    boolean isHeAlive;

    public Pirates(){
        rumCounter = 0;
        isHeAlive =true;
    }
    public void drinkSomeRum (){
        rumCounter++;
    }
    public void howsItGoingMate(){
        if (rumCounter <= 4){
            System.out.println("Pour me anudder!");
            drinkSomeRum();
        }
        else{
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
            rumCounter =0;
        }
    }
    public boolean die(){
      return false;
    }

    public void brawl(){

    }
}
