package domino;

import java.util.ArrayList;
import java.util.List;

public class Dominos {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        for (int i = 0; i < dominoes.size()-1; i++) {

            for (int j = dominoes.size()-1; j >= 0; j--) {

                if (dominoes.get(i).getRightSide() == dominoes.get(j).getLeftSide()){
                    dominoes.set(i+1,dominoes.set(j,dominoes.get(i+1)));
                }
            }
        }
        System.out.println(dominoes);
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }
}
