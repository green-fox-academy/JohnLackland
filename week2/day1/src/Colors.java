public class Colors {
    public static void main(String[] args) {


        String[][] colors = {{"lime","forest green","olive", "pale green", "spring green"},{"orange red","red","tomato"},{"orchid", "violet",   "pink", "hot pink"}};

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                System.out.print(colors[i][j]+ " | ");
            }
            System.out.println();
        }








        //String[][] color = {"lime","forest green","olive", "pale green", "spring green"};
        //String[] color1 = {"orange red","red","tomato"};
        //String[] color2 = {"orchid", "violet", "pink", "hot pink"};
    }
}
