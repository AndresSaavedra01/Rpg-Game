package game.gui;

import game.entities.Aspects;

import javax.swing.*;
import java.awt.*;

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
        add(new CharactersContainer(), BorderLayout.CENTER);
        add(new SkillPanel(), BorderLayout.SOUTH);


        setVisible(true);

    }

    class SkillPanel extends JPanel{
        public SkillPanel(){
            setLayout(new FlowLayout(FlowLayout.CENTER,100,20));
            setBackground(Color.BLUE);
            add(new JButton("otorinolaringologo"));
            add(new JButton("PEPE"));
            add(new JButton("PEPE"));
            add(new JButton("PEPE"));
        }
    }

    class CharactersContainer extends JPanel{
        public CharactersContainer() {
            setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
            setBackground(Color.PINK);
            JPanel p = new JPanel();
            JPanel p1 = new JPanel();
            p.setBackground(Color.GREEN);
            p1.setBackground(Color.GRAY);


            add(new AspectCharacterPanel(Aspects.getImages().get(2)));
            add(new AspectCharacterPanel(Aspects.getImages().get(3)));
        }
    }

    class AspectCharacterPanel extends JPanel{
        Image aspect;
        static boolean pepe = true;
        public AspectCharacterPanel(Image aspect) {
            this.aspect =  aspect;
            if (pepe)setBackground(Color.BLUE);
            if (!pepe)setBackground(Color.GRAY);
            pepe=!pepe;
            scaledImage();

        }

        private void scaledImage(){
            aspect = aspect.getScaledInstance(aspect.getWidth(this)*500,aspect.getWidth(this)*500,Image.SCALE_DEFAULT);
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            g.drawImage(aspect, this.getWidth()/2-(aspect.getWidth(this)/2),this.getHeight()/2-(aspect.getHeight(this)/2), this);
        }
    }

}
