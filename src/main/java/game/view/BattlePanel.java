package game.view;

import javax.swing.*;
import java.awt.*;

public class BattlePanel extends JPanel {

    PartyPanel rivalsPanel = new PartyPanel();
    PartyPanel partnersPanel = new PartyPanel();

    public BattlePanel() {
        setBackground(Color.CYAN);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 100));
        add(rivalsPanel);
        add(partnersPanel);

    }
}
