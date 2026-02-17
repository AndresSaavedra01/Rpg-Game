package game.gui;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;

public class Window extends JFrame {


    private final int width = 1080;
    private final int height =  720;


    public Window(){
        super("Rpgero");

        Toolkit pepe = Toolkit.getDefaultToolkit();
        Dimension screenSize =  pepe.getScreenSize();
        Image im = pepe.getImage("src/images/icons8-pepe-the-frog-48.png");


        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setBounds(screenSize.width/2 - width/2,
                screenSize.height/2 - height/2,width, height);
        this.setResizable(false);
        this.setIconImage(im);
        gui();
        this.setVisible(true);

    }

    private void gui(){

        JPanel mainPanel =  new JPanel(new BorderLayout());
        mainPanel.setBackground(Color.darkGray);

        JLabel ppe = new JLabel("PEPOSO");
        JLabel p2 = new JLabel("puta");
        mainPanel.setBorder(new BasicBorders.FieldBorder(Color.BLACK, Color.darkGray, Color.CYAN, Color.GREEN));
        mainPanel.add(ppe);
        mainPanel.add(p2);
        mainPanel.setBackground(SystemColor.window);
        this.add(mainPanel);

    }


    class MainPanel extends JPanel{

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLUE);
            g.drawString("PEPOSO PEPERIDO", 400, 400);
            g.drawArc(100, 100, 300, 600, 0, 90);
            g.drawRect(300, 50, 200, 200);
            g.drawOval(600, 400, 30,50);
            g.fillOval(width/2, 400, 30,50);


            for (int i = -100; i < 100; i++) {
                int j = 0;
                  j = (i-height/2)*(i-height/2);
                  g.fillOval(i, j, 10,10);
             }
        }
    }

}
