import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class QuarterLinePlay {
    public static void mainDraw(Graphics g) {
        int quarter = 2;
        int felosztas = 28;

        lineDrawer(felosztas, quarter, g);




    }
    public static  void lineDrawer (int felosztas,int quarter,Graphics g){

        int lepegeto = WIDTH / felosztas;
        int cut = WIDTH / quarter;

        for (int i = 0; i < felosztas; i++) {

          g.drawLine(lepegeto*i,0,cut,lepegeto+lepegeto*i);





           /* for (int j = 0; j < felosztas; j++) {

                g.drawLine(j * lepegeto, i * cut, i * cut, lepegeto + j * lepegeto);
            }*/

        }
    }



    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}