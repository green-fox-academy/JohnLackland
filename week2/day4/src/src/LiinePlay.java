import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LiinePlay {
    public static void mainDraw(Graphics g) {

        int felosztas = 14;
        lineDrawer(felosztas,g);


    }
   public static  void lineDrawer (int felosztas,Graphics g){
        int osztas = WIDTH / felosztas ;

        for (int i = 0; i <= felosztas; i++) {
            g.setColor(new Color(50,205,50));
            g.drawLine(osztas*i ,0,WIDTH,osztas*i);

            g.setColor(new Color(139,0,139));
            g.drawLine(0,osztas*i,osztas*i,HEIGHT);
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