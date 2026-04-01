package game.view;

import game.controller.InputController;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

    private static JButton attack =  new JButton("Attack");
    private static JButton guard = new JButton("Guard");
    private static JButton healing =  new JButton("Heling");

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

    public static JButton getAttack() {
        return attack;
    }

    public static JButton getGuard() {
        return guard;
    }

    public static JButton getHealing() {
        return healing;
    }
}
