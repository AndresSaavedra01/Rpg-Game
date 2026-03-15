package game.view;

import game.model.Character;

import javax.swing.*;
import java.awt.*;

public class CharacterPanel extends JPanel {

    private Image image;
    public CharacterPanel(Character character) {
        setPreferredSize(new Dimension(150, 150));
        setBorder(Borders.classicBorder);
        setLayout(new BorderLayout());
        image = character.getAspect();
        add(new AspectPanel());
    }

    public void changeToSelectionBorder(){
        setBorder(Borders.selectionBorder);
    }

    public void changeToDefaultBorder(){
        setBorder(Borders.classicBorder);
    }


    class AspectPanel extends JPanel{
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            image =  image.getScaledInstance(100, 100, Image.SCALE_DEFAULT);
            g.drawImage(image, 10,10, this);
           // g.drawImage(image, 0, image.getHeight(this), 100, 20, this);
        }

    }
}
