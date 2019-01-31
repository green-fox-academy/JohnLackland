import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class fractal {

    public static void mainDraw(Graphics graphics){
        int valami = 5;


    drawThisShit(graphics,valami);
    }
    public static int drawThisShit(Graphics graphics,int valami){
        int halo = WIDTH /3;
        int prob = HEIGHT / 3;

        if (valami >= 2) {
          prob =  drawThisShit(graphics, valami - 1);
            halo += prob;
            graphics.drawLine(halo , 0, halo , HEIGHT);
            graphics.drawLine(halo * 2, 0, halo * 2, HEIGHT);
        }

        prob/=3;
        return prob;
    }





    // Don't touch the code below
    static int WIDTH = 900;
    static int HEIGHT = 900;

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