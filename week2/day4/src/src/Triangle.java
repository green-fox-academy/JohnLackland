import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle {
    public static void mainDraw(Graphics g) {
        int side = 16;

        triangleFunction(side,g);

    }public static  void triangleFunction(int side ,Graphics g){
        int osztas = WIDTH / side;
        int reduce = osztas / 2;

        for (int i = 0; i < osztas - 3; i++) {
            g.drawLine( reduce * i ,HEIGHT - osztas * i, WIDTH - reduce * i,HEIGHT - osztas * i);
            g.drawLine(WIDTH / 2 + reduce * i,osztas * i , osztas * i, HEIGHT);
            g.drawLine(WIDTH  / 2 - reduce * i , osztas * i, WIDTH - osztas * i, HEIGHT ) ;
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