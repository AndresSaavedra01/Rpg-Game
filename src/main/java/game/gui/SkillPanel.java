package game.gui;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.util.List;

public class SkillPanel extends JPanel {

    SkillButton [] buttons =  new SkillButton[4];

    public SkillPanel(SkillButton [] buttons) {
        if(buttons.length <=4) this.buttons = buttons;
        this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        this.add(Box.createVerticalStrut(10)); // gap
        this.setBorder(new EmptyBorder(10,10,10,10)); // padding


    }

}
