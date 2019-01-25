import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle2 {
    public static void mainDraw(Graphics g) {
        int triangles = 40;

        triangleFunction(triangles,g);

    }public static  void triangleFunction(int triangles ,Graphics g){
        int side = WIDTH/ triangles;
        //half length of a little side

        int half = (WIDTH / triangles) / 2;
        int uperCorner = WIDTH / 3;

        //Height of a little triangle
        int tHight = uperCorner * 2 / triangles;

        for (int i = 0; i < triangles ; i++) {
            g.drawLine(i * half ,HEIGHT - 12 * i, WIDTH- i * half, HEIGHT - tHight * i);
            g.drawLine(i * side, HEIGHT , WIDTH / 2 + i * half, uperCorner + tHight * i);
            g.drawLine(WIDTH - i * side,HEIGHT,WIDTH / 2 - i * half, uperCorner + tHight * i);

    }

    }

    // Don't touch the code below
    static int WIDTH = 720;
    static int HEIGHT = 720;

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