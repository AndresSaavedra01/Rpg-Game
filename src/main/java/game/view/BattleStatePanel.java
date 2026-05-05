package game.view;

import game.model.entities.Character;

import javax.swing.*;
import java.awt.*;

public class BattleStatePanel{

    public static JPanel battleStatePanel =  new JPanel();
    public static JLabel label =  new JLabel();

    public static void initPanel(){
        battleStatePanel.setBackground(Color.gray);
        label.setForeground(Color.white);
        battleStatePanel.setPreferredSize(new Dimension(600, 100));
        label.setText("pepe");
        battleStatePanel.add(label);
    }

    public static void showWhoIsInTurn(Character character){
        label.setText(character.getName() + " is in turn");
    }

    public static void showDesition(String string){
        label.setText(string);
    }
}
