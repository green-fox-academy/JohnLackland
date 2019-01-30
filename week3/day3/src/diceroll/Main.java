package diceroll;

import java.sql.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // You have a `DiceSet` class which has a list for 6 dice
        // You can roll all of them with roll()
        // Check the current rolled numbers with getCurrent()
        // You can reroll with reroll()
        // Your task is to roll the dice until all of the dice are 6

        DiceSet diceSet = new DiceSet();

        /*System.out.println(diceSet.getCurrent());
        System.out.println(diceSet.roll());
        System.out.println(diceSet.getCurrent());
        System.out.println(diceSet.getCurrent(5));
        diceSet.reroll();
        System.out.println(diceSet.getCurrent());
        diceSet.reroll(4);
        System.out.println(diceSet.getCurrent());*/

        /*ArrayList<Integer> proba ={1,2,3,4,5}*/
        int fds = 0;
        diceSet.roll();
        int counter = 0;
        for (int i = 0;i < 6; i++) {
            if (diceSet.getCurrent(i) != 6){

                while (diceSet.getCurrent(i) != 6){
                    diceSet.reroll(i);
                    fds++;

                }
            }
        }
        System.out.println(diceSet.getCurrent());
        System.out.println(fds);



        /*while(diceSet.getCurrent().equals(ArrayList<int> new ))*/


    }

}
