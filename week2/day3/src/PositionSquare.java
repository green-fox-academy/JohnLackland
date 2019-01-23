import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.util.*;

public class PositionSquare {

    public static void mainDraw(Graphics graphics){
        // create a square drawing function that takes 3 parameters:
        // the x and y coordinates of the square's top left corner and the graphics
        // and draws a 50x50 square from that point.
        // draw 3 squares with that function.
        // avoid code duplication.
        Scanner sc = new Scanner(System.in);

        int x ;
        int y ;

        for (int i = 0; i < 3; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            Squares(x,y,graphics);
        }

    }
    public static void Squares (int x ,int y, Graphics graphics){
        int side = 50;

        graphics.drawRect(x,y,side,side);
    }

    // Don't touch the code below
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