
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class squerWithRect{
    public static void mainDraw(Graphics graphics) {

        graphics.setColor(Color.ORANGE);
        graphics.fillRect(0,0, WIDTH, HEIGHT);

        graphics.setColor(Color.BLACK);
        drawSquare(WIDTH, WIDTH, WIDTH,graphics);
        //drawLines(WIDTH, graphics);

    }

    public static void drawSquare(int startX, int startY, int size, Graphics graphics) {
       if(size >= 1){
           int help = size / 3;

           graphics.drawRect(startX-size, startY-size, size, size);

           drawSquare(startX- help , startY, help, graphics);
           drawSquare(startX, startY -  help, help,graphics);
           drawSquare(startX - 2* help, startY- help , help,graphics);
           drawSquare(startX -  help,startY - 2* help, help,graphics);



           /*         dr
           drawSquare( size -1, xStart, xStart2, graphics);
           drawSquare( size -1, xStart, xStart2, graphics);
           drawSquare( size -1, xStart, xStart2, graphics);
           drawSquare( size -1, xStart, xStart2, graphics);*/

           //graphics.drawLine(xStart, 0, xStart2,WIDTH );



       }

    }


    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

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