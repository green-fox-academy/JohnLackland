import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import java.util.*;
public class HoriyontalLines {
    public static void mainDraw(Graphics vonalak) {
        // Create a line drawing function that takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a 50 long horizontal line from that point.
        // Draw 3 lines with that function. Use loop for that.
        Scanner sc = new Scanner(System.in);

        int killMeX;
        int killMeY;

        for (int i = 0; i < 3; i++) {
            killMeX = sc.nextInt();
            killMeY = sc.nextInt();
            Test(killMeX,killMeY,vonalak);
        }


    }
    public static void Test (int killMeX, int killMeY, Graphics vonalak){

        vonalak.drawLine(killMeX, killMeY, killMeX+50, killMeY);
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