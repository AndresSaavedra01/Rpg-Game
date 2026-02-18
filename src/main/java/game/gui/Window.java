package game.gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.io.File;
import java.io.IOException;

public class Window extends JFrame {


    private final int width = 1080;
    private final int height =  720;


    public Window() {
        super("Rpgero");

        Toolkit tools = Toolkit.getDefaultToolkit();
        Image icon = tools.getImage("src/images/icons8-pepe-the-frog-48.png");
        Dimension d = tools.getScreenSize();
        setIconImage(icon);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(d.width / 2 - width / 2, d.height / 2 - height / 2, width, height);
        setLayout(new BorderLayout(10,10));
        add(new MainPanel(), BorderLayout.SOUTH);

        JPanel pepe = new JPanel(new BorderLayout( 10, 10));
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        pepe.setBackground(Color.black);
        p1.setBackground(Color.GRAY);
        p1.add(new JButton("pepe"));
        p2.add(new JButton("peposo"));
        p2.setBackground(Color.GREEN);
        pepe.add(p1, BorderLayout.EAST);
        pepe.add(p2, BorderLayout.WEST);
        add(new MainPanel(), BorderLayout.NORTH);
        add(pepe, BorderLayout.CENTER);
        setVisible(true);

    }

    class MainPanel extends JPanel{
        public MainPanel(){
            setLayout(new FlowLayout(FlowLayout.CENTER,100,20));
            setBackground(Color.BLUE);
            add(new JButton("otorinolaringologo"));
            add(new JButton("PEPE"));
            add(new JButton("PEPE"));
            add(new JButton("PEPE"));
        }
    }
}
