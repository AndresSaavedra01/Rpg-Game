package game.view;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {

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
