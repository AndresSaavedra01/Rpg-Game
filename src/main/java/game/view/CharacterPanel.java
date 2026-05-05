package game.view;

import game.model.entities.Character;
import game.model.entities.Stats;
import game.utils.ManagerImage;

import javax.swing.*;
import java.awt.*;

public class CharacterPanel extends JPanel {

    Character character;
    StatsPanel statsPanel;

    public CharacterPanel(Character character) {
        this.character =  character;
        setPreferredSize(new Dimension(150, 250));
        setBackground(Color.GREEN);
        statsPanel =  new StatsPanel(character.getName(), character.getStats());
        setLayout(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g ;
        if(character.isEnemy()){
            g2.drawImage(ManagerImage.loadImage(), this.getWidth()/2 + 50, this.getWidth()/2 - 50,-100,100, this);
        }else {
            g2.drawImage(ManagerImage.loadImage(), this.getWidth()/2 - 50, this.getWidth()/2 - 50,100,100, this);
        }
        add(statsPanel);
    }
}

class StatsPanel extends JPanel {

    JLabel n =  new JLabel();
    JLabel l = new JLabel();
    Stats stats;

    public StatsPanel(String name, Stats stats) {
        this.stats =  stats;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBounds(30, 150, 100, 50);
        n.setText(name);
        l.setText(stats.toString());
        add(n);
        add(l);
    }

    public void update(){
        l.setText(stats.toString());
    }
}
