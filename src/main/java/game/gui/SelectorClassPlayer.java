package game.gui;

import game.entities.CharacterStats;
import game.entities.Player;
import game.entities.Skill;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class SelectorClassPlayer extends JPanel {
    public SelectorClassPlayer() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 200, 250));
        JButton mage =  new JButton("Mage");
        JButton warrior =  new JButton("Warrior");
        JButton rogue =  new JButton("Rogue");

        add(mage);
        add(warrior);
        add(rogue);

    }


    private void createPlayer(String name , List<Skill> skills, CharacterStats stats){
        Window.player = new Player(name, skills, stats);
        Window.showBattle();
    }


}
