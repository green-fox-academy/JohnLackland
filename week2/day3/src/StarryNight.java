import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import  java.util.*;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        Scanner scanner = new Scanner(System.in);


        int starCounter = 1000;

        int  width;
        int hight;
        int color;


        graphics.setColor(Color.DARK_GRAY);
        graphics.fillRect(0,160,320,160);

        for (int i = 0; i < starCounter; i++) {
            width = (int)(Math.random()* 310);
            hight = (int) (Math.random() * 150);
            color = 170  + (int) (Math.random() * 50);

            graphics.setColor(new Color(color,color,color));
            graphics.fillRect(width,hight,3,3);
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
        System.out.println("How many stars do you want to see ?");
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
            this.setBackground(Color.BLACK);
        }
    }
}
