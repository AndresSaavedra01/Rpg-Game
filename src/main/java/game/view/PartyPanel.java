package game.view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PartyPanel extends JPanel {

    List<CharacterPanel> characterPanels =  new ArrayList<>();

    public PartyPanel() {
        setPreferredSize(new Dimension(500, 400));
        setBackground(Color.BLUE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 120));
        add(new CharacterPanel());
        add(new CharacterPanel());
        add(new CharacterPanel());
    }
}
