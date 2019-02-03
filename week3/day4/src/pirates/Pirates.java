package pirates;

public class Pirates {
    int rumCounter;
    boolean isHeAlive;
    boolean captain;

    public Pirates(){
        rumCounter = 0;
        isHeAlive =true;
    }

    public  Pirates(boolean isCaptain){
       this.captain = true;
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
      return isHeAlive = false;
    }

    public void brawl(int x){
        int canches = (int) (Math.random() * 8);

        if (canches <= 2){

        }
        else  if (canches > 5){

        }
        else {

        }


    }
}
