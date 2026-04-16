package game.view;

import javax.swing.*;
import java.awt.*;

public class ButtonsPanel extends JPanel {
    JButton attack = new JButton("Attack");
    JButton guard = new JButton("Guard");
    JButton healing = new JButton("Healing");

    public ButtonsPanel() {
        setBackground(Color.DARK_GRAY);
        setPreferredSize(new Dimension(1080, 80));
        add(attack);
        add(guard);
        add(healing);
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
