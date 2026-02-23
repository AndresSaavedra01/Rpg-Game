package game.gui;

import game.entities.*;
import game.entities.effects.DamageEffect;
import game.entities.effects.Effect;
import game.entities.effects.StateEffect;
import game.types.TypeCost;
import game.types.TypeDamage;
import game.types.TypeState;
import game.types.TypeTarget;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static game.types.TypeCost.COST_SP;

public class SelectorClassPlayer extends JPanel {

    JButton mage =  new JButton("Mage");
    JButton warrior =  new JButton("Warrior");
    JButton rogue =  new JButton("Rogue");
    JTextField playerName =  new JTextField(20);

    public SelectorClassPlayer() {
        setLayout(new FlowLayout(FlowLayout.CENTER, 200, 100));
        JPanel name =  new JPanel();
        name.setLayout(new BoxLayout(name, BoxLayout.Y_AXIS));
        name.add(new JLabel("Name: "));
        name.add(playerName);

        add(new JSeparator());
        add(name);
        add(new JSeparator());
        add(new JSeparator());
        add(mage);
        add(warrior);
        add(rogue);

        addActionListeners();


    }

    private void addActionListeners(){
        mage.addActionListener(e -> {
            createPlayer(playerName.getText(),skillsMage(), statsMage());
        });

        rogue.addActionListener(e -> {
            createPlayer(playerName.getText(),null, null);
        });

        warrior.addActionListener(e -> {
            createPlayer(playerName.getText(),null, null);
        });

    }

    private CharacterStats statsMage() {
        return new CharacterStats(10,3,7,20,30,100,300,3);
    }

    private List<Skill> skillsMage() {
        return null;
    }


    private void createPlayer(String name , List<Skill> skills, CharacterStats stats){
        Window.player = new Player(name, skills, stats);
        Window.showBattle();
    }


}
