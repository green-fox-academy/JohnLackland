

import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangle{
    public static void mainDraw(Graphics graphics) {


drawTriangles(WIDTH,HEIGHT,graphics,6,0);



    }

    public static void drawTriangles(int width, int hight,Graphics graphics,int line,int size) {

        if (line >= 1){
            drawTriangle(width,hight,graphics,size);
            drawTriangles(width , hight , graphics,line-1,width  / 2);


        }


    }
    public static void drawTriangle (int width, int hight,Graphics graphics,int size){
        graphics.drawLine(size /2 , size ,width - size/2,size);
        graphics.drawLine(size,0,width / 2 - size/2, hight - size);
        graphics.drawLine(WIDTH - size,0,WIDTH/2 +size/2,HEIGHT - size);
    }
   /* public static void drawTrianglePAmPAm (int width, int hight,Graphics graphics,int size){
        graphics.drawLine(width - size , size ,width - size/2,size);
        graphics.drawLine(size,0,width / 2 - size/2, hight - size);
        graphics.drawLine(WIDTH - size,0,WIDTH/2 +size/2,HEIGHT - size);
    }*/


    // Don't touch the code below
    static int WIDTH = 400;
    static int HEIGHT = 400;

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
/* graphics.drawLine(size /2 , size ,WIDTH - size/2,size);
            graphics.drawLine(size,0,WIDTH / 2 - size/2, HEIGHT - size);
            graphics.drawLine(WIDTH - size,0,WIDTH/2 +size/2,HEIGHT - size);*/