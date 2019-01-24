import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LiinePlay {
    public static void mainDraw(Graphics g) {


        int xCord;
        int yCord;
        int theSpaces = 0;




        for (int i = 0; i < 7; i++) {
            xCord = 30;
            yCord =5;
            drawLineTopRight(xCord,yCord, theSpaces,g);
            theSpaces += 21;

        }
        theSpaces = 0;

        for (int i = 0; i < 7; i++) {
            xCord = 5;
            yCord = 30;
            drawLineBottomLeft(xCord,yCord, theSpaces,g);
            theSpaces += 21;
        }


    }
    public static void drawLineTopRight( int xCord, int yCord, int theSpaces, Graphics g){

        g.setColor(new Color(186,85,211));
        g.drawLine(xCord+theSpaces,yCord, 315,20+theSpaces);

        g.drawLine(320-yCord,320-xCord-theSpaces,300 - theSpaces,5 );

    }
    public  static  void  drawLineBottomLeft(int xCord, int yCord, int theSpaces, Graphics g){
        g.setColor(new Color(50,205,50));
        g.drawLine(xCord,yCord + theSpaces,20 + theSpaces,315);
        g.drawLine(320 - yCord - theSpaces,320-xCord,5,300 - theSpaces);
    }



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