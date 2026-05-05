package game.view;

import game.model.entities.Character;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PartyPanel extends JPanel {


    public PartyPanel(List<Character> characters) {
        setPreferredSize(new Dimension(500, 400));
        setBackground(Color.BLUE);
        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 120));
        add(new CharacterPanel(characters.get(0)));
        add(new CharacterPanel(characters.get(1)));
        add(new CharacterPanel(characters.get(2)));


    }

    public void updateCharacterPanel(){
        CharacterPanel c = (CharacterPanel) getComponent(0);
        CharacterPanel c1 = (CharacterPanel) getComponent(1);
        CharacterPanel c2= (CharacterPanel) getComponent(2);
        c.statsPanel.update();
        c1.statsPanel.update();
        c2.statsPanel.update();
    }
}
