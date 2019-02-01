public class RBunnys2 {
    public static void main(String[] args) {
        int bunny = 17;

        System.out.println(earCounter(bunny));
    }

    public static int earCounter(int bunny) {
        int b = 0;
        if (bunny % 2 == 1 && bunny >= 1) {
           b = earCounter(bunny -1);
           b += 3;
        } else if (bunny >= 1) {
            b = earCounter(bunny-1);
            b += 2;
        }
        return b;

    }
}
