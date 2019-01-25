import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Envelope {
    public static void mainDraw(Graphics graphics) {
        int felosztas = 90;

        envelope(felosztas,graphics);




    }
    public static void envelope(int felosztas, Graphics graphics){
        int osztas = WIDTH / felosztas;
        int halfer = felosztas / 2;
        // wHalf = WIDTH half

        int wHalf = WIDTH / 2;

        // hHalf = HEIGHT half
        int hHalf = HEIGHT / 2;

        for (int lineMoover = 0; lineMoover - 1 < halfer ; lineMoover++){
            graphics.setColor(Color.GREEN);

            // Draws the top part. Differance in the x2 cord
            graphics.drawLine(wHalf, osztas * lineMoover, hHalf + osztas * lineMoover, hHalf );
            graphics.drawLine(wHalf, osztas * lineMoover, hHalf - osztas * lineMoover, hHalf);

            // Draws the bot part. Diference is at x2 part
            graphics.drawLine(wHalf, HEIGHT- osztas * lineMoover, hHalf - osztas * lineMoover, hHalf);
            graphics.drawLine(wHalf, HEIGHT- osztas * lineMoover, hHalf + osztas* lineMoover, hHalf );
        }
            

            

        
    }
    static int WIDTH = 640;
    static int HEIGHT = 640;

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