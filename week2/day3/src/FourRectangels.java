import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangels {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
    int random ;
    int randomStart;
    
        for (int i = 0; i < 4; i++) {
            random = (int) (Math.random() * 250);
            randomStart = (int) (Math.random() * 159);

            graphics.drawRect(randomStart,randomStart,random,random);
        }
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
