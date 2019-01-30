package domino;

import java.util.Arrays;
import java.util.List;

public class Domino {
    private final int left;
    private final int right;

    public Domino(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public int getLeftSide() {
        return left;
    }

    public int getRightSide() {
        return right;
    }
  /*  public void change (List<Domino> dominoes, int i , int j){
        dominoes.set(i+1,dominoes.set(j,dominoes.get(i+1)));
    }*/

    @Override
    public String toString() {
        return "[" + left + ", " + right + "]";
    }
}