package game.gui;

import javax.swing.*;
import java.awt.*;

class SkillPanel extends JPanel {
    public SkillPanel(){
        setLayout(new FlowLayout(FlowLayout.CENTER,100,20));
        setBackground(Color.BLUE);
        add(new SkillButton("peposo"));
        add(new SkillButton("PEPE"));
        add(new SkillButton("PEPE"));
        add(new SkillButton("PEPE"));
    }
}
