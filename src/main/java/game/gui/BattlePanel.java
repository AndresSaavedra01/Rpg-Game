package game.gui;

import javax.swing.*;
import java.awt.*;

public class BattlePanel extends JPanel {

    public BattlePanel() {
        setLayout(new BorderLayout());
        add(new CharactersContainer(), BorderLayout.CENTER);
        add(new SkillPanel(), BorderLayout.SOUTH);
    }
}
