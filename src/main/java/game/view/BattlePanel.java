package game.view;



import game.controller.InputController;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

public class BattlePanel extends JPanel {

    public BattlePanel() {
        setLayout(new BorderLayout());
        add( new ButtonsPanel(), BorderLayout.SOUTH);
        add( new DisplayBattle(), BorderLayout.CENTER);
    }



}

class ButtonsPanel extends JPanel{
    private JButton attack =  new JButton("Attack");
    private JButton guard = new JButton("Guard");
    private JButton healing =  new JButton("Heling");

    ButtonsPanel(){
        setPreferredSize(new Dimension(Window.width, 100));
        attack.setFocusable(false);
        guard.setFocusable(false);
        healing.setFocusable(false);
        add(attack);
        add(guard);
        add(healing);
        setBorder(Borders.classicBorder);
    }

    public JButton getAttack() {
        return attack;
    }

    public JButton getGuard() {
        return guard;
    }

    public JButton getHealing() {
        return healing;
    }
}



class CharacterPanel extends JPanel{


    public CharacterPanel() {
        setBackground(Color.magenta);
        setPreferredSize(new Dimension(150, 150));
        setBorder(Borders.classicBorder);
    }

    public void changeToSelectionBorder(){
        setBorder(Borders.selectionBorder);
    }

    public void changeToDefaultBorder(){
        setBorder(Borders.classicBorder);
    }

}


class Borders {
    static Border classicBorder = BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.darkGray),
            BorderFactory.createEmptyBorder(10, 10, 10, 10));

    static Border selectionBorder =  BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.RED, 5, true),
            BorderFactory.createEmptyBorder(10,10,10,10)
    );
}