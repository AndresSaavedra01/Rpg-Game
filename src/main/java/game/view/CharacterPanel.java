package game.view;

import game.model.Character;
import game.model.Enemy;

import javax.swing.*;
import java.awt.*;

public class CharacterPanel extends JPanel {

    private Image image;
    public CharacterPanel(Character character) {
        setPreferredSize(new Dimension(150, 150));
        setBorder(Borders.classicBorder);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        image = character.getAspect();
        add(new AspectPanel(character instanceof Enemy));
        add(new StatsPanel());

    }

    public void changeToSelectionBorder(){
        setBorder(Borders.selectionBorder);
    }

    public void changeToDefaultBorder(){
        setBorder(Borders.classicBorder);
    }


    class AspectPanel extends JPanel{

        private boolean isEnemy;
        public AspectPanel(boolean isEnemy) {
            setPreferredSize(new Dimension(100,100));
            this.isEnemy =  isEnemy;
        }

        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            if(isEnemy) g2D.drawImage(image, 115, 10, -100, 100, this);
            else g2D.drawImage(image, 15, 10, 100, 100, this);
        }
    }

    class StatsPanel extends JPanel{

        public StatsPanel() {
            ProgressBar p = new ProgressBar(20, Color.red);
            p.decrease(5);
            add(p);
        }
    }
}
